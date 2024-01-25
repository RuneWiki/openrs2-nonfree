import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "Lclient!ni;")
	public static Class223 aClass223_131;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "Lclient!il;")
	public static final Class144 aClass144_5 = new Class144();

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIZII)V")
	public static void method7839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg0, 10);
		local8.method5179();
		local8.anInt6195 = arg2;
		local8.anInt6198 = arg1;
		local8.anInt6197 = arg3;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIII[BZI[BI)V")
	public static void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = -(arg3 >> 2);
		@Pc(19) int local19 = -(arg3 & 0x3);
		for (@Pc(22) int local22 = -arg0; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg7++;
				arg4[local30] = (byte) (arg4[local30] - arg6[arg5++]);
				@Pc(43) int local43 = arg7++;
				arg4[local43] = (byte) (arg4[local43] - arg6[arg5++]);
				@Pc(56) int local56 = arg7++;
				arg4[local56] = (byte) (arg4[local56] - arg6[arg5++]);
				@Pc(69) int local69 = arg7++;
				arg4[local69] = (byte) (arg4[local69] - arg6[arg5++]);
			}
			for (@Pc(88) int local88 = local19; local88 < 0; local88++) {
				local30 = arg7++;
				arg4[local30] = (byte) (arg4[local30] - arg6[arg5++]);
			}
			arg5 += arg2;
			arg7 += arg1;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZIIII)Lclient!hr;")
	public static Class6_Sub25 method7841(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class6_Sub25 local7 = new Class6_Sub25();
		local7.anInt5035 = arg3;
		local7.anInt5034 = arg1;
		Static214.aClass380_15.method8753(local7, (long) arg2);
		Static258.method4588(arg1);
		@Pc(31) Class302 local31 = Static299.method5103(arg2);
		if (local31 != null) {
			Static580.method8049(local31);
		}
		if (Static97.aClass302_2 != null) {
			Static580.method8049(Static97.aClass302_2);
			Static97.aClass302_2 = null;
		}
		Static409.method6424();
		if (local31 != null) {
			Static123.method2614(local31, !arg0);
		}
		if (!arg0) {
			Static435.method6680(arg1);
		}
		if (!arg0 && Static30.anInt830 != -1) {
			Static375.method5973(1, Static30.anInt830);
		}
		return local7;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLclient!cm;)I")
	public static int method7842(@OriginalArg(1) Class52 arg0) {
		if (arg0 == Static178.aClass52_150) {
			return 9216;
		} else if (arg0 == Static609.aClass52_141) {
			return 34065;
		} else if (arg0 == Static372.aClass52_103) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
