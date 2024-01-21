import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "[I")
	public static int[] anIntArray51;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
	public static int anInt318;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
	public static int anInt308 = 0;

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
	public static int anInt314 = -1;

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "Lclient!sc;")
	public static Class66 aClass66_195 = Static106.method1849("0(U");

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
	public static volatile int anInt322 = -1;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
	public static void method268() {
		@Pc(17) int local17;
		for (@Pc(7) int local7 = -1; local7 < Static111.anInt2653; local7++) {
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static51.anIntArray239[local7];
			}
			@Pc(25) Class1_Sub1_Sub1_Sub5_Sub2 local25 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local17];
			if (local25 != null && local25.anInt1283 > 0) {
				local25.anInt1283--;
				if (local25.anInt1283 == 0) {
					local25.aClass66_702 = null;
				}
			}
		}
		for (local17 = 0; local17 < Static33.anInt854; local17++) {
			@Pc(69) int local69 = Static54.anIntArray248[local17];
			@Pc(73) Class1_Sub1_Sub1_Sub5_Sub1 local73 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local69];
			if (local73 != null && local73.anInt1283 > 0) {
				local73.anInt1283--;
				if (local73.anInt1283 == 0) {
					local73.aClass66_702 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
	public static int method269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!sc;Z)V")
	public static void method270(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		Static127.aClass1_Sub12_Sub1_2.method1227(47);
		Static127.aClass1_Sub12_Sub1_2.method1205(arg0);
		Static127.aClass1_Sub12_Sub1_2.method1213(arg1.method1806());
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!ca;)V")
	public static void method271(@OriginalArg(1) Class1_Sub4 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt441 == 0) {
			local5 = Static129.aClass9_1.method337(arg0.anInt443, arg0.anInt437, arg0.anInt429);
		}
		@Pc(19) int local19 = -1;
		if (arg0.anInt441 == 1) {
			local5 = Static129.aClass9_1.method306(arg0.anInt443, arg0.anInt437, arg0.anInt429);
		}
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		if (arg0.anInt441 == 2) {
			local5 = Static129.aClass9_1.method323(arg0.anInt443, arg0.anInt437, arg0.anInt429);
		}
		if (arg0.anInt441 == 3) {
			local5 = Static129.aClass9_1.method352(arg0.anInt443, arg0.anInt437, arg0.anInt429);
		}
		if (local5 != 0) {
			local19 = local5 >> 14 & 0x7FFF;
			@Pc(93) int local93 = Static129.aClass9_1.method311(arg0.anInt443, arg0.anInt437, arg0.anInt429, local5);
			local44 = local93 >> 6 & 0x3;
			local42 = local93 & 0x1F;
		}
		arg0.anInt431 = local19;
		arg0.anInt430 = local44;
		arg0.anInt432 = local42;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)I")
	public static int method273(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub24 local12 = (Class1_Sub24) Static38.aClass65_43.method1802((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(30) int local30 = 0; local30 < local12.anIntArray502.length; local30++) {
				if (arg0 == local12.anIntArray501[local30]) {
					local23 += local12.anIntArray502[local30];
				}
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	public static void method274() {
		aClass66_195 = null;
		anIntArray51 = null;
		aByteArrayArrayArray4 = null;
	}
}
