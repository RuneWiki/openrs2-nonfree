import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
	public static int anInt574;

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "Z")
	public static boolean aBoolean44;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "Z")
	public static boolean aBoolean43 = true;

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString35 = "Select";

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "[I")
	public static final int[] anIntArray29 = new int[32];

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
	public static int anInt581 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)I")
	public static int method566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I")
	public static int method567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static331.method5533(arg1 - 1, arg0 + -1) + Static331.method5533(arg1 + 1, arg0 - 1) + Static331.method5533(arg1 + -1, arg0 + 1) + Static331.method5533(arg1 - -1, arg0 - -1);
		@Pc(77) int local77 = Static331.method5533(arg1 - 1, arg0) + Static331.method5533(arg1 + 1, arg0) + Static331.method5533(arg1, arg0 + -1) + Static331.method5533(arg1, arg0 - -1);
		@Pc(82) int local82 = Static331.method5533(arg1, arg0);
		return local77 / 8 + local41 / 16 + local82 / 4;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!bk;I)Lclient!ll;")
	public static Class120 method569(@OriginalArg(0) Class5_Sub1 arg0) {
		@Pc(12) Class120 local12 = new Class120();
		local12.anInt3558 = arg0.method1845();
		local12.aClass5_Sub9_Sub12_1 = Static52.method1171(local12.anInt3558);
		return local12;
	}
}
