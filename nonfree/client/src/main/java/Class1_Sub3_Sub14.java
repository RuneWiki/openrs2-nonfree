import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
	private int anInt2218 = 2048;

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
	private int anInt2224 = 0;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
	private int anInt2223 = 8192;

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
	private int anInt2217 = 12288;

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
	private int anInt2225 = 4096;

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
	private int anInt2227 = 2048;

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
	private int anInt2216 = 0;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(29) int local29 = Static342.anIntArray469[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static347.anInt5974; local31++) {
				@Pc(39) int local39 = Static384.anIntArray551[local31] - 2048;
				@Pc(44) int local44 = this.anInt2218 + local39;
				@Pc(53) int local53 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(62) int local62 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(67) int local67 = this.anInt2216 + local29;
				@Pc(76) int local76 = local67 >= -2048 ? local67 : local67 + 4096;
				@Pc(85) int local85 = local76 <= 2048 ? local76 : local76 - 4096;
				@Pc(91) int local91 = local39 + this.anInt2224;
				@Pc(100) int local100 = local91 < -2048 ? local91 + 4096 : local91;
				@Pc(111) int local111 = local100 > 2048 ? local100 - 4096 : local100;
				@Pc(116) int local116 = this.anInt2227 + local29;
				@Pc(127) int local127 = local116 < -2048 ? local116 + 4096 : local116;
				@Pc(138) int local138 = local127 > 2048 ? local127 - 4096 : local127;
				local19[local31] = this.method1860(local85, local62) || this.method1859(local111, local138) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2218 = arg0.method4093();
		} else if (arg1 == 1) {
			this.anInt2216 = arg0.method4093();
		} else if (arg1 == 2) {
			this.anInt2224 = arg0.method4093();
		} else if (arg1 == 3) {
			this.anInt2227 = arg0.method4093();
		} else if (arg1 == 4) {
			this.anInt2217 = arg0.method4093();
		} else if (arg1 == 5) {
			this.anInt2225 = arg0.method4093();
		} else if (arg1 == 6) {
			this.anInt2223 = arg0.method4093();
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		Static443.method5895();
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)Z")
	private boolean method1859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = (arg1 + arg0) * this.anInt2217 >> 12;
		@Pc(27) int local27 = Static292.anIntArray372[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt2217;
		@Pc(41) int local41 = (local34 << 12) / this.anInt2223;
		@Pc(48) int local48 = this.anInt2225 * local41 >> 12;
		return local48 > arg1 - arg0 && -local48 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(III)Z")
	private boolean method1860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt2217 >> 12;
		@Pc(23) int local23 = Static292.anIntArray372[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt2217;
		@Pc(37) int local37 = (local30 << 12) / this.anInt2223;
		@Pc(44) int local44 = this.anInt2225 * local37 >> 12;
		return arg0 + arg1 < local44 && -local44 < arg0 + arg1;
	}
}
