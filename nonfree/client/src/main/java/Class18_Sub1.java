import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "Lclient!rj;")
	private Class303 aClass303_1;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "Z")
	private boolean aBoolean41;

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "[Lclient!rh;")
	private Class65_Sub4[] aClass65_Sub4Array1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class18_Sub1(@OriginalArg(0) Class95_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean183) {
			this.aBoolean41 = arg0.anInt2549 < 3;
			@Pc(28) int local28 = this.aBoolean41 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(103) float local103;
						if (local93 == 0) {
							local103 = -local87;
						} else if (local93 == 1) {
							local103 = local87;
						} else if (local93 == 2) {
							local103 = local91;
						} else if (local93 == 3) {
							local103 = -local91;
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
							local165 = (int) (Math.pow((double) local103, 36.0D) * (double) local28);
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
			this.aClass65_Sub4Array1 = new Class65_Sub4[3];
			this.aClass65_Sub4Array1[0] = new Class65_Sub4(super.aClass95_Sub1_39, 6406, 64, false, local36, 6406);
			this.aClass65_Sub4Array1[1] = new Class65_Sub4(super.aClass95_Sub1_39, 6406, 64, false, local40, 6406);
			this.aClass65_Sub4Array1[2] = new Class65_Sub4(super.aClass95_Sub1_39, 6406, 64, false, local32, 6406);
			this.method448();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7544() {
		return true;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean42) {
			super.aClass95_Sub1_39.method2098(1);
			super.aClass95_Sub1_39.method2077(this.aClass65_Sub4Array1[arg0 - 1]);
			super.aClass95_Sub1_39.method2098(0);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZLclient!hl;)V")
	@Override
	public void method7546(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		super.aClass95_Sub1_39.method2077(arg1);
		super.aClass95_Sub1_39.method2106(arg0);
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
	private void method448() {
		this.aClass303_1 = new Class303(super.aClass95_Sub1_39, 2);
		this.aClass303_1.method6859(0);
		super.aClass95_Sub1_39.method2098(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, (float) 0);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean41) {
			super.aClass95_Sub1_39.method2105(260, 7681);
			super.aClass95_Sub1_39.method2101(770, 5890, 0);
			super.aClass95_Sub1_39.method2095(0, 34167);
		} else {
			super.aClass95_Sub1_39.method2105(7681, 8448);
			super.aClass95_Sub1_39.method2101(768, 34168, 0);
			super.aClass95_Sub1_39.method2098(2);
			super.aClass95_Sub1_39.method2105(260, 7681);
			super.aClass95_Sub1_39.method2101(768, 34168, 0);
			super.aClass95_Sub1_39.method2101(770, 34168, 1);
			super.aClass95_Sub1_39.method2095(0, 34167);
		}
		super.aClass95_Sub1_39.method2098(0);
		this.aClass303_1.method6857();
		this.aClass303_1.method6859(1);
		super.aClass95_Sub1_39.method2098(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean41) {
			super.aClass95_Sub1_39.method2105(8448, 8448);
			super.aClass95_Sub1_39.method2101(768, 5890, 0);
			super.aClass95_Sub1_39.method2095(0, 5890);
		} else {
			super.aClass95_Sub1_39.method2105(8448, 8448);
			super.aClass95_Sub1_39.method2101(768, 5890, 0);
			super.aClass95_Sub1_39.method2098(2);
			super.aClass95_Sub1_39.method2105(8448, 8448);
			super.aClass95_Sub1_39.method2101(768, 5890, 0);
			super.aClass95_Sub1_39.method2101(768, 34168, 1);
			super.aClass95_Sub1_39.method2095(0, 5890);
		}
		super.aClass95_Sub1_39.method2098(0);
		this.aClass303_1.method6857();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7552(@OriginalArg(0) boolean arg0) {
		super.aClass95_Sub1_39.method2105(8448, 7681);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7550(@OriginalArg(1) boolean arg0) {
		if (this.aClass303_1 == null || !arg0) {
			super.aClass95_Sub1_39.method2095(0, 34168);
			return;
		}
		if (!this.aBoolean41) {
			super.aClass95_Sub1_39.method2098(2);
			super.aClass95_Sub1_39.method2077(super.aClass95_Sub1_39.aClass65_Sub1_1);
			super.aClass95_Sub1_39.method2098(0);
		}
		this.aClass303_1.method6856('\u0000');
		this.aBoolean42 = true;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
	@Override
	public void method7551() {
		if (this.aBoolean42) {
			if (!this.aBoolean41) {
				super.aClass95_Sub1_39.method2098(2);
				super.aClass95_Sub1_39.method2077(null);
			}
			super.aClass95_Sub1_39.method2098(1);
			super.aClass95_Sub1_39.method2077(null);
			super.aClass95_Sub1_39.method2098(0);
			this.aClass303_1.method6856('\u0001');
			this.aBoolean42 = false;
		} else {
			super.aClass95_Sub1_39.method2095(0, 5890);
		}
		super.aClass95_Sub1_39.method2105(8448, 8448);
	}
}
