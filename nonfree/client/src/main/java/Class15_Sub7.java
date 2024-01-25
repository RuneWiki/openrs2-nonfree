import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class15_Sub7 extends Class15 {

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "Lclient!sr;")
	private Class307 aClass307_5;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "Z")
	private boolean aBoolean542 = false;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "Z")
	private boolean aBoolean543;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "[Lclient!qn;")
	private Class50_Sub4[] aClass50_Sub4Array1;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class15_Sub7(@OriginalArg(0) Class31_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean205) {
			this.aBoolean543 = arg0.anInt3146 < 3;
			@Pc(28) int local28 = this.aBoolean543 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local59 * local59 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(105) float local105;
						if (local93 == 0) {
							local105 = -local91;
						} else if (local93 == 1) {
							local105 = local91;
						} else if (local93 == 2) {
							local105 = local87;
						} else if (local93 == 3) {
							local105 = -local87;
						} else if (local93 == 4) {
							local105 = local83;
						} else {
							local105 = -local83;
						}
						@Pc(152) int local152;
						@Pc(161) int local161;
						@Pc(170) int local170;
						if (local105 > 0.0F) {
							local152 = (int) (Math.pow((double) local105, 96.0D) * (double) local28);
							local161 = (int) (Math.pow((double) local105, 36.0D) * (double) local28);
							local170 = (int) ((double) local28 * Math.pow((double) local105, 12.0D));
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
			this.aClass50_Sub4Array1 = new Class50_Sub4[3];
			this.aClass50_Sub4Array1[0] = new Class50_Sub4(super.aClass31_Sub2_40, 6406, 64, false, local36, 6406);
			this.aClass50_Sub4Array1[1] = new Class50_Sub4(super.aClass31_Sub2_40, 6406, 64, false, local40, 6406);
			this.aClass50_Sub4Array1[2] = new Class50_Sub4(super.aClass31_Sub2_40, 6406, 64, false, local32, 6406);
			this.method6149();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ep;I)V")
	@Override
	public void method6947(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		super.aClass31_Sub2_40.method2535(arg0);
		super.aClass31_Sub2_40.method2495(arg1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6945(@OriginalArg(0) boolean arg0) {
		super.aClass31_Sub2_40.method2536(7681, 8448);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	@Override
	public void method6944() {
		if (this.aBoolean542) {
			if (!this.aBoolean543) {
				super.aClass31_Sub2_40.method2513(2);
				super.aClass31_Sub2_40.method2535(null);
			}
			super.aClass31_Sub2_40.method2513(1);
			super.aClass31_Sub2_40.method2535(null);
			super.aClass31_Sub2_40.method2513(0);
			this.aClass307_5.method6699('\u0001');
			this.aBoolean542 = false;
		} else {
			super.aClass31_Sub2_40.method2499(5890, 0);
		}
		super.aClass31_Sub2_40.method2536(8448, 8448);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
		if (this.aClass307_5 == null || !arg0) {
			super.aClass31_Sub2_40.method2499(34168, 0);
			return;
		}
		if (!this.aBoolean543) {
			super.aClass31_Sub2_40.method2513(2);
			super.aClass31_Sub2_40.method2535(super.aClass31_Sub2_40.aClass50_Sub1_2);
			super.aClass31_Sub2_40.method2513(0);
		}
		this.aClass307_5.method6699('\u0000');
		this.aBoolean542 = true;
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V")
	private void method6149() {
		this.aClass307_5 = new Class307(super.aClass31_Sub2_40, 2);
		this.aClass307_5.method6701(0);
		super.aClass31_Sub2_40.method2513(1);
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
		if (this.aBoolean543) {
			super.aClass31_Sub2_40.method2536(7681, 260);
			super.aClass31_Sub2_40.method2523(770, 5890, 0);
			super.aClass31_Sub2_40.method2499(34167, 0);
		} else {
			super.aClass31_Sub2_40.method2536(8448, 7681);
			super.aClass31_Sub2_40.method2523(768, 34168, 0);
			super.aClass31_Sub2_40.method2513(2);
			super.aClass31_Sub2_40.method2536(7681, 260);
			super.aClass31_Sub2_40.method2523(768, 34168, 0);
			super.aClass31_Sub2_40.method2523(770, 34168, 1);
			super.aClass31_Sub2_40.method2499(34167, 0);
		}
		super.aClass31_Sub2_40.method2513(0);
		this.aClass307_5.method6702();
		this.aClass307_5.method6701(1);
		super.aClass31_Sub2_40.method2513(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean543) {
			super.aClass31_Sub2_40.method2536(8448, 8448);
			super.aClass31_Sub2_40.method2523(768, 5890, 0);
			super.aClass31_Sub2_40.method2499(5890, 0);
		} else {
			super.aClass31_Sub2_40.method2536(8448, 8448);
			super.aClass31_Sub2_40.method2523(768, 5890, 0);
			super.aClass31_Sub2_40.method2513(2);
			super.aClass31_Sub2_40.method2536(8448, 8448);
			super.aClass31_Sub2_40.method2523(768, 5890, 0);
			super.aClass31_Sub2_40.method2523(768, 34168, 1);
			super.aClass31_Sub2_40.method2499(5890, 0);
		}
		super.aClass31_Sub2_40.method2513(0);
		this.aClass307_5.method6702();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V")
	@Override
	public void method6948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean542) {
			super.aClass31_Sub2_40.method2513(1);
			super.aClass31_Sub2_40.method2535(this.aClass50_Sub4Array1[arg1 - 1]);
			super.aClass31_Sub2_40.method2513(0);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6946() {
		return true;
	}
}
