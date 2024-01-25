import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
	public static int anInt3892 = -1;

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_41 = new Class46(42, 3);

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIILclient!gba;Lclient!bfa;)V")
	public static void method3506(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub22_Sub1 arg2, @OriginalArg(4) Class4_Sub2_Sub1_Sub1_Sub1 arg3) {
		if ((arg1 & 0x4000) != 0) {
			arg3.anInt1209 = arg2.method5962();
			arg3.anInt1217 = arg2.method5958();
			arg3.anInt1270 = arg2.method5963();
			arg3.anInt1194 = arg2.method5963();
			arg3.anInt1237 = arg2.method5968() + Static631.anInt10493;
			arg3.anInt1249 = arg2.method5917() + Static631.anInt10493;
			arg3.anInt1254 = arg2.method5967();
			if (arg3.aBoolean46) {
				arg3.anInt1270 += arg3.anInt904;
				arg3.anInt1209 += arg3.anInt904;
				arg3.anInt1217 += arg3.anInt909;
				arg3.anInt1280 = 0;
				arg3.anInt1194 += arg3.anInt909;
			} else {
				arg3.anInt1194 += arg3.anIntArray95[0];
				arg3.anInt1270 += arg3.anIntArray94[0];
				arg3.anInt1280 = 1;
				arg3.anInt1217 += arg3.anIntArray95[0];
				arg3.anInt1209 += arg3.anIntArray94[0];
			}
			arg3.anInt1281 = 0;
		}
		@Pc(134) byte local134 = -1;
		@Pc(145) int local145;
		@Pc(148) int[] local148;
		@Pc(151) int[] local151;
		@Pc(153) int local153;
		@Pc(159) int local159;
		@Pc(172) int local172;
		if ((arg1 & 0x10000) != 0) {
			local145 = arg2.method5903();
			local148 = new int[local145];
			local151 = new int[local145];
			for (local153 = 0; local153 < local145; local153++) {
				local159 = arg2.method5940();
				if ((local159 & 0xC000) == 49152) {
					local172 = arg2.method5951();
					local148[local153] = local159 << 16 | local172;
				} else {
					local148[local153] = local159;
				}
				local151[local153] = arg2.method5917();
			}
			arg3.method1020(local148, local151);
		}
		if ((arg1 & 0x40) != 0) {
			Static415.aByteArray72[arg0] = arg2.method5958();
		}
		if ((arg1 & 0x8000) != 0) {
			arg3.aBoolean48 = arg2.method5967() == 1;
		}
		if ((arg1 & 0x100) != 0) {
			local145 = arg2.method5968();
			arg3.anInt1219 = arg2.method5924();
			arg3.anInt1203 = arg2.method5967();
			arg3.aBoolean72 = (local145 & 0x8000) != 0;
			arg3.anInt1193 = local145 & 0x7FFF;
			arg3.anInt1218 = arg3.anInt1193 + Static631.anInt10493 + arg3.anInt1219;
		}
		if ((arg1 & 0x200) != 0) {
			local134 = arg2.method5962();
		}
		@Pc(304) int local304;
		@Pc(308) int local308;
		if ((arg1 & 0x80) != 0) {
			local145 = arg2.method5968();
			if (local145 == 65535) {
				local145 = -1;
			}
			local304 = arg2.method5916();
			local308 = arg2.method5967();
			local153 = local308 & 0x7;
			local159 = local308 >> 3 & 0xF;
			if (local159 == 15) {
				local159 = -1;
			}
			arg3.method1032(local304, local159, local153, local145, false);
		}
		if ((arg1 & 0x1000) != 0) {
			local145 = arg2.method5924();
			local148 = new int[local145];
			local151 = new int[local145];
			@Pc(351) int[] local351 = new int[local145];
			for (local159 = 0; local159 < local145; local159++) {
				local172 = arg2.method5917();
				if (local172 == 65535) {
					local172 = -1;
				}
				local148[local159] = local172;
				local151[local159] = arg2.method5967();
				local351[local159] = arg2.method5940();
			}
			Static194.method3033(arg3, local351, local151, local148);
		}
		if ((arg1 & 0x4) != 0) {
			arg3.anInt917 = arg2.method5917();
			if (arg3.anInt1280 == 0) {
				arg3.method1036(arg3.anInt917);
				arg3.anInt917 = -1;
			}
		}
		if ((arg1 & 0x800) != 0) {
			arg3.aString20 = arg2.method5937();
			if (arg3.aString20.charAt(0) == '~') {
				arg3.aString20 = arg3.aString20.substring(1);
				Static412.method6340(arg3.aString16, 0, arg3.aString20, arg3.method746(), arg3.method743(), 2);
			} else if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 == arg3) {
				Static412.method6340(arg3.aString16, 0, arg3.aString20, arg3.method746(), arg3.method743(), 2);
			}
			arg3.anInt1253 = 150;
			arg3.anInt1235 = 0;
			arg3.anInt1238 = 0;
		}
		if ((arg1 & 0x2) != 0) {
			@Pc(503) int[] local503 = new int[4];
			for (local304 = 0; local304 < 4; local304++) {
				local503[local304] = arg2.method5940();
				if (local503[local304] == 65535) {
					local503[local304] = -1;
				}
			}
			local308 = arg2.method5966();
			Static417.method6374(arg3, local308, local503);
		}
		if ((arg1 & 0x40000) != 0) {
			arg3.aByte37 = arg2.method5962();
			arg3.aByte39 = arg2.method5909();
			arg3.aByte40 = arg2.method5958();
			arg3.aByte41 = (byte) arg2.method5967();
			arg3.anInt1236 = Static631.anInt10493 + arg2.method5917();
			arg3.anInt1234 = Static631.anInt10493 + arg2.method5940();
		}
		if ((arg1 & 0x10) != 0) {
			local145 = arg2.method5903();
			if (local145 > 0) {
				for (local304 = 0; local304 < local145; local304++) {
					local153 = -1;
					local159 = -1;
					local172 = -1;
					local308 = arg2.method5947();
					if (local308 == 32767) {
						local308 = arg2.method5947();
						local159 = arg2.method5947();
						local153 = arg2.method5947();
						local172 = arg2.method5947();
					} else if (local308 == 32766) {
						local308 = -1;
					} else {
						local159 = arg2.method5947();
					}
					@Pc(647) int local647 = arg2.method5947();
					@Pc(653) int local653 = arg2.method5967();
					arg3.method1033(local308, Static631.anInt10493, local159, local153, local647, local653, local172);
				}
			}
		}
		if ((arg1 & 0x2000) != 0) {
			local145 = arg2.method5968();
			if (local145 == 65535) {
				local145 = -1;
			}
			local304 = arg2.method5913();
			local308 = arg2.method5967();
			local153 = local308 & 0x7;
			local159 = local308 >> 3 & 0xF;
			if (local159 == 15) {
				local159 = -1;
			}
			arg3.method1032(local304, local159, local153, local145, true);
		}
		if ((arg1 & 0x20) != 0) {
			local145 = arg2.method5966();
			@Pc(726) byte[] local726 = new byte[local145];
			@Pc(731) Class5_Sub22 local731 = new Class5_Sub22(local726);
			arg2.method5950(local145, local726);
			Static14.aClass5_Sub22Array1[arg0] = local731;
			arg3.method744(local731);
		}
		if ((arg1 & 0x8) != 0) {
			local145 = arg2.method5940();
			if (local145 == 65535) {
				local145 = -1;
			}
			arg3.anInt1272 = local145;
		}
		if (!arg3.aBoolean46) {
			return;
		}
		if (local134 == 127) {
			arg3.method742(arg3.anInt904, arg3.anInt909);
			return;
		}
		@Pc(781) byte local781;
		if (local134 == -1) {
			local781 = Static415.aByteArray72[arg0];
		} else {
			local781 = local134;
		}
		Static32.method413(local781, arg3);
		arg3.method737(arg3.anInt909, arg3.anInt904, local781);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
	public static void method3508() {
		for (@Pc(3) int local3 = 0; local3 < Static44.anInt945; local3++) {
			@Pc(9) Class166 local9 = Static13.aClass166Array1[local3];
			if (local9.aByte69 == 3) {
				if (local9.aClass5_Sub1_Sub4_4 == null) {
					local9.anInt4328 = Integer.MIN_VALUE;
				} else {
					Static26.aClass5_Sub1_Sub2_1.method5052(local9.aClass5_Sub1_Sub4_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)Z")
	public static boolean method3509() {
		return Static82.method1382("jaclib") ? Static82.method1382("hw3d") : false;
	}
}
