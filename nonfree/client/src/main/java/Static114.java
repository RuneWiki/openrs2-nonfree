import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ig", name = "fb", descriptor = "Lclient!kb;")
	public static Class83 aClass83_75;

	@OriginalMember(owner = "client!ig", name = "jb", descriptor = "I")
	public static int anInt2499;

	@OriginalMember(owner = "client!ig", name = "Y", descriptor = "Lclient!pm;")
	public static Class125 aClass125_3 = new Class125(64);

	@OriginalMember(owner = "client!ig", name = "db", descriptor = "Lclient!tl;")
	public static Class155 aClass155_21 = new Class155(20);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method1862(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(10) int local10 = 0;
		@Pc(13) short[] local13 = new short[16];
		for (@Pc(15) int local15 = 0; local15 < Static78.anInt1887; local15++) {
			@Pc(26) Class138 local26 = Static238.method4099(local15);
			if ((!arg0 || local26.aBoolean274) && local26.anInt5028 == -1 && local26.anInt5064 == -1 && local26.anInt5073 == 0 && local26.aString159.toLowerCase().indexOf(local8) != -1) {
				if (local10 >= 250) {
					Static39.aShortArray27 = null;
					Static20.anInt5566 = -1;
					return;
				}
				if (local10 >= local13.length) {
					@Pc(75) short[] local75 = new short[local13.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local10; local77++) {
						local75[local77] = local13[local77];
					}
					local13 = local75;
				}
				local13[local10++] = (short) local15;
			}
		}
		Static87.anInt2030 = 0;
		Static20.anInt5566 = local10;
		@Pc(107) String[] local107 = new String[Static20.anInt5566];
		Static39.aShortArray27 = local13;
		for (@Pc(111) int local111 = 0; local111 < Static20.anInt5566; local111++) {
			local107[local111] = Static238.method4099(local13[local111]).aString159;
		}
		Static232.method4051(local107, Static39.aShortArray27);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)Lclient!tj;")
	public static Class1_Sub2_Sub19 method1863(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub19 local10 = (Class1_Sub2_Sub19) Static236.aClass125_5.method3669((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static8.aClass83_134.method2306(11, arg0);
		local10 = new Class1_Sub2_Sub19();
		if (local21 != null) {
			local10.method4333(new Class1_Sub16(local21));
		}
		Static236.aClass125_5.method3671(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(B)V")
	public static void method1864() {
		try {
			if (Static115.anInt2536 == 1) {
				@Pc(20) int local20 = Static141.aClass1_Sub3_Sub2_2.method976();
				if (local20 > 0 && Static141.aClass1_Sub3_Sub2_2.method997()) {
					local20 -= Static50.anInt1382;
					if (local20 < 0) {
						local20 = 0;
					}
					Static141.aClass1_Sub3_Sub2_2.method985(local20);
					return;
				}
				Static141.aClass1_Sub3_Sub2_2.method987();
				Static141.aClass1_Sub3_Sub2_2.method1007();
				Static8.aClass39_2 = null;
				Static251.aClass1_Sub31_2 = null;
				if (Static293.aClass83_203 == null) {
					Static115.anInt2536 = 0;
				} else {
					Static115.anInt2536 = 2;
				}
			}
		} catch (@Pc(67) Exception local67) {
			local67.printStackTrace();
			Static141.aClass1_Sub3_Sub2_2.method987();
			Static251.aClass1_Sub31_2 = null;
			Static8.aClass39_2 = null;
			Static293.aClass83_203 = null;
			Static115.anInt2536 = 0;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method1866(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 = (long) arg0.charAt(local12) + (local7 << 5) - local7;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)V")
	public static void method1867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class88 local7 = Static249.method4265(arg1);
		@Pc(10) int local10 = local7.anInt3285;
		@Pc(13) int local13 = local7.anInt3279;
		@Pc(16) int local16 = local7.anInt3277;
		@Pc(22) int local22 = Class1_Sub1_Sub29.anIntArray464[local10 - local16];
		if (arg0 < 0 || arg0 > local22) {
			arg0 = 0;
		}
		local22 <<= local16;
		Static241.method4156(local13, Static170.anIntArray601[local13] & ~local22 | local22 & arg0 << local16);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBIIIII)V")
	public static void method1868(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) Class116 local12 = Static127.method2179(arg0, arg3);
		if (local12 != null && local12.anObjectArray23 != null) {
			@Pc(23) Class1_Sub27 local23 = new Class1_Sub27();
			local23.aClass116_13 = local12;
			local23.anObjectArray32 = local12.anObjectArray23;
			Static22.method392(local23);
		}
		Static266.anInt5785 = arg5;
		Static148.anInt3504 = arg3;
		Static27.anInt755 = arg4;
		Static16.aBoolean22 = true;
		Static19.anInt461 = arg0;
		Static177.anInt3986 = arg2;
		Static78.anInt1880 = arg1;
		Static189.method3378(local12);
	}
}
