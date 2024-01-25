import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static250 {

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "Lclient!np;")
	public static Class264 aClass264_1;

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIILclient!ka;I)Lclient!it;")
	public static Class187 method3479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class45 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class187(arg1, arg3, arg0, arg2.na(), arg2.V(), arg2.RA(), arg2.fa(), arg2.EA(), arg2.HA(), arg2.G());
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;)V")
	public static void method3480(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1) {
		Static406.aHashtable5.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)V")
	public static void method3481() {
		Static108.aClass85_13.method1748();
		Static253.aClass85_29.method1748();
	}
}
