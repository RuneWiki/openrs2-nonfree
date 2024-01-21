import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!ig;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "Lclient!eh;")
	public static Class28 aClass28_166;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "[Lclient!nb;")
	public static Class2_Sub2_Sub17[] aClass2_Sub2_Sub17Array10;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[[Lclient!ae;")
	public static Class5[][] aClass5ArrayArray1;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "B")
	public static byte aByte10;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Lclient!eb;")
	public static Class25 aClass25_5;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "J")
	public static volatile long aLong123 = 0L;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "I")
	public static int anInt3598 = 0;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1034 = Static181.method2795("Abbrechen");

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Lclient!s;")
	public static final Class86 aClass86_46 = new Class86(64);

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1035 = Static181.method2795("Loaded interfaces");

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1036 = aClass83_1035;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)J")
	public static long method2694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3554; local13++) {
			@Pc(19) Class78 local19 = local7.aClass78Array3[local13];
			if ((local19.aLong107 >> 29 & 0x3L) == 2L && local19.anInt3028 == arg1 && local19.anInt3036 == arg2) {
				return local19.aLong107;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method2695() {
		Static18.aClass86_27.method2641();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!qe;Z)Lclient!qe;")
	public static Class83 method2696(@OriginalArg(0) Class83 arg0) {
		@Pc(7) Class2_Sub7 local7 = Static54.method1042(arg0);
		return local7 == null ? Static163.aClass83_958 : local7.aClass83_144;
	}
}
