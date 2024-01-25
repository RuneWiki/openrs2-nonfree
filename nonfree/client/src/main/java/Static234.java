import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "Lclient!ke;")
	public static Class135 aClass135_1;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
	public static int anInt3750 = 0;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
	public static int anInt3754 = 1;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_30 = new Class132(4);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
	public static void method3027(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static161.anIntArray528[local7] = Static161.anIntArray528[local7 - 1];
			Static412.anIntArray563[local7] = Static412.anIntArray563[local7 - 1];
			Static70.aStringArray6[local7] = Static70.aStringArray6[local7 - 1];
			Static109.aStringArray7[local7] = Static109.aStringArray7[local7 - 1];
			Static240.aStringArray22[local7] = Static240.aStringArray22[local7 - 1];
			Static147.aStringArray11[local7] = Static147.aStringArray11[local7 - 1];
			Static92.anIntArray138[local7] = Static92.anIntArray138[local7 - 1];
		}
		Static161.anIntArray528[0] = arg3;
		Static412.anIntArray563[0] = arg0;
		Static70.aStringArray6[0] = arg5;
		Static109.aStringArray7[0] = arg6;
		Static240.aStringArray22[0] = arg1;
		Static115.anInt2129++;
		Static147.aStringArray11[0] = arg2;
		Static92.anIntArray138[0] = arg4;
		Static248.anInt3993 = anInt3754;
	}
}
