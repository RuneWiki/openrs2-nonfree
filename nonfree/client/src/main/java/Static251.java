import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!q", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public static int anInt5212 = 0;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!fd;")
	public static Class72 aClass72_16 = null;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_79 = new Class154(30);

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!mk;")
	public static Class130 aClass130_114 = new Class130();

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	public static int anInt5215 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIZ[BIILclient!vm;I[Lclient!qs;II)V")
	public static void method4338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class92 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class174[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(10) Class4_Sub7 local10 = new Class4_Sub7(arg3);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method2399();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method2413();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local10.method2380();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local61 == arg4 && local57 >= arg0 && arg0 + 8 > local57 && arg5 <= local51 && local51 < arg5 + 8) {
					@Pc(104) Class56 local104 = Static320.method5290(local17);
					@Pc(122) int local122 = arg7 + Static309.method5198(local104.anInt1330, local57 & 0x7, local73, arg9, local104.anInt1313, local51 & 0x7);
					@Pc(139) int local139 = arg10 + Static183.method3408(local73, local57 & 0x7, local104.anInt1330, local104.anInt1313, arg9, local51 & 0x7);
					if (local122 > 0 && local139 > 0 && local122 < Static92.anInt2048 - 1 && Static290.anInt5893 - 1 > local139) {
						@Pc(158) Class174 local158 = null;
						if (!arg2) {
							@Pc(162) int local162 = arg1;
							if ((Static348.aByteArrayArrayArray11[1][local122][local139] & 0x2) == 2) {
								local162 = arg1 - 1;
							}
							if (local162 >= 0) {
								local158 = arg8[local162];
							}
						}
						Static46.method880(arg2, local139, local122, arg1, true, -1, local158, local17, local69, arg1, arg6, arg9 + local73 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method4339() {
		if (Static174.aFloat39 < 1024.0F) {
			Static174.aFloat39 = 1024.0F;
		}
		while (Static138.aFloat35 >= 16384.0F) {
			Static138.aFloat35 -= 16384.0F;
		}
		if (Static174.aFloat39 > 3072.0F) {
			Static174.aFloat39 = 3072.0F;
		}
		while (Static138.aFloat35 < 0.0F) {
			Static138.aFloat35 += 16384.0F;
		}
		@Pc(41) int local41 = Static294.anInt3998 >> 7;
		@Pc(45) int local45 = Static5.anInt133 >> 7;
		@Pc(51) int local51 = Static119.method2125(Static294.anInt3998, Static5.anInt133, Static279.anInt5645);
		@Pc(53) int local53 = 0;
		@Pc(75) int local75;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local75 = local41 - 4; local75 <= local41 + 4; local75++) {
				for (@Pc(81) int local81 = local45 - 4; local81 <= local45 + 4; local81++) {
					@Pc(85) int local85 = Static279.anInt5645;
					if (local85 < 3 && Static288.method4932(local81, local75)) {
						local85++;
					}
					@Pc(96) int local96 = 0;
					if (Static142.aByteArrayArrayArray4 != null && Static142.aByteArrayArrayArray4[local85] != null) {
						local96 = (Static142.aByteArrayArrayArray4[local85][local75][local81] & 0xFF) * 8;
					}
					@Pc(126) int local126 = local51 + local96 - Static307.aClass26Array3[local85].method4996(local75, local81);
					if (local126 > local53) {
						local53 = local126;
					}
				}
			}
		}
		local75 = local53 * 1536;
		if (local75 > 786432) {
			local75 = 786432;
		}
		if (local75 < 262144) {
			local75 = 262144;
		}
		if (local75 > Static65.anInt1359) {
			Static65.anInt1359 += (local75 - Static65.anInt1359) / 24;
		} else if (Static65.anInt1359 > local75) {
			Static65.anInt1359 += (local75 - Static65.anInt1359) / 80;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZC)Z")
	public static boolean method4340(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
