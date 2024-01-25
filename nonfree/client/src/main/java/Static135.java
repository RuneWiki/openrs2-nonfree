import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "Lclient!cr;")
	public static Class44 aClass44_3;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_81 = new Class208(96, 7);

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	public static int anInt2943 = 127;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "Z")
	public static boolean aBoolean204 = true;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "Z")
	public static boolean aBoolean205 = true;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method2359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class168 local13 = local7.aClass168_2; local13 != null; local13 = local13.aClass168_1) {
			@Pc(17) Class1_Sub2 local17 = local13.aClass1_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort95 == arg1 && local17.aShort96 == arg2) {
				Static256.method4420(local17);
				return;
			}
		}
	}
}
