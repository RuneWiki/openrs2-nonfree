import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!mj;")
	public static Class159 aClass159_1;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	public static int anInt2184 = 0;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_30 = new Class212(35, 15);

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	public static int anInt2186 = 0;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
	public static int[] anIntArray192 = new int[2];

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_28 = new Class21("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
	public static final int[] anIntArray193 = new int[25];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI)V")
	public static void method1964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub1_Sub5 local13 = Static431.method5935(7, arg1);
		local13.method521();
		local13.anInt621 = arg0;
	}
}
