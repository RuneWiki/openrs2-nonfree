import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class46_Sub6 extends Class46 {

	@OriginalMember(owner = "client!id", name = "s", descriptor = "Lclient!eaa;")
	private Class79 aClass79_3;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Z")
	private boolean aBoolean297 = false;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Z")
	private boolean aBoolean296;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "[Lclient!fca;")
	private Class24_Sub3[] aClass24_Sub3Array1;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class46_Sub6(@OriginalArg(0) Class45_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean691) {
			this.aBoolean296 = arg0.anInt9072 < 3;
			@Pc(26) int local26 = this.aBoolean296 ? 48 : 127;
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
						@Pc(105) float local105;
						if (local91 == 0) {
							local105 = -local89;
						} else if (local91 == 1) {
							local105 = local89;
						} else if (local91 == 2) {
							local105 = local85;
						} else if (local91 == 3) {
							local105 = -local85;
						} else if (local91 == 4) {
							local105 = local81;
						} else {
							local105 = -local81;
						}
						@Pc(152) int local152;
						@Pc(161) int local161;
						@Pc(170) int local170;
						if (local105 > 0.0F) {
							local152 = (int) ((double) local26 * Math.pow((double) local105, 96.0D));
							local161 = (int) (Math.pow((double) local105, 36.0D) * (double) local26);
							local170 = (int) ((double) local26 * Math.pow((double) local105, 12.0D));
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
			this.aClass24_Sub3Array1 = new Class24_Sub3[3];
			this.aClass24_Sub3Array1[0] = new Class24_Sub3(super.aClass45_Sub3_40, 6406, 64, false, local34, 6406);
			this.aClass24_Sub3Array1[1] = new Class24_Sub3(super.aClass45_Sub3_40, 6406, 64, false, local38, 6406);
			this.aClass24_Sub3Array1[2] = new Class24_Sub3(super.aClass45_Sub3_40, 6406, 64, false, local30, 6406);
			this.method3496();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
		super.aClass45_Sub3_40.method7491(8448, 7681);
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	@Override
	public void method7205() {
		if (this.aBoolean297) {
			if (!this.aBoolean296) {
				super.aClass45_Sub3_40.method7510(2);
				super.aClass45_Sub3_40.method7475(null);
			}
			super.aClass45_Sub3_40.method7510(1);
			super.aClass45_Sub3_40.method7475(null);
			super.aClass45_Sub3_40.method7510(0);
			this.aClass79_3.method1924('\u0001');
			this.aBoolean297 = false;
		} else {
			super.aClass45_Sub3_40.method7450(0, 5890);
		}
		super.aClass45_Sub3_40.method7491(8448, 8448);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7200(@OriginalArg(1) boolean arg0) {
		if (this.aClass79_3 == null || !arg0) {
			super.aClass45_Sub3_40.method7450(0, 34168);
			return;
		}
		if (!this.aBoolean296) {
			super.aClass45_Sub3_40.method7510(2);
			super.aClass45_Sub3_40.method7475(super.aClass45_Sub3_40.aClass24_Sub1_6);
			super.aClass45_Sub3_40.method7510(0);
		}
		this.aClass79_3.method1924('\u0000');
		this.aBoolean297 = true;
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
	private void method3496() {
		this.aClass79_3 = new Class79(super.aClass45_Sub3_40, 2);
		this.aClass79_3.method1921(0);
		super.aClass45_Sub3_40.method7510(1);
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
		if (this.aBoolean296) {
			super.aClass45_Sub3_40.method7491(260, 7681);
			super.aClass45_Sub3_40.method7507(770, 5890, 0);
			super.aClass45_Sub3_40.method7450(0, 34167);
		} else {
			super.aClass45_Sub3_40.method7491(7681, 8448);
			super.aClass45_Sub3_40.method7507(768, 34168, 0);
			super.aClass45_Sub3_40.method7510(2);
			super.aClass45_Sub3_40.method7491(260, 7681);
			super.aClass45_Sub3_40.method7507(768, 34168, 0);
			super.aClass45_Sub3_40.method7507(770, 34168, 1);
			super.aClass45_Sub3_40.method7450(0, 34167);
		}
		super.aClass45_Sub3_40.method7510(0);
		this.aClass79_3.method1925();
		this.aClass79_3.method1921(1);
		super.aClass45_Sub3_40.method7510(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean296) {
			super.aClass45_Sub3_40.method7491(8448, 8448);
			super.aClass45_Sub3_40.method7507(768, 5890, 0);
			super.aClass45_Sub3_40.method7450(0, 5890);
		} else {
			super.aClass45_Sub3_40.method7491(8448, 8448);
			super.aClass45_Sub3_40.method7507(768, 5890, 0);
			super.aClass45_Sub3_40.method7510(2);
			super.aClass45_Sub3_40.method7491(8448, 8448);
			super.aClass45_Sub3_40.method7507(768, 5890, 0);
			super.aClass45_Sub3_40.method7507(768, 34168, 1);
			super.aClass45_Sub3_40.method7450(0, 5890);
		}
		super.aClass45_Sub3_40.method7510(0);
		this.aClass79_3.method1925();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!av;)V")
	@Override
	public void method7208(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		super.aClass45_Sub3_40.method7475(arg1);
		super.aClass45_Sub3_40.method7500(arg0);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7207() {
		return true;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	@Override
	public void method7202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean297) {
			super.aClass45_Sub3_40.method7510(1);
			super.aClass45_Sub3_40.method7475(this.aClass24_Sub3Array1[arg1 - 1]);
			super.aClass45_Sub3_40.method7510(0);
		}
	}
}
