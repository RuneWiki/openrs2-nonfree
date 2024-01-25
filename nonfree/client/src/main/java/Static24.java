import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!au", name = "f", descriptor = "[Lclient!ha;")
	public static Class84[] aClass84Array2;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "I")
	public static int anInt388 = 0;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "I")
	public static int anInt390 = 0;

	@OriginalMember(owner = "client!au", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[6][];

	@OriginalMember(owner = "client!au", name = "i", descriptor = "I")
	public static int anInt394 = -60;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZLclient!mc;)Lclient!mc;")
	public static Class198 method499(@OriginalArg(1) Class198 arg0) {
		@Pc(6) Class198 local6 = Static67.method1534(arg0);
		if (local6 == null) {
			local6 = arg0.aClass198_8;
		}
		return local6;
	}
}
