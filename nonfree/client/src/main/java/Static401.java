import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[S")
	public static short[] aShortArray111;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_58 = new Class181();

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[8];

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	public static int anInt6424 = -1;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!hp;)Lclient!eu;")
	public static Class1_Sub4 method5344(@OriginalArg(1) Class1_Sub5 arg0) {
		arg0.method5366();
		@Pc(13) int local13 = arg0.method5366();
		@Pc(17) Class1_Sub4 local17 = Static97.method1732(local13);
		local17.anInt7279 = arg0.method5366();
		@Pc(33) int local33 = arg0.method5366();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) int local41 = arg0.method5366();
			local17.method5949(local41, arg0);
		}
		local17.method5950();
		return local17;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZII)I")
	public static int method5345(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub14 local12 = Static48.method871(false, arg0);
		if (local12 == null) {
			return Static386.aClass64_1.method1692(arg0).anInt4743;
		}
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local12.anIntArray146.length; local29++) {
			if (local12.anIntArray146[local29] == -1) {
				local27++;
			}
		}
		return local27 + Static386.aClass64_1.method1692(arg0).anInt4743 - local12.anIntArray146.length;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[Ljava/lang/Object;[IB)V")
	public static void method5347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(16) int local16 = (arg0 + arg1) / 2;
		@Pc(18) int local18 = arg1;
		@Pc(22) int local22 = arg3[local16];
		arg3[local16] = arg3[arg0];
		arg3[arg0] = local22;
		@Pc(36) Object local36 = arg2[local16];
		arg2[local16] = arg2[arg0];
		arg2[arg0] = local36;
		@Pc(53) int local53 = local22 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg1; local55 < arg0; local55++) {
			if (local22 + (local53 & local55) > arg3[local55]) {
				@Pc(73) int local73 = arg3[local55];
				arg3[local55] = arg3[local18];
				arg3[local18] = local73;
				@Pc(87) Object local87 = arg2[local55];
				arg2[local55] = arg2[local18];
				arg2[local18++] = local87;
			}
		}
		arg3[arg0] = arg3[local18];
		arg3[local18] = local22;
		arg2[arg0] = arg2[local18];
		arg2[local18] = local36;
		method5347(local18 - 1, arg1, arg2, arg3);
		method5347(arg0, local18 + 1, arg2, arg3);
	}
}
