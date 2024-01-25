import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
	public static int anInt4250;

	@OriginalMember(owner = "client!gn", name = "O", descriptor = "I")
	public static int anInt4253 = -1;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB)Z")
	public static boolean method3468(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!ha;B)V")
	public static void method3473(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1) {
		if (!Static307.aBoolean442 || !Static350.aBoolean469) {
			Static396.anInt9377 = 0;
			return;
		}
		if (Static640.aBoolean761) {
			Static346.aLong168 = Static227.aClass10_1.method5413();
		}
		Static299.anInt5988 = 0;
		Static36.anInt1451 = 0;
		Static133.anInt3542 = 0;
		@Pc(27) int[] local27 = arg1.Y();
		Static623.anInt6559 = (int) ((float) local27[3] / 3.0F);
		Static130.anInt3468 = (int) ((float) local27[2] / 3.0F);
		arg1.method6087(Static429.anIntArray427);
		if ((int) ((float) Static429.anIntArray427[0] / 3.0F) != Static225.anInt10572 || (int) ((float) Static429.anIntArray427[1] / 3.0F) != Static46.anInt1571) {
			Static46.anInt1571 = (int) ((float) Static429.anIntArray427[1] / 3.0F);
			Static225.anInt10572 = (int) ((float) Static429.anIntArray427[0] / 3.0F);
			Static613.anInt10345 = Static225.anInt10572 >> 1;
			Static193.anInt4515 = Static46.anInt1571 >> 1;
			Static169.anIntArray223 = new int[Static46.anInt1571 * Static225.anInt10572];
		}
		Static224.aClass54_4 = arg1.method6118();
		Static396.anInt9377 = 0;
		for (@Pc(105) int local105 = 0; local105 < Static160.anInt4007; local105++) {
			Static51.method1423(arg0, Static75.aClass372Array2[local105], arg1);
		}
		for (@Pc(124) int local124 = 0; local124 < Static128.anInt3432; local124++) {
			Static51.method1423(arg0, Static476.aClass372Array3[local124], arg1);
		}
		for (@Pc(143) int local143 = 0; local143 < Static134.anInt3553; local143++) {
			Static51.method1423(arg0, Static619.aClass372Array4[local143], arg1);
		}
		Static359.anInt6889 = 0;
		if (Static396.anInt9377 > 0) {
			@Pc(163) int local163 = Static169.anIntArray223.length;
			@Pc(169) int local169 = local163 - local163 & 0x7;
			@Pc(171) int local171 = 0;
			while (local169 > local171) {
				Static169.anIntArray223[local171++] = Integer.MAX_VALUE;
				Static169.anIntArray223[local171++] = Integer.MAX_VALUE;
				Static169.anIntArray223[local171++] = Integer.MAX_VALUE;
				Static169.anIntArray223[local171++] = Integer.MAX_VALUE;
				Static169.anIntArray223[local171++] = Integer.MAX_VALUE;
				Static169.anIntArray223[local171++] = Integer.MAX_VALUE;
				Static169.anIntArray223[local171++] = Integer.MAX_VALUE;
				Static169.anIntArray223[local171++] = Integer.MAX_VALUE;
			}
			while (local163 > local171) {
				Static169.anIntArray223[local171++] = Integer.MAX_VALUE;
			}
			Static146.anInt3696 = 1;
			for (@Pc(234) int local234 = 0; local234 < Static396.anInt9377; local234++) {
				@Pc(240) Class372 local240 = Static16.aClass372Array1[local234];
				Static65.method1727(local240.aShortArray151[0], local240.aShortArray151[1], local240.aShortArray150[0], local240.aShortArray150[3], local240.aShortArray149[3], local240.aShortArray149[0], local240.aShortArray149[1], local240.aShortArray150[1], local240.aShortArray151[3]);
				Static65.method1727(local240.aShortArray151[1], local240.aShortArray151[2], local240.aShortArray150[1], local240.aShortArray150[3], local240.aShortArray149[3], local240.aShortArray149[1], local240.aShortArray149[2], local240.aShortArray150[2], local240.aShortArray151[3]);
			}
			Static146.anInt3696 = 2;
		}
		if (Static640.aBoolean761) {
			Static514.aLong236 = Static227.aClass10_1.method5413() - Static346.aLong168;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)[Lclient!vj;")
	public static Class358[] method3475() {
		if (Static196.aClass358Array1 == null) {
			@Pc(16) Class358[] local16 = Static295.method4893(Static51.aClass118_1);
			@Pc(20) Class358[] local20 = new Class358[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(27) int local27 = Static155.aClass8_Sub25_6.aClass36_Sub11_1.method4435();
			@Pc(89) int local89;
			@Pc(95) Class358 local95;
			label69: for (@Pc(29) int local29 = 0; local29 < local16.length; local29++) {
				@Pc(35) Class358 local35 = local16[local29];
				if ((local35.anInt10255 <= 0 || local35.anInt10255 >= 24) && local35.anInt10258 >= 800 && local35.anInt10252 >= 600 && (local27 != 2 || local35.anInt10258 <= 800 && local35.anInt10252 <= 600) && (local27 != 1 || local35.anInt10258 <= 1024 && local35.anInt10252 <= 768)) {
					for (local89 = 0; local89 < local22; local89++) {
						local95 = local20[local89];
						if (local95.anInt10258 == local35.anInt10258 && local95.anInt10252 == local35.anInt10252) {
							if (local95.anInt10255 < local35.anInt10255) {
								local20[local89] = local35;
							}
							continue label69;
						}
					}
					local20[local22] = local35;
					local22++;
				}
			}
			Static196.aClass358Array1 = new Class358[local22];
			Static649.method5530(local20, 0, Static196.aClass358Array1, 0, local22);
			@Pc(159) int[] local159 = new int[Static196.aClass358Array1.length];
			for (local89 = 0; local89 < Static196.aClass358Array1.length; local89++) {
				local95 = Static196.aClass358Array1[local89];
				local159[local89] = local95.anInt10252 * local95.anInt10258;
			}
			Static561.method7831(local159, Static196.aClass358Array1);
		}
		return Static196.aClass358Array1;
	}
}
