import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class2_Sub1_Sub23 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
	private int anInt2385;

	@OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
	private int anInt2383;

	@OriginalMember(owner = "client!lh", name = "jb", descriptor = "I")
	private int anInt2393;

	@OriginalMember(owner = "client!lh", name = "ib", descriptor = "I")
	private int anInt2392;

	@OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
	private int anInt2391;

	@OriginalMember(owner = "client!lh", name = "gb", descriptor = "I")
	private int anInt2390;

	@OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
	private int anInt2384;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2393 = arg0.method1397();
		} else if (arg1 == 1) {
			this.anInt2385 = arg0.method1397();
		} else if (arg1 == 2) {
			this.anInt2383 = arg0.method1397();
		} else if (arg1 == 3) {
			this.anInt2384 = arg0.method1397();
		} else if (arg1 == 4) {
			this.anInt2390 = arg0.method1397();
		} else if (arg1 == 5) {
			this.anInt2392 = arg0.method1397();
		} else if (arg1 == 6) {
			this.anInt2391 = arg0.method1397();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(29) int local29 = Static11.anIntArray8[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static120.anInt2812; local31++) {
				@Pc(39) int local39 = Static69.anIntArray117[local31] - 2048;
				@Pc(44) int local44 = this.anInt2393 + local39;
				@Pc(53) int local53 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(58) int local58 = local29 + this.anInt2385;
				@Pc(67) int local67 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(78) int local78 = local58 < -2048 ? local58 + 4096 : local58;
				@Pc(89) int local89 = local78 <= 2048 ? local78 : local78 - 4096;
				@Pc(95) int local95 = local39 + this.anInt2383;
				@Pc(104) int local104 = local95 < -2048 ? local95 + 4096 : local95;
				@Pc(110) int local110 = local29 + this.anInt2384;
				@Pc(121) int local121 = local110 >= -2048 ? local110 : local110 + 4096;
				@Pc(132) int local132 = local104 > 2048 ? local104 - 4096 : local104;
				@Pc(143) int local143 = local121 > 2048 ? local121 - 4096 : local121;
				local19[local31] = this.method1569(local89, local67) || this.method1567(local143, local132) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)Z")
	private boolean method1567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt2390 * (arg0 + arg1) >> 12;
		@Pc(28) int local28 = Static159.anIntArray376[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt2390;
		@Pc(42) int local42 = (local35 << 12) / this.anInt2391;
		@Pc(49) int local49 = this.anInt2392 * local42 >> 12;
		return arg0 - arg1 < local49 && -local49 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		Static51.method913();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBI)Z")
	private boolean method1569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = (arg0 - arg1) * this.anInt2390 >> 12;
		@Pc(18) int local18 = Static159.anIntArray376[local8 * 255 >> 12 & 0xFF];
		@Pc(25) int local25 = (local18 << 12) / this.anInt2390;
		@Pc(41) int local41 = (local25 << 12) / this.anInt2391;
		@Pc(48) int local48 = this.anInt2392 * local41 >> 12;
		return arg1 + arg0 < local48 && arg1 + arg0 > -local48;
	}
}
