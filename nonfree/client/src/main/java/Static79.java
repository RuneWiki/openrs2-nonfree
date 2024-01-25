import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "Lclient!fe;")
	public static final Class74 aClass74_9 = new Class74(32);

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_6 = new Class44(260);

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Lclient!nf;")
	public static final Class170 aClass170_2 = new Class170();

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1523(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < Static398.anInt2169; local17++) {
			if (arg0.equalsIgnoreCase(Static314.aStringArray32[local17])) {
				return local17;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)V")
	public static void method1524(@OriginalArg(0) int arg0) {
		@Pc(16) Class6_Sub2_Sub7 local16 = Static212.method3218(arg0, 16);
		local16.method3084();
	}
}
