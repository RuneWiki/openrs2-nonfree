import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	public static int anInt4813;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
	public static int anInt4815;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "Z")
	public static boolean aBoolean361 = false;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([[[Lclient!bt;B)V")
	public static void method3883(@OriginalArg(0) Class39[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class39[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class39 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass8_Sub3_Sub1_1 instanceof Interface19) {
							((Interface19) local27.aClass8_Sub3_Sub1_1).method7639();
						}
						if (local27.aClass8_Sub3_Sub2_2 instanceof Interface19) {
							((Interface19) local27.aClass8_Sub3_Sub2_2).method7639();
						}
						if (local27.aClass8_Sub3_Sub2_1 instanceof Interface19) {
							((Interface19) local27.aClass8_Sub3_Sub2_1).method7639();
						}
						if (local27.aClass8_Sub3_Sub4_1 instanceof Interface19) {
							((Interface19) local27.aClass8_Sub3_Sub4_1).method7639();
						}
						if (local27.aClass8_Sub3_Sub4_2 instanceof Interface19) {
							((Interface19) local27.aClass8_Sub3_Sub4_2).method7639();
						}
						for (@Pc(77) Class111 local77 = local27.aClass111_1; local77 != null; local77 = local77.aClass111_2) {
							@Pc(82) Class8_Sub3_Sub3 local82 = local77.aClass8_Sub3_Sub3_1;
							if (local82 instanceof Interface19) {
								((Interface19) local82).method7639();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static332.method5799(arg1, arg0) | (arg1 & 0x40000) != 0 || Static330.method4520(arg1, arg0);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!dg;Lclient!qm;B)Lclient!d;")
	public static Class1_Sub11 method3885(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class276 arg1) {
		@Pc(16) Class1_Sub11 local16 = Static458.method6319();
		local16.aClass70_15 = arg0;
		local16.anInt1432 = arg0.anInt1788;
		if (local16.anInt1432 == -1) {
			local16.aClass1_Sub35_Sub2_1 = new Class1_Sub35_Sub2(260);
		} else if (local16.anInt1432 == -2) {
			local16.aClass1_Sub35_Sub2_1 = new Class1_Sub35_Sub2(10000);
		} else if (local16.anInt1432 <= 18) {
			local16.aClass1_Sub35_Sub2_1 = new Class1_Sub35_Sub2(20);
		} else if (local16.anInt1432 <= 98) {
			local16.aClass1_Sub35_Sub2_1 = new Class1_Sub35_Sub2(100);
		} else {
			local16.aClass1_Sub35_Sub2_1 = new Class1_Sub35_Sub2(260);
		}
		local16.aClass1_Sub35_Sub2_1.method5816(arg1);
		local16.aClass1_Sub35_Sub2_1.method5813(local16.aClass70_15.method1475());
		local16.anInt1433 = 0;
		return local16;
	}
}
