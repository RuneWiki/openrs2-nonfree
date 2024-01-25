import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "Lclient!ht;")
	public static final Class137 aClass137_11 = new Class137("", 12);

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
	public static final int anInt9413 = 50;

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "[I")
	public static final int[] anIntArray614 = new int[anInt9413];

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "[I")
	public static final int[] anIntArray615 = new int[anInt9413];

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[anInt9413];

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "[I")
	public static final int[] anIntArray616 = new int[anInt9413];

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "[I")
	public static final int[] anIntArray617 = new int[anInt9413];

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "[I")
	public static final int[] anIntArray618 = new int[anInt9413];

	@OriginalMember(owner = "client!wj", name = "v", descriptor = "[I")
	public static final int[] anIntArray619 = new int[anInt9413];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([II[I)V")
	public static void method7815(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static106.aByteArrayArrayArray9 = null;
			Static128.anIntArray131 = null;
			Static288.anIntArray271 = null;
			return;
		}
		Static288.anIntArray271 = arg0;
		Static128.anIntArray131 = new int[arg0.length];
		Static106.aByteArrayArrayArray9 = new byte[arg0.length][][];
		for (@Pc(32) int local32 = 0; local32 < Static288.anIntArray271.length; local32++) {
			Static106.aByteArrayArrayArray9[local32] = new byte[arg1[local32]][];
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([IIIII)V")
	public static void method7816(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(12) int local12 = arg3 - 1;
		@Pc(16) int local16 = local12 - 7;
		while (local16 > arg2) {
			@Pc(20) int local20 = arg2 + 1;
			arg0[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg1;
			@Pc(50) int local50 = local45 + 1;
			arg0[local50] = arg1;
			arg2 = local50 + 1;
			arg0[arg2] = arg1;
		}
		while (local12 > arg2) {
			arg2++;
			arg0[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!ce;)V")
	public static void method7817(@OriginalArg(1) Class3_Sub11_Sub1 arg0) {
		arg0.method1384();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static403.anInt6982; local12++) {
			local18 = Static430.anIntArray447[local12];
			if ((Static214.aByteArray43[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static214.aByteArray43[local18] = (byte) (Static214.aByteArray43[local18] | 0x2);
					local10--;
				} else {
					local46 = arg0.method1383(1);
					if (local46 == 0) {
						local10 = Static517.method6936(arg0);
						Static214.aByteArray43[local18] = (byte) (Static214.aByteArray43[local18] | 0x2);
					} else {
						Static161.method2958(local18, arg0);
					}
				}
			}
		}
		arg0.method1392();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method1384();
		@Pc(129) int local129;
		for (local18 = 0; local18 < Static403.anInt6982; local18++) {
			local46 = Static430.anIntArray447[local18];
			if ((Static214.aByteArray43[local46] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static214.aByteArray43[local46] = (byte) (Static214.aByteArray43[local46] | 0x2);
				} else {
					local129 = arg0.method1383(1);
					if (local129 == 0) {
						local10 = Static517.method6936(arg0);
						Static214.aByteArray43[local46] = (byte) (Static214.aByteArray43[local46] | 0x2);
					} else {
						Static161.method2958(local46, arg0);
					}
				}
			}
		}
		arg0.method1392();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method1384();
		@Pc(214) int local214;
		for (local46 = 0; local46 < Static539.anInt8645; local46++) {
			local129 = Static159.anIntArray157[local46];
			if ((Static214.aByteArray43[local129] & 0x1) != 0) {
				if (local10 > 0) {
					Static214.aByteArray43[local129] = (byte) (Static214.aByteArray43[local129] | 0x2);
					local10--;
				} else {
					local214 = arg0.method1383(1);
					if (local214 == 0) {
						local10 = Static517.method6936(arg0);
						Static214.aByteArray43[local129] = (byte) (Static214.aByteArray43[local129] | 0x2);
					} else if (Static537.method7174(arg0, local129)) {
						Static214.aByteArray43[local129] = (byte) (Static214.aByteArray43[local129] | 0x2);
					}
				}
			}
		}
		arg0.method1392();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method1384();
		for (local129 = 0; local129 < Static539.anInt8645; local129++) {
			local214 = Static159.anIntArray157[local129];
			if ((Static214.aByteArray43[local214] & 0x1) == 0) {
				if (local10 > 0) {
					Static214.aByteArray43[local214] = (byte) (Static214.aByteArray43[local214] | 0x2);
					local10--;
				} else {
					@Pc(304) int local304 = arg0.method1383(1);
					if (local304 == 0) {
						local10 = Static517.method6936(arg0);
						Static214.aByteArray43[local214] = (byte) (Static214.aByteArray43[local214] | 0x2);
					} else if (Static537.method7174(arg0, local214)) {
						Static214.aByteArray43[local214] = (byte) (Static214.aByteArray43[local214] | 0x2);
					}
				}
			}
		}
		arg0.method1392();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static539.anInt8645 = 0;
		Static403.anInt6982 = 0;
		for (local214 = 1; local214 < 2048; local214++) {
			Static214.aByteArray43[local214] = (byte) (Static214.aByteArray43[local214] >> 1);
			@Pc(379) Class41_Sub2_Sub1_Sub4_Sub2 local379 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local214];
			if (local379 == null) {
				Static159.anIntArray157[Static539.anInt8645++] = local214;
			} else {
				Static430.anIntArray447[Static403.anInt6982++] = local214;
			}
		}
	}
}
