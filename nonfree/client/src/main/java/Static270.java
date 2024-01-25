import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "Lclient!el;")
	public static final Class109 aClass109_104 = new Class109(46, 12);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
	public static int anInt4694 = 0;

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "Lclient!eba;")
	public static final Class98 aClass98_5 = new Class98();

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!vv;Z)Z")
	public static boolean method4024(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) boolean local7 = Static242.aClass22Array3 == Static134.aClass22Array1;
		@Pc(9) int local9 = 0;
		@Pc(11) short local11 = 0;
		@Pc(13) byte local13 = 0;
		arg0.method8231();
		if (arg0.aShort109 < 0 || arg0.aShort108 < 0 || arg0.aShort110 >= Static328.anInt5870 || arg0.aShort107 >= Static526.anInt8863) {
			return false;
		}
		@Pc(41) short local41 = 0;
		@Pc(48) int local48;
		for (@Pc(44) int local44 = arg0.aShort109; local44 <= arg0.aShort110; local44++) {
			for (local48 = arg0.aShort108; local48 <= arg0.aShort107; local48++) {
				@Pc(55) Class174 local55 = Static545.method7957(arg0.aByte145, local44, local48);
				if (local55 != null) {
					@Pc(61) Class273 local61 = Static56.method5906(arg0);
					@Pc(64) Class273 local64 = local55.aClass273_67;
					if (local64 == null) {
						local55.aClass273_67 = local61;
					} else {
						while (local64.aClass273_114 != null) {
							local64 = local64.aClass273_114;
						}
						local64.aClass273_114 = local61;
					}
					if (local7 && (Static127.anIntArrayArray14[local44][local48] & 0xFF000000) != 0) {
						local9 = Static127.anIntArrayArray14[local44][local48];
						local11 = Static104.aShortArrayArray3[local44][local48];
						local13 = Static193.aByteArrayArray26[local44][local48];
					}
					if (!arg1 && local55.aClass8_Sub1_Sub1_1 != null && local55.aClass8_Sub1_Sub1_1.aShort4 > local41) {
						local41 = local55.aClass8_Sub1_Sub1_1.aShort4;
					}
				}
			}
		}
		if (local7 && (local9 & 0xFF000000) != 0) {
			for (local48 = arg0.aShort109; local48 <= arg0.aShort110; local48++) {
				for (@Pc(159) int local159 = arg0.aShort108; local159 <= arg0.aShort107; local159++) {
					if ((Static127.anIntArrayArray14[local48][local159] & 0xFF000000) == 0) {
						Static127.anIntArrayArray14[local48][local159] = local9;
						Static104.aShortArrayArray3[local48][local159] = local11;
						Static193.aByteArrayArray26[local48][local159] = local13;
					}
				}
			}
		}
		if (arg1) {
			Static15.aClass8_Sub1_Sub3Array1[Static158.anInt2473++] = arg0;
		} else {
			local48 = Static242.aClass22Array3 == Static134.aClass22Array1 ? 1 : 0;
			if (!arg0.method8906((byte) 27)) {
				arg0.aClass8_Sub1_23 = Static654.aClass8_Sub1Array5[local48];
				Static654.aClass8_Sub1Array5[local48] = arg0;
			} else if (arg0.method8897(false)) {
				arg0.aClass8_Sub1_23 = Static607.aClass8_Sub1Array4[local48];
				Static607.aClass8_Sub1Array4[local48] = arg0;
			} else {
				arg0.aClass8_Sub1_23 = Static494.aClass8_Sub1Array3[local48];
				Static494.aClass8_Sub1Array3[local48] = arg0;
				Static554.aBoolean714 = true;
			}
		}
		if (arg1) {
			arg0.anInt10357 -= local41;
		}
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZIIZI)I")
	public static int method4026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class5_Sub48 local10 = Static507.method7441(arg0, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local10.anIntArray523.length; local19++) {
			if (local10.anIntArray523[local19] >= 0 && local10.anIntArray523[local19] < Static201.aClass127_1.anInt2923) {
				@Pc(45) Class204 local45 = Static201.aClass127_1.method2501(local10.anIntArray523[local19]);
				@Pc(55) int local55 = local45.method4860(arg1, Static4.aClass355_1.method8693(arg1).anInt3373);
				if (arg2) {
					local17 += local55 * local10.anIntArray524[local19];
				} else {
					local17 += local55;
				}
			}
		}
		return local17;
	}
}
