import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
	private int anInt2255 = 4096;

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
	private int anInt2252 = 2048;

	@OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
	private int anInt2261 = 8192;

	@OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
	private int anInt2260 = 0;

	@OriginalMember(owner = "client!jf", name = "mb", descriptor = "I")
	private int anInt2269 = 12288;

	@OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
	private int anInt2266 = 2048;

	@OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
	private int anInt2257 = 0;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(IBI)Z")
	private boolean method1597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = this.anInt2269 * (arg1 + arg0) >> 12;
		@Pc(31) int local31 = Static135.anIntArray331[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt2269;
		@Pc(45) int local45 = (local38 << 12) / this.anInt2261;
		@Pc(52) int local52 = this.anInt2255 * local45 >> 12;
		return arg1 - arg0 < local52 && -local52 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		Static94.method1641();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2252 = arg0.method163();
		} else if (arg1 == 1) {
			this.anInt2260 = arg0.method163();
		} else if (arg1 == 2) {
			this.anInt2257 = arg0.method163();
		} else if (arg1 == 3) {
			this.anInt2266 = arg0.method163();
		} else if (arg1 == 4) {
			this.anInt2269 = arg0.method163();
		} else if (arg1 == 5) {
			this.anInt2255 = arg0.method163();
		} else if (arg1 == 6) {
			this.anInt2261 = arg0.method163();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(27) int local27 = Static97.anIntArray240[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static62.anInt1675; local29++) {
				@Pc(37) int local37 = Static20.anIntArray45[local29] - 2048;
				@Pc(42) int local42 = local37 + this.anInt2252;
				@Pc(47) int local47 = this.anInt2260 + local27;
				@Pc(58) int local58 = local47 >= -2048 ? local47 : local47 + 4096;
				@Pc(69) int local69 = local58 > 2048 ? local58 - 4096 : local58;
				@Pc(78) int local78 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(89) int local89 = local78 <= 2048 ? local78 : local78 - 4096;
				@Pc(94) int local94 = this.anInt2266 + local27;
				@Pc(103) int local103 = local94 < -2048 ? local94 + 4096 : local94;
				@Pc(112) int local112 = local103 <= 2048 ? local103 : local103 - 4096;
				@Pc(117) int local117 = this.anInt2257 + local37;
				@Pc(126) int local126 = local117 >= -2048 ? local117 : local117 + 4096;
				@Pc(137) int local137 = local126 <= 2048 ? local126 : local126 - 4096;
				local11[local29] = this.method1604(local89, local69) || this.method1597(local137, local112) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(III)Z")
	private boolean method1604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = (arg1 - arg0) * this.anInt2269 >> 12;
		@Pc(31) int local31 = Static135.anIntArray331[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt2269;
		@Pc(45) int local45 = (local38 << 12) / this.anInt2261;
		@Pc(52) int local52 = this.anInt2255 * local45 >> 12;
		return local52 > arg0 + arg1 && -local52 < arg1 + arg0;
	}
}
