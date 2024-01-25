import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
	public static int anInt1075 = 0;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)V")
	public static void method1109() {
		for (@Pc(3) int local3 = 0; local3 < Static278.anInt4554; local3++) {
			Static311.aClass4Array4[local3] = null;
		}
		Static278.anInt4554 = 0;
		@Pc(25) int local25;
		@Pc(29) int local29;
		for (@Pc(21) int local21 = 0; local21 < Static36.anInt662; local21++) {
			for (local25 = 0; local25 < Static129.anInt6336; local25++) {
				for (local29 = 0; local29 < Static150.anInt2400; local29++) {
					@Pc(39) Class156 local39 = Static535.aClass156ArrayArrayArray2[local21][local29][local25];
					if (local39 != null) {
						if (local39.aShort60 > 0) {
							local39.aShort60 = (short) (local39.aShort60 * -1);
						}
						if (local39.aShort61 > 0) {
							local39.aShort61 = (short) (local39.aShort61 * -1);
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < Static36.anInt662; local25++) {
			for (local29 = 0; local29 < Static129.anInt6336; local29++) {
				for (@Pc(94) int local94 = 0; local94 < Static150.anInt2400; local94++) {
					@Pc(104) Class156 local104 = Static535.aClass156ArrayArrayArray2[local25][local94][local29];
					if (local104 != null) {
						@Pc(127) boolean local127 = Static535.aClass156ArrayArrayArray2[0][local94][local29] != null && Static535.aClass156ArrayArrayArray2[0][local94][local29].aClass156_1 != null;
						@Pc(135) int local135;
						@Pc(137) int local137;
						@Pc(151) Class156 local151;
						@Pc(159) int local159;
						@Pc(318) int local318;
						@Pc(332) int local332;
						@Pc(339) int local339;
						@Pc(355) int local355;
						@Pc(362) int local362;
						@Pc(366) int local366;
						@Pc(370) int local370;
						@Pc(376) int local376;
						@Pc(414) int local414;
						@Pc(418) int local418;
						if (local104.aShort60 < 0) {
							local135 = local29;
							local137 = local29;
							local151 = Static535.aClass156ArrayArrayArray2[local25][local94][local29 - 1];
							local159 = Static492.aClass40Array3[local25].method8442(local94, local29);
							while (local135 > 0 && local151 != null && local151.aShort60 < 0 && local151.aShort60 == local104.aShort60 && local151.aShort63 == local104.aShort63 && local159 == Static492.aClass40Array3[local25].method8442(local94, local135 - 1) && (local135 - 1 <= 0 || local159 == Static492.aClass40Array3[local25].method8442(local94, local135 - 2))) {
								local135--;
								local151 = Static535.aClass156ArrayArrayArray2[local25][local94][local135 - 1];
							}
							for (local151 = Static535.aClass156ArrayArrayArray2[local25][local94][local29 + 1]; local137 < Static150.anInt2400 && local151 != null && local151.aShort60 < 0 && local151.aShort60 == local104.aShort60 && local104.aShort63 == local151.aShort63 && local159 == Static492.aClass40Array3[local25].method8442(local94, local137 + 1) && (Static150.anInt2400 <= local137 + 1 || local159 == Static492.aClass40Array3[local25].method8442(local94, local137 + 2)); local151 = Static535.aClass156ArrayArrayArray2[local25][local94][local137 + 1]) {
								local137++;
							}
							local318 = local25 + 1 - local25;
							local332 = Static492.aClass40Array3[local127 ? local25 + 1 : local25].method8442(local94, local135);
							local339 = local104.aShort60 * local318 + local332;
							local355 = Static492.aClass40Array3[local127 ? local25 + 1 : local25].method8442(local94, local137 + 1);
							local362 = local355 + local104.aShort60 * local318;
							local366 = local94 << Static162.anInt2830;
							local370 = local135 << Static162.anInt2830;
							local376 = Static407.anInt7012 + (local137 << Static162.anInt2830);
							Static311.aClass4Array4[Static278.anInt4554++] = new Class4(1, local25, local366 + local104.aShort63, local104.aShort63 + local366, local104.aShort63 + local366, local104.aShort63 + local366, local332, local355, local362, local339, local370, local376, local376, local370);
							for (local414 = local25; local414 <= local25; local414++) {
								for (local418 = local135; local418 <= local137; local418++) {
									Static535.aClass156ArrayArrayArray2[local414][local94][local418].aShort60 = (short) (Static535.aClass156ArrayArrayArray2[local414][local94][local418].aShort60 * -1);
								}
							}
						}
						if (local104.aShort61 < 0) {
							local135 = local94;
							local137 = local94;
							local151 = Static535.aClass156ArrayArrayArray2[local25][local94 - 1][local29];
							local159 = Static492.aClass40Array3[local25].method8442(local94, local29);
							while (local135 > 0 && local151 != null && local151.aShort61 < 0 && local151.aShort61 == local104.aShort61 && local151.aShort62 == local104.aShort62 && local159 == Static492.aClass40Array3[local25].method8442(local135 - 1, local29) && (local135 - 1 <= 0 || Static492.aClass40Array3[local25].method8442(local135 - 2, local29) == local159)) {
								local135--;
								local151 = Static535.aClass156ArrayArrayArray2[local25][local135 - 1][local29];
							}
							for (local151 = Static535.aClass156ArrayArrayArray2[local25][local94 + 1][local29]; local137 < Static129.anInt6336 && local151 != null && local151.aShort61 < 0 && local151.aShort61 == local104.aShort61 && local104.aShort62 == local151.aShort62 && local159 == Static492.aClass40Array3[local25].method8442(local137 + 1, local29) && (local137 + 1 >= Static129.anInt6336 || Static492.aClass40Array3[local25].method8442(local137 + 2, local29) == local159); local151 = Static535.aClass156ArrayArrayArray2[local25][local137 + 1][local29]) {
								local137++;
							}
							local318 = local25 + 1 - local25;
							local332 = Static492.aClass40Array3[local127 ? local25 + 1 : local25].method8442(local135, local29);
							local339 = local318 * local104.aShort61 + local332;
							local355 = Static492.aClass40Array3[local127 ? local25 + 1 : local25].method8442(local137 + 1, local29);
							local362 = local318 * local104.aShort61 + local355;
							local366 = local135 << Static162.anInt2830;
							local370 = (local137 << Static162.anInt2830) + Static407.anInt7012;
							local376 = local29 << Static162.anInt2830;
							Static311.aClass4Array4[Static278.anInt4554++] = new Class4(2, local25, local366, local370, local370, local366, local332, local355, local362, local339, local104.aShort62 + local376, local376 - -local104.aShort62, local104.aShort62 + local376, local376 + local104.aShort62);
							for (local414 = local25; local414 <= local25; local414++) {
								for (local418 = local135; local418 <= local137; local418++) {
									Static535.aClass156ArrayArrayArray2[local414][local418][local29].aShort61 = (short) (Static535.aClass156ArrayArrayArray2[local414][local418][local29].aShort61 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static35.aBoolean58 = true;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
	public static void method1110() {
		@Pc(11) Class62 local11 = null;
		try {
			@Pc(17) Class330 local17 = Static214.aClass192_1.method4332("2");
			while (local17.anInt9132 == 0) {
				Static452.method7478(1L);
			}
			if (local17.anInt9132 == 1) {
				local11 = (Class62) local17.anObject19;
				@Pc(42) byte[] local42 = new byte[(int) local11.method1253()];
				@Pc(57) int local57;
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44 += local57) {
					local57 = local11.method1254(local44, local42.length - local44, local42);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static414.method6320(new Class5_Sub12(local42));
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local11 != null) {
				local11.method1255();
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZI[B)[B")
	public static byte[] method1111(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static655.method4109(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(ZI[B)V")
	public static void method1112(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static201.aClass5_Sub12_2 == null) {
			Static201.aClass5_Sub12_2 = new Class5_Sub12(20000);
		}
		Static201.aClass5_Sub12_2.method8651(0, arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static471.method6901(Static201.aClass5_Sub12_2.aByteArray104);
		Static106.aClass166_Sub1Array1 = new Class166_Sub1[Static76.anInt1279];
		@Pc(38) int local38 = 0;
		for (@Pc(40) int local40 = Static57.anInt915; local40 <= Static466.anInt7863; local40++) {
			@Pc(48) Class166_Sub1 local48 = Static558.method7840(local40);
			if (local48 != null) {
				Static106.aClass166_Sub1Array1[local38++] = local48;
			}
		}
		Static103.aBoolean127 = false;
		Static333.aLong170 = Static205.method3179();
		Static201.aClass5_Sub12_2 = null;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method1113(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local34++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static282.aCharArray3[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					@Pc(80) int local80 = local54.length() - 1;
					local72 = ' ';
					local54.setCharAt(local80, Character.toUpperCase(local54.charAt(local80)));
				}
				local54.append(local72);
			}
			local54.reverse();
			local54.setCharAt(0, Character.toUpperCase(local54.charAt(0)));
			return local54.toString();
		}
	}
}
