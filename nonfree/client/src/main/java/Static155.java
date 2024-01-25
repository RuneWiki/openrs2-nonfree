import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!io", name = "h", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "Lclient!pc;")
	public static Class176 aClass176_6;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_82 = new Class77(80, 3);

	@OriginalMember(owner = "client!io", name = "f", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_105 = new Class221("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!io", name = "j", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_79 = new Class41(9, 16);

	@OriginalMember(owner = "client!io", name = "k", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_83 = new Class77(29, 15);

	@OriginalMember(owner = "client!io", name = "l", descriptor = "I")
	public static int anInt2779 = 765;

	@OriginalMember(owner = "client!io", name = "m", descriptor = "I")
	public static int anInt2780 = 0;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "I")
	public static int anInt2781 = 0;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_80 = new Class41(42, 1);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IB[Lclient!ms;)V")
	public static void method2587(@OriginalArg(0) int arg0, @OriginalArg(2) Class155[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class155 local13 = arg1[local7];
			if (local13 != null) {
				if (local13.anInt4164 == 0) {
					if (local13.aClass155Array2 != null) {
						method2587(arg0, local13.aClass155Array2);
					}
					@Pc(34) Class2_Sub41 local34 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local13.anInt4166);
					if (local34 != null) {
						Static61.method1131(local34.anInt6411, arg0);
					}
				}
				@Pc(53) Class2_Sub24 local53;
				if (arg0 == 0 && local13.anObjectArray6 != null) {
					local53 = new Class2_Sub24();
					local53.aClass155_23 = local13;
					local53.anObjectArray5 = local13.anObjectArray6;
					Static157.method2604(local53);
				}
				if (arg0 == 1 && local13.anObjectArray13 != null) {
					if (local13.anInt4135 >= 0) {
						@Pc(81) Class155 local81 = Static240.method3886(local13.anInt4166);
						if (local81 == null || local81.aClass155Array2 == null || local13.anInt4135 >= local81.aClass155Array2.length || local81.aClass155Array2[local13.anInt4135] != local13) {
							continue;
						}
					}
					local53 = new Class2_Sub24();
					local53.aClass155_23 = local13;
					local53.anObjectArray5 = local13.anObjectArray13;
					Static157.method2604(local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
	public static void method2588() {
		if (Static353.anIntArray753 != null && Static60.anIntArray160 != null) {
			return;
		}
		Static60.anIntArray160 = new int[256];
		Static353.anIntArray753 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(27) double local27 = (double) local18 / 255.0D * 6.283185307179586D;
			Static353.anIntArray753[local18] = (int) (Math.sin(local27) * 4096.0D);
			Static60.anIntArray160[local18] = (int) (Math.cos(local27) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2589(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(19) char[] local19 = new char[local16];
		@Pc(21) byte local21 = 2;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(29) char local29 = arg0.charAt(local23);
			if (local21 == 0) {
				local29 = Character.toLowerCase(local29);
			} else if (local21 == 2 || Character.isUpperCase(local29)) {
				local29 = Static379.method1126(local29);
			}
			if (Character.isLetter(local29)) {
				local21 = 0;
			} else if (local29 == '.' || local29 == '?' || local29 == '!') {
				local21 = 2;
			} else if (!Character.isSpaceChar(local29)) {
				local21 = 1;
			} else if (local21 != 2) {
				local21 = 1;
			}
			local19[local23] = local29;
		}
		return new String(local19);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
	public static void method2591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class2_Sub42 local6 = (Class2_Sub42) Static181.aClass210_23.method5035(); local6 != null; local6 = (Class2_Sub42) Static181.aClass210_23.method5037()) {
			Static249.method3985(arg2, arg3, arg1, local6, arg0);
		}
		for (@Pc(38) Class2_Sub42 local38 = (Class2_Sub42) Static39.aClass210_7.method5035(); local38 != null; local38 = (Class2_Sub42) Static39.aClass210_7.method5037()) {
			@Pc(42) byte local42 = 1;
			@Pc(47) Class170 local47 = local38.aClass12_Sub1_Sub2_Sub1_1.method4711();
			if (local38.aClass12_Sub1_Sub2_Sub1_1.aBoolean422) {
				local42 = 0;
			} else if (local47.anInt4562 == local38.aClass12_Sub1_Sub2_Sub1_1.anInt5339 || local47.anInt4530 == local38.aClass12_Sub1_Sub2_Sub1_1.anInt5339 || local47.anInt4566 == local38.aClass12_Sub1_Sub2_Sub1_1.anInt5339 || local47.anInt4535 == local38.aClass12_Sub1_Sub2_Sub1_1.anInt5339) {
				local42 = 2;
			} else if (local38.aClass12_Sub1_Sub2_Sub1_1.anInt5339 == local47.anInt4564 || local47.anInt4569 == local38.aClass12_Sub1_Sub2_Sub1_1.anInt5339 || local47.anInt4546 == local38.aClass12_Sub1_Sub2_Sub1_1.anInt5339 || local47.anInt4533 == local38.aClass12_Sub1_Sub2_Sub1_1.anInt5339) {
				local42 = 3;
			}
			if (local42 != local38.anInt6547) {
				@Pc(146) int local146 = Static234.method3820(local38.aClass12_Sub1_Sub2_Sub1_1);
				if (local146 != local38.anInt6543) {
					if (local38.aClass2_Sub2_Sub2_2 != null) {
						Static339.aClass2_Sub2_Sub1_2.method110(local38.aClass2_Sub2_Sub2_2);
						local38.aClass2_Sub2_Sub2_2 = null;
					}
					local38.anInt6543 = local146;
				}
				local38.anInt6547 = local42;
			}
			local38.anInt6542 = local38.aClass12_Sub1_Sub2_Sub1_1.anInt6328;
			local38.anInt6541 = local38.aClass12_Sub1_Sub2_Sub1_1.anInt6328 + local38.aClass12_Sub1_Sub2_Sub1_1.method4706() * 64;
			local38.anInt6536 = local38.aClass12_Sub1_Sub2_Sub1_1.anInt6317;
			local38.anInt6545 = local38.aClass12_Sub1_Sub2_Sub1_1.anInt6317 + local38.aClass12_Sub1_Sub2_Sub1_1.method4706() * 64;
			Static249.method3985(arg2, arg3, arg1, local38, arg0);
		}
		for (@Pc(225) Class2_Sub42 local225 = (Class2_Sub42) Static208.aClass214_22.method5060(); local225 != null; local225 = (Class2_Sub42) Static208.aClass214_22.method5064()) {
			@Pc(229) byte local229 = 1;
			@Pc(234) Class170 local234 = local225.aClass12_Sub1_Sub2_Sub2_2.method4711();
			if (local225.aClass12_Sub1_Sub2_Sub2_2.aBoolean422) {
				local229 = 0;
			} else if (local225.aClass12_Sub1_Sub2_Sub2_2.anInt5339 == local234.anInt4562 || local234.anInt4530 == local225.aClass12_Sub1_Sub2_Sub2_2.anInt5339 || local234.anInt4566 == local225.aClass12_Sub1_Sub2_Sub2_2.anInt5339 || local225.aClass12_Sub1_Sub2_Sub2_2.anInt5339 == local234.anInt4535) {
				local229 = 2;
			} else if (local225.aClass12_Sub1_Sub2_Sub2_2.anInt5339 == local234.anInt4564 || local234.anInt4569 == local225.aClass12_Sub1_Sub2_Sub2_2.anInt5339 || local225.aClass12_Sub1_Sub2_Sub2_2.anInt5339 == local234.anInt4546 || local234.anInt4533 == local225.aClass12_Sub1_Sub2_Sub2_2.anInt5339) {
				local229 = 3;
			}
			if (local229 != local225.anInt6547) {
				@Pc(337) int local337 = Static165.method2708(local225.aClass12_Sub1_Sub2_Sub2_2);
				if (local225.anInt6543 != local337) {
					if (local225.aClass2_Sub2_Sub2_2 != null) {
						Static339.aClass2_Sub2_Sub1_2.method110(local225.aClass2_Sub2_Sub2_2);
						local225.aClass2_Sub2_Sub2_2 = null;
					}
					local225.anInt6543 = local337;
				}
				local225.anInt6547 = local229;
			}
			local225.anInt6542 = local225.aClass12_Sub1_Sub2_Sub2_2.anInt6328;
			local225.anInt6541 = local225.aClass12_Sub1_Sub2_Sub2_2.anInt6328 + local225.aClass12_Sub1_Sub2_Sub2_2.method4706() * 64;
			local225.anInt6536 = local225.aClass12_Sub1_Sub2_Sub2_2.anInt6317;
			local225.anInt6545 = local225.aClass12_Sub1_Sub2_Sub2_2.anInt6317 + local225.aClass12_Sub1_Sub2_Sub2_2.method4706() * 64;
			Static249.method3985(arg2, arg3, arg1, local225, arg0);
		}
	}
}
