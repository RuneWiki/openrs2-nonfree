import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "[I")
	public static int[] anIntArray442;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "J")
	public static long aLong206 = 0L;

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "[I")
	public static final int[] anIntArray443 = new int[4];

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLclient!ug;)Lclient!ic;")
	public static Class108 method5186(@OriginalArg(1) Class1_Sub28 arg0) {
		@Pc(12) Class108 local12 = new Class108();
		local12.anInt2743 = arg0.method5335();
		local12.aClass1_Sub5_Sub16_1 = Static456.aClass9_2.method145(local12.anInt2743);
		return local12;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)I")
	public static int method5187(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
