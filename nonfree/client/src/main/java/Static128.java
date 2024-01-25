import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	public static int anInt2921;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	public static int anInt2926;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	public static int anInt2923 = 0;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_54 = new Class73(57, 10);

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_55 = new Class73(60, 1);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;IIIBIII)V")
	public static void method2565(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class98_Sub2 local7 = new Class98_Sub2();
		local7.anInt3181 = arg3;
		local7.anInt3183 = arg6;
		local7.aString25 = arg0;
		local7.anInt3182 = arg5;
		local7.anInt3185 = arg4;
		local7.anInt3187 = arg1;
		local7.anInt3184 = arg2 + Static312.anInt5688;
		Static328.aClass40_5.method1131(local7);
	}
}
