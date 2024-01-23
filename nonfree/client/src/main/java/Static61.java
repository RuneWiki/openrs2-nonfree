import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
	public static int anInt1560;

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString49 = "Loading world list data";

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BIIIIII)V")
	public static void method1190(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static13.method293(arg0);
		@Pc(10) int local10 = 0;
		@Pc(20) int local20 = arg0 - arg1;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(26) int local26 = arg0;
		@Pc(29) int local29 = -arg0;
		@Pc(31) int local31 = local20;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(38) int local38 = -local20;
		@Pc(65) int local65;
		@Pc(76) int local76;
		@Pc(84) int local84;
		@Pc(92) int local92;
		if (arg4 >= Static152.anInt3532 && arg4 <= Static223.anInt1245) {
			@Pc(56) int[] local56 = Static57.anIntArrayArray9[arg4];
			local65 = Static223.method941(arg5 - arg0, Static88.anInt2052, Static102.anInt2239);
			local76 = Static223.method941(arg5 + arg0, Static88.anInt2052, Static102.anInt2239);
			local84 = Static223.method941(arg5 - local20, Static88.anInt2052, Static102.anInt2239);
			local92 = Static223.method941(local20 + arg5, Static88.anInt2052, Static102.anInt2239);
			Static89.method1538(local56, local84, local65, arg2);
			Static89.method1538(local56, local92, local84, arg3);
			Static89.method1538(local56, local76, local92, arg2);
		}
		while (local10 < local26) {
			local33 += 2;
			local35 += 2;
			local38 += local35;
			if (local38 >= 0 && local31 >= 1) {
				local31--;
				Static275.anIntArray590[local31] = local10;
				local38 -= local31 << 1;
			}
			local29 += local33;
			local10++;
			@Pc(268) int local268;
			@Pc(277) int local277;
			@Pc(289) int[] local289;
			@Pc(169) int local169;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				local169 = arg4 - local26;
				local65 = local26 + arg4;
				if (local65 >= Static152.anInt3532 && local169 <= Static223.anInt1245) {
					if (local20 <= local26) {
						local76 = Static223.method941(local10 + arg5, Static88.anInt2052, Static102.anInt2239);
						local84 = Static223.method941(arg5 - local10, Static88.anInt2052, Static102.anInt2239);
						if (local65 <= Static223.anInt1245) {
							Static89.method1538(Static57.anIntArrayArray9[local65], local76, local84, arg2);
						}
						if (local169 >= Static152.anInt3532) {
							Static89.method1538(Static57.anIntArrayArray9[local169], local76, local84, arg2);
						}
					} else {
						local76 = Static275.anIntArray590[local26];
						local84 = Static223.method941(local10 + arg5, Static88.anInt2052, Static102.anInt2239);
						local92 = Static223.method941(arg5 - local10, Static88.anInt2052, Static102.anInt2239);
						local268 = Static223.method941(arg5 + local76, Static88.anInt2052, Static102.anInt2239);
						local277 = Static223.method941(arg5 - local76, Static88.anInt2052, Static102.anInt2239);
						if (Static223.anInt1245 >= local65) {
							local289 = Static57.anIntArrayArray9[local65];
							Static89.method1538(local289, local277, local92, arg2);
							Static89.method1538(local289, local268, local277, arg3);
							Static89.method1538(local289, local84, local268, arg2);
						}
						if (Static152.anInt3532 <= local169) {
							local289 = Static57.anIntArrayArray9[local169];
							Static89.method1538(local289, local277, local92, arg2);
							Static89.method1538(local289, local268, local277, arg3);
							Static89.method1538(local289, local84, local268, arg2);
						}
					}
				}
			}
			local169 = arg4 - local10;
			local65 = arg4 + local10;
			if (Static152.anInt3532 <= local65 && Static223.anInt1245 >= local169) {
				local76 = arg5 + local26;
				local84 = arg5 - local26;
				if (local76 >= Static102.anInt2239 && Static88.anInt2052 >= local84) {
					local76 = Static223.method941(local76, Static88.anInt2052, Static102.anInt2239);
					local84 = Static223.method941(local84, Static88.anInt2052, Static102.anInt2239);
					if (local10 >= local20) {
						if (Static223.anInt1245 >= local65) {
							Static89.method1538(Static57.anIntArrayArray9[local65], local76, local84, arg2);
						}
						if (Static152.anInt3532 <= local169) {
							Static89.method1538(Static57.anIntArrayArray9[local169], local76, local84, arg2);
						}
					} else {
						local92 = local31 >= local10 ? local31 : Static275.anIntArray590[local10];
						local268 = Static223.method941(local92 + arg5, Static88.anInt2052, Static102.anInt2239);
						local277 = Static223.method941(arg5 - local92, Static88.anInt2052, Static102.anInt2239);
						if (local65 <= Static223.anInt1245) {
							local289 = Static57.anIntArrayArray9[local65];
							Static89.method1538(local289, local277, local84, arg2);
							Static89.method1538(local289, local268, local277, arg3);
							Static89.method1538(local289, local76, local268, arg2);
						}
						if (Static152.anInt3532 <= local169) {
							local289 = Static57.anIntArrayArray9[local169];
							Static89.method1538(local289, local277, local84, arg2);
							Static89.method1538(local289, local268, local277, arg3);
							Static89.method1538(local289, local76, local268, arg2);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
	public static void method1191() {
		Static129.aClass155_23.method4362();
	}
}
