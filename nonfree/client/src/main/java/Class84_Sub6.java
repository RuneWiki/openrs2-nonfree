import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class84_Sub6 extends Class84 {

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "Lclient!bw;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Z")
	private boolean aBoolean382 = false;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "[Lclient!rc;")
	private Class5_Sub4[] aClass5_Sub4Array1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class84_Sub6(@OriginalArg(0) Class128_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean368) {
			this.aBoolean383 = arg0.anInt4625 < 3;
			@Pc(26) int local26 = this.aBoolean383 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(109) float local109;
						if (local91 == 0) {
							local109 = -local85;
						} else if (local91 == 1) {
							local109 = local85;
						} else if (local91 == 2) {
							local109 = local89;
						} else if (local91 == 3) {
							local109 = -local89;
						} else if (local91 == 4) {
							local109 = local81;
						} else {
							local109 = -local81;
						}
						@Pc(147) int local147;
						@Pc(156) int local156;
						@Pc(165) int local165;
						if (local109 > 0.0F) {
							local147 = (int) (Math.pow((double) local109, 96.0D) * (double) local26);
							local156 = (int) (Math.pow((double) local109, 36.0D) * (double) local26);
							local165 = (int) ((double) local26 * Math.pow((double) local109, 12.0D));
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
			this.aClass5_Sub4Array1 = new Class5_Sub4[3];
			this.aClass5_Sub4Array1[0] = new Class5_Sub4(super.aClass128_Sub2_39, 6406, 64, false, local34, 6406);
			this.aClass5_Sub4Array1[1] = new Class5_Sub4(super.aClass128_Sub2_39, 6406, 64, false, local38, 6406);
			this.aClass5_Sub4Array1[2] = new Class5_Sub4(super.aClass128_Sub2_39, 6406, 64, false, local30, 6406);
			this.method3795();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!jk;IB)V")
	@Override
	public void method5152(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		super.aClass128_Sub2_39.method3691(arg0);
		super.aClass128_Sub2_39.method3677(arg1);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	@Override
	public void method5154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean382) {
			super.aClass128_Sub2_39.method3667(1);
			super.aClass128_Sub2_39.method3691(this.aClass5_Sub4Array1[arg1 - 1]);
			super.aClass128_Sub2_39.method3667(0);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		if (this.aClass32_3 == null || !arg0) {
			super.aClass128_Sub2_39.method3626(0, 34168);
			return;
		}
		if (!this.aBoolean383) {
			super.aClass128_Sub2_39.method3667(2);
			super.aClass128_Sub2_39.method3691(super.aClass128_Sub2_39.aClass5_Sub1_4);
			super.aClass128_Sub2_39.method3667(0);
		}
		this.aClass32_3.method651('\u0000');
		this.aBoolean382 = true;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5150(@OriginalArg(0) boolean arg0) {
		super.aClass128_Sub2_39.method3622(7681, 8448);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
	@Override
	public void method5153() {
		if (this.aBoolean382) {
			if (!this.aBoolean383) {
				super.aClass128_Sub2_39.method3667(2);
				super.aClass128_Sub2_39.method3691(null);
			}
			super.aClass128_Sub2_39.method3667(1);
			super.aClass128_Sub2_39.method3691(null);
			super.aClass128_Sub2_39.method3667(0);
			this.aClass32_3.method651('\u0001');
			this.aBoolean382 = false;
		} else {
			super.aClass128_Sub2_39.method3626(0, 5890);
		}
		super.aClass128_Sub2_39.method3622(8448, 8448);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5155() {
		return true;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	private void method3795() {
		this.aClass32_3 = new Class32(super.aClass128_Sub2_39, 2);
		this.aClass32_3.method657(0);
		super.aClass128_Sub2_39.method3667(1);
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
		if (this.aBoolean383) {
			super.aClass128_Sub2_39.method3622(7681, 260);
			super.aClass128_Sub2_39.method3647(5890, 770, 0);
			super.aClass128_Sub2_39.method3626(0, 34167);
		} else {
			super.aClass128_Sub2_39.method3622(8448, 7681);
			super.aClass128_Sub2_39.method3647(34168, 768, 0);
			super.aClass128_Sub2_39.method3667(2);
			super.aClass128_Sub2_39.method3622(7681, 260);
			super.aClass128_Sub2_39.method3647(34168, 768, 0);
			super.aClass128_Sub2_39.method3647(34168, 770, 1);
			super.aClass128_Sub2_39.method3626(0, 34167);
		}
		super.aClass128_Sub2_39.method3667(0);
		this.aClass32_3.method658();
		this.aClass32_3.method657(1);
		super.aClass128_Sub2_39.method3667(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean383) {
			super.aClass128_Sub2_39.method3622(8448, 8448);
			super.aClass128_Sub2_39.method3647(5890, 768, 0);
			super.aClass128_Sub2_39.method3626(0, 5890);
		} else {
			super.aClass128_Sub2_39.method3622(8448, 8448);
			super.aClass128_Sub2_39.method3647(5890, 768, 0);
			super.aClass128_Sub2_39.method3667(2);
			super.aClass128_Sub2_39.method3622(8448, 8448);
			super.aClass128_Sub2_39.method3647(5890, 768, 0);
			super.aClass128_Sub2_39.method3647(34168, 768, 1);
			super.aClass128_Sub2_39.method3626(0, 5890);
		}
		super.aClass128_Sub2_39.method3667(0);
		this.aClass32_3.method658();
	}
}
