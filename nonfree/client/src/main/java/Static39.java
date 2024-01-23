import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static39 {

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
	public static int anInt883;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
	public static int anInt884;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	public static int anInt882 = 0;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Lclient!db;")
	public static Class19 aClass19_5 = new Class19();

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_295 = Static200.method3116("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)Z")
	public static boolean method664(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[S[Lclient!kh;)V")
	public static void method665(@OriginalArg(1) short[] arg0, @OriginalArg(2) Class60[] arg1) {
		Static25.method426(arg1, 0, arg1.length - 1, arg0);
	}
}
