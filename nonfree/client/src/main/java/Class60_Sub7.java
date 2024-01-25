import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class60_Sub7 extends Class60 {

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "Lclient!qda;")
	private Class266 aClass266_5;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "Z")
	private boolean aBoolean599 = false;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Z")
	private boolean aBoolean600;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "[Lclient!gda;")
	private Class51_Sub3[] aClass51_Sub3Array1;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class60_Sub7(@OriginalArg(0) Class14_Sub3 arg0) {
		super(arg0);
		if (arg0.bf) {
			this.aBoolean600 = arg0.anInt4596 < 3;
			@Pc(26) int local26 = this.aBoolean600 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(101) float local101;
						if (local91 == 0) {
							local101 = -local89;
						} else if (local91 == 1) {
							local101 = local89;
						} else if (local91 == 2) {
							local101 = local85;
						} else if (local91 == 3) {
							local101 = -local85;
						} else if (local91 == 4) {
							local101 = local81;
						} else {
							local101 = -local81;
						}
						@Pc(152) int local152;
						@Pc(161) int local161;
						@Pc(170) int local170;
						if (local101 > 0.0F) {
							local152 = (int) ((double) local26 * Math.pow((double) local101, 96.0D));
							local161 = (int) ((double) local26 * Math.pow((double) local101, 36.0D));
							local170 = (int) (Math.pow((double) local101, 12.0D) * (double) local26);
						} else {
							local170 = 0;
							local161 = 0;
							local152 = 0;
						}
						local34[local91][local40] = (byte) local152;
						local38[local91][local40] = (byte) local161;
						local30[local91][local40] = (byte) local170;
					}
					local40++;
				}
			}
			this.aClass51_Sub3Array1 = new Class51_Sub3[3];
			this.aClass51_Sub3Array1[0] = new Class51_Sub3(super.aClass14_Sub3_42, 6406, 64, false, local34, 6406);
			this.aClass51_Sub3Array1[1] = new Class51_Sub3(super.aClass14_Sub3_42, 6406, 64, false, local38, 6406);
			this.aClass51_Sub3Array1[2] = new Class51_Sub3(super.aClass14_Sub3_42, 6406, 64, false, local30, 6406);
			this.method6798();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
		super.aClass14_Sub3_42.method3976(8448, 7681);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!tj;)V")
	@Override
	public void method7475(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		super.aClass14_Sub3_42.method3985(arg1);
		super.aClass14_Sub3_42.method3925(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7476(@OriginalArg(0) boolean arg0) {
		if (this.aClass266_5 == null || !arg0) {
			super.aClass14_Sub3_42.method3918(0, 34168);
			return;
		}
		if (!this.aBoolean600) {
			super.aClass14_Sub3_42.method3917(2);
			super.aClass14_Sub3_42.method3985(super.aClass14_Sub3_42.aClass51_Sub1_3);
			super.aClass14_Sub3_42.method3917(0);
		}
		this.aClass266_5.method5987('\u0000');
		this.aBoolean599 = true;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean599) {
			super.aClass14_Sub3_42.method3917(1);
			super.aClass14_Sub3_42.method3985(this.aClass51_Sub3Array1[arg0 - 1]);
			super.aClass14_Sub3_42.method3917(0);
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7478() {
		return true;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	private void method6798() {
		this.aClass266_5 = new Class266(super.aClass14_Sub3_42, 2);
		this.aClass266_5.method5983(0);
		super.aClass14_Sub3_42.method3917(1);
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
		if (this.aBoolean600) {
			super.aClass14_Sub3_42.method3976(260, 7681);
			super.aClass14_Sub3_42.method3966(5890, 0, 770);
			super.aClass14_Sub3_42.method3918(0, 34167);
		} else {
			super.aClass14_Sub3_42.method3976(7681, 8448);
			super.aClass14_Sub3_42.method3966(34168, 0, 768);
			super.aClass14_Sub3_42.method3917(2);
			super.aClass14_Sub3_42.method3976(260, 7681);
			super.aClass14_Sub3_42.method3966(34168, 0, 768);
			super.aClass14_Sub3_42.method3966(34168, 1, 770);
			super.aClass14_Sub3_42.method3918(0, 34167);
		}
		super.aClass14_Sub3_42.method3917(0);
		this.aClass266_5.method5989();
		this.aClass266_5.method5983(1);
		super.aClass14_Sub3_42.method3917(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean600) {
			super.aClass14_Sub3_42.method3976(8448, 8448);
			super.aClass14_Sub3_42.method3966(5890, 0, 768);
			super.aClass14_Sub3_42.method3918(0, 5890);
		} else {
			super.aClass14_Sub3_42.method3976(8448, 8448);
			super.aClass14_Sub3_42.method3966(5890, 0, 768);
			super.aClass14_Sub3_42.method3917(2);
			super.aClass14_Sub3_42.method3976(8448, 8448);
			super.aClass14_Sub3_42.method3966(5890, 0, 768);
			super.aClass14_Sub3_42.method3966(34168, 1, 768);
			super.aClass14_Sub3_42.method3918(0, 5890);
		}
		super.aClass14_Sub3_42.method3917(0);
		this.aClass266_5.method5989();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	@Override
	public void method7474() {
		if (this.aBoolean599) {
			if (!this.aBoolean600) {
				super.aClass14_Sub3_42.method3917(2);
				super.aClass14_Sub3_42.method3985(null);
			}
			super.aClass14_Sub3_42.method3917(1);
			super.aClass14_Sub3_42.method3985(null);
			super.aClass14_Sub3_42.method3917(0);
			this.aClass266_5.method5987('\u0001');
			this.aBoolean599 = false;
		} else {
			super.aClass14_Sub3_42.method3918(0, 5890);
		}
		super.aClass14_Sub3_42.method3976(8448, 8448);
	}
}
