import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static207 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
	public static int anInt3882;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public static int anInt3884;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public static void method3359() {
		Static469.anInt8085 = 0;
		Static310.aClass217Array1 = new Class217[50];
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	public static void method3360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static348.method5412(arg0)) {
			Static81.method1436(Static139.aClass220ArrayArray1[arg0], arg1);
		}
	}
}
