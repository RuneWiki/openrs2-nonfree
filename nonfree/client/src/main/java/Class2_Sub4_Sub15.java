import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class2_Sub4_Sub15 extends Class2_Sub4 {

	@OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
	private int anInt2091 = 12288;

	@OriginalMember(owner = "client!je", name = "fb", descriptor = "I")
	private int anInt2097 = 4096;

	@OriginalMember(owner = "client!je", name = "V", descriptor = "I")
	private int anInt2087 = 8192;

	@OriginalMember(owner = "client!je", name = "ib", descriptor = "I")
	private int anInt2099 = 0;

	@OriginalMember(owner = "client!je", name = "hb", descriptor = "I")
	private int anInt2098 = 0;

	@OriginalMember(owner = "client!je", name = "kb", descriptor = "I")
	private int anInt2101 = 2048;

	@OriginalMember(owner = "client!je", name = "ob", descriptor = "I")
	private int anInt2104 = 2048;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2104 = arg1.method1557();
		} else if (arg0 == 1) {
			this.anInt2098 = arg1.method1557();
		} else if (arg0 == 2) {
			this.anInt2099 = arg1.method1557();
		} else if (arg0 == 3) {
			this.anInt2101 = arg1.method1557();
		} else if (arg0 == 4) {
			this.anInt2091 = arg1.method1557();
		} else if (arg0 == 5) {
			this.anInt2097 = arg1.method1557();
		} else if (arg0 == 6) {
			this.anInt2087 = arg1.method1557();
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(21) int local21 = Static2.anIntArray5[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static118.anInt2608; local23++) {
				@Pc(30) int local30 = this.anInt2098 + local21;
				@Pc(39) int local39 = local30 < -2048 ? local30 + 4096 : local30;
				@Pc(50) int local50 = local39 <= 2048 ? local39 : local39 - 4096;
				@Pc(55) int local55 = this.anInt2101 + local21;
				@Pc(61) int local61 = Static141.anIntArray130[local23] - 2048;
				@Pc(66) int local66 = local61 + this.anInt2099;
				@Pc(75) int local75 = local55 < -2048 ? local55 + 4096 : local55;
				@Pc(80) int local80 = this.anInt2104 + local61;
				@Pc(89) int local89 = local66 >= -2048 ? local66 : local66 + 4096;
				@Pc(98) int local98 = local89 <= 2048 ? local89 : local89 - 4096;
				@Pc(109) int local109 = local75 > 2048 ? local75 - 4096 : local75;
				@Pc(118) int local118 = local80 < -2048 ? local80 + 4096 : local80;
				@Pc(127) int local127 = local118 > 2048 ? local118 - 4096 : local118;
				local11[local23] = this.method1431(local127, local50) || this.method1430(local98, local109) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		Static172.method516();
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(III)Z")
	private boolean method1430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt2091 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static63.anIntArray104[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt2091;
		@Pc(36) int local36 = (local29 << 12) / this.anInt2087;
		@Pc(43) int local43 = local36 * this.anInt2097 >> 12;
		return local43 > arg1 - arg0 && -local43 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)Z")
	private boolean method1431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg1 - arg0) * this.anInt2091 >> 12;
		@Pc(22) int local22 = Static63.anIntArray104[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt2091;
		@Pc(36) int local36 = (local29 << 12) / this.anInt2087;
		@Pc(49) int local49 = local36 * this.anInt2097 >> 12;
		return local49 > arg0 + arg1 && -local49 < arg0 + arg1;
	}
}
