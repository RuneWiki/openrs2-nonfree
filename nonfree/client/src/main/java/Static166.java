import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fia", name = "H", descriptor = "[J")
	public static long[] aLongArray6;

	@OriginalMember(owner = "client!fia", name = "L", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!fia", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(ZIIII)V")
	public static void method3024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static457.anInt7571;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static291.anInt4944 = arg0;
			Static554.anInt9044 = arg3;
			Static457.anInt7571 = 2;
			Static566.anInt9180 = arg2;
			Static515.anInt8290 = arg1;
		} else if (local5 == 2) {
			if (Static515.anInt8290 < arg1) {
				Static515.anInt8290 = arg1;
			}
			if (Static566.anInt9180 < arg2) {
				Static566.anInt9180 = arg2;
			}
			if (arg3 < Static554.anInt9044) {
				Static554.anInt9044 = arg3;
			}
			if (arg0 < Static291.anInt4944) {
				Static291.anInt4944 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(II)V")
	public static void method3025(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(4, (long) arg0);
		local9.method2194();
	}
}
