import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "[I")
	public static int[] anIntArray469;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "[Lclient!bo;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public static int anInt5102;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public static int anInt5103;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
	public static int[] anIntArray470 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!ci;")
	public static Class26 aClass26_48 = new Class26();

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!th;I)[Lclient!em;")
	public static Class46[] method3848(@OriginalArg(2) Class168 arg0, @OriginalArg(3) int arg1) {
		return Static131.method2257(0, arg0, arg1) ? Static138.method2307() : null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII)V")
	public static void method3849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg0 - arg3;
		@Pc(19) int local19 = arg1 - arg3;
		@Pc(23) int local23 = arg3 + arg2;
		@Pc(28) int local28 = arg4 + arg3;
		@Pc(30) int local30;
		for (local30 = arg2; local30 < local23; local30++) {
			Static98.method3942(arg0, Static121.anIntArrayArray33[local30], arg5, arg4);
		}
		for (local30 = arg1; local30 > local19; local30--) {
			Static98.method3942(arg0, Static121.anIntArrayArray33[local30], arg5, arg4);
		}
		for (local30 = local23; local30 <= local19; local30++) {
			@Pc(79) int[] local79 = Static121.anIntArrayArray33[local30];
			Static98.method3942(local28, local79, arg5, arg4);
			Static98.method3942(arg0, local79, arg5, local14);
		}
	}
}
