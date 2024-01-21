import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4 aClass3_Sub2_Sub2_Sub4_6;

	@OriginalMember(owner = "client!pf", name = "fb", descriptor = "Lclient!dd;")
	public static Class19 aClass19_4;

	@OriginalMember(owner = "client!pf", name = "ob", descriptor = "[Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3[] aClass3_Sub2_Sub2_Sub3Array8;

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
	public static int anInt3147 = 0;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
	public static volatile int anInt3149 = 0;

	@OriginalMember(owner = "client!pf", name = "lb", descriptor = "Lclient!pa;")
	public static Class63 aClass63_21 = new Class63(100);

	@OriginalMember(owner = "client!pf", name = "mb", descriptor = "I")
	public static int anInt3160 = 0;

	@OriginalMember(owner = "client!pf", name = "nb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1034 = Static170.method3101("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!pf", name = "pb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1035 = Static170.method3101("This computers address has been blocked");

	@OriginalMember(owner = "client!pf", name = "qb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1036 = aClass28_1035;

	@OriginalMember(owner = "client!pf", name = "rb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1037 = Static170.method3101("titlebox");

	@OriginalMember(owner = "client!pf", name = "sb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1038 = Static170.method3101("<col=40ff00>");

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
	public static void method2453() {
		aClass28_1036 = null;
		aClass19_4 = null;
		aClass3_Sub2_Sub2_Sub3Array8 = null;
		aClass28_1034 = null;
		aClass3_Sub2_Sub2_Sub4_6 = null;
		aClass28_1035 = null;
		aClass28_1038 = null;
		aClass28_1037 = null;
		aClass63_21 = null;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)V")
	public static void method2454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass84_1 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIZ)V")
	public static void method2455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static2.anInt84; local1++) {
			if (arg3 < Static78.anIntArray382[local1] + Static24.anIntArray154[local1] && arg0 + arg3 > Static24.anIntArray154[local1] && arg2 < Static64.anIntArray332[local1] + Static166.anIntArray675[local1] && Static64.anIntArray332[local1] < arg2 + arg1) {
				Static118.aBooleanArray13[local1] = true;
			}
		}
	}
}
