import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!ria", name = "v", descriptor = "I")
	public static int anInt828;

	@OriginalMember(owner = "client!ria", name = "t", descriptor = "Lclient!uia;")
	public static final Class3_Sub50 aClass3_Sub50_2 = new Class3_Sub50(0, -1);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(BI)Z")
	public static boolean method779(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(III)I")
	public static int method780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6;
		if (arg0 < arg1) {
			local6 = arg0;
			arg0 = arg1;
			arg1 = local6;
		}
		while (arg1 != 0) {
			local6 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!be;ILclient!ha;)I")
	public static int method782(@OriginalArg(0) Class27 arg0, @OriginalArg(2) Class82 arg1) {
		if (arg0.anInt541 != -1) {
			return arg0.anInt541;
		}
		if (arg0.anInt550 != -1) {
			@Pc(24) Class355 local24 = arg1.anInterface5_9.method4129(arg0.anInt550);
			if (!local24.aBoolean743) {
				return local24.aShort122;
			}
		}
		return arg0.anInt542;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(BLclient!uv;)V")
	public static void method783(@OriginalArg(1) Class344 arg0) {
		if (arg0.anInt9554 == 5 && arg0.anInt9567 != -1) {
			Static483.method7128(Static266.aClass82_8, arg0);
		}
	}
}
