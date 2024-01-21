import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "Lclient!je;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_253 = Static187.method3089("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_254 = Static187.method3089(" loggt sich aus)3");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)I")
	public static int method459(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)I")
	public static int method460(@OriginalArg(0) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(26) double local26 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local26;
		@Pc(44) double local44 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(46) double local46 = local26;
		@Pc(48) double local48 = 0.0D;
		if (local35 > local26) {
			local46 = local35;
		}
		if (local35 < local26) {
			local37 = local35;
		}
		@Pc(62) double local62 = 0.0D;
		if (local44 > local46) {
			local46 = local44;
		}
		if (local44 < local37) {
			local37 = local44;
		}
		@Pc(80) double local80 = (local37 + local46) / 2.0D;
		@Pc(85) int local85 = (int) (local80 * 256.0D);
		if (local37 != local46) {
			if (local80 < 0.5D) {
				local62 = (local46 - local37) / (local46 + local37);
			}
			if (local80 >= 0.5D) {
				local62 = (local46 - local37) / (-local37 + -local46 + 2.0D);
			}
			if (local46 == local26) {
				local48 = (local35 - local44) / (-local37 + local46);
			} else if (local46 == local35) {
				local48 = (local44 - local26) / (-local37 + local46) + 2.0D;
			} else if (local46 == local44) {
				local48 = (local26 - local35) / (-local37 + local46) + 4.0D;
			}
		}
		@Pc(173) int local173 = (int) (local62 * 256.0D);
		local48 /= 6.0D;
		if (local85 < 0) {
			local85 = 0;
		} else if (local85 > 255) {
			local85 = 255;
		}
		@Pc(195) int local195 = (int) (local48 * 256.0D);
		if (local173 < 0) {
			local173 = 0;
		} else if (local173 > 255) {
			local173 = 255;
		}
		if (local85 > 243) {
			local173 >>= 0x4;
		} else if (local85 > 217) {
			local173 >>= 0x3;
		} else if (local85 > 192) {
			local173 >>= 0x2;
		} else if (local85 > 179) {
			local173 >>= 0x1;
		}
		return (local85 >> 1) + (local173 >> 5 << 7) + (local195 >> 2 << 10);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIILclient!e;JZ)V")
	public static void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class5 local6 = new Class5();
		local6.aClass8_1 = arg4;
		local6.anInt103 = arg1 * 128 + 64;
		local6.anInt100 = arg2 * 128 + 64;
		local6.anInt98 = arg3;
		local6.aLong7 = arg5;
		if (Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub17(arg0, arg1, arg2);
		}
		Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass5_1 = local6;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)I")
	public static int method462(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(II)Z")
	public static boolean method463(@OriginalArg(0) int arg0) {
		if (Static186.aBooleanArray16[arg0]) {
			return true;
		} else if (Static177.aClass3_35.method3273(arg0)) {
			@Pc(25) int local25 = Static177.aClass3_35.method3270(arg0);
			if (local25 == 0) {
				Static186.aBooleanArray16[arg0] = true;
				return true;
			}
			if (Static194.aClass11ArrayArray1[arg0] == null) {
				Static194.aClass11ArrayArray1[arg0] = new Class11[local25];
			}
			for (@Pc(52) int local52 = 0; local52 < local25; local52++) {
				if (Static194.aClass11ArrayArray1[arg0][local52] == null) {
					@Pc(68) byte[] local68 = Static177.aClass3_35.method3265(arg0, local52);
					if (local68 != null) {
						Static194.aClass11ArrayArray1[arg0][local52] = new Class11();
						Static194.aClass11ArrayArray1[arg0][local52].anInt275 = (arg0 << 16) + local52;
						if (local68[0] == -1) {
							Static194.aClass11ArrayArray1[arg0][local52].method205(new Class1_Sub14(local68));
						} else {
							Static194.aClass11ArrayArray1[arg0][local52].method195(new Class1_Sub14(local68));
						}
					}
				}
			}
			Static186.aBooleanArray16[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIILclient!e;Lclient!e;IIJ)V")
	public static void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8 arg4, @OriginalArg(5) Class8 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class48 local8 = new Class48();
		local8.aLong94 = arg8;
		local8.anInt1851 = arg1 * 128 + 64;
		local8.anInt1853 = arg2 * 128 + 64;
		local8.anInt1849 = arg3;
		local8.aClass8_4 = arg4;
		local8.aClass8_5 = arg5;
		local8.anInt1852 = arg6;
		local8.anInt1850 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static179.aClass1_Sub17ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static179.aClass1_Sub17ArrayArrayArray1[local42][arg1][arg2] = new Class1_Sub17(local42, arg1, arg2);
			}
		}
		Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass48_1 = local8;
	}
}
