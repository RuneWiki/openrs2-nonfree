import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "Lclient!op;")
	public static Class248 aClass248_2;

	@OriginalMember(owner = "client!uu", name = "o", descriptor = "Lclient!n;")
	public static Class221 aClass221_12;

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "Lclient!te;")
	public static final Class318 aClass318_7 = new Class318("", 12);

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method7324(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)I")
	public static int method7326(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIB)V")
	public static void method7329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static341.anInt6022 = arg0 - Static284.anInt7865;
		Static296.anInt5364 = arg1 - Static284.anInt7863;
	}
}
