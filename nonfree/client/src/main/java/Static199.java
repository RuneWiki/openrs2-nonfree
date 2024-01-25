import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!hm", name = "W", descriptor = "[I")
	public static int[] anIntArray186;

	@OriginalMember(owner = "client!hm", name = "F", descriptor = "Lclient!mea;")
	public static final Class201 aClass201_9 = new Class201();

	@OriginalMember(owner = "client!hm", name = "X", descriptor = "Lclient!os;")
	public static final Class245 aClass245_11 = new Class245(1);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLclient!pba;Lclient!oo;II)V")
	public static void method3471(@OriginalArg(1) Class25_Sub2_Sub2_Sub5_Sub1 arg0, @OriginalArg(2) Class3_Sub26_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((arg2 & 0x1000) != 0) {
			arg0.aBoolean494 = arg1.method6821() == 1;
		}
		@Pc(26) byte local26 = -1;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(52) int local52;
		if ((arg2 & 0x8000) != 0) {
			local37 = arg1.method6822();
			local41 = arg1.method6816();
			if (local37 == 65535) {
				local37 = -1;
			}
			local52 = arg1.method6777();
			arg0.method6682(local52, local37, true, local41);
		}
		if ((arg2 & 0x2) != 0) {
			arg0.anInt7144 = arg1.method6783();
			if (arg0.anInt8580 == 0) {
				arg0.method6662(arg0.anInt7144);
				arg0.anInt7144 = -1;
			}
		}
		if ((arg2 & 0x1) != 0) {
			local37 = arg1.method6832();
			local41 = arg1.method6814();
			arg0.method6684(local41, Static397.anInt6998, local37);
			arg0.anInt8523 = Static397.anInt6998 + 300;
			arg0.anInt8519 = arg1.method6777();
		}
		if ((arg2 & 0x400) != 0) {
			arg0.aString229 = arg1.method6786();
			if (arg0.aString229.charAt(0) == '~') {
				arg0.aString229 = arg0.aString229.substring(1);
				Static295.method4425(arg0.aString182, arg0.method5676(), arg0.aString229, 0, 2, arg0.method5670());
			} else if (arg0 == Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1) {
				Static295.method4425(arg0.aString182, arg0.method5676(), arg0.aString229, 0, 2, arg0.method5670());
			}
			arg0.anInt8574 = 0;
			arg0.anInt8569 = 150;
			arg0.anInt8509 = 0;
		}
		if ((arg2 & 0x8) != 0) {
			local37 = arg1.method6822();
			if (local37 == 65535) {
				local37 = -1;
			}
			local41 = arg1.method6774();
			local52 = arg1.method6819();
			arg0.method6682(local52, local37, false, local41);
		}
		@Pc(240) int local240;
		@Pc(255) int local255;
		@Pc(227) int[] local227;
		@Pc(230) int[] local230;
		if ((arg2 & 0x10000) != 0) {
			local37 = arg1.method6814();
			local227 = new int[local37];
			local230 = new int[local37];
			for (@Pc(232) int local232 = 0; local232 < local37; local232++) {
				local240 = arg1.method6811();
				if ((local240 & 0xC000) == 49152) {
					local255 = arg1.method6822();
					local227[local232] = local255 | local240 << 16;
				} else {
					local227[local232] = local240;
				}
				local230[local232] = arg1.method6812();
			}
			arg0.method6676(local230, local227);
		}
		if ((arg2 & 0x800) != 0) {
			local37 = arg1.method6819();
			local227 = new int[local37];
			local230 = new int[local37];
			@Pc(298) int[] local298 = new int[local37];
			for (local240 = 0; local240 < local37; local240++) {
				local255 = arg1.method6822();
				if (local255 == 65535) {
					local255 = -1;
				}
				local227[local240] = local255;
				local230[local240] = arg1.method6814();
				local298[local240] = arg1.method6822();
			}
			Static460.method6320(local227, arg0, local230, local298);
		}
		if ((arg2 & 0x20) != 0) {
			Static112.aByteArray56[arg3] = arg1.method6775();
		}
		if ((arg2 & 0x80) != 0) {
			local37 = arg1.method6822();
			if (local37 == 65535) {
				local37 = -1;
			}
			arg0.anInt8536 = local37;
		}
		if ((arg2 & 0x40000) != 0) {
			arg0.aByte120 = arg1.method6825();
			arg0.aByte121 = arg1.method6829();
			arg0.aByte123 = arg1.method6829();
			arg0.aByte122 = (byte) arg1.method6821();
			arg0.anInt8530 = Static397.anInt6998 + arg1.method6811();
			arg0.anInt8510 = Static397.anInt6998 + arg1.method6783();
		}
		if ((arg2 & 0x200) != 0) {
			local26 = arg1.method6825();
		}
		if ((arg2 & 0x20000) != 0) {
			local37 = Static397.anInt6998;
			local41 = arg1.method6832();
			local52 = arg1.method6814();
			arg0.method6684(local52, local37, local41);
		}
		if ((arg2 & 0x2000) != 0) {
			local37 = arg1.method6812();
			arg0.anInt8571 = arg1.method6814();
			arg0.anInt8563 = arg1.method6777();
			arg0.aBoolean577 = (local37 & 0x8000) != 0;
			arg0.anInt8573 = local37 & 0x7FFF;
			arg0.anInt8535 = arg0.anInt8573 + Static397.anInt6998 + arg0.anInt8571;
		}
		if ((arg2 & 0x40) != 0) {
			local37 = arg1.method6821();
			@Pc(512) byte[] local512 = new byte[local37];
			@Pc(517) Class3_Sub26 local517 = new Class3_Sub26(local512);
			arg1.method6794(local512, local37);
			Static173.aClass3_Sub26Array1[arg3] = local517;
			arg0.method5677(local517);
		}
		if ((arg2 & 0x4) != 0) {
			@Pc(543) int[] local543 = new int[4];
			for (local41 = 0; local41 < 4; local41++) {
				local543[local41] = arg1.method6812();
				if (local543[local41] == 65535) {
					local543[local41] = -1;
				}
			}
			local52 = arg1.method6821();
			Static496.method6696(local543, local52, arg0);
		}
		if ((arg2 & 0x4000) != 0) {
			arg0.anInt8553 = arg1.method6829();
			arg0.anInt8546 = arg1.method6792();
			arg0.anInt8556 = arg1.method6792();
			arg0.anInt8532 = arg1.method6829();
			arg0.anInt8533 = arg1.method6812() + Static397.anInt6998;
			arg0.anInt8493 = arg1.method6812() + Static397.anInt6998;
			arg0.anInt8514 = arg1.method6814();
			if (arg0.aBoolean493) {
				arg0.anInt8580 = 0;
				arg0.anInt8556 += arg0.anInt7178;
				arg0.anInt8546 += arg0.anInt7143;
				arg0.anInt8532 += arg0.anInt7143;
				arg0.anInt8553 += arg0.anInt7178;
			} else {
				arg0.anInt8546 += arg0.anIntArray513[0];
				arg0.anInt8532 += arg0.anIntArray513[0];
				arg0.anInt8553 += arg0.anIntArray512[0];
				arg0.anInt8580 = 1;
				arg0.anInt8556 += arg0.anIntArray512[0];
			}
			arg0.anInt8578 = 0;
		}
		if (!arg0.aBoolean493) {
			return;
		}
		if (local26 == 127) {
			arg0.method5675(arg0.anInt7143, arg0.anInt7178);
			return;
		}
		@Pc(728) byte local728;
		if (local26 == -1) {
			local728 = Static112.aByteArray56[arg3];
		} else {
			local728 = local26;
		}
		arg0.method5669(local728, arg0.anInt7143, arg0.anInt7178);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method3473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg5 >= Static384.anInt6641 && Static191.anInt4134 >= arg5 && Static384.anInt6641 <= arg7 && Static191.anInt4134 >= arg7 && Static384.anInt6641 <= arg4 && Static191.anInt4134 >= arg4 && arg2 >= Static384.anInt6641 && arg2 <= Static191.anInt4134 && Static112.anInt2687 <= arg3 && Static333.anInt6022 >= arg3 && arg6 >= Static112.anInt2687 && arg6 <= Static333.anInt6022 && arg8 >= Static112.anInt2687 && Static333.anInt6022 >= arg8 && Static112.anInt2687 <= arg1 && arg1 <= Static333.anInt6022) {
			Static468.method6415(arg7, arg3, arg6, arg2, arg4, arg0, arg8, arg5, arg1);
		} else {
			Static539.method7377(arg6, arg5, arg1, arg4, arg3, arg8, arg0, arg2, arg7);
		}
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(III)Lclient!im;")
	public static Class147 method3474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass147_3;
	}
}
