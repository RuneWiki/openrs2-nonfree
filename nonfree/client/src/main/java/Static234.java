import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "Lclient!kq;")
	public static Class199 aClass199_2;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2232(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static317.method4379(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static633.anInt9792; local25++) {
			@Pc(37) String local37 = Static16.aStringArray4[local25];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static317.method4379(local37);
			if (local37 != null && local37.equals(local20)) {
				Static633.anInt9792--;
				for (@Pc(61) int local61 = local25; local61 < Static633.anInt9792; local61++) {
					Static16.aStringArray4[local61] = Static16.aStringArray4[local61 + 1];
					Static280.aStringArray49[local61] = Static280.aStringArray49[local61 + 1];
					Static301.aStringArray21[local61] = Static301.aStringArray21[local61 + 1];
					Static571.aStringArray44[local61] = Static571.aStringArray44[local61 + 1];
					Static506.aBooleanArray16[local61] = Static506.aBooleanArray16[local61 + 1];
				}
				Static261.anInt4244 = Static317.anInt4914;
				@Pc(118) Class4_Sub48 local118 = Static335.method4615(Static349.aClass216_93, Static669.aClass196_2);
				local118.aClass4_Sub11_Sub1_2.method8822(Static115.method2143(arg0));
				local118.aClass4_Sub11_Sub1_2.method8857(arg0);
				Static410.method5170(local118);
				return;
			}
		}
	}
}
