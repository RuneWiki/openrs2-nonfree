import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "F")
	public static float aFloat149;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!kka;BIILclient!fl;)V")
	public static void method4975(@OriginalArg(0) Class3_Sub17_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class23_Sub2_Sub1_Sub2_Sub1 arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(39) int local39;
		if ((arg2 & 0x2) != 0) {
			local16 = arg0.method4884();
			local20 = arg0.method4891();
			if (local16 == 65535) {
				local16 = -1;
			}
			local29 = arg0.method4874();
			local33 = local29 & 0x7;
			local39 = local29 >> 3 & 0xF;
			if (local39 == 15) {
				local39 = -1;
			}
			arg3.method8624(0, local20, local16, local33, local39);
		}
		@Pc(56) byte local56 = -1;
		if ((arg2 & 0x20000) != 0) {
			arg3.aBoolean261 = arg0.method4844() == 1;
		}
		if ((arg2 & 0x8) != 0) {
			@Pc(82) int[] local82 = new int[4];
			for (local20 = 0; local20 < 4; local20++) {
				local82[local20] = arg0.method4884();
				if (local82[local20] == 65535) {
					local82[local20] = -1;
				}
			}
			local29 = arg0.method4850();
			Static547.method7558(arg3, local29, local82);
		}
		if ((arg2 & 0x1000) != 0) {
			local16 = arg0.method4858();
			arg3.anInt10157 = arg0.method4850();
			arg3.anInt10144 = arg0.method4888();
			arg3.anInt10142 = local16 & 0x7FFF;
			arg3.aBoolean746 = (local16 & 0x8000) != 0;
			arg3.anInt10173 = arg3.anInt10157 + arg3.anInt10142 + Static621.anInt9665;
		}
		if ((arg2 & 0x80000) != 0) {
			arg3.aByte148 = arg0.method4861();
			arg3.aByte145 = arg0.method4866();
			arg3.aByte147 = arg0.method4880();
			arg3.aByte146 = (byte) arg0.method4888();
			arg3.anInt10176 = Static621.anInt9665 + arg0.method4858();
			arg3.anInt10152 = Static621.anInt9665 + arg0.method4872();
		}
		if ((arg2 & 0x8000) != 0) {
			arg3.aString131 = arg0.method4847();
			if (arg3.aString131.charAt(0) == '~') {
				arg3.aString131 = arg3.aString131.substring(1);
				Static310.method4784(2, arg3.aString131, arg3.method2903(), arg3.method2902(), 0, arg3.aString33);
			} else if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 == arg3) {
				Static310.method4784(2, arg3.aString131, arg3.method2903(), arg3.method2902(), 0, arg3.aString33);
			}
			arg3.anInt10160 = 0;
			arg3.anInt10154 = 0;
			arg3.anInt10132 = 150;
		}
		if ((arg2 & 0x10000) != 0) {
			local16 = arg0.method4884();
			local20 = arg0.method4867();
			if (local16 == 65535) {
				local16 = -1;
			}
			local29 = arg0.method4844();
			local33 = local29 & 0x7;
			local39 = local29 >> 3 & 0xF;
			if (local39 == 15) {
				local39 = -1;
			}
			arg3.method8624(2, local20, local16, local33, local39);
		}
		if ((arg2 & 0x4) != 0) {
			Static460.aByteArray73[arg1] = arg0.method4880();
		}
		@Pc(363) int local363;
		@Pc(349) int[] local349;
		@Pc(352) int[] local352;
		if ((arg2 & 0x100) != 0) {
			local16 = arg0.method4888();
			local349 = new int[local16];
			local352 = new int[local16];
			@Pc(355) int[] local355 = new int[local16];
			for (local39 = 0; local39 < local16; local39++) {
				local363 = arg0.method4858();
				if (local363 == 65535) {
					local363 = -1;
				}
				local349[local39] = local363;
				local352[local39] = arg0.method4850();
				local355[local39] = arg0.method4858();
			}
			Static577.method7774(local352, local349, local355, arg3);
		}
		if ((arg2 & 0x40000) != 0) {
			local16 = arg0.method4850();
			local349 = new int[local16];
			local352 = new int[local16];
			for (local33 = 0; local33 < local16; local33++) {
				local39 = arg0.method4858();
				if ((local39 & 0xC000) == 49152) {
					local363 = arg0.method4884();
					local349[local33] = local39 << 16 | local363;
				} else {
					local349[local33] = local39;
				}
				local352[local33] = arg0.method4872();
			}
			arg3.method8619(local349, local352);
		}
		if ((arg2 & 0x200) != 0) {
			local16 = arg0.method4884();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = arg0.method4891();
			local29 = arg0.method4844();
			local33 = local29 & 0x7;
			local39 = local29 >> 3 & 0xF;
			if (local39 == 15) {
				local39 = -1;
			}
			arg3.method8624(1, local20, local16, local33, local39);
		}
		if ((arg2 & 0x2000) != 0) {
			arg3.anInt10129 = arg0.method4839();
			arg3.anInt10134 = arg0.method4880();
			arg3.anInt10130 = arg0.method4880();
			arg3.anInt10159 = arg0.method4839();
			arg3.anInt10151 = arg0.method4884() + Static621.anInt9665;
			arg3.anInt10162 = arg0.method4879() + Static621.anInt9665;
			arg3.anInt10139 = arg0.method4888();
			arg3.anInt10189 = 0;
			if (arg3.aBoolean257) {
				arg3.anInt10130 += arg3.anInt3281;
				arg3.anInt10129 += arg3.anInt3281;
				arg3.anInt10134 += arg3.anInt3257;
				arg3.anInt10159 += arg3.anInt3257;
				arg3.anInt10190 = 0;
			} else {
				arg3.anInt10130 += arg3.anIntArray659[0];
				arg3.anInt10159 += arg3.anIntArray660[0];
				arg3.anInt10190 = 1;
				arg3.anInt10129 += arg3.anIntArray659[0];
				arg3.anInt10134 += arg3.anIntArray660[0];
			}
		}
		if ((arg2 & 0x800) != 0) {
			local56 = arg0.method4866();
		}
		if ((arg2 & 0x20) != 0) {
			arg3.anInt3262 = arg0.method4879();
			if (arg3.anInt10190 == 0) {
				arg3.method8615(arg3.anInt3262);
				arg3.anInt3262 = -1;
			}
		}
		if ((arg2 & 0x40) != 0) {
			local16 = arg0.method4874();
			@Pc(683) byte[] local683 = new byte[local16];
			@Pc(688) Class3_Sub17 local688 = new Class3_Sub17(local683);
			arg0.method4832(local683, 0, local16);
			Static105.aClass3_Sub17Array1[arg1] = local688;
			arg3.method2913(local688);
		}
		if ((arg2 & 0x10) != 0) {
			local16 = arg0.method4884();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg3.anInt10178 = local16;
		}
		if ((arg2 & 0x400) != 0) {
			arg3.aBoolean262 = arg0.method4850() == 1;
		}
		if ((arg2 & 0x1) != 0) {
			local16 = arg0.method4844();
			if (local16 > 0) {
				for (local20 = 0; local20 < local16; local20++) {
					local33 = -1;
					local39 = -1;
					local29 = arg0.method4841();
					local363 = -1;
					if (local29 == 32767) {
						local29 = arg0.method4841();
						local39 = arg0.method4841();
						local33 = arg0.method4841();
						local363 = arg0.method4841();
					} else if (local29 == 32766) {
						local29 = -1;
					} else {
						local39 = arg0.method4841();
					}
					@Pc(805) int local805 = arg0.method4841();
					@Pc(809) int local809 = arg0.method4888();
					arg3.method8620(local363, local805, local39, local809, local33, Static621.anInt9665, local29);
				}
			}
		}
		if (!arg3.aBoolean257) {
			return;
		}
		if (local56 == 127) {
			arg3.method2905(arg3.anInt3257, arg3.anInt3281);
			return;
		}
		@Pc(842) byte local842;
		if (local56 == -1) {
			local842 = Static460.aByteArray73[arg1];
		} else {
			local842 = local56;
		}
		Static350.method5261(arg3, local842);
		arg3.method2908(arg3.anInt3281, local842, arg3.anInt3257);
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)Lclient!aba;")
	public static Class4 method4976() {
		return Static346.method5220();
	}
}
