import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class4_Sub3_Sub13 extends Class4_Sub3 {

	@OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
	private int anInt2756 = 8192;

	@OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
	private int anInt2759 = 2048;

	@OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
	private int anInt2763 = 2048;

	@OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
	private int anInt2760 = 0;

	@OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
	private int anInt2755 = 0;

	@OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
	private int anInt2758 = 12288;

	@OriginalMember(owner = "client!gp", name = "V", descriptor = "I")
	private int anInt2769 = 4096;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2759 = arg1.method4560();
		} else if (arg0 == 1) {
			this.anInt2755 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt2760 = arg1.method4560();
		} else if (arg0 == 3) {
			this.anInt2763 = arg1.method4560();
		} else if (arg0 == 4) {
			this.anInt2758 = arg1.method4560();
		} else if (arg0 == 5) {
			this.anInt2769 = arg1.method4560();
		} else if (arg0 == 6) {
			this.anInt2756 = arg1.method4560();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBI)Z")
	private boolean method2488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt2758 * (arg0 - arg1) >> 12;
		@Pc(22) int local22 = Static131.anIntArray179[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local22 << 12) / this.anInt2758;
		@Pc(41) int local41 = (local34 << 12) / this.anInt2756;
		@Pc(48) int local48 = local41 * this.anInt2769 >> 12;
		return local48 > arg1 + arg0 && arg1 + arg0 > -local48;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(III)Z")
	private boolean method2489(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt2758 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static131.anIntArray179[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt2758;
		@Pc(36) int local36 = (local29 << 12) / this.anInt2756;
		@Pc(43) int local43 = this.anInt2769 * local36 >> 12;
		return arg1 - arg0 < local43 && arg1 - arg0 > -local43;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(21) int local21 = Static376.anIntArray531[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static304.anInt5637; local23++) {
				@Pc(31) int local31 = Static231.anIntArray368[local23] - 2048;
				@Pc(37) int local37 = local31 + this.anInt2759;
				@Pc(48) int local48 = local37 < -2048 ? local37 + 4096 : local37;
				@Pc(57) int local57 = local48 > 2048 ? local48 - 4096 : local48;
				@Pc(62) int local62 = this.anInt2755 + local21;
				@Pc(71) int local71 = local62 < -2048 ? local62 + 4096 : local62;
				@Pc(82) int local82 = local71 <= 2048 ? local71 : local71 - 4096;
				@Pc(87) int local87 = local31 + this.anInt2760;
				@Pc(96) int local96 = local87 >= -2048 ? local87 : local87 + 4096;
				@Pc(105) int local105 = local96 <= 2048 ? local96 : local96 - 4096;
				@Pc(111) int local111 = local21 + this.anInt2763;
				@Pc(122) int local122 = local111 < -2048 ? local111 + 4096 : local111;
				@Pc(133) int local133 = local122 <= 2048 ? local122 : local122 - 4096;
				local11[local23] = this.method2488(local82, local57) || this.method2489(local105, local133) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		Static58.method1272();
	}
}
