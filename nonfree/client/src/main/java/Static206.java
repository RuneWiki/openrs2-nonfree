import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
	public static int anInt4590;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	public static int anInt4570 = 0;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
	public static int anInt4587 = -1;

	@OriginalMember(owner = "client!pl", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString147 = "glow2:";

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!kb;I)I")
	public static int method3656(@OriginalArg(0) Class83 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method2302(Static46.anInt6184)) {
			local1++;
		}
		if (arg0.method2302(Static270.anInt5838)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIZII)I")
	public static int method3661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(26) int local26 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg0 : arg1) : arg2;
		@Pc(38) int local38 = local7 < 8 ? arg0 : arg2;
		return ((local7 & 0x1) == 0 ? local38 : -local38) + ((local7 & 0x2) == 0 ? local26 : -local26);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
	public static void method3662(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static15.aBooleanArray1[arg0]) {
			return;
		}
		Static110.aClass83_70.method2301(arg0);
		if (Static81.aClass116ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(28) boolean local28 = true;
		for (@Pc(30) int local30 = 0; local30 < Static81.aClass116ArrayArray1[arg0].length; local30++) {
			if (Static81.aClass116ArrayArray1[arg0][local30] != null) {
				if (Static81.aClass116ArrayArray1[arg0][local30].anInt4376 == 2) {
					local28 = false;
				} else {
					Static81.aClass116ArrayArray1[arg0][local30] = null;
				}
			}
		}
		if (local28) {
			Static81.aClass116ArrayArray1[arg0] = null;
		}
		Static15.aBooleanArray1[arg0] = false;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
	public static void method3663() {
		Static75.aClass155_11.method4362();
		Static9.aClass155_2.method4362();
		Static18.aClass155_6.method4362();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)V")
	public static void method3664(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static104.method831(arg0, 8);
		local8.method1189();
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
	public static void method3665() {
		Static99.aClass155_17.method4354();
		Static285.aClass155_46.method4354();
	}
}
