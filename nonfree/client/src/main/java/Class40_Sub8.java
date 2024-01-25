import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class40_Sub8 extends Class40 {

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!kp;")
	private Class150 aClass150_5;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Z")
	private boolean aBoolean411 = false;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Z")
	private boolean aBoolean412;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[Lclient!ea;")
	private Class64_Sub1[] aClass64_Sub1Array1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class40_Sub8(@OriginalArg(0) Class75_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean337) {
			this.aBoolean412 = arg0.anInt4883 < 3;
			@Pc(26) int local26 = this.aBoolean412 ? 48 : 127;
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
						@Pc(105) float local105;
						if (local91 == 0) {
							local105 = -local85;
						} else if (local91 == 1) {
							local105 = local85;
						} else if (local91 == 2) {
							local105 = local89;
						} else if (local91 == 3) {
							local105 = -local89;
						} else if (local91 == 4) {
							local105 = local81;
						} else {
							local105 = -local81;
						}
						@Pc(144) int local144;
						@Pc(143) int local143;
						@Pc(141) int local141;
						if (local105 > 0.0F) {
							local144 = (int) (Math.pow((double) local105, 96.0D) * (double) local26);
							local143 = (int) (Math.pow((double) local105, 36.0D) * (double) local26);
							local141 = (int) ((double) local26 * Math.pow((double) local105, 12.0D));
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
			this.aClass64_Sub1Array1 = new Class64_Sub1[3];
			this.aClass64_Sub1Array1[0] = new Class64_Sub1(super.aClass75_Sub2_41, 6406, 64, false, local34, 6406);
			this.aClass64_Sub1Array1[1] = new Class64_Sub1(super.aClass75_Sub2_41, 6406, 64, false, local38, 6406);
			this.aClass64_Sub1Array1[2] = new Class64_Sub1(super.aClass75_Sub2_41, 6406, 64, false, local30, 6406);
			this.method4669();
		}
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
	private void method4669() {
		this.aClass150_5 = new Class150(super.aClass75_Sub2_41, 2);
		this.aClass150_5.method3069(0);
		super.aClass75_Sub2_41.method3811(1);
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
		if (this.aBoolean412) {
			super.aClass75_Sub2_41.method3872(7681, 260);
			super.aClass75_Sub2_41.method3802(0, 5890, 770);
			super.aClass75_Sub2_41.method3843(0, 34167);
		} else {
			super.aClass75_Sub2_41.method3872(8448, 7681);
			super.aClass75_Sub2_41.method3802(0, 34168, 768);
			super.aClass75_Sub2_41.method3811(2);
			super.aClass75_Sub2_41.method3872(7681, 260);
			super.aClass75_Sub2_41.method3802(0, 34168, 768);
			super.aClass75_Sub2_41.method3802(1, 34168, 770);
			super.aClass75_Sub2_41.method3843(0, 34167);
		}
		super.aClass75_Sub2_41.method3811(0);
		this.aClass150_5.method3066();
		this.aClass150_5.method3069(1);
		super.aClass75_Sub2_41.method3811(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean412) {
			super.aClass75_Sub2_41.method3872(8448, 8448);
			super.aClass75_Sub2_41.method3802(0, 5890, 768);
			super.aClass75_Sub2_41.method3843(0, 5890);
		} else {
			super.aClass75_Sub2_41.method3872(8448, 8448);
			super.aClass75_Sub2_41.method3802(0, 5890, 768);
			super.aClass75_Sub2_41.method3811(2);
			super.aClass75_Sub2_41.method3872(8448, 8448);
			super.aClass75_Sub2_41.method3802(0, 5890, 768);
			super.aClass75_Sub2_41.method3802(1, 34168, 768);
			super.aClass75_Sub2_41.method3843(0, 5890);
		}
		super.aClass75_Sub2_41.method3811(0);
		this.aClass150_5.method3066();
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(ZB)V")
	@Override
	public void method5758(@OriginalArg(0) boolean arg0) {
		if (this.aClass150_5 == null || !arg0) {
			super.aClass75_Sub2_41.method3843(0, 34168);
			return;
		}
		if (!this.aBoolean412) {
			super.aClass75_Sub2_41.method3811(2);
			super.aClass75_Sub2_41.method3844(super.aClass75_Sub2_41.aClass64_Sub4_4);
			super.aClass75_Sub2_41.method3811(0);
		}
		this.aClass150_5.method3067('\u0000');
		this.aBoolean411 = true;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5755(@OriginalArg(0) boolean arg0) {
		super.aClass75_Sub2_41.method3872(7681, 8448);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean411) {
			super.aClass75_Sub2_41.method3811(1);
			super.aClass75_Sub2_41.method3844(this.aClass64_Sub1Array1[arg1 - 1]);
			super.aClass75_Sub2_41.method3811(0);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!ed;)V")
	@Override
	public void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		super.aClass75_Sub2_41.method3844(arg1);
		super.aClass75_Sub2_41.method3798(arg0);
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	@Override
	public void method5757() {
		if (this.aBoolean411) {
			if (!this.aBoolean412) {
				super.aClass75_Sub2_41.method3811(2);
				super.aClass75_Sub2_41.method3844(null);
			}
			super.aClass75_Sub2_41.method3811(1);
			super.aClass75_Sub2_41.method3844(null);
			super.aClass75_Sub2_41.method3811(0);
			this.aClass150_5.method3067('\u0001');
			this.aBoolean411 = false;
		} else {
			super.aClass75_Sub2_41.method3843(0, 5890);
		}
		super.aClass75_Sub2_41.method3872(8448, 8448);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5753() {
		return true;
	}
}
