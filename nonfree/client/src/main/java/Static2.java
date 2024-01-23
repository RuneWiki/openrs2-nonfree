import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "[Lclient!fe;")
	public static Class2_Sub3_Sub8_Sub1[] aClass2_Sub3_Sub8_Sub1Array1;

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "Lclient!qe;")
	private static Class78 aClass78_11 = Static199.method3560("Examine");

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_5 = aClass78_11;

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
	public static int anInt42 = 0;

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "Lclient!qe;")
	private static Class78 aClass78_6 = Static199.method3560("Loading config )2 ");

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
	public static int anInt44 = 0;

	@OriginalMember(owner = "client!aa", name = "G", descriptor = "Lclient!qe;")
	public static Class78 aClass78_8 = aClass78_6;

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "Lclient!qe;")
	public static Class78 aClass78_9 = Static199.method3560("mapflag");

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "[S")
	public static short[] aShortArray3 = new short[256];

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "Lclient!qe;")
	public static Class78 aClass78_10 = Static199.method3560(": ");

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "Lclient!ui;")
	public static Class103 aClass103_1 = new Class103(16);

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "Z")
	public static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Lclient!uc;")
	public static Class100 method25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt775; local13++) {
			@Pc(19) Class100 local19 = local7.aClass100Array3[local13];
			if ((local19.aLong169 >> 29 & 0x3L) == 2L && local19.anInt4529 == arg1 && local19.anInt4517 == arg2) {
				Static55.method715(local19);
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	public static void method27() {
		Static89.aClass53_6.method1797();
		Static17.aClass53_2.method1797();
	}
}
