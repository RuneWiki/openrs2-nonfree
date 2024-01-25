import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "Lclient!in;")
	public static Class157 aClass157_281;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_230 = new Class215(56, 2);

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
	public static int anInt10190 = 0;

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "[I")
	public static final int[] anIntArray657 = new int[1];

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
	public static int anInt10191 = 0;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BI)Z")
	public static boolean method8487(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "()V")
	public static void method8488() {
		for (@Pc(1) int local1 = 0; local1 < Static68.aClass366Array1.length; local1++) {
			Static68.aClass366Array1[local1].method8989();
		}
		Static68.aClass366Array1 = null;
	}
}
