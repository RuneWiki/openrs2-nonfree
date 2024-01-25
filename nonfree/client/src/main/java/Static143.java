import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "Lclient!fc;")
	public static Class71 aClass71_32;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
	public static final int anInt2604 = 1403;

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "[B")
	public static final byte[] aByteArray44 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
	public static int anInt2605 = 0;

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "[I")
	public static final int[] anIntArray296 = new int[6];

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZLclient!km;J)V")
	public static void method2454(@OriginalArg(1) Class82 arg0, @OriginalArg(2) long arg1) {
		Static110.anInt2200 = Class12_Sub1_Sub4.lb;
		Static287.anInt5119 = 0;
		Class12_Sub1_Sub4.lb = 0;
		@Pc(14) long local14 = Static51.method979();
		for (@Pc(23) Class22_Sub6 local23 = (Class22_Sub6) Static35.aClass56_1.method1259(); local23 != null; local23 = (Class22_Sub6) Static35.aClass56_1.method1254()) {
			if (local23.method3563(arg0, arg1)) {
				Static287.anInt5119++;
			}
		}
		if (Static305.aBoolean166 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static35.aClass56_1.method1252() + ", running: " + Static287.anInt5119 + ". Particles: " + Class12_Sub1_Sub4.lb + ". Time taken: " + (Static51.method979() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z")
	public static boolean method2455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class34 local8 = Static11.aClass123_5.method2703(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local8.method815(arg1);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIII)V")
	public static void method2457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class155 local8 = Static257.method5607(arg2, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray7 != null) {
			@Pc(18) Class2_Sub24 local18 = new Class2_Sub24();
			local18.anObjectArray5 = local8.anObjectArray7;
			local18.aClass155_23 = local8;
			Static157.method2604(local18);
		}
		Static332.anInt5811 = arg4;
		Static26.anInt622 = arg3;
		Static106.anInt2069 = arg2;
		Static54.anInt1110 = arg0;
		Static50.anInt1031 = arg1;
		Static68.aBoolean110 = true;
		Static206.anInt3826 = local8.anInt4212;
		Static363.anInt5936 = arg5;
		Static295.method4664(local8);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!dq;)[Lclient!rd;")
	public static Class196[] method2458(@OriginalArg(1) Class53 arg0) {
		if (!arg0.method1176()) {
			return new Class196[0];
		}
		@Pc(18) Class1 local18 = arg0.method1192();
		while (local18.anInt2 == 0) {
			Static185.method3004(10L);
		}
		if (local18.anInt2 == 2) {
			return new Class196[0];
		}
		@Pc(39) int[] local39 = (int[]) local18.anObject1;
		@Pc(45) Class196[] local45 = new Class196[local39.length >> 2];
		for (@Pc(52) int local52 = 0; local52 < local45.length; local52++) {
			@Pc(58) Class196 local58 = new Class196();
			local45[local52] = local58;
			local58.anInt5452 = local39[local52 << 2];
			local58.anInt5445 = local39[(local52 << 2) + 1];
			local58.anInt5450 = local39[(local52 << 2) + 2];
			local58.anInt5448 = local39[(local52 << 2) + 3];
		}
		return local45;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZIZ)I")
	public static int method2459(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub16 local14 = Static108.method2083(false, arg0);
		if (local14 == null) {
			return Static161.aClass185_1.method4412(arg0).anInt3240;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(33) int local33 = 0; local33 < local14.anIntArray273.length; local33++) {
			if (local14.anIntArray273[local33] == -1) {
				local24++;
			}
		}
		return local24 + Static161.aClass185_1.method4412(arg0).anInt3240 - local14.anIntArray273.length;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V")
	public static void method2460(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static18.anIntArray85[local7] = Static18.anIntArray85[local7 - 1];
			Static10.anIntArray41[local7] = Static10.anIntArray41[local7 - 1];
			Static281.aStringArray32[local7] = Static281.aStringArray32[local7 - 1];
			Static222.aStringArray25[local7] = Static222.aStringArray25[local7 - 1];
			Static13.aStringArray2[local7] = Static13.aStringArray2[local7 - 1];
			Static321.aStringArray35[local7] = Static321.aStringArray35[local7 - 1];
			Static271.anIntArray597[local7] = Static271.anIntArray597[local7 - 1];
		}
		Static18.anIntArray85[0] = arg3;
		Static10.anIntArray41[0] = arg5;
		Static281.aStringArray32[0] = arg1;
		Static222.aStringArray25[0] = arg6;
		Static13.aStringArray2[0] = arg2;
		Static23.anInt563 = Static180.anInt3216;
		Static271.anIntArray597[0] = arg0;
		Static321.aStringArray35[0] = arg4;
		Static148.anInt2696++;
	}
}
