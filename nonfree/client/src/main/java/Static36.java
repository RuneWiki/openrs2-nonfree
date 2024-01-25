import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	public static int anInt654;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	public static int anInt657 = 0;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZLclient!vg;)V")
	public static void method578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class201 arg2) {
		Static313.anInt6081 = arg1;
		Static109.aClass201_6 = arg2;
		Static159.anInt3171 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII)I")
	public static int method579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method580(@OriginalArg(1) String arg0) {
		return Static291.method5028(arg0, 10);
	}
}
