import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!df", name = "E", descriptor = "I")
	public static int anInt2019;

	@OriginalMember(owner = "client!df", name = "H", descriptor = "[I")
	public static final int[] anIntArray116 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1685(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static130.method8168(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static31.anInt753; local25++) {
			@Pc(37) String local37 = Static137.aStringArray22[local25];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static130.method8168(local37);
			if (local37 != null && local37.equals(local20)) {
				Static31.anInt753--;
				for (@Pc(61) int local61 = local25; local61 < Static31.anInt753; local61++) {
					Static137.aStringArray22[local61] = Static137.aStringArray22[local61 + 1];
					Static459.aStringArray54[local61] = Static459.aStringArray54[local61 + 1];
					Static632.aStringArray64[local61] = Static632.aStringArray64[local61 + 1];
					Static133.aStringArray21[local61] = Static133.aStringArray21[local61 + 1];
					Static18.aBooleanArray1[local61] = Static18.aBooleanArray1[local61 + 1];
				}
				Static321.anInt10318 = Static156.anInt2887;
				@Pc(118) Class3_Sub37 local118 = Static90.method1509(Static510.aClass240_33, Static226.aClass144_2);
				local118.aClass3_Sub4_Sub1_2.method7948(Static345.method5022(arg0));
				local118.aClass3_Sub4_Sub1_2.method7901(arg0);
				Static301.method2678(local118);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!ha;IIIIIIIILclient!td;)V")
	public static void method1687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class95 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class3_Sub5_Sub18 arg10) {
		if (arg0 > arg5 && arg5 + arg6 > arg0 && arg8 - 13 < arg4 && arg8 + 3 > arg4 && arg10.aBoolean640) {
			arg3 = arg1;
		}
		@Pc(36) int[] local36 = null;
		if (Static413.method5631(arg10.anInt9217)) {
			local36 = Static117.aClass197_2.method4518((int) arg10.aLong259).anIntArray16;
		} else if (arg10.anInt9210 != -1) {
			local36 = Static117.aClass197_2.method4518(arg10.anInt9210).anIntArray16;
		} else if (Static475.method6321(arg10.anInt9217)) {
			@Pc(111) Class3_Sub52 local111 = (Class3_Sub52) Static105.aClass333_11.method7489((long) (int) arg10.aLong259);
			if (local111 != null) {
				@Pc(116) Class34_Sub1_Sub1_Sub2_Sub2 local116 = local111.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				@Pc(119) Class261 local119 = local116.aClass261_1;
				if (local119.anIntArray364 != null) {
					local119 = local119.method5772(Static210.aClass262_1);
				}
				if (local119 != null) {
					local36 = local119.anIntArray367;
				}
			}
		} else if (Static210.method3123(arg10.anInt9217)) {
			@Pc(80) Class216 local80;
			if (arg10.anInt9217 == 1012) {
				local80 = Static466.aClass340_6.method7665((int) arg10.aLong259);
			} else {
				local80 = Static466.aClass340_6.method7665((int) (arg10.aLong259 >>> 32 & 0x7FFFFFFFL));
			}
			if (local80.anIntArray325 != null) {
				local80 = local80.method5043(Static210.aClass262_1);
			}
			if (local80 != null) {
				local36 = local80.anIntArray326;
			}
		}
		@Pc(145) String local145 = Static262.method3910(arg10);
		if (local36 != null) {
			local145 = local145 + Static483.method6386(local36);
		}
		Static293.aClass67_14.method7673(arg3, Static454.anIntArray397, Static470.aClass6Array11, arg8, arg5 + 3, local145);
		if (arg10.aBoolean641) {
			Static74.aClass6_6.method5115(Static281.aClass91_7.method1849(local145) + arg5 + 5, arg8 + -12);
		}
	}
}
