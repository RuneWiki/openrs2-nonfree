import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_24 = new Class44(51, 2);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "[I")
	public static final int[] anIntArray88 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!d", name = "f", descriptor = "I")
	public static int anInt1758 = 0;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!ra;")
	public static final Class208 aClass208_4 = new Class208(15, 0, 1, 0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method1256() {
		if (Static192.aBoolean146) {
			Static105.aClass76_6 = null;
			Static301.aClass76_14 = null;
			Static192.aBoolean146 = false;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I")
	public static int method1257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static177.anIntArray224[arg1 & 0x3] : Static273.anIntArray336[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBI)I")
	public static int method1259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg0;
		@Pc(28) int local28 = Static445.method6019(local7, local17);
		@Pc(37) int local37 = Static445.method6019(local7 + 1, local17);
		@Pc(44) int local44 = Static445.method6019(local7, local17 + 1);
		@Pc(53) int local53 = Static445.method6019(local7 + 1, local17 + 1);
		@Pc(60) int local60 = Static110.method1689(local13, local37, local28, arg2);
		@Pc(72) int local72 = Static110.method1689(local13, local53, local44, arg2);
		return Static110.method1689(local23, local72, local60, arg2);
	}
}
