import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public static int anInt6571 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[FIII)V")
	public static void method5713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static88.method1890(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static88.method1890(arg5)) {
			@Pc(48) int local48 = Static717.method9503(6408);
			@Pc(50) int local50 = 0;
			@Pc(62) int local62 = arg4 < arg5 ? arg4 : arg5;
			@Pc(66) int local66 = arg4 >> 1;
			@Pc(70) int local70 = arg5 >> 1;
			@Pc(72) float[] local72 = arg3;
			@Pc(79) float[] local79 = new float[local48 * local66 * local70];
			while (true) {
				OpenGL.glTexImage2Df(3553, local50, 34842, arg4, arg5, 0, 6408, 5126, local72, 0);
				if (local62 <= 1) {
					return;
				}
				@Pc(99) int local99 = arg4 * local48;
				for (@Pc(101) int local101 = 0; local101 < local48; local101++) {
					@Pc(107) int local107 = local101;
					@Pc(109) int local109 = local101;
					@Pc(113) int local113 = local101 + local99;
					for (@Pc(115) int local115 = 0; local115 < local70; local115++) {
						for (@Pc(119) int local119 = 0; local119 < local66; local119++) {
							@Pc(125) float local125 = local72[local109];
							local109 += local48;
							@Pc(135) float local135 = local125 + local72[local109];
							local109 += local48;
							@Pc(145) float local145 = local135 + local72[local113];
							local113 += local48;
							@Pc(155) float local155 = local145 + local72[local113];
							local113 += local48;
							local79[local107] = local155 * 0.25F;
							local107 += local48;
						}
						local113 += local99;
						local109 += local99;
					}
				}
				@Pc(201) float[] local201 = local79;
				local79 = local72;
				arg4 = local66;
				local72 = local201;
				arg5 = local70;
				local66 >>= 0x1;
				local62 >>= 0x1;
				local50++;
				local70 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!nt;IIILclient!ha;)V")
	public static void method5714(@OriginalArg(0) int arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class22 arg5) {
		for (@Pc(3) int local3 = 7; local3 >= 0; local3--) {
			for (@Pc(9) int local9 = 127; local9 >= 0; local9--) {
				@Pc(27) int local27 = local9 & 0x7F | (local3 & 0x7) << 7 | (arg4 & 0x3F) << 10;
				Static633.method8323(true, false);
				@Pc(35) int local35 = Static537.anIntArray601[local27];
				Static134.method2374(false, true);
				arg5.aa((arg1.anInt7015 * local9 >> 7) + arg0, arg3 - -(arg1.anInt7045 * (7 - local3) >> 3), (arg1.anInt7015 >> 7) + 1, (arg1.anInt7045 >> 3) + 1, local35, 0);
			}
		}
		if (arg2 > -63) {
			method5714(19, (Class270) null, -10, 9, -98, (Class22) null);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ha;Lclient!ik;B)V")
	public static void method5716(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class182 arg1) {
		@Pc(10) Class361[] local10 = Static735.method8277(arg1, Static212.anInt3495);
		Static661.aClass178Array16 = new Class178[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static661.aClass178Array16[local16] = arg0.method9363(local10[local16], true);
		}
		local10 = Static735.method8277(arg1, Static96.anInt10761);
		Static410.aClass178Array5 = new Class178[local10.length];
		for (@Pc(45) int local45 = 0; local45 < local10.length; local45++) {
			Static410.aClass178Array5[local45] = arg0.method9363(local10[local45], true);
		}
		local10 = Static735.method8277(arg1, Static486.anInt7654);
		Static128.aClass178Array2 = new Class178[local10.length];
		for (@Pc(80) int local80 = 0; local80 < local10.length; local80++) {
			Static128.aClass178Array2[local80] = arg0.method9363(local10[local80], true);
		}
		local10 = Static735.method8277(arg1, Static336.anInt5407);
		Static619.aClass178Array14 = new Class178[local10.length];
		for (@Pc(115) int local115 = 0; local115 < local10.length; local115++) {
			Static619.aClass178Array14[local115] = arg0.method9363(local10[local115], true);
		}
		local10 = Static735.method8277(arg1, Static117.anInt2409);
		Static708.aClass178Array18 = new Class178[local10.length];
		for (@Pc(150) int local150 = 0; local150 < local10.length; local150++) {
			Static708.aClass178Array18[local150] = arg0.method9363(local10[local150], true);
		}
		local10 = Static735.method8277(arg1, Static189.anInt3241);
		Static203.aClass178Array6 = new Class178[local10.length];
		for (@Pc(181) int local181 = 0; local181 < local10.length; local181++) {
			Static203.aClass178Array6[local181] = arg0.method9363(local10[local181], true);
		}
		local10 = Static735.method8277(arg1, Static413.anInt6380);
		Static656.aClass178Array15 = new Class178[local10.length];
		for (@Pc(212) int local212 = 0; local212 < local10.length; local212++) {
			Static656.aClass178Array15[local212] = arg0.method9363(local10[local212], true);
		}
		local10 = Static735.method8277(arg1, Static642.anInt9924);
		Static397.aClass178Array12 = new Class178[local10.length];
		for (@Pc(247) int local247 = 0; local247 < local10.length; local247++) {
			Static397.aClass178Array12[local247] = arg0.method9363(local10[local247], true);
		}
		local10 = Static735.method8277(arg1, Static533.anInt8302);
		Static419.aClass178Array17 = new Class178[local10.length];
		for (@Pc(282) int local282 = 0; local282 < local10.length; local282++) {
			Static419.aClass178Array17[local282] = arg0.method9363(local10[local282], true);
		}
		local10 = Static735.method8277(arg1, Static217.anInt3585);
		Static3.aClass178Array1 = new Class178[local10.length];
		for (@Pc(317) int local317 = 0; local317 < local10.length; local317++) {
			Static3.aClass178Array1[local317] = arg0.method9363(local10[local317], true);
		}
		local10 = Static735.method8277(arg1, Static39.anInt1223);
		Static212.aClass178Array8 = new Class178[local10.length];
		for (@Pc(356) int local356 = 0; local356 < local10.length; local356++) {
			Static212.aClass178Array8[local356] = arg0.method9363(local10[local356], true);
		}
		Static166.aClass178_3 = arg0.method9363(Static735.method8269(arg1, Static45.anInt1287, 0), true);
		Static693.aClass178_30 = arg0.method9363(Static735.method8269(arg1, Static137.anInt2610, 0), true);
		local10 = Static735.method8277(arg1, Static354.anInt5610);
		Static207.aClass178Array7 = new Class178[local10.length];
		for (@Pc(407) int local407 = 0; local407 < local10.length; local407++) {
			Static207.aClass178Array7[local407] = arg0.method9363(local10[local407], true);
		}
	}
}
