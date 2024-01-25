import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fq", name = "R", descriptor = "I")
	private int anInt2354 = 0;

	@OriginalMember(owner = "client!fq", name = "O", descriptor = "I")
	private int anInt2352 = 2048;

	@OriginalMember(owner = "client!fq", name = "V", descriptor = "I")
	private int anInt2358 = 12288;

	@OriginalMember(owner = "client!fq", name = "S", descriptor = "I")
	private int anInt2355 = 4096;

	@OriginalMember(owner = "client!fq", name = "X", descriptor = "I")
	private int anInt2360 = 8192;

	@OriginalMember(owner = "client!fq", name = "U", descriptor = "I")
	private int anInt2357 = 0;

	@OriginalMember(owner = "client!fq", name = "Z", descriptor = "I")
	private int anInt2362 = 2048;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		Static155.method2766();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt2352 = arg1.method5753();
		} else if (arg0 == 1) {
			this.anInt2357 = arg1.method5753();
		} else if (arg0 == 2) {
			this.anInt2354 = arg1.method5753();
		} else if (arg0 == 3) {
			this.anInt2362 = arg1.method5753();
		} else if (arg0 == 4) {
			this.anInt2358 = arg1.method5753();
		} else if (arg0 == 5) {
			this.anInt2355 = arg1.method5753();
		} else if (arg0 == 6) {
			this.anInt2360 = arg1.method5753();
		}
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(III)Z")
	private boolean method1900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = (arg0 + arg1) * this.anInt2358 >> 12;
		@Pc(29) int local29 = Static89.anIntArray149[local19 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt2358;
		@Pc(43) int local43 = (local36 << 12) / this.anInt2360;
		@Pc(50) int local50 = this.anInt2355 * local43 >> 12;
		return arg0 - arg1 < local50 && -local50 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(28) int local28 = Static229.anIntArray382[arg0] - 2048;
			for (@Pc(30) int local30 = 0; local30 < Static391.anInt7118; local30++) {
				@Pc(38) int local38 = Static167.anIntArray267[local30] - 2048;
				@Pc(44) int local44 = local38 + this.anInt2352;
				@Pc(53) int local53 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(62) int local62 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(67) int local67 = this.anInt2357 + local28;
				@Pc(76) int local76 = local67 >= -2048 ? local67 : local67 + 4096;
				@Pc(85) int local85 = local76 > 2048 ? local76 - 4096 : local76;
				@Pc(90) int local90 = this.anInt2354 + local38;
				@Pc(101) int local101 = local90 < -2048 ? local90 + 4096 : local90;
				@Pc(112) int local112 = local101 <= 2048 ? local101 : local101 - 4096;
				@Pc(117) int local117 = this.anInt2362 + local28;
				@Pc(128) int local128 = local117 >= -2048 ? local117 : local117 + 4096;
				@Pc(139) int local139 = local128 <= 2048 ? local128 : local128 - 4096;
				local18[local30] = this.method1902(local85, local62) || this.method1900(local139, local112) ? 4096 : 0;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "(III)Z")
	private boolean method1902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt2358 * (arg0 - arg1) >> 12;
		@Pc(28) int local28 = Static89.anIntArray149[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt2358;
		@Pc(42) int local42 = (local35 << 12) / this.anInt2360;
		@Pc(49) int local49 = local42 * this.anInt2355 >> 12;
		return local49 > arg0 + arg1 && -local49 < arg1 + arg0;
	}
}
