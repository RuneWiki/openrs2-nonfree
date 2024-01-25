import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "[I")
	public static int[] anIntArray745;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!gea;II)V")
	public static void method7667(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11_Sub8 arg1, @OriginalArg(3) int arg2) {
		if (!Static43.aBoolean74) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(22) int local22;
		for (@Pc(16) Class3_Sub11_Sub14 local16 = (Class3_Sub11_Sub14) arg1.aClass74_4.method1842(); local16 != null; local16 = (Class3_Sub11_Sub14) arg1.aClass74_4.method1844()) {
			local22 = Static574.method8106(local16);
			if (local22 > local10) {
				local10 = local22;
			}
		}
		local10 += 8;
		Static673.anInt10857 = arg1.anInt3796 * 16 + (Static609.aBoolean752 ? 26 : 22);
		local22 = arg1.anInt3796 * 16 + 21;
		@Pc(62) int local62 = Static368.anInt5940 + Static600.anInt9624;
		if (local10 + local62 > Static312.anInt5191) {
			local62 = Static600.anInt9624 - local10;
		}
		if (local62 < 0) {
			local62 = 0;
		}
		@Pc(93) int local93 = Static609.aBoolean752 ? 33 : 31;
		@Pc(99) int local99 = arg0 + 13 - local93;
		if (Static222.anInt4196 < local99 + local22) {
			local99 = Static222.anInt4196 - local22;
		}
		if (local99 < 0) {
			local99 = 0;
		}
		Static451.anInt7467 = local62;
		Static159.anInt3122 = local10;
		Static142.aClass3_Sub11_Sub8_1 = arg1;
		Static544.anInt8963 = local99;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
	public static String method7668(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg1 < 0L) {
			local25 = true;
			arg1 = -arg1;
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(26);
		@Pc(46) int local46;
		@Pc(51) int local51;
		if (arg3 > 0) {
			for (local46 = 0; local46 < arg3; local46++) {
				local51 = (int) arg1;
				arg1 /= 10L;
				local39.append((char) (local51 + 48 - (int) arg1 * 10));
			}
			local39.append(local7);
		}
		local46 = 0;
		while (true) {
			local51 = (int) arg1;
			arg1 /= 10L;
			local39.append((char) (local51 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local25) {
					local39.append('-');
				}
				return local39.reverse().toString();
			}
			if (arg0) {
				local46++;
				if (local46 % 3 == 0) {
					local39.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[SI)[S")
	public static short[] method7673(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static684.method5328(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method7674(@OriginalArg(0) String arg0) {
		return Static162.aHashtable3.containsKey(arg0);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)V")
	public static void method7675() {
		if (Static260.anInt4398 == 0) {
			return;
		}
		if (Static559.aClass269_1 != null) {
			Static559.aClass269_1.method6697();
			Static559.aClass269_1 = null;
		}
		Static234.method3925();
		Static640.method8896();
	}
}
