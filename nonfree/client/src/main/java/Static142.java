import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "Lclient!cs;")
	public static Class55 aClass55_4;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_171 = new Class73(16, -2);

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "[I")
	public static final int[] anIntArray712 = new int[8];

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
	public static int anInt9522 = 0;

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "[I")
	public static final int[] anIntArray713 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_172 = new Class73(114, -1);

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_151 = new Class47(70, -1);

	@OriginalMember(owner = "client!fm", name = "J", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_152 = new Class47(62, 15);

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZZIIILjava/lang/String;JLjava/lang/String;III)V")
	public static void method7766(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) long arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static587.aBoolean734 && Static421.anInt7365 < 500) {
			@Pc(18) int local18 = arg8 == -1 ? Static245.anInt4901 : arg8;
			@Pc(32) Class6_Sub45 local32 = new Class6_Sub45(arg4, arg6, local18, arg3, arg2, arg5, arg9, arg7, arg1, arg0);
			Static182.aClass361_23.method7833(local32);
			Static421.anInt7365++;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!pfa;B)V")
	public static void method7768(@OriginalArg(0) Class251 arg0) {
		Static84.anInt1707 = arg0.method5764("p11_full");
		Static67.anInt1401 = arg0.method5764("p12_full");
		Static573.anInt9405 = arg0.method5764("b12_full");
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)V")
	public static void method7769(@OriginalArg(1) int arg0) {
		Static29.anInt856 = -1;
		Static39.anInt4953 = arg0;
		Static562.anInt9257 = -1;
		Static125.method7473();
	}
}
