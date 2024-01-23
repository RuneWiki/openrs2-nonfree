import java.awt.event.ActionEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	public static int anInt4054;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "I")
	public static int anInt4057;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!te", name = "y", descriptor = "I")
	public static int anInt4067;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "Lclient!ek;")
	public static Class1_Sub1_Sub6 aClass1_Sub1_Sub6_2;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "I")
	public static int anInt4058 = 0;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1311 = Static186.method3527("shake:");

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1312 = aClass50_1311;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger4 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!te", name = "q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1313 = aClass50_1311;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1314 = Static186.method3527("cookieprefix");

	@OriginalMember(owner = "client!te", name = "t", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1315 = Static186.method3527("sl_back");

	@OriginalMember(owner = "client!te", name = "w", descriptor = "I")
	public static int anInt4066 = 0;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "Lclient!oj;")
	public static Class84 aClass84_34 = new Class84(100);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIB[B[Lclient!cg;Z)V")
	public static void method3211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class16[] arg3) {
		@Pc(7) int local7 = -1;
		@Pc(17) Class1_Sub17 local17 = new Class1_Sub17(arg2);
		while (true) {
			@Pc(21) int local21 = local17.method2132();
			if (local21 == 0) {
				return;
			}
			@Pc(28) int local28 = 0;
			local7 += local21;
			while (true) {
				@Pc(36) int local36 = local17.method2156();
				if (local36 == 0) {
					break;
				}
				local28 += local36 - 1;
				@Pc(51) int local51 = local28 & 0x3F;
				@Pc(57) int local57 = local28 >> 6 & 0x3F;
				@Pc(61) int local61 = local17.method2142();
				@Pc(65) int local65 = local28 >> 12;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = local51 + arg1;
				@Pc(77) int local77 = arg0 + local57;
				@Pc(81) int local81 = local61 >> 2;
				if (local77 > 0 && local73 > 0 && local77 < 103 && local73 < 103) {
					@Pc(96) Class16 local96 = null;
					@Pc(100) int local100 = local65;
					if ((Static159.aByteArrayArrayArray13[1][local77][local73] & 0x2) == 2) {
						local100 = local65 - 1;
					}
					if (local100 >= 0) {
						local96 = arg3[local100];
					}
					Static195.method3168(local69, local7, local96, local73, local77, true, local65, local65, local81);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Z")
	public static boolean method3212(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/Object;Lclient!pc;)V")
	public static void method3213(@OriginalArg(1) Object arg0, @OriginalArg(2) Class87 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static204.method3250(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!hh;)Z")
	public static boolean method3214(@OriginalArg(1) Class50 arg0) {
		try {
			@Pc(10) int local10 = arg0.method1252();
			if (local10 == -1) {
				return false;
			}
			@Pc(21) Class50 local21 = arg0.method1216(local10, 0);
			@Pc(28) Class50 local28 = arg0.method1244(local10 + 1);
			@Pc(31) MessageDigest local31 = MessageDigest.getInstance("SHA");
			local31.reset();
			local31.update(local21.method1230());
			@Pc(41) byte[] local41 = local31.digest();
			@Pc(45) byte[] local45 = local28.method1227();
			@Pc(50) Class1_Sub17 local50 = new Class1_Sub17(5000);
			local50.method2158(local45, local45.length);
			local50.anInt2656 = 0;
			local50.method2152(Static100.aBigInteger3, Static60.aBigInteger2);
			if (local50.aByteArray40[0] != 1) {
				return false;
			}
			for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
				if (local41[local77] != local50.aByteArray40[local77 + 1]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(104) Exception local104) {
			return false;
		}
	}
}
