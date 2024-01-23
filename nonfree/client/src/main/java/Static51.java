import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	public static int anInt1229;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Lclient!mi;")
	public static Class72 aClass72_3;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "Lclient!mb;")
	public static Class70 aClass70_15;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "[I")
	public static int[] anIntArray72;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Lclient!ia;")
	public static Class51 aClass51_374 = null;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "Lclient!ia;")
	public static Class51 aClass51_375 = Static64.method1101(":chalreq:");

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Z")
	public static boolean aBoolean60 = true;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "Lclient!ia;")
	private static Class51 aClass51_376 = Static64.method1101("Loading fonts )2 ");

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "Lclient!ia;")
	public static Class51 aClass51_377 = Static64.method1101("<img=1>");

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "Lclient!sf;")
	public static Class105 aClass105_6 = new Class105();

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "Lclient!ia;")
	public static Class51 aClass51_378 = aClass51_376;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBIIII)V")
	public static void method924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = 0;
		Static189.method3168(arg1);
		@Pc(20) int local20 = arg1 - arg3;
		@Pc(22) int local22 = arg1;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(32) int local32 = -arg1;
		@Pc(35) int local35 = -local20;
		@Pc(37) int local37 = local20;
		@Pc(39) int local39 = -1;
		@Pc(57) int local57;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (Static225.anInt4729 <= arg4 && Static122.anInt2710 >= arg4) {
			@Pc(49) int[] local49 = Static113.anIntArrayArray10[arg4];
			local57 = Static28.method525(Static149.anInt3252, arg5 - arg1, Static160.anInt3454);
			local67 = Static28.method525(Static149.anInt3252, arg1 + arg5, Static160.anInt3454);
			local76 = Static28.method525(Static149.anInt3252, arg5 - local20, Static160.anInt3454);
			local84 = Static28.method525(Static149.anInt3252, local20 + arg5, Static160.anInt3454);
			Static71.method1261(local49, local57, arg0, local76);
			Static71.method1261(local49, local76, arg2, local84);
			Static71.method1261(local49, local84, arg0, local67);
		}
		@Pc(104) int local104 = -1;
		while (local22 > local3) {
			local104 += 2;
			local32 += local104;
			local39 += 2;
			local35 += local39;
			if (local35 >= 0 && local37 >= 1) {
				local37--;
				Static220.anIntArray361[local37] = local3;
				local35 -= local37 << 1;
			}
			local3++;
			@Pc(248) int local248;
			@Pc(258) int local258;
			@Pc(269) int[] local269;
			@Pc(146) int local146;
			if (local32 >= 0) {
				local22--;
				local146 = arg4 - local22;
				local32 -= local22 << 1;
				local57 = arg4 + local22;
				if (local57 >= Static225.anInt4729 && Static122.anInt2710 >= local146) {
					if (local20 <= local22) {
						local67 = Static28.method525(Static149.anInt3252, arg5 + local3, Static160.anInt3454);
						local76 = Static28.method525(Static149.anInt3252, arg5 - local3, Static160.anInt3454);
						if (Static122.anInt2710 >= local57) {
							Static71.method1261(Static113.anIntArrayArray10[local57], local76, arg0, local67);
						}
						if (Static225.anInt4729 <= local146) {
							Static71.method1261(Static113.anIntArrayArray10[local146], local76, arg0, local67);
						}
					} else {
						local67 = Static220.anIntArray361[local22];
						local76 = Static28.method525(Static149.anInt3252, local3 + arg5, Static160.anInt3454);
						local84 = Static28.method525(Static149.anInt3252, arg5 - local3, Static160.anInt3454);
						local248 = Static28.method525(Static149.anInt3252, local67 + arg5, Static160.anInt3454);
						local258 = Static28.method525(Static149.anInt3252, arg5 - local67, Static160.anInt3454);
						if (Static122.anInt2710 >= local57) {
							local269 = Static113.anIntArrayArray10[local57];
							Static71.method1261(local269, local84, arg0, local258);
							Static71.method1261(local269, local258, arg2, local248);
							Static71.method1261(local269, local248, arg0, local76);
						}
						if (local146 >= Static225.anInt4729) {
							local269 = Static113.anIntArrayArray10[local146];
							Static71.method1261(local269, local84, arg0, local258);
							Static71.method1261(local269, local258, arg2, local248);
							Static71.method1261(local269, local248, arg0, local76);
						}
					}
				}
			}
			local57 = local3 + arg4;
			local146 = arg4 - local3;
			if (local57 >= Static225.anInt4729 && local146 <= Static122.anInt2710) {
				local67 = arg5 + local22;
				local76 = arg5 - local22;
				if (local67 >= Static160.anInt3454 && local76 <= Static149.anInt3252) {
					local67 = Static28.method525(Static149.anInt3252, local67, Static160.anInt3454);
					local76 = Static28.method525(Static149.anInt3252, local76, Static160.anInt3454);
					if (local3 >= local20) {
						if (Static122.anInt2710 >= local57) {
							Static71.method1261(Static113.anIntArrayArray10[local57], local76, arg0, local67);
						}
						if (local146 >= Static225.anInt4729) {
							Static71.method1261(Static113.anIntArrayArray10[local146], local76, arg0, local67);
						}
					} else {
						local84 = local3 <= local37 ? local37 : Static220.anIntArray361[local3];
						local248 = Static28.method525(Static149.anInt3252, arg5 + local84, Static160.anInt3454);
						local258 = Static28.method525(Static149.anInt3252, arg5 - local84, Static160.anInt3454);
						if (local57 <= Static122.anInt2710) {
							local269 = Static113.anIntArrayArray10[local57];
							Static71.method1261(local269, local76, arg0, local258);
							Static71.method1261(local269, local258, arg2, local248);
							Static71.method1261(local269, local248, arg0, local67);
						}
						if (Static225.anInt4729 <= local146) {
							local269 = Static113.anIntArrayArray10[local146];
							Static71.method1261(local269, local76, arg0, local258);
							Static71.method1261(local269, local258, arg2, local248);
							Static71.method1261(local269, local248, arg0, local67);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(JB)V")
	public static void method926(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < Static201.anInt4259; local16++) {
			if (arg0 == Static20.aLongArray3[local16]) {
				Static201.anInt4259--;
				for (@Pc(34) int local34 = local16; local34 < Static201.anInt4259; local34++) {
					Static113.aClass51Array15[local34] = Static113.aClass51Array15[local34 + 1];
					Static144.anIntArray215[local34] = Static144.anIntArray215[local34 + 1];
					Static33.aClass51Array6[local34] = Static33.aClass51Array6[local34 + 1];
					Static20.aLongArray3[local34] = Static20.aLongArray3[local34 + 1];
					Static191.anIntArray312[local34] = Static191.anIntArray312[local34 + 1];
					Static78.aBooleanArray12[local34] = Static78.aBooleanArray12[local34 + 1];
				}
				Static99.anInt2154 = Static27.anInt651;
				Static167.aClass1_Sub16_Sub1_2.method3823(61);
				Static167.aClass1_Sub16_Sub1_2.method3786(arg0);
				return;
			}
		}
	}
}
