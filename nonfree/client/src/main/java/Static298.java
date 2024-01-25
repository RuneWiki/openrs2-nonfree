import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB[J[II)V")
	public static void method4340(@OriginalArg(0) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(20) int local20 = (arg0 + arg3) / 2;
		@Pc(22) int local22 = arg3;
		@Pc(26) long local26 = arg1[local20];
		arg1[local20] = arg1[arg0];
		arg1[arg0] = local26;
		@Pc(40) int local40 = arg2[local20];
		arg2[local20] = arg2[arg0];
		arg2[arg0] = local40;
		@Pc(58) int local58 = local26 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg3; local60 < arg0; local60++) {
			if (arg1[local60] < local26 + (long) (local60 & local58)) {
				@Pc(77) long local77 = arg1[local60];
				arg1[local60] = arg1[local22];
				arg1[local22] = local77;
				@Pc(91) int local91 = arg2[local60];
				arg2[local60] = arg2[local22];
				arg2[local22++] = local91;
			}
		}
		arg1[arg0] = arg1[local22];
		arg1[local22] = local26;
		arg2[arg0] = arg2[local22];
		arg2[local22] = local40;
		method4340(local22 - 1, arg1, arg2, arg3);
		method4340(arg0, arg1, arg2, local22 + 1);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIII)V")
	public static void method4341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static12.aClass34_Sub1_1.anInt7173 != 0 && arg2 != 0 && Static113.anInt2513 < 50 && arg0 != -1) {
			Static117.aClass45Array1[Static113.anInt2513++] = new Class45((byte) 1, arg0, arg2, arg3, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
	public static void method4342() {
		@Pc(7) int local7 = Static180.anInt3908;
		@Pc(9) int[] local9 = Static274.anIntArray500;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class30_Sub1_Sub1_Sub2 local19 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt1238 > 0) {
				local19.anInt1238--;
				if (local19.anInt1238 == 0) {
					local19.aString7 = null;
				}
			}
		}
		for (@Pc(42) int local42 = 0; local42 < Static197.anInt4078; local42++) {
			@Pc(49) long local49 = (long) Static415.anIntArray701[local42];
			@Pc(55) Class1_Sub27 local55 = (Class1_Sub27) Static24.aClass38_3.method765(local49);
			if (local55 != null) {
				@Pc(60) Class30_Sub1_Sub1_Sub1 local60 = local55.aClass30_Sub1_Sub1_Sub1_2;
				if (local60.anInt1238 > 0) {
					local60.anInt1238--;
					if (local60.anInt1238 == 0) {
						local60.aString7 = null;
					}
				}
			}
		}
	}
}
