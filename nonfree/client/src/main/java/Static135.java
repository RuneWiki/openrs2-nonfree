import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!hu", name = "J", descriptor = "Lclient!nl;")
	public static Class171 aClass171_46;

	@OriginalMember(owner = "client!hu", name = "C", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_58 = new Class11(12, 3);

	@OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
	public static final int anInt3519 = -1;

	@OriginalMember(owner = "client!hu", name = "H", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_76 = new Class205(34, 17);

	@OriginalMember(owner = "client!hu", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray28 = new int[128][128];

	@OriginalMember(owner = "client!hu", name = "K", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIII)V")
	public static void method3218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static243.anInt4326 && arg1 <= Static235.anInt4193) {
			@Pc(24) int local24 = Static93.method1862(arg3, Static40.anInt818, Static138.anInt932);
			@Pc(30) int local30 = Static93.method1862(arg2, Static40.anInt818, Static138.anInt932);
			Static3.method80(local24, arg1, arg0, local30);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V")
	public static void method3221() {
		@Pc(6) Class160 local6 = Static28.aClass160_3;
		synchronized (Static28.aClass160_3) {
			Static28.aClass160_3.method3605();
		}
	}
}
