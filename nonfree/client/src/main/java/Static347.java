import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
	public static int anInt5590 = 0;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "[I")
	public static final int[] anIntArray407 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZIIZI)I")
	public static int method4496(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(15) Class1_Sub28 local15 = Static133.method1698(false, arg2);
		if (local15 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local15.anIntArray291.length; local23++) {
			if (local15.anIntArray291[local23] >= 0 && Static285.aClass226_2.anInt5944 > local15.anIntArray291[local23]) {
				@Pc(48) Class135 local48 = Static285.aClass226_2.method4788(local15.anIntArray291[local23]);
				@Pc(58) int local58 = local48.method2993(Static256.aClass136_1.method3016(arg0).anInt953, arg0);
				if (arg1) {
					local21 += local58 * local15.anIntArray292[local23];
				} else {
					local21 += local58;
				}
			}
		}
		return local21;
	}
}
