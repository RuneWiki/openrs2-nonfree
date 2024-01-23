import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "[[[Lclient!pf;")
	public static Class1_Sub22[][][] aClass1_Sub22ArrayArrayArray1;

	@OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
	public static int anInt1007;

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "Lclient!kh;")
	public static Class60 aClass60_330 = Static200.method3116("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
	public static int anInt1000 = 3;

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "Lclient!kh;")
	private static Class60 aClass60_331 = Static200.method3116(" seconds)3");

	@OriginalMember(owner = "client!ec", name = "bb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_332 = Static200.method3116("titlebutton");

	@OriginalMember(owner = "client!ec", name = "db", descriptor = "Lclient!kh;")
	public static Class60 aClass60_333 = Static200.method3116("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!ec", name = "hb", descriptor = "Lclient!vg;")
	public static Interface4 anInterface4_1 = null;

	@OriginalMember(owner = "client!ec", name = "kb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_334 = aClass60_331;

	@OriginalMember(owner = "client!ec", name = "lb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_335 = Static200.method3116(":duelfriend:");

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)Lclient!tc;")
	public static Class1_Sub1_Sub23 method760(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub23 local10 = (Class1_Sub1_Sub23) Static208.aClass39_27.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static10.aClass7_3.method3242(Static8.method150(arg0), Static142.method2447(arg0));
		local10 = new Class1_Sub1_Sub23();
		local10.anInt4033 = arg0;
		if (local24 != null) {
			local10.method2949(new Class1_Sub9(local24));
		}
		local10.method2937();
		if (local10.aBoolean221) {
			local10.aBoolean223 = false;
			local10.anInt4023 = 0;
		}
		if (!Static15.aBoolean31 && local10.aBoolean218) {
			local10.aClass60Array28 = null;
		}
		Static208.aClass39_27.method1152((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!kh;)Lclient!gf;")
	public static Class1_Sub10 method761(@OriginalArg(1) Class60 arg0) {
		if (arg0.method1835() == 0) {
			return null;
		}
		for (@Pc(24) Class1_Sub10 local24 = (Class1_Sub10) Static39.aClass19_5.method609(); local24 != null; local24 = (Class1_Sub10) Static39.aClass19_5.method615()) {
			if (local24.aClass60_512.method1806(arg0)) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!nc;ZIIIIIBI)V")
	public static void method762(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		@Pc(17) int local17;
		if (arg6 < 0 || arg6 >= 104 || arg5 < 0 || arg5 >= 104) {
			while (true) {
				local17 = arg0.method895();
				if (local17 == 0) {
					break;
				}
				if (local17 == 1) {
					arg0.method895();
					break;
				}
				if (local17 <= 49) {
					arg0.method895();
				}
			}
			return;
		}
		Static209.aByteArrayArrayArray13[arg3][arg6][arg5] = 0;
		while (true) {
			local17 = arg0.method895();
			if (local17 == 0) {
				if (arg3 == 0) {
					Static138.anIntArrayArrayArray17[0][arg6][arg5] = -Static17.method314(arg6 + arg4 + 932731, arg5 - -arg2 + 556238) * 8;
				} else {
					Static138.anIntArrayArrayArray17[arg3][arg6][arg5] = Static138.anIntArrayArrayArray17[arg3 - 1][arg6][arg5] - 240;
				}
				break;
			}
			if (local17 == 1) {
				@Pc(134) int local134 = arg0.method895();
				if (local134 == 1) {
					local134 = 0;
				}
				if (arg3 == 0) {
					Static138.anIntArrayArrayArray17[0][arg6][arg5] = -local134 * 8;
				} else {
					Static138.anIntArrayArrayArray17[arg3][arg6][arg5] = Static138.anIntArrayArrayArray17[arg3 - 1][arg6][arg5] - local134 * 8;
				}
				break;
			}
			if (local17 <= 49) {
				Static66.aByteArrayArrayArray1[arg3][arg6][arg5] = arg0.method891();
				Static108.aByteArrayArrayArray4[arg3][arg6][arg5] = (byte) ((local17 - 2) / 4);
				Static100.aByteArrayArrayArray3[arg3][arg6][arg5] = (byte) (local17 + arg1 - 2 & 0x3);
			} else if (local17 <= 81) {
				Static209.aByteArrayArrayArray13[arg3][arg6][arg5] = (byte) (local17 - 49);
			} else {
				Static173.aByteArrayArrayArray8[arg3][arg6][arg5] = (byte) (local17 - 81);
			}
		}
	}
}
