import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public static int anInt5904;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	public static int anInt5907;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	public static int anInt5902 = 0;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "Lclient!og;")
	public static Class127 aClass127_17 = null;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BC)C")
	public static char method4547(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)Lclient!v;")
	public static Class167 method4548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class167 local14 = local7.aClass167_1;
			local7.aClass167_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!ak;I)Z")
	public static boolean method4551(@OriginalArg(0) Class7 arg0) {
		return arg0.method242(Static37.anInt2944);
	}
}
