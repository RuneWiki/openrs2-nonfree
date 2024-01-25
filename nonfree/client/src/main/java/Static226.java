import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!ph;")
	public static Class187 aClass187_75;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	public static int anInt4216;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
	public static int[] anIntArray421;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	public static int anInt4217;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!vp;")
	public static Class262 aClass262_5;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_70 = new Class27(78, 2);

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!s;")
	public static final Class217 aClass217_95 = new Class217(37, 2);

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!s;")
	public static final Class217 aClass217_96 = new Class217(93, 4);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)I")
	public static int method3379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Z")
	public static boolean method3380() {
		if (Static414.aBoolean454) {
			try {
				Static464.method2259(Static171.aClass159_1.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return false;
	}
}
