import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class76_Sub5 extends Class76 {

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "[I")
	public static final int[] anIntArray346 = new int[4096];

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "Lclient!cn;")
	private Class46 aClass46_3;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Z")
	private boolean aBoolean345 = false;

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "Z")
	private boolean aBoolean346;

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "[Lclient!nm;")
	private Class21_Sub4[] aClass21_Sub4Array1;

	static {
		for (@Pc(10) int local10 = 0; local10 < 4096; local10++) {
			anIntArray346[local10] = Static349.method4992(local10);
		}
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class76_Sub5(@OriginalArg(0) Class121_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean480) {
			this.aBoolean346 = arg0.anInt5957 < 3;
			@Pc(28) int local28 = this.aBoolean346 ? 48 : 127;
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
						@Pc(116) float local116;
						if (local93 == 0) {
							local116 = -local91;
						} else if (local93 == 1) {
							local116 = local91;
						} else if (local93 == 2) {
							local116 = local87;
						} else if (local93 == 3) {
							local116 = -local87;
						} else if (local93 == 4) {
							local116 = local83;
						} else {
							local116 = -local83;
						}
						@Pc(148) int local148;
						@Pc(147) int local147;
						@Pc(145) int local145;
						if (local116 > 0.0F) {
							local148 = (int) (Math.pow((double) local116, 96.0D) * (double) local28);
							local147 = (int) (Math.pow((double) local116, 36.0D) * (double) local28);
							local145 = (int) ((double) local28 * Math.pow((double) local116, 12.0D));
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
			this.aClass21_Sub4Array1 = new Class21_Sub4[3];
			this.aClass21_Sub4Array1[0] = new Class21_Sub4(super.aClass121_Sub2_39, 6406, 64, false, local36, 6406);
			this.aClass21_Sub4Array1[1] = new Class21_Sub4(super.aClass121_Sub2_39, 6406, 64, false, local40, 6406);
			this.aClass21_Sub4Array1[2] = new Class21_Sub4(super.aClass121_Sub2_39, 6406, 64, false, local32, 6406);
			this.method3623();
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
	private void method3623() {
		this.aClass46_3 = new Class46(super.aClass121_Sub2_39, 2);
		this.aClass46_3.method778(0);
		super.aClass121_Sub2_39.method4669(1);
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
		if (this.aBoolean346) {
			super.aClass121_Sub2_39.method4709(7681, 260);
			super.aClass121_Sub2_39.method4692(0, 5890, 770);
			super.aClass121_Sub2_39.method4673(0, 34167);
		} else {
			super.aClass121_Sub2_39.method4709(8448, 7681);
			super.aClass121_Sub2_39.method4692(0, 34168, 768);
			super.aClass121_Sub2_39.method4669(2);
			super.aClass121_Sub2_39.method4709(7681, 260);
			super.aClass121_Sub2_39.method4692(0, 34168, 768);
			super.aClass121_Sub2_39.method4692(1, 34168, 770);
			super.aClass121_Sub2_39.method4673(0, 34167);
		}
		super.aClass121_Sub2_39.method4669(0);
		this.aClass46_3.method779();
		this.aClass46_3.method778(1);
		super.aClass121_Sub2_39.method4669(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean346) {
			super.aClass121_Sub2_39.method4709(8448, 8448);
			super.aClass121_Sub2_39.method4692(0, 5890, 768);
			super.aClass121_Sub2_39.method4673(0, 5890);
		} else {
			super.aClass121_Sub2_39.method4709(8448, 8448);
			super.aClass121_Sub2_39.method4692(0, 5890, 768);
			super.aClass121_Sub2_39.method4669(2);
			super.aClass121_Sub2_39.method4709(8448, 8448);
			super.aClass121_Sub2_39.method4692(0, 5890, 768);
			super.aClass121_Sub2_39.method4692(1, 34168, 768);
			super.aClass121_Sub2_39.method4673(0, 5890);
		}
		super.aClass121_Sub2_39.method4669(0);
		this.aClass46_3.method779();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5611(@OriginalArg(0) boolean arg0) {
		if (this.aClass46_3 == null || !arg0) {
			super.aClass121_Sub2_39.method4673(0, 34168);
			return;
		}
		if (!this.aBoolean346) {
			super.aClass121_Sub2_39.method4669(2);
			super.aClass121_Sub2_39.method4681(super.aClass121_Sub2_39.aClass21_Sub2_3);
			super.aClass121_Sub2_39.method4669(0);
		}
		this.aClass46_3.method781('\u0000');
		this.aBoolean345 = true;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean345) {
			super.aClass121_Sub2_39.method4669(1);
			super.aClass121_Sub2_39.method4681(this.aClass21_Sub4Array1[arg1 - 1]);
			super.aClass121_Sub2_39.method4669(0);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5608(@OriginalArg(1) boolean arg0) {
		super.aClass121_Sub2_39.method4709(7681, 8448);
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
	@Override
	public void method5613() {
		if (this.aBoolean345) {
			if (!this.aBoolean346) {
				super.aClass121_Sub2_39.method4669(2);
				super.aClass121_Sub2_39.method4681(null);
			}
			super.aClass121_Sub2_39.method4669(1);
			super.aClass121_Sub2_39.method4681(null);
			super.aClass121_Sub2_39.method4669(0);
			this.aClass46_3.method781('\u0001');
			this.aBoolean345 = false;
		} else {
			super.aClass121_Sub2_39.method4673(0, 5890);
		}
		super.aClass121_Sub2_39.method4709(8448, 8448);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!go;B)V")
	@Override
	public void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1) {
		super.aClass121_Sub2_39.method4681(arg1);
		super.aClass121_Sub2_39.method4707(arg0);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5606() {
		return true;
	}
}
