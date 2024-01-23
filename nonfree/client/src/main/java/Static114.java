import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
	public static int anInt2338;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "[I")
	public static int[] anIntArray190;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "[S")
	public static short[] aShortArray23 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "Lclient!gd;")
	public static Class61 aClass61_18 = new Class61(64);

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "Lclient!gd;")
	public static Class61 aClass61_19 = new Class61(30);

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "[I")
	public static int[] anIntArray189 = new int[100];

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "[I")
	public static int[] anIntArray191 = new int[1000];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Lclient!bi;")
	public static Class8_Sub1_Sub2 method1846() {
		return Static267.aClass8_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BIII)I")
	public static int method1848(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!pk;Lclient!pk;II)Lclient!cm;")
	public static Class8_Sub1_Sub5 method1849(@OriginalArg(1) Class132 arg0, @OriginalArg(2) Class132 arg1, @OriginalArg(3) int arg2) {
		return Static247.method4168(arg1, 0, arg2) ? Static9.method79(arg0.method3194(arg2, 0)) : null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1850(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
	public static void method1851() {
		for (@Pc(18) Class8_Sub1_Sub19 local18 = (Class8_Sub1_Sub19) Static164.aClass182_13.method4319(); local18 != null; local18 = (Class8_Sub1_Sub19) Static164.aClass182_13.method4329()) {
			@Pc(23) Class36_Sub5 local23 = local18.aClass36_Sub5_1;
			if (local23.anInt3846 != Static34.anInt770 || local23.aBoolean310) {
				local18.method4273();
			} else if (Static183.anInt3590 >= local23.anInt3835) {
				local23.method2993(Static185.anInt3691);
				if (local23.aBoolean310) {
					local18.method4273();
				} else {
					Static37.method3011(local23.anInt3846, local23.anInt3848, local23.anInt3834, local23.anInt3836, 60, local23, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
	public static void method1852() {
		@Pc(4) Class47 local4 = Static266.aClass47_1;
		synchronized (Static266.aClass47_1) {
			Static30.anInt733++;
			Static210.anInt4476 = Static270.anInt5341;
			@Pc(21) int local21;
			if (Static51.anInt1122 >= 0) {
				while (Static51.anInt1122 != Static192.anInt3877) {
					local21 = Static125.anIntArray199[Static192.anInt3877];
					Static192.anInt3877 = Static192.anInt3877 + 1 & 0x7F;
					if (local21 < 0) {
						Static36.aBooleanArray2[~local21] = false;
					} else {
						Static36.aBooleanArray2[local21] = true;
					}
				}
			} else {
				for (local21 = 0; local21 < 112; local21++) {
					Static36.aBooleanArray2[local21] = false;
				}
				Static51.anInt1122 = Static192.anInt3877;
			}
			Static270.anInt5341 = Static82.anInt1790;
		}
	}
}
