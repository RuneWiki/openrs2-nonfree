import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!mo", name = "N", descriptor = "[I")
	public static int[] anIntArray294;

	@OriginalMember(owner = "client!mo", name = "O", descriptor = "Z")
	public static boolean aBoolean228;

	@OriginalMember(owner = "client!mo", name = "R", descriptor = "F")
	public static float aFloat103;

	@OriginalMember(owner = "client!mo", name = "I", descriptor = "[I")
	public static int[] anIntArray293 = new int[50];

	@OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
	public static int anInt3481 = 0;

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
	public static int anInt3482 = 0;

	@OriginalMember(owner = "client!mo", name = "Q", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!mo", name = "X", descriptor = "Z")
	public static boolean aBoolean229 = false;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
	public static void method2811(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static259.method4047(arg2, arg1, null, -1, arg0);
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)V")
	public static void method2812() {
		if (!Static251.aBoolean330 || Static247.aBoolean309) {
			return;
		}
		@Pc(14) Class4_Sub21[][][] local14 = Static261.aClass4_Sub21ArrayArrayArray4;
		for (@Pc(23) int local23 = 0; local23 < local14.length; local23++) {
			@Pc(35) Class4_Sub21[][] local35 = local14[local23];
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				for (@Pc(47) int local47 = 0; local47 < local35[local37].length; local47++) {
					@Pc(63) Class4_Sub21 local63 = local35[local37][local47];
					if (local63 != null) {
						@Pc(81) Class13_Sub1_Sub2 local81;
						if (local63.aClass67_1 != null && local63.aClass67_1.aClass13_3 instanceof Class13_Sub1_Sub2) {
							local81 = (Class13_Sub1_Sub2) local63.aClass67_1.aClass13_3;
							if ((local63.aClass67_1.aLong80 & Long.MIN_VALUE) == 0L) {
								local81.method2790(false, true, true, false, true, true);
							} else {
								local81.method2790(true, true, true, true, true, true);
							}
						}
						if (local63.aClass35_1 != null) {
							if (local63.aClass35_1.aClass13_2 instanceof Class13_Sub1_Sub2) {
								local81 = (Class13_Sub1_Sub2) local63.aClass35_1.aClass13_2;
								if ((Long.MIN_VALUE & local63.aClass35_1.aLong48) == 0L) {
									local81.method2790(false, true, true, false, true, true);
								} else {
									local81.method2790(true, true, true, true, true, true);
								}
							}
							if (local63.aClass35_1.aClass13_1 instanceof Class13_Sub1_Sub2) {
								local81 = (Class13_Sub1_Sub2) local63.aClass35_1.aClass13_1;
								if ((Long.MIN_VALUE & local63.aClass35_1.aLong48) == 0L) {
									local81.method2790(false, true, true, false, true, true);
								} else {
									local81.method2790(true, true, true, true, true, true);
								}
							}
						}
						if (local63.aClass181_1 != null) {
							if (local63.aClass181_1.aClass13_9 instanceof Class13_Sub1_Sub2) {
								local81 = (Class13_Sub1_Sub2) local63.aClass181_1.aClass13_9;
								if ((local63.aClass181_1.aLong206 & Long.MIN_VALUE) == 0L) {
									local81.method2790(false, true, true, false, true, true);
								} else {
									local81.method2790(true, true, true, true, true, true);
								}
							}
							if (local63.aClass181_1.aClass13_10 instanceof Class13_Sub1_Sub2) {
								local81 = (Class13_Sub1_Sub2) local63.aClass181_1.aClass13_10;
								if ((local63.aClass181_1.aLong206 & Long.MIN_VALUE) == 0L) {
									local81.method2790(false, true, true, false, true, true);
								} else {
									local81.method2790(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(277) int local277 = 0; local277 < local63.anInt2694; local277++) {
							if (local63.aClass99Array19[local277].aClass13_4 instanceof Class13_Sub1_Sub2) {
								@Pc(299) Class13_Sub1_Sub2 local299 = (Class13_Sub1_Sub2) local63.aClass99Array19[local277].aClass13_4;
								if ((local63.aClass99Array19[local277].aLong117 & Long.MIN_VALUE) == 0L) {
									local299.method2790(false, true, true, false, true, true);
								} else {
									local299.method2790(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static247.aBoolean309 = true;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)[B")
	public static byte[] method2813(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub2_Sub14 local13 = (Class4_Sub2_Sub14) Static307.aClass111_17.method2890((long) arg0);
		if (local13 == null) {
			@Pc(19) byte[] local19 = new byte[512];
			@Pc(25) Random local25 = new Random((long) arg0);
			@Pc(27) int local27;
			for (local27 = 0; local27 < 255; local27++) {
				local19[local27] = (byte) local27;
			}
			for (local27 = 0; local27 < 255; local27++) {
				@Pc(48) int local48 = 255 - local27;
				@Pc(53) int local53 = Static59.method1118(local48, local25);
				@Pc(57) byte local57 = local19[local53];
				local19[local53] = local19[local48];
				local19[local48] = local19[511 - local27] = local57;
			}
			local13 = new Class4_Sub2_Sub14(local19);
			Static307.aClass111_17.method2886((long) arg0, local13);
		}
		return local13.aByteArray39;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)V")
	public static void method2814() {
		Static51.aClass172_10.method4349(5);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!pi;)Ljava/lang/String;")
	public static String method2815(@OriginalArg(1) Class4_Sub24 arg0) {
		return Static298.method4208(arg0);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method2817(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(34) int local34 = (arg0 ? Static115.anInt2353 : Static277.anInt5456) + local19;
		for (@Pc(36) int local36 = local19; local36 < local34; local36++) {
			@Pc(47) Class4_Sub2_Sub5 local47 = Static67.method1178(local36);
			if (local47.aBoolean65 && local47.method983().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static262.anInt5103 = -1;
					Static174.aShortArray68 = null;
					return;
				}
				if (local11.length <= local13) {
					@Pc(79) short[] local79 = new short[local11.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local13; local81++) {
						local79[local81] = local11[local81];
					}
					local11 = local79;
				}
				local11[local13++] = (short) local36;
			}
		}
		Static247.anInt4859 = 0;
		Static174.aShortArray68 = local11;
		Static262.anInt5103 = local13;
		@Pc(117) String[] local117 = new String[Static262.anInt5103];
		for (@Pc(119) int local119 = 0; local119 < Static262.anInt5103; local119++) {
			local117[local119] = Static67.method1178(local11[local119]).method983();
		}
		Static41.method786(local117, Static174.aShortArray68);
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)Ljava/lang/String;")
	public static String method2818(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
