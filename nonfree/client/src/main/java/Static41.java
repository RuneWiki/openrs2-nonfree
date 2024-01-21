import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3 aClass3_Sub2_Sub3_Sub3_39;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public static int anInt3680 = 0;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1317 = Static65.method1172("K");

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1318 = aClass46_1317;

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1319 = Static65.method1172("0(U");

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1320 = Static65.method1172("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1321 = Static65.method1172("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!eh", name = "u", descriptor = "[I")
	public static int[] anIntArray419 = new int[2000];

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1322 = aClass46_1317;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)Lclient!gh;")
	public static Class3_Sub2_Sub6 method2657(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub2_Sub6 local12 = (Class3_Sub2_Sub6) Static21.aClass57_20.method1719((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static153.aClass44_Sub1_14.method1624(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class3_Sub2_Sub6();
		@Pc(35) Class3_Sub4 local35 = new Class3_Sub4(local22);
		local35.anInt232 = local35.aByteArray5.length - 12;
		@Pc(44) int local44 = 0;
		@Pc(48) int local48 = local35.method213();
		local12.anInt1410 = local35.method208();
		local12.anInt1415 = local35.method208();
		local12.anInt1406 = local35.method208();
		local12.anInt1409 = local35.method208();
		local35.anInt232 = 0;
		local12.aClass46_477 = local35.method204();
		local12.anIntArray135 = new int[local48];
		local12.aClass46Array8 = new Class46[local48];
		local12.anIntArray132 = new int[local48];
		while (local35.anInt232 < local35.aByteArray5.length - 12) {
			@Pc(94) int local94 = local35.method208();
			if (local94 == 3) {
				local12.aClass46Array8[local44] = local35.method172();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local12.anIntArray135[local44] = local35.method191();
			} else {
				local12.anIntArray135[local44] = local35.method213();
			}
			local12.anIntArray132[local44++] = local94;
		}
		Static21.aClass57_20.method1717(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
	public static void method2660() {
		aClass46_1322 = null;
		aClass46_1318 = null;
		aClass46_1319 = null;
		anIntArray419 = null;
		aClass3_Sub2_Sub3_Sub3_39 = null;
		aClass46_1320 = null;
		aClass46_1317 = null;
		aClass46_1321 = null;
	}
}
