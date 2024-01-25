import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
	public static int anInt9745;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
	public static int anInt9749;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_249 = new Class160(69, 6);

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "Lclient!eq;")
	public static Class101 aClass101_5 = new Class101();

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "F")
	public static float aFloat190 = 0.0F;

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
	public static int anInt9748 = 0;

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "[I")
	public static final int[] anIntArray507 = new int[13];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!rg;)I")
	public static int method8384(@OriginalArg(1) Class310 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method7785(Static391.anInt6810)) {
			local5++;
		}
		if (arg0.method7785(Static115.anInt1891)) {
			local5++;
		}
		if (arg0.method7785(Static149.anInt2316)) {
			local5++;
		}
		if (arg0.method7785(Static8.anInt86)) {
			local5++;
		}
		if (arg0.method7785(Static465.anInt7803)) {
			local5++;
		}
		if (arg0.method7785(Static213.anInt5856)) {
			local5++;
		}
		if (arg0.method7785(Static484.anInt7503)) {
			local5++;
		}
		if (arg0.method7785(Static36.anInt609)) {
			local5++;
		}
		if (arg0.method7785(Static351.anInt11028)) {
			local5++;
		}
		if (arg0.method7785(Static253.anInt4769)) {
			local5++;
		}
		if (arg0.method7785(Static521.anInt8909)) {
			local5++;
		}
		if (arg0.method7785(Static47.anInt779)) {
			local5++;
		}
		if (arg0.method7785(Static602.anInt9931)) {
			local5++;
		}
		if (arg0.method7785(Static525.anInt9039)) {
			local5++;
		}
		if (arg0.method7785(Static440.anInt2580)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)I")
	public static int method8385() {
		return Static450.anInt7526;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ada;Lclient!ha;I)I")
	public static int method8386(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class144 arg1) {
		if (arg0.anInt66 != -1) {
			return arg0.anInt66;
		}
		if (arg0.anInt59 != -1) {
			@Pc(30) Class69 local30 = arg1.anInterface4_12.method8975(arg0.anInt59);
			if (!local30.aBoolean110) {
				return local30.aShort5;
			}
		}
		return arg0.anInt68;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIBI)V")
	public static void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(15) int local15 = arg4 + arg2;
		for (@Pc(17) int local17 = arg4; local17 < local15; local17++) {
			Static240.method4038(arg0, Static144.anIntArrayArray30[local17], arg5, arg3);
		}
		for (@Pc(39) int local39 = arg1; local39 > local10; local39--) {
			Static240.method4038(arg0, Static144.anIntArrayArray30[local39], arg5, arg3);
		}
		@Pc(61) int local61 = arg3 + arg2;
		@Pc(66) int local66 = arg0 - arg2;
		for (@Pc(68) int local68 = local15; local68 <= local10; local68++) {
			@Pc(84) int[] local84 = Static144.anIntArrayArray30[local68];
			Static240.method4038(local61, local84, arg5, arg3);
			Static240.method4038(arg0, local84, arg5, local66);
		}
	}
}
