import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!ur", name = "Z", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_262 = new Class184(64, 1);

	@OriginalMember(owner = "client!ur", name = "ab", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_232 = new Class175("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!ur", name = "bb", descriptor = "[I")
	public static final int[] anIntArray499 = new int[2048];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZLclient!eo;)Ljava/lang/String;")
	public static String method5538(@OriginalArg(0) int arg0, @OriginalArg(2) Class68 arg1) {
		if (!Static56.method1160(arg1).method3485(arg0) && arg1.anObjectArray25 == null) {
			return null;
		} else if (arg1.aStringArray52 == null || arg1.aStringArray52.length <= arg0 || arg1.aStringArray52[arg0] == null || arg1.aStringArray52[arg0].trim().length() == 0) {
			return Static176.aBoolean278 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray52[arg0];
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V")
	public static void method5539(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static139.method2522(8, arg0);
		local13.method1563();
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)V")
	public static void method5540(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub3_Sub7 local10 = Static139.method2522(14, arg0);
		local10.method1563();
	}
}
