import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public final class Class31_Sub7 extends Class31 {

	@OriginalMember(owner = "client!tha", name = "o", descriptor = "Lclient!bfa;")
	private Class30 aClass30_4;

	@OriginalMember(owner = "client!tha", name = "l", descriptor = "Z")
	private boolean aBoolean732 = false;

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "Z")
	private boolean aBoolean731;

	@OriginalMember(owner = "client!tha", name = "h", descriptor = "[Lclient!oh;")
	private Class50_Sub3[] aClass50_Sub3Array1;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class31_Sub7(@OriginalArg(0) Class101_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean453) {
			this.aBoolean731 = arg0.anInt6339 < 3;
			@Pc(28) int local28 = this.aBoolean731 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(105) float local105;
						if (local93 == 0) {
							local105 = -local87;
						} else if (local93 == 1) {
							local105 = local87;
						} else if (local93 == 2) {
							local105 = local91;
						} else if (local93 == 3) {
							local105 = -local91;
						} else if (local93 == 4) {
							local105 = local83;
						} else {
							local105 = -local83;
						}
						@Pc(152) int local152;
						@Pc(161) int local161;
						@Pc(170) int local170;
						if (local105 > 0.0F) {
							local152 = (int) ((double) local28 * Math.pow((double) local105, 96.0D));
							local161 = (int) (Math.pow((double) local105, 36.0D) * (double) local28);
							local170 = (int) ((double) local28 * Math.pow((double) local105, 12.0D));
						} else {
							local170 = 0;
							local161 = 0;
							local152 = 0;
						}
						local36[local93][local42] = (byte) local152;
						local40[local93][local42] = (byte) local161;
						local32[local93][local42] = (byte) local170;
					}
					local42++;
				}
			}
			this.aClass50_Sub3Array1 = new Class50_Sub3[3];
			this.aClass50_Sub3Array1[0] = new Class50_Sub3(super.aClass101_Sub2_43, 6406, 64, false, local36, 6406);
			this.aClass50_Sub3Array1[1] = new Class50_Sub3(super.aClass101_Sub2_43, 6406, 64, false, local40, 6406);
			this.aClass50_Sub3Array1[2] = new Class50_Sub3(super.aClass101_Sub2_43, 6406, 64, false, local32, 6406);
			this.method8723();
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IZI)V")
	@Override
	public void method9603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean732) {
			super.aClass101_Sub2_43.method5627(1);
			super.aClass101_Sub2_43.method5690(this.aClass50_Sub3Array1[arg0 - 1]);
			super.aClass101_Sub2_43.method5627(0);
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9600(@OriginalArg(0) boolean arg0) {
		if (this.aClass30_4 == null || !arg0) {
			super.aClass101_Sub2_43.method5680(0, 34168);
			return;
		}
		if (!this.aBoolean731) {
			super.aClass101_Sub2_43.method5627(2);
			super.aClass101_Sub2_43.method5690(super.aClass101_Sub2_43.aClass50_Sub4_1);
			super.aClass101_Sub2_43.method5627(0);
		}
		this.aClass30_4.method940('\u0000');
		this.aBoolean732 = true;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9604() {
		return true;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
	@Override
	public void method9597() {
		if (this.aBoolean732) {
			if (!this.aBoolean731) {
				super.aClass101_Sub2_43.method5627(2);
				super.aClass101_Sub2_43.method5690((Class50) null);
			}
			super.aClass101_Sub2_43.method5627(1);
			super.aClass101_Sub2_43.method5690((Class50) null);
			super.aClass101_Sub2_43.method5627(0);
			this.aClass30_4.method940('\u0001');
			this.aBoolean732 = false;
		} else {
			super.aClass101_Sub2_43.method5680(0, 5890);
		}
		super.aClass101_Sub2_43.method5665(8448, 8448);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILclient!fga;I)V")
	@Override
	public void method9598(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		super.aClass101_Sub2_43.method5690(arg0);
		super.aClass101_Sub2_43.method5681(arg1);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9602(@OriginalArg(0) boolean arg0) {
		super.aClass101_Sub2_43.method5665(8448, 7681);
	}

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "(I)V")
	private void method8723() {
		this.aClass30_4 = new Class30(super.aClass101_Sub2_43, 2);
		this.aClass30_4.method944(0);
		super.aClass101_Sub2_43.method5627(1);
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
		if (this.aBoolean731) {
			super.aClass101_Sub2_43.method5665(260, 7681);
			super.aClass101_Sub2_43.method5657(770, 0, 5890);
			super.aClass101_Sub2_43.method5680(0, 34167);
		} else {
			super.aClass101_Sub2_43.method5665(7681, 8448);
			super.aClass101_Sub2_43.method5657(768, 0, 34168);
			super.aClass101_Sub2_43.method5627(2);
			super.aClass101_Sub2_43.method5665(260, 7681);
			super.aClass101_Sub2_43.method5657(768, 0, 34168);
			super.aClass101_Sub2_43.method5657(770, 1, 34168);
			super.aClass101_Sub2_43.method5680(0, 34167);
		}
		super.aClass101_Sub2_43.method5627(0);
		this.aClass30_4.method941();
		this.aClass30_4.method944(1);
		super.aClass101_Sub2_43.method5627(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean731) {
			super.aClass101_Sub2_43.method5665(8448, 8448);
			super.aClass101_Sub2_43.method5657(768, 0, 5890);
			super.aClass101_Sub2_43.method5680(0, 5890);
		} else {
			super.aClass101_Sub2_43.method5665(8448, 8448);
			super.aClass101_Sub2_43.method5657(768, 0, 5890);
			super.aClass101_Sub2_43.method5627(2);
			super.aClass101_Sub2_43.method5665(8448, 8448);
			super.aClass101_Sub2_43.method5657(768, 0, 5890);
			super.aClass101_Sub2_43.method5657(768, 1, 34168);
			super.aClass101_Sub2_43.method5680(0, 5890);
		}
		super.aClass101_Sub2_43.method5627(0);
		this.aClass30_4.method941();
	}
}
