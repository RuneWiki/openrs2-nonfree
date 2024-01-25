import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public static int anInt367;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!rg;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_3 = new Class183(20, 6);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)B")
	public static byte method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)V")
	public static void method275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class1_Sub3 local13 = local7.aClass1_Sub3_3;
		@Pc(16) Class1_Sub3 local16 = local7.aClass1_Sub3_2;
		if (local13 != null) {
			local13.anInt6983 = local13.anInt6983 * arg3 / 16;
			local13.anInt6987 = local13.anInt6987 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt6983 = local16.anInt6983 * arg3 / 16;
			local16.anInt6987 = local16.anInt6987 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public static void method277() {
		for (@Pc(7) int local7 = 0; local7 < Static123.anInt5933; local7++) {
			@Pc(13) int local13 = Static373.anIntArray577[local7];
			@Pc(17) Class1_Sub2_Sub1_Sub2 local17 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local13];
			if (local17 != null) {
				Static145.method4758(local17, local17.aClass197_1.anInt5486);
			}
		}
	}
}
