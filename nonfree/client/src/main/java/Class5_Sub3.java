import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "Z")
	private boolean aBoolean77;

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "Z")
	private boolean aBoolean78;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "[F")
	private final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "Lclient!on;")
	private Class216 aClass216_3;

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "Lclient!on;")
	private Class216 aClass216_5;

	@OriginalMember(owner = "client!ck", name = "A", descriptor = "Lclient!on;")
	private Class216 aClass216_4;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "Lclient!on;")
	private Class216 aClass216_2;

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "Z")
	private final boolean aBoolean76;

	static {
		new Class188("", 76);
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!qba;Lclient!dda;)V")
	public Class5_Sub3(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) Class53 arg1) {
		super(arg0);
		if (arg0.aBoolean552) {
			this.aClass216_3 = Static328.method5236(arg1.method1596("uw_ground_unlit", "gl"), arg0);
			this.aClass216_5 = Static328.method5236(arg1.method1596("uw_ground_lit", "gl"), arg0);
			this.aClass216_4 = Static328.method5236(arg1.method1596("uw_model_unlit", "gl"), arg0);
			this.aClass216_2 = Static328.method5236(arg1.method1596("uw_model_lit", "gl"), arg0);
			this.aBoolean76 = this.aClass216_2 != null & this.aClass216_3 != null & this.aClass216_5 != null & this.aClass216_4 != null;
		} else {
			this.aBoolean76 = false;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7081(@OriginalArg(0) boolean arg0) {
		this.aBoolean78 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
	@Override
	public void method7089() {
		@Pc(8) int local8 = super.aClass39_Sub2_20.method6150();
		@Pc(13) Class181_Sub2 local13 = super.aClass39_Sub2_20.method6151();
		local13.method5408(this.aFloatArray14, -1.0F, (float) local8, 0.0F, 0.0F);
		if (this.aBoolean78) {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass216_5.anInt6455 : this.aClass216_2.anInt6455);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass216_3.anInt6455 : this.aClass216_4.anInt6455);
		}
		OpenGL.glEnable(34336);
		this.aBoolean77 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray14[0], this.aFloatArray14[1], this.aFloatArray14[2], this.aFloatArray14[3]);
		this.method7082();
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
	@Override
	public void method7087() {
		if (this.aBoolean77) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean77 = false;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7092(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7085() {
		return this.aBoolean76;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	@Override
	public void method7082() {
		if (this.aBoolean77) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass39_Sub2_20.CA() - 1280), (float) (super.aClass39_Sub2_20.CA() - 768), 1.0F / (float) super.aClass39_Sub2_20.method6184(), (float) super.aClass39_Sub2_20.method6125() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZILclient!mn;)V")
	@Override
	public void method7083(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass39_Sub2_20.method6179(arg1);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
