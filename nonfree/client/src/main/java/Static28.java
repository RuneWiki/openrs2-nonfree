import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Z")
	public static boolean aBoolean25;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "I")
	public static int anInt860 = 0;

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Lclient!af;")
	private static Class5 aClass5_400 = Static45.method1937("Examine");

	@OriginalMember(owner = "client!df", name = "C", descriptor = "Lclient!g;")
	public static Class25 aClass25_1 = new Class25();

	@OriginalMember(owner = "client!df", name = "D", descriptor = "[I")
	public static int[] anIntArray100 = new int[100];

	@OriginalMember(owner = "client!df", name = "G", descriptor = "Lclient!af;")
	public static Class5 aClass5_401 = Static45.method1937("::qa_op_test");

	@OriginalMember(owner = "client!df", name = "I", descriptor = "Lclient!af;")
	private static Class5 aClass5_402 = Static45.method1937("You have only just left another world)3");

	@OriginalMember(owner = "client!df", name = "J", descriptor = "Lclient!af;")
	public static Class5 aClass5_403 = aClass5_400;

	@OriginalMember(owner = "client!df", name = "L", descriptor = "I")
	public static int anInt864 = 0;

	@OriginalMember(owner = "client!df", name = "M", descriptor = "Lclient!af;")
	public static Class5 aClass5_404 = Static45.method1937("headicons_pk");

	@OriginalMember(owner = "client!df", name = "N", descriptor = "Lclient!af;")
	public static Class5 aClass5_405 = aClass5_402;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)I")
	public static int method601(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method602() {
		aClass5_403 = null;
		aClass5_400 = null;
		aClass5_401 = null;
		aClass5_404 = null;
		aClass5_402 = null;
		aClass5_405 = null;
		anIntArray100 = null;
		aClass25_1 = null;
	}
}
