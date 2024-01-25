import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class16_Sub7 extends Class16 {

	@OriginalMember(owner = "client!or", name = "m", descriptor = "Lclient!gw;")
	private Class94 aClass94_3;

	@OriginalMember(owner = "client!or", name = "k", descriptor = "Z")
	private boolean aBoolean332 = false;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "Z")
	private boolean aBoolean333;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "[Lclient!rh;")
	private Class31_Sub4[] aClass31_Sub4Array1;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class16_Sub7(@OriginalArg(0) Class200_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean443) {
			this.aBoolean333 = arg0.anInt6744 < 3;
			@Pc(28) int local28 = this.aBoolean333 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(104) float local104;
						if (local93 == 0) {
							local104 = -local91;
						} else if (local93 == 1) {
							local104 = local91;
						} else if (local93 == 2) {
							local104 = local87;
						} else if (local93 == 3) {
							local104 = -local87;
						} else if (local93 == 4) {
							local104 = local83;
						} else {
							local104 = -local83;
						}
						@Pc(146) int local146;
						@Pc(145) int local145;
						@Pc(143) int local143;
						if (local104 > 0.0F) {
							local146 = (int) ((double) local28 * Math.pow((double) local104, 96.0D));
							local145 = (int) (Math.pow((double) local104, 36.0D) * (double) local28);
							local143 = (int) (Math.pow((double) local104, 12.0D) * (double) local28);
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
			this.aClass31_Sub4Array1 = new Class31_Sub4[3];
			this.aClass31_Sub4Array1[0] = new Class31_Sub4(super.aClass200_Sub2_36, 6406, 64, false, local36, 6406);
			this.aClass31_Sub4Array1[1] = new Class31_Sub4(super.aClass200_Sub2_36, 6406, 64, false, local40, 6406);
			this.aClass31_Sub4Array1[2] = new Class31_Sub4(super.aClass200_Sub2_36, 6406, 64, false, local32, 6406);
			this.method3810();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BILclient!in;)V")
	@Override
	public void method5150(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
		super.aClass200_Sub2_36.method5312(arg1);
		super.aClass200_Sub2_36.method5297(arg0);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	private void method3810() {
		this.aClass94_3 = new Class94(super.aClass200_Sub2_36, 2);
		this.aClass94_3.method2130(0);
		super.aClass200_Sub2_36.method5319(1);
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
		if (this.aBoolean333) {
			super.aClass200_Sub2_36.method5304(260, 7681);
			super.aClass200_Sub2_36.method5343(770, 5890, 0);
			super.aClass200_Sub2_36.method5341(34167, 0);
		} else {
			super.aClass200_Sub2_36.method5304(7681, 8448);
			super.aClass200_Sub2_36.method5343(768, 34168, 0);
			super.aClass200_Sub2_36.method5319(2);
			super.aClass200_Sub2_36.method5304(260, 7681);
			super.aClass200_Sub2_36.method5343(768, 34168, 0);
			super.aClass200_Sub2_36.method5343(770, 34168, 1);
			super.aClass200_Sub2_36.method5341(34167, 0);
		}
		super.aClass200_Sub2_36.method5319(0);
		this.aClass94_3.method2133();
		this.aClass94_3.method2130(1);
		super.aClass200_Sub2_36.method5319(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean333) {
			super.aClass200_Sub2_36.method5304(8448, 8448);
			super.aClass200_Sub2_36.method5343(768, 5890, 0);
			super.aClass200_Sub2_36.method5341(5890, 0);
		} else {
			super.aClass200_Sub2_36.method5304(8448, 8448);
			super.aClass200_Sub2_36.method5343(768, 5890, 0);
			super.aClass200_Sub2_36.method5319(2);
			super.aClass200_Sub2_36.method5304(8448, 8448);
			super.aClass200_Sub2_36.method5343(768, 5890, 0);
			super.aClass200_Sub2_36.method5343(768, 34168, 1);
			super.aClass200_Sub2_36.method5341(5890, 0);
		}
		super.aClass200_Sub2_36.method5319(0);
		this.aClass94_3.method2133();
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5154() {
		return true;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5157(@OriginalArg(1) boolean arg0) {
		super.aClass200_Sub2_36.method5304(8448, 7681);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean332) {
			super.aClass200_Sub2_36.method5319(1);
			super.aClass200_Sub2_36.method5312(this.aClass31_Sub4Array1[arg1 - 1]);
			super.aClass200_Sub2_36.method5319(0);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	@Override
	public void method5148() {
		if (this.aBoolean332) {
			if (!this.aBoolean333) {
				super.aClass200_Sub2_36.method5319(2);
				super.aClass200_Sub2_36.method5312(null);
			}
			super.aClass200_Sub2_36.method5319(1);
			super.aClass200_Sub2_36.method5312(null);
			super.aClass200_Sub2_36.method5319(0);
			this.aClass94_3.method2132('\u0001');
			this.aBoolean332 = false;
		} else {
			super.aClass200_Sub2_36.method5341(5890, 0);
		}
		super.aClass200_Sub2_36.method5304(8448, 8448);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		if (this.aClass94_3 == null || !arg0) {
			super.aClass200_Sub2_36.method5341(34168, 0);
			return;
		}
		if (!this.aBoolean333) {
			super.aClass200_Sub2_36.method5319(2);
			super.aClass200_Sub2_36.method5312(super.aClass200_Sub2_36.aClass31_Sub1_3);
			super.aClass200_Sub2_36.method5319(0);
		}
		this.aClass94_3.method2132('\u0000');
		this.aBoolean332 = true;
	}
}
