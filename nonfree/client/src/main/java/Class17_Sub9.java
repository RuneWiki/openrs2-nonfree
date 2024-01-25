import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class17_Sub9 extends Class17 {

	@OriginalMember(owner = "client!or", name = "y", descriptor = "Z")
	private boolean aBoolean554;

	@OriginalMember(owner = "client!or", name = "E", descriptor = "Z")
	private boolean aBoolean555;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "Z")
	private boolean aBoolean553 = false;

	@OriginalMember(owner = "client!or", name = "G", descriptor = "[F")
	private final float[] aFloatArray66 = new float[4];

	@OriginalMember(owner = "client!or", name = "n", descriptor = "Lclient!qr;")
	private Class283 aClass283_2;

	@OriginalMember(owner = "client!or", name = "k", descriptor = "Lclient!qr;")
	private Class283 aClass283_1;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "Lclient!qr;")
	private Class283 aClass283_3;

	@OriginalMember(owner = "client!or", name = "z", descriptor = "Lclient!qr;")
	private Class283 aClass283_4;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "Z")
	private final boolean aBoolean552;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "Lclient!wfa;")
	private Interface27 anInterface27_6;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!bga;Lclient!in;)V")
	public Class17_Sub9(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) Class157 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean143) {
			this.aClass283_2 = Static84.method2411(arg1.method4545("gl", "uw_ground_unlit"), arg0);
			this.aClass283_1 = Static84.method2411(arg1.method4545("gl", "uw_ground_lit"), arg0);
			this.aClass283_3 = Static84.method2411(arg1.method4545("gl", "uw_model_unlit"), arg0);
			this.aClass283_4 = Static84.method2411(arg1.method4545("gl", "uw_model_lit"), arg0);
			if (this.aClass283_2 != null & this.aClass283_1 != null & this.aClass283_3 != null & this.aClass283_4 != null) {
				this.anInterface27_6 = super.aClass20_Sub2_22.method1473(1, 2, false, new int[] { 0, -1 });
				this.anInterface27_6.method8300(false, false);
				this.aBoolean552 = true;
			} else {
				this.aBoolean552 = false;
			}
		} else {
			this.aBoolean552 = false;
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	@Override
	public void method8065() {
		@Pc(13) int local13 = super.aClass20_Sub2_22.method1575();
		@Pc(18) Class30_Sub2 local18 = super.aClass20_Sub2_22.method1521();
		if (this.aBoolean555) {
			OpenGL.glBindProgramARB(34336, local13 == Integer.MAX_VALUE ? this.aClass283_1.anInt8826 : this.aClass283_4.anInt8826);
		} else {
			OpenGL.glBindProgramARB(34336, ~local13 == Integer.MIN_VALUE ? this.aClass283_2.anInt8826 : this.aClass283_3.anInt8826);
		}
		OpenGL.glEnable(34336);
		this.aBoolean554 = true;
		local18.method4039(0.0F, this.aFloatArray66, -1.0F, 0.0F, (float) local13);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray66[0], this.aFloatArray66[1], this.aFloatArray66[2], this.aFloatArray66[3]);
		this.method8059();
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8067() {
		return this.aBoolean552;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	@Override
	public void method8057() {
		super.aClass20_Sub2_22.method1531(1);
		super.aClass20_Sub2_22.method1484(null);
		super.aClass20_Sub2_22.method1508(Static425.aClass315_3, Static425.aClass315_3);
		super.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
		super.aClass20_Sub2_22.method1483(2, Static165.aClass177_3);
		super.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
		super.aClass20_Sub2_22.method1531(0);
		if (this.aBoolean553) {
			super.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
			super.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
			this.aBoolean553 = false;
		}
		if (this.aBoolean554) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean554 = false;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		if (arg1 != null) {
			if (this.aBoolean553) {
				super.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
				super.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
				this.aBoolean553 = false;
			}
			super.aClass20_Sub2_22.method1484(arg1);
			super.aClass20_Sub2_22.method1557(arg0);
		} else if (!this.aBoolean553) {
			super.aClass20_Sub2_22.method1484(super.aClass20_Sub2_22.anInterface7_3);
			super.aClass20_Sub2_22.method1557(1);
			super.aClass20_Sub2_22.method1483(0, Static154.aClass177_4);
			super.aClass20_Sub2_22.method1519(0, Static154.aClass177_4);
			this.aBoolean553 = true;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	@Override
	public void method8059() {
		if (!this.aBoolean554) {
			return;
		}
		@Pc(12) int local12 = super.aClass20_Sub2_22.XA();
		@Pc(16) int local16 = super.aClass20_Sub2_22.i();
		@Pc(27) float local27 = (float) local12 - (float) (local12 - local16) * 0.125F;
		@Pc(39) float local39 = -((float) (local12 - local16) * 0.25F) + (float) local12;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local39, local27, 1.0F / (float) super.aClass20_Sub2_22.method1467(), (float) super.aClass20_Sub2_22.method1460() / 255.0F);
		super.aClass20_Sub2_22.method1531(1);
		super.aClass20_Sub2_22.method1528(super.aClass20_Sub2_22.method1497());
		super.aClass20_Sub2_22.method1531(0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8062(@OriginalArg(1) boolean arg0) {
		this.aBoolean555 = arg0;
		super.aClass20_Sub2_22.method1531(1);
		super.aClass20_Sub2_22.method1484(this.anInterface27_6);
		super.aClass20_Sub2_22.method1508(Static492.aClass315_4, Static542.aClass315_5);
		super.aClass20_Sub2_22.method1483(0, Static165.aClass177_3);
		super.aClass20_Sub2_22.method1558(true, 2, Static118.aClass177_1, false);
		super.aClass20_Sub2_22.method1519(0, Static154.aClass177_4);
		super.aClass20_Sub2_22.method1531(0);
		this.method8065();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8058(@OriginalArg(0) boolean arg0) {
	}
}
