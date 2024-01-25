import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "F")
	public static float aFloat199;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "[Lclient!pda;")
	public static Class275[] aClass275Array1;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_185 = new Class151(27, 6);

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
	public static final int anInt8421 = 1;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Z")
	public static boolean method7286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < Static47.aByteArrayArrayArray3[1].length && arg1 < Static47.aByteArrayArrayArray3[1][arg0].length) {
			return (Static47.aByteArrayArrayArray3[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BILclient!ha;)V")
	public static void method7287(@OriginalArg(1) int arg0, @OriginalArg(2) Class33 arg1) {
		if (!Static671.aBoolean798 || !Static142.aBoolean362) {
			Static604.anInt9296 = 0;
			return;
		}
		if (Static35.aBoolean68) {
			Static117.aLong76 = Static269.aClass69_1.method6856();
		}
		Static596.anInt9159 = 0;
		Static106.anInt2135 = 0;
		Static679.anInt10636 = 0;
		@Pc(31) int[] local31 = arg1.Y();
		Static497.anInt7749 = (int) ((float) local31[3] / 3.0F);
		Static596.anInt9158 = (int) ((float) local31[2] / 3.0F);
		arg1.method8155(Static392.anIntArray436);
		if ((int) ((float) Static392.anIntArray436[0] / 3.0F) != Static491.anInt7688 || (int) ((float) Static392.anIntArray436[1] / 3.0F) != Static148.anInt2693) {
			Static491.anInt7688 = (int) ((float) Static392.anIntArray436[0] / 3.0F);
			Static148.anInt2693 = (int) ((float) Static392.anIntArray436[1] / 3.0F);
			Static581.anIntArray637 = new int[Static491.anInt7688 * Static148.anInt2693];
			Static19.anInt441 = Static491.anInt7688 >> 1;
			Static623.anInt9774 = Static148.anInt2693 >> 1;
		}
		Static300.aClass92_4 = arg1.method8076();
		Static604.anInt9296 = 0;
		for (@Pc(112) int local112 = 0; local112 < Static530.anInt8208; local112++) {
			Static516.method6994(Static529.aClass292Array50[local112], arg0, arg1);
		}
		for (@Pc(131) int local131 = 0; local131 < Static658.anInt10393; local131++) {
			Static516.method6994(Static220.aClass292Array62[local131], arg0, arg1);
		}
		for (@Pc(150) int local150 = 0; local150 < Static1.anInt6849; local150++) {
			Static516.method6994(Static649.aClass292Array157[local150], arg0, arg1);
		}
		Static267.anInt4311 = 0;
		if (Static604.anInt9296 > 0) {
			@Pc(170) int local170 = Static581.anIntArray637.length;
			@Pc(177) int local177 = local170 - local170 & 0x7;
			@Pc(179) int local179 = 0;
			while (local177 > local179) {
				Static581.anIntArray637[local179++] = Integer.MAX_VALUE;
				Static581.anIntArray637[local179++] = Integer.MAX_VALUE;
				Static581.anIntArray637[local179++] = Integer.MAX_VALUE;
				Static581.anIntArray637[local179++] = Integer.MAX_VALUE;
				Static581.anIntArray637[local179++] = Integer.MAX_VALUE;
				Static581.anIntArray637[local179++] = Integer.MAX_VALUE;
				Static581.anIntArray637[local179++] = Integer.MAX_VALUE;
				Static581.anIntArray637[local179++] = Integer.MAX_VALUE;
			}
			while (local179 < local170) {
				Static581.anIntArray637[local179++] = Integer.MAX_VALUE;
			}
			Static509.anInt7969 = 1;
			for (@Pc(238) int local238 = 0; local238 < Static604.anInt9296; local238++) {
				@Pc(244) Class292 local244 = Static441.aClass292Array170[local238];
				Static395.method2779(local244.aShortArray95[1], local244.aShortArray97[0], local244.aShortArray97[1], local244.aShortArray96[0], local244.aShortArray96[3], local244.aShortArray95[0], local244.aShortArray96[1], local244.aShortArray95[3], local244.aShortArray97[3]);
				Static395.method2779(local244.aShortArray95[2], local244.aShortArray97[1], local244.aShortArray97[2], local244.aShortArray96[1], local244.aShortArray96[3], local244.aShortArray95[1], local244.aShortArray96[2], local244.aShortArray95[3], local244.aShortArray97[3]);
			}
			Static509.anInt7969 = 2;
		}
		if (Static35.aBoolean68) {
			Static352.aLong163 = Static269.aClass69_1.method6856() - Static117.aLong76;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!fda;ZLclient!es;)Lclient!ca;")
	public static Class38 method7289(@OriginalArg(0) Class110 arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		@Pc(10) Class38 local10 = new Class38(arg0);
		@Pc(14) int local14 = arg1.method8865();
		@Pc(22) boolean local22 = (local14 & 0x1) != 0;
		@Pc(33) boolean local33 = (local14 & 0x2) != 0;
		@Pc(44) boolean local44 = (local14 & 0x4) != 0;
		@Pc(52) boolean local52 = (local14 & 0x8) != 0;
		if (local22) {
			local10.anIntArray82[0] = arg1.method8859();
			local10.anIntArray81[0] = arg1.method8859();
			if (arg0.anInt2810 != -1 || arg0.anInt2780 != -1) {
				local10.anIntArray82[1] = arg1.method8859();
				local10.anIntArray81[1] = arg1.method8859();
			}
			if (arg0.anInt2743 != -1 || arg0.anInt2804 != -1) {
				local10.anIntArray82[2] = arg1.method8859();
				local10.anIntArray81[2] = arg1.method8859();
			}
		}
		if (local33) {
			local10.anIntArray80[0] = arg1.method8859();
			local10.anIntArray83[0] = arg1.method8859();
			if (arg0.anInt2757 != -1 || arg0.anInt2796 != -1) {
				local10.anIntArray80[1] = arg1.method8859();
				local10.anIntArray83[1] = arg1.method8859();
			}
		}
		@Pc(164) int local164;
		@Pc(167) int[] local167;
		@Pc(199) int local199;
		if (local44) {
			local164 = arg1.method8859();
			local167 = new int[] { local164 & 0xF, local164 >> 4 & 0xF, local164 >> 8 & 0xF, local164 >> 12 & 0xF };
			for (local199 = 0; local199 < 4; local199++) {
				if (local167[local199] != 15) {
					local10.aShortArray13[local167[local199]] = (short) arg1.method8859();
				}
			}
		}
		if (local52) {
			local164 = arg1.method8865();
			local167 = new int[] { local164 & 0xF, local164 >> 4 & 0xF };
			for (local199 = 0; local199 < 2; local199++) {
				if (local167[local199] != 15) {
					local10.aShortArray14[local167[local199]] = (short) arg1.method8859();
				}
			}
		}
		return local10;
	}
}
