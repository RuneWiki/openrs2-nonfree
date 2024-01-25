import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
	public static int anInt7997;

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
	public static int anInt8003 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)Lclient!jk;")
	public static Class3_Sub4_Sub14 method6613(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub4_Sub14 local10 = (Class3_Sub4_Sub14) Static459.aClass308_6.method7537((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static96.aClass254_29.method6401(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static118.method7553(local20);
			Static459.aClass308_6.method7538((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6614(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static67.method8230(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < Static346.anInt7032; local27++) {
			@Pc(32) String local32 = Static520.aStringArray34[local27];
			if (local32.startsWith("*")) {
				local32 = local32.substring(1);
			}
			local32 = Static67.method8230(local32);
			if (local32 != null && local32.equals(local18)) {
				Static346.anInt7032--;
				for (@Pc(56) int local56 = local27; local56 < Static346.anInt7032; local56++) {
					Static520.aStringArray34[local56] = Static520.aStringArray34[local56 + 1];
					Static199.aStringArray17[local56] = Static199.aStringArray17[local56 + 1];
					Static585.anIntArray666[local56] = Static585.anIntArray666[local56 + 1];
					Static92.aStringArray7[local56] = Static92.aStringArray7[local56 + 1];
					Static166.anIntArray232[local56] = Static166.anIntArray232[local56 + 1];
					Static410.aBooleanArray30[local56] = Static410.aBooleanArray30[local56 + 1];
				}
				Static257.anInt5521 = Static509.anInt9418;
				@Pc(120) Class3_Sub9 local120 = Static587.method8316(Static187.aClass40_2, Static440.aClass230_52);
				local120.aClass3_Sub7_Sub1_1.method6494(Static85.method1894(arg0));
				local120.aClass3_Sub7_Sub1_1.method6516(arg0);
				Static230.method3933(local120);
				return;
			}
		}
	}
}
