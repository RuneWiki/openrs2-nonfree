import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "Lclient!cb;")
	public static Class40 aClass40_71;

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
	public static int anInt2862;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "[I")
	public static final int[] anIntArray327 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 };

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
	public static int anInt2861 = 0;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "[I")
	public static final int[] anIntArray328 = new int[1000];

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIILclient!bg;Lclient!bg;)V")
	public static void method2393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class29_Sub1 arg3, @OriginalArg(4) Class29_Sub1 arg4) {
		@Pc(4) Class9 local4 = Static157.method2295(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass29_Sub1_2 = arg3;
			local4.aClass29_Sub1_1 = arg4;
		}
	}
}
