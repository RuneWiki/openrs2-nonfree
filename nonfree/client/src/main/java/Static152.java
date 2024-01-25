import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fb", name = "Ad", descriptor = "[Lclient!qm;")
	public static final Class14_Sub37[] aClass14_Sub37Array1 = new Class14_Sub37[8];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)I")
	public static int method2434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static576.aClass51Array3 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg0 >> 9;
		@Pc(20) int local20 = arg2 >> 9;
		if (local16 < 0 || local20 < 0 || Static26.anInt462 - 1 < local16 || local20 > Static445.anInt6140 - 1) {
			return 0;
		}
		@Pc(45) int local45 = arg1;
		if (arg1 < 3 && (Static553.aByteArrayArrayArray18[1][local16][local20] & 0x2) != 0) {
			local45 = arg1 + 1;
		}
		return Static576.aClass51Array3[local45].method7866(arg0, arg2);
	}

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "(I)I")
	public static int method2445() {
		if (Static360.anInt6733 == 0) {
			Static672.aClass392_2.method9270(new Class313("jaclib"));
			if (Static672.aClass392_2.method9274().method9016() != 100) {
				return 1;
			}
			if (!((Class313) Static672.aClass392_2.method9274()).method7633()) {
				Static243.aClient1.method1462();
			}
			Static360.anInt6733 = 1;
		}
		@Pc(235) int local235;
		@Pc(254) int local254;
		@Pc(268) int local268;
		@Pc(276) int local276;
		if (Static360.anInt6733 == 1) {
			Static31.aClass392Array1 = Static672.method9269();
			Static672.aClass392_1.method9270(new Class377(Static510.aClass386_111));
			Static672.aClass392_3.method9270(new Class313("jaggl"));
			Static672.aClass392_4.method9270(new Class313("jagdx"));
			Static672.aClass392_5.method9270(new Class313("jagmisc"));
			Static672.aClass392_6.method9270(new Class313("sw3d"));
			Static672.aClass392_7.method9270(new Class313("hw3d"));
			Static672.aClass392_8.method9270(new Class313("jagtheora"));
			Static672.aClass392_9.method9270(new Class377(Static55.aClass386_16));
			Static672.aClass392_10.method9270(new Class377(Static224.aClass386_52));
			Static672.aClass392_11.method9270(new Class377(Static634.aClass386_134));
			Static672.aClass392_12.method9270(new Class377(Static52.aClass386_15));
			Static672.aClass392_13.method9270(new Class377(Static345.aClass386_83));
			Static672.aClass392_14.method9270(new Class377(Static598.aClass386_124));
			Static672.aClass392_15.method9270(new Class377(Static134.aClass386_56));
			Static672.aClass392_16.method9270(new Class377(Static29.aClass386_6));
			Static672.aClass392_17.method9270(new Class377(Static76.aClass386_18));
			Static672.aClass392_18.method9270(new Class377(Static14.aClass386_3));
			Static672.aClass392_19.method9270(new Class377(Static376.aClass386_87));
			Static672.aClass392_20.method9270(new Class377(Static172.aClass386_40));
			Static672.aClass392_21.method9270(new Class377(Static475.aClass386_103));
			Static672.aClass392_22.method9270(new Class377(Static624.aClass386_132));
			Static672.aClass392_23.method9270(new Class52(Static339.aClass386_81, "huffman"));
			Static672.aClass392_24.method9270(new Class377(Static635.aClass386_136));
			Static672.aClass392_25.method9270(new Class377(Static366.aClass386_85));
			Static672.aClass392_26.method9270(new Class377(Static329.aClass386_78));
			Static672.aClass392_27.method9270(new Class114(Static298.aClass386_71, "details"));
			for (local235 = 0; local235 < Static31.aClass392Array1.length; local235++) {
				if (Static31.aClass392Array1[local235].method9274() == null) {
					throw new RuntimeException();
				}
			}
			local254 = 0;
			@Pc(256) Class392[] local256 = Static31.aClass392Array1;
			for (@Pc(258) int local258 = 0; local258 < local256.length; local258++) {
				@Pc(264) Class392 local264 = local256[local258];
				local268 = local264.method9273();
				local276 = local264.method9274().method9016();
				local254 += local276 * local268 / 100;
			}
			Static214.anInt4070 = local254;
			Static360.anInt6733 = 2;
		}
		if (Static31.aClass392Array1 == null) {
			return 100;
		}
		local235 = 0;
		local254 = 0;
		@Pc(307) boolean local307 = true;
		@Pc(309) Class392[] local309 = Static31.aClass392Array1;
		for (@Pc(311) int local311 = 0; local311 < local309.length; local311++) {
			@Pc(317) Class392 local317 = local309[local311];
			local276 = local317.method9273();
			@Pc(327) int local327 = local317.method9274().method9016();
			local235 += local276;
			local254 += local327 * local276 / 100;
			if (local327 < 100) {
				local307 = false;
			}
		}
		if (local307) {
			if (!((Class313) Static672.aClass392_5.method9274()).method7633()) {
				Static243.aClient1.method1459();
			}
			if (!((Class313) Static672.aClass392_8.method9274()).method7633()) {
				Static318.aBoolean427 = Static243.aClient1.method1447();
			}
			Static31.aClass392Array1 = null;
		}
		local254 -= Static214.anInt4070;
		local235 -= Static214.anInt4070;
		local268 = local235 > 0 ? local254 * 100 / local235 : 100;
		if (!local307 && local268 > 99) {
			local268 = 99;
		}
		return local268;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method2446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = Static46.anInt1120;
		if (local9 == 0) {
			return;
		}
		if (local9 == 1) {
			Static28.anInt705 = arg2;
			Static508.anInt8975 = arg0;
			Static46.anInt1120 = 2;
			Static354.anInt6530 = arg3;
			Static185.anInt3544 = arg1;
		} else if (local9 == 2) {
			if (Static28.anInt705 > arg2) {
				Static28.anInt705 = arg2;
			}
			if (arg3 > Static354.anInt6530) {
				Static354.anInt6530 = arg3;
			}
			if (arg0 < Static508.anInt8975) {
				Static508.anInt8975 = arg0;
			}
			if (arg1 > Static185.anInt3544) {
				Static185.anInt3544 = arg1;
			}
		}
	}
}
