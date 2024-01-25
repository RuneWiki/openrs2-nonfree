import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "Lclient!sca;")
	public static final Class314 aClass314_4 = new Class314(0);

	@OriginalMember(owner = "client!pu", name = "kb", descriptor = "Z")
	public static boolean aBoolean587 = false;

	@OriginalMember(owner = "client!pu", name = "Wb", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_116 = new Class218(21, 3);

	@OriginalMember(owner = "client!pu", name = "Xb", descriptor = "Lclient!ip;")
	public static final Class132 aClass132_1 = Static608.method8651();

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method6813(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class89 local9 = Static607.aClass89Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static607.aClass89Array1[local11] = Static607.aClass89Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class89(arg0, arg5, arg1, arg4, arg2, arg7, arg3, arg6);
		} else {
			local9.method2519(arg7, arg0, arg6, arg3, arg4, arg1, arg5, arg2);
		}
		Static223.anInt4198++;
		Static627.anInt10019 = Static629.anInt10041;
		Static607.aClass89Array1[0] = local9;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
	public static void method6818() {
		@Pc(14) Class165 local14 = Static312.aClass165_36;
		synchronized (Static312.aClass165_36) {
			Static312.aClass165_36.method4400();
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!gaa;ILclient!wc;IB)V")
	public static void method6821(@OriginalArg(0) Class3_Sub25_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		if ((arg3 & 0x40) != 0) {
			local16 = arg0.method8593();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg2.anInt10743 = local16;
		}
		@Pc(28) byte local28 = -1;
		if ((arg3 & 0x80) != 0) {
			arg2.anInt10520 = arg0.method8593();
			if (arg2.anInt10812 == 0) {
				arg2.method9308(arg2.anInt10520);
				arg2.anInt10520 = -1;
			}
		}
		if ((arg3 & 0x2000) != 0) {
			local16 = arg0.method8593();
			arg2.anInt10790 = arg0.method8646();
			arg2.anInt10787 = arg0.method8615();
			arg2.aBoolean821 = (local16 & 0x8000) != 0;
			arg2.anInt10785 = local16 & 0x7FFF;
			arg2.anInt10797 = Static588.anInt9467 + arg2.anInt10785 + arg2.anInt10790;
		}
		if ((arg3 & 0x20) != 0) {
			Static185.aByteArray28[arg1] = arg0.method8643();
		}
		@Pc(116) int[] local116;
		@Pc(119) int[] local119;
		@Pc(122) int[] local122;
		@Pc(124) int local124;
		@Pc(130) int local130;
		if ((arg3 & 0x4000) != 0) {
			local16 = arg0.method8632();
			local116 = new int[local16];
			local119 = new int[local16];
			local122 = new int[local16];
			for (local124 = 0; local124 < local16; local124++) {
				local130 = arg0.method8644();
				if (local130 == 65535) {
					local130 = -1;
				}
				local116[local124] = local130;
				local119[local124] = arg0.method8609();
				local122[local124] = arg0.method8593();
			}
			Static205.method3651(local122, local119, local116, arg2);
		}
		if ((arg3 & 0x10000) != 0) {
			arg2.aBoolean793 = arg0.method8609() == 1;
		}
		@Pc(195) int local195;
		@Pc(206) int local206;
		@Pc(210) int local210;
		if ((arg3 & 0x1) != 0) {
			local16 = arg0.method8644();
			local195 = arg0.method8610();
			if (local16 == 65535) {
				local16 = -1;
			}
			local206 = arg0.method8632();
			local210 = local206 & 0x7;
			local124 = local206 >> 3 & 0xF;
			if (local124 == 15) {
				local124 = -1;
			}
			arg2.method9311(local195, 0, local16, local124, local210);
		}
		if ((arg3 & 0x20000) != 0) {
			local195 = arg0.method8593();
			if (local195 == 65535) {
				local195 = -1;
			}
			local206 = arg0.method8605();
			local210 = arg0.method8615();
			local124 = local210 & 0x7;
			local130 = local210 >> 3 & 0xF;
			if (local130 == 15) {
				local130 = -1;
			}
			arg2.method9311(local206, 2, local195, local130, local124);
		}
		if ((arg3 & 0x8000) != 0) {
			local28 = arg0.method8621();
		}
		if ((arg3 & 0x1000) != 0) {
			arg2.aString125 = arg0.method8613();
			if (arg2.aString125.charAt(0) == '~') {
				arg2.aString125 = arg2.aString125.substring(1);
				Static450.method6577(2, arg2.aString124, arg2.method9110(), arg2.aString125, 0, arg2.method9103());
			} else if (arg2 == Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2) {
				Static450.method6577(2, arg2.aString124, arg2.method9110(), arg2.aString125, 0, arg2.method9103());
			}
			arg2.anInt10809 = 150;
			arg2.anInt10754 = 0;
			arg2.anInt10794 = 0;
		}
		if ((arg3 & 0x100) != 0) {
			arg2.anInt10764 = arg0.method8643();
			arg2.anInt10784 = arg0.method8599();
			arg2.anInt10746 = arg0.method8599();
			arg2.anInt10808 = arg0.method8590();
			arg2.anInt10780 = arg0.method8639() + Static588.anInt9467;
			arg2.anInt10755 = arg0.method8592() + Static588.anInt9467;
			arg2.anInt10776 = arg0.method8615();
			if (arg2.aBoolean795) {
				arg2.anInt10746 += arg2.anInt10507;
				arg2.anInt10808 += arg2.anInt10505;
				arg2.anInt10784 += arg2.anInt10505;
				arg2.anInt10812 = 0;
				arg2.anInt10764 += arg2.anInt10507;
			} else {
				arg2.anInt10746 += arg2.anIntArray956[0];
				arg2.anInt10784 += arg2.anIntArray955[0];
				arg2.anInt10812 = 1;
				arg2.anInt10764 += arg2.anIntArray956[0];
				arg2.anInt10808 += arg2.anIntArray955[0];
			}
			arg2.anInt10814 = 0;
		}
		if ((arg3 & 0x400) != 0) {
			local195 = arg0.method8639();
			local206 = arg0.method8610();
			if (local195 == 65535) {
				local195 = -1;
			}
			local210 = arg0.method8615();
			local124 = local210 & 0x7;
			local130 = local210 >> 3 & 0xF;
			if (local130 == 15) {
				local130 = -1;
			}
			arg2.method9311(local206, 1, local195, local130, local124);
		}
		if ((arg3 & 0x80000) != 0) {
			arg2.aByte176 = arg0.method8621();
			arg2.aByte179 = arg0.method8643();
			arg2.aByte178 = arg0.method8621();
			arg2.aByte180 = (byte) arg0.method8615();
			arg2.anInt10805 = Static588.anInt9467 + arg0.method8639();
			arg2.anInt10757 = Static588.anInt9467 + arg0.method8593();
		}
		if ((arg3 & 0x200) != 0) {
			arg2.aBoolean792 = arg0.method8609() == 1;
		}
		if ((arg3 & 0x2) != 0) {
			local116 = new int[4];
			for (local206 = 0; local206 < 4; local206++) {
				local116[local206] = arg0.method8644();
				if (local116[local206] == 65535) {
					local116[local206] = -1;
				}
			}
			local210 = arg0.method8609();
			Static137.method2522(arg2, local116, local210);
		}
		@Pc(652) int local652;
		if ((arg3 & 0x8) != 0) {
			local195 = arg0.method8609();
			if (local195 > 0) {
				for (local206 = 0; local206 < local195; local206++) {
					local124 = -1;
					local130 = -1;
					local652 = -1;
					local210 = arg0.method8604();
					if (local210 == 32767) {
						local210 = arg0.method8604();
						local130 = arg0.method8604();
						local124 = arg0.method8604();
						local652 = arg0.method8604();
					} else if (local210 == 32766) {
						local210 = -1;
					} else {
						local130 = arg0.method8604();
					}
					@Pc(694) int local694 = arg0.method8604();
					@Pc(698) int local698 = arg0.method8646();
					arg2.method9310(local694, Static588.anInt9467, local652, local210, local124, local130, local698);
				}
			}
		}
		if ((arg3 & 0x40000) != 0) {
			local195 = arg0.method8632();
			local119 = new int[local195];
			local122 = new int[local195];
			for (local124 = 0; local124 < local195; local124++) {
				local130 = arg0.method8592();
				if ((local130 & 0xC000) == 49152) {
					local652 = arg0.method8593();
					local119[local124] = local130 << 16 | local652;
				} else {
					local119[local124] = local130;
				}
				local122[local124] = arg0.method8644();
			}
			arg2.method9307(local122, local119);
		}
		if ((arg3 & 0x4) != 0) {
			local195 = arg0.method8646();
			@Pc(796) byte[] local796 = new byte[local195];
			@Pc(801) Class3_Sub25 local801 = new Class3_Sub25(local796);
			arg0.method8623(0, local195, local796);
			Static188.aClass3_Sub25Array1[arg1] = local801;
			arg2.method9104(local801);
		}
		if (!arg2.aBoolean795) {
			return;
		}
		if (local28 == 127) {
			arg2.method9113(arg2.anInt10507, arg2.anInt10505);
			return;
		}
		@Pc(826) byte local826;
		if (local28 == -1) {
			local826 = Static185.aByteArray28[arg1];
		} else {
			local826 = local28;
		}
		Static231.method3913(arg2, local826);
		arg2.method9107(arg2.anInt10507, arg2.anInt10505, local826);
	}
}
