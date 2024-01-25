import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class160_Sub8 extends Class160 {

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "Lclient!fga;")
	private Class113 aClass113_6;

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "Z")
	private boolean aBoolean542 = false;

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "[Lclient!dka;")
	private Class29_Sub2[] aClass29_Sub2Array1;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class160_Sub8(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean721) {
			this.aBoolean541 = arg0.anInt10285 < 3;
			@Pc(28) int local28 = this.aBoolean541 ? 48 : 127;
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
						@Pc(123) float local123;
						if (local93 == 0) {
							local123 = -local87;
						} else if (local93 == 1) {
							local123 = local87;
						} else if (local93 == 2) {
							local123 = local91;
						} else if (local93 == 3) {
							local123 = -local91;
						} else if (local93 == 4) {
							local123 = local83;
						} else {
							local123 = -local83;
						}
						@Pc(162) int local162;
						@Pc(161) int local161;
						@Pc(159) int local159;
						if (local123 > 0.0F) {
							local162 = (int) (Math.pow((double) local123, 96.0D) * (double) local28);
							local161 = (int) (Math.pow((double) local123, 36.0D) * (double) local28);
							local159 = (int) (Math.pow((double) local123, 12.0D) * (double) local28);
						} else {
							local159 = 0;
							local161 = 0;
							local162 = 0;
						}
						local36[local93][local42] = (byte) local162;
						local40[local93][local42] = (byte) local161;
						local32[local93][local42] = (byte) local159;
					}
					local42++;
				}
			}
			this.aClass29_Sub2Array1 = new Class29_Sub2[3];
			this.aClass29_Sub2Array1[0] = new Class29_Sub2(super.aClass100_Sub3_40, 6406, 64, false, local36, 6406);
			this.aClass29_Sub2Array1[1] = new Class29_Sub2(super.aClass100_Sub3_40, 6406, 64, false, local40, 6406);
			this.aClass29_Sub2Array1[2] = new Class29_Sub2(super.aClass100_Sub3_40, 6406, 64, false, local32, 6406);
			this.method6974();
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8062() {
		return true;
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V")
	private void method6974() {
		this.aClass113_6 = new Class113(super.aClass100_Sub3_40, 2);
		this.aClass113_6.method2789(0);
		super.aClass100_Sub3_40.method8678(1);
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
		if (this.aBoolean541) {
			super.aClass100_Sub3_40.method8738(7681, 260);
			super.aClass100_Sub3_40.method8702(770, 5890, 0);
			super.aClass100_Sub3_40.method8673(34167, 0);
		} else {
			super.aClass100_Sub3_40.method8738(8448, 7681);
			super.aClass100_Sub3_40.method8702(768, 34168, 0);
			super.aClass100_Sub3_40.method8678(2);
			super.aClass100_Sub3_40.method8738(7681, 260);
			super.aClass100_Sub3_40.method8702(768, 34168, 0);
			super.aClass100_Sub3_40.method8702(770, 34168, 1);
			super.aClass100_Sub3_40.method8673(34167, 0);
		}
		super.aClass100_Sub3_40.method8678(0);
		this.aClass113_6.method2790();
		this.aClass113_6.method2789(1);
		super.aClass100_Sub3_40.method8678(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean541) {
			super.aClass100_Sub3_40.method8738(8448, 8448);
			super.aClass100_Sub3_40.method8702(768, 5890, 0);
			super.aClass100_Sub3_40.method8673(5890, 0);
		} else {
			super.aClass100_Sub3_40.method8738(8448, 8448);
			super.aClass100_Sub3_40.method8702(768, 5890, 0);
			super.aClass100_Sub3_40.method8678(2);
			super.aClass100_Sub3_40.method8738(8448, 8448);
			super.aClass100_Sub3_40.method8702(768, 5890, 0);
			super.aClass100_Sub3_40.method8702(768, 34168, 1);
			super.aClass100_Sub3_40.method8673(5890, 0);
		}
		super.aClass100_Sub3_40.method8678(0);
		this.aClass113_6.method2790();
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
	@Override
	public void method8061() {
		if (this.aBoolean542) {
			if (!this.aBoolean541) {
				super.aClass100_Sub3_40.method8678(2);
				super.aClass100_Sub3_40.method8743((Class29) null);
			}
			super.aClass100_Sub3_40.method8678(1);
			super.aClass100_Sub3_40.method8743((Class29) null);
			super.aClass100_Sub3_40.method8678(0);
			this.aClass113_6.method2793('\u0001');
			this.aBoolean542 = false;
		} else {
			super.aClass100_Sub3_40.method8673(5890, 0);
		}
		super.aClass100_Sub3_40.method8738(8448, 8448);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8065(@OriginalArg(1) boolean arg0) {
		if (this.aClass113_6 == null || !arg0) {
			super.aClass100_Sub3_40.method8673(34168, 0);
			return;
		}
		if (!this.aBoolean541) {
			super.aClass100_Sub3_40.method8678(2);
			super.aClass100_Sub3_40.method8743(super.aClass100_Sub3_40.aClass29_Sub3_6);
			super.aClass100_Sub3_40.method8678(0);
		}
		this.aClass113_6.method2793('\u0000');
		this.aBoolean542 = true;
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean542) {
			super.aClass100_Sub3_40.method8678(1);
			super.aClass100_Sub3_40.method8743(this.aClass29_Sub2Array1[arg0 - 1]);
			super.aClass100_Sub3_40.method8678(0);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!gb;II)V")
	@Override
	public void method8067(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		super.aClass100_Sub3_40.method8743(arg0);
		super.aClass100_Sub3_40.method8671(arg1);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8066(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_40.method8738(7681, 8448);
	}
}
