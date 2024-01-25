import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class206 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "[Lclient!ej;")
	public Class62[] aClass62Array1;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray76;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
	public int[] anIntArray527;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
	public int[] anIntArray528;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
	public int anInt6422;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
	public int anInt6423;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "Lclient!ej;")
	public Class62 aClass62_1;

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "[I")
	public int[] anIntArray530;

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "[I")
	public int[] anIntArray531;

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray77;

	@OriginalMember(owner = "client!vk", name = "q", descriptor = "[I")
	public int[] anIntArray532;

	@OriginalMember(owner = "client!vk", name = "r", descriptor = "[I")
	public int[] anIntArray533;

	@OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
	public int anInt6427;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public final int anInt6420;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([BI)V")
	public Class206(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6420 = Static32.method459(arg0.length, arg0);
		if (this.anInt6420 != arg1) {
			throw new RuntimeException();
		}
		this.method5480(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I[B)V")
	private void method5480(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class11_Sub25 local12 = new Class11_Sub25(Static92.method1343(arg0));
		@Pc(16) int local16 = local12.method5185();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt6427 = local12.method5198();
		} else {
			this.anInt6427 = 0;
		}
		@Pc(49) int local49 = local12.method5185();
		this.anInt6423 = local12.method5187();
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = -1;
		this.anIntArray528 = new int[this.anInt6423];
		for (@Pc(65) int local65 = 0; local65 < this.anInt6423; local65++) {
			this.anIntArray528[local65] = local56 += local12.method5187();
			if (local58 < this.anIntArray528[local65]) {
				local58 = this.anIntArray528[local65];
			}
		}
		this.anInt6422 = local58 + 1;
		this.anIntArray532 = new int[this.anInt6422];
		this.anIntArrayArray77 = new int[this.anInt6422][];
		this.anIntArray527 = new int[this.anInt6422];
		this.anIntArray533 = new int[this.anInt6422];
		this.anIntArray531 = new int[this.anInt6422];
		@Pc(142) int local142;
		@Pc(160) int local160;
		if (local49 != 0) {
			this.anIntArray530 = new int[this.anInt6422];
			for (local142 = 0; local142 < this.anInt6422; local142++) {
				this.anIntArray530[local142] = -1;
			}
			for (local160 = 0; local160 < this.anInt6423; local160++) {
				this.anIntArray530[this.anIntArray528[local160]] = local12.method5198();
			}
			this.aClass62_1 = new Class62(this.anIntArray530);
		}
		for (local142 = 0; local142 < this.anInt6423; local142++) {
			this.anIntArray533[this.anIntArray528[local142]] = local12.method5198();
		}
		for (local160 = 0; local160 < this.anInt6423; local160++) {
			this.anIntArray527[this.anIntArray528[local160]] = local12.method5198();
		}
		for (@Pc(228) int local228 = 0; local228 < this.anInt6423; local228++) {
			this.anIntArray532[this.anIntArray528[local228]] = local12.method5187();
		}
		@Pc(263) int local263;
		@Pc(270) int local270;
		@Pc(278) int local278;
		@Pc(280) int local280;
		@Pc(297) int local297;
		for (@Pc(256) int local256 = 0; local256 < this.anInt6423; local256++) {
			local263 = this.anIntArray528[local256];
			local56 = 0;
			local270 = this.anIntArray532[local263];
			this.anIntArrayArray77[local263] = new int[local270];
			local278 = -1;
			for (local280 = 0; local280 < local270; local280++) {
				local297 = this.anIntArrayArray77[local263][local280] = local56 += local12.method5187();
				if (local297 > local278) {
					local278 = local297;
				}
			}
			this.anIntArray531[local263] = local278 + 1;
			if (local278 + 1 == local270) {
				this.anIntArrayArray77[local263] = null;
			}
		}
		if (local49 == 0) {
			return;
		}
		this.aClass62Array1 = new Class62[local58 + 1];
		this.anIntArrayArray76 = new int[local58 + 1][];
		for (local263 = 0; local263 < this.anInt6423; local263++) {
			local270 = this.anIntArray528[local263];
			local278 = this.anIntArray532[local270];
			this.anIntArrayArray76[local270] = new int[this.anIntArray531[local270]];
			for (local280 = 0; local280 < this.anIntArray531[local270]; local280++) {
				this.anIntArrayArray76[local270][local280] = -1;
			}
			for (local297 = 0; local297 < local278; local297++) {
				@Pc(411) int local411;
				if (this.anIntArrayArray77[local270] == null) {
					local411 = local297;
				} else {
					local411 = this.anIntArrayArray77[local270][local297];
				}
				this.anIntArrayArray76[local270][local411] = local12.method5198();
			}
			this.aClass62Array1[local270] = new Class62(this.anIntArrayArray76[local270]);
		}
	}
}
