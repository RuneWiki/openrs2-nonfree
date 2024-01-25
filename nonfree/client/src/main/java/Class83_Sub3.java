import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class83_Sub3 extends Class83 {

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "Lclient!am;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!gaa", name = "q", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "Z")
	private boolean aBoolean249;

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "[Lclient!kh;")
	private Class164_Sub1[] aClass164_Sub1Array1;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class83_Sub3(@OriginalArg(0) Class4_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean429) {
			this.aBoolean249 = arg0.anInt5803 < 3;
			@Pc(28) int local28 = this.aBoolean249 ? 48 : 127;
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
						@Pc(103) float local103;
						if (local93 == 0) {
							local103 = -local91;
						} else if (local93 == 1) {
							local103 = local91;
						} else if (local93 == 2) {
							local103 = local87;
						} else if (local93 == 3) {
							local103 = -local87;
						} else if (local93 == 4) {
							local103 = local83;
						} else {
							local103 = -local83;
						}
						@Pc(149) int local149;
						@Pc(148) int local148;
						@Pc(146) int local146;
						if (local103 > 0.0F) {
							local149 = (int) ((double) local28 * Math.pow((double) local103, 96.0D));
							local148 = (int) ((double) local28 * Math.pow((double) local103, 36.0D));
							local146 = (int) ((double) local28 * Math.pow((double) local103, 12.0D));
						} else {
							local146 = 0;
							local148 = 0;
							local149 = 0;
						}
						local36[local93][local42] = (byte) local149;
						local40[local93][local42] = (byte) local148;
						local32[local93][local42] = (byte) local146;
					}
					local42++;
				}
			}
			this.aClass164_Sub1Array1 = new Class164_Sub1[3];
			this.aClass164_Sub1Array1[0] = new Class164_Sub1(super.aClass4_Sub3_41, 6406, 64, false, local36, 6406);
			this.aClass164_Sub1Array1[1] = new Class164_Sub1(super.aClass4_Sub3_41, 6406, 64, false, local40, 6406);
			this.aClass164_Sub1Array1[2] = new Class164_Sub1(super.aClass4_Sub3_41, 6406, 64, false, local32, 6406);
			this.method2766();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)V")
	private void method2766() {
		this.aClass11_1 = new Class11(super.aClass4_Sub3_41, 2);
		this.aClass11_1.method532(0);
		super.aClass4_Sub3_41.method5245(1);
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
		if (this.aBoolean249) {
			super.aClass4_Sub3_41.method5266(7681, 260);
			super.aClass4_Sub3_41.method5293(0, 770, 5890);
			super.aClass4_Sub3_41.method5265(0, 34167);
		} else {
			super.aClass4_Sub3_41.method5266(8448, 7681);
			super.aClass4_Sub3_41.method5293(0, 768, 34168);
			super.aClass4_Sub3_41.method5245(2);
			super.aClass4_Sub3_41.method5266(7681, 260);
			super.aClass4_Sub3_41.method5293(0, 768, 34168);
			super.aClass4_Sub3_41.method5293(1, 770, 34168);
			super.aClass4_Sub3_41.method5265(0, 34167);
		}
		super.aClass4_Sub3_41.method5245(0);
		this.aClass11_1.method537();
		this.aClass11_1.method532(1);
		super.aClass4_Sub3_41.method5245(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean249) {
			super.aClass4_Sub3_41.method5266(8448, 8448);
			super.aClass4_Sub3_41.method5293(0, 768, 5890);
			super.aClass4_Sub3_41.method5265(0, 5890);
		} else {
			super.aClass4_Sub3_41.method5266(8448, 8448);
			super.aClass4_Sub3_41.method5293(0, 768, 5890);
			super.aClass4_Sub3_41.method5245(2);
			super.aClass4_Sub3_41.method5266(8448, 8448);
			super.aClass4_Sub3_41.method5293(0, 768, 5890);
			super.aClass4_Sub3_41.method5293(1, 768, 34168);
			super.aClass4_Sub3_41.method5265(0, 5890);
		}
		super.aClass4_Sub3_41.method5245(0);
		this.aClass11_1.method537();
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7924(@OriginalArg(1) boolean arg0) {
		if (this.aClass11_1 == null || !arg0) {
			super.aClass4_Sub3_41.method5265(0, 34168);
			return;
		}
		if (!this.aBoolean249) {
			super.aClass4_Sub3_41.method5245(2);
			super.aClass4_Sub3_41.method5250(super.aClass4_Sub3_41.aClass164_Sub3_5);
			super.aClass4_Sub3_41.method5245(0);
		}
		this.aClass11_1.method534('\u0000');
		this.aBoolean250 = true;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
	@Override
	public void method7925() {
		if (this.aBoolean250) {
			if (!this.aBoolean249) {
				super.aClass4_Sub3_41.method5245(2);
				super.aClass4_Sub3_41.method5250(null);
			}
			super.aClass4_Sub3_41.method5245(1);
			super.aClass4_Sub3_41.method5250(null);
			super.aClass4_Sub3_41.method5245(0);
			this.aClass11_1.method534('\u0001');
			this.aBoolean250 = false;
		} else {
			super.aClass4_Sub3_41.method5265(0, 5890);
		}
		super.aClass4_Sub3_41.method5266(8448, 8448);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7927(@OriginalArg(0) boolean arg0) {
		super.aClass4_Sub3_41.method5266(7681, 8448);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IBLclient!uu;)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0, @OriginalArg(2) Class164 arg1) {
		super.aClass4_Sub3_41.method5250(arg1);
		super.aClass4_Sub3_41.method5230(arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7930() {
		return true;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean250) {
			super.aClass4_Sub3_41.method5245(1);
			super.aClass4_Sub3_41.method5250(this.aClass164_Sub1Array1[arg0 - 1]);
			super.aClass4_Sub3_41.method5245(0);
		}
	}
}
