import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)S")
	public static short method5371(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 <= 64 ? local15 * local19 >> 7 : (127 - local19) * local15 >> 7;
		@Pc(43) int local43 = local39 + local19;
		@Pc(57) int local57;
		if (local43 == 0) {
			local57 = local39 << 1;
		} else {
			local57 = (local39 << 8) / local43;
		}
		return (short) (local9 << 10 | local57 >> 4 << 7 | local43);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!lt;IILclient!pi;I)V")
	public static void method5372(@OriginalArg(0) Class6_Sub26_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(31) int local31;
		if ((arg1 & 0x2) != 0) {
			local16 = arg0.method4967();
			local20 = arg0.method5000();
			if (local16 == 65535) {
				local16 = -1;
			}
			local31 = arg0.method4988();
			arg2.method6217(local16, local20, false, local31);
		}
		@Pc(40) byte local40 = -1;
		if ((arg1 & 0x10) != 0) {
			Static425.aByteArray94[arg3] = arg0.method4964();
		}
		if ((arg1 & 0x10000) != 0) {
			local16 = Static508.anInt8998;
			local20 = arg0.method4973();
			local31 = arg0.method4978();
			arg2.method6221(local31, local20, local16);
		}
		if ((arg1 & 0x1) != 0) {
			local16 = arg0.method4957();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg2.anInt7407 = local16;
		}
		if ((arg1 & 0x40) != 0) {
			arg2.anInt7455 = arg0.method4999();
			if (arg2.anInt7432 == 0) {
				arg2.method6213(arg2.anInt7455);
				arg2.anInt7455 = -1;
			}
		}
		if ((arg1 & 0x20000) != 0) {
			arg2.aByte81 = arg0.method4980();
			arg2.aByte80 = arg0.method4942();
			arg2.aByte79 = arg0.method4972();
			arg2.aByte82 = (byte) arg0.method4988();
			arg2.anInt7413 = Static508.anInt8998 + arg0.method4983();
			arg2.anInt7359 = Static508.anInt8998 + arg0.method4957();
		}
		if ((arg1 & 0x80) != 0) {
			local16 = arg0.method4967();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = arg0.method4966();
			Static181.method1439(local16, arg2, local20);
		}
		if ((arg1 & 0x200) != 0) {
			arg2.aBoolean548 = arg0.method4966() == 1;
		}
		if ((arg1 & 0x8000) != 0) {
			arg2.aString94 = arg0.method4941();
			if (arg2.aString94.charAt(0) == '~') {
				arg2.aString94 = arg2.aString94.substring(1);
				Static277.method4595(arg2.method6223(), 2, arg2.method6226(), arg2.aString96, 0, arg2.aString94);
			} else if (arg2 == Static350.aClass11_Sub1_Sub1_Sub2_4) {
				Static277.method4595(arg2.method6223(), 2, arg2.method6226(), arg2.aString96, 0, arg2.aString94);
			}
			arg2.anInt7419 = 150;
			arg2.anInt7369 = 0;
			arg2.anInt7426 = 0;
		}
		if ((arg1 & 0x100) != 0) {
			local16 = arg0.method4983();
			if (local16 == 65535) {
				local16 = -1;
			}
			local20 = arg0.method4985();
			local31 = arg0.method4988();
			arg2.method6217(local16, local20, true, local31);
		}
		if ((arg1 & 0x1000) != 0) {
			local16 = arg0.method4999();
			arg2.anInt7395 = arg0.method4978();
			arg2.anInt7370 = arg0.method4966();
			arg2.anInt7403 = local16 & 0x7FFF;
			arg2.aBoolean544 = (local16 & 0x8000) != 0;
			arg2.anInt7410 = arg2.anInt7403 + Static508.anInt8998 + arg2.anInt7395;
		}
		if ((arg1 & 0x4) != 0) {
			local16 = arg0.method4973();
			local20 = arg0.method4966();
			arg2.method6221(local20, local16, Static508.anInt8998);
			arg2.anInt7375 = Static508.anInt8998 + 300;
			arg2.anInt7388 = arg0.method4988();
		}
		if ((arg1 & 0x8) != 0) {
			local16 = arg0.method4978();
			@Pc(390) byte[] local390 = new byte[local16];
			@Pc(395) Class6_Sub26 local395 = new Class6_Sub26(local390);
			arg0.method4992(local390, local16);
			Static125.aClass6_Sub26Array1[arg3] = local395;
			arg2.method6224(local395);
		}
		if ((arg1 & 0x4000) != 0) {
			local16 = arg0.method4954();
			@Pc(422) int[] local422 = new int[local16];
			@Pc(425) int[] local425 = new int[local16];
			@Pc(428) int[] local428 = new int[local16];
			for (@Pc(430) int local430 = 0; local430 < local16; local430++) {
				@Pc(436) int local436 = arg0.method4999();
				if (local436 == 65535) {
					local436 = -1;
				}
				local422[local430] = local436;
				local425[local430] = arg0.method4966();
				local428[local430] = arg0.method4983();
			}
			Static47.method1152(local422, local428, local425, arg2);
		}
		if ((arg1 & 0x400) != 0) {
			local40 = arg0.method4980();
		}
		if ((arg1 & 0x2000) != 0) {
			arg2.anInt7372 = arg0.method4972();
			arg2.anInt7367 = arg0.method4942();
			arg2.anInt7412 = arg0.method4980();
			arg2.anInt7429 = arg0.method4972();
			arg2.anInt7391 = arg0.method4983() + Static508.anInt8998;
			arg2.anInt7428 = arg0.method4967() + Static508.anInt8998;
			arg2.anInt7431 = arg0.method4954();
			arg2.anInt7435 = 0;
			if (arg2.aBoolean550) {
				arg2.anInt7372 += arg2.anInt7473;
				arg2.anInt7367 += arg2.anInt7468;
				arg2.anInt7412 += arg2.anInt7473;
				arg2.anInt7429 += arg2.anInt7468;
				arg2.anInt7432 = 0;
			} else {
				arg2.anInt7412 += arg2.anIntArray526[0];
				arg2.anInt7372 += arg2.anIntArray526[0];
				arg2.anInt7429 += arg2.anIntArray527[0];
				arg2.anInt7432 = 1;
				arg2.anInt7367 += arg2.anIntArray527[0];
			}
		}
		if (!arg2.aBoolean550) {
			return;
		}
		if (local40 == 127) {
			arg2.method6232(arg2.anInt7468, arg2.anInt7473);
			return;
		}
		@Pc(610) byte local610;
		if (local40 == -1) {
			local610 = Static425.aByteArray94[arg3];
		} else {
			local610 = local40;
		}
		arg2.method6231(arg2.anInt7468, local610, arg2.anInt7473);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IF)F")
	public static float method5373(@OriginalArg(1) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZI[Lclient!ep;II)V")
	public static void method5374(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class93[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(14) Class93 local14 = arg3[local3];
			if (local14 != null && arg4 == local14.anInt2820) {
				Static327.method5258(arg0, arg1, arg2, local14);
				Static300.method4868(arg0, arg2, local14);
				if (local14.anInt2761 > local14.anInt2798 - local14.anInt2777) {
					local14.anInt2761 = local14.anInt2798 - local14.anInt2777;
				}
				if (local14.anInt2789 > local14.anInt2744 - local14.anInt2738) {
					local14.anInt2789 = local14.anInt2744 - local14.anInt2738;
				}
				if (local14.anInt2761 < 0) {
					local14.anInt2761 = 0;
				}
				if (local14.anInt2789 < 0) {
					local14.anInt2789 = 0;
				}
				if (local14.anInt2823 == 0) {
					Static29.method991(local14, arg1);
				}
			}
		}
	}
}
