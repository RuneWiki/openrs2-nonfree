import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class3_Sub4_Sub23 extends Class3_Sub4 {

	@OriginalMember(owner = "client!lu", name = "L", descriptor = "I")
	private int anInt4220 = 12288;

	@OriginalMember(owner = "client!lu", name = "N", descriptor = "I")
	private int anInt4222 = 0;

	@OriginalMember(owner = "client!lu", name = "W", descriptor = "I")
	private int anInt4229 = 2048;

	@OriginalMember(owner = "client!lu", name = "S", descriptor = "I")
	private int anInt4225 = 0;

	@OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
	private int anInt4223 = 4096;

	@OriginalMember(owner = "client!lu", name = "X", descriptor = "I")
	private int anInt4230 = 2048;

	@OriginalMember(owner = "client!lu", name = "bb", descriptor = "I")
	private int anInt4233 = 8192;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(III)Z")
	private boolean method3536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = (arg1 - arg0) * this.anInt4220 >> 12;
		@Pc(28) int local28 = Static331.anIntArray491[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt4220;
		@Pc(42) int local42 = (local35 << 12) / this.anInt4233;
		@Pc(49) int local49 = this.anInt4223 * local42 >> 12;
		return arg0 + arg1 < local49 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(29) int local29 = Static317.anIntArray337[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static148.anInt2687; local31++) {
				@Pc(39) int local39 = Static401.anIntArray419[local31] - 2048;
				@Pc(44) int local44 = local39 + this.anInt4230;
				@Pc(55) int local55 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(66) int local66 = local55 <= 2048 ? local55 : local55 - 4096;
				@Pc(72) int local72 = local29 + this.anInt4222;
				@Pc(83) int local83 = local72 < -2048 ? local72 + 4096 : local72;
				@Pc(94) int local94 = local83 <= 2048 ? local83 : local83 - 4096;
				@Pc(99) int local99 = this.anInt4225 + local39;
				@Pc(108) int local108 = local99 >= -2048 ? local99 : local99 + 4096;
				@Pc(119) int local119 = local108 <= 2048 ? local108 : local108 - 4096;
				@Pc(124) int local124 = local29 + this.anInt4229;
				@Pc(133) int local133 = local124 < -2048 ? local124 + 4096 : local124;
				@Pc(144) int local144 = local133 <= 2048 ? local133 : local133 - 4096;
				local19[local31] = this.method3536(local66, local94) || this.method3537(local119, local144) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(III)Z")
	private boolean method3537(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt4220 >> 12;
		@Pc(22) int local22 = Static331.anIntArray491[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt4220;
		@Pc(36) int local36 = (local29 << 12) / this.anInt4233;
		@Pc(43) int local43 = this.anInt4223 * local36 >> 12;
		return local43 > arg1 - arg0 && -local43 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		Static417.method5714();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4230 = arg0.method4083();
		} else if (arg1 == 1) {
			this.anInt4222 = arg0.method4083();
		} else if (arg1 == 2) {
			this.anInt4225 = arg0.method4083();
		} else if (arg1 == 3) {
			this.anInt4229 = arg0.method4083();
		} else if (arg1 == 4) {
			this.anInt4220 = arg0.method4083();
		} else if (arg1 == 5) {
			this.anInt4223 = arg0.method4083();
		} else if (arg1 == 6) {
			this.anInt4233 = arg0.method4083();
		}
	}
}
