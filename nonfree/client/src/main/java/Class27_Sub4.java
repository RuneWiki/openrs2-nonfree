import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class27_Sub4 extends Class27 {

	@OriginalMember(owner = "client!kaa", name = "n", descriptor = "Z")
	private boolean aBoolean367;

	@OriginalMember(owner = "client!kaa", name = "L", descriptor = "Z")
	private boolean aBoolean370;

	@OriginalMember(owner = "client!kaa", name = "t", descriptor = "Z")
	private boolean aBoolean368 = false;

	@OriginalMember(owner = "client!kaa", name = "r", descriptor = "[F")
	private final float[] aFloatArray32 = new float[4];

	@OriginalMember(owner = "client!kaa", name = "x", descriptor = "Z")
	private final boolean aBoolean369;

	@OriginalMember(owner = "client!kaa", name = "K", descriptor = "Lclient!he;")
	private Class137 aClass137_4;

	@OriginalMember(owner = "client!kaa", name = "G", descriptor = "Lclient!he;")
	private Class137 aClass137_3;

	@OriginalMember(owner = "client!kaa", name = "s", descriptor = "Lclient!he;")
	private Class137 aClass137_1;

	@OriginalMember(owner = "client!kaa", name = "B", descriptor = "Lclient!he;")
	private Class137 aClass137_2;

	@OriginalMember(owner = "client!kaa", name = "m", descriptor = "Lclient!rm;")
	private Interface20 anInterface20_2;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!om;Lclient!la;)V")
	public Class27_Sub4(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) Class207 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean508) {
			this.aClass137_4 = Static353.method5267(arg0, arg1.method4695("uw_ground_unlit", "gl"));
			this.aClass137_3 = Static353.method5267(arg0, arg1.method4695("uw_ground_lit", "gl"));
			this.aClass137_1 = Static353.method5267(arg0, arg1.method4695("uw_model_unlit", "gl"));
			this.aClass137_2 = Static353.method5267(arg0, arg1.method4695("uw_model_lit", "gl"));
			if (this.aClass137_2 != null & this.aClass137_3 != null & this.aClass137_4 != null & this.aClass137_1 != null) {
				this.anInterface20_2 = super.aClass133_Sub1_23.method6181(1, false, 2, new int[] { 0, -1 });
				this.anInterface20_2.method4639(false, false);
				this.aBoolean369 = true;
			} else {
				this.aBoolean369 = false;
			}
		} else {
			this.aBoolean369 = false;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)V")
	@Override
	public void method8895() {
		super.aClass133_Sub1_23.method6271(1);
		super.aClass133_Sub1_23.method6153(null);
		super.aClass133_Sub1_23.method6239(Static524.aClass151_11, Static524.aClass151_11);
		super.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
		super.aClass133_Sub1_23.method6211(Static105.aClass236_1, 2);
		super.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
		super.aClass133_Sub1_23.method6271(0);
		if (this.aBoolean368) {
			super.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
			super.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
			this.aBoolean368 = false;
		}
		if (this.aBoolean370) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean370 = false;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
	@Override
	public void method8893() {
		if (!this.aBoolean370) {
			return;
		}
		@Pc(10) int local10 = super.aClass133_Sub1_23.XA();
		@Pc(14) int local14 = super.aClass133_Sub1_23.i();
		@Pc(25) float local25 = (float) local10 - (float) (local10 - local14) * 0.125F;
		@Pc(36) float local36 = (float) local10 - (float) (local10 - local14) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local36, local25, 1.0F / (float) super.aClass133_Sub1_23.method6251(), (float) super.aClass133_Sub1_23.method6282() / 255.0F);
		super.aClass133_Sub1_23.method6271(1);
		super.aClass133_Sub1_23.method6160(super.aClass133_Sub1_23.method6248());
		super.aClass133_Sub1_23.method6271(0);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8898(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		@Pc(12) int local12 = super.aClass133_Sub1_23.method6235();
		@Pc(17) Class113_Sub1 local17 = super.aClass133_Sub1_23.method6267();
		if (this.aBoolean367) {
			OpenGL.glBindProgramARB(34336, local12 == Integer.MAX_VALUE ? this.aClass137_3.anInt3942 : this.aClass137_2.anInt3942);
		} else {
			OpenGL.glBindProgramARB(34336, ~local12 == Integer.MIN_VALUE ? this.aClass137_4.anInt3942 : this.aClass137_1.anInt3942);
		}
		OpenGL.glEnable(34336);
		this.aBoolean370 = true;
		local17.method2477(0.0F, (float) local12, 0.0F, -1.0F, this.aFloatArray32);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray32[0], this.aFloatArray32[1], this.aFloatArray32[2], this.aFloatArray32[3]);
		this.method8893();
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZLclient!iu;)V")
	@Override
	public void method8901(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1) {
		if (arg1 != null) {
			if (this.aBoolean368) {
				super.aClass133_Sub1_23.method6211(Static626.aClass236_6, 0);
				super.aClass133_Sub1_23.method6159(0, Static626.aClass236_6);
				this.aBoolean368 = false;
			}
			super.aClass133_Sub1_23.method6153(arg1);
			super.aClass133_Sub1_23.method6268(arg0);
		} else if (!this.aBoolean368) {
			super.aClass133_Sub1_23.method6153(super.aClass133_Sub1_23.anInterface8_3);
			super.aClass133_Sub1_23.method6268(1);
			super.aClass133_Sub1_23.method6211(Static229.aClass236_2, 0);
			super.aClass133_Sub1_23.method6159(0, Static229.aClass236_2);
			this.aBoolean368 = true;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8894(@OriginalArg(0) boolean arg0) {
		this.aBoolean367 = arg0;
		super.aClass133_Sub1_23.method6271(1);
		super.aClass133_Sub1_23.method6153(this.anInterface20_2);
		super.aClass133_Sub1_23.method6239(Static132.aClass151_7, Static481.aClass151_8);
		super.aClass133_Sub1_23.method6211(Static105.aClass236_1, 0);
		super.aClass133_Sub1_23.method6222(2, Static626.aClass236_6, false, true);
		super.aClass133_Sub1_23.method6159(0, Static229.aClass236_2);
		super.aClass133_Sub1_23.method6271(0);
		this.method8892();
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8891() {
		return this.aBoolean369;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V")
	@Override
	public void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
