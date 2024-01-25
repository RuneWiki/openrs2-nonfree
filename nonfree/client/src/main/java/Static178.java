import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_73 = new Class254(67, 6);

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
	public static int anInt3986 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method3528(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static104.anInt7872; local11++) {
			if (arg0.equalsIgnoreCase(Static548.aStringArray49[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static444.aStringArray47[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Lclient!ne;")
	public static Class224 method3530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static256.aClass224ArrayArrayArray1[0][arg1][arg2] != null && Static256.aClass224ArrayArrayArray1[0][arg1][arg2].aClass224_1 != null;
			if (local28 && arg0 >= Static192.anInt4157 - 1) {
				return null;
			}
			Static371.method5916(arg0, arg1, arg2);
		}
		return Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!fu;")
	public static Class11_Sub1 method3532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class270 local14 = local7.aClass270_1; local14 != null; local14 = local14.aClass270_2) {
			@Pc(18) Class11_Sub1 local18 = local14.aClass11_Sub1_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort78 == arg1 && local18.aShort80 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public static void method3533() {
		@Pc(7) Class155 local7 = null;
		try {
			@Pc(13) Class280 local13 = Static414.aClass246_5.method6136("3", false);
			while (local13.anInt8467 == 0) {
				Static566.method8004(1L);
			}
			if (local13.anInt8467 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class155) local13.anObject16;
			@Pc(42) byte[] local42 = new byte[(int) local7.method4076()];
			if (local42.length == 0) {
				Static91.aString22 = "";
				Static500.aString106 = "";
			} else {
				@Pc(69) int local69;
				for (@Pc(56) int local56 = 0; local56 < local42.length; local56 += local69) {
					local69 = local7.method4074(local42, local42.length - local56, local56);
					if (local69 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(90) Class6_Sub26 local90 = new Class6_Sub26(local42);
				@Pc(94) int local94 = local90.method4966();
				if (local94 > 60) {
					throw new RuntimeException("Bad length");
				}
				local90.anInt5769 = local94 + 1;
				if (!local90.method4952()) {
					throw new RuntimeException("Invalid CRC");
				}
				local90.anInt5769 = 1;
				@Pc(125) int local125 = local90.method4966();
				if (local125 > 2) {
					throw new RuntimeException("Invalid version " + local125);
				}
				Static91.aString22 = local90.method4970();
				Static500.aString106 = local90.method4970();
				if (local125 >= 1) {
					Static157.anInt7585 = local90.method4999();
				} else {
					Static157.anInt7585 = Static294.anInt5607;
				}
				if (local125 >= 2) {
					Static236.aLong100 = local90.method4935();
				} else {
					Static236.aLong100 = Static347.aLong149;
				}
			}
		} catch (@Pc(177) Exception local177) {
			Static500.aString106 = "";
			Static91.aString22 = "";
		}
		try {
			if (local7 != null) {
				local7.method4077();
			}
		} catch (@Pc(193) Exception local193) {
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ep;III)V")
	public static void method3534(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static499.anInt8902 = arg2;
		Static430.anInt867 = arg1;
		Static166.aClass93_10 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
	public static void method3535() {
		for (@Pc(12) int local12 = 0; local12 < Static356.aByteArrayArrayArray17.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < Static356.aByteArrayArrayArray17[0].length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static356.aByteArrayArrayArray17[0][0].length; local20++) {
					Static356.aByteArrayArrayArray17[local12][local16][local20] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIBLclient!ep;)V")
	public static void method3537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class93 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray24 != null) {
			@Pc(13) Class6_Sub38 local13 = new Class6_Sub38();
			local13.anObjectArray36 = arg2.anObjectArray24;
			local13.aClass93_14 = arg2;
			Static89.method1979(local13);
		}
		Static530.anInt9191 = arg2.anInt2752;
		Static567.anInt7672 = arg2.anInt2760;
		Static244.anInt4934 = arg2.anInt2790;
		Static353.anInt6817 = arg2.anInt2822;
		Static429.anInt7864 = arg1;
		Static150.anInt7378 = arg2.anInt2806;
		Static25.aBoolean80 = true;
		Static121.anInt2623 = arg0;
		Static468.method7221(arg2);
	}
}
