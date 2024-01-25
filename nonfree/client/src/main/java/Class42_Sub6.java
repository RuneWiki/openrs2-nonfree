import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class42_Sub6 extends Class42 {

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Lclient!bq;")
	private Class41 aClass41_3;

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "Z")
	private boolean aBoolean590 = false;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "Z")
	private boolean aBoolean589;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "[Lclient!eg;")
	private Class3_Sub3[] aClass3_Sub3Array1;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class42_Sub6(@OriginalArg(0) Class162_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean725) {
			this.aBoolean589 = arg0.anInt8729 < 3;
			@Pc(26) int local26 = this.aBoolean589 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(103) float local103;
						if (local91 == 0) {
							local103 = -local89;
						} else if (local91 == 1) {
							local103 = local89;
						} else if (local91 == 2) {
							local103 = local85;
						} else if (local91 == 3) {
							local103 = -local85;
						} else if (local91 == 4) {
							local103 = local81;
						} else {
							local103 = -local81;
						}
						@Pc(152) int local152;
						@Pc(161) int local161;
						@Pc(170) int local170;
						if (local103 > 0.0F) {
							local152 = (int) ((double) local26 * Math.pow((double) local103, 96.0D));
							local161 = (int) ((double) local26 * Math.pow((double) local103, 36.0D));
							local170 = (int) (Math.pow((double) local103, 12.0D) * (double) local26);
						} else {
							local170 = 0;
							local161 = 0;
							local152 = 0;
						}
						local34[local91][local40] = (byte) local152;
						local38[local91][local40] = (byte) local161;
						local30[local91][local40] = (byte) local170;
					}
					local40++;
				}
			}
			this.aClass3_Sub3Array1 = new Class3_Sub3[3];
			this.aClass3_Sub3Array1[0] = new Class3_Sub3(super.aClass162_Sub3_44, 6406, 64, false, local34, 6406);
			this.aClass3_Sub3Array1[1] = new Class3_Sub3(super.aClass162_Sub3_44, 6406, 64, false, local38, 6406);
			this.aClass3_Sub3Array1[2] = new Class3_Sub3(super.aClass162_Sub3_44, 6406, 64, false, local30, 6406);
			this.method5848();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7737(@OriginalArg(1) boolean arg0) {
		super.aClass162_Sub3_44.method6903(8448, 7681);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7739(@OriginalArg(0) boolean arg0) {
		if (this.aClass41_3 == null || !arg0) {
			super.aClass162_Sub3_44.method6926(34168, 0);
			return;
		}
		if (!this.aBoolean589) {
			super.aClass162_Sub3_44.method6947(2);
			super.aClass162_Sub3_44.method6911(super.aClass162_Sub3_44.aClass3_Sub1_5);
			super.aClass162_Sub3_44.method6947(0);
		}
		this.aClass41_3.method821('\u0000');
		this.aBoolean590 = true;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean590) {
			super.aClass162_Sub3_44.method6947(1);
			super.aClass162_Sub3_44.method6911(this.aClass3_Sub3Array1[arg1 - 1]);
			super.aClass162_Sub3_44.method6947(0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V")
	private void method5848() {
		this.aClass41_3 = new Class41(super.aClass162_Sub3_44, 2);
		this.aClass41_3.method823(0);
		super.aClass162_Sub3_44.method6947(1);
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
		if (this.aBoolean589) {
			super.aClass162_Sub3_44.method6903(260, 7681);
			super.aClass162_Sub3_44.method6957(5890, 770, 0);
			super.aClass162_Sub3_44.method6926(34167, 0);
		} else {
			super.aClass162_Sub3_44.method6903(7681, 8448);
			super.aClass162_Sub3_44.method6957(34168, 768, 0);
			super.aClass162_Sub3_44.method6947(2);
			super.aClass162_Sub3_44.method6903(260, 7681);
			super.aClass162_Sub3_44.method6957(34168, 768, 0);
			super.aClass162_Sub3_44.method6957(34168, 770, 1);
			super.aClass162_Sub3_44.method6926(34167, 0);
		}
		super.aClass162_Sub3_44.method6947(0);
		this.aClass41_3.method822();
		this.aClass41_3.method823(1);
		super.aClass162_Sub3_44.method6947(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean589) {
			super.aClass162_Sub3_44.method6903(8448, 8448);
			super.aClass162_Sub3_44.method6957(5890, 768, 0);
			super.aClass162_Sub3_44.method6926(5890, 0);
		} else {
			super.aClass162_Sub3_44.method6903(8448, 8448);
			super.aClass162_Sub3_44.method6957(5890, 768, 0);
			super.aClass162_Sub3_44.method6947(2);
			super.aClass162_Sub3_44.method6903(8448, 8448);
			super.aClass162_Sub3_44.method6957(5890, 768, 0);
			super.aClass162_Sub3_44.method6957(34168, 768, 1);
			super.aClass162_Sub3_44.method6926(5890, 0);
		}
		super.aClass162_Sub3_44.method6947(0);
		this.aClass41_3.method822();
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	@Override
	public void method7741() {
		if (this.aBoolean590) {
			if (!this.aBoolean589) {
				super.aClass162_Sub3_44.method6947(2);
				super.aClass162_Sub3_44.method6911(null);
			}
			super.aClass162_Sub3_44.method6947(1);
			super.aClass162_Sub3_44.method6911(null);
			super.aClass162_Sub3_44.method6947(0);
			this.aClass41_3.method821('\u0001');
			this.aBoolean590 = false;
		} else {
			super.aClass162_Sub3_44.method6926(5890, 0);
		}
		super.aClass162_Sub3_44.method6903(8448, 8448);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!vaa;B)V")
	@Override
	public void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		super.aClass162_Sub3_44.method6911(arg1);
		super.aClass162_Sub3_44.method6953(arg0);
	}
}
