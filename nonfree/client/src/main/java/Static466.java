import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!qs", name = "D", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_135 = new Class337(109, -1);

	@OriginalMember(owner = "client!qs", name = "J", descriptor = "[B")
	public static final byte[] aByteArray75 = new byte[2048];

	@OriginalMember(owner = "client!qs", name = "K", descriptor = "Z")
	public static boolean aBoolean553 = false;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "(I)V")
	public static void method6902() {
		Static78.aClass87_48.method1801();
		Static207.aClass87_105.method1801();
		Static395.aClass87_165.method1801();
		Static393.aClass87_249.method1801();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I[B)[B")
	public static byte[] method6904(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local6];
		Static652.method4548(arg0, 0, local16, 0, local6);
		return local16;
	}
}
