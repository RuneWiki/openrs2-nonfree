import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static302 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!o;Lclient!r;Lclient!r;B)V", line = 22)
	public static void method5545(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) Class197 arg2) {
		Static128.aClass197_33 = arg1;
		Class218.anInterface9_1 = arg0;
		Static285.aClass197_80 = arg2;
		if (Static128.aClass197_33 != null) {
			Class18.anInt554 = Static128.aClass197_33.method5082(1);
		}
		if (Static285.aClass197_80 != null) {
			Class237.anInt6756 = Static285.aClass197_80.method5082(1);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)Z", line = 48)
	public static boolean method5546(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static334.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) != 0;
	}
}
