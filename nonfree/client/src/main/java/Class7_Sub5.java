import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "Lclient!cl;")
	private Class53 aClass53_4;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Z")
	private boolean aBoolean434 = false;

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "Z")
	private boolean aBoolean433;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "[Lclient!d;")
	private Class52_Sub2[] aClass52_Sub2Array1;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class7_Sub5(@OriginalArg(0) Class12_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean18) {
			this.aBoolean433 = arg0.anInt492 < 3;
			@Pc(28) int local28 = this.aBoolean433 ? 48 : 127;
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
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local104 > 0.0F) {
							local148 = (int) (Math.pow((double) local104, 96.0D) * (double) local28);
							local147 = (int) ((double) local28 * Math.pow((double) local104, 36.0D));
							local145 = (int) (Math.pow((double) local104, 12.0D) * (double) local28);
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
			this.aClass52_Sub2Array1 = new Class52_Sub2[3];
			this.aClass52_Sub2Array1[0] = new Class52_Sub2(super.aClass12_Sub1_42, 6406, 64, false, local36, 6406);
			this.aClass52_Sub2Array1[1] = new Class52_Sub2(super.aClass12_Sub1_42, 6406, 64, false, local40, 6406);
			this.aClass52_Sub2Array1[2] = new Class52_Sub2(super.aClass12_Sub1_42, 6406, 64, false, local32, 6406);
			this.method5013();
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7777(@OriginalArg(1) boolean arg0) {
		if (this.aClass53_4 == null || !arg0) {
			super.aClass12_Sub1_42.method388(0, 34168);
			return;
		}
		if (!this.aBoolean433) {
			super.aClass12_Sub1_42.method376(2);
			super.aClass12_Sub1_42.method378(super.aClass12_Sub1_42.aClass52_Sub1_2);
			super.aClass12_Sub1_42.method376(0);
		}
		this.aClass53_4.method1511('\u0000');
		this.aBoolean434 = true;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!vfa;B)V")
	@Override
	public void method7782(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1) {
		super.aClass12_Sub1_42.method378(arg1);
		super.aClass12_Sub1_42.method401(arg0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V")
	@Override
	public void method7783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean434) {
			super.aClass12_Sub1_42.method376(1);
			super.aClass12_Sub1_42.method378(this.aClass52_Sub2Array1[arg1 - 1]);
			super.aClass12_Sub1_42.method376(0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
	private void method5013() {
		this.aClass53_4 = new Class53(super.aClass12_Sub1_42, 2);
		this.aClass53_4.method1513(0);
		super.aClass12_Sub1_42.method376(1);
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
		if (this.aBoolean433) {
			super.aClass12_Sub1_42.method420(7681, 260);
			super.aClass12_Sub1_42.method387(0, 770, 5890);
			super.aClass12_Sub1_42.method388(0, 34167);
		} else {
			super.aClass12_Sub1_42.method420(8448, 7681);
			super.aClass12_Sub1_42.method387(0, 768, 34168);
			super.aClass12_Sub1_42.method376(2);
			super.aClass12_Sub1_42.method420(7681, 260);
			super.aClass12_Sub1_42.method387(0, 768, 34168);
			super.aClass12_Sub1_42.method387(1, 770, 34168);
			super.aClass12_Sub1_42.method388(0, 34167);
		}
		super.aClass12_Sub1_42.method376(0);
		this.aClass53_4.method1514();
		this.aClass53_4.method1513(1);
		super.aClass12_Sub1_42.method376(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean433) {
			super.aClass12_Sub1_42.method420(8448, 8448);
			super.aClass12_Sub1_42.method387(0, 768, 5890);
			super.aClass12_Sub1_42.method388(0, 5890);
		} else {
			super.aClass12_Sub1_42.method420(8448, 8448);
			super.aClass12_Sub1_42.method387(0, 768, 5890);
			super.aClass12_Sub1_42.method376(2);
			super.aClass12_Sub1_42.method420(8448, 8448);
			super.aClass12_Sub1_42.method387(0, 768, 5890);
			super.aClass12_Sub1_42.method387(1, 768, 34168);
			super.aClass12_Sub1_42.method388(0, 5890);
		}
		super.aClass12_Sub1_42.method376(0);
		this.aClass53_4.method1514();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	@Override
	public void method7785() {
		if (this.aBoolean434) {
			if (!this.aBoolean433) {
				super.aClass12_Sub1_42.method376(2);
				super.aClass12_Sub1_42.method378(null);
			}
			super.aClass12_Sub1_42.method376(1);
			super.aClass12_Sub1_42.method378(null);
			super.aClass12_Sub1_42.method376(0);
			this.aClass53_4.method1511('\u0001');
			this.aBoolean434 = false;
		} else {
			super.aClass12_Sub1_42.method388(0, 5890);
		}
		super.aClass12_Sub1_42.method420(8448, 8448);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7784() {
		return true;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7780(@OriginalArg(0) boolean arg0) {
		super.aClass12_Sub1_42.method420(7681, 8448);
	}
}
