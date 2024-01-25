import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "Lclient!ll;")
	public static final Class186 aClass186_4 = new Class186();

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
	public static int anInt8195 = 0;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "Lclient!nl;")
	public static final Class214 aClass214_14 = new Class214(1);

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "[I")
	public static final int[] anIntArray635 = new int[5];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)I")
	public static int method6768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static285.aClass60Array8 == null) {
			return 0;
		}
		@Pc(20) int local20 = arg0 >> 9;
		@Pc(24) int local24 = arg2 >> 9;
		if (local20 < 0 || local24 < 0 || local20 > Static301.anInt4912 - 1 || Static473.anInt7969 - 1 < local24) {
			return 0;
		}
		@Pc(49) int local49 = arg1;
		if (arg1 < 3 && (Static303.aByteArrayArrayArray13[1][local20][local24] & 0x2) != 0) {
			local49 = arg1 + 1;
		}
		return Static285.aClass60Array8[local49].sa(arg0, arg2);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!dga;I)Lclient!afa;")
	public static Class10 method6769(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(10) Class277 local10 = Static478.method6658()[arg0.method6041()];
		@Pc(17) Class137 local17 = Static344.method5181()[arg0.method6041()];
		@Pc(23) int local23 = arg0.method6008();
		@Pc(29) int local29 = arg0.method6008();
		@Pc(33) int local33 = arg0.method6006();
		@Pc(42) int local42 = arg0.method6006();
		@Pc(46) int local46 = arg0.method6027();
		return new Class10(local10, local17, local23, local29, local33, local42, local46);
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
	public static void method6770() {
		@Pc(15) int local15 = Static199.anInt3448;
		@Pc(17) int[] local17 = Static272.anIntArray443;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(27) Class29_Sub2_Sub1_Sub2 local27 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local17[local19]];
			if (local27 != null && local27.anInt8524 > 0) {
				local27.anInt8524--;
				if (local27.anInt8524 == 0) {
					local27.aString106 = null;
				}
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static516.anInt8936; local53++) {
			@Pc(60) long local60 = (long) Static274.anIntArray385[local53];
			@Pc(66) Class6_Sub28 local66 = (Class6_Sub28) Static31.aClass212_1.method5106(local60);
			if (local66 != null) {
				@Pc(71) Class29_Sub2_Sub1_Sub1 local71 = local66.aClass29_Sub2_Sub1_Sub1_2;
				if (local71.anInt8524 > 0) {
					local71.anInt8524--;
					if (local71.anInt8524 == 0) {
						local71.aString106 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!fca;)I")
	public static int method6771(@OriginalArg(0) int arg0, @OriginalArg(2) Class97 arg1) {
		if (!Static65.method862(arg1).method6473(arg0) && arg1.anObjectArray20 == null) {
			return -1;
		} else if (arg1.anIntArray291 == null || arg0 >= arg1.anIntArray291.length) {
			return -1;
		} else {
			return arg1.anIntArray291[arg0];
		}
	}
}
