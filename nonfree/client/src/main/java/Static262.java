import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
	public static int anInt5078;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray20 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
	public static int anInt5079 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!eb;)Ljava/lang/String;")
	public static String method4604(@OriginalArg(1) Class1_Sub7 arg0) {
		return Static204.method3802(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method4605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
