import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	public static int anInt6941;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt6944 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIII)V")
	public static void method5427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static452.method6064(arg4);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg4 - arg0;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg4;
		@Pc(23) int local23 = -arg4;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(53) int local53;
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(78) int local78;
		if (arg3 >= Static305.anInt5429 && arg3 <= Static212.anInt452) {
			@Pc(44) int[] local44 = Static59.anIntArrayArray34[arg3];
			local53 = Static85.method1427(Static221.anInt4001, arg2 - arg4, Static83.anInt7380);
			local61 = Static85.method1427(Static221.anInt4001, arg2 + arg4, Static83.anInt7380);
			local70 = Static85.method1427(Static221.anInt4001, arg2 - local14, Static83.anInt7380);
			local78 = Static85.method1427(Static221.anInt4001, arg2 + local14, Static83.anInt7380);
			Static217.method3280(local44, local53, arg1, local70);
			Static217.method3280(local44, local70, arg5, local78);
			Static217.method3280(local44, local78, arg1, local61);
		}
		@Pc(98) int local98 = -1;
		while (local10 < local20) {
			local30 += 2;
			local98 += 2;
			local28 += local98;
			local23 += local30;
			if (local28 >= 0 && local25 >= 1) {
				local25--;
				Static387.anIntArray560[local25] = local10;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(203) int local203;
			@Pc(212) int local212;
			@Pc(223) int[] local223;
			@Pc(149) int local149;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				local149 = arg3 - local20;
				local53 = arg3 + local20;
				if (local53 >= Static305.anInt5429 && local149 <= Static212.anInt452) {
					if (local20 < local14) {
						local61 = Static387.anIntArray560[local20];
						local70 = Static85.method1427(Static221.anInt4001, arg2 + local10, Static83.anInt7380);
						local78 = Static85.method1427(Static221.anInt4001, arg2 - local10, Static83.anInt7380);
						local203 = Static85.method1427(Static221.anInt4001, arg2 + local61, Static83.anInt7380);
						local212 = Static85.method1427(Static221.anInt4001, arg2 - local61, Static83.anInt7380);
						if (local53 <= Static212.anInt452) {
							local223 = Static59.anIntArrayArray34[local53];
							Static217.method3280(local223, local78, arg1, local212);
							Static217.method3280(local223, local212, arg5, local203);
							Static217.method3280(local223, local203, arg1, local70);
						}
						if (Static305.anInt5429 <= local149) {
							local223 = Static59.anIntArrayArray34[local149];
							Static217.method3280(local223, local78, arg1, local212);
							Static217.method3280(local223, local212, arg5, local203);
							Static217.method3280(local223, local203, arg1, local70);
						}
					} else {
						local61 = Static85.method1427(Static221.anInt4001, local10 + arg2, Static83.anInt7380);
						local70 = Static85.method1427(Static221.anInt4001, arg2 - local10, Static83.anInt7380);
						if (Static212.anInt452 >= local53) {
							Static217.method3280(Static59.anIntArrayArray34[local53], local70, arg1, local61);
						}
						if (Static305.anInt5429 <= local149) {
							Static217.method3280(Static59.anIntArrayArray34[local149], local70, arg1, local61);
						}
					}
				}
			}
			local149 = arg3 - local10;
			local53 = local10 + arg3;
			if (Static305.anInt5429 <= local53 && local149 <= Static212.anInt452) {
				local61 = local20 + arg2;
				local70 = arg2 - local20;
				if (local61 >= Static83.anInt7380 && Static221.anInt4001 >= local70) {
					local61 = Static85.method1427(Static221.anInt4001, local61, Static83.anInt7380);
					local70 = Static85.method1427(Static221.anInt4001, local70, Static83.anInt7380);
					if (local14 > local10) {
						local78 = local10 > local25 ? Static387.anIntArray560[local10] : local25;
						local203 = Static85.method1427(Static221.anInt4001, local78 + arg2, Static83.anInt7380);
						local212 = Static85.method1427(Static221.anInt4001, arg2 - local78, Static83.anInt7380);
						if (Static212.anInt452 >= local53) {
							local223 = Static59.anIntArrayArray34[local53];
							Static217.method3280(local223, local70, arg1, local212);
							Static217.method3280(local223, local212, arg5, local203);
							Static217.method3280(local223, local203, arg1, local61);
						}
						if (Static305.anInt5429 <= local149) {
							local223 = Static59.anIntArrayArray34[local149];
							Static217.method3280(local223, local70, arg1, local212);
							Static217.method3280(local223, local212, arg5, local203);
							Static217.method3280(local223, local203, arg1, local61);
						}
					} else {
						if (Static212.anInt452 >= local53) {
							Static217.method3280(Static59.anIntArrayArray34[local53], local70, arg1, local61);
						}
						if (local149 >= Static305.anInt5429) {
							Static217.method3280(Static59.anIntArrayArray34[local149], local70, arg1, local61);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z")
	public static boolean method5428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static133.method1904(arg1, arg0) | (arg0 & 0x60000) != 0 || Static161.method2443(arg0, arg1) || Static428.method5726(arg0, arg1);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method5429() {
		@Pc(11) int local11 = Static187.anInt4913;
		@Pc(13) int[] local13 = Static256.anIntArray370;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(23) Class26_Sub2_Sub2_Sub1 local23 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local13[local15]];
			if (local23 != null) {
				Static30.method496(local23, local23.method5535());
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method5431(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local47.append(Static271.aCharArray4[(int) (local54 - arg0 * 37L)]);
			}
			return local47.reverse().toString();
		}
	}
}
