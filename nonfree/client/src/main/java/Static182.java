import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
	public static int anInt3398;

	@OriginalMember(owner = "client!nn", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString117 = "Unable to find ";

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "(I)V")
	public static void method2761() {
		Static285.aClass31_44.method855();
		Static150.aClass31_24.method855();
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)I")
	public static int method2762(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = arg0 - 1;
		@Pc(14) int local14 = local8 | local8 >>> 1;
		@Pc(20) int local20 = local14 | local14 >>> 2;
		@Pc(30) int local30 = local20 | local20 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}
}
