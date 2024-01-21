import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
	public static int[] anIntArray284;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!qd;")
	public static Class65 aClass65_13 = new Class65();

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "[Lclient!ie;")
	public static Class36[] aClass36Array1 = new Class36[4];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method2244() {
		anIntArray284 = null;
		aClass36Array1 = null;
		aClass65_13 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)[Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3[] method2245() {
		@Pc(4) Class2_Sub4_Sub3_Sub3[] local4 = new Class2_Sub4_Sub3_Sub3[Static90.anInt2315];
		for (@Pc(6) int local6 = 0; local6 < Static90.anInt2315; local6++) {
			@Pc(12) Class2_Sub4_Sub3_Sub3 local12 = new Class2_Sub4_Sub3_Sub3();
			local12.anInt3238 = Static28.anInt862;
			local12.anInt3235 = Static138.anInt3159;
			local12.anInt3236 = Static147.anIntArray314[local6];
			local12.anInt3237 = Static59.anIntArray135[local6];
			local12.anInt3233 = Static171.anIntArray359[local6];
			local12.anInt3234 = Static171.anIntArray358[local6];
			local12.anIntArray283 = Static101.anIntArray31;
			local12.aByteArray38 = Static81.aByteArrayArray5[local6];
			local4[local6] = local12;
		}
		Static12.method362();
		return local4;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIII)I")
	public static int method2246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(10) int local10 = arg5;
			arg5 = arg2;
			arg2 = local10;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 + 1 - arg1 - arg5;
		} else if (local3 == 2) {
			return 1 + 7 - arg2 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIILclient!d;JLclient!d;Lclient!d;)V")
	public static void method2247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub4_Sub1 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class2_Sub4_Sub1 arg6, @OriginalArg(7) Class2_Sub4_Sub1 arg7) {
		@Pc(3) Class64 local3 = new Class64();
		local3.aClass2_Sub4_Sub1_7 = arg4;
		local3.anInt3081 = arg1 * 128 + 64;
		local3.anInt3080 = arg2 * 128 + 64;
		local3.anInt3079 = arg3;
		local3.aLong113 = arg5;
		local3.aClass2_Sub4_Sub1_8 = arg6;
		local3.aClass2_Sub4_Sub1_9 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(42) Class2_Sub14 local42 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt2269; local46++) {
				if ((local42.aClass43Array56[local46].aLong83 & 0x400000L) == 4194304L && local42.aClass43Array56[local46].aClass2_Sub4_Sub1_2 instanceof Class2_Sub4_Sub1_Sub3) {
					@Pc(71) Class2_Sub4_Sub1_Sub3 local71 = (Class2_Sub4_Sub1_Sub3) local42.aClass43Array56[local46].aClass2_Sub4_Sub1_2;
					local71.method1193();
					if (local71.aShort36 < local34) {
						local34 = local71.aShort36;
					}
				}
			}
		}
		local3.anInt3082 = -local34;
		if (Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub14(arg0, arg1, arg2);
		}
		Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass64_1 = local3;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!ff;)Lclient!ff;")
	public static Class24 method2248(@OriginalArg(1) Class24 arg0) {
		@Pc(17) int local17 = Static153.method2369(Static10.method323(arg0));
		if (local17 == 0) {
			return null;
		}
		for (@Pc(26) int local26 = 0; local26 < local17; local26++) {
			arg0 = Static58.method1035(arg0.anInt1382);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)J")
	public static long method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass49_1 == null ? 0L : local7.aClass49_1.aLong89;
	}
}
