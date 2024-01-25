import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vha")
public final class Class74_Sub11 extends Class74 {

	@OriginalMember(owner = "client!vha", name = "x", descriptor = "Z")
	private boolean aBoolean724;

	@OriginalMember(owner = "client!vha", name = "A", descriptor = "Z")
	private boolean aBoolean725;

	@OriginalMember(owner = "client!vha", name = "r", descriptor = "Z")
	private boolean aBoolean723 = false;

	@OriginalMember(owner = "client!vha", name = "y", descriptor = "[F")
	private final float[] aFloatArray76 = new float[4];

	@OriginalMember(owner = "client!vha", name = "o", descriptor = "Lclient!tea;")
	private Class319 aClass319_3;

	@OriginalMember(owner = "client!vha", name = "m", descriptor = "Lclient!tea;")
	private Class319 aClass319_2;

	@OriginalMember(owner = "client!vha", name = "v", descriptor = "Lclient!tea;")
	private Class319 aClass319_4;

	@OriginalMember(owner = "client!vha", name = "D", descriptor = "Lclient!tea;")
	private Class319 aClass319_5;

	@OriginalMember(owner = "client!vha", name = "q", descriptor = "Lclient!wda;")
	private Interface26 anInterface26_6;

	@OriginalMember(owner = "client!vha", name = "B", descriptor = "Z")
	private final boolean aBoolean726;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Lclient!eea;Lclient!eq;)V")
	public Class74_Sub11(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) Class97 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean238) {
			this.aClass319_3 = Static576.method8007(arg1.method2567("uw_ground_unlit", "gl"), arg0);
			this.aClass319_2 = Static576.method8007(arg1.method2567("uw_ground_lit", "gl"), arg0);
			this.aClass319_4 = Static576.method8007(arg1.method2567("uw_model_unlit", "gl"), arg0);
			this.aClass319_5 = Static576.method8007(arg1.method2567("uw_model_lit", "gl"), arg0);
			if (this.aClass319_4 != null & this.aClass319_3 != null & this.aClass319_2 != null & this.aClass319_5 != null) {
				this.anInterface26_6 = super.aClass87_Sub1_22.method5098(false, 1, 2, new int[] { 0, -1 });
				this.anInterface26_6.method8053(false, false);
				this.aBoolean726 = true;
			} else {
				this.aBoolean726 = false;
			}
		} else {
			this.aBoolean726 = false;
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8253(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8250(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean723) {
				super.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
				super.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
				this.aBoolean723 = false;
			}
			super.aClass87_Sub1_22.method5079(arg0);
			super.aClass87_Sub1_22.method5062(arg1);
		} else if (!this.aBoolean723) {
			super.aClass87_Sub1_22.method5079(super.aClass87_Sub1_22.anInterface7_3);
			super.aClass87_Sub1_22.method5062(1);
			super.aClass87_Sub1_22.method5131(0, Static508.aClass315_2);
			super.aClass87_Sub1_22.method5118(0, Static508.aClass315_2);
			this.aBoolean723 = true;
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(III)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "(B)V")
	@Override
	public void method8256() {
		@Pc(8) int local8 = super.aClass87_Sub1_22.method5089();
		@Pc(13) Class6_Sub2 local13 = super.aClass87_Sub1_22.method5147();
		if (this.aBoolean724) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass319_2.anInt8990 : this.aClass319_5.anInt8990);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass319_3.anInt8990 : this.aClass319_4.anInt8990);
		}
		OpenGL.glEnable(34336);
		this.aBoolean725 = true;
		local13.method2703(0.0F, 0.0F, -1.0F, this.aFloatArray76, (float) local8);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray76[0], this.aFloatArray76[1], this.aFloatArray76[2], this.aFloatArray76[3]);
		this.method8242();
	}

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "(I)V")
	@Override
	public void method8249() {
		super.aClass87_Sub1_22.method5116(1);
		super.aClass87_Sub1_22.method5079(null);
		super.aClass87_Sub1_22.method5133(Static40.aClass300_1, Static40.aClass300_1);
		super.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
		super.aClass87_Sub1_22.method5131(2, Static358.aClass315_1);
		super.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
		super.aClass87_Sub1_22.method5116(0);
		if (this.aBoolean723) {
			super.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
			super.aClass87_Sub1_22.method5118(0, Static516.aClass315_3);
			this.aBoolean723 = false;
		}
		if (this.aBoolean725) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean725 = false;
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V")
	@Override
	public void method8242() {
		if (!this.aBoolean725) {
			return;
		}
		@Pc(6) int local6 = super.aClass87_Sub1_22.XA();
		@Pc(10) int local10 = super.aClass87_Sub1_22.i();
		@Pc(21) float local21 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(32) float local32 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local21, 1.0F / (float) super.aClass87_Sub1_22.method5061(), (float) super.aClass87_Sub1_22.method5081() / 255.0F);
		super.aClass87_Sub1_22.method5116(1);
		super.aClass87_Sub1_22.method5075(super.aClass87_Sub1_22.method5119());
		super.aClass87_Sub1_22.method5116(0);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8245() {
		return this.aBoolean726;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8251(@OriginalArg(0) boolean arg0) {
		this.aBoolean724 = arg0;
		super.aClass87_Sub1_22.method5116(1);
		super.aClass87_Sub1_22.method5079(this.anInterface26_6);
		super.aClass87_Sub1_22.method5133(Static148.aClass300_3, Static215.aClass300_4);
		super.aClass87_Sub1_22.method5131(0, Static358.aClass315_1);
		super.aClass87_Sub1_22.method5052(false, true, 2, Static516.aClass315_3);
		super.aClass87_Sub1_22.method5118(0, Static508.aClass315_2);
		super.aClass87_Sub1_22.method5116(0);
		this.method8256();
	}
}
