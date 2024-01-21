import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class3_Sub5_Sub7 extends Class3_Sub5 {

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
	private int anInt1246;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
	private int anInt1245;

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
	private int anInt1249;

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
	private int anInt1253;

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
	private int anInt1250;

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
	private int anInt1255;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
	private int anInt1248;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIB)Z")
	private boolean method844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt1255 * (arg0 + arg1) >> 12;
		@Pc(23) int local23 = Static48.anIntArray150[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local23 << 12) / this.anInt1255;
		@Pc(45) int local45 = (local38 << 12) / this.anInt1250;
		@Pc(52) int local52 = local45 * this.anInt1246 >> 12;
		return arg0 - arg1 < local52 && -local52 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(21) int local21 = Static94.anIntArray277[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static104.anInt2195; local23++) {
				@Pc(30) int local30 = local21 + this.anInt1253;
				@Pc(36) int local36 = Static124.anIntArray355[local23] - 2048;
				@Pc(45) int local45 = local30 >= -2048 ? local30 : local30 + 4096;
				@Pc(51) int local51 = local36 + this.anInt1249;
				@Pc(62) int local62 = local45 > 2048 ? local45 - 4096 : local45;
				@Pc(67) int local67 = this.anInt1245 + local21;
				@Pc(72) int local72 = local36 + this.anInt1248;
				@Pc(83) int local83 = local72 < -2048 ? local72 + 4096 : local72;
				@Pc(94) int local94 = local67 >= -2048 ? local67 : local67 + 4096;
				@Pc(103) int local103 = local83 <= 2048 ? local83 : local83 - 4096;
				@Pc(112) int local112 = local94 <= 2048 ? local94 : local94 - 4096;
				@Pc(123) int local123 = local51 >= -2048 ? local51 : local51 + 4096;
				@Pc(132) int local132 = local123 > 2048 ? local123 - 4096 : local123;
				local7[local23] = this.method845(local132, local62) || this.method844(local112, local103) ? 4096 : 0;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)Z")
	private boolean method845(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt1255 * (arg1 - arg0) >> 12;
		@Pc(31) int local31 = Static48.anIntArray150[local17 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt1255;
		@Pc(45) int local45 = (local38 << 12) / this.anInt1250;
		@Pc(52) int local52 = this.anInt1246 * local45 >> 12;
		return local52 > arg1 + arg0 && -local52 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		Static153.method447();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt1249 = arg1.method2111();
		} else if (arg0 == 1) {
			this.anInt1253 = arg1.method2111();
		} else if (arg0 == 2) {
			this.anInt1248 = arg1.method2111();
		} else if (arg0 == 3) {
			this.anInt1245 = arg1.method2111();
		} else if (arg0 == 4) {
			this.anInt1255 = arg1.method2111();
		} else if (arg0 == 5) {
			this.anInt1246 = arg1.method2111();
		} else if (arg0 == 6) {
			this.anInt1250 = arg1.method2111();
		}
	}
}
