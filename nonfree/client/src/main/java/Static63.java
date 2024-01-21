import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!rd;")
	public static Class64 aClass64_913 = Static69.method1153("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_914 = Static69.method1153("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Lclient!rd;")
	private static Class64 aClass64_917 = Static69.method1153("Loading fonts )2 ");

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_915 = aClass64_917;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!rd;")
	public static Class64 aClass64_916 = Static69.method1153(" weitere Optionen");

	@OriginalMember(owner = "client!la", name = "t", descriptor = "I")
	public static int anInt1474 = 0;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "I")
	public static int anInt1475 = 0;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Lclient!rd;")
	private static Class64 aClass64_918 = Static69.method1153("Loading interfaces )2 ");

	@OriginalMember(owner = "client!la", name = "x", descriptor = "Lclient!rd;")
	public static Class64 aClass64_919 = aClass64_918;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2 method1093() {
		@Pc(9) Class1_Sub1_Sub5_Sub2 local9 = new Class1_Sub1_Sub5_Sub2();
		local9.anInt1021 = Static1.anInt47;
		local9.anInt1020 = Static98.anIntArray327[0];
		local9.anInt1019 = Static91.anIntArray303[0];
		local9.anInt1022 = Static65.anInt1495;
		local9.anInt1023 = Static116.anIntArray441[0];
		local9.anInt1018 = Static23.anIntArray95[0];
		@Pc(39) byte[] local39 = Static116.aByteArrayArray8[0];
		@Pc(45) int local45 = local9.anInt1019 * local9.anInt1023;
		local9.anIntArray150 = new int[local45];
		for (@Pc(56) int local56 = 0; local56 < local45; local56++) {
			local9.anIntArray150[local56] = Static25.anIntArray437[local39[local56] & 0xFF];
		}
		Static27.method675();
		return local9;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1094() {
		aClass64_917 = null;
		aClass64_913 = null;
		aClass64_919 = null;
		aClass64_916 = null;
		aClass64_918 = null;
		aClass64_914 = null;
		aClass64_915 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BILclient!g;Lclient!id;)V")
	public static void method1095(@OriginalArg(1) int arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) Class1_Sub6 arg2) {
		@Pc(14) Class1_Sub11 local14 = new Class1_Sub11();
		local14.anInt2196 = arg2.method1837();
		local14.anInt2195 = arg2.method1817();
		local14.aByteArrayArrayArray4 = new byte[local14.anInt2196][][];
		local14.anIntArray326 = new int[local14.anInt2196];
		local14.aClass48Array2 = new Class48[local14.anInt2196];
		local14.anIntArray324 = new int[local14.anInt2196];
		local14.anIntArray325 = new int[local14.anInt2196];
		local14.aClass48Array1 = new Class48[local14.anInt2196];
		for (@Pc(56) int local56 = 0; local56 < local14.anInt2196; local56++) {
			try {
				@Pc(62) int local62 = arg2.method1837();
				@Pc(91) String local91;
				@Pc(102) String local102;
				@Pc(106) int local106;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local91 = new String(arg2.method1831().method1488());
					local102 = new String(arg2.method1831().method1488());
					local106 = 0;
					if (local62 == 1) {
						local106 = arg2.method1817();
					}
					local14.anIntArray325[local56] = local62;
					local14.anIntArray324[local56] = local106;
					local14.aClass48Array2[local56] = arg1.method576(Static20.method399(local91), local102);
				} else if (local62 == 3 || local62 == 4) {
					local91 = new String(arg2.method1831().method1488());
					local102 = new String(arg2.method1831().method1488());
					local106 = arg2.method1837();
					@Pc(109) String[] local109 = new String[local106];
					for (@Pc(111) int local111 = 0; local111 < local106; local111++) {
						local109[local111] = new String(arg2.method1831().method1488());
					}
					@Pc(133) byte[][] local133 = new byte[local106][];
					@Pc(146) int local146;
					if (local62 == 3) {
						for (@Pc(140) int local140 = 0; local140 < local106; local140++) {
							local146 = arg2.method1817();
							local133[local140] = new byte[local146];
							arg2.method1846(local146, local133[local140]);
						}
					}
					local14.anIntArray325[local56] = local62;
					@Pc(175) Class[] local175 = new Class[local106];
					for (local146 = 0; local146 < local106; local146++) {
						local175[local146] = Static20.method399(local109[local146]);
					}
					local14.aClass48Array1[local56] = arg1.method571(local175, local102, Static20.method399(local91));
					local14.aByteArrayArrayArray4[local56] = local133;
				}
			} catch (@Pc(262) ClassNotFoundException local262) {
				local14.anIntArray326[local56] = -1;
			} catch (@Pc(269) SecurityException local269) {
				local14.anIntArray326[local56] = -2;
			} catch (@Pc(276) NullPointerException local276) {
				local14.anIntArray326[local56] = -3;
			} catch (@Pc(283) Exception local283) {
				local14.anIntArray326[local56] = -4;
			} catch (@Pc(290) Throwable local290) {
				local14.anIntArray326[local56] = -5;
			}
		}
		Static49.aClass50_6.method1142(local14);
	}
}
