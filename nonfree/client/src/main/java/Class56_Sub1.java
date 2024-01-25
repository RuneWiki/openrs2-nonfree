import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "Lclient!wu;")
	private Class269 aClass269_1;

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!dp", name = "w", descriptor = "Z")
	private boolean aBoolean73;

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "[Lclient!il;")
	private Class13_Sub4[] aClass13_Sub4Array1;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class56_Sub1(@OriginalArg(0) Class109_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean164) {
			this.aBoolean73 = arg0.anInt2983 < 3;
			@Pc(28) int local28 = this.aBoolean73 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(117) float local117;
						if (local93 == 0) {
							local117 = -local87;
						} else if (local93 == 1) {
							local117 = local87;
						} else if (local93 == 2) {
							local117 = local91;
						} else if (local93 == 3) {
							local117 = -local91;
						} else if (local93 == 4) {
							local117 = local83;
						} else {
							local117 = -local83;
						}
						@Pc(152) int local152;
						@Pc(161) int local161;
						@Pc(170) int local170;
						if (local117 > 0.0F) {
							local152 = (int) ((double) local28 * Math.pow((double) local117, 96.0D));
							local161 = (int) ((double) local28 * Math.pow((double) local117, 36.0D));
							local170 = (int) ((double) local28 * Math.pow((double) local117, 12.0D));
						} else {
							local170 = 0;
							local161 = 0;
							local152 = 0;
						}
						local36[local93][local42] = (byte) local152;
						local40[local93][local42] = (byte) local161;
						local32[local93][local42] = (byte) local170;
					}
					local42++;
				}
			}
			this.aClass13_Sub4Array1 = new Class13_Sub4[3];
			this.aClass13_Sub4Array1[0] = new Class13_Sub4(super.aClass109_Sub1_41, 6406, 64, false, local36, 6406);
			this.aClass13_Sub4Array1[1] = new Class13_Sub4(super.aClass109_Sub1_41, 6406, 64, false, local40, 6406);
			this.aClass13_Sub4Array1[2] = new Class13_Sub4(super.aClass109_Sub1_41, 6406, 64, false, local32, 6406);
			this.method1284();
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(III)V")
	@Override
	public void method5083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean72) {
			super.aClass109_Sub1_41.method2564(1);
			super.aClass109_Sub1_41.method2578(this.aClass13_Sub4Array1[arg0 - 1]);
			super.aClass109_Sub1_41.method2564(0);
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5085() {
		return true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V")
	private void method1284() {
		this.aClass269_1 = new Class269(super.aClass109_Sub1_41, 2);
		this.aClass269_1.method6086(0);
		super.aClass109_Sub1_41.method2564(1);
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
		if (this.aBoolean73) {
			super.aClass109_Sub1_41.method2549(260, 7681);
			super.aClass109_Sub1_41.method2528(5890, 770, 0);
			super.aClass109_Sub1_41.method2545(34167, 0);
		} else {
			super.aClass109_Sub1_41.method2549(7681, 8448);
			super.aClass109_Sub1_41.method2528(34168, 768, 0);
			super.aClass109_Sub1_41.method2564(2);
			super.aClass109_Sub1_41.method2549(260, 7681);
			super.aClass109_Sub1_41.method2528(34168, 768, 0);
			super.aClass109_Sub1_41.method2528(34168, 770, 1);
			super.aClass109_Sub1_41.method2545(34167, 0);
		}
		super.aClass109_Sub1_41.method2564(0);
		this.aClass269_1.method6090();
		this.aClass269_1.method6086(1);
		super.aClass109_Sub1_41.method2564(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean73) {
			super.aClass109_Sub1_41.method2549(8448, 8448);
			super.aClass109_Sub1_41.method2528(5890, 768, 0);
			super.aClass109_Sub1_41.method2545(5890, 0);
		} else {
			super.aClass109_Sub1_41.method2549(8448, 8448);
			super.aClass109_Sub1_41.method2528(5890, 768, 0);
			super.aClass109_Sub1_41.method2564(2);
			super.aClass109_Sub1_41.method2549(8448, 8448);
			super.aClass109_Sub1_41.method2528(5890, 768, 0);
			super.aClass109_Sub1_41.method2528(34168, 768, 1);
			super.aClass109_Sub1_41.method2545(5890, 0);
		}
		super.aClass109_Sub1_41.method2564(0);
		this.aClass269_1.method6090();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5079(@OriginalArg(0) boolean arg0) {
		super.aClass109_Sub1_41.method2549(8448, 7681);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	@Override
	public void method5084() {
		if (this.aBoolean72) {
			if (!this.aBoolean73) {
				super.aClass109_Sub1_41.method2564(2);
				super.aClass109_Sub1_41.method2578(null);
			}
			super.aClass109_Sub1_41.method2564(1);
			super.aClass109_Sub1_41.method2578(null);
			super.aClass109_Sub1_41.method2564(0);
			this.aClass269_1.method6088('\u0001');
			this.aBoolean72 = false;
		} else {
			super.aClass109_Sub1_41.method2545(5890, 0);
		}
		super.aClass109_Sub1_41.method2549(8448, 8448);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5087(@OriginalArg(1) boolean arg0) {
		if (this.aClass269_1 == null || !arg0) {
			super.aClass109_Sub1_41.method2545(34168, 0);
			return;
		}
		if (!this.aBoolean73) {
			super.aClass109_Sub1_41.method2564(2);
			super.aClass109_Sub1_41.method2578(super.aClass109_Sub1_41.aClass13_Sub1_4);
			super.aClass109_Sub1_41.method2564(0);
		}
		this.aClass269_1.method6088('\u0000');
		this.aBoolean72 = true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILclient!ao;)V")
	@Override
	public void method5086(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
		super.aClass109_Sub1_41.method2578(arg1);
		super.aClass109_Sub1_41.method2531(arg0);
	}
}
