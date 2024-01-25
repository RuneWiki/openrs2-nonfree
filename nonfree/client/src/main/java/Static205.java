import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "[S")
	public static short[] aShortArray67 = new short[256];

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray96 = new String[100];

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_53 = new Class32("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLclient!ae;)V")
	public static void method3476(@OriginalArg(1) Class4 arg0) {
		@Pc(7) Class4 local7 = Static368.method4611(arg0);
		@Pc(17) int local17;
		@Pc(20) int local20;
		if (local7 == null) {
			local17 = Static253.anInt4467;
			local20 = Static362.anInt6102;
		} else {
			local17 = local7.anInt101;
			local20 = local7.anInt113;
		}
		Static186.method3210(local17, local20, false, arg0);
		Static82.method1235(local20, local17, arg0);
	}
}
