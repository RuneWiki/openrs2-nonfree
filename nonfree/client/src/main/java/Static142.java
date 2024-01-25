import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!eha", name = "eb", descriptor = "I")
	public static int anInt2646;

	// $FF: synthetic field
	@OriginalMember(owner = "client!eha", name = "X", descriptor = "Ljava/lang/Class;")
	public static Class aClass10;

	@OriginalMember(owner = "client!eha", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!eha", name = "ab", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_9 = new Class320(0);

	@OriginalMember(owner = "client!eha", name = "w", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_36 = new Class397(70, 7);

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(II[S)[S")
	public static short[] method2418(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static732.method6319(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
