import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!jn", name = "O", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array7;

	@OriginalMember(owner = "client!jn", name = "V", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array8;

	@OriginalMember(owner = "client!jn", name = "S", descriptor = "Z")
	public static boolean aBoolean240 = false;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!gf;)I")
	public static int method2912(@OriginalArg(1) Class1_Sub5_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt2290;
		@Pc(20) Class103 local20 = arg0.method5552();
		if (arg0.aBoolean460) {
			local8 = arg0.anInt2294;
		} else if (arg0.anInt6423 == local20.anInt2819 || arg0.anInt6423 == local20.anInt2824 || local20.anInt2827 == arg0.anInt6423 || arg0.anInt6423 == local20.anInt2828) {
			local8 = arg0.anInt2293;
		} else if (local20.anInt2836 == arg0.anInt6423 || local20.anInt2820 == arg0.anInt6423 || local20.anInt2813 == arg0.anInt6423 || local20.anInt2826 == arg0.anInt6423) {
			local8 = arg0.anInt2298;
		}
		return local8;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)Lclient!ae;")
	public static Class4 method2913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4 local7 = Static380.method5560(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass4Array1 == null || arg0 >= local7.aClass4Array1.length) {
			return null;
		} else {
			return local7.aClass4Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V")
	public static void method2914(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static372.aClass2_Sub16_Sub2_4.method5355(arg0);
		Static372.aClass2_Sub16_Sub2_4.method5351(arg1);
		Static372.aClass2_Sub16_Sub2_4.method5351(arg2);
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(BI)V")
	public static void method2915(@OriginalArg(0) byte arg0) {
		if (Static68.aByteArrayArrayArray1 == null) {
			Static68.aByteArrayArrayArray1 = new byte[4][Static246.anInt4374][Static185.anInt3485];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static246.anInt4374; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static185.anInt3485; local22++) {
					Static68.aByteArrayArrayArray1[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!is;B)V")
	public static void method2916(@OriginalArg(0) Class111 arg0) {
		@Pc(7) Class25 local7 = null;
		try {
			@Pc(11) Class182 local11 = arg0.method2814();
			while (local11.anInt4498 == 0) {
				Static358.method2028(1L);
			}
			if (local11.anInt4498 == 1) {
				local7 = (Class25) local11.anObject6;
				@Pc(40) Class2_Sub16 local40 = Static241.method3903();
				local7.method589(local40.aByteArray112, local40.anInt6145, 0);
			}
		} catch (@Pc(50) Exception local50) {
		}
		try {
			if (local7 != null) {
				local7.method594();
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Ljava/lang/String;I)J")
	public static long method2918(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (long) arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}
}
