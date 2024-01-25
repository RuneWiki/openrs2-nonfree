import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	public static int anInt2953 = 0;

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString36 = null;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ya;IIIIII)Lclient!t;")
	public static Class91 method2374(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) long local6 = (long) arg5;
		@Pc(12) Class91 local12 = (Class91) Static342.aClass171_47.method3941(local6);
		if (local12 == null) {
			@Pc(24) Class146 local24 = Static152.method2537(Static307.aClass160_60, arg5);
			if (local24 == null) {
				return null;
			}
			if (local24.anInt4095 < 13) {
				local24.method3325();
			}
			local12 = arg0.method4414(local24, 2055, Static358.anInt6073, 64, 768);
			Static342.aClass171_47.method3940(local6, local12);
		}
		local12 = local12.method3285((byte) 2, 2055, true);
		if (arg3 != 0) {
			local12.Q(arg3);
		}
		if (arg1 != 0) {
			local12.Z(arg1);
		}
		if (arg4 != 0) {
			local12.R(arg4);
		}
		if (arg2 != 0) {
			local12.JA(0, arg2, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method2375(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static138.aClass160_20.anInt4623 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static318.aClass144_6.anInt3987; local18++) {
			@Pc(25) Class45 local25 = Static318.aClass144_6.method3265(local18);
			if ((!arg1 || local25.aBoolean62) && local25.anInt1124 == -1 && local25.anInt1132 == -1 && local25.anInt1130 == 0 && local25.aString6.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static259.anInt4836 = -1;
					Static101.aShortArray24 = null;
					return;
				}
				if (local14.length <= local16) {
					@Pc(75) short[] local75 = new short[local14.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local16; local77++) {
						local75[local77] = local14[local77];
					}
					local14 = local75;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static101.aShortArray24 = local14;
		Static259.anInt4836 = local16;
		Static414.anInt6897 = 0;
		@Pc(115) String[] local115 = new String[Static259.anInt4836];
		for (@Pc(117) int local117 = 0; local117 < Static259.anInt4836; local117++) {
			local115[local117] = Static318.aClass144_6.method3265(local14[local117]).aString6;
		}
		Static390.method5185(local115, Static101.aShortArray24);
		Static138.aClass160_20.method3717();
		Static138.aClass160_20.anInt4623 = 2;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(III)Lclient!ei;")
	public static Class3_Sub1 method2376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass3_Sub1_2 == null ? null : local7.aClass3_Sub1_2;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IJLclient!ya;)V")
	public static void method2377(@OriginalArg(1) long arg0, @OriginalArg(2) Class49 arg1) {
		Static240.anInt4616 = 0;
		Static448.anInt7289 = Static145.anInt3058;
		Static145.anInt3058 = 0;
		@Pc(14) long local14 = Static21.method458();
		for (@Pc(23) Class8_Sub3 local23 = (Class8_Sub3) Static28.aClass112_3.method2553(); local23 != null; local23 = (Class8_Sub3) Static28.aClass112_3.method2550()) {
			if (local23.method557(arg1, arg0)) {
				Static240.anInt4616++;
			}
		}
		if (Static203.aBoolean332 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static28.aClass112_3.method2551() + ", running: " + Static240.anInt4616 + ". Particles: " + Static145.anInt3058 + ". Time taken: " + (Static21.method458() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZIB)I")
	public static int method2378(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub38 local8 = Static448.method5748(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray512.length) {
			return local8.anIntArray512[arg0];
		} else {
			return -1;
		}
	}
}
