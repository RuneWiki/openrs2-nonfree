import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!jn;")
	public static Class176 aClass176_121;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!jn;")
	public static Class176 aClass176_122;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "Lclient!f;")
	public static Class78 aClass78_31;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_199 = new Class362(72, 6);

	@OriginalMember(owner = "client!te", name = "m", descriptor = "I")
	public static int anInt9043 = 0;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray63 = new String[100];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)I")
	public static int method7384(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
	public static void method7386(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class153 local9 = Static165.aClass153Array1[99];
		for (@Pc(19) int local19 = 99; local19 > 0; local19--) {
			Static165.aClass153Array1[local19] = Static165.aClass153Array1[local19 - 1];
		}
		if (local9 == null) {
			local9 = new Class153(arg4, arg1, arg0, arg3, arg7, arg2, arg5, arg6);
		} else {
			local9.method3530(arg4, arg6, arg0, arg3, arg2, arg7, arg5, arg1);
		}
		Static450.anInt8504 = Static436.anInt8161;
		Static165.aClass153Array1[0] = local9;
		Static530.anInt9433++;
	}
}
