import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!wca", name = "y", descriptor = "I")
	public static int anInt10293 = -1;

	@OriginalMember(owner = "client!wca", name = "B", descriptor = "[I")
	public static final int[] anIntArray629 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!wca", name = "G", descriptor = "[I")
	public static int[] anIntArray630 = new int[1];

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method8701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILclient!rg;)Lclient!be;")
	public static Class6_Sub4 method8702(@OriginalArg(1) Class6_Sub40 arg0) {
		arg0.method8604();
		@Pc(13) int local13 = arg0.method8604();
		@Pc(25) Class6_Sub4 local25 = Static240.method4163(local13);
		local25.anInt9849 = arg0.method8604();
		@Pc(34) int local34 = arg0.method8604();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(42) int local42 = arg0.method8604();
			local25.method8314(local42, arg0);
		}
		local25.method8315();
		return local25;
	}
}
