import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class72_Sub4 extends Class72 {

	@OriginalMember(owner = "client!it", name = "v", descriptor = "Lclient!sc;")
	private Class223 aClass223_3;

	@OriginalMember(owner = "client!it", name = "C", descriptor = "Z")
	private boolean aBoolean308 = false;

	@OriginalMember(owner = "client!it", name = "E", descriptor = "Z")
	private boolean aBoolean309;

	@OriginalMember(owner = "client!it", name = "u", descriptor = "[Lclient!rd;")
	private Class112_Sub4[] aClass112_Sub4Array1;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class72_Sub4(@OriginalArg(0) Class172_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean599) {
			this.aBoolean309 = arg0.anInt7195 < 3;
			@Pc(26) int local26 = this.aBoolean309 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(55) float local55 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(64) float local64 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(79) float local79 = (float) (1.0D / Math.sqrt((double) (local64 * local64 + local55 * local55 + 1.0F)));
					@Pc(83) float local83 = local64 * local79;
					@Pc(87) float local87 = local55 * local79;
					for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
						@Pc(98) float local98;
						if (local89 == 0) {
							local98 = -local87;
						} else if (local89 == 1) {
							local98 = local87;
						} else if (local89 == 2) {
							local98 = local83;
						} else if (local89 == 3) {
							local98 = -local83;
						} else if (local89 == 4) {
							local98 = local79;
						} else {
							local98 = -local79;
						}
						@Pc(146) int local146;
						@Pc(155) int local155;
						@Pc(164) int local164;
						if (local98 > 0.0F) {
							local146 = (int) (Math.pow((double) local98, 96.0D) * (double) local26);
							local155 = (int) (Math.pow((double) local98, 36.0D) * (double) local26);
							local164 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local164 = 0;
							local155 = 0;
							local146 = 0;
						}
						local34[local89][local40] = (byte) local146;
						local38[local89][local40] = (byte) local155;
						local30[local89][local40] = (byte) local164;
					}
					local40++;
				}
			}
			this.aClass112_Sub4Array1 = new Class112_Sub4[3];
			this.aClass112_Sub4Array1[0] = new Class112_Sub4(super.aClass172_Sub2_43, 6406, 64, false, local34, 6406);
			this.aClass112_Sub4Array1[1] = new Class112_Sub4(super.aClass172_Sub2_43, 6406, 64, false, local38, 6406);
			this.aClass112_Sub4Array1[2] = new Class112_Sub4(super.aClass172_Sub2_43, 6406, 64, false, local30, 6406);
			this.method2862();
		}
	}

	@OriginalMember(owner = "client!it", name = "f", descriptor = "(I)V")
	private void method2862() {
		this.aClass223_3 = new Class223(super.aClass172_Sub2_43, 2);
		this.aClass223_3.method4786(0);
		super.aClass172_Sub2_43.method5569(1);
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
		if (this.aBoolean309) {
			super.aClass172_Sub2_43.method5591(260, 7681);
			super.aClass172_Sub2_43.method5561(770, 5890, 0);
			super.aClass172_Sub2_43.method5592(34167, 0);
		} else {
			super.aClass172_Sub2_43.method5591(7681, 8448);
			super.aClass172_Sub2_43.method5561(768, 34168, 0);
			super.aClass172_Sub2_43.method5569(2);
			super.aClass172_Sub2_43.method5591(260, 7681);
			super.aClass172_Sub2_43.method5561(768, 34168, 0);
			super.aClass172_Sub2_43.method5561(770, 34168, 1);
			super.aClass172_Sub2_43.method5592(34167, 0);
		}
		super.aClass172_Sub2_43.method5569(0);
		this.aClass223_3.method4784();
		this.aClass223_3.method4786(1);
		super.aClass172_Sub2_43.method5569(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean309) {
			super.aClass172_Sub2_43.method5591(8448, 8448);
			super.aClass172_Sub2_43.method5561(768, 5890, 0);
			super.aClass172_Sub2_43.method5592(5890, 0);
		} else {
			super.aClass172_Sub2_43.method5591(8448, 8448);
			super.aClass172_Sub2_43.method5561(768, 5890, 0);
			super.aClass172_Sub2_43.method5569(2);
			super.aClass172_Sub2_43.method5591(8448, 8448);
			super.aClass172_Sub2_43.method5561(768, 5890, 0);
			super.aClass172_Sub2_43.method5561(768, 34168, 1);
			super.aClass172_Sub2_43.method5592(5890, 0);
		}
		super.aClass172_Sub2_43.method5569(0);
		this.aClass223_3.method4784();
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
	@Override
	public void method5960() {
		if (this.aBoolean308) {
			if (!this.aBoolean309) {
				super.aClass172_Sub2_43.method5569(2);
				super.aClass172_Sub2_43.method5630(null);
			}
			super.aClass172_Sub2_43.method5569(1);
			super.aClass172_Sub2_43.method5630(null);
			super.aClass172_Sub2_43.method5569(0);
			this.aClass223_3.method4785('\u0001');
			this.aBoolean308 = false;
		} else {
			super.aClass172_Sub2_43.method5592(5890, 0);
		}
		super.aClass172_Sub2_43.method5591(8448, 8448);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IILclient!ih;)V")
	@Override
	public void method5963(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1) {
		super.aClass172_Sub2_43.method5630(arg1);
		super.aClass172_Sub2_43.method5629(arg0);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean308) {
			super.aClass172_Sub2_43.method5569(1);
			super.aClass172_Sub2_43.method5630(this.aClass112_Sub4Array1[arg0 - 1]);
			super.aClass172_Sub2_43.method5569(0);
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5961() {
		return true;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5966(@OriginalArg(0) boolean arg0) {
		if (this.aClass223_3 == null || !arg0) {
			super.aClass172_Sub2_43.method5592(34168, 0);
			return;
		}
		if (!this.aBoolean309) {
			super.aClass172_Sub2_43.method5569(2);
			super.aClass172_Sub2_43.method5630(super.aClass172_Sub2_43.aClass112_Sub2_5);
			super.aClass172_Sub2_43.method5569(0);
		}
		this.aClass223_3.method4785('\u0000');
		this.aBoolean308 = true;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5970(@OriginalArg(0) boolean arg0) {
		super.aClass172_Sub2_43.method5591(8448, 7681);
	}
}
