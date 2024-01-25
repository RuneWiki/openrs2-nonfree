import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class22_Sub6 extends Class22 {

	@OriginalMember(owner = "client!om", name = "z", descriptor = "Lclient!ik;")
	private Class164 aClass164_5;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "Z")
	private boolean aBoolean508 = false;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
	private boolean aBoolean507;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "[Lclient!iv;")
	private Class10_Sub3[] aClass10_Sub3Array1;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class22_Sub6(@OriginalArg(0) Class95_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean382) {
			this.aBoolean507 = arg0.anInt5764 < 3;
			@Pc(28) int local28 = this.aBoolean507 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(103) float local103;
						if (local93 == 0) {
							local103 = -local91;
						} else if (local93 == 1) {
							local103 = local91;
						} else if (local93 == 2) {
							local103 = local87;
						} else if (local93 == 3) {
							local103 = -local87;
						} else if (local93 == 4) {
							local103 = local83;
						} else {
							local103 = -local83;
						}
						@Pc(153) int local153;
						@Pc(152) int local152;
						@Pc(150) int local150;
						if (local103 > 0.0F) {
							local153 = (int) (Math.pow((double) local103, 96.0D) * (double) local28);
							local152 = (int) ((double) local28 * Math.pow((double) local103, 36.0D));
							local150 = (int) (Math.pow((double) local103, 12.0D) * (double) local28);
						} else {
							local150 = 0;
							local152 = 0;
							local153 = 0;
						}
						local36[local93][local42] = (byte) local153;
						local40[local93][local42] = (byte) local152;
						local32[local93][local42] = (byte) local150;
					}
					local42++;
				}
			}
			this.aClass10_Sub3Array1 = new Class10_Sub3[3];
			this.aClass10_Sub3Array1[0] = new Class10_Sub3(super.aClass95_Sub3_37, 6406, 64, false, local36, 6406);
			this.aClass10_Sub3Array1[1] = new Class10_Sub3(super.aClass95_Sub3_37, 6406, 64, false, local40, 6406);
			this.aClass10_Sub3Array1[2] = new Class10_Sub3(super.aClass95_Sub3_37, 6406, 64, false, local32, 6406);
			this.method5983();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6982() {
		return true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ru;II)V")
	@Override
	public void method6979(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1) {
		super.aClass95_Sub3_37.method4864(arg0);
		super.aClass95_Sub3_37.method4870(arg1);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	private void method5983() {
		this.aClass164_5 = new Class164(super.aClass95_Sub3_37, 2);
		this.aClass164_5.method3846(0);
		super.aClass95_Sub3_37.method4900(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean507) {
			super.aClass95_Sub3_37.method4899(260, 7681);
			super.aClass95_Sub3_37.method4869(5890, 0, 770);
			super.aClass95_Sub3_37.method4850(0, 34167);
		} else {
			super.aClass95_Sub3_37.method4899(7681, 8448);
			super.aClass95_Sub3_37.method4869(34168, 0, 768);
			super.aClass95_Sub3_37.method4900(2);
			super.aClass95_Sub3_37.method4899(260, 7681);
			super.aClass95_Sub3_37.method4869(34168, 0, 768);
			super.aClass95_Sub3_37.method4869(34168, 1, 770);
			super.aClass95_Sub3_37.method4850(0, 34167);
		}
		super.aClass95_Sub3_37.method4900(0);
		this.aClass164_5.method3848();
		this.aClass164_5.method3846(1);
		super.aClass95_Sub3_37.method4900(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean507) {
			super.aClass95_Sub3_37.method4899(8448, 8448);
			super.aClass95_Sub3_37.method4869(5890, 0, 768);
			super.aClass95_Sub3_37.method4850(0, 5890);
		} else {
			super.aClass95_Sub3_37.method4899(8448, 8448);
			super.aClass95_Sub3_37.method4869(5890, 0, 768);
			super.aClass95_Sub3_37.method4900(2);
			super.aClass95_Sub3_37.method4899(8448, 8448);
			super.aClass95_Sub3_37.method4869(5890, 0, 768);
			super.aClass95_Sub3_37.method4869(34168, 1, 768);
			super.aClass95_Sub3_37.method4850(0, 5890);
		}
		super.aClass95_Sub3_37.method4900(0);
		this.aClass164_5.method3848();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		if (this.aBoolean508) {
			if (!this.aBoolean507) {
				super.aClass95_Sub3_37.method4900(2);
				super.aClass95_Sub3_37.method4864((Class10) null);
			}
			super.aClass95_Sub3_37.method4900(1);
			super.aClass95_Sub3_37.method4864((Class10) null);
			super.aClass95_Sub3_37.method4900(0);
			this.aClass164_5.method3843('\u0001');
			this.aBoolean508 = false;
		} else {
			super.aClass95_Sub3_37.method4850(0, 5890);
		}
		super.aClass95_Sub3_37.method4899(8448, 8448);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6978(@OriginalArg(0) boolean arg0) {
		if (this.aClass164_5 == null || !arg0) {
			super.aClass95_Sub3_37.method4850(0, 34168);
			return;
		}
		if (!this.aBoolean507) {
			super.aClass95_Sub3_37.method4900(2);
			super.aClass95_Sub3_37.method4864(super.aClass95_Sub3_37.aClass10_Sub2_2);
			super.aClass95_Sub3_37.method4900(0);
		}
		this.aClass164_5.method3843('\u0000');
		this.aBoolean508 = true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
	@Override
	public void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean508) {
			super.aClass95_Sub3_37.method4900(1);
			super.aClass95_Sub3_37.method4864(this.aClass10_Sub3Array1[arg1 - 1]);
			super.aClass95_Sub3_37.method4900(0);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6984(@OriginalArg(0) boolean arg0) {
		super.aClass95_Sub3_37.method4899(8448, 7681);
	}
}
