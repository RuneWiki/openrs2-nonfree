import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!dca", name = "r", descriptor = "Lclient!cga;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!dca", name = "w", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!dca", name = "s", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "client!dca", name = "q", descriptor = "[Lclient!bja;")
	private Class39_Sub1[] aClass39_Sub1Array1;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class21_Sub2(@OriginalArg(0) Class16_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean334) {
			this.aBoolean181 = arg0.anInt4404 < 3;
			@Pc(26) int local26 = this.aBoolean181 ? 48 : 127;
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
						@Pc(100) float local100;
						if (local91 == 0) {
							local100 = -local85;
						} else if (local91 == 1) {
							local100 = local85;
						} else if (local91 == 2) {
							local100 = local89;
						} else if (local91 == 3) {
							local100 = -local89;
						} else if (local91 == 4) {
							local100 = local81;
						} else {
							local100 = -local81;
						}
						@Pc(147) int local147;
						@Pc(156) int local156;
						@Pc(165) int local165;
						if (local100 > 0.0F) {
							local147 = (int) (Math.pow((double) local100, 96.0D) * (double) local26);
							local156 = (int) ((double) local26 * Math.pow((double) local100, 36.0D));
							local165 = (int) (Math.pow((double) local100, 12.0D) * (double) local26);
						} else {
							local165 = 0;
							local156 = 0;
							local147 = 0;
						}
						local34[local91][local40] = (byte) local147;
						local38[local91][local40] = (byte) local156;
						local30[local91][local40] = (byte) local165;
					}
					local40++;
				}
			}
			this.aClass39_Sub1Array1 = new Class39_Sub1[3];
			this.aClass39_Sub1Array1[0] = new Class39_Sub1(super.aClass16_Sub2_43, 6406, 64, false, local34, 6406);
			this.aClass39_Sub1Array1[1] = new Class39_Sub1(super.aClass16_Sub2_43, 6406, 64, false, local38, 6406);
			this.aClass39_Sub1Array1[2] = new Class39_Sub1(super.aClass16_Sub2_43, 6406, 64, false, local30, 6406);
			this.method1915();
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8697(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub2_43.method3671(8448, 7681);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8692() {
		return true;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Z)V")
	@Override
	public void method8695() {
		if (this.aBoolean182) {
			if (!this.aBoolean181) {
				super.aClass16_Sub2_43.method3683(2);
				super.aClass16_Sub2_43.method3620((Class39) null);
			}
			super.aClass16_Sub2_43.method3683(1);
			super.aClass16_Sub2_43.method3620((Class39) null);
			super.aClass16_Sub2_43.method3683(0);
			this.aClass58_1.method1625('\u0001');
			this.aBoolean182 = false;
		} else {
			super.aClass16_Sub2_43.method3661(0, 5890);
		}
		super.aClass16_Sub2_43.method3671(8448, 8448);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean182) {
			super.aClass16_Sub2_43.method3683(1);
			super.aClass16_Sub2_43.method3620(this.aClass39_Sub1Array1[arg0 - 1]);
			super.aClass16_Sub2_43.method3683(0);
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IBLclient!qk;)V")
	@Override
	public void method8700(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		super.aClass16_Sub2_43.method3620(arg1);
		super.aClass16_Sub2_43.method3680(arg0);
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(Z)V")
	private void method1915() {
		this.aClass58_1 = new Class58(super.aClass16_Sub2_43, 2);
		this.aClass58_1.method1621(0);
		super.aClass16_Sub2_43.method3683(1);
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
		if (this.aBoolean181) {
			super.aClass16_Sub2_43.method3671(260, 7681);
			super.aClass16_Sub2_43.method3669(5890, 0, 770);
			super.aClass16_Sub2_43.method3661(0, 34167);
		} else {
			super.aClass16_Sub2_43.method3671(7681, 8448);
			super.aClass16_Sub2_43.method3669(34168, 0, 768);
			super.aClass16_Sub2_43.method3683(2);
			super.aClass16_Sub2_43.method3671(260, 7681);
			super.aClass16_Sub2_43.method3669(34168, 0, 768);
			super.aClass16_Sub2_43.method3669(34168, 1, 770);
			super.aClass16_Sub2_43.method3661(0, 34167);
		}
		super.aClass16_Sub2_43.method3683(0);
		this.aClass58_1.method1620();
		this.aClass58_1.method1621(1);
		super.aClass16_Sub2_43.method3683(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean181) {
			super.aClass16_Sub2_43.method3671(8448, 8448);
			super.aClass16_Sub2_43.method3669(5890, 0, 768);
			super.aClass16_Sub2_43.method3661(0, 5890);
		} else {
			super.aClass16_Sub2_43.method3671(8448, 8448);
			super.aClass16_Sub2_43.method3669(5890, 0, 768);
			super.aClass16_Sub2_43.method3683(2);
			super.aClass16_Sub2_43.method3671(8448, 8448);
			super.aClass16_Sub2_43.method3669(5890, 0, 768);
			super.aClass16_Sub2_43.method3669(34168, 1, 768);
			super.aClass16_Sub2_43.method3661(0, 5890);
		}
		super.aClass16_Sub2_43.method3683(0);
		this.aClass58_1.method1620();
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8698(@OriginalArg(0) boolean arg0) {
		if (this.aClass58_1 == null || !arg0) {
			super.aClass16_Sub2_43.method3661(0, 34168);
			return;
		}
		if (!this.aBoolean181) {
			super.aClass16_Sub2_43.method3683(2);
			super.aClass16_Sub2_43.method3620(super.aClass16_Sub2_43.aClass39_Sub4_1);
			super.aClass16_Sub2_43.method3683(0);
		}
		this.aClass58_1.method1625('\u0000');
		this.aBoolean182 = true;
	}
}
