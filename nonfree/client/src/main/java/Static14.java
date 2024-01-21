import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public static int anInt319;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
	public static int anInt328;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public static int anInt326 = 0;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Lclient!oa;")
	private static Class56 aClass56_185 = Static33.method650("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "Lclient!oa;")
	private static Class56 aClass56_188 = Static33.method650("Loaded sprites");

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "Lclient!oa;")
	public static Class56 aClass56_186 = aClass56_188;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Lclient!n;")
	public static Class52 aClass52_6 = new Class52(500);

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "Lclient!oa;")
	public static Class56 aClass56_187 = aClass56_185;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "Lclient!oa;")
	public static Class56 aClass56_189 = Static33.method650("Handel akzeptieren");

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "Lclient!oa;")
	public static Class56 aClass56_190 = Static33.method650("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIILclient!tb;)[Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4[] method247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class44 arg2) {
		return Static87.method1606(arg0, arg2, arg1) ? Static63.method1212() : null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Lclient!qb;")
	public static Class3_Sub1_Sub12 method248(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub1_Sub12 local12 = (Class3_Sub1_Sub12) Static67.aClass52_45.method1342((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static102.aClass44_Sub1_83.method1146(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class3_Sub1_Sub12();
		@Pc(35) Class3_Sub2 local35 = new Class3_Sub2(local22);
		local35.anInt413 = local35.aByteArray7.length - 12;
		@Pc(44) int local44 = 0;
		@Pc(48) int local48 = local35.method278();
		local12.anInt2427 = local35.method276();
		local12.anInt2429 = local35.method276();
		local12.anInt2420 = local35.method276();
		local12.anInt2421 = local35.method276();
		local12.anIntArray217 = new int[local48];
		local35.anInt413 = 0;
		local12.anIntArray216 = new int[local48];
		local12.aClass56Array9 = new Class56[local48];
		while (local35.aByteArray7.length - 12 > local35.anInt413) {
			@Pc(98) int local98 = local35.method276();
			if (local98 == 3) {
				local12.aClass56Array9[local44] = local35.method301();
			} else if (local98 >= 100 || local98 == 21 || local98 == 38 || local98 == 39) {
				local12.anIntArray216[local44] = local35.method270();
			} else {
				local12.anIntArray216[local44] = local35.method278();
			}
			local12.anIntArray217[local44++] = local98;
		}
		Static67.aClass52_45.method1344(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!tb;IIB)[Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2[] method249(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static87.method1606(arg2, arg0, arg1) ? Static30.method632() : null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public static void method250() {
		if (Static119.anInt2986 != 0 && Static119.anInt2986 != 3 || Static36.anInt1014 != 1) {
			return;
		}
		@Pc(20) int local20 = Static127.anInt3209 - 25 - 550;
		@Pc(26) int local26 = Static71.anInt1970 - 5 - 4;
		if (local20 < 0 || local26 < 0 || local20 >= 146 || local26 >= 151) {
			return;
		}
		local26 -= 75;
		local20 -= 73;
		@Pc(46) int local46 = Static18.anInt493 + Static22.anInt686 & 0x7FF;
		@Pc(50) int local50 = Class3_Sub1_Sub1_Sub3.anIntArray116[local46];
		@Pc(58) int local58 = local50 * (Static62.anInt1804 + 256) >> 8;
		@Pc(62) int local62 = Class3_Sub1_Sub1_Sub3.anIntArray115[local46];
		@Pc(70) int local70 = (Static62.anInt1804 + 256) * local62 >> 8;
		@Pc(80) int local80 = local58 * local26 + local20 * local70 >> 11;
		@Pc(91) int local91 = local26 * local70 - local20 * local58 >> 11;
		@Pc(98) int local98 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 + local80 >> 7;
		@Pc(105) int local105 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 - local91 >> 7;
		@Pc(125) boolean local125 = Static26.method538(1, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 0, true, local105, local98, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 0);
		if (!local125) {
			return;
		}
		Static111.aClass3_Sub2_Sub1_4.method303(local20);
		Static111.aClass3_Sub2_Sub1_4.method303(local26);
		Static111.aClass3_Sub2_Sub1_4.method289(Static22.anInt686);
		Static111.aClass3_Sub2_Sub1_4.method303(57);
		Static111.aClass3_Sub2_Sub1_4.method303(Static18.anInt493);
		Static111.aClass3_Sub2_Sub1_4.method303(Static62.anInt1804);
		Static111.aClass3_Sub2_Sub1_4.method303(89);
		Static111.aClass3_Sub2_Sub1_4.method289(Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187);
		Static111.aClass3_Sub2_Sub1_4.method289(Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196);
		Static111.aClass3_Sub2_Sub1_4.method303(Static32.anInt956);
		Static111.aClass3_Sub2_Sub1_4.method303(63);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method251() {
		if (Static119.aClass10_1 != null) {
			@Pc(16) Class10 local16 = Static119.aClass10_1;
			synchronized (Static119.aClass10_1) {
				Static119.aClass10_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method252() {
		Static106.anInt2633 = 0;
		Static8.anInt210 = 0;
		Static99.anInt895 = -1;
		Static122.anInt3002 = -1;
		Static38.anInt1028 = 0;
		Static66.anInt559 = 0;
		Static111.aClass3_Sub2_Sub1_4.anInt413 = 0;
		Static73.anInt2013 = 0;
		Static48.anInt1395 = -1;
		Static122.aBoolean163 = false;
		Static119.anInt2986 = 0;
		Static31.aClass3_Sub2_Sub1_3.anInt413 = 0;
		Static43.anInt1142 = -1;
		for (@Pc(35) int local35 = 0; local35 < Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1.length; local35++) {
			if (Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local35] != null) {
				Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local35].anInt3197 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1.length; local57++) {
			if (Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local57] != null) {
				Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local57].anInt3197 = -1;
			}
		}
		Static118.method1920();
		Static79.method1393(30);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!tb;I)Z")
	public static boolean method253(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1) {
		@Pc(8) byte[] local8 = arg1.method1155(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static3.method2023(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public static void method254() {
		aClass52_6 = null;
		aClass56_190 = null;
		aClass56_185 = null;
		aClass56_186 = null;
		aClass56_189 = null;
		aClass56_188 = null;
		aClass56_187 = null;
	}
}
