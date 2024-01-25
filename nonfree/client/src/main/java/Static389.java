import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!o", name = "n", descriptor = "Lclient!np;")
	public static Class228 aClass228_1;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString74;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!vea;")
	public static final Class352 aClass352_6 = new Class352(12, 0, 1, 0);

	@OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
	public static final int[] anIntArray351 = new int[14];

	@OriginalMember(owner = "client!o", name = "o", descriptor = "I")
	public static int anInt7300 = 100;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZ)V")
	public static void method6095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class6_Sub5_Sub19 local15 = Static348.method5721(arg0, 5);
		local15.method5179();
		local15.anInt6198 = arg1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
	public static void method6096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static248.method4430(local7.aClass9_Sub4_Sub1_2);
		Static248.method4430(local7.aClass9_Sub4_Sub1_1);
		if (local7.aClass9_Sub4_Sub1_2 != null) {
			local7.aClass9_Sub4_Sub1_2 = null;
		}
		if (local7.aClass9_Sub4_Sub1_1 != null) {
			local7.aClass9_Sub4_Sub1_1 = null;
		}
	}
}
