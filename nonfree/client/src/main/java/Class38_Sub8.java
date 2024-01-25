import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class38_Sub8 extends Class38 {

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!hq;")
	private Class102 aClass102_5;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Z")
	private boolean aBoolean470 = false;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Z")
	private boolean aBoolean469;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "[Lclient!us;")
	private Class137_Sub4[] aClass137_Sub4Array1;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class38_Sub8(@OriginalArg(0) Class167_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean363) {
			this.aBoolean469 = arg0.anInt4910 < 3;
			@Pc(28) int local28 = this.aBoolean469 ? 48 : 127;
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
						@Pc(156) int local156;
						@Pc(165) int local165;
						@Pc(174) int local174;
						if (local103 > 0.0F) {
							local156 = (int) (Math.pow((double) local103, 96.0D) * (double) local28);
							local165 = (int) ((double) local28 * Math.pow((double) local103, 36.0D));
							local174 = (int) ((double) local28 * Math.pow((double) local103, 12.0D));
						} else {
							local174 = 0;
							local165 = 0;
							local156 = 0;
						}
						local36[local93][local42] = (byte) local156;
						local40[local93][local42] = (byte) local165;
						local32[local93][local42] = (byte) local174;
					}
					local42++;
				}
			}
			this.aClass137_Sub4Array1 = new Class137_Sub4[3];
			this.aClass137_Sub4Array1[0] = new Class137_Sub4(super.aClass167_Sub1_42, 6406, 64, false, local36, 6406);
			this.aClass137_Sub4Array1[1] = new Class137_Sub4(super.aClass167_Sub1_42, 6406, 64, false, local40, 6406);
			this.aClass137_Sub4Array1[2] = new Class137_Sub4(super.aClass167_Sub1_42, 6406, 64, false, local32, 6406);
			this.method5656();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5708(@OriginalArg(0) boolean arg0) {
		super.aClass167_Sub1_42.method3983(8448, 7681);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!lr;I)V")
	@Override
	public void method5710(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1) {
		super.aClass167_Sub1_42.method4028(arg0);
		super.aClass167_Sub1_42.method3998(arg1);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	@Override
	public void method5706() {
		if (this.aBoolean470) {
			if (!this.aBoolean469) {
				super.aClass167_Sub1_42.method3993(2);
				super.aClass167_Sub1_42.method4028(null);
			}
			super.aClass167_Sub1_42.method3993(1);
			super.aClass167_Sub1_42.method4028(null);
			super.aClass167_Sub1_42.method3993(0);
			this.aClass102_5.method2512('\u0001');
			this.aBoolean470 = false;
		} else {
			super.aClass167_Sub1_42.method3997(0, 5890);
		}
		super.aClass167_Sub1_42.method3983(8448, 8448);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5704() {
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean470) {
			super.aClass167_Sub1_42.method3993(1);
			super.aClass167_Sub1_42.method4028(this.aClass137_Sub4Array1[arg1 - 1]);
			super.aClass167_Sub1_42.method3993(0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5707(@OriginalArg(1) boolean arg0) {
		if (this.aClass102_5 == null || !arg0) {
			super.aClass167_Sub1_42.method3997(0, 34168);
			return;
		}
		if (!this.aBoolean469) {
			super.aClass167_Sub1_42.method3993(2);
			super.aClass167_Sub1_42.method4028(super.aClass167_Sub1_42.aClass137_Sub1_3);
			super.aClass167_Sub1_42.method3993(0);
		}
		this.aClass102_5.method2512('\u0000');
		this.aBoolean470 = true;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	private void method5656() {
		this.aClass102_5 = new Class102(super.aClass167_Sub1_42, 2);
		this.aClass102_5.method2513(0);
		super.aClass167_Sub1_42.method3993(1);
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
		if (this.aBoolean469) {
			super.aClass167_Sub1_42.method3983(260, 7681);
			super.aClass167_Sub1_42.method4012(5890, 770, 0);
			super.aClass167_Sub1_42.method3997(0, 34167);
		} else {
			super.aClass167_Sub1_42.method3983(7681, 8448);
			super.aClass167_Sub1_42.method4012(34168, 768, 0);
			super.aClass167_Sub1_42.method3993(2);
			super.aClass167_Sub1_42.method3983(260, 7681);
			super.aClass167_Sub1_42.method4012(34168, 768, 0);
			super.aClass167_Sub1_42.method4012(34168, 770, 1);
			super.aClass167_Sub1_42.method3997(0, 34167);
		}
		super.aClass167_Sub1_42.method3993(0);
		this.aClass102_5.method2510();
		this.aClass102_5.method2513(1);
		super.aClass167_Sub1_42.method3993(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean469) {
			super.aClass167_Sub1_42.method3983(8448, 8448);
			super.aClass167_Sub1_42.method4012(5890, 768, 0);
			super.aClass167_Sub1_42.method3997(0, 5890);
		} else {
			super.aClass167_Sub1_42.method3983(8448, 8448);
			super.aClass167_Sub1_42.method4012(5890, 768, 0);
			super.aClass167_Sub1_42.method3993(2);
			super.aClass167_Sub1_42.method3983(8448, 8448);
			super.aClass167_Sub1_42.method4012(5890, 768, 0);
			super.aClass167_Sub1_42.method4012(34168, 768, 1);
			super.aClass167_Sub1_42.method3997(0, 5890);
		}
		super.aClass167_Sub1_42.method3993(0);
		this.aClass102_5.method2510();
	}
}
