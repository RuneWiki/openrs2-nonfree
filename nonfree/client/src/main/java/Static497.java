import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!lo;")
	public static final Class220 aClass220_8 = new Class220();

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!uf;")
	public static Class357 aClass357_126 = null;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7819(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static426.method9517(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static645.anInt10075; local33++) {
			@Pc(39) String local39 = Static587.aStringArray74[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static426.method9517(local39);
			if (local39 != null && local39.equals(local20)) {
				Static645.anInt10075--;
				for (@Pc(63) int local63 = local33; local63 < Static645.anInt10075; local63++) {
					Static587.aStringArray74[local63] = Static587.aStringArray74[local63 + 1];
					Static13.aStringArray49[local63] = Static13.aStringArray49[local63 + 1];
					Static622.aStringArray79[local63] = Static622.aStringArray79[local63 + 1];
					Static542.aStringArray61[local63] = Static542.aStringArray61[local63 + 1];
					Static369.aBooleanArray67[local63] = Static369.aBooleanArray67[local63 + 1];
				}
				Static194.anInt4135 = Static397.anInt11030;
				@Pc(124) Class2_Sub52 local124 = Static311.method5098(Static179.aClass341_43, Static125.aClass179_1);
				local124.aClass2_Sub8_Sub2_2.method5170(Static297.method4908(arg0));
				local124.aClass2_Sub8_Sub2_2.method5212(arg0);
				Static38.method791(local124);
				return;
			}
		}
	}
}
