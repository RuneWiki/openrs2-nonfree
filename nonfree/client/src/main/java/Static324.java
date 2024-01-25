import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
	public static int anInt7485;

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
	public static int anInt7486;

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "Z")
	public static boolean aBoolean522 = false;

	@OriginalMember(owner = "client!mv", name = "n", descriptor = "[I")
	public static final int[] anIntArray540 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIBIII)V")
	public static void method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg4;
		@Pc(20) int local20 = arg1 - arg4;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg1 * arg1;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg1 << 1;
		@Pc(65) int local65 = local20 << 1;
		@Pc(73) int local73 = local40 + local24 * (1 - local56);
		@Pc(81) int local81 = local28 - (local56 - 1) * local44;
		@Pc(90) int local90 = (1 - local65) * local32 + local48;
		@Pc(99) int local99 = local36 - local52 * (local65 - 1);
		@Pc(103) int local103 = local24 << 2;
		@Pc(107) int local107 = local28 << 2;
		@Pc(111) int local111 = local32 << 2;
		@Pc(115) int local115 = local36 << 2;
		@Pc(119) int local119 = local40 * 3;
		@Pc(125) int local125 = local44 * (local56 - 3);
		@Pc(129) int local129 = local48 * 3;
		@Pc(135) int local135 = (local65 - 3) * local52;
		@Pc(137) int local137 = local107;
		@Pc(143) int local143 = (arg1 - 1) * local103;
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = (local20 - 1) * local111;
		@Pc(174) int local174;
		@Pc(183) int local183;
		@Pc(192) int local192;
		@Pc(201) int local201;
		if (arg5 >= Static583.anInt9478 && arg5 <= Static415.anInt9494) {
			@Pc(165) int[] local165 = Static454.anIntArrayArray71[arg5];
			local174 = Static201.method3634(arg2 - arg3, Static461.anInt7899, Static13.anInt7634);
			local183 = Static201.method3634(arg2 + arg3, Static461.anInt7899, Static13.anInt7634);
			local192 = Static201.method3634(arg2 - local16, Static461.anInt7899, Static13.anInt7634);
			local201 = Static201.method3634(arg2 + local16, Static461.anInt7899, Static13.anInt7634);
			Static208.method3687(local174, arg6, local165, local192);
			Static208.method3687(local192, arg0, local165, local201);
			Static208.method3687(local201, arg6, local165, local183);
		}
		while (local9 > 0) {
			@Pc(232) boolean local232 = local20 >= local9;
			if (local232) {
				if (local90 < 0) {
					while (local90 < 0) {
						local90 += local129;
						local99 += local145;
						local129 += local115;
						local11++;
						local145 += local115;
					}
				}
				if (local99 < 0) {
					local99 += local145;
					local90 += local129;
					local11++;
					local129 += local115;
					local145 += local115;
				}
				local90 += -local151;
				local99 += -local135;
				local135 -= local111;
				local151 -= local111;
			}
			if (local73 < 0) {
				while (local73 < 0) {
					local73 += local119;
					local81 += local137;
					local119 += local107;
					local137 += local107;
					local7++;
				}
			}
			if (local81 < 0) {
				local73 += local119;
				local81 += local137;
				local119 += local107;
				local137 += local107;
				local7++;
			}
			local81 += -local125;
			local73 += -local143;
			local125 -= local103;
			local143 -= local103;
			local9--;
			local174 = arg5 - local9;
			local183 = local9 + arg5;
			if (local183 >= Static583.anInt9478 && Static415.anInt9494 >= local174) {
				local192 = Static201.method3634(arg2 + local7, Static461.anInt7899, Static13.anInt7634);
				local201 = Static201.method3634(arg2 - local7, Static461.anInt7899, Static13.anInt7634);
				if (local232) {
					@Pc(436) int local436 = Static201.method3634(arg2 + local11, Static461.anInt7899, Static13.anInt7634);
					@Pc(444) int local444 = Static201.method3634(arg2 - local11, Static461.anInt7899, Static13.anInt7634);
					@Pc(455) int[] local455;
					if (local174 >= Static583.anInt9478) {
						local455 = Static454.anIntArrayArray71[local174];
						Static208.method3687(local201, arg6, local455, local444);
						Static208.method3687(local444, arg0, local455, local436);
						Static208.method3687(local436, arg6, local455, local192);
					}
					if (local183 <= Static415.anInt9494) {
						local455 = Static454.anIntArrayArray71[local183];
						Static208.method3687(local201, arg6, local455, local444);
						Static208.method3687(local444, arg0, local455, local436);
						Static208.method3687(local436, arg6, local455, local192);
					}
				} else {
					if (local174 >= Static583.anInt9478) {
						Static208.method3687(local201, arg6, Static454.anIntArrayArray71[local174], local192);
					}
					if (local183 <= Static415.anInt9494) {
						Static208.method3687(local201, arg6, Static454.anIntArrayArray71[local183], local192);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IBI)I")
	public static int method6172(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(47) int local47 = (arg0 & 0x7F) * 96 >> 7;
			if (local47 < 2) {
				local47 = 2;
			} else if (local47 > 126) {
				local47 = 126;
			}
			return (arg0 & 0xFF80) + local47;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!fca;Lclient!ki;Lclient!oa;)V")
	public static void method6174(@OriginalArg(1) Class6_Sub17 arg0, @OriginalArg(2) Class176 arg1, @OriginalArg(3) Class14 arg2) {
		@Pc(10) Class58 local10 = arg1.method4384(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.QA();
		if (local16 < local10.b()) {
			local16 = local10.b();
		}
		@Pc(32) int local32 = arg0.anInt2969;
		@Pc(35) int local35 = arg0.anInt2964;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg1.aString38 != null) {
			local37 = Static435.aClass327_10.method7191(null, arg1.aString38, null, Static192.aStringArray9);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static192.aStringArray9[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static413.aClass168_8.method4254(local61);
				if (local39 < local82) {
					local39 = local82;
				}
			}
			local41 = local37 * Static413.aClass168_8.method4250() + Static413.aClass168_8.method4253() / 2;
		}
		local55 = local16 / 2 + arg0.anInt2969;
		if (local16 + Static217.anInt3836 > local32) {
			local32 = Static217.anInt3836;
			local55 = local39 / 2 + local16 / 2 + Static217.anInt3836 + 5 + 10;
		} else if (local32 > Static217.anInt3837 - local16) {
			local55 = Static217.anInt3837 - local39 / 2 - local16 / 2 - 10 - 5;
			local32 = Static217.anInt3837 - local16;
		}
		@Pc(165) int local165 = arg0.anInt2964;
		if (local35 < local16 + Static217.anInt3834) {
			local35 = Static217.anInt3834;
			local165 = Static217.anInt3834 + local16 / 2 + 10;
		} else if (Static217.anInt3838 - local16 < local35) {
			local35 = Static217.anInt3838 - local16;
			local165 = Static217.anInt3838 - local16 / 2 - local41 - 10;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg0.anInt2969), (double) (local35 - arg0.anInt2964)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7665((float) local32 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local35, 4096, local82);
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		if (arg1.aString38 != null) {
			local255 = local55 - local39 / 2 - 5;
			local257 = local165;
			local259 = local39 + local255 + 10;
			local261 = local165 + local37 * Static413.aClass168_8.method4250() + 3;
			if (arg1.anInt5083 != 0) {
				arg2.method6859(local259 - local255, local165, local255, arg1.anInt5083, local261 - local165);
			}
			if (arg1.anInt5072 != 0) {
				arg2.method6904(local261 - local165, arg1.anInt5072, local255, local165, local259 - local255);
			}
			for (@Pc(332) int local332 = 0; local332 < local37; local332++) {
				@Pc(338) String local338 = Static192.aStringArray9[local332];
				if (local332 < local37 - 1) {
					local338 = local338.substring(0, local338.length() - 4);
				}
				Static413.aClass168_8.method4251(arg2, local338, local55, local165, arg1.anInt5074);
				local165 += Static413.aClass168_8.method4250();
			}
		}
		if (arg1.anInt5058 == -1 && arg1.aString38 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(393) Class6_Sub30 local393 = new Class6_Sub30(arg0);
		local393.anInt5421 = local32 - local16;
		local393.anInt5417 = local16 + local35;
		local393.anInt5419 = local16 + local32;
		local393.anInt5412 = local35 - local16;
		local393.anInt5416 = local261;
		local393.anInt5422 = local255;
		local393.anInt5415 = local259;
		local393.anInt5420 = local257;
		Static243.aClass361_38.method7833(local393);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)V")
	public static void method6176(@OriginalArg(0) int arg0) {
		@Pc(16) Class6_Sub2_Sub7 local16 = Static401.method5861(arg0, 11);
		local16.method2580();
	}
}
