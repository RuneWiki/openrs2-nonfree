import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	public static int anInt7114;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public static int anInt7112 = 0;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_76 = new Class46(44, 8);

	@OriginalMember(owner = "client!le", name = "g", descriptor = "[I")
	public static final int[] anIntArray378 = new int[5];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZII)V")
	public static void method6293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(19) int local19 = arg4 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(43) int local43 = (Static289.aShort73 - Static188.aShort106) * local19 / 100 + Static188.aShort106;
		if (Static530.aShort112 > local43) {
			local43 = Static530.aShort112;
		} else if (Static58.aShort24 < local43) {
			local43 = Static58.aShort24;
		}
		@Pc(69) int local69 = arg4 * 512 * local43 / (arg3 * 334);
		@Pc(103) int local103;
		@Pc(110) int local110;
		@Pc(78) short local78;
		if (Static585.aShort111 > local69) {
			local78 = Static585.aShort111;
			local43 = local78 * 334 * arg3 / (arg4 * 512);
			if (local43 > Static58.aShort24) {
				local43 = Static58.aShort24;
				local103 = local43 * 512 * arg4 / (local78 * 334);
				local110 = (arg3 - local103) / 2;
				if (arg2) {
					Static213.aClass133_5.la();
					Static213.aClass133_5.method7251(local110, arg4, -16777216, arg0, arg1);
					Static213.aClass133_5.method7251(local110, arg4, -16777216, arg0, arg1 + arg3 - local110);
				}
				arg3 -= local110 * 2;
				arg1 += local110;
			}
		} else if (Static221.aShort62 < local69) {
			local78 = Static221.aShort62;
			local43 = arg3 * local78 * 334 / (arg4 * 512);
			if (local43 < Static530.aShort112) {
				local43 = Static530.aShort112;
				local103 = arg3 * local78 * 334 / (local43 * 512);
				local110 = (arg4 - local103) / 2;
				if (arg2) {
					Static213.aClass133_5.la();
					Static213.aClass133_5.method7251(arg3, local110, -16777216, arg0, arg1);
					Static213.aClass133_5.method7251(arg3, local110, -16777216, arg4 + arg0 - local110, arg1);
				}
				arg0 += local110;
				arg4 -= local110 * 2;
			}
		}
		Static224.anInt4200 = arg0;
		Static625.anInt10415 = (short) arg3;
		Static100.anInt1975 = arg1;
		Static558.anInt9417 = local43 * arg4 / 334;
		Static379.anInt6265 = (short) arg4;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
	public static void method6295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static421.aClass217ArrayArrayArray5[0][arg1][arg2] != null && Static421.aClass217ArrayArrayArray5[0][arg1][arg2].aClass217_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static421.aClass217ArrayArrayArray5[local22][arg1][arg2] == null) {
				@Pc(44) Class217 local44 = Static421.aClass217ArrayArrayArray5[local22][arg1][arg2] = new Class217(local22);
				if (local20) {
					local44.aByte80++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!ha;)V")
	public static void method6297(@OriginalArg(0) int arg0, @OriginalArg(2) Class133 arg1) {
		if (!Static437.aBoolean537 || !Static631.aBoolean753) {
			Static333.anInt5654 = 0;
			return;
		}
		if (Static531.aBoolean661) {
			Static237.aLong109 = Static289.aClass86_1.method4810();
		}
		Static139.anInt2426 = 0;
		Static242.anInt4460 = 0;
		Static81.anInt1682 = 0;
		@Pc(37) int[] local37 = arg1.Y();
		Static34.anInt568 = (int) ((float) local37[3] / 3.0F);
		Static322.anInt5454 = (int) ((float) local37[2] / 3.0F);
		arg1.method7248(Static606.anIntArray584);
		if ((int) ((float) Static606.anIntArray584[0] / 3.0F) != Static140.anInt2441 || Static176.anInt3129 != (int) ((float) Static606.anIntArray584[1] / 3.0F)) {
			Static140.anInt2441 = (int) ((float) Static606.anIntArray584[0] / 3.0F);
			Static176.anInt3129 = (int) ((float) Static606.anIntArray584[1] / 3.0F);
			Static480.anIntArray460 = new int[Static140.anInt2441 * Static176.anInt3129];
			Static411.anInt7153 = Static140.anInt2441 >> 1;
			Static26.anInt349 = Static176.anInt3129 >> 1;
		}
		Static355.aClass113_5 = arg1.method7299();
		Static333.anInt5654 = 0;
		for (@Pc(110) int local110 = 0; local110 < Static274.anInt4914; local110++) {
			Static166.method2417(arg1, arg0, Static517.aClass34Array5[local110]);
		}
		for (@Pc(129) int local129 = 0; local129 < Static368.anInt6139; local129++) {
			Static166.method2417(arg1, arg0, Static108.aClass34Array3[local129]);
		}
		for (@Pc(148) int local148 = 0; local148 < Static239.anInt4416; local148++) {
			Static166.method2417(arg1, arg0, Static8.aClass34Array4[local148]);
		}
		Static192.anInt3358 = 0;
		if (Static333.anInt5654 > 0) {
			@Pc(171) int local171 = Static480.anIntArray460.length;
			@Pc(177) int local177 = local171 - local171 & 0x7;
			@Pc(179) int local179 = 0;
			while (local177 > local179) {
				Static480.anIntArray460[local179++] = Integer.MAX_VALUE;
				Static480.anIntArray460[local179++] = Integer.MAX_VALUE;
				Static480.anIntArray460[local179++] = Integer.MAX_VALUE;
				Static480.anIntArray460[local179++] = Integer.MAX_VALUE;
				Static480.anIntArray460[local179++] = Integer.MAX_VALUE;
				Static480.anIntArray460[local179++] = Integer.MAX_VALUE;
				Static480.anIntArray460[local179++] = Integer.MAX_VALUE;
				Static480.anIntArray460[local179++] = Integer.MAX_VALUE;
			}
			while (local179 < local171) {
				Static480.anIntArray460[local179++] = Integer.MAX_VALUE;
			}
			Static169.anInt2875 = 1;
			for (@Pc(242) int local242 = 0; local242 < Static333.anInt5654; local242++) {
				@Pc(248) Class34 local248 = Static41.aClass34Array2[local242];
				Static174.method2692(local248.aShortArray21[0], local248.aShortArray21[1], local248.aShortArray20[0], local248.aShortArray21[3], local248.aShortArray19[3], local248.aShortArray20[3], local248.aShortArray19[1], local248.aShortArray19[0], local248.aShortArray20[1]);
				Static174.method2692(local248.aShortArray21[1], local248.aShortArray21[2], local248.aShortArray20[1], local248.aShortArray21[3], local248.aShortArray19[3], local248.aShortArray20[3], local248.aShortArray19[2], local248.aShortArray19[1], local248.aShortArray20[2]);
			}
			Static169.anInt2875 = 2;
		}
		if (Static531.aBoolean661) {
			Static340.aLong139 = Static289.aClass86_1.method4810() - Static237.aLong109;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ka;IILclient!kn;II)V")
	public static void method6298(@OriginalArg(0) Class187 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class200 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			arg2.method4583(arg0.V(), arg0.EA(), arg3, arg0.fa(), arg0.G(), arg1, arg0.RA(), arg4, arg0.HA(), arg0.na());
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BIIILclient!la;Z)V")
	public static void method6299(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class207 arg2) {
		Static497.method7445(arg2, 0L, arg0, arg1);
	}
}
