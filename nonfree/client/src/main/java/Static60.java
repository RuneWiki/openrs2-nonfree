import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "[I")
	public static int[] anIntArray128;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	public static int anInt1504;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "[Lclient!bn;")
	public static Class2_Sub8_Sub1[] aClass2_Sub8_Sub1Array2;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
	public static int anInt1510;

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
	public static int anInt1514;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[8];

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
	public static int anInt1512 = 0;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "Z")
	public static boolean aBoolean97 = true;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Lclient!vm;")
	public static Class188 method1158(@OriginalArg(0) int arg0) {
		@Pc(18) Class188 local18 = (Class188) Static80.aClass157_13.method4031((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static192.aClass42_59.method1256(Static243.method3873(arg0), Static49.method917(arg0));
		local18 = new Class188();
		local18.anInt5861 = arg0;
		if (local32 != null) {
			local18.method4619(new Class2_Sub16(local32));
		}
		local18.method4607();
		Static80.aClass157_13.method4026((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
	public static void method1159() {
		if (Static90.aClass100ArrayArray1 == null) {
			return;
		}
		@Pc(8) Class100 local8 = new Class100();
		for (@Pc(10) int local10 = 0; local10 < 13; local10++) {
			for (@Pc(17) int local17 = 0; local17 < 13; local17++) {
				Static90.aClass100ArrayArray1[local10][local17] = local8;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IBI)V")
	public static void method1162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static248.anInt2147 = Static90.aClass100ArrayArray1[arg1][arg0].anInt3476;
		Static53.anInt1318 = Static90.aClass100ArrayArray1[arg1][arg0].anInt3479;
		Static209.anInt4315 = Static90.aClass100ArrayArray1[arg1][arg0].anInt3482;
		Static235.method3802((float) Static248.anInt2147, (float) Static53.anInt1318, (float) Static209.anInt4315);
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(II)Lclient!ng;")
	public static Class2_Sub1 method1164(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub1_Sub29();
		} else if (arg0 == 1) {
			return new Class2_Sub1_Sub28();
		} else if (arg0 == 2) {
			return new Class2_Sub1_Sub22();
		} else if (arg0 == 3) {
			return new Class2_Sub1_Sub5();
		} else if (arg0 == 4) {
			return new Class2_Sub1_Sub27();
		} else if (arg0 == 5) {
			return new Class2_Sub1_Sub17();
		} else if (arg0 == 6) {
			return new Class2_Sub1_Sub9();
		} else if (arg0 == 7) {
			return new Class2_Sub1_Sub1();
		} else if (arg0 == 8) {
			return new Class2_Sub1_Sub37();
		} else if (arg0 == 9) {
			return new Class2_Sub1_Sub6();
		} else if (arg0 == 10) {
			return new Class2_Sub1_Sub11();
		} else if (arg0 == 11) {
			return new Class2_Sub1_Sub14();
		} else if (arg0 == 12) {
			return new Class2_Sub1_Sub13();
		} else if (arg0 == 13) {
			return new Class2_Sub1_Sub33();
		} else if (arg0 == 14) {
			return new Class2_Sub1_Sub20();
		} else if (arg0 == 15) {
			return new Class2_Sub1_Sub19();
		} else if (arg0 == 16) {
			return new Class2_Sub1_Sub15();
		} else if (arg0 == 17) {
			return new Class2_Sub1_Sub32();
		} else if (arg0 == 18) {
			return new Class2_Sub1_Sub10_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub1_Sub26();
		} else if (arg0 == 20) {
			return new Class2_Sub1_Sub24();
		} else if (arg0 == 21) {
			return new Class2_Sub1_Sub16();
		} else if (arg0 == 22) {
			return new Class2_Sub1_Sub4();
		} else if (arg0 == 23) {
			return new Class2_Sub1_Sub18();
		} else if (arg0 == 24) {
			return new Class2_Sub1_Sub34();
		} else if (arg0 == 25) {
			return new Class2_Sub1_Sub21();
		} else if (arg0 == 26) {
			return new Class2_Sub1_Sub3();
		} else if (arg0 == 27) {
			return new Class2_Sub1_Sub39();
		} else if (arg0 == 28) {
			return new Class2_Sub1_Sub23();
		} else if (arg0 == 29) {
			return new Class2_Sub1_Sub35();
		} else if (arg0 == 30) {
			return new Class2_Sub1_Sub7();
		} else if (arg0 == 31) {
			return new Class2_Sub1_Sub2();
		} else if (arg0 == 32) {
			return new Class2_Sub1_Sub25();
		} else if (arg0 == 33) {
			return new Class2_Sub1_Sub38();
		} else if (arg0 == 34) {
			return new Class2_Sub1_Sub8();
		} else if (arg0 == 35) {
			return new Class2_Sub1_Sub31();
		} else if (arg0 == 36) {
			return new Class2_Sub1_Sub12();
		} else if (arg0 == 37) {
			return new Class2_Sub1_Sub36();
		} else if (arg0 == 38) {
			return new Class2_Sub1_Sub30();
		} else if (arg0 == 39) {
			return new Class2_Sub1_Sub10();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)Lclient!sc;")
	public static Class2_Sub8_Sub1_Sub1 method1165() {
		@Pc(9) byte[] local9 = Static165.aByteArrayArray9[0];
		@Pc(17) int local17 = Static299.anIntArray561[0] * Static187.anIntArray397[0];
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(28) int local28 = 0; local28 < local17; local28++) {
			local20[local28] = Static199.anIntArray438[local9[local28] & 0xFF];
		}
		@Pc(67) Class2_Sub8_Sub1_Sub1 local67 = new Class2_Sub8_Sub1_Sub1(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[0], Static275.anIntArray522[0], Static299.anIntArray561[0], Static187.anIntArray397[0], local20);
		Static293.method4502();
		return local67;
	}
}
