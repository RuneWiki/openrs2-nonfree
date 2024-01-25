import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
	public static int anInt2895 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZILclient!ta;Ljava/lang/String;)V")
	public static void method2464(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class59 arg1, @OriginalArg(3) String arg2) {
		@Pc(26) int local26 = Static54.aClass53_7.method1383(null, arg2, 250);
		@Pc(35) int local35 = Static54.aClass53_7.method1381(null, 250, arg2) * 13;
		Static121.aClass5_7.C(6, 6, local26 + 4 + 4, local35 + 4 + 4, -16777216, 0);
		Static121.aClass5_7.method7484(6, 6, local26 + 4 + 4, local35 - -4 + 4, -1, 0);
		arg1.method7263(1, 10, local35, 0, -1, null, 10, arg2, null, null, 0, -1, local26);
		Static33.method833(6, 6, local35 + 4 + 4, local26 - -4 + 4);
		if (arg0) {
			try {
				Static121.aClass5_7.method7449();
			} catch (@Pc(123) Exception_Sub1 local123) {
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLclient!qf;)V")
	public static void method2465(@OriginalArg(1) Class245 arg0) {
		@Pc(13) Class245 local13 = Static232.method4126(arg0);
		@Pc(17) int local17;
		@Pc(19) int local19;
		if (local13 == null) {
			local17 = Static480.anInt8652;
			local19 = Static412.anInt7547;
		} else {
			local19 = local13.anInt7229;
			local17 = local13.anInt7249;
		}
		Static132.method2301(local19, false, local17, arg0);
		Static254.method4345(arg0, local19, local17);
	}
}
