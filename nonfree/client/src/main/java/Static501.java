import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!uw", name = "E", descriptor = "I")
	public static int anInt8506;

	@OriginalMember(owner = "client!uw", name = "G", descriptor = "I")
	public static int anInt8508;

	@OriginalMember(owner = "client!uw", name = "A", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_135 = new Class6(72, 12);

	@OriginalMember(owner = "client!uw", name = "Q", descriptor = "I")
	public static int anInt8516 = 0;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!kda;BLclient!qa;)V")
	public static void method7180(@OriginalArg(0) Class160 arg0, @OriginalArg(2) Class9 arg1) {
		if (Static268.aBoolean349) {
			return;
		}
		arg1.Z(0);
		Static530.aClass12_22 = arg1.method7625(Static559.method5940(arg0, Static355.anInt1773));
		Static530.aClass12_22.method7191((Static290.anInt6867 - Static530.aClass12_22.EA()) / 2, (Static90.anInt2326 - Static530.aClass12_22.ma()) / 2);
		Static505.aClass12_21 = arg1.method7625(Static559.method5940(arg0, Static389.anInt6795));
		Static505.aClass12_21.method7191((Static290.anInt6867 - Static505.aClass12_21.EA()) / 2, 18);
		Static268.aBoolean349 = true;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BII)Z")
	public static boolean method7183(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "(B)V")
	public static void method7184() {
		for (@Pc(4) Class2_Sub8 local4 = (Class2_Sub8) Static326.aClass145_6.method3928(); local4 != null; local4 = (Class2_Sub8) Static326.aClass145_6.method3928()) {
			Static383.method7639(local4);
		}
		@Pc(32) int local32;
		@Pc(31) int local31;
		if (Static89.aClass1_Sub28_Sub1_1.method4266(Static526.anInt8926)) {
			local32 = 0;
			local31 = 3;
		} else {
			local31 = Static435.anInt7457;
			local32 = Static435.anInt7457;
		}
		Static62.method1746();
		for (@Pc(40) int local40 = local32; local40 <= local31; local40++) {
			Static62.method1759();
			Static62.method1748(local40);
			Static62.method1741(local40);
		}
		Static62.method1750();
		Static62.method1757();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!kda;IBI)Lclient!lo;")
	public static Class1_Sub1_Sub12 method7185(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub13 local12 = new Class1_Sub13(arg0.method4198(arg1, arg2));
		@Pc(43) Class1_Sub1_Sub12 local43 = new Class1_Sub1_Sub12(arg1, local12.method3034(), local12.method3034(), local12.method3037(), local12.method3037(), local12.method3043() == 1, local12.method3043(), local12.method3043());
		@Pc(47) int local47 = local12.method3043();
		for (@Pc(49) int local49 = 0; local49 < local47; local49++) {
			local43.aClass38_40.method1426(new Class1_Sub35(local12.method3043(), local12.method3056(), local12.method3056(), local12.method3056(), local12.method3056(), local12.method3056(), local12.method3056(), local12.method3056(), local12.method3056()));
		}
		local43.method4791();
		return local43;
	}
}
