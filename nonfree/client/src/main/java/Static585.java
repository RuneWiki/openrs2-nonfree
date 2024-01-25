import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wm", name = "L", descriptor = "Lclient!vo;")
	public static Class348 aClass348_135;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8186(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static377.method5881(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static270.anInt5671; local25++) {
			@Pc(31) String local31 = Static94.aStringArray7[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static377.method5881(local31);
			if (local31 != null && local31.equals(local20)) {
				Static270.anInt5671--;
				for (@Pc(55) int local55 = local25; local55 < Static270.anInt5671; local55++) {
					Static94.aStringArray7[local55] = Static94.aStringArray7[local55 + 1];
					Static348.aStringArray25[local55] = Static348.aStringArray25[local55 + 1];
					Static184.anIntArray182[local55] = Static184.anIntArray182[local55 + 1];
					Static84.aStringArray5[local55] = Static84.aStringArray5[local55 + 1];
					Static219.anIntArray225[local55] = Static219.anIntArray225[local55 + 1];
					Static12.aBooleanArray1[local55] = Static12.aBooleanArray1[local55 + 1];
				}
				Static136.anInt3035 = Static422.anInt8117;
				@Pc(120) Class4_Sub39 local120 = Static32.method999(Static402.aClass356_1, Static274.aClass344_43);
				local120.aClass4_Sub13_Sub2_1.method7052(Static393.method6014(arg0));
				local120.aClass4_Sub13_Sub2_1.method7002(arg0);
				Static50.method1166(local120);
				break;
			}
		}
	}
}
