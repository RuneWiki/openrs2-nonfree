import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class6_Sub1_Sub28 extends Class6_Sub1 {

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
	private int anInt4418 = 2048;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
	private int anInt4422 = 4096;

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
	private int anInt4424 = 0;

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
	private int anInt4425 = 8192;

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
	private int anInt4426 = 0;

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
	private int anInt4427 = 2048;

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
	private int anInt4419 = 12288;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)Z")
	private boolean method4195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt4419 * (arg0 + arg1) >> 12;
		@Pc(28) int local28 = Static313.anIntArray665[local12 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt4419;
		@Pc(42) int local42 = (local35 << 12) / this.anInt4425;
		@Pc(49) int local49 = local42 * this.anInt4422 >> 12;
		return arg0 - arg1 < local49 && arg0 - arg1 > -local49;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(28) int local28 = Static273.anIntArray703[arg0] - 2048;
			for (@Pc(30) int local30 = 0; local30 < Static299.anInt5659; local30++) {
				@Pc(38) int local38 = Static18.anIntArray32[local30] - 2048;
				@Pc(43) int local43 = local38 + this.anInt4418;
				@Pc(52) int local52 = local43 < -2048 ? local43 + 4096 : local43;
				@Pc(61) int local61 = local52 > 2048 ? local52 - 4096 : local52;
				@Pc(66) int local66 = local28 + this.anInt4424;
				@Pc(75) int local75 = local66 >= -2048 ? local66 : local66 + 4096;
				@Pc(86) int local86 = local75 > 2048 ? local75 - 4096 : local75;
				@Pc(91) int local91 = local38 + this.anInt4426;
				@Pc(102) int local102 = local91 < -2048 ? local91 + 4096 : local91;
				@Pc(113) int local113 = local102 <= 2048 ? local102 : local102 - 4096;
				@Pc(118) int local118 = this.anInt4427 + local28;
				@Pc(129) int local129 = local118 < -2048 ? local118 + 4096 : local118;
				@Pc(138) int local138 = local129 > 2048 ? local129 - 4096 : local129;
				local18[local30] = this.method4199(local86, local61) || this.method4195(local138, local113) ? 4096 : 0;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)Z")
	private boolean method4199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt4419 * (arg0 - arg1) >> 12;
		@Pc(31) int local31 = Static313.anIntArray665[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt4419;
		@Pc(45) int local45 = (local38 << 12) / this.anInt4425;
		@Pc(52) int local52 = local45 * this.anInt4422 >> 12;
		return arg0 + arg1 < local52 && -local52 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		Static86.method1476();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4418 = arg0.method4021();
		} else if (arg1 == 1) {
			this.anInt4424 = arg0.method4021();
		} else if (arg1 == 2) {
			this.anInt4426 = arg0.method4021();
		} else if (arg1 == 3) {
			this.anInt4427 = arg0.method4021();
		} else if (arg1 == 4) {
			this.anInt4419 = arg0.method4021();
		} else if (arg1 == 5) {
			this.anInt4422 = arg0.method4021();
		} else if (arg1 == 6) {
			this.anInt4425 = arg0.method4021();
		}
	}
}
