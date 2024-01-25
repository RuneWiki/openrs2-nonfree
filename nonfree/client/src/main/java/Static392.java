import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
	public static int anInt7142;

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
	public static int anInt7143;

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
	public static int anInt7144;

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "Lclient!ab;")
	public static Class3 aClass3_19 = null;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIII)V")
	public static void method6134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub7_Sub2 local12 = Static328.method5290(11, arg1);
		local12.method1198();
		local12.anInt1465 = arg2;
		local12.anInt1462 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIZ)I")
	public static int method6135(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class2_Sub32 local8 = Static76.method1317(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray470.length > arg1) {
			return local8.anIntArray470[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLclient!g;)I")
	public static int method6137(@OriginalArg(1) Class83 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1958(Static54.anInt1177)) {
			local5++;
		}
		if (arg0.method1958(Static134.anInt2939)) {
			local5++;
		}
		if (arg0.method1958(Static184.anInt3902)) {
			local5++;
		}
		if (arg0.method1958(Static384.anInt6971)) {
			local5++;
		}
		if (arg0.method1958(Static327.anInt6034)) {
			local5++;
		}
		if (arg0.method1958(Static333.anInt6167)) {
			local5++;
		}
		if (arg0.method1958(Static276.anInt7136)) {
			local5++;
		}
		if (arg0.method1958(Static132.anInt2871)) {
			local5++;
		}
		if (arg0.method1958(Static359.anInt6584)) {
			local5++;
		}
		if (arg0.method1958(Static64.anInt1443)) {
			local5++;
		}
		if (arg0.method1958(Static185.anInt3926)) {
			local5++;
		}
		if (arg0.method1958(Static167.anInt3450)) {
			local5++;
		}
		if (arg0.method1958(Static353.anInt6489)) {
			local5++;
		}
		if (arg0.method1958(Static358.anInt6525)) {
			local5++;
		}
		if (arg0.method1958(Static303.anInt7069)) {
			local5++;
		}
		if (arg0.method1958(Static109.anInt2441)) {
			local5++;
		}
		return local5;
	}
}
