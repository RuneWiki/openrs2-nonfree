import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class35_Sub9 extends Class35 {

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "Lclient!wl;")
	private Class318 aClass318_5;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "Z")
	private boolean aBoolean612 = false;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "Z")
	private boolean aBoolean613;

	@OriginalMember(owner = "client!vr", name = "t", descriptor = "[Lclient!ci;")
	private Class20_Sub2[] aClass20_Sub2Array1;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class35_Sub9(@OriginalArg(0) Class9_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean526) {
			this.aBoolean613 = arg0.anInt7894 < 3;
			@Pc(26) int local26 = this.aBoolean613 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(55) float local55 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(64) float local64 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(79) float local79 = (float) (1.0D / Math.sqrt((double) (local55 * local55 + local64 * local64 + 1.0F)));
					@Pc(83) float local83 = local55 * local79;
					@Pc(87) float local87 = local64 * local79;
					for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
						@Pc(98) float local98;
						if (local89 == 0) {
							local98 = -local83;
						} else if (local89 == 1) {
							local98 = local83;
						} else if (local89 == 2) {
							local98 = local87;
						} else if (local89 == 3) {
							local98 = -local87;
						} else if (local89 == 4) {
							local98 = local79;
						} else {
							local98 = -local79;
						}
						@Pc(142) int local142;
						@Pc(151) int local151;
						@Pc(160) int local160;
						if (local98 > 0.0F) {
							local142 = (int) (Math.pow((double) local98, 96.0D) * (double) local26);
							local151 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local160 = (int) (Math.pow((double) local98, 12.0D) * (double) local26);
						} else {
							local160 = 0;
							local151 = 0;
							local142 = 0;
						}
						local34[local89][local40] = (byte) local142;
						local38[local89][local40] = (byte) local151;
						local30[local89][local40] = (byte) local160;
					}
					local40++;
				}
			}
			this.aClass20_Sub2Array1 = new Class20_Sub2[3];
			this.aClass20_Sub2Array1[0] = new Class20_Sub2(super.aClass9_Sub3_41, 6406, 64, false, local34, 6406);
			this.aClass20_Sub2Array1[1] = new Class20_Sub2(super.aClass9_Sub3_41, 6406, 64, false, local38, 6406);
			this.aClass20_Sub2Array1[2] = new Class20_Sub2(super.aClass9_Sub3_41, 6406, 64, false, local30, 6406);
			this.method7426();
		}
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
	@Override
	public void method7418() {
		if (this.aBoolean612) {
			if (!this.aBoolean613) {
				super.aClass9_Sub3_41.method6660(2);
				super.aClass9_Sub3_41.method6701(null);
			}
			super.aClass9_Sub3_41.method6660(1);
			super.aClass9_Sub3_41.method6701(null);
			super.aClass9_Sub3_41.method6660(0);
			this.aClass318_5.method7877('\u0001');
			this.aBoolean612 = false;
		} else {
			super.aClass9_Sub3_41.method6656(5890, 0);
		}
		super.aClass9_Sub3_41.method6732(8448, 8448);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILclient!jl;)V")
	@Override
	public void method7420(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		super.aClass9_Sub3_41.method6701(arg1);
		super.aClass9_Sub3_41.method6670(arg0);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
	@Override
	public void method7419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean612) {
			super.aClass9_Sub3_41.method6660(1);
			super.aClass9_Sub3_41.method6701(this.aClass20_Sub2Array1[arg1 - 1]);
			super.aClass9_Sub3_41.method6660(0);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7414() {
		return true;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7416(@OriginalArg(0) boolean arg0) {
		if (this.aClass318_5 == null || !arg0) {
			super.aClass9_Sub3_41.method6656(34168, 0);
			return;
		}
		if (!this.aBoolean613) {
			super.aClass9_Sub3_41.method6660(2);
			super.aClass9_Sub3_41.method6701(super.aClass9_Sub3_41.aClass20_Sub3_5);
			super.aClass9_Sub3_41.method6660(0);
		}
		this.aClass318_5.method7877('\u0000');
		this.aBoolean612 = true;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V")
	private void method7426() {
		this.aClass318_5 = new Class318(super.aClass9_Sub3_41, 2);
		this.aClass318_5.method7880(0);
		super.aClass9_Sub3_41.method6660(1);
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
		if (this.aBoolean613) {
			super.aClass9_Sub3_41.method6732(260, 7681);
			super.aClass9_Sub3_41.method6706(5890, 0, 770);
			super.aClass9_Sub3_41.method6656(34167, 0);
		} else {
			super.aClass9_Sub3_41.method6732(7681, 8448);
			super.aClass9_Sub3_41.method6706(34168, 0, 768);
			super.aClass9_Sub3_41.method6660(2);
			super.aClass9_Sub3_41.method6732(260, 7681);
			super.aClass9_Sub3_41.method6706(34168, 0, 768);
			super.aClass9_Sub3_41.method6706(34168, 1, 770);
			super.aClass9_Sub3_41.method6656(34167, 0);
		}
		super.aClass9_Sub3_41.method6660(0);
		this.aClass318_5.method7881();
		this.aClass318_5.method7880(1);
		super.aClass9_Sub3_41.method6660(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean613) {
			super.aClass9_Sub3_41.method6732(8448, 8448);
			super.aClass9_Sub3_41.method6706(5890, 0, 768);
			super.aClass9_Sub3_41.method6656(5890, 0);
		} else {
			super.aClass9_Sub3_41.method6732(8448, 8448);
			super.aClass9_Sub3_41.method6706(5890, 0, 768);
			super.aClass9_Sub3_41.method6660(2);
			super.aClass9_Sub3_41.method6732(8448, 8448);
			super.aClass9_Sub3_41.method6706(5890, 0, 768);
			super.aClass9_Sub3_41.method6706(34168, 1, 768);
			super.aClass9_Sub3_41.method6656(5890, 0);
		}
		super.aClass9_Sub3_41.method6660(0);
		this.aClass318_5.method7881();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7417(@OriginalArg(1) boolean arg0) {
		super.aClass9_Sub3_41.method6732(8448, 7681);
	}
}
