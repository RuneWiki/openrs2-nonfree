import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class69_Sub2 extends Class69 {

	@OriginalMember(owner = "client!di", name = "p", descriptor = "Lclient!kca;")
	private Class203 aClass203_1;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "[Lclient!gfa;")
	private Class44_Sub2[] aClass44_Sub2Array1;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class69_Sub2(@OriginalArg(0) Class75_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean483) {
			this.aBoolean171 = arg0.anInt6574 < 3;
			@Pc(30) int local30 = this.aBoolean171 ? 48 : 127;
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(42) byte[][] local42 = new byte[6][4096];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
				for (@Pc(50) int local50 = 0; local50 < 64; local50++) {
					@Pc(61) float local61 = (float) local50 * 2.0F / 64.0F - 1.0F;
					@Pc(70) float local70 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local70 * local70 + local61 * local61 + 1.0F)));
					@Pc(89) float local89 = local70 * local85;
					@Pc(93) float local93 = local61 * local85;
					for (@Pc(95) int local95 = 0; local95 < 6; local95++) {
						@Pc(111) float local111;
						if (local95 == 0) {
							local111 = -local93;
						} else if (local95 == 1) {
							local111 = local93;
						} else if (local95 == 2) {
							local111 = local89;
						} else if (local95 == 3) {
							local111 = -local89;
						} else if (local95 == 4) {
							local111 = local85;
						} else {
							local111 = -local85;
						}
						@Pc(164) int local164;
						@Pc(173) int local173;
						@Pc(182) int local182;
						if (local111 > 0.0F) {
							local164 = (int) (Math.pow((double) local111, 96.0D) * (double) local30);
							local173 = (int) ((double) local30 * Math.pow((double) local111, 36.0D));
							local182 = (int) ((double) local30 * Math.pow((double) local111, 12.0D));
						} else {
							local182 = 0;
							local173 = 0;
							local164 = 0;
						}
						local38[local95][local44] = (byte) local164;
						local42[local95][local44] = (byte) local173;
						local34[local95][local44] = (byte) local182;
					}
					local44++;
				}
			}
			this.aClass44_Sub2Array1 = new Class44_Sub2[3];
			this.aClass44_Sub2Array1[0] = new Class44_Sub2(super.aClass75_Sub3_41, 6406, 64, false, local38, 6406);
			this.aClass44_Sub2Array1[1] = new Class44_Sub2(super.aClass75_Sub3_41, 6406, 64, false, local42, 6406);
			this.aClass44_Sub2Array1[2] = new Class44_Sub2(super.aClass75_Sub3_41, 6406, 64, false, local34, 6406);
			this.method1980();
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8635(@OriginalArg(0) boolean arg0) {
		if (this.aClass203_1 == null || !arg0) {
			super.aClass75_Sub3_41.method5806(0, 34168);
			return;
		}
		if (!this.aBoolean171) {
			super.aClass75_Sub3_41.method5775(2);
			super.aClass75_Sub3_41.method5774(super.aClass75_Sub3_41.aClass44_Sub1_3);
			super.aClass75_Sub3_41.method5775(0);
		}
		this.aClass203_1.method4855('\u0000');
		this.aBoolean172 = true;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
	private void method1980() {
		this.aClass203_1 = new Class203(super.aClass75_Sub3_41, 2);
		this.aClass203_1.method4857(0);
		super.aClass75_Sub3_41.method5775(1);
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
		if (this.aBoolean171) {
			super.aClass75_Sub3_41.method5784(7681, 260);
			super.aClass75_Sub3_41.method5825(770, 0, 5890);
			super.aClass75_Sub3_41.method5806(0, 34167);
		} else {
			super.aClass75_Sub3_41.method5784(8448, 7681);
			super.aClass75_Sub3_41.method5825(768, 0, 34168);
			super.aClass75_Sub3_41.method5775(2);
			super.aClass75_Sub3_41.method5784(7681, 260);
			super.aClass75_Sub3_41.method5825(768, 0, 34168);
			super.aClass75_Sub3_41.method5825(770, 1, 34168);
			super.aClass75_Sub3_41.method5806(0, 34167);
		}
		super.aClass75_Sub3_41.method5775(0);
		this.aClass203_1.method4854();
		this.aClass203_1.method4857(1);
		super.aClass75_Sub3_41.method5775(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean171) {
			super.aClass75_Sub3_41.method5784(8448, 8448);
			super.aClass75_Sub3_41.method5825(768, 0, 5890);
			super.aClass75_Sub3_41.method5806(0, 5890);
		} else {
			super.aClass75_Sub3_41.method5784(8448, 8448);
			super.aClass75_Sub3_41.method5825(768, 0, 5890);
			super.aClass75_Sub3_41.method5775(2);
			super.aClass75_Sub3_41.method5784(8448, 8448);
			super.aClass75_Sub3_41.method5825(768, 0, 5890);
			super.aClass75_Sub3_41.method5825(768, 1, 34168);
			super.aClass75_Sub3_41.method5806(0, 5890);
		}
		super.aClass75_Sub3_41.method5775(0);
		this.aClass203_1.method4854();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	@Override
	public void method8638() {
		if (this.aBoolean172) {
			if (!this.aBoolean171) {
				super.aClass75_Sub3_41.method5775(2);
				super.aClass75_Sub3_41.method5774((Class44) null);
			}
			super.aClass75_Sub3_41.method5775(1);
			super.aClass75_Sub3_41.method5774((Class44) null);
			super.aClass75_Sub3_41.method5775(0);
			this.aClass203_1.method4855('\u0001');
			this.aBoolean172 = false;
		} else {
			super.aClass75_Sub3_41.method5806(0, 5890);
		}
		super.aClass75_Sub3_41.method5784(8448, 8448);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8637() {
		return true;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8632(@OriginalArg(0) boolean arg0) {
		super.aClass75_Sub3_41.method5784(7681, 8448);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean172) {
			super.aClass75_Sub3_41.method5775(1);
			super.aClass75_Sub3_41.method5774(this.aClass44_Sub2Array1[arg0 - 1]);
			super.aClass75_Sub3_41.method5775(0);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZLclient!ica;)V")
	@Override
	public void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		super.aClass75_Sub3_41.method5774(arg1);
		super.aClass75_Sub3_41.method5787(arg0);
	}
}
