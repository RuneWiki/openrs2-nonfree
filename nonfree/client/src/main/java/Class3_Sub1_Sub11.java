import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
	private int anInt2053;

	@OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
	private int anInt2056;

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
	private int anInt2059;

	@OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
	private int anInt2060;

	@OriginalMember(owner = "client!id", name = "pb", descriptor = "I")
	private int anInt2067;

	@OriginalMember(owner = "client!id", name = "sb", descriptor = "I")
	private int anInt2069;

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
	private int anInt2054;

	@OriginalMember(owner = "client!id", name = "jb", descriptor = "I")
	private int anInt2062;

	@OriginalMember(owner = "client!id", name = "mb", descriptor = "I")
	private int anInt2065;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
	private void method1599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = arg1 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : arg1 * (arg2 + 4096) >> 12;
		if (local28 <= 0) {
			this.anInt2056 = this.anInt2053 = this.anInt2060 = arg1;
			return;
		}
		@Pc(47) int local47 = arg0 * 6;
		@Pc(55) int local55 = arg1 + arg1 - local28;
		@Pc(63) int local63 = (local28 - local55 << 12) / local28;
		@Pc(67) int local67 = local47 >> 12;
		@Pc(75) int local75 = local47 - (local67 << 12);
		@Pc(81) int local81 = local28 * local63 >> 12;
		@Pc(87) int local87 = local75 * local81 >> 12;
		@Pc(91) int local91 = local87 + local55;
		@Pc(96) int local96 = local28 - local87;
		if (local67 == 0) {
			this.anInt2053 = local91;
			this.anInt2056 = local28;
			this.anInt2060 = local55;
		} else if (local67 == 1) {
			this.anInt2056 = local96;
			this.anInt2060 = local55;
			this.anInt2053 = local28;
		} else if (local67 == 2) {
			this.anInt2060 = local91;
			this.anInt2056 = local55;
			this.anInt2053 = local28;
		} else if (local67 == 3) {
			this.anInt2060 = local28;
			this.anInt2056 = local55;
			this.anInt2053 = local96;
		} else if (local67 == 4) {
			this.anInt2053 = local55;
			this.anInt2060 = local28;
			this.anInt2056 = local91;
		} else if (local67 == 5) {
			this.anInt2056 = local28;
			this.anInt2060 = local96;
			this.anInt2053 = local55;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IBII)V")
	private void method1600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(24) int local24 = arg0 <= arg1 ? arg1 : arg0;
		@Pc(35) int local35 = arg1 > arg0 ? arg0 : arg1;
		@Pc(42) int local42 = arg2 >= local35 ? local35 : arg2;
		@Pc(53) int local53 = arg2 <= local24 ? local24 : arg2;
		this.anInt2059 = (local53 + local42) / 2;
		@Pc(65) int local65 = local53 - local42;
		if (local65 <= 0) {
			return;
		}
		if (this.anInt2059 > 0 && this.anInt2059 < 4096) {
			this.anInt2069 = (local65 << 12) / (this.anInt2059 > 2048 ? 8192 - this.anInt2059 * 2 : this.anInt2059 * 2);
		}
		@Pc(107) int local107 = (local53 - arg0 << 12) / local65;
		@Pc(116) int local116 = (local53 - arg1 << 12) / local65;
		@Pc(125) int local125 = (local53 - arg2 << 12) / local65;
		if (local53 == arg0) {
			this.anInt2067 = arg1 == local42 ? local125 + 20480 : 4096 - local116;
		} else if (arg1 == local53) {
			this.anInt2067 = local42 == arg2 ? local107 + 4096 : -local125 + 12288;
		} else {
			this.anInt2067 = local42 == arg0 ? local116 + 12288 : -local107 + 20480;
		}
		this.anInt2067 /= 6;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2065 = arg1.method1542();
		} else if (arg0 == 1) {
			this.anInt2054 = (arg1.method1508() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt2062 = (arg1.method1508() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(26) int[][] local26 = this.method3124(0, arg0);
			@Pc(30) int[] local30 = local26[2];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local26[1];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static129.anInt3285; local52++) {
				this.method1600(local34[local52], local42[local52], local30[local52]);
				this.anInt2059 += this.anInt2062;
				if (this.anInt2059 < 0) {
					this.anInt2059 = 0;
				}
				this.anInt2067 += this.anInt2065;
				this.anInt2069 += this.anInt2054;
				if (this.anInt2069 < 0) {
					this.anInt2069 = 0;
				}
				if (this.anInt2069 > 4096) {
					this.anInt2069 = 4096;
				}
				if (this.anInt2059 > 4096) {
					this.anInt2059 = 4096;
				}
				while (this.anInt2067 < 0) {
					this.anInt2067 += 4096;
				}
				while (this.anInt2067 > 4096) {
					this.anInt2067 -= 4096;
				}
				this.method1599(this.anInt2067, this.anInt2059, this.anInt2069);
				local38[local52] = this.anInt2056;
				local46[local52] = this.anInt2053;
				local50[local52] = this.anInt2060;
			}
		}
		return local11;
	}
}
