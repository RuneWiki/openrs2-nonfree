import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	public static int anInt2778;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array21;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "[Lclient!mi;")
	public static Class149[] aClass149Array1;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_35 = new Class183(51, 7);

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt2774 = -1;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_71 = new Class208(17, -2);

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "[I")
	public static final int[] anIntArray211 = new int[3];

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Z")
	public static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
	public static void method2227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 * Static228.anInt4592 >> 8;
		if (local9 != 0 && arg2 != -1) {
			Static126.method2209(Static311.aClass83_61, local9, arg2);
			Static361.aBoolean293 = true;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ab;I)V")
	public static void method2229(@OriginalArg(0) Class3 arg0) {
		if (Static301.anInt5605 == arg0.anInt39) {
			Static93.aBooleanArray10[arg0.anInt61] = true;
		}
	}
}
