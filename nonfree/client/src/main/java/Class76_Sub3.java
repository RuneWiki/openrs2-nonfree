import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class76_Sub3 extends Class76 {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "Lclient!hg;")
	private Class136 aClass136_4;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "Z")
	private boolean aBoolean568 = false;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Z")
	private boolean aBoolean569;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "[Lclient!qe;")
	private Class40_Sub4[] aClass40_Sub4Array1;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class76_Sub3(@OriginalArg(0) Class134_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean512) {
			this.aBoolean569 = arg0.anInt6571 < 3;
			@Pc(28) int local28 = this.aBoolean569 ? 48 : 127;
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(40) byte[][] local40 = new byte[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(105) float local105;
						if (local93 == 0) {
							local105 = -local87;
						} else if (local93 == 1) {
							local105 = local87;
						} else if (local93 == 2) {
							local105 = local91;
						} else if (local93 == 3) {
							local105 = -local91;
						} else if (local93 == 4) {
							local105 = local83;
						} else {
							local105 = -local83;
						}
						@Pc(156) int local156;
						@Pc(165) int local165;
						@Pc(174) int local174;
						if (local105 > 0.0F) {
							local156 = (int) ((double) local28 * Math.pow((double) local105, 96.0D));
							local165 = (int) (Math.pow((double) local105, 36.0D) * (double) local28);
							local174 = (int) ((double) local28 * Math.pow((double) local105, 12.0D));
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
			this.aClass40_Sub4Array1 = new Class40_Sub4[3];
			this.aClass40_Sub4Array1[0] = new Class40_Sub4(super.aClass134_Sub2_43, 6406, 64, false, local36, 6406);
			this.aClass40_Sub4Array1[1] = new Class40_Sub4(super.aClass134_Sub2_43, 6406, 64, false, local40, 6406);
			this.aClass40_Sub4Array1[2] = new Class40_Sub4(super.aClass134_Sub2_43, 6406, 64, false, local32, 6406);
			this.method5634();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean568) {
			super.aClass134_Sub2_43.method5197(1);
			super.aClass134_Sub2_43.method5202(this.aClass40_Sub4Array1[arg0 - 1]);
			super.aClass134_Sub2_43.method5197(0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	private void method5634() {
		this.aClass136_4 = new Class136(super.aClass134_Sub2_43, 2);
		this.aClass136_4.method2920(0);
		super.aClass134_Sub2_43.method5197(1);
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
		if (this.aBoolean569) {
			super.aClass134_Sub2_43.method5224(260, 7681);
			super.aClass134_Sub2_43.method5200(0, 5890, 770);
			super.aClass134_Sub2_43.method5271(34167, 0);
		} else {
			super.aClass134_Sub2_43.method5224(7681, 8448);
			super.aClass134_Sub2_43.method5200(0, 34168, 768);
			super.aClass134_Sub2_43.method5197(2);
			super.aClass134_Sub2_43.method5224(260, 7681);
			super.aClass134_Sub2_43.method5200(0, 34168, 768);
			super.aClass134_Sub2_43.method5200(1, 34168, 770);
			super.aClass134_Sub2_43.method5271(34167, 0);
		}
		super.aClass134_Sub2_43.method5197(0);
		this.aClass136_4.method2918();
		this.aClass136_4.method2920(1);
		super.aClass134_Sub2_43.method5197(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean569) {
			super.aClass134_Sub2_43.method5224(8448, 8448);
			super.aClass134_Sub2_43.method5200(0, 5890, 768);
			super.aClass134_Sub2_43.method5271(5890, 0);
		} else {
			super.aClass134_Sub2_43.method5224(8448, 8448);
			super.aClass134_Sub2_43.method5200(0, 5890, 768);
			super.aClass134_Sub2_43.method5197(2);
			super.aClass134_Sub2_43.method5224(8448, 8448);
			super.aClass134_Sub2_43.method5200(0, 5890, 768);
			super.aClass134_Sub2_43.method5200(1, 34168, 768);
			super.aClass134_Sub2_43.method5271(5890, 0);
		}
		super.aClass134_Sub2_43.method5197(0);
		this.aClass136_4.method2918();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7607(@OriginalArg(0) boolean arg0) {
		if (this.aClass136_4 == null || !arg0) {
			super.aClass134_Sub2_43.method5271(34168, 0);
			return;
		}
		if (!this.aBoolean569) {
			super.aClass134_Sub2_43.method5197(2);
			super.aClass134_Sub2_43.method5202(super.aClass134_Sub2_43.aClass40_Sub3_4);
			super.aClass134_Sub2_43.method5197(0);
		}
		this.aClass136_4.method2915('\u0000');
		this.aBoolean568 = true;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!ip;I)V")
	@Override
	public void method7611(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		super.aClass134_Sub2_43.method5202(arg1);
		super.aClass134_Sub2_43.method5194(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7606() {
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		if (this.aBoolean568) {
			if (!this.aBoolean569) {
				super.aClass134_Sub2_43.method5197(2);
				super.aClass134_Sub2_43.method5202(null);
			}
			super.aClass134_Sub2_43.method5197(1);
			super.aClass134_Sub2_43.method5202(null);
			super.aClass134_Sub2_43.method5197(0);
			this.aClass136_4.method2915('\u0001');
			this.aBoolean568 = false;
		} else {
			super.aClass134_Sub2_43.method5271(5890, 0);
		}
		super.aClass134_Sub2_43.method5224(8448, 8448);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7613(@OriginalArg(0) boolean arg0) {
		super.aClass134_Sub2_43.method5224(8448, 7681);
	}
}
