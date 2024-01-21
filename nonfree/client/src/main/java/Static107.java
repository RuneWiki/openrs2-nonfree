import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	public static int anInt2360;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!ua;")
	public static Class72 aClass72_25 = new Class72(64);

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!v;")
	public static Class76 aClass76_1111 = Static134.method2017("null");

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!v;")
	public static Class76 aClass76_1112 = Static134.method2017("mod_icons");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "[S")
	public static short[] aShortArray24 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1618() {
		Static32.anInt811 = 0;
		@Pc(17) int local17 = Static51.anInt2080 + (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 >> 7);
		@Pc(25) int local25 = (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 >> 7) + Static64.anInt1649;
		if (local17 >= 3053 && local17 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static32.anInt811 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static32.anInt811 = 1;
		}
		if (Static32.anInt811 == 1 && local17 >= 3139 && local17 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static32.anInt811 = 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method1619() {
		aClass76_1112 = null;
		aClass72_25 = null;
		aShortArray24 = null;
		aClass76_1111 = null;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Lclient!qf;")
	public static Class4_Sub4_Sub14 method1621(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub4_Sub14 local12 = (Class4_Sub4_Sub14) Static67.aClass72_18.method1781((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static64.aClass17_Sub1_14.method290(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class4_Sub4_Sub14();
		@Pc(35) Class4_Sub10 local35 = new Class4_Sub10(local22);
		local35.anInt931 = local35.aByteArray17.length - 12;
		@Pc(46) int local46 = local35.method549();
		@Pc(48) int local48 = 0;
		local12.anInt2255 = local35.method604();
		local12.anInt2251 = local35.method604();
		local12.anInt2248 = local35.method604();
		local12.anInt2249 = local35.method604();
		local35.anInt931 = 0;
		local12.aClass76_1026 = local35.method585();
		local12.anIntArray316 = new int[local46];
		local12.aClass76Array24 = new Class76[local46];
		local12.anIntArray317 = new int[local46];
		while (local35.anInt931 < local35.aByteArray17.length - 12) {
			@Pc(99) int local99 = local35.method604();
			if (local99 == 3) {
				local12.aClass76Array24[local48] = local35.method581();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local12.anIntArray316[local48] = local35.method599();
			} else {
				local12.anIntArray316[local48] = local35.method549();
			}
			local12.anIntArray317[local48++] = local99;
		}
		Static67.aClass72_18.method1783(local12, (long) arg0);
		return local12;
	}
}
