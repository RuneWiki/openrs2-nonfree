import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class44_Sub4 extends Class44 {

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!pia;")
	private Class283 aClass283_3;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "Z")
	private boolean aBoolean360 = false;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Z")
	private boolean aBoolean359;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "[Lclient!hfa;")
	private Class116_Sub1[] aClass116_Sub1Array1;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class44_Sub4(@OriginalArg(0) Class33_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean575) {
			this.aBoolean359 = arg0.anInt7289 < 3;
			@Pc(26) int local26 = this.aBoolean359 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local85;
						} else if (local91 == 1) {
							local98 = local85;
						} else if (local91 == 2) {
							local98 = local89;
						} else if (local91 == 3) {
							local98 = -local89;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(151) int local151;
						@Pc(160) int local160;
						@Pc(169) int local169;
						if (local98 > 0.0F) {
							local151 = (int) (Math.pow((double) local98, 96.0D) * (double) local26);
							local160 = (int) (Math.pow((double) local98, 36.0D) * (double) local26);
							local169 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local169 = 0;
							local160 = 0;
							local151 = 0;
						}
						local34[local91][local40] = (byte) local151;
						local38[local91][local40] = (byte) local160;
						local30[local91][local40] = (byte) local169;
					}
					local40++;
				}
			}
			this.aClass116_Sub1Array1 = new Class116_Sub1[3];
			this.aClass116_Sub1Array1[0] = new Class116_Sub1(super.aClass33_Sub3_34, 6406, 64, false, local34, 6406);
			this.aClass116_Sub1Array1[1] = new Class116_Sub1(super.aClass33_Sub3_34, 6406, 64, false, local38, 6406);
			this.aClass116_Sub1Array1[2] = new Class116_Sub1(super.aClass33_Sub3_34, 6406, 64, false, local30, 6406);
			this.method4296();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7666() {
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(IZ)V")
	@Override
	public void method7671(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub3_34.method6365(7681, 8448);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	private void method4296() {
		this.aClass283_3 = new Class283(super.aClass33_Sub3_34, 2);
		this.aClass283_3.method6455(0);
		super.aClass33_Sub3_34.method6329(1);
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
		if (this.aBoolean359) {
			super.aClass33_Sub3_34.method6365(7681, 260);
			super.aClass33_Sub3_34.method6307(5890, 0, 770);
			super.aClass33_Sub3_34.method6335(0, 34167);
		} else {
			super.aClass33_Sub3_34.method6365(8448, 7681);
			super.aClass33_Sub3_34.method6307(34168, 0, 768);
			super.aClass33_Sub3_34.method6329(2);
			super.aClass33_Sub3_34.method6365(7681, 260);
			super.aClass33_Sub3_34.method6307(34168, 0, 768);
			super.aClass33_Sub3_34.method6307(34168, 1, 770);
			super.aClass33_Sub3_34.method6335(0, 34167);
		}
		super.aClass33_Sub3_34.method6329(0);
		this.aClass283_3.method6454();
		this.aClass283_3.method6455(1);
		super.aClass33_Sub3_34.method6329(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean359) {
			super.aClass33_Sub3_34.method6365(8448, 8448);
			super.aClass33_Sub3_34.method6307(5890, 0, 768);
			super.aClass33_Sub3_34.method6335(0, 5890);
		} else {
			super.aClass33_Sub3_34.method6365(8448, 8448);
			super.aClass33_Sub3_34.method6307(5890, 0, 768);
			super.aClass33_Sub3_34.method6329(2);
			super.aClass33_Sub3_34.method6365(8448, 8448);
			super.aClass33_Sub3_34.method6307(5890, 0, 768);
			super.aClass33_Sub3_34.method6307(34168, 1, 768);
			super.aClass33_Sub3_34.method6335(0, 5890);
		}
		super.aClass33_Sub3_34.method6329(0);
		this.aClass283_3.method6454();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	@Override
	public void method7672() {
		if (this.aBoolean360) {
			if (!this.aBoolean359) {
				super.aClass33_Sub3_34.method6329(2);
				super.aClass33_Sub3_34.method6340((Class116) null);
			}
			super.aClass33_Sub3_34.method6329(1);
			super.aClass33_Sub3_34.method6340((Class116) null);
			super.aClass33_Sub3_34.method6329(0);
			this.aClass283_3.method6453('\u0001');
			this.aBoolean360 = false;
		} else {
			super.aClass33_Sub3_34.method6335(0, 5890);
		}
		super.aClass33_Sub3_34.method6365(8448, 8448);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
	@Override
	public void method7668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean360) {
			super.aClass33_Sub3_34.method6329(1);
			super.aClass33_Sub3_34.method6340(this.aClass116_Sub1Array1[arg0 - 1]);
			super.aClass33_Sub3_34.method6329(0);
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7670(@OriginalArg(1) boolean arg0) {
		if (this.aClass283_3 == null || !arg0) {
			super.aClass33_Sub3_34.method6335(0, 34168);
			return;
		}
		if (!this.aBoolean359) {
			super.aClass33_Sub3_34.method6329(2);
			super.aClass33_Sub3_34.method6340(super.aClass33_Sub3_34.aClass116_Sub2_5);
			super.aClass33_Sub3_34.method6329(0);
		}
		this.aClass283_3.method6453('\u0000');
		this.aBoolean360 = true;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLclient!fha;)V")
	@Override
	public void method7667(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1) {
		super.aClass33_Sub3_34.method6340(arg1);
		super.aClass33_Sub3_34.method6336(arg0);
	}
}
