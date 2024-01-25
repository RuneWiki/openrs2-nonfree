import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!sha", name = "i", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_126 = new Class130(15, 12);

	@OriginalMember(owner = "client!sha", name = "k", descriptor = "[I")
	public static final int[] anIntArray594 = new int[1024];

	@OriginalMember(owner = "client!sha", name = "o", descriptor = "I")
	public static int anInt9372 = -1;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIIIIII)V")
	public static void method8068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static599.method8387(arg4);
		@Pc(14) int local14 = 0;
		@Pc(19) int local19 = arg4 - arg2;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(25) int local25 = arg4;
		@Pc(28) int local28 = -arg4;
		@Pc(30) int local30 = local19;
		@Pc(33) int local33 = -local19;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(82) int local82;
		if (arg1 >= Static11.anInt9803 && arg1 <= Static149.anInt2949) {
			@Pc(47) int[] local47 = Static460.anIntArrayArray53[arg1];
			local56 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 - arg4);
			local64 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 + arg4);
			local73 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 - local19);
			local82 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 + local19);
			Static611.method8472(local73, local56, local47, arg5);
			Static611.method8472(local82, local73, local47, arg0);
			Static611.method8472(local64, local82, local47, arg5);
		}
		while (local25 > local14) {
			local37 += 2;
			local35 += 2;
			local28 += local35;
			local33 += local37;
			if (local33 >= 0 && local30 >= 1) {
				local30--;
				local33 -= local30 << 1;
				Static233.anIntArray229[local30] = local14;
			}
			local14++;
			@Pc(200) int local200;
			@Pc(209) int local209;
			@Pc(216) int[] local216;
			@Pc(148) int local148;
			if (local28 >= 0) {
				local25--;
				local28 -= local25 << 1;
				local148 = arg1 - local25;
				local56 = arg1 + local25;
				if (Static11.anInt9803 <= local56 && Static149.anInt2949 >= local148) {
					if (local19 > local25) {
						local64 = Static233.anIntArray229[local25];
						local73 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 + local14);
						local82 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 - local14);
						local200 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 + local64);
						local209 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 - local64);
						if (local56 <= Static149.anInt2949) {
							local216 = Static460.anIntArrayArray53[local56];
							Static611.method8472(local209, local82, local216, arg5);
							Static611.method8472(local200, local209, local216, arg0);
							Static611.method8472(local73, local200, local216, arg5);
						}
						if (Static11.anInt9803 <= local148) {
							local216 = Static460.anIntArrayArray53[local148];
							Static611.method8472(local209, local82, local216, arg5);
							Static611.method8472(local200, local209, local216, arg0);
							Static611.method8472(local73, local200, local216, arg5);
						}
					} else {
						local64 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 + local14);
						local73 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 - local14);
						if (local56 <= Static149.anInt2949) {
							Static611.method8472(local64, local73, Static460.anIntArrayArray53[local56], arg5);
						}
						if (local148 >= Static11.anInt9803) {
							Static611.method8472(local64, local73, Static460.anIntArrayArray53[local148], arg5);
						}
					}
				}
			}
			local148 = arg1 - local14;
			local56 = local14 + arg1;
			if (Static11.anInt9803 <= local56 && Static149.anInt2949 >= local148) {
				local64 = local25 + arg3;
				local73 = arg3 - local25;
				if (local64 >= Static630.anInt10099 && Static16.anInt4339 >= local73) {
					local64 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, local64);
					local73 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, local73);
					if (local19 <= local14) {
						if (local56 <= Static149.anInt2949) {
							Static611.method8472(local64, local73, Static460.anIntArrayArray53[local56], arg5);
						}
						if (Static11.anInt9803 <= local148) {
							Static611.method8472(local64, local73, Static460.anIntArrayArray53[local148], arg5);
						}
					} else {
						local82 = local14 > local30 ? Static233.anIntArray229[local14] : local30;
						local200 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 + local82);
						local209 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 - local82);
						if (local56 <= Static149.anInt2949) {
							local216 = Static460.anIntArrayArray53[local56];
							Static611.method8472(local209, local73, local216, arg5);
							Static611.method8472(local200, local209, local216, arg0);
							Static611.method8472(local64, local200, local216, arg5);
						}
						if (local148 >= Static11.anInt9803) {
							local216 = Static460.anIntArrayArray53[local148];
							Static611.method8472(local209, local73, local216, arg5);
							Static611.method8472(local200, local209, local216, arg0);
							Static611.method8472(local64, local200, local216, arg5);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIIII)V")
	public static void method8069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static234.anInt4427 != 1) {
			return;
		}
		@Pc(13) int local13 = arg0 / Static153.anInt3029;
		@Pc(17) int local17 = arg2 / Static153.anInt3029;
		@Pc(26) int local26 = arg1 / Static159.anInt3138;
		@Pc(30) int local30 = arg3 / Static159.anInt3138;
		if (local13 >= Static330.anInt6169 || local17 < 0 || Static592.anInt9706 <= local26 || local30 < 0) {
			return;
		}
		if (local26 < 0) {
			local26 = 0;
		}
		if (Static330.anInt6169 <= local17) {
			local17 = Static330.anInt6169 - 1;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		if (local30 >= Static592.anInt9706) {
			local30 = Static592.anInt9706 - 1;
		}
		for (@Pc(83) int local83 = local26; local83 <= local30; local83++) {
			@Pc(94) int local94 = Static583.method8236(Static596.anInt9751 + local83, Static592.anInt9706) * Static330.anInt6169;
			for (@Pc(96) int local96 = local13; local96 <= local17; local96++) {
				@Pc(107) int local107 = Static583.method8236(Static408.anInt7470 + local96, Static330.anInt6169) + local94;
				Static194.anIntArray198[local107] = Static576.anInt9495;
			}
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lclient!jc;I)V")
	public static void method8070(@OriginalArg(0) Class3_Sub3_Sub2 arg0) {
		arg0.method4265(Static571.aClass196_119.method5117());
		arg0.method4265(Static450.aClass196_96.method5117());
		arg0.method4265(Static351.aClass196_69.method5117());
		arg0.method4265(Static226.aClass196_25.method5117());
		arg0.method4265(Static294.aClass196_53.method5117());
		arg0.method4265(Static395.aClass196_80.method5117());
		arg0.method4265(Static336.aClass196_65.method5117());
		arg0.method4265(Static68.aClass196_18.method5117());
		arg0.method4265(Static474.aClass196_98.method5117());
		arg0.method4265(Static297.aClass196_58.method5117());
		arg0.method4265(Static182.aClass196_38.method5117());
		arg0.method4265(Static29.aClass196_9.method5117());
		arg0.method4265(Static522.aClass196_109.method5117());
		arg0.method4265(Static429.aClass196_84.method5117());
		arg0.method4265(Static342.aClass196_67.method5117());
		arg0.method4265(Static106.aClass196_30.method5117());
		arg0.method4265(Static557.aClass196_113.method5117());
		arg0.method4265(Static383.aClass196_76.method5117());
		arg0.method4265(Static368.aClass196_74.method5117());
		arg0.method4265(Static311.aClass196_77.method5117());
		arg0.method4265(Static11.aClass196_129.method5117());
		arg0.method4265(Static35.aClass196_12.method5117());
		arg0.method4265(Static384.aClass196_78.method5117());
		arg0.method4265(Static508.aClass196_106.method5117());
		arg0.method4265(Static501.aClass196_103.method5117());
		arg0.method4265(Static72.aClass196_19.method5117());
		arg0.method4265(Static584.aClass196_122.method5117());
		arg0.method4265(Static455.aClass196_97.method5117());
		arg0.method4265(Static25.aClass196_85.method5117());
		arg0.method4265(Static351.aClass196_68.method5117());
		arg0.method4265(Static580.aClass196_120.method5117());
		arg0.method4265(Static56.aClass196_17.method5117());
		arg0.method4265(Static588.method8284());
		arg0.method4265(Static151.method2758());
		arg0.method4265(Static177.aClass196_36.method5117());
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLclient!la;IIJZI)V")
	public static void method8075(@OriginalArg(1) Class196 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		Static543.method7935(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(IIIIIII)V")
	public static void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int local13 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg4);
		@Pc(19) int local19 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg0);
		@Pc(25) int local25 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg2);
		@Pc(31) int local31 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3);
		@Pc(41) int local41 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg1 + arg4);
		@Pc(50) int local50 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg0 - arg1);
		for (@Pc(58) int local58 = local13; local58 < local41; local58++) {
			Static611.method8472(local31, local25, Static460.anIntArrayArray53[local58], arg5);
		}
		for (@Pc(78) int local78 = local19; local78 > local50; local78--) {
			Static611.method8472(local31, local25, Static460.anIntArrayArray53[local78], arg5);
		}
		@Pc(102) int local102 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg1 + arg2);
		@Pc(113) int local113 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 - arg1);
		for (@Pc(115) int local115 = local41; local115 <= local50; local115++) {
			@Pc(121) int[] local121 = Static460.anIntArrayArray53[local115];
			Static611.method8472(local102, local25, local121, arg5);
			Static611.method8472(local31, local113, local121, arg5);
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIIIZ)V")
	public static void method8085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static149.anInt2949 = arg0;
		Static16.anInt4339 = arg1;
		Static11.anInt9803 = 0;
		Static630.anInt10099 = 0;
	}
}
