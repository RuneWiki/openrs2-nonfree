import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class14_Sub8 extends Class14 {

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "Lclient!bp;")
	private Class36 aClass36_5;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "Z")
	private boolean aBoolean797 = false;

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "Z")
	private boolean aBoolean798;

	@OriginalMember(owner = "client!tp", name = "r", descriptor = "[Lclient!gv;")
	private Class121_Sub1[] aClass121_Sub1Array1;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class14_Sub8(@OriginalArg(0) Class33_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean265) {
			this.aBoolean798 = arg0.anInt3429 < 3;
			@Pc(26) int local26 = this.aBoolean798 ? 48 : 127;
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
						@Pc(102) float local102;
						if (local91 == 0) {
							local102 = -local85;
						} else if (local91 == 1) {
							local102 = local85;
						} else if (local91 == 2) {
							local102 = local89;
						} else if (local91 == 3) {
							local102 = -local89;
						} else if (local91 == 4) {
							local102 = local81;
						} else {
							local102 = -local81;
						}
						@Pc(149) int local149;
						@Pc(158) int local158;
						@Pc(167) int local167;
						if (local102 > 0.0F) {
							local149 = (int) ((double) local26 * Math.pow((double) local102, 96.0D));
							local158 = (int) (Math.pow((double) local102, 36.0D) * (double) local26);
							local167 = (int) (Math.pow((double) local102, 12.0D) * (double) local26);
						} else {
							local167 = 0;
							local158 = 0;
							local149 = 0;
						}
						local34[local91][local40] = (byte) local149;
						local38[local91][local40] = (byte) local158;
						local30[local91][local40] = (byte) local167;
					}
					local40++;
				}
			}
			this.aClass121_Sub1Array1 = new Class121_Sub1[3];
			this.aClass121_Sub1Array1[0] = new Class121_Sub1(super.aClass33_Sub3_43, 6406, 64, false, local34, 6406);
			this.aClass121_Sub1Array1[1] = new Class121_Sub1(super.aClass33_Sub3_43, 6406, 64, false, local38, 6406);
			this.aClass121_Sub1Array1[2] = new Class121_Sub1(super.aClass33_Sub3_43, 6406, 64, false, local30, 6406);
			this.method7810();
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	@Override
	public void method8545() {
		if (this.aBoolean797) {
			if (!this.aBoolean798) {
				super.aClass33_Sub3_43.method3027(2);
				super.aClass33_Sub3_43.method3012(null);
			}
			super.aClass33_Sub3_43.method3027(1);
			super.aClass33_Sub3_43.method3012(null);
			super.aClass33_Sub3_43.method3027(0);
			this.aClass36_5.method1112('\u0001');
			this.aBoolean797 = false;
		} else {
			super.aClass33_Sub3_43.method3081(5890, 0);
		}
		super.aClass33_Sub3_43.method3057(8448, 8448);
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V")
	private void method7810() {
		this.aClass36_5 = new Class36(super.aClass33_Sub3_43, 2);
		this.aClass36_5.method1116(0);
		super.aClass33_Sub3_43.method3027(1);
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
		if (this.aBoolean798) {
			super.aClass33_Sub3_43.method3057(7681, 260);
			super.aClass33_Sub3_43.method3024(770, 5890, 0);
			super.aClass33_Sub3_43.method3081(34167, 0);
		} else {
			super.aClass33_Sub3_43.method3057(8448, 7681);
			super.aClass33_Sub3_43.method3024(768, 34168, 0);
			super.aClass33_Sub3_43.method3027(2);
			super.aClass33_Sub3_43.method3057(7681, 260);
			super.aClass33_Sub3_43.method3024(768, 34168, 0);
			super.aClass33_Sub3_43.method3024(770, 34168, 1);
			super.aClass33_Sub3_43.method3081(34167, 0);
		}
		super.aClass33_Sub3_43.method3027(0);
		this.aClass36_5.method1115();
		this.aClass36_5.method1116(1);
		super.aClass33_Sub3_43.method3027(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean798) {
			super.aClass33_Sub3_43.method3057(8448, 8448);
			super.aClass33_Sub3_43.method3024(768, 5890, 0);
			super.aClass33_Sub3_43.method3081(5890, 0);
		} else {
			super.aClass33_Sub3_43.method3057(8448, 8448);
			super.aClass33_Sub3_43.method3024(768, 5890, 0);
			super.aClass33_Sub3_43.method3027(2);
			super.aClass33_Sub3_43.method3057(8448, 8448);
			super.aClass33_Sub3_43.method3024(768, 5890, 0);
			super.aClass33_Sub3_43.method3024(768, 34168, 1);
			super.aClass33_Sub3_43.method3081(5890, 0);
		}
		super.aClass33_Sub3_43.method3027(0);
		this.aClass36_5.method1115();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!kp;I)V")
	@Override
	public void method8542(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		super.aClass33_Sub3_43.method3012(arg0);
		super.aClass33_Sub3_43.method3045(arg1);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8549() {
		return true;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8543(@OriginalArg(1) boolean arg0) {
		if (this.aClass36_5 == null || !arg0) {
			super.aClass33_Sub3_43.method3081(34168, 0);
			return;
		}
		if (!this.aBoolean798) {
			super.aClass33_Sub3_43.method3027(2);
			super.aClass33_Sub3_43.method3012(super.aClass33_Sub3_43.aClass121_Sub2_1);
			super.aClass33_Sub3_43.method3027(0);
		}
		this.aClass36_5.method1112('\u0000');
		this.aBoolean797 = true;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8550(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub3_43.method3057(7681, 8448);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)V")
	@Override
	public void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean797) {
			super.aClass33_Sub3_43.method3027(1);
			super.aClass33_Sub3_43.method3012(this.aClass121_Sub1Array1[arg1 - 1]);
			super.aClass33_Sub3_43.method3027(0);
		}
	}
}
