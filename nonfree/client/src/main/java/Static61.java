import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
	public static int anInt1282;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Ljava/lang/String;")
	public static final String aString45 = "cyan:";

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([[I[[B[[BILclient!da;[[BZIZILclient!tj;Lclient!da;[[B)V")
	public static void method1004(@OriginalArg(0) int[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22 arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class122 arg9, @OriginalArg(11) Class22 arg10, @OriginalArg(12) byte[][] arg11) {
		if (Static352.anInt6827 == 0 && !Static250.aBoolean274) {
			Static243.method4154(arg11, arg0, arg8, arg2, arg10, arg7, arg4, arg5, arg1, arg6, arg9, arg3);
		} else {
			Static347.method5651(arg2, arg10, arg7, arg8, arg6, arg9, arg3, arg1, arg0, arg11, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIII)V")
	public static void method1007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static71.method4523(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg1;
		@Pc(27) int local27 = -arg1;
		@Pc(29) int local29 = local15;
		@Pc(37) int local37 = -local15;
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = -1;
		@Pc(68) int local68;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (Static236.anInt4721 <= arg5 && Static73.anInt1425 >= arg5) {
			@Pc(59) int[] local59 = Static196.anIntArrayArray37[arg5];
			local68 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 - arg1);
			local76 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 + arg1);
			local85 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 - local15);
			local94 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 + local15);
			Static162.method1731(local85, local59, local68, arg2);
			Static162.method1731(local94, local59, local85, arg0);
			Static162.method1731(local76, local59, local94, arg2);
		}
		while (local24 > local10) {
			local39 += 2;
			local41 += 2;
			local27 += local39;
			local37 += local41;
			if (local37 >= 0 && local29 >= 1) {
				local29--;
				Static216.anIntArray359[local29] = local10;
				local37 -= local29 << 1;
			}
			local10++;
			@Pc(250) int local250;
			@Pc(259) int local259;
			@Pc(270) int[] local270;
			@Pc(162) int local162;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local162 = arg5 - local24;
				local68 = local24 + arg5;
				if (local68 >= Static236.anInt4721 && Static73.anInt1425 >= local162) {
					if (local24 >= local15) {
						local76 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 + local10);
						local85 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 - local10);
						if (Static73.anInt1425 >= local68) {
							Static162.method1731(local76, Static196.anIntArrayArray37[local68], local85, arg2);
						}
						if (Static236.anInt4721 <= local162) {
							Static162.method1731(local76, Static196.anIntArrayArray37[local162], local85, arg2);
						}
					} else {
						local76 = Static216.anIntArray359[local24];
						local85 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 + local10);
						local94 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 - local10);
						local250 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 + local76);
						local259 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 - local76);
						if (Static73.anInt1425 >= local68) {
							local270 = Static196.anIntArrayArray37[local68];
							Static162.method1731(local259, local270, local94, arg2);
							Static162.method1731(local250, local270, local259, arg0);
							Static162.method1731(local85, local270, local250, arg2);
						}
						if (local162 >= Static236.anInt4721) {
							local270 = Static196.anIntArrayArray37[local162];
							Static162.method1731(local259, local270, local94, arg2);
							Static162.method1731(local250, local270, local259, arg0);
							Static162.method1731(local85, local270, local250, arg2);
						}
					}
				}
			}
			local162 = arg5 - local10;
			local68 = arg5 + local10;
			if (Static236.anInt4721 <= local68 && local162 <= Static73.anInt1425) {
				local76 = local24 + arg4;
				local85 = arg4 - local24;
				if (local76 >= Static19.anInt533 && Static4.anInt75 >= local85) {
					local76 = Static312.method5334(Static19.anInt533, Static4.anInt75, local76);
					local85 = Static312.method5334(Static19.anInt533, Static4.anInt75, local85);
					if (local15 <= local10) {
						if (Static73.anInt1425 >= local68) {
							Static162.method1731(local76, Static196.anIntArrayArray37[local68], local85, arg2);
						}
						if (local162 >= Static236.anInt4721) {
							Static162.method1731(local76, Static196.anIntArrayArray37[local162], local85, arg2);
						}
					} else {
						local94 = local10 <= local29 ? local29 : Static216.anIntArray359[local10];
						local250 = Static312.method5334(Static19.anInt533, Static4.anInt75, local94 + arg4);
						local259 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg4 - local94);
						if (Static73.anInt1425 >= local68) {
							local270 = Static196.anIntArrayArray37[local68];
							Static162.method1731(local259, local270, local85, arg2);
							Static162.method1731(local250, local270, local259, arg0);
							Static162.method1731(local76, local270, local250, arg2);
						}
						if (local162 >= Static236.anInt4721) {
							local270 = Static196.anIntArrayArray37[local162];
							Static162.method1731(local259, local270, local85, arg2);
							Static162.method1731(local250, local270, local259, arg0);
							Static162.method1731(local76, local270, local250, arg2);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
	public static void method1008() {
		Static33.method633(Static212.aClass122_2, (long) Static51.anInt1101);
		if (Static191.anInt3991 != -1) {
			Static350.method5694(Static191.anInt3991);
		}
		for (@Pc(24) int local24 = 0; local24 < Static312.anInt6281; local24++) {
			if (Static159.aBooleanArray13[local24]) {
				Static28.aBooleanArray1[local24] = true;
			}
			Static330.aBooleanArray30[local24] = Static159.aBooleanArray13[local24];
			Static159.aBooleanArray13[local24] = false;
		}
		Static279.anInt5571 = Static51.anInt1101;
		if (Static212.aClass122_2.method4747()) {
			Static284.aBoolean377 = true;
		}
		Static198.aClass181_34 = null;
		if (Static191.anInt3991 != -1) {
			Static312.anInt6281 = 0;
			Static330.method5420();
		}
		Static212.aClass122_2.method4734();
		Static341.method5590(Static218.anInt4471);
		Static347.anInt6759 = 0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method1009(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(27) int local27 = (arg0 ? Static215.anInt4409 : Static42.anInt891) + local19;
		for (@Pc(29) int local29 = local19; local29 < local27; local29++) {
			@Pc(35) Class3_Sub7_Sub9 local35 = Static7.method151(local29);
			if (local35.aBoolean156 && local35.method2260().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static154.anInt6364 = -1;
					Static128.aShortArray69 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(71) short[] local71 = new short[local11.length * 2];
					for (@Pc(73) int local73 = 0; local73 < local13; local73++) {
						local71[local73] = local11[local73];
					}
					local11 = local71;
				}
				local11[local13++] = (short) local29;
			}
		}
		Static154.anInt6364 = local13;
		Static76.anInt1471 = 0;
		Static128.aShortArray69 = local11;
		@Pc(106) String[] local106 = new String[Static154.anInt6364];
		for (@Pc(108) int local108 = 0; local108 < Static154.anInt6364; local108++) {
			local106[local108] = Static7.method151(local11[local108]).method2260();
		}
		Static314.method5245(local106, Static128.aShortArray69);
	}
}
