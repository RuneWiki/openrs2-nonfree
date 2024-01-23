import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "cb", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
	public static int anInt217 = 0;

	@OriginalMember(owner = "client!ai", name = "fb", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ai", name = "lb", descriptor = "I")
	public static int anInt227 = 20;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(I)V")
	public static void method160() {
		for (@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) Static51.aClass105_6.method3120(); local15 != null; local15 = (Class1_Sub5) Static51.aClass105_6.method3109()) {
			if (local15.anInt674 > 0) {
				local15.anInt674--;
			}
			if (local15.anInt674 != 0) {
				if (local15.anInt664 > 0) {
					local15.anInt664--;
				}
				if (local15.anInt664 == 0 && local15.anInt666 >= 1 && local15.anInt667 >= 1 && local15.anInt666 <= 102 && local15.anInt667 <= 102 && (local15.anInt662 < 0 || Static18.method375(local15.anInt663, local15.anInt662))) {
					Static23.method475(local15.anInt662, local15.anInt672, local15.anInt666, local15.anInt663, local15.anInt675, local15.anInt665, local15.anInt667);
					local15.anInt664 = -1;
					if (local15.anInt673 == local15.anInt662 && local15.anInt673 == -1) {
						local15.method3758();
					} else if (local15.anInt662 == local15.anInt673 && local15.anInt675 == local15.anInt670 && local15.anInt671 == local15.anInt663) {
						local15.method3758();
					}
				}
			} else if (local15.anInt673 < 0 || Static18.method375(local15.anInt671, local15.anInt673)) {
				Static23.method475(local15.anInt673, local15.anInt672, local15.anInt666, local15.anInt671, local15.anInt670, local15.anInt665, local15.anInt667);
				local15.method3758();
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZI)I")
	public static int method161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 - 1 & arg2;
		@Pc(13) int local13 = arg2 / arg1;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(22) int local22 = Static24.method481(local17, local13);
		@Pc(29) int local29 = Static24.method481(local17, local13 + 1);
		@Pc(40) int local40 = arg1 - 1 & arg0;
		@Pc(47) int local47 = Static24.method481(local17 + 1, local13);
		@Pc(56) int local56 = Static24.method481(local17 + 1, local13 + 1);
		@Pc(63) int local63 = Static87.method1502(local9, local22, arg1, local29);
		@Pc(70) int local70 = Static87.method1502(local9, local47, arg1, local56);
		return Static87.method1502(local40, local63, arg1, local70);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)Z")
	public static boolean method162(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}
}
