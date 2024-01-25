import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!om", name = "x", descriptor = "[Lclient!nh;")
	public static final Class226[] aClass226Array1 = new Class226[35];

	@OriginalMember(owner = "client!om", name = "D", descriptor = "Lclient!sq;")
	public static final Class314 aClass314_16 = new Class314(2);

	@OriginalMember(owner = "client!om", name = "I", descriptor = "I")
	public static int anInt6814 = -1;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5715(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static131.method2611(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static591.anInt9675; local25++) {
			@Pc(31) String local31 = Static22.aStringArray1[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static131.method2611(local31);
			if (local31 != null && local31.equals(local20)) {
				Static591.anInt9675--;
				for (@Pc(55) int local55 = local25; local55 < Static591.anInt9675; local55++) {
					Static22.aStringArray1[local55] = Static22.aStringArray1[local55 + 1];
					Static91.aStringArray6[local55] = Static91.aStringArray6[local55 + 1];
					Static438.anIntArray451[local55] = Static438.anIntArray451[local55 + 1];
					Static167.aStringArray15[local55] = Static167.aStringArray15[local55 + 1];
					Static273.anIntArray260[local55] = Static273.anIntArray260[local55 + 1];
					Static166.aBooleanArray11[local55] = Static166.aBooleanArray11[local55 + 1];
				}
				Static49.anInt890 = Static109.anInt2171;
				@Pc(120) Class3_Sub42 local120 = Static591.method7910(Static9.aClass199_3, Static480.aClass303_86);
				local120.aClass3_Sub11_Sub1_1.method5213(Static325.method4707(arg0));
				local120.aClass3_Sub11_Sub1_1.method5227(arg0);
				Static511.method6885(local120);
				break;
			}
		}
	}
}
