import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class43_Sub4 extends Class43 {

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!nda;")
	private Class251 aClass251_4;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Z")
	private boolean aBoolean256;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "[Lclient!mr;")
	private Class245_Sub1[] aClass245_Sub1Array1;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class43_Sub4(@OriginalArg(0) Class67_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean318) {
			this.aBoolean256 = arg0.anInt3887 < 3;
			@Pc(28) int local28 = this.aBoolean256 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(116) float local116;
						if (local93 == 0) {
							local116 = -local91;
						} else if (local93 == 1) {
							local116 = local91;
						} else if (local93 == 2) {
							local116 = local87;
						} else if (local93 == 3) {
							local116 = -local87;
						} else if (local93 == 4) {
							local116 = local83;
						} else {
							local116 = -local83;
						}
						@Pc(164) int local164;
						@Pc(173) int local173;
						@Pc(182) int local182;
						if (local116 > 0.0F) {
							local164 = (int) ((double) local28 * Math.pow((double) local116, 96.0D));
							local173 = (int) ((double) local28 * Math.pow((double) local116, 36.0D));
							local182 = (int) ((double) local28 * Math.pow((double) local116, 12.0D));
						} else {
							local182 = 0;
							local173 = 0;
							local164 = 0;
						}
						local36[local93][local42] = (byte) local164;
						local40[local93][local42] = (byte) local173;
						local32[local93][local42] = (byte) local182;
					}
					local42++;
				}
			}
			this.aClass245_Sub1Array1 = new Class245_Sub1[3];
			this.aClass245_Sub1Array1[0] = new Class245_Sub1(super.aClass67_Sub2_41, 6406, 64, false, local36, 6406);
			this.aClass245_Sub1Array1[1] = new Class245_Sub1(super.aClass67_Sub2_41, 6406, 64, false, local40, 6406);
			this.aClass245_Sub1Array1[2] = new Class245_Sub1(super.aClass67_Sub2_41, 6406, 64, false, local32, 6406);
			this.method2674();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!sga;I)V")
	@Override
	public void method8865(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1) {
		super.aClass67_Sub2_41.method3234(arg1);
		super.aClass67_Sub2_41.method3255(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		if (this.aClass251_4 == null || !arg0) {
			super.aClass67_Sub2_41.method3269(34168, 0);
			return;
		}
		if (!this.aBoolean256) {
			super.aClass67_Sub2_41.method3268(2);
			super.aClass67_Sub2_41.method3234(super.aClass67_Sub2_41.aClass245_Sub2_4);
			super.aClass67_Sub2_41.method3268(0);
		}
		this.aClass251_4.method6186('\u0000');
		this.aBoolean255 = true;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean255) {
			super.aClass67_Sub2_41.method3268(1);
			super.aClass67_Sub2_41.method3234(this.aClass245_Sub1Array1[arg1 - 1]);
			super.aClass67_Sub2_41.method3268(0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	@Override
	public void method8866() {
		if (this.aBoolean255) {
			if (!this.aBoolean256) {
				super.aClass67_Sub2_41.method3268(2);
				super.aClass67_Sub2_41.method3234((Class245) null);
			}
			super.aClass67_Sub2_41.method3268(1);
			super.aClass67_Sub2_41.method3234((Class245) null);
			super.aClass67_Sub2_41.method3268(0);
			this.aClass251_4.method6186('\u0001');
			this.aBoolean255 = false;
		} else {
			super.aClass67_Sub2_41.method3269(5890, 0);
		}
		super.aClass67_Sub2_41.method3271(8448, 8448);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8859() {
		return true;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	private void method2674() {
		this.aClass251_4 = new Class251(super.aClass67_Sub2_41, 2);
		this.aClass251_4.method6187(0);
		super.aClass67_Sub2_41.method3268(1);
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
		if (this.aBoolean256) {
			super.aClass67_Sub2_41.method3271(7681, 260);
			super.aClass67_Sub2_41.method3279(5890, 770, 0);
			super.aClass67_Sub2_41.method3269(34167, 0);
		} else {
			super.aClass67_Sub2_41.method3271(8448, 7681);
			super.aClass67_Sub2_41.method3279(34168, 768, 0);
			super.aClass67_Sub2_41.method3268(2);
			super.aClass67_Sub2_41.method3271(7681, 260);
			super.aClass67_Sub2_41.method3279(34168, 768, 0);
			super.aClass67_Sub2_41.method3279(34168, 770, 1);
			super.aClass67_Sub2_41.method3269(34167, 0);
		}
		super.aClass67_Sub2_41.method3268(0);
		this.aClass251_4.method6183();
		this.aClass251_4.method6187(1);
		super.aClass67_Sub2_41.method3268(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean256) {
			super.aClass67_Sub2_41.method3271(8448, 8448);
			super.aClass67_Sub2_41.method3279(5890, 768, 0);
			super.aClass67_Sub2_41.method3269(5890, 0);
		} else {
			super.aClass67_Sub2_41.method3271(8448, 8448);
			super.aClass67_Sub2_41.method3279(5890, 768, 0);
			super.aClass67_Sub2_41.method3268(2);
			super.aClass67_Sub2_41.method3271(8448, 8448);
			super.aClass67_Sub2_41.method3279(5890, 768, 0);
			super.aClass67_Sub2_41.method3279(34168, 768, 1);
			super.aClass67_Sub2_41.method3269(5890, 0);
		}
		super.aClass67_Sub2_41.method3268(0);
		this.aClass251_4.method6183();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8858(@OriginalArg(1) boolean arg0) {
		super.aClass67_Sub2_41.method3271(7681, 8448);
	}
}
