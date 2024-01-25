import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_16 = new Class156();

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	public static int anInt2667 = 0;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_18 = new Class132(4);

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_52 = new Class134(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	public static int anInt2668 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method2191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
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
