import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
	public static int anInt9323 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!ha;IIZ)Lclient!er;")
	public static Class95 method8036(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 == -1) {
			return null;
		}
		if (Static307.anIntArray298 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static307.anIntArray298.length; local15++) {
				if (arg1 == Static307.anIntArray298[local15]) {
					return Static151.aClass95Array1[local15];
				}
			}
		}
		@Pc(46) Class95 local46 = (Class95) Static496.aClass102_16.method2677((long) arg1);
		if (local46 != null) {
			if (arg2 && local46.aClass282_2 == null) {
				@Pc(58) Class282 local58 = Static95.method2093(Static303.aClass196_59, arg1);
				if (local58 == null) {
					return null;
				}
				local46.aClass282_2 = local58;
			}
			return local46;
		}
		@Pc(71) Class107[] local71 = Static645.method2768(Static592.aClass196_123, arg1);
		if (local71 == null) {
			return null;
		}
		@Pc(88) Class282 local88 = Static95.method2093(Static303.aClass196_59, arg1);
		if (local88 == null) {
			return null;
		}
		if (arg2) {
			local46 = new Class95(arg0.method7515(local88, local71), local88);
		} else {
			local46 = new Class95(arg0.method7515(local88, local71));
		}
		Static496.aClass102_16.method2674((long) arg1, local46);
		return local46;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIII)I")
	public static int method8038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(16) int local16 = arg2;
			arg2 = arg5;
			arg5 = local16;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 + 1 - arg0 - arg2;
		} else {
			return 8 - arg5 - arg1;
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)V")
	public static void method8039() {
		Static496.aClass102_16.method2668(50);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BIIIII)I")
	public static int method8040(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static364.aClass51Array3 == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(19) int local19 = arg1 >> 9;
			@Pc(23) int local23 = arg2 >> 9;
			if (arg0 < 0 || arg3 < 0 || Static634.anInt10129 - 1 < arg0 || arg3 > Static638.anInt10172 - 1) {
				return 0;
			}
			if (local19 < 1 || local23 < 1 || local19 > Static634.anInt10129 - 1 || local23 > Static638.anInt10172 - 1) {
				return 0;
			}
			@Pc(100) boolean local100 = (Static513.aByteArrayArrayArray18[1][arg1 >> 9][arg2 >> 9] & 0x2) != 0;
			@Pc(128) boolean local128;
			@Pc(147) boolean local147;
			if ((arg1 & 0x1FF) == 0) {
				local128 = (Static513.aByteArrayArrayArray18[1][local19 - 1][arg2 >> 9] & 0x2) != 0;
				local147 = (Static513.aByteArrayArrayArray18[1][local19][arg2 >> 9] & 0x2) != 0;
				if (local128 != local147) {
					local100 = (Static513.aByteArrayArrayArray18[1][arg0][arg3] & 0x2) != 0;
				}
			}
			if ((arg2 & 0x1FF) == 0) {
				local128 = (Static513.aByteArrayArrayArray18[1][arg1 >> 9][local23 - 1] & 0x2) != 0;
				local147 = (Static513.aByteArrayArrayArray18[1][arg1 >> 9][local23] & 0x2) != 0;
				if (local147 != local128) {
					local100 = (Static513.aByteArrayArrayArray18[1][arg0][arg3] & 0x2) != 0;
				}
			}
			if (local100) {
				arg4++;
			}
		}
		return Static364.aClass51Array3[arg4].method7839(arg1, arg2);
	}
}
