import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!oh", name = "M", descriptor = "Lclient!rn;")
	public static Class155 aClass155_85;

	@OriginalMember(owner = "client!oh", name = "O", descriptor = "Lclient!eh;")
	public static Class43 aClass43_3;

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "Lclient!l;")
	public static Class98 aClass98_32 = new Class98(100);

	@OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
	public static int anInt3956 = 1;

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
	public static int anInt3957 = -2;

	@OriginalMember(owner = "client!oh", name = "V", descriptor = "Z")
	public static boolean aBoolean280 = true;

	@OriginalMember(owner = "client!oh", name = "Y", descriptor = "Lclient!kh;")
	public static Class3_Sub18 aClass3_Sub18_1 = new Class3_Sub18(0, 0);

	@OriginalMember(owner = "client!oh", name = "Z", descriptor = "Z")
	public static boolean aBoolean281 = false;

	@OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
	public static int anInt3962 = -1;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)Lclient!vj;")
	public static Class77 method3339() {
		try {
			return (Class77) Class.forName("Class77_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(III)Lclient!cb;")
	public static Class23 method3340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class23 local14 = local7.aClass23_1;
			local7.aClass23_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(Z)V")
	public static void method3342() {
		Static18.anImage1 = null;
		Static282.aFontMetrics1 = null;
		Static118.aFont1 = null;
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(III)Lclient!bl;")
	public static Class19 method3343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass19_1;
	}
}
