import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!lu", name = "F", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
	public static int anInt4415;

	@OriginalMember(owner = "client!lu", name = "L", descriptor = "Z")
	public static boolean aBoolean408 = false;

	@OriginalMember(owner = "client!lu", name = "M", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_164 = new Class67(53, -2);

	@OriginalMember(owner = "client!lu", name = "N", descriptor = "I")
	public static int anInt4420 = 0;

	@OriginalMember(owner = "client!lu", name = "O", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_74 = new Class242(58, 7);

	@OriginalMember(owner = "client!lu", name = "P", descriptor = "Z")
	public static boolean aBoolean409 = true;

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V")
	public static void method3518() {
		Static107.aBoolean183 = false;
		Static353.anInt5706 = 2;
		Static318.anInt5262 = -1;
		Static371.aClass185_97 = null;
		Static270.anInt1979 = 1;
		Static64.anInt996 = -1;
		Static451.anInt7187 = 0;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!jd;B)Z")
	public static boolean method3520(@OriginalArg(0) Class128 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean337) {
			return false;
		} else if (!arg0.method2737(Static430.anInterface12_2)) {
			return false;
		} else if (Static456.aClass208_21.method4405((long) arg0.anInt3498) == null) {
			return Static394.aClass208_36.method4405((long) arg0.anInt3484) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIII)V")
	public static void method3521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg3;
		@Pc(20) int local20 = -arg3;
		Static298.method3977(arg2 - arg3, arg1, arg3 + arg2, Static194.anIntArrayArray28[arg0]);
		@Pc(34) int local34 = -1;
		while (local17 > local15) {
			local34 += 2;
			local20 += local34;
			local15++;
			if (local20 >= 0) {
				local17--;
				local20 -= local17 << 1;
				@Pc(57) int[] local57 = Static194.anIntArrayArray28[local17 + arg0];
				@Pc(64) int[] local64 = Static194.anIntArrayArray28[arg0 - local17];
				@Pc(68) int local68 = arg2 + local15;
				@Pc(72) int local72 = arg2 - local15;
				Static298.method3977(local72, arg1, local68, local57);
				Static298.method3977(local72, arg1, local68, local64);
			}
			@Pc(88) int local88 = arg2 + local17;
			@Pc(93) int local93 = arg2 - local17;
			@Pc(99) int[] local99 = Static194.anIntArrayArray28[local15 + arg0];
			@Pc(106) int[] local106 = Static194.anIntArrayArray28[arg0 - local15];
			Static298.method3977(local93, arg1, local88, local99);
			Static298.method3977(local93, arg1, local88, local106);
		}
	}
}
