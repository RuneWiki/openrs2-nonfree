import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!fe;")
	public static Class100 aClass100_1;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
	public static void method3643() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static258.aBooleanArray27[local7] = true;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZI)V")
	public static void method3644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class171 local9 = Static82.aClass171ArrayArray1[arg2][arg1];
		Static467.method6541(local9 == null ? Static295.aClass171_2 : local9, arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
	public static void method3646() {
		Static345.aClass4_19 = null;
		Static16.anInt312 = -1;
	}
}
