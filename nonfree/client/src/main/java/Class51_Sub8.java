import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class51_Sub8 extends Class51 {

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Lclient!bf;")
	private Class18 aClass18_6;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Z")
	private boolean aBoolean411 = false;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Z")
	private boolean aBoolean412;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "[Lclient!lm;")
	private Class42_Sub3[] aClass42_Sub3Array1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class51_Sub8(@OriginalArg(0) Class75_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean234) {
			this.aBoolean412 = arg0.anInt3105 < 3;
			@Pc(24) int local24 = this.aBoolean412 ? 48 : 127;
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
						@Pc(96) float local96;
						if (local87 == 0) {
							local96 = -local85;
						} else if (local87 == 1) {
							local96 = local85;
						} else if (local87 == 2) {
							local96 = local81;
						} else if (local87 == 3) {
							local96 = -local81;
						} else if (local87 == 4) {
							local96 = local77;
						} else {
							local96 = -local77;
						}
						@Pc(137) int local137;
						@Pc(136) int local136;
						@Pc(134) int local134;
						if (local96 > 0.0F) {
							local137 = (int) (Math.pow((double) local96, 96.0D) * (double) local24);
							local136 = (int) (Math.pow((double) local96, 36.0D) * (double) local24);
							local134 = (int) ((double) local24 * Math.pow((double) local96, 12.0D));
						} else {
							local134 = 0;
							local136 = 0;
							local137 = 0;
						}
						local32[local87][local38] = (byte) local137;
						local36[local87][local38] = (byte) local136;
						local28[local87][local38] = (byte) local134;
					}
					local38++;
				}
			}
			this.aClass42_Sub3Array1 = new Class42_Sub3[3];
			this.aClass42_Sub3Array1[0] = new Class42_Sub3(super.aClass75_Sub2_39, 6406, 64, false, local32, 6406);
			this.aClass42_Sub3Array1[1] = new Class42_Sub3(super.aClass75_Sub2_39, 6406, 64, false, local36, 6406);
			this.aClass42_Sub3Array1[2] = new Class42_Sub3(super.aClass75_Sub2_39, 6406, 64, false, local28, 6406);
			this.method4636();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)V")
	@Override
	public void method4958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean411) {
			super.aClass75_Sub2_39.method2426(1);
			super.aClass75_Sub2_39.method2456(this.aClass42_Sub3Array1[arg0 - 1]);
			super.aClass75_Sub2_39.method2426(0);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	@Override
	public void method4957() {
		if (this.aBoolean411) {
			if (!this.aBoolean412) {
				super.aClass75_Sub2_39.method2426(2);
				super.aClass75_Sub2_39.method2456(null);
			}
			super.aClass75_Sub2_39.method2426(1);
			super.aClass75_Sub2_39.method2456(null);
			super.aClass75_Sub2_39.method2426(0);
			this.aClass18_6.method720('\u0001');
			this.aBoolean411 = false;
		} else {
			super.aClass75_Sub2_39.method2460(5890, 0);
		}
		super.aClass75_Sub2_39.method2479(8448, 8448);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!rh;II)V")
	@Override
	public void method4960(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
		super.aClass75_Sub2_39.method2456(arg0);
		super.aClass75_Sub2_39.method2424(arg1);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4956(@OriginalArg(0) boolean arg0) {
		super.aClass75_Sub2_39.method2479(8448, 7681);
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	private void method4636() {
		this.aClass18_6 = new Class18(super.aClass75_Sub2_39, 2);
		this.aClass18_6.method718(0);
		super.aClass75_Sub2_39.method2426(1);
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
		if (this.aBoolean412) {
			super.aClass75_Sub2_39.method2479(260, 7681);
			super.aClass75_Sub2_39.method2466(5890, 0, 770);
			super.aClass75_Sub2_39.method2460(34167, 0);
		} else {
			super.aClass75_Sub2_39.method2479(7681, 8448);
			super.aClass75_Sub2_39.method2466(34168, 0, 768);
			super.aClass75_Sub2_39.method2426(2);
			super.aClass75_Sub2_39.method2479(260, 7681);
			super.aClass75_Sub2_39.method2466(34168, 0, 768);
			super.aClass75_Sub2_39.method2466(34168, 1, 770);
			super.aClass75_Sub2_39.method2460(34167, 0);
		}
		super.aClass75_Sub2_39.method2426(0);
		this.aClass18_6.method723();
		this.aClass18_6.method718(1);
		super.aClass75_Sub2_39.method2426(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean412) {
			super.aClass75_Sub2_39.method2479(8448, 8448);
			super.aClass75_Sub2_39.method2466(5890, 0, 768);
			super.aClass75_Sub2_39.method2460(5890, 0);
		} else {
			super.aClass75_Sub2_39.method2479(8448, 8448);
			super.aClass75_Sub2_39.method2466(5890, 0, 768);
			super.aClass75_Sub2_39.method2426(2);
			super.aClass75_Sub2_39.method2479(8448, 8448);
			super.aClass75_Sub2_39.method2466(5890, 0, 768);
			super.aClass75_Sub2_39.method2466(34168, 1, 768);
			super.aClass75_Sub2_39.method2460(5890, 0);
		}
		super.aClass75_Sub2_39.method2426(0);
		this.aClass18_6.method723();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4955() {
		return true;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4961(@OriginalArg(1) boolean arg0) {
		if (this.aClass18_6 == null || !arg0) {
			super.aClass75_Sub2_39.method2460(34168, 0);
			return;
		}
		if (!this.aBoolean412) {
			super.aClass75_Sub2_39.method2426(2);
			super.aClass75_Sub2_39.method2456(super.aClass75_Sub2_39.aClass42_Sub1_1);
			super.aClass75_Sub2_39.method2426(0);
		}
		this.aClass18_6.method720('\u0000');
		this.aBoolean411 = true;
	}
}
