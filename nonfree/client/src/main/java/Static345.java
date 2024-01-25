import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "Lclient!vj;")
	public static Class58 aClass58_47;

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
	public static int anInt6784;

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray41;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray86 = new String[200];

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_371 = new Class159("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "Z")
	public static boolean aBoolean488 = false;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)I")
	public static int method5676(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(26) int local26 = arg1 / arg2;
		@Pc(32) int local32 = arg1 & arg2 - 1;
		@Pc(37) int local37 = Static22.method376(local7, local26);
		@Pc(44) int local44 = Static22.method376(local7 + 1, local26);
		@Pc(51) int local51 = Static22.method376(local7, local26 + 1);
		@Pc(60) int local60 = Static22.method376(local7 + 1, local26 + 1);
		@Pc(67) int local67 = Static121.method4332(local37, local44, local13, arg2);
		@Pc(74) int local74 = Static121.method4332(local51, local60, local13, arg2);
		return Static121.method4332(local67, local74, local32, arg2);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!tj;ZLclient!tj;Lclient!tj;)V")
	public static void method5677(@OriginalArg(0) Class193 arg0, @OriginalArg(2) Class193 arg1, @OriginalArg(3) Class193 arg2) {
		Static90.aClass193_33 = arg0;
		Static77.method1880(arg2, arg1);
	}
}
