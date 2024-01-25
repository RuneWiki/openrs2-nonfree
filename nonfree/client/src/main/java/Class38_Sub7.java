import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class38_Sub7 extends Class38 {

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!vb;")
	private Class371 aClass371_4;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Z")
	private boolean aBoolean536;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "[Lclient!vr;")
	private Class161_Sub4[] aClass161_Sub4Array1;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class38_Sub7(@OriginalArg(0) Class144_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean555) {
			this.aBoolean536 = arg0.anInt8080 < 3;
			@Pc(26) int local26 = this.aBoolean536 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(55) float local55 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(64) float local64 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(79) float local79 = (float) (1.0D / Math.sqrt((double) (local55 * local55 + local64 * local64 + 1.0F)));
					@Pc(83) float local83 = local55 * local79;
					@Pc(87) float local87 = local64 * local79;
					for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
						@Pc(106) float local106;
						if (local89 == 0) {
							local106 = -local83;
						} else if (local89 == 1) {
							local106 = local83;
						} else if (local89 == 2) {
							local106 = local87;
						} else if (local89 == 3) {
							local106 = -local87;
						} else if (local89 == 4) {
							local106 = local79;
						} else {
							local106 = -local79;
						}
						@Pc(143) int local143;
						@Pc(152) int local152;
						@Pc(161) int local161;
						if (local106 > 0.0F) {
							local143 = (int) ((double) local26 * Math.pow((double) local106, 96.0D));
							local152 = (int) ((double) local26 * Math.pow((double) local106, 36.0D));
							local161 = (int) ((double) local26 * Math.pow((double) local106, 12.0D));
						} else {
							local161 = 0;
							local152 = 0;
							local143 = 0;
						}
						local34[local89][local40] = (byte) local143;
						local38[local89][local40] = (byte) local152;
						local30[local89][local40] = (byte) local161;
					}
					local40++;
				}
			}
			this.aClass161_Sub4Array1 = new Class161_Sub4[3];
			this.aClass161_Sub4Array1[0] = new Class161_Sub4(super.aClass144_Sub3_43, 6406, 64, false, local34, 6406);
			this.aClass161_Sub4Array1[1] = new Class161_Sub4(super.aClass144_Sub3_43, 6406, 64, false, local38, 6406);
			this.aClass161_Sub4Array1[2] = new Class161_Sub4(super.aClass144_Sub3_43, 6406, 64, false, local30, 6406);
			this.method6746();
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
	private void method6746() {
		this.aClass371_4 = new Class371(super.aClass144_Sub3_43, 2);
		this.aClass371_4.method8902(0);
		super.aClass144_Sub3_43.method7028(1);
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
		if (this.aBoolean536) {
			super.aClass144_Sub3_43.method7025(260, 7681);
			super.aClass144_Sub3_43.method6979(0, 770, 5890);
			super.aClass144_Sub3_43.method7021(34167, 0);
		} else {
			super.aClass144_Sub3_43.method7025(7681, 8448);
			super.aClass144_Sub3_43.method6979(0, 768, 34168);
			super.aClass144_Sub3_43.method7028(2);
			super.aClass144_Sub3_43.method7025(260, 7681);
			super.aClass144_Sub3_43.method6979(0, 768, 34168);
			super.aClass144_Sub3_43.method6979(1, 770, 34168);
			super.aClass144_Sub3_43.method7021(34167, 0);
		}
		super.aClass144_Sub3_43.method7028(0);
		this.aClass371_4.method8904();
		this.aClass371_4.method8902(1);
		super.aClass144_Sub3_43.method7028(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean536) {
			super.aClass144_Sub3_43.method7025(8448, 8448);
			super.aClass144_Sub3_43.method6979(0, 768, 5890);
			super.aClass144_Sub3_43.method7021(5890, 0);
		} else {
			super.aClass144_Sub3_43.method7025(8448, 8448);
			super.aClass144_Sub3_43.method6979(0, 768, 5890);
			super.aClass144_Sub3_43.method7028(2);
			super.aClass144_Sub3_43.method7025(8448, 8448);
			super.aClass144_Sub3_43.method6979(0, 768, 5890);
			super.aClass144_Sub3_43.method6979(1, 768, 34168);
			super.aClass144_Sub3_43.method7021(5890, 0);
		}
		super.aClass144_Sub3_43.method7028(0);
		this.aClass371_4.method8904();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9399(@OriginalArg(1) boolean arg0) {
		super.aClass144_Sub3_43.method7025(8448, 7681);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9406(@OriginalArg(1) boolean arg0) {
		if (this.aClass371_4 == null || !arg0) {
			super.aClass144_Sub3_43.method7021(34168, 0);
			return;
		}
		if (!this.aBoolean536) {
			super.aClass144_Sub3_43.method7028(2);
			super.aClass144_Sub3_43.method6982(super.aClass144_Sub3_43.aClass161_Sub1_5);
			super.aClass144_Sub3_43.method7028(0);
		}
		this.aClass371_4.method8907('\u0000');
		this.aBoolean535 = true;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V")
	@Override
	public void method9402() {
		if (this.aBoolean535) {
			if (!this.aBoolean536) {
				super.aClass144_Sub3_43.method7028(2);
				super.aClass144_Sub3_43.method6982((Class161) null);
			}
			super.aClass144_Sub3_43.method7028(1);
			super.aClass144_Sub3_43.method6982((Class161) null);
			super.aClass144_Sub3_43.method7028(0);
			this.aClass371_4.method8907('\u0001');
			this.aBoolean535 = false;
		} else {
			super.aClass144_Sub3_43.method7021(5890, 0);
		}
		super.aClass144_Sub3_43.method7025(8448, 8448);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)V")
	@Override
	public void method9398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean535) {
			super.aClass144_Sub3_43.method7028(1);
			super.aClass144_Sub3_43.method6982(this.aClass161_Sub4Array1[arg0 - 1]);
			super.aClass144_Sub3_43.method7028(0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLclient!pu;I)V")
	@Override
	public void method9401(@OriginalArg(1) Class161 arg0, @OriginalArg(2) int arg1) {
		super.aClass144_Sub3_43.method6982(arg0);
		super.aClass144_Sub3_43.method6988(arg1);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9403() {
		return true;
	}
}
