import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static189 {

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!m;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "J")
	public static long aLong130 = 0L;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
	public static boolean aBoolean176 = false;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1093 = Static181.method2795(")2");

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1094 = Static181.method2795("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "[I")
	public static final int[] anIntArray370 = new int[256];

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1095 = Static181.method2795(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1096 = aClass83_1094;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
	public static int anInt3762 = -1;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array55 = new Class83[500];

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!dc;")
	public static final Class19 aClass19_19 = new Class19();

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1097 = Static181.method2795("leuchten2:");

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1098 = Static181.method2795("Sprites geladen)3");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lclient!qe;")
	public static Class83 method2861(@OriginalArg(1) int arg0) {
		return Static22.aClass83Array12[arg0].method2428() <= 0 ? aClass83Array55[arg0] : Static67.method1268(new Class83[] { aClass83Array55[arg0], Static162.aClass83_1135, Static22.aClass83Array12[arg0] });
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Z")
	public static boolean method2863(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
