import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
	public static int anInt6003;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_109 = new Class319(74, 7);

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_110 = new Class319(11, 7);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method5040() {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(15, 0);
		local8.method488();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II[BLjava/lang/String;)I")
	public static int method5041(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) String arg2) {
		@Pc(15) int local15 = arg2.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17 += 4) {
			@Pc(25) int local25 = Static31.method780(arg2.charAt(local17));
			@Pc(40) int local40 = local15 > local17 + 1 ? Static31.method780(arg2.charAt(local17 + 1)) : -1;
			@Pc(55) int local55 = local15 > local17 + 2 ? Static31.method780(arg2.charAt(local17 + 2)) : -1;
			@Pc(70) int local70 = local15 <= local17 + 3 ? -1 : Static31.method780(arg2.charAt(local17 + 3));
			arg1[arg0++] = (byte) (local25 << 2 | local40 >>> 4);
			if (local55 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local40 & 0xF) << 4 | local55 >>> 2);
			if (local70 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local55 & 0x3) << 6 | local70);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public static void method5042() {
		Static5.method76();
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z")
	public static boolean method5043() {
		return Static177.anInt2101 >= 1;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V")
	public static void method5044() {
		@Pc(7) Class283 local7 = null;
		try {
			local7 = Static162.method2515("2");
			@Pc(20) Class1_Sub20 local20 = new Class1_Sub20(Static296.anInt5480 * 6 + 3);
			local20.method4378(1);
			local20.method4381(Static296.anInt5480);
			for (@Pc(30) int local30 = 0; local30 < Static475.anIntArray530.length; local30++) {
				if (Static412.aBooleanArray23[local30]) {
					local20.method4381(local30);
					local20.method4421(Static475.anIntArray530[local30]);
				}
			}
			local7.method6493(0, local20.aByteArray52, local20.anInt5238);
		} catch (@Pc(65) Exception local65) {
		}
		try {
			if (local7 != null) {
				local7.method6494();
			}
		} catch (@Pc(72) Exception local72) {
		}
		Static566.aLong406 = Static255.method4035();
		Static43.aBoolean89 = false;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z")
	public static boolean method5046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static213.method3549(arg1, arg0) || Static395.method5608(arg0, arg1);
	}
}
