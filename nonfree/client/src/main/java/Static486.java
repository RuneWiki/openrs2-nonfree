import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public static int anInt7654;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[5];

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_121 = new Class397(111, 2);

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Z")
	public static boolean aBoolean517 = false;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "[I")
	public static final int[] anIntArray564 = new int[3];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method6604(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) String local13 = Static69.method1531(arg0);
		if (local13 == null) {
			return;
		}
		for (@Pc(26) int local26 = 0; local26 < Static544.anInt9946; local26++) {
			@Pc(32) String local32 = Static636.aStringArray41[local26];
			@Pc(36) String local36 = Static69.method1531(local32);
			if (Static475.method6473(local36, local32, local13, arg0)) {
				Static544.anInt9946--;
				for (@Pc(49) int local49 = local26; local49 < Static544.anInt9946; local49++) {
					Static636.aStringArray41[local49] = Static636.aStringArray41[local49 + 1];
					Static61.aStringArray3[local49] = Static61.aStringArray3[local49 + 1];
					Static113.anIntArray135[local49] = Static113.anIntArray135[local49 + 1];
					Static95.aStringArray7[local49] = Static95.aStringArray7[local49 + 1];
					Static543.anIntArray608[local49] = Static543.anIntArray608[local49 + 1];
					Static241.aBooleanArray8[local49] = Static241.aBooleanArray8[local49 + 1];
					Static560.aBooleanArray34[local49] = Static560.aBooleanArray34[local49 + 1];
				}
				Static507.anInt8071 = Static475.anInt7494;
				@Pc(122) Class292 local122 = Static631.method8307();
				@Pc(128) Class3_Sub29 local128 = Static507.method6901(Static30.aClass144_9, local122.aClass88_2);
				local128.aClass3_Sub2_Sub1_1.method2065(Static63.method1479(arg0));
				local128.aClass3_Sub2_Sub1_1.method2073(arg0);
				local122.method6855(local128);
				return;
			}
		}
	}
}
