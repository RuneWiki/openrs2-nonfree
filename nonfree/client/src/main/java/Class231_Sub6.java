import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class231_Sub6 extends Class231 {

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "Lclient!nc;")
	private Class243 aClass243_5;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "Z")
	private boolean aBoolean804 = false;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "Z")
	private boolean aBoolean803;

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "[Lclient!maa;")
	private Class80_Sub4[] aClass80_Sub4Array1;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class231_Sub6(@OriginalArg(0) Class65_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean109) {
			this.aBoolean803 = arg0.anInt1397 < 3;
			@Pc(24) int local24 = this.aBoolean803 ? 48 : 127;
			@Pc(28) byte[][] local28 = new byte[6][4096];
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
					@Pc(53) float local53 = (float) local40 * 2.0F / 64.0F - 1.0F;
					@Pc(62) float local62 = (float) local43 * 2.0F / 64.0F - 1.0F;
					@Pc(77) float local77 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local62 * local62 + 1.0F)));
					@Pc(81) float local81 = local53 * local77;
					@Pc(85) float local85 = local62 * local77;
					for (@Pc(87) int local87 = 0; local87 < 6; local87++) {
						@Pc(93) float local93;
						if (local87 == 0) {
							local93 = -local85;
						} else if (local87 == 1) {
							local93 = local85;
						} else if (local87 == 2) {
							local93 = local81;
						} else if (local87 == 3) {
							local93 = -local81;
						} else if (local87 == 4) {
							local93 = local77;
						} else {
							local93 = -local77;
						}
						@Pc(137) int local137;
						@Pc(146) int local146;
						@Pc(155) int local155;
						if (local93 > 0.0F) {
							local137 = (int) (Math.pow((double) local93, 96.0D) * (double) local24);
							local146 = (int) ((double) local24 * Math.pow((double) local93, 36.0D));
							local155 = (int) ((double) local24 * Math.pow((double) local93, 12.0D));
						} else {
							local155 = 0;
							local146 = 0;
							local137 = 0;
						}
						local32[local87][local38] = (byte) local137;
						local36[local87][local38] = (byte) local146;
						local28[local87][local38] = (byte) local155;
					}
					local38++;
				}
			}
			this.aClass80_Sub4Array1 = new Class80_Sub4[3];
			this.aClass80_Sub4Array1[0] = new Class80_Sub4(super.aClass65_Sub1_41, 6406, 64, false, local32, 6406);
			this.aClass80_Sub4Array1[1] = new Class80_Sub4(super.aClass65_Sub1_41, 6406, 64, false, local36, 6406);
			this.aClass80_Sub4Array1[2] = new Class80_Sub4(super.aClass65_Sub1_41, 6406, 64, false, local28, 6406);
			this.method8020();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8713(@OriginalArg(1) boolean arg0) {
		if (this.aClass243_5 == null || !arg0) {
			super.aClass65_Sub1_41.method1233(0, 34168);
			return;
		}
		if (!this.aBoolean803) {
			super.aClass65_Sub1_41.method1256(2);
			super.aClass65_Sub1_41.method1286(super.aClass65_Sub1_41.aClass80_Sub2_1);
			super.aClass65_Sub1_41.method1256(0);
		}
		this.aClass243_5.method5740('\u0000');
		this.aBoolean804 = true;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
	@Override
	public void method8716() {
		if (this.aBoolean804) {
			if (!this.aBoolean803) {
				super.aClass65_Sub1_41.method1256(2);
				super.aClass65_Sub1_41.method1286((Class80) null);
			}
			super.aClass65_Sub1_41.method1256(1);
			super.aClass65_Sub1_41.method1286((Class80) null);
			super.aClass65_Sub1_41.method1256(0);
			this.aClass243_5.method5740('\u0001');
			this.aBoolean804 = false;
		} else {
			super.aClass65_Sub1_41.method1233(0, 5890);
		}
		super.aClass65_Sub1_41.method1228(8448, 8448);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V")
	@Override
	public void method8715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean804) {
			super.aClass65_Sub1_41.method1256(1);
			super.aClass65_Sub1_41.method1286(this.aClass80_Sub4Array1[arg1 - 1]);
			super.aClass65_Sub1_41.method1256(0);
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8717(@OriginalArg(1) boolean arg0) {
		super.aClass65_Sub1_41.method1228(8448, 7681);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!wj;II)V")
	@Override
	public void method8712(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1) {
		super.aClass65_Sub1_41.method1286(arg0);
		super.aClass65_Sub1_41.method1290(arg1);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8714() {
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V")
	private void method8020() {
		this.aClass243_5 = new Class243(super.aClass65_Sub1_41, 2);
		this.aClass243_5.method5742(0);
		super.aClass65_Sub1_41.method1256(1);
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
		if (this.aBoolean803) {
			super.aClass65_Sub1_41.method1228(260, 7681);
			super.aClass65_Sub1_41.method1265(0, 770, 5890);
			super.aClass65_Sub1_41.method1233(0, 34167);
		} else {
			super.aClass65_Sub1_41.method1228(7681, 8448);
			super.aClass65_Sub1_41.method1265(0, 768, 34168);
			super.aClass65_Sub1_41.method1256(2);
			super.aClass65_Sub1_41.method1228(260, 7681);
			super.aClass65_Sub1_41.method1265(0, 768, 34168);
			super.aClass65_Sub1_41.method1265(1, 770, 34168);
			super.aClass65_Sub1_41.method1233(0, 34167);
		}
		super.aClass65_Sub1_41.method1256(0);
		this.aClass243_5.method5741();
		this.aClass243_5.method5742(1);
		super.aClass65_Sub1_41.method1256(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean803) {
			super.aClass65_Sub1_41.method1228(8448, 8448);
			super.aClass65_Sub1_41.method1265(0, 768, 5890);
			super.aClass65_Sub1_41.method1233(0, 5890);
		} else {
			super.aClass65_Sub1_41.method1228(8448, 8448);
			super.aClass65_Sub1_41.method1265(0, 768, 5890);
			super.aClass65_Sub1_41.method1256(2);
			super.aClass65_Sub1_41.method1228(8448, 8448);
			super.aClass65_Sub1_41.method1265(0, 768, 5890);
			super.aClass65_Sub1_41.method1265(1, 768, 34168);
			super.aClass65_Sub1_41.method1233(0, 5890);
		}
		super.aClass65_Sub1_41.method1256(0);
		this.aClass243_5.method5741();
	}
}
