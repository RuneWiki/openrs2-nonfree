import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_25 = new Class211(31, -1);

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public static void method740() {
		if (Static28.aBoolean54) {
			return;
		}
		Static257.aBoolean292 = true;
		Static28.aBoolean54 = true;
		if (Static2.aClass148_Sub1_1.aBoolean245) {
			Static113.aFloat19 = (int) Static113.aFloat19 + 191 & 0xFFFFFF80;
		} else {
			Static126.aFloat5 += (24.0F - Static126.aFloat5) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIILclient!oa;Lclient!oa;)V")
	public static void method741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub2 arg3, @OriginalArg(4) Class3_Sub2 arg4) {
		@Pc(4) Class270 local4 = Static62.method926(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass3_Sub2_3 = arg3;
			local4.aClass3_Sub2_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(CI)C")
	public static char method742(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Z")
	public static boolean method743(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
