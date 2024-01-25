import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
	public static int anInt6022;

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "Z")
	public static boolean aBoolean453 = false;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "Lclient!fh;")
	public static final Class73 aClass73_7 = new Class73("LIVE", 0);

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "Lclient!tf;")
	public static Class240 aClass240_13 = null;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZ[B)V")
	public static void method4986(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static422.aClass4_Sub20_8 == null) {
			Static422.aClass4_Sub20_8 = new Class4_Sub20(20000);
		}
		Static422.aClass4_Sub20_8.method4600(arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static413.method5730(Static422.aClass4_Sub20_8.aByteArray77);
		Static155.aClass82_Sub1Array3 = new Class82_Sub1[Static406.anInt6632];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = Static11.anInt210; local41 <= Static174.anInt3434; local41++) {
			@Pc(47) Class82_Sub1 local47 = Static7.method72(local41);
			if (local47 != null) {
				Static155.aClass82_Sub1Array3[local39++] = local47;
			}
		}
		Static162.aBoolean123 = false;
		Static170.aLong116 = Static167.method2929();
		Static422.aClass4_Sub20_8 = null;
	}
}
