import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class62_Sub2 extends Class62 {

	@OriginalMember(owner = "client!en", name = "v", descriptor = "Lclient!ih;")
	private Class117 aClass117_1;

	@OriginalMember(owner = "client!en", name = "y", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!en", name = "l", descriptor = "Z")
	private boolean aBoolean160;

	@OriginalMember(owner = "client!en", name = "t", descriptor = "[Lclient!vg;")
	private Class55_Sub4[] aClass55_Sub4Array1;

	static {
		new Class209("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class62_Sub2(@OriginalArg(0) Class49_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean128) {
			this.aBoolean160 = arg0.anInt2031 < 3;
			@Pc(28) int local28 = this.aBoolean160 ? 48 : 127;
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
						@Pc(116) float local116;
						if (local93 == 0) {
							local116 = -local87;
						} else if (local93 == 1) {
							local116 = local87;
						} else if (local93 == 2) {
							local116 = local91;
						} else if (local93 == 3) {
							local116 = -local91;
						} else if (local93 == 4) {
							local116 = local83;
						} else {
							local116 = -local83;
						}
						@Pc(152) int local152;
						@Pc(161) int local161;
						@Pc(170) int local170;
						if (local116 > 0.0F) {
							local152 = (int) (Math.pow((double) local116, 96.0D) * (double) local28);
							local161 = (int) (Math.pow((double) local116, 36.0D) * (double) local28);
							local170 = (int) (Math.pow((double) local116, 12.0D) * (double) local28);
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
			this.aClass55_Sub4Array1 = new Class55_Sub4[3];
			this.aClass55_Sub4Array1[0] = new Class55_Sub4(super.aClass49_Sub2_43, 6406, 64, false, local36, 6406);
			this.aClass55_Sub4Array1[1] = new Class55_Sub4(super.aClass49_Sub2_43, 6406, 64, false, local40, 6406);
			this.aClass55_Sub4Array1[2] = new Class55_Sub4(super.aClass49_Sub2_43, 6406, 64, false, local32, 6406);
			this.method1765();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	@Override
	public void method5829() {
		if (this.aBoolean162) {
			if (!this.aBoolean160) {
				super.aClass49_Sub2_43.method1600(2);
				super.aClass49_Sub2_43.method1646(null);
			}
			super.aClass49_Sub2_43.method1600(1);
			super.aClass49_Sub2_43.method1646(null);
			super.aClass49_Sub2_43.method1600(0);
			this.aClass117_1.method2645('\u0001');
			this.aBoolean162 = false;
		} else {
			super.aClass49_Sub2_43.method1623(5890, 0);
		}
		super.aClass49_Sub2_43.method1613(8448, 8448);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!mk;II)V")
	@Override
	public void method5830(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		super.aClass49_Sub2_43.method1646(arg0);
		super.aClass49_Sub2_43.method1624(arg1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5821() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean162) {
			super.aClass49_Sub2_43.method1600(1);
			super.aClass49_Sub2_43.method1646(this.aClass55_Sub4Array1[arg1 - 1]);
			super.aClass49_Sub2_43.method1600(0);
		}
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
	private void method1765() {
		this.aClass117_1 = new Class117(super.aClass49_Sub2_43, 2);
		this.aClass117_1.method2648(0);
		super.aClass49_Sub2_43.method1600(1);
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
		if (this.aBoolean160) {
			super.aClass49_Sub2_43.method1613(260, 7681);
			super.aClass49_Sub2_43.method1625(5890, 770, 0);
			super.aClass49_Sub2_43.method1623(34167, 0);
		} else {
			super.aClass49_Sub2_43.method1613(7681, 8448);
			super.aClass49_Sub2_43.method1625(34168, 768, 0);
			super.aClass49_Sub2_43.method1600(2);
			super.aClass49_Sub2_43.method1613(260, 7681);
			super.aClass49_Sub2_43.method1625(34168, 768, 0);
			super.aClass49_Sub2_43.method1625(34168, 770, 1);
			super.aClass49_Sub2_43.method1623(34167, 0);
		}
		super.aClass49_Sub2_43.method1600(0);
		this.aClass117_1.method2647();
		this.aClass117_1.method2648(1);
		super.aClass49_Sub2_43.method1600(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean160) {
			super.aClass49_Sub2_43.method1613(8448, 8448);
			super.aClass49_Sub2_43.method1625(5890, 768, 0);
			super.aClass49_Sub2_43.method1623(5890, 0);
		} else {
			super.aClass49_Sub2_43.method1613(8448, 8448);
			super.aClass49_Sub2_43.method1625(5890, 768, 0);
			super.aClass49_Sub2_43.method1600(2);
			super.aClass49_Sub2_43.method1613(8448, 8448);
			super.aClass49_Sub2_43.method1625(5890, 768, 0);
			super.aClass49_Sub2_43.method1625(34168, 768, 1);
			super.aClass49_Sub2_43.method1623(5890, 0);
		}
		super.aClass49_Sub2_43.method1600(0);
		this.aClass117_1.method2647();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
		super.aClass49_Sub2_43.method1613(8448, 7681);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5822(@OriginalArg(1) boolean arg0) {
		if (this.aClass117_1 == null || !arg0) {
			super.aClass49_Sub2_43.method1623(34168, 0);
			return;
		}
		if (!this.aBoolean160) {
			super.aClass49_Sub2_43.method1600(2);
			super.aClass49_Sub2_43.method1646(super.aClass49_Sub2_43.aClass55_Sub3_1);
			super.aClass49_Sub2_43.method1600(0);
		}
		this.aClass117_1.method2645('\u0000');
		this.aBoolean162 = true;
	}
}
