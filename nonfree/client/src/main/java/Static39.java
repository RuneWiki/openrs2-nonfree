import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!co", name = "j", descriptor = "[S")
	public static short[] aShortArray27;

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString40 = "cyan:";

	@OriginalMember(owner = "client!co", name = "f", descriptor = "[I")
	public static int[] anIntArray108 = new int[2048];

	@OriginalMember(owner = "client!co", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString41 = "Checking for updates - ";

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	public static void method882() {
		if (Static179.anIntArray362 != null && Static74.anIntArray191 != null) {
			return;
		}
		Static179.anIntArray362 = new int[256];
		Static74.anIntArray191 = new int[256];
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(29) double local29 = (double) local19 / 255.0D * 6.283185307179586D;
			Static179.anIntArray362[local19] = (int) (Math.sin(local29) * 4096.0D);
			Static74.anIntArray191[local19] = (int) (Math.cos(local29) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)I")
	public static int method883(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V")
	public static void method884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
		Static81.aClass1_Sub16_Sub1_1.method2621(20);
		Static81.aClass1_Sub16_Sub1_1.method2621(arg0);
		Static81.aClass1_Sub16_Sub1_1.method2621(arg3);
		Static81.aClass1_Sub16_Sub1_1.method2624(arg2);
		Static81.aClass1_Sub16_Sub1_1.method2624(arg1);
		Static57.anInt1510 = 0;
		Static174.anInt3970 = -3;
		Static25.anInt507 = 1;
		Static110.anInt2378 = 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)V")
	public static void method885(@OriginalArg(1) int arg0) {
		if (!Static91.method1593(arg0)) {
			return;
		}
		@Pc(19) Class116[] local19 = Static81.aClass116ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(29) Class116 local29 = local19[local21];
			if (local29 != null) {
				local29.anInt4380 = 1;
				local29.anInt4369 = 0;
				local29.anInt4374 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public static void method886() {
		if (Static25.anInt507 == 0) {
			return;
		}
		try {
			if (++Static57.anInt1510 > 2000) {
				if (Static22.aClass41_1 != null) {
					Static22.aClass41_1.method1062();
					Static22.aClass41_1 = null;
				}
				if (Static110.anInt2378 >= 1) {
					Static25.anInt507 = 0;
					Static174.anInt3970 = -5;
					return;
				}
				if (Static15.anInt393 == Static206.anInt4590) {
					Static206.anInt4590 = Static98.anInt2195;
				} else {
					Static206.anInt4590 = Static15.anInt393;
				}
				Static57.anInt1510 = 0;
				Static110.anInt2378++;
				Static25.anInt507 = 1;
			}
			if (Static25.anInt507 == 1) {
				Static36.aClass43_1 = Static43.aClass66_1.method1616(Static206.anInt4590, Static194.aString136);
				Static25.anInt507 = 2;
			}
			@Pc(115) int local115;
			if (Static25.anInt507 == 2) {
				if (Static36.aClass43_1.anInt1456 == 2) {
					throw new IOException();
				}
				if (Static36.aClass43_1.anInt1456 != 1) {
					return;
				}
				Static22.aClass41_1 = new Class41((Socket) Static36.aClass43_1.anObject3, Static43.aClass66_1);
				Static36.aClass43_1 = null;
				Static22.aClass41_1.method1068(Static81.aClass1_Sub16_Sub1_1.aByteArray39, Static81.aClass1_Sub16_Sub1_1.anInt3328);
				if (Static273.aClass9_2 != null) {
					Static273.aClass9_2.method4341();
				}
				if (Static264.aClass9_1 != null) {
					Static264.aClass9_1.method4341();
				}
				local115 = Static22.aClass41_1.method1066();
				if (Static273.aClass9_2 != null) {
					Static273.aClass9_2.method4341();
				}
				if (Static264.aClass9_1 != null) {
					Static264.aClass9_1.method4341();
				}
				if (local115 != 21) {
					Static174.anInt3970 = local115;
					Static25.anInt507 = 0;
					Static22.aClass41_1.method1062();
					Static22.aClass41_1 = null;
					return;
				}
				Static25.anInt507 = 3;
			}
			if (Static25.anInt507 == 3) {
				if (Static22.aClass41_1.method1067() < 1) {
					return;
				}
				Static122.aStringArray12 = new String[Static22.aClass41_1.method1066()];
				Static25.anInt507 = 4;
			}
			if (Static25.anInt507 == 4) {
				if (Static22.aClass41_1.method1067() < Static122.aStringArray12.length * 8) {
					return;
				}
				Static222.aClass1_Sub16_Sub1_3.anInt3328 = 0;
				Static22.aClass41_1.method1059(Static122.aStringArray12.length * 8, Static222.aClass1_Sub16_Sub1_3.aByteArray39, 0);
				for (local115 = 0; local115 < Static122.aStringArray12.length; local115++) {
					Static122.aStringArray12[local115] = Static222.method3915(Static222.aClass1_Sub16_Sub1_3.method2602());
				}
				Static25.anInt507 = 0;
				Static174.anInt3970 = 21;
				Static22.aClass41_1.method1062();
				Static22.aClass41_1 = null;
				return;
			}
		} catch (@Pc(231) IOException local231) {
			if (Static22.aClass41_1 != null) {
				Static22.aClass41_1.method1062();
				Static22.aClass41_1 = null;
			}
			if (Static110.anInt2378 >= 1) {
				Static174.anInt3970 = -4;
				Static25.anInt507 = 0;
			} else {
				Static57.anInt1510 = 0;
				if (Static206.anInt4590 == Static15.anInt393) {
					Static206.anInt4590 = Static98.anInt2195;
				} else {
					Static206.anInt4590 = Static15.anInt393;
				}
				Static110.anInt2378++;
				Static25.anInt507 = 1;
			}
		}
	}
}
