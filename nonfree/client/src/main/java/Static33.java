import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	public static int anInt717;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "[S")
	public static short[] aShortArray15 = new short[256];

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
	public static int anInt720 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!rg;)V")
	public static void method611(@OriginalArg(1) Class48_Sub2 arg0) {
		@Pc(7) int local7;
		for (local7 = 0; local7 < Static253.anIntArray600.length; local7++) {
			Static253.anIntArray600[local7] = 0;
		}
		@Pc(39) int local39;
		for (local7 = 0; local7 < 5000; local7++) {
			local39 = (int) (Math.random() * 128.0D * (double) 256);
			Static253.anIntArray600[local39] = (int) (Math.random() * 284.0D);
		}
		@Pc(63) int local63;
		@Pc(73) int local73;
		for (local7 = 0; local7 < 20; local7++) {
			for (local39 = 1; local39 < 255; local39++) {
				for (local63 = 1; local63 < 127; local63++) {
					local73 = local63 + (local39 << 7);
					Static120.anIntArray285[local73] = (Static253.anIntArray600[local73 + 128] + Static253.anIntArray600[local73 + 1] + Static253.anIntArray600[local73 - 1] + Static253.anIntArray600[local73 + -128]) / 4;
				}
			}
			@Pc(109) int[] local109 = Static253.anIntArray600;
			Static253.anIntArray600 = Static120.anIntArray285;
			Static120.anIntArray285 = local109;
		}
		if (arg0 == null) {
			return;
		}
		local7 = 0;
		for (local39 = 0; local39 < arg0.anInt4746; local39++) {
			for (local63 = 0; local63 < arg0.anInt4754; local63++) {
				if (arg0.aByteArray77[local7++] != 0) {
					local73 = arg0.anInt4752 + local63 + 16;
					@Pc(162) int local162 = local39 + arg0.anInt4748 + 16;
					@Pc(168) int local168 = local73 + (local162 << 7);
					Static253.anIntArray600[local168] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public static void method612() {
		if (Static179.aClass112_1 != null) {
			@Pc(5) Class112 local5 = Static179.aClass112_1;
			synchronized (Static179.aClass112_1) {
				Static179.aClass112_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Lclient!ak;I)Lclient!f;")
	public static Class50 method615(@OriginalArg(0) String arg0, @OriginalArg(1) Class7 arg1) {
		@Pc(12) int local12 = arg1.method264(arg0);
		if (local12 == -1) {
			return new Class50(0);
		}
		@Pc(29) int[] local29 = arg1.method266(local12);
		@Pc(35) Class50 local35 = new Class50(local29.length);
		for (@Pc(37) int local37 = 0; local37 < local35.anInt1409; local37++) {
			@Pc(52) Class1_Sub18 local52 = new Class1_Sub18(arg1.method253(local29[local37], local12));
			local35.aStringArray6[local37] = local52.method3101();
			local35.aByteArray17[local37] = local52.method3082();
			local35.anIntArray169[local37] = local52.method3074();
			local35.anIntArray168[local37] = local52.method3074();
		}
		return local35;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method616(@OriginalArg(1) String arg0) {
		if (Static95.anInt1824 >= 2) {
			@Pc(17) int local17;
			@Pc(37) int local37;
			@Pc(28) Runtime local28;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static264.method1809();
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				local28 = Runtime.getRuntime();
				local37 = (int) ((local28.totalMemory() - local28.freeMemory()) / 1024L);
				Static48.method843("mem=" + local37 + "k", 0, null);
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static264.method1809();
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				local28 = Runtime.getRuntime();
				local37 = (int) ((local28.totalMemory() - local28.freeMemory()) / 1024L);
				Static48.method843("Memory before cleanup=" + local37 + "k", 0, null);
				Static17.method314();
				Static264.method1809();
				for (@Pc(100) int local100 = 0; local100 < 10; local100++) {
					System.gc();
				}
				local37 = (int) ((local28.totalMemory() - local28.freeMemory()) / 1024L);
				Static48.method843("Memory after cleanup=" + local37 + "k", 0, null);
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static48.method843("Number of player models in cache:" + Static146.method2279(), 0, null);
			}
			if (Static240.aBoolean369 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static154.anInt2853);
				System.out.println("oncard_2d:" + Static154.anInt2854);
				System.out.println("oncard_texture:" + Static154.anInt2855);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static276.method4249();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static137.aClass168_3.method4279();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static137.aClass168_3.method4278();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static13.aClass84_3.method1957();
				Static155.aClass73_3.method1688();
				Static137.aClass168_3.method4277();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static242.aBoolean388 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static299.method4554(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static63.aBoolean101 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static63.aBoolean101 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static282.method4510(0, false, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static282.method4510(1, false, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static282.method4510(2, false, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static282.method4510(3, false, 768, 1024);
			}
			if (arg0.startsWith("::setba")) {
				Static207.anInt4118 = Static75.method1281(arg0.substring(8));
				Static147.method2287(Static13.aClass84_3);
				Static37.aBoolean219 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static200.method3047(Static75.method1281(arg0.substring(15)));
				Static147.method2287(Static13.aClass84_3);
				Static37.aBoolean219 = false;
			}
			if (arg0.startsWith("::fps ") && Static243.anInt5013 != 0) {
				Static16.method306(Static75.method1281(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static58.anInt1223 = Static75.method1281(arg0.substring(12).trim());
				Static48.method843("rect_debug=" + Static58.anInt1223, 0, null);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static26.aBoolean49 = true;
			}
			if (arg0.startsWith("::hdr") && Static240.aBoolean369 && !Static260.method4026(!Static111.method1735())) {
				Static48.method843("Failed to enable hdr", 0, null);
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static24.aBoolean44) {
					Static24.aBoolean44 = false;
					Static48.method843("Forced tweening disabled.", 0, null);
				} else {
					Static24.aBoolean44 = true;
					Static48.method843("Forced tweening ENABLED!", 0, null);
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static266.aBoolean410) {
					System.out.println("Shift-click disabled.");
					Static266.aBoolean410 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static266.aBoolean410 = true;
				}
			}
		}
		Static270.aClass1_Sub18_Sub1_3.method3130(90);
		Static270.aClass1_Sub18_Sub1_3.method3093(arg0.length() - 1);
		Static270.aClass1_Sub18_Sub1_3.method3067(arg0.substring(2));
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!jh;)[Lclient!df;")
	public static Class34[] method617(@OriginalArg(1) Class84 arg0) {
		if (!arg0.method1966()) {
			return new Class34[0];
		}
		@Pc(16) Class118 local16 = arg0.method1970();
		while (local16.anInt3187 == 0) {
			Static275.method4233(10L);
		}
		if (local16.anInt3187 == 2) {
			return new Class34[0];
		}
		@Pc(48) int[] local48 = (int[]) local16.anObject3;
		@Pc(54) Class34[] local54 = new Class34[local48.length >> 2];
		for (@Pc(56) int local56 = 0; local56 < local54.length; local56++) {
			@Pc(68) Class34 local68 = new Class34();
			local54[local56] = local68;
			local68.anInt1118 = local48[local56 << 2];
			local68.anInt1121 = local48[(local56 << 2) + 1];
			local68.anInt1119 = local48[(local56 << 2) + 2];
			local68.anInt1124 = local48[(local56 << 2) + 3];
		}
		return local54;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Lclient!p;")
	public static Class130 method619(@OriginalArg(0) int arg0) {
		@Pc(10) Class130 local10 = (Class130) Static26.aClass31_7.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static122.aClass7_114.method253(arg0, 1);
		local10 = new Class130();
		if (local21 != null) {
			local10.method2967(new Class1_Sub18(local21), arg0);
		}
		Static26.aClass31_7.method851(local10, (long) arg0);
		return local10;
	}
}
