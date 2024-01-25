import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZIIZI)Lclient!mn;")
	public static Class171 method1446(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(15) Class24 local15 = null;
		if (Static222.aClass201_4 != null) {
			local15 = new Class24(arg1, Static222.aClass201_4, Static174.aClass201Array1[arg1], 1000000);
		}
		Static156.aClass10_Sub1Array1[arg1] = Static108.aClass158_1.method3118(arg1, Static385.aClass24_4, local15);
		if (arg0) {
			Static156.aClass10_Sub1Array1[arg1].method5090();
		}
		return new Class171(Static156.aClass10_Sub1Array1[arg1], arg2, 1);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IBI)V")
	public static void method1447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg1, 1);
		local8.method2574();
		local8.anInt3131 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZ)I")
	public static int method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static267.anIntArray401[arg1 & 0x3] : 256;
	}
}
