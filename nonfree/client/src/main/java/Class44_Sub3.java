import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "Lclient!ab;")
	private Class3 aClass3_2;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "Z")
	private boolean aBoolean374 = false;

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "Z")
	private boolean aBoolean373;

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "[Lclient!oj;")
	private Class4_Sub4[] aClass4_Sub4Array1;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class44_Sub3(@OriginalArg(0) Class62_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean276) {
			this.aBoolean373 = arg0.anInt4651 < 3;
			@Pc(28) int local28 = this.aBoolean373 ? 48 : 127;
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
						@Pc(154) int local154;
						@Pc(163) int local163;
						@Pc(172) int local172;
						if (local103 > 0.0F) {
							local154 = (int) ((double) local28 * Math.pow((double) local103, 96.0D));
							local163 = (int) ((double) local28 * Math.pow((double) local103, 36.0D));
							local172 = (int) ((double) local28 * Math.pow((double) local103, 12.0D));
						} else {
							local172 = 0;
							local163 = 0;
							local154 = 0;
						}
						local36[local93][local42] = (byte) local154;
						local40[local93][local42] = (byte) local163;
						local32[local93][local42] = (byte) local172;
					}
					local42++;
				}
			}
			this.aClass4_Sub4Array1 = new Class4_Sub4[3];
			this.aClass4_Sub4Array1[0] = new Class4_Sub4(super.aClass62_Sub3_43, 6406, 64, false, local36, 6406);
			this.aClass4_Sub4Array1[1] = new Class4_Sub4(super.aClass62_Sub3_43, 6406, 64, false, local40, 6406);
			this.aClass4_Sub4Array1[2] = new Class4_Sub4(super.aClass62_Sub3_43, 6406, 64, false, local32, 6406);
			this.method4516();
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!aba;I)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		super.aClass62_Sub3_43.method4007(arg1);
		super.aClass62_Sub3_43.method3999(arg0);
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7281() {
		return true;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7277(@OriginalArg(0) boolean arg0) {
		super.aClass62_Sub3_43.method4011(7681, 8448);
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V")
	private void method4516() {
		this.aClass3_2 = new Class3(super.aClass62_Sub3_43, 2);
		this.aClass3_2.method205(0);
		super.aClass62_Sub3_43.method4009(1);
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
		if (this.aBoolean373) {
			super.aClass62_Sub3_43.method4011(7681, 260);
			super.aClass62_Sub3_43.method3984(5890, 0, 770);
			super.aClass62_Sub3_43.method4003(0, 34167);
		} else {
			super.aClass62_Sub3_43.method4011(8448, 7681);
			super.aClass62_Sub3_43.method3984(34168, 0, 768);
			super.aClass62_Sub3_43.method4009(2);
			super.aClass62_Sub3_43.method4011(7681, 260);
			super.aClass62_Sub3_43.method3984(34168, 0, 768);
			super.aClass62_Sub3_43.method3984(34168, 1, 770);
			super.aClass62_Sub3_43.method4003(0, 34167);
		}
		super.aClass62_Sub3_43.method4009(0);
		this.aClass3_2.method210();
		this.aClass3_2.method205(1);
		super.aClass62_Sub3_43.method4009(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean373) {
			super.aClass62_Sub3_43.method4011(8448, 8448);
			super.aClass62_Sub3_43.method3984(5890, 0, 768);
			super.aClass62_Sub3_43.method4003(0, 5890);
		} else {
			super.aClass62_Sub3_43.method4011(8448, 8448);
			super.aClass62_Sub3_43.method3984(5890, 0, 768);
			super.aClass62_Sub3_43.method4009(2);
			super.aClass62_Sub3_43.method4011(8448, 8448);
			super.aClass62_Sub3_43.method3984(5890, 0, 768);
			super.aClass62_Sub3_43.method3984(34168, 1, 768);
			super.aClass62_Sub3_43.method4003(0, 5890);
		}
		super.aClass62_Sub3_43.method4009(0);
		this.aClass3_2.method210();
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7274(@OriginalArg(0) boolean arg0) {
		if (this.aClass3_2 == null || !arg0) {
			super.aClass62_Sub3_43.method4003(0, 34168);
			return;
		}
		if (!this.aBoolean373) {
			super.aClass62_Sub3_43.method4009(2);
			super.aClass62_Sub3_43.method4007(super.aClass62_Sub3_43.aClass4_Sub2_1);
			super.aClass62_Sub3_43.method4009(0);
		}
		this.aClass3_2.method207('\u0000');
		this.aBoolean374 = true;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
	@Override
	public void method7280() {
		if (this.aBoolean374) {
			if (!this.aBoolean373) {
				super.aClass62_Sub3_43.method4009(2);
				super.aClass62_Sub3_43.method4007(null);
			}
			super.aClass62_Sub3_43.method4009(1);
			super.aClass62_Sub3_43.method4007(null);
			super.aClass62_Sub3_43.method4009(0);
			this.aClass3_2.method207('\u0001');
			this.aBoolean374 = false;
		} else {
			super.aClass62_Sub3_43.method4003(0, 5890);
		}
		super.aClass62_Sub3_43.method4011(8448, 8448);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V")
	@Override
	public void method7278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean374) {
			super.aClass62_Sub3_43.method4009(1);
			super.aClass62_Sub3_43.method4007(this.aClass4_Sub4Array1[arg0 - 1]);
			super.aClass62_Sub3_43.method4009(0);
		}
	}
}
