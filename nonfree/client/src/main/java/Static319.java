import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	public static int anInt6143;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
	public static int anInt6148 = 0;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_108 = new Class133(74, 5);

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(BI)V")
	public static void method5144(@OriginalArg(1) int arg0) {
		for (@Pc(17) Class3 local17 = Static447.aClass267_39.method6643(); local17 != null; local17 = Static447.aClass267_39.method6650()) {
			if ((long) arg0 == (local17.aLong285 >> 48 & 0xFFFFL)) {
				local17.method7820();
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!oa;)V")
	public static void method5146(@OriginalArg(1) Class5 arg0) {
		if (Static228.aBoolean342) {
			Static400.method6094(arg0);
		} else {
			Static83.method1705(arg0);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5147(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(21) char local21 = arg0.charAt(local12);
			if (local21 <= '\u007f') {
				local10++;
			} else if (local21 <= '\u07ff') {
				local10 += 2;
			} else {
				local10 += 3;
			}
		}
		return local10;
	}
}
