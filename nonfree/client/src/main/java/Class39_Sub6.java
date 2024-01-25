import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class39_Sub6 extends Class39 {

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!iw;")
	private Class169 aClass169_4;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Z")
	private boolean aBoolean582 = false;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Z")
	private boolean aBoolean583;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "[Lclient!io;")
	private Class167_Sub1[] aClass167_Sub1Array1;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class39_Sub6(@OriginalArg(0) Class133_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean625) {
			this.aBoolean583 = arg0.anInt8541 < 3;
			@Pc(28) int local28 = this.aBoolean583 ? 48 : 127;
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
						@Pc(107) float local107;
						if (local93 == 0) {
							local107 = -local91;
						} else if (local93 == 1) {
							local107 = local91;
						} else if (local93 == 2) {
							local107 = local87;
						} else if (local93 == 3) {
							local107 = -local87;
						} else if (local93 == 4) {
							local107 = local83;
						} else {
							local107 = -local83;
						}
						@Pc(156) int local156;
						@Pc(165) int local165;
						@Pc(174) int local174;
						if (local107 > 0.0F) {
							local156 = (int) ((double) local28 * Math.pow((double) local107, 96.0D));
							local165 = (int) (Math.pow((double) local107, 36.0D) * (double) local28);
							local174 = (int) ((double) local28 * Math.pow((double) local107, 12.0D));
						} else {
							local174 = 0;
							local165 = 0;
							local156 = 0;
						}
						local36[local93][local42] = (byte) local156;
						local40[local93][local42] = (byte) local165;
						local32[local93][local42] = (byte) local174;
					}
					local42++;
				}
			}
			this.aClass167_Sub1Array1 = new Class167_Sub1[3];
			this.aClass167_Sub1Array1[0] = new Class167_Sub1(super.aClass133_Sub3_42, 6406, 64, false, local36, 6406);
			this.aClass167_Sub1Array1[1] = new Class167_Sub1(super.aClass133_Sub3_42, 6406, 64, false, local40, 6406);
			this.aClass167_Sub1Array1[2] = new Class167_Sub1(super.aClass133_Sub3_42, 6406, 64, false, local32, 6406);
			this.method7013();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	@Override
	public void method8866() {
		if (this.aBoolean582) {
			if (!this.aBoolean583) {
				super.aClass133_Sub3_42.method7368(2);
				super.aClass133_Sub3_42.method7375(null);
			}
			super.aClass133_Sub3_42.method7368(1);
			super.aClass133_Sub3_42.method7375(null);
			super.aClass133_Sub3_42.method7368(0);
			this.aClass169_4.method4025('\u0001');
			this.aBoolean582 = false;
		} else {
			super.aClass133_Sub3_42.method7347(5890, 0);
		}
		super.aClass133_Sub3_42.method7342(8448, 8448);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8862(@OriginalArg(1) boolean arg0) {
		super.aClass133_Sub3_42.method7342(7681, 8448);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_4 == null || !arg0) {
			super.aClass133_Sub3_42.method7347(34168, 0);
			return;
		}
		if (!this.aBoolean583) {
			super.aClass133_Sub3_42.method7368(2);
			super.aClass133_Sub3_42.method7375(super.aClass133_Sub3_42.aClass167_Sub3_4);
			super.aClass133_Sub3_42.method7368(0);
		}
		this.aClass169_4.method4025('\u0000');
		this.aBoolean582 = true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8865() {
		return true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!nba;I)V")
	@Override
	public void method8864(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		super.aClass133_Sub3_42.method7375(arg1);
		super.aClass133_Sub3_42.method7401(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	private void method7013() {
		this.aClass169_4 = new Class169(super.aClass133_Sub3_42, 2);
		this.aClass169_4.method4029(0);
		super.aClass133_Sub3_42.method7368(1);
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
		if (this.aBoolean583) {
			super.aClass133_Sub3_42.method7342(7681, 260);
			super.aClass133_Sub3_42.method7326(0, 5890, 770);
			super.aClass133_Sub3_42.method7347(34167, 0);
		} else {
			super.aClass133_Sub3_42.method7342(8448, 7681);
			super.aClass133_Sub3_42.method7326(0, 34168, 768);
			super.aClass133_Sub3_42.method7368(2);
			super.aClass133_Sub3_42.method7342(7681, 260);
			super.aClass133_Sub3_42.method7326(0, 34168, 768);
			super.aClass133_Sub3_42.method7326(1, 34168, 770);
			super.aClass133_Sub3_42.method7347(34167, 0);
		}
		super.aClass133_Sub3_42.method7368(0);
		this.aClass169_4.method4027();
		this.aClass169_4.method4029(1);
		super.aClass133_Sub3_42.method7368(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean583) {
			super.aClass133_Sub3_42.method7342(8448, 8448);
			super.aClass133_Sub3_42.method7326(0, 5890, 768);
			super.aClass133_Sub3_42.method7347(5890, 0);
		} else {
			super.aClass133_Sub3_42.method7342(8448, 8448);
			super.aClass133_Sub3_42.method7326(0, 5890, 768);
			super.aClass133_Sub3_42.method7368(2);
			super.aClass133_Sub3_42.method7342(8448, 8448);
			super.aClass133_Sub3_42.method7326(0, 5890, 768);
			super.aClass133_Sub3_42.method7326(1, 34168, 768);
			super.aClass133_Sub3_42.method7347(5890, 0);
		}
		super.aClass133_Sub3_42.method7368(0);
		this.aClass169_4.method4027();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean582) {
			super.aClass133_Sub3_42.method7368(1);
			super.aClass133_Sub3_42.method7375(this.aClass167_Sub1Array1[arg0 - 1]);
			super.aClass133_Sub3_42.method7368(0);
		}
	}
}
