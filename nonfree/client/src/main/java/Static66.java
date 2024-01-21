import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1358 = Static56.method816("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1359 = Static56.method816("::qa_op_test");

	@OriginalMember(owner = "client!ka", name = "Y", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1360 = Static56.method816("sl_stars");

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1361 = Static56.method816("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ka", name = "cb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1362 = Static56.method816("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1363 = Static56.method816("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZII)I")
	public static int method1956(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 >>> 31;
		return (arg0 + local8) / arg1 - local8;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V")
	public static void method1957() {
		aClass34_1360 = null;
		aClass34_1363 = null;
		anIntArray393 = null;
		aClass34_1359 = null;
		aClass34_1358 = null;
		aClass34_1361 = null;
		aClass34_1362 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)V")
	public static void method1958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class49 local11 = Static21.aClass49ArrayArrayArray1[Static42.anInt1024][arg0][arg1];
		if (local11 == null) {
			Static3.aClass64_1.method1417(Static42.anInt1024, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(28) Class8_Sub1_Sub1_Sub2 local28 = (Class8_Sub1_Sub1_Sub2) local11.method1107();
		@Pc(30) Class8_Sub1_Sub1_Sub2 local30 = null;
		while (local28 != null) {
			@Pc(38) Class8_Sub1_Sub13 local38 = Static7.method49(local28.anInt349);
			@Pc(41) int local41 = local38.anInt1726;
			if (local38.anInt1752 == 1) {
				local41 *= local28.anInt348 + 1;
			}
			if (local21 < local41) {
				local21 = local41;
				local30 = local28;
			}
			local28 = (Class8_Sub1_Sub1_Sub2) local11.method1109();
		}
		if (local30 == null) {
			Static3.aClass64_1.method1417(Static42.anInt1024, arg0, arg1);
			return;
		}
		local11.method1104(local30);
		local28 = (Class8_Sub1_Sub1_Sub2) local11.method1107();
		@Pc(89) Class8_Sub1_Sub1_Sub2 local89 = null;
		@Pc(98) int local98 = arg0 + (arg1 << 7) + 1610612736;
		@Pc(104) Class8_Sub1_Sub1_Sub2 local104 = null;
		while (local28 != null) {
			if (local30.anInt349 != local28.anInt349) {
				if (local89 == null) {
					local89 = local28;
				}
				if (local89.anInt349 != local28.anInt349 && local104 == null) {
					local104 = local28;
				}
			}
			local28 = (Class8_Sub1_Sub1_Sub2) local11.method1109();
		}
		Static3.aClass64_1.method1431(Static42.anInt1024, arg0, arg1, Static123.method1945(arg1 * 128 + 64, Static42.anInt1024, arg0 * 128 + 64), local30, local98, local89, local104);
	}
}
