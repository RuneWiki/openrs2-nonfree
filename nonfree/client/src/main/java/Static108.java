import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	public static int anInt2141;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_55 = new Class77(16, -2);

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	public static int anInt2142 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Z")
	public static boolean method2081() {
		try {
			if (Static35.anInt745 == 2) {
				if (Static265.aClass2_Sub25_2 == null) {
					Static265.aClass2_Sub25_2 = Static399.method3674(Static48.aClass71_15, Static328.anInt5775, Static238.anInt4359);
					if (Static265.aClass2_Sub25_2 == null) {
						return false;
					}
				}
				if (Static371.aClass142_1 == null) {
					Static371.aClass142_1 = new Class142(Static345.aClass71_85, Static172.aClass71_42);
				}
				if (Static222.aClass2_Sub2_Sub3_1.method3428(Static165.aClass71_40, Static371.aClass142_1, Static265.aClass2_Sub25_2)) {
					Static222.aClass2_Sub2_Sub3_1.method3425();
					Static222.aClass2_Sub2_Sub3_1.method3415(Static261.anInt4643);
					Static222.aClass2_Sub2_Sub3_1.method3402(Static142.aBoolean242, Static265.aClass2_Sub25_2);
					Static371.aClass142_1 = null;
					Static48.aClass71_15 = null;
					Static35.anInt745 = 0;
					Static265.aClass2_Sub25_2 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static222.aClass2_Sub2_Sub3_1.method3423();
			Static265.aClass2_Sub25_2 = null;
			Static48.aClass71_15 = null;
			Static35.anInt745 = 0;
			Static371.aClass142_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILclient!km;IIIIIIILclient!ab;)Lclient!ab;")
	public static Class3 method2082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class3 arg9) {
		@Pc(11) long local11 = (long) arg5;
		@Pc(17) Class3 local17 = (Class3) Static291.aClass154_41.method3751(local11);
		if (local17 == null) {
			@Pc(27) Class91 local27 = Static67.method1243(arg5, Static278.aClass71_20);
			if (local27 == null) {
				return null;
			}
			local17 = arg2.method4466(local27, 1031, Static369.anInt6442, 64, 768);
			Static291.aClass154_41.method3745(local11, local17);
		}
		local17 = local17.method3481((byte) 2, 1031, true);
		if (arg0 != 0) {
			local17.method3451(arg0);
		}
		if (arg6 != 0) {
			local17.method3460(arg6);
		}
		if (arg8 != 0) {
			local17.method3463(arg8);
		}
		if (arg7 != 0) {
			local17.method3442(0, arg7, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZI)Lclient!ha;")
	public static Class2_Sub16 method2083(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(20) long local20 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class2_Sub16) Static291.aClass214_29.method5059(local20);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZ)I")
	public static int method2084(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII[B)Z")
	public static boolean method2085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(15) boolean local15 = true;
		@Pc(20) Class2_Sub13 local20 = new Class2_Sub13(arg4);
		@Pc(22) int local22 = -1;
		label56: while (true) {
			@Pc(26) int local26 = local20.method4226();
			if (local26 == 0) {
				return local15;
			}
			local22 += local26;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local20.method4211();
					if (local42 == 0) {
						continue label56;
					}
					local34 += local42 - 1;
					@Pc(72) int local72 = local34 & 0x3F;
					@Pc(78) int local78 = local34 >> 6 & 0x3F;
					@Pc(84) int local84 = local20.method4240() >> 2;
					@Pc(88) int local88 = arg0 + local78;
					@Pc(92) int local92 = arg3 + local72;
					if (local88 > 0 && local92 > 0 && local88 < arg2 - 1 && local92 < arg1 - 1) {
						@Pc(111) Class34 local111 = Static11.aClass123_5.method2703(local22);
						if (local84 != 22 || Static364.aBoolean378 || local111.anInt788 != 0 || local111.anInt780 == 1 || local111.aBoolean59) {
							if (!local111.method816()) {
								local15 = false;
								Static171.anInt3057++;
							}
							local36 = true;
						}
					}
				}
				local42 = local20.method4211();
				if (local42 == 0) {
					break;
				}
				local20.method4240();
			}
		}
	}
}
