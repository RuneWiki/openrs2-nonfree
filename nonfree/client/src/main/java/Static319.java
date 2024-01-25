import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!uj;")
	public static final Class244 aClass244_4 = new Class244();

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	public static int anInt1933 = 0;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "[I")
	public static final int[] anIntArray114 = new int[1024];

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	public static int anInt1935 = 2;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_36 = new Class217(27, -1);

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
	public static int anInt1936 = -1;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
	public static boolean method1503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static435.method5712(arg1, arg0) || Static286.method1099(arg0, arg1);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	public static void method1505() {
		Static109.aBoolean215 = false;
		Static65.anInt1688 = 0;
		Static254.anInt4793 = 1;
		Static124.anInt7629 = -1;
		Static97.anInt2201 = -3;
		Static80.anInt2007 = 0;
		Static362.anInt6126 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBIII)I")
	public static int method1506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(26) int local26 = 65536 - Class3_Sub2_Sub17.anIntArray290[arg1 * 8192 / arg2] >> 1;
		return (arg3 * local26 >> 16) + (arg0 * (65536 - local26) >> 16);
	}
}
