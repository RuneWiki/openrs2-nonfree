import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "[I")
	public static final int[] anIntArray193 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;CI)I")
	public static int method3580(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg1 == arg0.charAt(local10)) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public static void method3581() {
		if (!Static381.method6458()) {
			return;
		}
		if (Static573.aStringArray70 == null) {
			Static161.method522();
		}
		Static564.aBoolean693 = true;
		Static136.anInt2909 = 0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BZ)V")
	public static void method3582() {
		@Pc(14) Class4_Sub14 local14 = Static196.method3380(Static17.aClass159_1, Static89.aClass173_27);
		Static353.method5712(local14);
		for (@Pc(27) Class4_Sub37 local27 = (Class4_Sub37) Static189.aClass350_14.method8198(); local27 != null; local27 = (Class4_Sub37) Static189.aClass350_14.method8205()) {
			if (!local27.method8381()) {
				local27 = (Class4_Sub37) Static189.aClass350_14.method8198();
				if (local27 == null) {
					break;
				}
			}
			if (local27.anInt8142 == 0) {
				Static161.method525(true, true, local27);
			}
		}
		if (Static69.aClass225_8 != null) {
			Static92.method2100(Static69.aClass225_8);
			Static69.aClass225_8 = null;
		}
	}
}
