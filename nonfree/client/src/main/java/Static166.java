import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	public static int anInt3046;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
	public static int anInt3056;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "Lclient!f;")
	public static Class50 aClass50_2;

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
	public static int anInt3065;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "[I")
	public static int[] anIntArray371 = new int[14];

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
	public static int anInt3059 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!oa;)V")
	public static void method2528(@OriginalArg(0) Class124 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3416; local2 <= arg0.anInt3401; local2++) {
			for (@Pc(9) int local9 = arg0.anInt3411; local9 <= arg0.anInt3406; local9++) {
				@Pc(22) Class1_Sub19 local22 = Static130.aClass1_Sub19ArrayArrayArray1[arg0.anInt3412][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt2570; local26++) {
						if (local22.aClass124Array2[local26] == arg0) {
							local22.anInt2570--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt2570; local44++) {
								local22.aClass124Array2[local44] = local22.aClass124Array2[local44 + 1];
								local22.anIntArray309[local44] = local22.anIntArray309[local44 + 1];
							}
							local22.aClass124Array2[local22.anInt2570] = null;
							break;
						}
					}
					local22.anInt2567 = 0;
					for (local26 = 0; local26 < local22.anInt2570; local26++) {
						local22.anInt2567 |= local22.anIntArray309[local26];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)V")
	public static void method2530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static163.method3579(11, arg0);
		local8.method1859();
		local8.anInt2279 = arg2;
		local8.anInt2282 = arg1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method2531(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static177.aBoolean244) {
			try {
				@Pc(21) Class8 local21 = (Class8) Class.forName("Class8_Sub1").getDeclaredConstructor().newInstance();
				local21.method2693(arg0);
				return local21;
			} catch (@Pc(28) Throwable local28) {
				Static177.aBoolean244 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)V")
	public static void method2532(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static163.method3579(9, arg0);
		local8.method1853();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;SIIJ)V")
	public static void method2533(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) short arg4, @OriginalArg(5) int arg5, @OriginalArg(7) long arg6) {
		if (Static192.aBoolean414 || Static29.anInt626 >= 500) {
			return;
		}
		Static277.aStringArray35[Static29.anInt626] = arg0;
		Static190.aStringArray19[Static29.anInt626] = arg3;
		Static64.anIntArray148[Static29.anInt626] = arg5 == -1 ? Static223.anInt4684 : arg5;
		Static276.aShortArray92[Static29.anInt626] = arg4;
		Static128.aLongArray6[Static29.anInt626] = arg6;
		Static55.anIntArray140[Static29.anInt626] = arg2;
		Static221.anIntArray522[Static29.anInt626] = arg1;
		Static29.anInt626++;
	}
}
