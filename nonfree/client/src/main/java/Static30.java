import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
	public static int anInt777;

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
	public static int anInt775 = 0;

	@OriginalMember(owner = "client!bn", name = "A", descriptor = "[Lclient!eb;")
	public static final Class1_Sub7[] aClass1_Sub7Array1 = new Class1_Sub7[2048];

	@OriginalMember(owner = "client!bn", name = "G", descriptor = "I")
	public static int anInt780 = 0;

	@OriginalMember(owner = "client!bn", name = "K", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZZIZI)Lclient!qj;")
	public static Class165 method855(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) Class173 local5 = null;
		if (Static70.aClass69_1 != null) {
			local5 = new Class173(arg1, Static70.aClass69_1, Static143.aClass69Array1[arg1], 1000000);
		}
		Static111.aClass56_Sub1Array1[arg1] = Static144.aClass115_1.method3453(Static38.aClass173_6, local5, arg1);
		if (arg2) {
			Static111.aClass56_Sub1Array1[arg1].method1643();
		}
		return new Class165(Static111.aClass56_Sub1Array1[arg1], arg0, 1);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBIII)V")
	public static void method858(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static342.anInt2146 / (float) Static342.anInt2148;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg1);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(40) int local40 = arg2 - (arg1 - local11) / 2;
		@Pc(48) int local48 = arg3 - (arg0 - local13) / 2;
		Static90.anInt1760 = Static342.anInt2148 * local40 / local11;
		Static202.anInt4094 = -1;
		Static185.anInt1061 = Static342.anInt2146 - local48 * Static342.anInt2146 / local13;
		Static215.anInt4248 = -1;
		Static346.method5645();
	}
}
