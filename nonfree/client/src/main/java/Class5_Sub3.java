import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "Lclient!kq;")
	private Class144 aClass144_1;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "Z")
	private boolean aBoolean133;

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "[Lclient!sl;")
	private Class40_Sub4[] aClass40_Sub4Array1;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class5_Sub3(@OriginalArg(0) Class28_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean65) {
			this.aBoolean133 = arg0.anInt760 < 3;
			@Pc(28) int local28 = this.aBoolean133 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(102) float local102;
						if (local93 == 0) {
							local102 = -local91;
						} else if (local93 == 1) {
							local102 = local91;
						} else if (local93 == 2) {
							local102 = local87;
						} else if (local93 == 3) {
							local102 = -local87;
						} else if (local93 == 4) {
							local102 = local83;
						} else {
							local102 = -local83;
						}
						@Pc(146) int local146;
						@Pc(145) int local145;
						@Pc(143) int local143;
						if (local102 > 0.0F) {
							local146 = (int) (Math.pow((double) local102, 96.0D) * (double) local28);
							local145 = (int) ((double) local28 * Math.pow((double) local102, 36.0D));
							local143 = (int) (Math.pow((double) local102, 12.0D) * (double) local28);
						} else {
							local143 = 0;
							local145 = 0;
							local146 = 0;
						}
						local36[local93][local42] = (byte) local146;
						local40[local93][local42] = (byte) local145;
						local32[local93][local42] = (byte) local143;
					}
					local42++;
				}
			}
			this.aClass40_Sub4Array1 = new Class40_Sub4[3];
			this.aClass40_Sub4Array1[0] = new Class40_Sub4(super.aClass28_Sub1_42, 6406, 64, false, local36, 6406);
			this.aClass40_Sub4Array1[1] = new Class40_Sub4(super.aClass28_Sub1_42, 6406, 64, false, local40, 6406);
			this.aClass40_Sub4Array1[2] = new Class40_Sub4(super.aClass28_Sub1_42, 6406, 64, false, local32, 6406);
			this.method1458();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5928() {
		return true;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
	@Override
	public void method5922() {
		if (this.aBoolean134) {
			if (!this.aBoolean133) {
				super.aClass28_Sub1_42.method650(2);
				super.aClass28_Sub1_42.method654(null);
			}
			super.aClass28_Sub1_42.method650(1);
			super.aClass28_Sub1_42.method654(null);
			super.aClass28_Sub1_42.method650(0);
			this.aClass144_1.method3285('\u0001');
			this.aBoolean134 = false;
		} else {
			super.aClass28_Sub1_42.method643(5890, 0);
		}
		super.aClass28_Sub1_42.method692(8448, 8448);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!ce;IZ)V")
	@Override
	public void method5927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		super.aClass28_Sub1_42.method654(arg0);
		super.aClass28_Sub1_42.method678(arg1);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
	@Override
	public void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean134) {
			super.aClass28_Sub1_42.method650(1);
			super.aClass28_Sub1_42.method654(this.aClass40_Sub4Array1[arg0 - 1]);
			super.aClass28_Sub1_42.method650(0);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5925(@OriginalArg(0) boolean arg0) {
		if (this.aClass144_1 == null || !arg0) {
			super.aClass28_Sub1_42.method643(34168, 0);
			return;
		}
		if (!this.aBoolean133) {
			super.aClass28_Sub1_42.method650(2);
			super.aClass28_Sub1_42.method654(super.aClass28_Sub1_42.aClass40_Sub3_1);
			super.aClass28_Sub1_42.method650(0);
		}
		this.aClass144_1.method3285('\u0000');
		this.aBoolean134 = true;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5926(@OriginalArg(1) boolean arg0) {
		super.aClass28_Sub1_42.method692(7681, 8448);
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)V")
	private void method1458() {
		this.aClass144_1 = new Class144(super.aClass28_Sub1_42, 2);
		this.aClass144_1.method3283(0);
		super.aClass28_Sub1_42.method650(1);
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
		if (this.aBoolean133) {
			super.aClass28_Sub1_42.method692(7681, 260);
			super.aClass28_Sub1_42.method665(5890, 770, 0);
			super.aClass28_Sub1_42.method643(34167, 0);
		} else {
			super.aClass28_Sub1_42.method692(8448, 7681);
			super.aClass28_Sub1_42.method665(34168, 768, 0);
			super.aClass28_Sub1_42.method650(2);
			super.aClass28_Sub1_42.method692(7681, 260);
			super.aClass28_Sub1_42.method665(34168, 768, 0);
			super.aClass28_Sub1_42.method665(34168, 770, 1);
			super.aClass28_Sub1_42.method643(34167, 0);
		}
		super.aClass28_Sub1_42.method650(0);
		this.aClass144_1.method3284();
		this.aClass144_1.method3283(1);
		super.aClass28_Sub1_42.method650(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean133) {
			super.aClass28_Sub1_42.method692(8448, 8448);
			super.aClass28_Sub1_42.method665(5890, 768, 0);
			super.aClass28_Sub1_42.method643(5890, 0);
		} else {
			super.aClass28_Sub1_42.method692(8448, 8448);
			super.aClass28_Sub1_42.method665(5890, 768, 0);
			super.aClass28_Sub1_42.method650(2);
			super.aClass28_Sub1_42.method692(8448, 8448);
			super.aClass28_Sub1_42.method665(5890, 768, 0);
			super.aClass28_Sub1_42.method665(34168, 768, 1);
			super.aClass28_Sub1_42.method643(5890, 0);
		}
		super.aClass28_Sub1_42.method650(0);
		this.aClass144_1.method3284();
	}
}
