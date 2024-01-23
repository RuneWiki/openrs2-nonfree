import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!l;")
	public static Class98 aClass98_10 = new Class98(50);

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
	public static int[] anIntArray110 = new int[2];

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString53 = "Loading fonts - ";

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ue;Lclient!rn;ILclient!rn;Lclient!rn;)Z")
	public static boolean method1011(@OriginalArg(0) Class3_Sub15_Sub4 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(3) Class155 arg2, @OriginalArg(4) Class155 arg3) {
		Static81.aClass155_37 = arg1;
		Static259.aClass155_108 = arg2;
		Static141.aClass155_61 = arg3;
		Static204.aClass3_Sub15_Sub4_3 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!rn;B)I")
	public static int method1013(@OriginalArg(0) Class155 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4133(Static310.anInt6109)) {
			local5++;
		}
		if (arg0.method4133(Static18.anInt341)) {
			local5++;
		}
		if (arg0.method4133(Static9.anInt188)) {
			local5++;
		}
		if (arg0.method4133(Static292.anInt5825)) {
			local5++;
		}
		if (arg0.method4133(Static206.anInt4073)) {
			local5++;
		}
		if (arg0.method4133(Static145.anInt2767)) {
			local5++;
		}
		if (arg0.method4133(Static250.anInt5140)) {
			local5++;
		}
		if (arg0.method4133(Static67.anInt1238)) {
			local5++;
		}
		if (arg0.method4133(Static107.anInt1964)) {
			local5++;
		}
		if (arg0.method4133(Static166.anInt3122)) {
			local5++;
		}
		if (arg0.method4133(Static123.anInt2332)) {
			local5++;
		}
		if (arg0.method4133(Static112.anInt5730)) {
			local5++;
		}
		if (arg0.method4133(Static75.anInt1407)) {
			local5++;
		}
		if (arg0.method4133(Static6.anInt132)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIILclient!qf;IJ)Z")
	public static boolean method1014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class10 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static144.method4032(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public static void method1015() {
		for (@Pc(17) int local17 = 0; local17 < Static284.anInt5706; local17++) {
			@Pc(28) Class24 local28 = Static255.method4308(local17);
			if (local28 != null && local28.anInt606 == 0) {
				Static229.anIntArray496[local17] = 0;
				Static161.anIntArray347[local17] = 0;
			}
		}
		Static187.aClass30_20 = new Class30(16);
	}
}
