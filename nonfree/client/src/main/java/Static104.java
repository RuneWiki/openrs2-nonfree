import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!kg", name = "R", descriptor = "[I")
	public static int[] anIntArray191;

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_700 = Static81.method1507("hint_mapmarkers");

	@OriginalMember(owner = "client!kg", name = "T", descriptor = "Lclient!l;")
	public static final Class57 aClass57_21 = new Class57(4096);

	@OriginalMember(owner = "client!kg", name = "U", descriptor = "[I")
	public static final int[] anIntArray192 = new int[256];

	@OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
	public static int anInt2346 = 0;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Lclient!ve;B)V")
	public static void method1808(@OriginalArg(0) Class69 arg0) {
		Static194.aClass69_37 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(JLclient!dj;SIBLclient!dj;I)V")
	public static void method1811(@OriginalArg(0) long arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class24 arg4, @OriginalArg(6) int arg5) {
		if (Static53.aBoolean73 || Static156.anInt3437 >= 500) {
			return;
		}
		Static27.aClass24Array4[Static156.anInt3437] = arg1;
		Static66.aClass24Array11[Static156.anInt3437] = arg4;
		Static98.aShortArray28[Static156.anInt3437] = arg2;
		Static197.aLongArray36[Static156.anInt3437] = arg0;
		Static210.anIntArray412[Static156.anInt3437] = arg3;
		Static17.anIntArray38[Static156.anInt3437] = arg5;
		Static156.anInt3437++;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)Z")
	public static boolean method1812(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)V")
	public static void method1813() {
		Static176.aClass1_Sub7_Sub1_34.method2808(252);
		Static176.aClass1_Sub7_Sub1_34.method2801(0L);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLclient!vc;)V")
	public static void method1814(@OriginalArg(1) Class98 arg0) {
		@Pc(11) int local11 = arg0.anInt4367 == 0 ? arg0.anInt4400 : arg0.anInt4367;
		@Pc(23) int local23 = arg0.anInt4347 == 0 ? arg0.anInt4403 : arg0.anInt4347;
		Static9.method230(local23, Static4.aClass98ArrayArray3[arg0.anInt4357 >> 16], arg0.anInt4357, local11);
		if (arg0.aClass98Array3 != null) {
			Static9.method230(local23, arg0.aClass98Array3, arg0.anInt4357, local11);
		}
		@Pc(63) Class1_Sub11 local63 = (Class1_Sub11) Static115.aClass57_25.method1872((long) arg0.anInt4357);
		if (local63 != null) {
			Static21.method477(local11, local23, local63.anInt2169);
		}
	}
}
