import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dm", name = "N", descriptor = "I")
	private int anInt1202 = 2048;

	@OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
	private int anInt1200 = 4096;

	@OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
	private int anInt1196 = 2048;

	@OriginalMember(owner = "client!dm", name = "S", descriptor = "I")
	private int anInt1206 = 12288;

	@OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
	private int anInt1211 = 0;

	@OriginalMember(owner = "client!dm", name = "ab", descriptor = "I")
	private int anInt1214 = 8192;

	@OriginalMember(owner = "client!dm", name = "Y", descriptor = "I")
	private int anInt1212 = 0;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1202 = arg0.method1879();
		} else if (arg1 == 1) {
			this.anInt1212 = arg0.method1879();
		} else if (arg1 == 2) {
			this.anInt1211 = arg0.method1879();
		} else if (arg1 == 3) {
			this.anInt1196 = arg0.method1879();
		} else if (arg1 == 4) {
			this.anInt1206 = arg0.method1879();
		} else if (arg1 == 5) {
			this.anInt1200 = arg0.method1879();
		} else if (arg1 == 6) {
			this.anInt1214 = arg0.method1879();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(28) int local28 = Static10.anIntArray604[arg0] - 2048;
			for (@Pc(30) int local30 = 0; local30 < Static6.anInt4960; local30++) {
				@Pc(43) int local43 = Static298.anIntArray589[local30] - 2048;
				@Pc(48) int local48 = local43 + this.anInt1202;
				@Pc(59) int local59 = local48 >= -2048 ? local48 : local48 + 4096;
				@Pc(68) int local68 = local59 > 2048 ? local59 - 4096 : local59;
				@Pc(74) int local74 = local28 + this.anInt1212;
				@Pc(83) int local83 = local74 >= -2048 ? local74 : local74 + 4096;
				@Pc(88) int local88 = this.anInt1211 + local43;
				@Pc(94) int local94 = local28 + this.anInt1196;
				@Pc(103) int local103 = local83 > 2048 ? local83 - 4096 : local83;
				@Pc(114) int local114 = local88 < -2048 ? local88 + 4096 : local88;
				@Pc(123) int local123 = local114 <= 2048 ? local114 : local114 - 4096;
				@Pc(134) int local134 = local94 >= -2048 ? local94 : local94 + 4096;
				@Pc(143) int local143 = local134 > 2048 ? local134 - 4096 : local134;
				local17[local30] = this.method1013(local103, local68) || this.method1014(local123, local143) ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(III)Z")
	private boolean method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = (arg0 - arg1) * this.anInt1206 >> 12;
		@Pc(31) int local31 = Static192.anIntArray396[local21 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt1206;
		@Pc(45) int local45 = (local38 << 12) / this.anInt1214;
		@Pc(52) int local52 = this.anInt1200 * local45 >> 12;
		return local52 > arg0 + arg1 && arg0 + arg1 > -local52;
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(III)Z")
	private boolean method1014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt1206 >> 12;
		@Pc(22) int local22 = Static192.anIntArray396[local12 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local22 << 12) / this.anInt1206;
		@Pc(42) int local42 = (local35 << 12) / this.anInt1214;
		@Pc(49) int local49 = local42 * this.anInt1200 >> 12;
		return arg1 - arg0 < local49 && arg1 - arg0 > -local49;
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		Static129.method2272();
	}
}
