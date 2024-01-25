import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class20_Sub5 extends Class20 {

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "Lclient!qt;")
	private Class279 aClass279_2;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "[Lclient!sa;")
	private Class77_Sub4[] aClass77_Sub4Array1;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class20_Sub5(@OriginalArg(0) Class44_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean416) {
			this.aBoolean232 = arg0.anInt5489 < 3;
			@Pc(26) int local26 = this.aBoolean232 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
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
						@Pc(144) int local144;
						@Pc(143) int local143;
						@Pc(141) int local141;
						if (local98 > 0.0F) {
							local144 = (int) (Math.pow((double) local98, 96.0D) * (double) local26);
							local143 = (int) (Math.pow((double) local98, 36.0D) * (double) local26);
							local141 = (int) (Math.pow((double) local98, 12.0D) * (double) local26);
						} else {
							local141 = 0;
							local143 = 0;
							local144 = 0;
						}
						local34[local91][local40] = (byte) local144;
						local38[local91][local40] = (byte) local143;
						local30[local91][local40] = (byte) local141;
					}
					local40++;
				}
			}
			this.aClass77_Sub4Array1 = new Class77_Sub4[3];
			this.aClass77_Sub4Array1[0] = new Class77_Sub4(super.aClass44_Sub3_42, 6406, 64, false, local34, 6406);
			this.aClass77_Sub4Array1[1] = new Class77_Sub4(super.aClass44_Sub3_42, 6406, 64, false, local38, 6406);
			this.aClass77_Sub4Array1[2] = new Class77_Sub4(super.aClass44_Sub3_42, 6406, 64, false, local30, 6406);
			this.method2730();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	@Override
	public void method7867() {
		if (this.aBoolean231) {
			if (!this.aBoolean232) {
				super.aClass44_Sub3_42.method4648(2);
				super.aClass44_Sub3_42.method4605(null);
			}
			super.aClass44_Sub3_42.method4648(1);
			super.aClass44_Sub3_42.method4605(null);
			super.aClass44_Sub3_42.method4648(0);
			this.aClass279_2.method6798('\u0001');
			this.aBoolean231 = false;
		} else {
			super.aClass44_Sub3_42.method4611(5890, 0);
		}
		super.aClass44_Sub3_42.method4621(8448, 8448);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7870(@OriginalArg(1) boolean arg0) {
		super.aClass44_Sub3_42.method4621(8448, 7681);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean231) {
			super.aClass44_Sub3_42.method4648(1);
			super.aClass44_Sub3_42.method4605(this.aClass77_Sub4Array1[arg0 - 1]);
			super.aClass44_Sub3_42.method4648(0);
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7868() {
		return true;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!jf;II)V")
	@Override
	public void method7863(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		super.aClass44_Sub3_42.method4605(arg0);
		super.aClass44_Sub3_42.method4658(arg1);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
	private void method2730() {
		this.aClass279_2 = new Class279(super.aClass44_Sub3_42, 2);
		this.aClass279_2.method6794(0);
		super.aClass44_Sub3_42.method4648(1);
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
		if (this.aBoolean232) {
			super.aClass44_Sub3_42.method4621(260, 7681);
			super.aClass44_Sub3_42.method4641(770, 0, 5890);
			super.aClass44_Sub3_42.method4611(34167, 0);
		} else {
			super.aClass44_Sub3_42.method4621(7681, 8448);
			super.aClass44_Sub3_42.method4641(768, 0, 34168);
			super.aClass44_Sub3_42.method4648(2);
			super.aClass44_Sub3_42.method4621(260, 7681);
			super.aClass44_Sub3_42.method4641(768, 0, 34168);
			super.aClass44_Sub3_42.method4641(770, 1, 34168);
			super.aClass44_Sub3_42.method4611(34167, 0);
		}
		super.aClass44_Sub3_42.method4648(0);
		this.aClass279_2.method6799();
		this.aClass279_2.method6794(1);
		super.aClass44_Sub3_42.method4648(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean232) {
			super.aClass44_Sub3_42.method4621(8448, 8448);
			super.aClass44_Sub3_42.method4641(768, 0, 5890);
			super.aClass44_Sub3_42.method4611(5890, 0);
		} else {
			super.aClass44_Sub3_42.method4621(8448, 8448);
			super.aClass44_Sub3_42.method4641(768, 0, 5890);
			super.aClass44_Sub3_42.method4648(2);
			super.aClass44_Sub3_42.method4621(8448, 8448);
			super.aClass44_Sub3_42.method4641(768, 0, 5890);
			super.aClass44_Sub3_42.method4641(768, 1, 34168);
			super.aClass44_Sub3_42.method4611(5890, 0);
		}
		super.aClass44_Sub3_42.method4648(0);
		this.aClass279_2.method6799();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7862(@OriginalArg(0) boolean arg0) {
		if (this.aClass279_2 == null || !arg0) {
			super.aClass44_Sub3_42.method4611(34168, 0);
			return;
		}
		if (!this.aBoolean232) {
			super.aClass44_Sub3_42.method4648(2);
			super.aClass44_Sub3_42.method4605(super.aClass44_Sub3_42.aClass77_Sub1_2);
			super.aClass44_Sub3_42.method4648(0);
		}
		this.aClass279_2.method6798('\u0000');
		this.aBoolean231 = true;
	}
}
