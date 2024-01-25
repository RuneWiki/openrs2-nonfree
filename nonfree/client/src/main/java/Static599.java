import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "[I")
	public static final int[] anIntArray242 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3045(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg0); local14 != -1; local14 = arg2.indexOf(arg0, arg1.length() + local14)) {
			arg2 = arg2.substring(0, local14) + arg1 + arg2.substring(local14 + arg0.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!gj;Lclient!gj;Lclient!gj;Lclient!gj;B)V")
	public static void method3046(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Class143 arg3) {
		Static280.aClass143_73 = arg1;
		Static171.aClass143_43 = arg2;
		Static103.aClass143_21 = arg3;
		Static562.aClass208ArrayArray3 = new Class208[Static280.aClass143_73.method3116()][];
		Static89.aBooleanArray8 = new boolean[Static280.aClass143_73.method3116()];
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public static void method3048() {
		for (@Pc(14) Class3_Sub6_Sub17 local14 = (Class3_Sub6_Sub17) Static514.aClass193_56.method4457(); local14 != null; local14 = (Class3_Sub6_Sub17) Static514.aClass193_56.method4459()) {
			@Pc(19) Class23_Sub2_Sub1_Sub5 local19 = local14.aClass23_Sub2_Sub1_Sub5_1;
			if (local19.aBoolean599) {
				local14.method8770();
				local19.method6621();
			} else if (Static621.anInt9665 >= local19.anInt7882) {
				local19.method6625(Static527.anInt8716);
				if (local19.aBoolean599) {
					local14.method8770();
				} else {
					Static309.method4748(local19, true);
				}
			}
		}
	}
}
