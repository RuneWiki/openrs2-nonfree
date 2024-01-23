import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lclient!th;")
	public static Class168 aClass168_9;

	@OriginalMember(owner = "client!ah", name = "Z", descriptor = "[[[Lclient!aa;")
	public static Class1_Sub2[][][] aClass1_Sub2ArrayArrayArray1;

	@OriginalMember(owner = "client!ah", name = "ab", descriptor = "Lclient!th;")
	public static Class168 aClass168_10;

	@OriginalMember(owner = "client!ah", name = "db", descriptor = "I")
	public static int anInt207;

	@OriginalMember(owner = "client!ah", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString17 = "shake:";

	@OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
	public static int anInt206 = 0;

	@OriginalMember(owner = "client!ah", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString18 = "Please wait...";

	@OriginalMember(owner = "client!ah", name = "cb", descriptor = "Lclient!jl;")
	public static Class89 aClass89_1 = new Class89(128);

	@OriginalMember(owner = "client!ah", name = "hb", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ah", name = "ib", descriptor = "I")
	public static int anInt211 = -1;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)I")
	public static int method241() {
		try {
			if (Static202.anInt4406 == 0) {
				if (Static286.aLong224 > Static258.method3967() - 5000L) {
					return 0;
				}
				Static315.aClass47_8 = Static142.aClass112_2.method2889(Static130.aString178, Static313.anInt6274);
				Static265.aLong203 = Static258.method3967();
				Static202.anInt4406 = 1;
			}
			if (Static258.method3967() > Static265.aLong203 + 30000L) {
				return Static151.method2449(1000);
			}
			@Pc(81) int local81;
			@Pc(122) int local122;
			if (Static202.anInt4406 == 1) {
				if (Static315.aClass47_8.anInt1417 == 2) {
					return Static151.method2449(1001);
				}
				if (Static315.aClass47_8.anInt1417 != 1) {
					return -1;
				}
				Static5.aClass104_5 = new Class104((Socket) Static315.aClass47_8.anObject2, Static142.aClass112_2);
				local81 = 0;
				Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
				if (Static155.aBoolean224) {
					local81 = Static125.anInt2712;
				}
				Static315.aClass47_8 = null;
				Static2.aClass1_Sub14_Sub1_1.method2191(23);
				Static2.aClass1_Sub14_Sub1_1.method2236(local81);
				Static5.aClass104_5.method2579(Static2.aClass1_Sub14_Sub1_1.aByteArray55, Static2.aClass1_Sub14_Sub1_1.anInt3000);
				if (Static114.aClass15_1 != null) {
					Static114.aClass15_1.method1249();
				}
				if (Static157.aClass15_2 != null) {
					Static157.aClass15_2.method1249();
				}
				local122 = Static5.aClass104_5.method2573();
				if (Static114.aClass15_1 != null) {
					Static114.aClass15_1.method1249();
				}
				if (Static157.aClass15_2 != null) {
					Static157.aClass15_2.method1249();
				}
				if (local122 != 0) {
					return Static151.method2449(local122);
				}
				Static202.anInt4406 = 2;
			}
			if (Static202.anInt4406 == 2) {
				if (Static5.aClass104_5.method2581() < 2) {
					return -1;
				}
				Static287.anInt5745 = Static5.aClass104_5.method2573();
				Static287.anInt5745 <<= 0x8;
				Static287.anInt5745 += Static5.aClass104_5.method2573();
				Static292.aByteArray69 = new byte[Static287.anInt5745];
				Static238.anInt4978 = 0;
				Static202.anInt4406 = 3;
			}
			if (Static202.anInt4406 != 3) {
				return -1;
			}
			local81 = Static5.aClass104_5.method2581();
			if (local81 < 1) {
				return -1;
			}
			if (local81 > Static287.anInt5745 - Static238.anInt4978) {
				local81 = Static287.anInt5745 - Static238.anInt4978;
			}
			Static5.aClass104_5.method2574(Static292.aByteArray69, Static238.anInt4978, local81);
			Static238.anInt4978 += local81;
			if (Static238.anInt4978 < Static287.anInt5745) {
				return -1;
			} else if (Static194.method3118(Static292.aByteArray69)) {
				Static313.aClass80_Sub1Array2 = new Class80_Sub1[Static250.anInt5103];
				local122 = 0;
				for (@Pc(248) int local248 = Static8.anInt228; local248 <= Static145.anInt6068; local248++) {
					@Pc(255) Class80_Sub1 local255 = Static215.method3450(local248);
					if (local255 != null) {
						Static313.aClass80_Sub1Array2[local122++] = local255;
					}
				}
				Static5.aClass104_5.method2571();
				Static5.aClass104_5 = null;
				Static202.anInt4406 = 0;
				Static292.aByteArray69 = null;
				Static139.anInt3175 = 0;
				Static286.aLong224 = Static258.method3967();
				return 0;
			} else {
				return Static151.method2449(1002);
			}
		} catch (@Pc(284) IOException local284) {
			return Static151.method2449(1003);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!lb;Z)V")
	public static void method243(@OriginalArg(0) Class46_Sub1 arg0) {
		@Pc(7) int local7;
		for (local7 = 0; local7 < Static107.anIntArray183.length; local7++) {
			Static107.anIntArray183[local7] = 0;
		}
		@Pc(39) int local39;
		for (local7 = 0; local7 < 5000; local7++) {
			local39 = (int) ((double) 256 * Math.random() * 128.0D);
			Static107.anIntArray183[local39] = (int) (Math.random() * 284.0D);
		}
		@Pc(69) int local69;
		@Pc(78) int local78;
		for (local7 = 0; local7 < 20; local7++) {
			for (local39 = 1; local39 < 255; local39++) {
				for (local69 = 1; local69 < 127; local69++) {
					local78 = local69 + (local39 << 7);
					Static234.anIntArray458[local78] = (Static107.anIntArray183[local78 + 128] + Static107.anIntArray183[local78 - 1] + Static107.anIntArray183[local78 + 1] + Static107.anIntArray183[local78 - 128]) / 4;
				}
			}
			@Pc(115) int[] local115 = Static107.anIntArray183;
			Static107.anIntArray183 = Static234.anIntArray458;
			Static234.anIntArray458 = local115;
		}
		if (arg0 == null) {
			return;
		}
		local7 = 0;
		for (local39 = 0; local39 < arg0.anInt4751; local39++) {
			for (local69 = 0; local69 < arg0.anInt4753; local69++) {
				if (arg0.aByteArray57[local7++] != 0) {
					local78 = arg0.anInt4748 + local69 + 16;
					@Pc(162) int local162 = local39 + arg0.anInt4752 + 16;
					@Pc(168) int local168 = (local162 << 7) + local78;
					Static107.anIntArray183[local168] = 0;
				}
			}
		}
	}
}
