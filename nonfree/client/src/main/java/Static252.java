import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	public static int anInt4465;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "[[Lclient!jf;")
	public static Class119[][] aClass119ArrayArray1;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_63 = new Class32("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILclient!jf;B)V")
	public static void method3970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class119 arg2) {
		aClass119ArrayArray1[arg0][arg1] = arg2;
	}
}
