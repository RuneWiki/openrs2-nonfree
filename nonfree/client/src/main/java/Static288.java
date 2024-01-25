import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "[I")
	public static final int[] anIntArray546 = new int[4096];

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	public static void method4640() {
		Static92.aClass17_9.method734();
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4642(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(10) Class1_Sub1_Sub11 local10 = Static541.method7520(3, arg0);
		local10.method4946();
		local10.aString54 = arg1;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Z")
	public static boolean method4643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = (arg1 & 0x37) == 0 ? Static210.method3585(arg0, arg1) : Static130.method2175(arg0, arg1);
		return (arg0 & 0x10000) != 0 | Static330.method5080(arg0, arg1) | local22;
	}
}
