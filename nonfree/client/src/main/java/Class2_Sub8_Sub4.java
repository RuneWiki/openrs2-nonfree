import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class2_Sub8_Sub4 extends Class2_Sub8 {

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "Lclient!qd;")
	public final Class65 aClass65_12 = new Class65();

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "Lclient!lh;")
	public final Class2_Sub8_Sub3 aClass2_Sub8_Sub3_2 = new Class2_Sub8_Sub3();

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "Lclient!ec;")
	private final Class2_Sub8_Sub1 aClass2_Sub8_Sub1_1;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class2_Sub8_Sub4(@OriginalArg(0) Class2_Sub8_Sub1 arg0) {
		this.aClass2_Sub8_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([III)V")
	@Override
	public void method2180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub8_Sub3_2.method2180(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub20 local17 = (Class2_Sub20) this.aClass65_12.method2115(); local17 != null; local17 = (Class2_Sub20) this.aClass65_12.method2117()) {
			if (!this.aClass2_Sub8_Sub1_1.method775(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt2739) {
						this.method2189(arg0, local29, local17, local27, local27 + local29);
						local17.anInt2739 -= local27;
						break;
					}
					this.method2189(arg0, local29, local17, local17.anInt2739, local29 + local27);
					local27 -= local17.anInt2739;
					local29 += local17.anInt2739;
				} while (!this.aClass2_Sub8_Sub1_1.method793(local17, local29, arg0, local27));
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "()I")
	@Override
	public int method2183() {
		return 0;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "()Lclient!qa;")
	@Override
	public Class2_Sub8 method2179() {
		@Pc(9) Class2_Sub20 local9;
		do {
			local9 = (Class2_Sub20) this.aClass65_12.method2117();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub8_Sub2_3 == null);
		return local9.aClass2_Sub8_Sub2_3;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!ng;)V")
	private void method2185(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if ((this.aClass2_Sub8_Sub1_1.anIntArray97[arg1.anInt2736] & 0x4) != 0 && arg1.anInt2730 < 0) {
			@Pc(23) int local23 = this.aClass2_Sub8_Sub1_1.anIntArray88[arg1.anInt2736] / Static113.anInt2749;
			@Pc(32) int local32 = (local23 + 1048575 - arg1.anInt2733) / local23;
			arg1.anInt2733 = arg1.anInt2733 + arg0 * local23 & 0xFFFFF;
			if (local32 <= arg0) {
				if (this.aClass2_Sub8_Sub1_1.anIntArray95[arg1.anInt2736] == 0) {
					arg1.aClass2_Sub8_Sub2_3 = Static182.method844(arg1.aClass2_Sub18_Sub1_1, arg1.aClass2_Sub8_Sub2_3.method830(), arg1.aClass2_Sub8_Sub2_3.method838(), arg1.aClass2_Sub8_Sub2_3.method837());
				} else {
					arg1.aClass2_Sub8_Sub2_3 = Static182.method844(arg1.aClass2_Sub18_Sub1_1, arg1.aClass2_Sub8_Sub2_3.method830(), 0, arg1.aClass2_Sub8_Sub2_3.method837());
					this.aClass2_Sub8_Sub1_1.method771(arg1, arg1.aClass2_Sub12_1.aShortArray31[arg1.anInt2741] < 0);
				}
				if (arg1.aClass2_Sub12_1.aShortArray31[arg1.anInt2741] < 0) {
					arg1.aClass2_Sub8_Sub2_3.method819(-1);
				}
				arg0 = arg1.anInt2733 / local23;
			}
		}
		arg1.aClass2_Sub8_Sub2_3.method2182(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()Lclient!qa;")
	@Override
	public Class2_Sub8 method2178() {
		@Pc(5) Class2_Sub20 local5 = (Class2_Sub20) this.aClass65_12.method2115();
		if (local5 == null) {
			return null;
		} else if (local5.aClass2_Sub8_Sub2_3 == null) {
			return this.method2179();
		} else {
			return local5.aClass2_Sub8_Sub2_3;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	@Override
	public void method2182(@OriginalArg(0) int arg0) {
		this.aClass2_Sub8_Sub3_2.method2182(arg0);
		for (@Pc(15) Class2_Sub20 local15 = (Class2_Sub20) this.aClass65_12.method2115(); local15 != null; local15 = (Class2_Sub20) this.aClass65_12.method2117()) {
			if (!this.aClass2_Sub8_Sub1_1.method775(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2739) {
						this.method2185(local25, local15);
						local15.anInt2739 -= local25;
						break;
					}
					this.method2185(local15.anInt2739, local15);
					local25 -= local15.anInt2739;
				} while (!this.aClass2_Sub8_Sub1_1.method793(local15, 0, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([IILclient!ng;IBI)V")
	private void method2189(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub20 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub8_Sub1_1.anIntArray97[arg2.anInt2736] & 0x4) != 0 && arg2.anInt2730 < 0) {
			@Pc(36) int local36 = this.aClass2_Sub8_Sub1_1.anIntArray88[arg2.anInt2736] / Static113.anInt2749;
			while (true) {
				@Pc(46) int local46 = (local36 + 1048575 - arg2.anInt2733) / local36;
				if (local46 > arg3) {
					arg2.anInt2733 += local36 * arg3;
					break;
				}
				arg3 -= local46;
				arg2.aClass2_Sub8_Sub2_3.method2180(arg0, arg1, local46);
				arg1 += local46;
				arg2.anInt2733 += local46 * local36 - 1048576;
				@Pc(77) int local77 = Static113.anInt2749 / 100;
				@Pc(80) Class2_Sub8_Sub2 local80 = arg2.aClass2_Sub8_Sub2_3;
				@Pc(84) int local84 = 262144 / local36;
				if (local84 < local77) {
					local77 = local84;
				}
				if (this.aClass2_Sub8_Sub1_1.anIntArray95[arg2.anInt2736] == 0) {
					arg2.aClass2_Sub8_Sub2_3 = Static182.method844(arg2.aClass2_Sub18_Sub1_1, local80.method830(), local80.method838(), local80.method837());
				} else {
					arg2.aClass2_Sub8_Sub2_3 = Static182.method844(arg2.aClass2_Sub18_Sub1_1, local80.method830(), 0, local80.method837());
					this.aClass2_Sub8_Sub1_1.method771(arg2, arg2.aClass2_Sub12_1.aShortArray31[arg2.anInt2741] < 0);
					arg2.aClass2_Sub8_Sub2_3.method820(local77, local80.method838());
				}
				if (arg2.aClass2_Sub12_1.aShortArray31[arg2.anInt2741] < 0) {
					arg2.aClass2_Sub8_Sub2_3.method819(-1);
				}
				local80.method832(local77);
				local80.method2180(arg0, arg1, arg4 - arg1);
				if (local80.method831()) {
					this.aClass2_Sub8_Sub3_2.method1741(local80);
				}
			}
		}
		arg2.aClass2_Sub8_Sub2_3.method2180(arg0, arg1, arg3);
	}
}
