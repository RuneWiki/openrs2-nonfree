import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "I")
	public static int anInt2584;

	@OriginalMember(owner = "client!bda", name = "q", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "Z")
	public static boolean aBoolean194 = false;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIII)V")
	public static void method2205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static55.anInt1982 / (float) Static55.anInt1972;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg3);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(39) int local39 = arg0 - (arg3 - local11) / 2;
		@Pc(48) int local48 = arg2 - (arg1 - local13) / 2;
		Static129.anInt2692 = Static55.anInt1982 - Static55.anInt1982 * local48 / local13;
		Static256.anInt5191 = Static55.anInt1972 * local39 / local11;
		Static152.anInt3124 = -1;
		Static531.anInt9235 = -1;
		Static374.method5885();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(III)Z")
	public static boolean method2208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static151.method2597(arg1, arg0) || Static424.method6501(arg1, arg0);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBLclient!kea;)Lclient!cq;")
	public static Class53 method2210(@OriginalArg(0) int arg0, @OriginalArg(2) Class161 arg1) {
		@Pc(8) byte[] local8 = arg1.method4265(arg0);
		return local8 == null ? null : new Class53(local8);
	}
}
