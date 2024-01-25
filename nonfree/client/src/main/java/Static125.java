import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
	public static int anInt2465 = 0;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
	public static int anInt2466 = -1;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public static int anInt2470 = 0;

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString102 = "white:";

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBI)V")
	public static void method2396(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub1_Sub2 local10 = Static42.method1000(15, 0);
		local10.method168();
		local10.anInt85 = arg0;
		local10.anInt75 = arg1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
	public static int method2398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static23.anIntArrayArray1 == null ? 0 : Static23.anIntArrayArray1[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIIIII)V")
	public static void method2400(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 + 1;
		Static97.method1784(arg0, Static327.anIntArrayArray63[arg3], arg1, arg2);
		@Pc(22) int local22 = arg4 - 1;
		Static97.method1784(arg0, Static327.anIntArrayArray63[arg4], arg1, arg2);
		for (@Pc(29) int local29 = local9; local29 <= local22; local29++) {
			@Pc(35) int[] local35 = Static327.anIntArrayArray63[local29];
			local35[arg0] = local35[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lclient!sb;")
	public static Class183 method2401(@OriginalArg(0) int arg0) {
		@Pc(15) Class183 local15 = (Class183) Static76.aClass140_42.method3816((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static185.aClass165_18.method4508(arg0, 1);
		local15 = new Class183();
		local15.anInt5444 = arg0;
		if (local25 != null) {
			local15.method4826(new Class1_Sub7(local25));
		}
		local15.method4823();
		if (local15.anInt5436 == 2 && Static70.aClass26_7.method870((long) arg0) == null) {
			Static70.aClass26_7.method877((long) arg0, new Class1_Sub37(Static5.anInt94));
			Static86.aClass183Array1[Static5.anInt94++] = local15;
		}
		Static76.aClass140_42.method3817((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!aa;Lclient!rg;)V")
	public static void method2402(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class177 arg1) {
		Static47.method1081(0, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
	public static void method2403() {
		if (Static100.aBoolean178) {
			return;
		}
		Static178.method3483(Static269.aClass204ArrayArrayArray3);
		if (Static198.aClass204ArrayArrayArray2 != null) {
			Static178.method3483(Static198.aClass204ArrayArrayArray2);
		}
		Static100.aBoolean178 = true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!cm;ZZI)V")
	public static void method2404(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt1104;
		@Pc(12) int local12 = (int) arg0.aLong215;
		arg0.method5710();
		if (arg2) {
			Static300.method5114(local8);
		}
		Static312.method5691(local8);
		@Pc(32) Class177 local32 = Static140.method2694(local12);
		if (local32 != null) {
			Static133.method2517(local32);
		}
		Static164.method3164();
		if (!arg1 && Static100.anInt2086 != -1) {
			Static152.method2897(1, Static100.anInt2086);
		}
		@Pc(56) Class39 local56 = new Class39(Static348.aClass26_20);
		for (@Pc(61) Class1_Sub9 local61 = (Class1_Sub9) local56.method1320(); local61 != null; local61 = (Class1_Sub9) local56.method1321()) {
			if (!local61.method5711()) {
				local61 = (Class1_Sub9) local56.method1320();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt1106 == 3) {
				@Pc(85) int local85 = (int) local61.aLong215;
				if (local85 >>> 16 == local8) {
					method2404(local61, arg1, true);
				}
			}
		}
	}
}
