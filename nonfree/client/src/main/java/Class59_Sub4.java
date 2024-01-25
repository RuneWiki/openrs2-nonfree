import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class59_Sub4 extends Class59 {

	@OriginalMember(owner = "client!gu", name = "u", descriptor = "Lclient!vh;")
	private Class365 aClass365_4;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "Z")
	private boolean aBoolean295 = false;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "Z")
	private boolean aBoolean294;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "[Lclient!kk;")
	private Class10_Sub3[] aClass10_Sub3Array1;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class59_Sub4(@OriginalArg(0) Class13_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean106) {
			this.aBoolean294 = arg0.anInt1113 < 3;
			@Pc(24) int local24 = this.aBoolean294 ? 48 : 127;
			@Pc(28) byte[][] local28 = new byte[6][4096];
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
					@Pc(53) float local53 = (float) local43 * 2.0F / 64.0F - 1.0F;
					@Pc(62) float local62 = (float) local40 * 2.0F / 64.0F - 1.0F;
					@Pc(77) float local77 = (float) (1.0D / Math.sqrt((double) (local62 * local62 + local53 * local53 + 1.0F)));
					@Pc(81) float local81 = local62 * local77;
					@Pc(85) float local85 = local53 * local77;
					for (@Pc(87) int local87 = 0; local87 < 6; local87++) {
						@Pc(95) float local95;
						if (local87 == 0) {
							local95 = -local85;
						} else if (local87 == 1) {
							local95 = local85;
						} else if (local87 == 2) {
							local95 = local81;
						} else if (local87 == 3) {
							local95 = -local81;
						} else if (local87 == 4) {
							local95 = local77;
						} else {
							local95 = -local77;
						}
						@Pc(138) int local138;
						@Pc(137) int local137;
						@Pc(135) int local135;
						if (local95 > 0.0F) {
							local138 = (int) ((double) local24 * Math.pow((double) local95, 96.0D));
							local137 = (int) (Math.pow((double) local95, 36.0D) * (double) local24);
							local135 = (int) ((double) local24 * Math.pow((double) local95, 12.0D));
						} else {
							local135 = 0;
							local137 = 0;
							local138 = 0;
						}
						local32[local87][local38] = (byte) local138;
						local36[local87][local38] = (byte) local137;
						local28[local87][local38] = (byte) local135;
					}
					local38++;
				}
			}
			this.aClass10_Sub3Array1 = new Class10_Sub3[3];
			this.aClass10_Sub3Array1[0] = new Class10_Sub3(super.aClass13_Sub2_43, 6406, 64, false, local32, 6406);
			this.aClass10_Sub3Array1[1] = new Class10_Sub3(super.aClass13_Sub2_43, 6406, 64, false, local36, 6406);
			this.aClass10_Sub3Array1[2] = new Class10_Sub3(super.aClass13_Sub2_43, 6406, 64, false, local28, 6406);
			this.method3391();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
	@Override
	public void method8590() {
		if (this.aBoolean295) {
			if (!this.aBoolean294) {
				super.aClass13_Sub2_43.method1093(2);
				super.aClass13_Sub2_43.method1096((Class10) null);
			}
			super.aClass13_Sub2_43.method1093(1);
			super.aClass13_Sub2_43.method1096((Class10) null);
			super.aClass13_Sub2_43.method1093(0);
			this.aClass365_4.method8548('\u0001');
			this.aBoolean295 = false;
		} else {
			super.aClass13_Sub2_43.method1034(5890, 0);
		}
		super.aClass13_Sub2_43.method1045(8448, 8448);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8593(@OriginalArg(0) boolean arg0) {
		if (this.aClass365_4 == null || !arg0) {
			super.aClass13_Sub2_43.method1034(34168, 0);
			return;
		}
		if (!this.aBoolean294) {
			super.aClass13_Sub2_43.method1093(2);
			super.aClass13_Sub2_43.method1096(super.aClass13_Sub2_43.aClass10_Sub2_1);
			super.aClass13_Sub2_43.method1093(0);
		}
		this.aClass365_4.method8548('\u0000');
		this.aBoolean295 = true;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean295) {
			super.aClass13_Sub2_43.method1093(1);
			super.aClass13_Sub2_43.method1096(this.aClass10_Sub3Array1[arg1 - 1]);
			super.aClass13_Sub2_43.method1093(0);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8591(@OriginalArg(0) boolean arg0) {
		super.aClass13_Sub2_43.method1045(8448, 7681);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8588() {
		return true;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IILclient!cj;)V")
	@Override
	public void method8587(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
		super.aClass13_Sub2_43.method1096(arg1);
		super.aClass13_Sub2_43.method1046(arg0);
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V")
	private void method3391() {
		this.aClass365_4 = new Class365(super.aClass13_Sub2_43, 2);
		this.aClass365_4.method8546(0);
		super.aClass13_Sub2_43.method1093(1);
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
		if (this.aBoolean294) {
			super.aClass13_Sub2_43.method1045(260, 7681);
			super.aClass13_Sub2_43.method1021(5890, 770, 0);
			super.aClass13_Sub2_43.method1034(34167, 0);
		} else {
			super.aClass13_Sub2_43.method1045(7681, 8448);
			super.aClass13_Sub2_43.method1021(34168, 768, 0);
			super.aClass13_Sub2_43.method1093(2);
			super.aClass13_Sub2_43.method1045(260, 7681);
			super.aClass13_Sub2_43.method1021(34168, 768, 0);
			super.aClass13_Sub2_43.method1021(34168, 770, 1);
			super.aClass13_Sub2_43.method1034(34167, 0);
		}
		super.aClass13_Sub2_43.method1093(0);
		this.aClass365_4.method8549();
		this.aClass365_4.method8546(1);
		super.aClass13_Sub2_43.method1093(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean294) {
			super.aClass13_Sub2_43.method1045(8448, 8448);
			super.aClass13_Sub2_43.method1021(5890, 768, 0);
			super.aClass13_Sub2_43.method1034(5890, 0);
		} else {
			super.aClass13_Sub2_43.method1045(8448, 8448);
			super.aClass13_Sub2_43.method1021(5890, 768, 0);
			super.aClass13_Sub2_43.method1093(2);
			super.aClass13_Sub2_43.method1045(8448, 8448);
			super.aClass13_Sub2_43.method1021(5890, 768, 0);
			super.aClass13_Sub2_43.method1021(34168, 768, 1);
			super.aClass13_Sub2_43.method1034(5890, 0);
		}
		super.aClass13_Sub2_43.method1093(0);
		this.aClass365_4.method8549();
	}
}
