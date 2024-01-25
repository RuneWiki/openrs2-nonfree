import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Lclient!qn;")
	public static Class1_Sub21 aClass1_Sub21_1;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
	public static int anInt6023;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
	public static final int anInt6015 = 52;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg3);
		@Pc(17) int local17 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg2);
		@Pc(23) int local23 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg5);
		@Pc(29) int local29 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg1);
		@Pc(38) int local38 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg3 + arg0);
		@Pc(47) int local47 = Static223.method5338(Static197.anInt4211, Static326.anInt2469, arg2 - arg0);
		for (@Pc(58) int local58 = local11; local58 < local38; local58++) {
			Static39.method919(arg6, Static344.anIntArrayArray65[local58], local29, local23);
		}
		for (@Pc(80) int local80 = local17; local80 > local47; local80--) {
			Static39.method919(arg6, Static344.anIntArrayArray65[local80], local29, local23);
		}
		@Pc(106) int local106 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg5 + arg0);
		@Pc(115) int local115 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg1 - arg0);
		for (@Pc(117) int local117 = local38; local117 <= local47; local117++) {
			@Pc(123) int[] local123 = Static344.anIntArrayArray65[local117];
			Static39.method919(arg6, local123, local106, local23);
			Static39.method919(arg4, local123, local115, local106);
			Static39.method919(arg6, local123, local29, local115);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public static void method5126() {
		Static287.aClass87_50.method2485();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)V")
	public static void method5127(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub4_Sub9 local17 = Static139.method4227(arg0, 9);
		local17.method1868();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V")
	public static void method5128() {
		@Pc(5) Class87 local5 = Static20.aClass87_3;
		synchronized (Static20.aClass87_3) {
			Static20.aClass87_3.method2473(5);
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(IZ)V")
	public static void method5129(@OriginalArg(0) int arg0) {
		Static2.anInt76 = arg0;
		@Pc(12) Class87 local12 = Static77.aClass87_16;
		synchronized (Static77.aClass87_16) {
			Static77.aClass87_16.method2485();
		}
		local12 = Static124.aClass87_24;
		synchronized (Static124.aClass87_24) {
			Static124.aClass87_24.method2485();
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(ILclient!bg;)Lclient!vn;")
	public static Class14_Sub4 method5133(@OriginalArg(1) Class1_Sub8 arg0) {
		return new Class14_Sub4(arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4514(), arg0.method4514(), arg0.method4532());
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
	public static void method5134() {
		Static169.method3380(Static324.anInt6232);
		@Pc(24) int local24 = (Static234.anInt4783 >> 3) + (Static320.anInt5326 >> 10);
		@Pc(32) int local32 = (Static32.anInt2224 >> 3) + (Static64.anInt1797 >> 10);
		Static145.anIntArray271 = new int[18];
		Static315.aByteArrayArray23 = new byte[18][];
		Static261.anIntArray161 = new int[18];
		aByteArrayArray22 = new byte[18][];
		Static222.anIntArray416 = new int[18];
		Static325.anIntArray507 = new int[18];
		Static327.anIntArrayArray61 = new int[18][4];
		Static345.aByteArrayArray25 = new byte[18][];
		Static8.aByteArrayArray21 = new byte[18][];
		Static263.aByteArrayArray16 = new byte[18][];
		Static318.anIntArray500 = new int[18];
		Static254.anIntArray445 = new int[18];
		@Pc(79) int local79 = 0;
		@Pc(99) int local99;
		for (@Pc(88) int local88 = (local24 - (Static233.anInt5573 >> 4)) / 8; local88 <= ((Static233.anInt5573 >> 4) + local24) / 8; local88++) {
			for (local99 = (local32 - (Static134.anInt2971 >> 4)) / 8; local99 <= (local32 + (Static134.anInt2971 >> 4)) / 8; local99++) {
				@Pc(107) int local107 = local99 + (local88 << 8);
				Static222.anIntArray416[local79] = local107;
				Static261.anIntArray161[local79] = Static24.aClass216_6.method5660("m" + local88 + "_" + local99);
				Static254.anIntArray445[local79] = Static24.aClass216_6.method5660("l" + local88 + "_" + local99);
				Static318.anIntArray500[local79] = Static24.aClass216_6.method5660("n" + local88 + "_" + local99);
				Static325.anIntArray507[local79] = Static24.aClass216_6.method5660("um" + local88 + "_" + local99);
				Static145.anIntArray271[local79] = Static24.aClass216_6.method5660("ul" + local88 + "_" + local99);
				if (Static318.anIntArray500[local79] == -1) {
					Static261.anIntArray161[local79] = -1;
					Static254.anIntArray445[local79] = -1;
					Static325.anIntArray507[local79] = -1;
					Static145.anIntArray271[local79] = -1;
				}
				local79++;
			}
		}
		for (local99 = local79; local99 < Static318.anIntArray500.length; local99++) {
			Static318.anIntArray500[local99] = -1;
			Static261.anIntArray161[local99] = -1;
			Static254.anIntArray445[local99] = -1;
			Static325.anIntArray507[local99] = -1;
			Static145.anIntArray271[local99] = -1;
		}
		Static148.method2959(true, 8, 0, local24, false, 8, local32);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;ZLclient!nh;IZ)V")
	public static void method5135(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static75.method1720(arg0, 3, arg2);
			return;
		}
		@Pc(26) String local26;
		if (Static207.aString41.startsWith("win") && Static207.anInt4332 != 3) {
			local26 = null;
			if (arg2.anApplet1 != null) {
				local26 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local26 == null || !local26.equals("1")) {
				@Pc(46) Class162 local46 = Static75.method1720(arg0, 0, arg2);
				Static157.aString51 = arg0;
				Static20.aClass143_2 = arg2;
				Static127.aClass162_4 = local46;
				return;
			}
		}
		if (Static207.aString41.startsWith("mac")) {
			local26 = null;
			if (arg2.anApplet1 != null) {
				local26 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local26 != null && local26.equals("1") && arg1) {
				Static75.method1720(arg0, 1, arg2);
				return;
			}
		}
		Static75.method1720(arg0, 2, arg2);
	}
}
