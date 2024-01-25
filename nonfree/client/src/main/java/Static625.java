import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[6][];

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "Lclient!st;")
	public static final Class314 aClass314_145 = new Class314(6, -1);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method8479(@OriginalArg(1) Class82 arg0) {
		Static133.aClass249Array30 = new Class249[Static65.anIntArray96.length];
		for (@Pc(11) int local11 = 0; local11 < Static65.anIntArray96.length; local11++) {
			@Pc(17) int local17 = Static65.anIntArray96[local11];
			@Pc(22) Class93 local22 = Static382.method6021(local17, Static258.aClass343_130);
			@Pc(30) Class63 local30 = arg0.method6127(local22, Static656.method6341(Static347.aClass343_168, local17));
			Static133.aClass249Array30[local11] = new Class249(local30, local22);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIILclient!cea;Lclient!mfa;)V")
	public static void method8480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9_Sub2_Sub1_Sub2_Sub1 arg2, @OriginalArg(4) Class3_Sub9_Sub2 arg3) {
		@Pc(16) int local16;
		if ((arg0 & 0x2) != 0) {
			local16 = arg3.method5634();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg2.anInt10185 = local16;
		}
		@Pc(28) byte local28 = -1;
		if ((arg0 & 0x4) != 0) {
			local16 = arg3.method5594();
			@Pc(39) byte[] local39 = new byte[local16];
			@Pc(44) Class3_Sub9 local44 = new Class3_Sub9(local39);
			arg3.method5630(local16, local39);
			Static583.aClass3_Sub9Array20[arg1] = local44;
			arg2.method1158(local44);
		}
		if ((arg0 & 0x40000) != 0) {
			arg2.aByte132 = arg3.method5631();
			arg2.aByte130 = arg3.method5632();
			arg2.aByte133 = arg3.method5619();
			arg2.aByte131 = (byte) arg3.method5594();
			arg2.anInt10207 = Static304.anInt8391 + arg3.method5634();
			arg2.anInt10184 = Static304.anInt8391 + arg3.method5583();
		}
		if ((arg0 & 0x10) != 0) {
			Static87.aByteArray15[arg1] = arg3.method5631();
		}
		@Pc(129) int local129;
		@Pc(131) int local131;
		@Pc(133) int local133;
		@Pc(175) int local175;
		@Pc(125) int local125;
		@Pc(137) int local137;
		if ((arg0 & 0x20) != 0) {
			local16 = arg3.method5633();
			if (local16 > 0) {
				for (local125 = 0; local125 < local16; local125++) {
					local129 = -1;
					local131 = -1;
					local133 = -1;
					local137 = arg3.method5606();
					if (local137 == 32767) {
						local137 = arg3.method5606();
						local131 = arg3.method5606();
						local129 = arg3.method5606();
						local133 = arg3.method5606();
					} else if (local137 == 32766) {
						local137 = -1;
					} else {
						local131 = arg3.method5606();
					}
					local175 = arg3.method5606();
					@Pc(179) int local179 = arg3.method5594();
					arg2.method8632(local129, Static304.anInt8391, local137, local131, local179, local175, local133);
				}
			}
		}
		@Pc(211) int[] local211;
		@Pc(214) int[] local214;
		@Pc(217) int[] local217;
		if ((arg0 & 0x4000) != 0) {
			local16 = arg3.method5594();
			local211 = new int[local16];
			local214 = new int[local16];
			local217 = new int[local16];
			for (local131 = 0; local131 < local16; local131++) {
				local133 = arg3.method5634();
				if (local133 == 65535) {
					local133 = -1;
				}
				local211[local131] = local133;
				local214[local131] = arg3.method5626();
				local217[local131] = arg3.method5610();
			}
			Static424.method6727(local217, local211, arg2, local214);
		}
		if ((arg0 & 0x8000) != 0) {
			local125 = arg3.method5610();
			local137 = arg3.method5585();
			if (local125 == 65535) {
				local125 = -1;
			}
			local129 = arg3.method5594();
			local131 = local129 & 0x7;
			local133 = local129 >> 3 & 0xF;
			if (local133 == 15) {
				local133 = -1;
			}
			arg2.method8626(local131, local137, local133, local125, 1);
		}
		if ((arg0 & 0x1) != 0) {
			local125 = arg3.method5628();
			if (local125 == 65535) {
				local125 = -1;
			}
			local137 = arg3.method5597();
			local129 = arg3.method5633();
			local131 = local129 & 0x7;
			local133 = local129 >> 3 & 0xF;
			if (local133 == 15) {
				local133 = -1;
			}
			arg2.method8626(local131, local137, local133, local125, 0);
		}
		if ((arg0 & 0x10000) != 0) {
			local125 = arg3.method5626();
			local214 = new int[local125];
			local217 = new int[local125];
			for (local131 = 0; local131 < local125; local131++) {
				local133 = arg3.method5610();
				if ((local133 & 0xC000) == 49152) {
					local175 = arg3.method5628();
					local214[local131] = local175 | local133 << 16;
				} else {
					local214[local131] = local133;
				}
				local217[local131] = arg3.method5610();
			}
			arg2.method8625(local214, local217);
		}
		if ((arg0 & 0x400) != 0) {
			local28 = arg3.method5619();
		}
		if ((arg0 & 0x40) != 0) {
			arg2.anInt1295 = arg3.method5583();
			if (arg2.anInt10236 == 0) {
				arg2.method8635(arg2.anInt1295);
				arg2.anInt1295 = -1;
			}
		}
		if ((arg0 & 0x800) != 0) {
			arg2.aBoolean80 = arg3.method5626() == 1;
		}
		if ((arg0 & 0x2000) != 0) {
			arg2.aString107 = arg3.method5607();
			if (arg2.aString107.charAt(0) == '~') {
				arg2.aString107 = arg2.aString107.substring(1);
				Static329.method5394(arg2.aString107, arg2.method1159(), arg2.aString6, arg2.method1160(), 2, 0);
			} else if (arg2 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1) {
				Static329.method5394(arg2.aString107, arg2.method1159(), arg2.aString6, arg2.method1160(), 2, 0);
			}
			arg2.anInt10170 = 0;
			arg2.anInt10174 = 0;
			arg2.anInt10187 = 150;
		}
		if ((arg0 & 0x80) != 0) {
			local211 = new int[4];
			for (local137 = 0; local137 < 4; local137++) {
				local211[local137] = arg3.method5628();
				if (local211[local137] == 65535) {
					local211[local137] = -1;
				}
			}
			local129 = arg3.method5633();
			Static49.method919(arg2, local129, local211);
		}
		if ((arg0 & 0x200) != 0) {
			local125 = arg3.method5634();
			arg2.anInt10212 = arg3.method5633();
			arg2.anInt10213 = arg3.method5626();
			arg2.aBoolean774 = (local125 & 0x8000) != 0;
			arg2.anInt10201 = local125 & 0x7FFF;
			arg2.anInt10169 = arg2.anInt10201 + Static304.anInt8391 + arg2.anInt10212;
		}
		if ((arg0 & 0x20000) != 0) {
			local125 = arg3.method5634();
			if (local125 == 65535) {
				local125 = -1;
			}
			local137 = arg3.method5585();
			local129 = arg3.method5626();
			local131 = local129 & 0x7;
			local133 = local129 >> 3 & 0xF;
			if (local133 == 15) {
				local133 = -1;
			}
			arg2.method8626(local131, local137, local133, local125, 2);
		}
		if ((arg0 & 0x100) != 0) {
			arg2.anInt10190 = arg3.method5619();
			arg2.anInt10199 = arg3.method5632();
			arg2.anInt10222 = arg3.method5631();
			arg2.anInt10183 = arg3.method5619();
			arg2.anInt10171 = arg3.method5583() + Static304.anInt8391;
			arg2.anInt10221 = arg3.method5583() + Static304.anInt8391;
			arg2.anInt10168 = arg3.method5626();
			if (arg2.aBoolean81) {
				arg2.anInt10199 += arg2.anInt1290;
				arg2.anInt10222 += arg2.anInt1321;
				arg2.anInt10236 = 0;
				arg2.anInt10183 += arg2.anInt1290;
				arg2.anInt10190 += arg2.anInt1321;
			} else {
				arg2.anInt10190 += arg2.anIntArray675[0];
				arg2.anInt10183 += arg2.anIntArray676[0];
				arg2.anInt10222 += arg2.anIntArray675[0];
				arg2.anInt10236 = 1;
				arg2.anInt10199 += arg2.anIntArray676[0];
			}
			arg2.anInt10234 = 0;
		}
		if (!arg2.aBoolean81) {
			return;
		}
		if (local28 == 127) {
			arg2.method1153(arg2.anInt1321, arg2.anInt1290);
			return;
		}
		@Pc(827) byte local827;
		if (local28 == -1) {
			local827 = Static87.aByteArray15[arg1];
		} else {
			local827 = local28;
		}
		Static322.method5335(arg2, local827);
		arg2.method1155(arg2.anInt1321, local827, arg2.anInt1290);
	}
}
