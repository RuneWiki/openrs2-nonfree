import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mha")
public final class Class16_Sub5 extends Class16 {

	@OriginalMember(owner = "client!mha", name = "o", descriptor = "Z")
	private boolean aBoolean580;

	@OriginalMember(owner = "client!mha", name = "D", descriptor = "Z")
	private boolean aBoolean582;

	@OriginalMember(owner = "client!mha", name = "u", descriptor = "Z")
	private boolean aBoolean581 = false;

	@OriginalMember(owner = "client!mha", name = "y", descriptor = "[F")
	private final float[] aFloatArray55 = new float[4];

	@OriginalMember(owner = "client!mha", name = "G", descriptor = "Z")
	private final boolean aBoolean584;

	@OriginalMember(owner = "client!mha", name = "p", descriptor = "Lclient!hg;")
	private Class129 aClass129_1;

	@OriginalMember(owner = "client!mha", name = "A", descriptor = "Lclient!hg;")
	private Class129 aClass129_3;

	@OriginalMember(owner = "client!mha", name = "B", descriptor = "Lclient!hg;")
	private Class129 aClass129_4;

	@OriginalMember(owner = "client!mha", name = "z", descriptor = "Lclient!hg;")
	private Class129 aClass129_2;

	@OriginalMember(owner = "client!mha", name = "F", descriptor = "Lclient!baa;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lclient!ck;Lclient!kha;)V")
	public Class16_Sub5(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) Class181 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean142) {
			this.aClass129_1 = Static78.method1881(arg1.method5026("gl", "uw_ground_unlit"), arg0);
			this.aClass129_3 = Static78.method1881(arg1.method5026("gl", "uw_ground_lit"), arg0);
			this.aClass129_4 = Static78.method1881(arg1.method5026("gl", "uw_model_unlit"), arg0);
			this.aClass129_2 = Static78.method1881(arg1.method5026("gl", "uw_model_lit"), arg0);
			if (this.aClass129_3 != null & this.aClass129_1 != null & this.aClass129_4 != null & this.aClass129_2 != null) {
				this.anInterface2_3 = super.aClass33_Sub1_23.method2023(new int[] { 0, -1 }, false, 2, 1);
				this.anInterface2_3.method6506(false, false);
				this.aBoolean584 = true;
			} else {
				this.aBoolean584 = false;
			}
		} else {
			this.aBoolean584 = false;
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(B)V")
	@Override
	public void method8604() {
		super.aClass33_Sub1_23.method2010(1);
		super.aClass33_Sub1_23.method1987(null);
		super.aClass33_Sub1_23.method1983(Static25.aClass363_1, Static25.aClass363_1);
		super.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
		super.aClass33_Sub1_23.method2098(2, Static139.aClass371_3);
		super.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
		super.aClass33_Sub1_23.method2010(0);
		if (this.aBoolean581) {
			super.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
			super.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
			this.aBoolean581 = false;
		}
		if (this.aBoolean580) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean580 = false;
		}
	}

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "(I)V")
	@Override
	public void method8606() {
		@Pc(10) int local10 = super.aClass33_Sub1_23.method2082();
		@Pc(15) Class47_Sub3 local15 = super.aClass33_Sub1_23.method1997();
		if (this.aBoolean582) {
			OpenGL.glBindProgramARB(34336, ~local10 == Integer.MIN_VALUE ? this.aClass129_3.anInt4771 : this.aClass129_2.anInt4771);
		} else {
			OpenGL.glBindProgramARB(34336, local10 == Integer.MAX_VALUE ? this.aClass129_1.anInt4771 : this.aClass129_4.anInt4771);
		}
		OpenGL.glEnable(34336);
		this.aBoolean580 = true;
		local15.method7897(-1.0F, this.aFloatArray55, 0.0F, 0.0F, (float) local10);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray55[0], this.aFloatArray55[1], this.aFloatArray55[2], this.aFloatArray55[3]);
		this.method8599();
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8601(@OriginalArg(0) boolean arg0) {
		this.aBoolean582 = arg0;
		super.aClass33_Sub1_23.method2010(1);
		super.aClass33_Sub1_23.method1987(this.anInterface2_3);
		super.aClass33_Sub1_23.method1983(Static64.aClass363_7, Static95.aClass363_3);
		super.aClass33_Sub1_23.method2098(0, Static139.aClass371_3);
		super.aClass33_Sub1_23.method1988(false, 2, true, Static419.aClass371_4);
		super.aClass33_Sub1_23.method1991(Static25.aClass371_1, 0);
		super.aClass33_Sub1_23.method2010(0);
		this.method8606();
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lclient!bia;BI)V")
	@Override
	public void method8611(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean581) {
				super.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
				super.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
				this.aBoolean581 = false;
			}
			super.aClass33_Sub1_23.method1987(arg0);
			super.aClass33_Sub1_23.method2105(arg1);
		} else if (!this.aBoolean581) {
			super.aClass33_Sub1_23.method1987(super.aClass33_Sub1_23.anInterface3_3);
			super.aClass33_Sub1_23.method2105(1);
			super.aClass33_Sub1_23.method2098(0, Static25.aClass371_1);
			super.aClass33_Sub1_23.method1991(Static25.aClass371_1, 0);
			this.aBoolean581 = true;
		}
	}

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8608() {
		return this.aBoolean584;
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)V")
	@Override
	public void method8599() {
		if (!this.aBoolean580) {
			return;
		}
		@Pc(6) int local6 = super.aClass33_Sub1_23.XA();
		@Pc(10) int local10 = super.aClass33_Sub1_23.i();
		@Pc(21) float local21 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(32) float local32 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local21, 1.0F / (float) super.aClass33_Sub1_23.method2103(), (float) super.aClass33_Sub1_23.method1984() / 255.0F);
		super.aClass33_Sub1_23.method2010(1);
		super.aClass33_Sub1_23.method1996(super.aClass33_Sub1_23.method2071());
		super.aClass33_Sub1_23.method2010(0);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8596(@OriginalArg(1) boolean arg0) {
	}
}
