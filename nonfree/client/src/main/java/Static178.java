import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gea", name = "t", descriptor = "Z")
	public static final boolean aBoolean244 = false;

	@OriginalMember(owner = "client!gea", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIII)I")
	public static int method3117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = arg0 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(18) int local18 = arg4;
			arg4 = arg5;
			arg5 = local18;
		}
		if (local11 == 0) {
			return arg2;
		} else if (local11 == 1) {
			return arg3;
		} else if (local11 == 2) {
			return 7 + 1 - arg2 - arg4;
		} else {
			return 7 + 1 - arg3 - arg5;
		}
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)I")
	public static int method3119() {
		if (Static490.aBoolean536) {
			return 6;
		} else if (Static396.aClass5_Sub1_Sub13_2 == null) {
			return 0;
		} else {
			@Pc(16) int local16 = Static396.aClass5_Sub1_Sub13_2.anInt6068;
			if (Static161.method2974(local16)) {
				return 1;
			} else if (Static412.method6083(local16)) {
				return 2;
			} else if (Static126.method1893(local16)) {
				return 3;
			} else if (Static250.method4080(local16)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
