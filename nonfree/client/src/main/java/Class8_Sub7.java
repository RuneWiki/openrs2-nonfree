import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class8_Sub7 extends Class8 {

	@OriginalMember(owner = "client!p", name = "v", descriptor = "Lclient!ml;")
	private Class204 aClass204_5;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Z")
	private boolean aBoolean485 = false;

	@OriginalMember(owner = "client!p", name = "u", descriptor = "Z")
	private boolean aBoolean486;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "[Lclient!wg;")
	private Class16_Sub4[] aClass16_Sub4Array1;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class8_Sub7(@OriginalArg(0) Class90_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean165) {
			this.aBoolean486 = arg0.anInt2468 < 3;
			@Pc(28) int local28 = this.aBoolean486 ? 48 : 127;
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
						@Pc(115) float local115;
						if (local93 == 0) {
							local115 = -local91;
						} else if (local93 == 1) {
							local115 = local91;
						} else if (local93 == 2) {
							local115 = local87;
						} else if (local93 == 3) {
							local115 = -local87;
						} else if (local93 == 4) {
							local115 = local83;
						} else {
							local115 = -local83;
						}
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local115 > 0.0F) {
							local148 = (int) ((double) local28 * Math.pow((double) local115, 96.0D));
							local147 = (int) (Math.pow((double) local115, 36.0D) * (double) local28);
							local145 = (int) ((double) local28 * Math.pow((double) local115, 12.0D));
						} else {
							local145 = 0;
							local147 = 0;
							local148 = 0;
						}
						local36[local93][local42] = (byte) local148;
						local40[local93][local42] = (byte) local147;
						local32[local93][local42] = (byte) local145;
					}
					local42++;
				}
			}
			this.aClass16_Sub4Array1 = new Class16_Sub4[3];
			this.aClass16_Sub4Array1[0] = new Class16_Sub4(super.aClass90_Sub1_38, 6406, 64, false, local36, 6406);
			this.aClass16_Sub4Array1[1] = new Class16_Sub4(super.aClass90_Sub1_38, 6406, 64, false, local40, 6406);
			this.aClass16_Sub4Array1[2] = new Class16_Sub4(super.aClass90_Sub1_38, 6406, 64, false, local32, 6406);
			this.method5647();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean485) {
			super.aClass90_Sub1_38.method2069(1);
			super.aClass90_Sub1_38.method2126(this.aClass16_Sub4Array1[arg1 - 1]);
			super.aClass90_Sub1_38.method2069(0);
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	@Override
	public void method6922() {
		if (this.aBoolean485) {
			if (!this.aBoolean486) {
				super.aClass90_Sub1_38.method2069(2);
				super.aClass90_Sub1_38.method2126(null);
			}
			super.aClass90_Sub1_38.method2069(1);
			super.aClass90_Sub1_38.method2126(null);
			super.aClass90_Sub1_38.method2069(0);
			this.aClass204_5.method4982('\u0001');
			this.aBoolean485 = false;
		} else {
			super.aClass90_Sub1_38.method2133(0, 5890);
		}
		super.aClass90_Sub1_38.method2120(8448, 8448);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6919() {
		return true;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6927(@OriginalArg(1) boolean arg0) {
		super.aClass90_Sub1_38.method2120(7681, 8448);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6918(@OriginalArg(0) boolean arg0) {
		if (this.aClass204_5 == null || !arg0) {
			super.aClass90_Sub1_38.method2133(0, 34168);
			return;
		}
		if (!this.aBoolean486) {
			super.aClass90_Sub1_38.method2069(2);
			super.aClass90_Sub1_38.method2126(super.aClass90_Sub1_38.aClass16_Sub1_1);
			super.aClass90_Sub1_38.method2069(0);
		}
		this.aClass204_5.method4982('\u0000');
		this.aBoolean485 = true;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
	private void method5647() {
		this.aClass204_5 = new Class204(super.aClass90_Sub1_38, 2);
		this.aClass204_5.method4985(0);
		super.aClass90_Sub1_38.method2069(1);
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
		if (this.aBoolean486) {
			super.aClass90_Sub1_38.method2120(7681, 260);
			super.aClass90_Sub1_38.method2119(0, 770, 5890);
			super.aClass90_Sub1_38.method2133(0, 34167);
		} else {
			super.aClass90_Sub1_38.method2120(8448, 7681);
			super.aClass90_Sub1_38.method2119(0, 768, 34168);
			super.aClass90_Sub1_38.method2069(2);
			super.aClass90_Sub1_38.method2120(7681, 260);
			super.aClass90_Sub1_38.method2119(0, 768, 34168);
			super.aClass90_Sub1_38.method2119(1, 770, 34168);
			super.aClass90_Sub1_38.method2133(0, 34167);
		}
		super.aClass90_Sub1_38.method2069(0);
		this.aClass204_5.method4987();
		this.aClass204_5.method4985(1);
		super.aClass90_Sub1_38.method2069(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean486) {
			super.aClass90_Sub1_38.method2120(8448, 8448);
			super.aClass90_Sub1_38.method2119(0, 768, 5890);
			super.aClass90_Sub1_38.method2133(0, 5890);
		} else {
			super.aClass90_Sub1_38.method2120(8448, 8448);
			super.aClass90_Sub1_38.method2119(0, 768, 5890);
			super.aClass90_Sub1_38.method2069(2);
			super.aClass90_Sub1_38.method2120(8448, 8448);
			super.aClass90_Sub1_38.method2119(0, 768, 5890);
			super.aClass90_Sub1_38.method2119(1, 768, 34168);
			super.aClass90_Sub1_38.method2133(0, 5890);
		}
		super.aClass90_Sub1_38.method2069(0);
		this.aClass204_5.method4987();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILclient!it;)V")
	@Override
	public void method6923(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
		super.aClass90_Sub1_38.method2126(arg1);
		super.aClass90_Sub1_38.method2123(arg0);
	}
}
