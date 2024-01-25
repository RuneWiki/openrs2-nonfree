import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	public static int anInt6683;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[Lclient!sia;")
	public static Class309[] aClass309Array2;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!la;")
	public static Class196 aClass196_67;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "F")
	public static float aFloat154;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "[I")
	public static int[] anIntArray397;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "[I")
	public static final int[] anIntArray396 = new int[3];

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BII)V")
	public static void method5733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static556.method8018(17, arg1);
		local8.method3608();
		local8.anInt4062 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;")
	public static String method5734(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = local8;
		@Pc(22) int local22 = local11 - 1;
		if (local22 != 0) {
			@Pc(26) int local26 = 0;
			while (true) {
				local26 = arg0.indexOf(13, local26);
				if (local26 < 0) {
					break;
				}
				local13 += local22;
				local26++;
			}
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(local13);
		@Pc(47) int local47 = 0;
		while (true) {
			@Pc(52) int local52 = arg0.indexOf(13, local47);
			if (local52 < 0) {
				local45.append(arg0.substring(local47));
				return local45.toString();
			}
			local45.append(arg0.substring(local47, local52));
			local47 = local52 + 1;
			local45.append(arg1);
		}
	}
}
