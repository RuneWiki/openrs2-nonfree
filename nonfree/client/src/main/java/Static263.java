import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jga", name = "j", descriptor = "Lclient!kda;")
	public static Class183 aClass183_1;

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "I")
	public static int anInt4810 = 0;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4327(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(32) String local32;
		if (Static68.anInt1696 >= 200 && !Static136.aBoolean182 || Static68.anInt1696 >= 200) {
			Static612.method8491(Static59.aClass43_10.method1598(Static325.anInt6083));
			local32 = Static59.aClass43_11.method1598(Static325.anInt6083);
			if (local32 != null) {
				Static612.method8491(local32);
			}
			return;
		}
		local32 = Static22.method978(arg0);
		if (local32 == null) {
			return;
		}
		@Pc(100) String local100;
		for (@Pc(57) int local57 = 0; local57 < Static68.anInt1696; local57++) {
			@Pc(65) String local65 = Static22.method978(Static422.aStringArray29[local57]);
			if (local65 != null && local65.equals(local32)) {
				Static612.method8491(arg0 + Static59.aClass43_38.method1598(Static325.anInt6083));
				return;
			}
			if (Static159.aStringArray13[local57] != null) {
				local100 = Static22.method978(Static159.aStringArray13[local57]);
				if (local100 != null && local100.equals(local32)) {
					Static612.method8491(arg0 + Static59.aClass43_38.method1598(Static325.anInt6083));
					return;
				}
			}
		}
		for (@Pc(131) int local131 = 0; local131 < Static222.anInt4237; local131++) {
			local100 = Static22.method978(Static553.aStringArray35[local131]);
			if (local100 != null && local100.equals(local32)) {
				Static612.method8491(Static59.aClass43_43.method1598(Static325.anInt6083) + arg0 + Static59.aClass43_44.method1598(Static325.anInt6083));
				return;
			}
			if (Static383.aStringArray26[local131] != null) {
				@Pc(175) String local175 = Static22.method978(Static383.aStringArray26[local131]);
				if (local175 != null && local175.equals(local32)) {
					Static612.method8491(Static59.aClass43_43.method1598(Static325.anInt6083) + arg0 + Static59.aClass43_44.method1598(Static325.anInt6083));
					return;
				}
			}
		}
		if (Static22.method978(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString63).equals(local32)) {
			Static612.method8491(Static59.aClass43_41.method1598(Static325.anInt6083));
		} else {
			@Pc(231) Class3_Sub14 local231 = Static139.method2308(Static302.aClass130_84, Static24.aClass233_1);
			local231.aClass3_Sub3_Sub2_2.method4220(Static161.method2888(arg0));
			local231.aClass3_Sub3_Sub2_2.method4241(arg0);
			Static562.method8096(local231);
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "([Ljava/lang/Object;I[JIB)V")
	public static void method4330(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg3; local54 < arg1; local54++) {
			if (arg2[local54] < (long) (local52 & local54) + local20) {
				@Pc(71) long local71 = arg2[local54];
				arg2[local54] = arg2[local16];
				arg2[local16] = local71;
				@Pc(85) Object local85 = arg0[local54];
				arg0[local54] = arg0[local16];
				arg0[local16++] = local85;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method4330(arg0, local16 - 1, arg2, arg3);
		method4330(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(FFFB)I")
	public static int method4331(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(18) float local18 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(27) float local27 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(36) float local36 = arg0 < 0.0F ? -arg0 : arg0;
		if (local27 > local18 && local27 > local36) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local36 > local18 && local36 > local27) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "([SIZ)[S")
	public static short[] method4332(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static653.method6857(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
