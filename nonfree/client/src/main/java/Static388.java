import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!hq;)V")
	public static void method5359(@OriginalArg(1) Class2_Sub20_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static390.anInt6850; local3++) {
			@Pc(9) int local9 = Static389.anIntArray456[local3];
			@Pc(13) Class4_Sub2_Sub2_Sub1 local13 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local9];
			@Pc(17) int local17 = arg0.method3737();
			if ((local17 & 0x8) != 0) {
				local17 += arg0.method3737() << 8;
			}
			if ((local17 & 0x1000) != 0) {
				local17 += arg0.method3737() << 16;
			}
			Static379.method5282(local13, local17, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZB)V")
	public static void method5360(@OriginalArg(0) boolean arg0) {
		for (@Pc(14) Class2_Sub23 local14 = (Class2_Sub23) Static48.aClass265_11.method6005(); local14 != null; local14 = (Class2_Sub23) Static48.aClass265_11.method6001()) {
			if (local14.aClass2_Sub18_Sub1_3 != null) {
				Static360.aClass2_Sub18_Sub4_2.method4456(local14.aClass2_Sub18_Sub1_3);
				local14.aClass2_Sub18_Sub1_3 = null;
			}
			if (local14.aClass2_Sub18_Sub1_2 != null) {
				Static360.aClass2_Sub18_Sub4_2.method4456(local14.aClass2_Sub18_Sub1_2);
				local14.aClass2_Sub18_Sub1_2 = null;
			}
			local14.method6072();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class2_Sub23 local53 = (Class2_Sub23) Static60.aClass265_15.method6005(); local53 != null; local53 = (Class2_Sub23) Static60.aClass265_15.method6001()) {
			if (local53.aClass2_Sub18_Sub1_3 != null) {
				Static360.aClass2_Sub18_Sub4_2.method4456(local53.aClass2_Sub18_Sub1_3);
				local53.aClass2_Sub18_Sub1_3 = null;
			}
			local53.method6072();
		}
		for (@Pc(82) Class2_Sub23 local82 = (Class2_Sub23) Static69.aClass240_7.method5438(); local82 != null; local82 = (Class2_Sub23) Static69.aClass240_7.method5436()) {
			if (local82.aClass2_Sub18_Sub1_3 != null) {
				Static360.aClass2_Sub18_Sub4_2.method4456(local82.aClass2_Sub18_Sub1_3);
				local82.aClass2_Sub18_Sub1_3 = null;
			}
			local82.method6072();
		}
	}
}
