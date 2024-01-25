import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!nca;")
	public static Class254 aClass254_153;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Lclient!iga;")
	public static Class176 aClass176_5;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Lclient!ha;")
	public static Class145 aClass145_14;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "Lclient!ha;")
	public static Class145 aClass145_15;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "I")
	public static final int anInt9459 = 1;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBI)I")
	public static int method8343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = (arg2 * (arg0 & 0xFF00) & 0xFF0000 | arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(32) int local32 = 255 - arg2;
		return (((arg1 & 0xFF00FF) * local32 & 0xFF00FF00 | (arg1 & 0xFF00) * local32 & 0xFF0000) >>> 8) + local21;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLclient!oh;)V")
	public static void method8345(@OriginalArg(1) Class273 arg0) {
		if (arg0.anInt7371 == 5 && arg0.anInt7415 != -1) {
			Static160.method2367(Static396.aClass145_6, arg0);
		}
	}
}
