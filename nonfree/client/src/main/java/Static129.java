import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_16;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Lclient!f;")
	public static Class13 aClass13_25;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1655 = Static122.method531("Loading textures )2 ");

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1656 = Static122.method531("<br>(X");

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public static int anInt2960 = 0;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Lclient!b;")
	public static Class7 aClass7_21 = new Class7(100);

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1657 = aClass73_1655;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public static void method2162() {
		aClass13_Sub1_16 = null;
		aClass13_25 = null;
		aClass73_1657 = null;
		aClass73_1655 = null;
		aClass7_21 = null;
		aClass73_1656 = null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)I")
	public static int method2163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			arg0--;
			local12 = local12 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
		}
		return local12;
	}
}
