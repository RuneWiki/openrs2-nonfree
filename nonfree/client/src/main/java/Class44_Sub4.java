import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class44_Sub4 extends Class44 {

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "Lclient!u;")
	private Class326 aClass326_1;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Z")
	private boolean aBoolean374 = false;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "Z")
	private boolean aBoolean373;

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "[Lclient!jk;")
	private Class114_Sub3[] aClass114_Sub3Array1;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class44_Sub4(@OriginalArg(0) Class66_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean465) {
			this.aBoolean373 = arg0.anInt6458 < 3;
			@Pc(26) int local26 = this.aBoolean373 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local89;
						} else if (local91 == 1) {
							local98 = local89;
						} else if (local91 == 2) {
							local98 = local85;
						} else if (local91 == 3) {
							local98 = -local85;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(146) int local146;
						@Pc(145) int local145;
						@Pc(143) int local143;
						if (local98 > 0.0F) {
							local146 = (int) (Math.pow((double) local98, 96.0D) * (double) local26);
							local145 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local143 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local143 = 0;
							local145 = 0;
							local146 = 0;
						}
						local34[local91][local40] = (byte) local146;
						local38[local91][local40] = (byte) local145;
						local30[local91][local40] = (byte) local143;
					}
					local40++;
				}
			}
			this.aClass114_Sub3Array1 = new Class114_Sub3[3];
			this.aClass114_Sub3Array1[0] = new Class114_Sub3(super.aClass66_Sub3_38, 6406, 64, false, local34, 6406);
			this.aClass114_Sub3Array1[1] = new Class114_Sub3(super.aClass66_Sub3_38, 6406, 64, false, local38, 6406);
			this.aClass114_Sub3Array1[2] = new Class114_Sub3(super.aClass66_Sub3_38, 6406, 64, false, local30, 6406);
			this.method4232();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	@Override
	public void method7476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean374) {
			super.aClass66_Sub3_38.method5381(1);
			super.aClass66_Sub3_38.method5382(this.aClass114_Sub3Array1[arg1 - 1]);
			super.aClass66_Sub3_38.method5381(0);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	@Override
	public void method7482() {
		if (this.aBoolean374) {
			if (!this.aBoolean373) {
				super.aClass66_Sub3_38.method5381(2);
				super.aClass66_Sub3_38.method5382(null);
			}
			super.aClass66_Sub3_38.method5381(1);
			super.aClass66_Sub3_38.method5382(null);
			super.aClass66_Sub3_38.method5381(0);
			this.aClass326_1.method7292('\u0001');
			this.aBoolean374 = false;
		} else {
			super.aClass66_Sub3_38.method5424(0, 5890);
		}
		super.aClass66_Sub3_38.method5396(8448, 8448);
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7484() {
		return true;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
		if (this.aClass326_1 == null || !arg0) {
			super.aClass66_Sub3_38.method5424(0, 34168);
			return;
		}
		if (!this.aBoolean373) {
			super.aClass66_Sub3_38.method5381(2);
			super.aClass66_Sub3_38.method5382(super.aClass66_Sub3_38.aClass114_Sub1_3);
			super.aClass66_Sub3_38.method5381(0);
		}
		this.aClass326_1.method7292('\u0000');
		this.aBoolean374 = true;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7479(@OriginalArg(1) boolean arg0) {
		super.aClass66_Sub3_38.method5396(7681, 8448);
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
	private void method4232() {
		this.aClass326_1 = new Class326(super.aClass66_Sub3_38, 2);
		this.aClass326_1.method7293(0);
		super.aClass66_Sub3_38.method5381(1);
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
		if (this.aBoolean373) {
			super.aClass66_Sub3_38.method5396(7681, 260);
			super.aClass66_Sub3_38.method5361(770, 0, 5890);
			super.aClass66_Sub3_38.method5424(0, 34167);
		} else {
			super.aClass66_Sub3_38.method5396(8448, 7681);
			super.aClass66_Sub3_38.method5361(768, 0, 34168);
			super.aClass66_Sub3_38.method5381(2);
			super.aClass66_Sub3_38.method5396(7681, 260);
			super.aClass66_Sub3_38.method5361(768, 0, 34168);
			super.aClass66_Sub3_38.method5361(770, 1, 34168);
			super.aClass66_Sub3_38.method5424(0, 34167);
		}
		super.aClass66_Sub3_38.method5381(0);
		this.aClass326_1.method7295();
		this.aClass326_1.method7293(1);
		super.aClass66_Sub3_38.method5381(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean373) {
			super.aClass66_Sub3_38.method5396(8448, 8448);
			super.aClass66_Sub3_38.method5361(768, 0, 5890);
			super.aClass66_Sub3_38.method5424(0, 5890);
		} else {
			super.aClass66_Sub3_38.method5396(8448, 8448);
			super.aClass66_Sub3_38.method5361(768, 0, 5890);
			super.aClass66_Sub3_38.method5381(2);
			super.aClass66_Sub3_38.method5396(8448, 8448);
			super.aClass66_Sub3_38.method5361(768, 0, 5890);
			super.aClass66_Sub3_38.method5361(768, 1, 34168);
			super.aClass66_Sub3_38.method5424(0, 5890);
		}
		super.aClass66_Sub3_38.method5381(0);
		this.aClass326_1.method7295();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILclient!hf;)V")
	@Override
	public void method7478(@OriginalArg(1) int arg0, @OriginalArg(2) Class114 arg1) {
		super.aClass66_Sub3_38.method5382(arg1);
		super.aClass66_Sub3_38.method5355(arg0);
	}
}
