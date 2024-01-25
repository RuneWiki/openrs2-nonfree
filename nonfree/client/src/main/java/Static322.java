import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!lga", name = "g", descriptor = "I")
	public static int anInt6148 = 0;

	@OriginalMember(owner = "client!lga", name = "t", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!lga", name = "B", descriptor = "I")
	public static int anInt6163 = 0;

	@OriginalMember(owner = "client!lga", name = "D", descriptor = "I")
	public static int anInt6165 = -1;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(BI)I")
	public static int method5334(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!ni;IB)V")
	public static void method5335(@OriginalArg(0) Class9_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray666 == null) {
			return;
		}
		@Pc(9) int local9 = arg0.anIntArray666[arg1 + 1];
		if (local9 == arg0.anInt10193) {
			return;
		}
		arg0.anInt10193 = local9;
		arg0.anInt10214 = 1;
		arg0.anInt10186 = 0;
		arg0.anInt10192 = 0;
		arg0.anInt10234 = arg0.anInt10236;
		arg0.anInt10189 = 0;
		if (arg0.anInt10193 != -1) {
			Static522.method7586(arg0.anInt10189, arg0, Static474.aClass264_2.method6574(arg0.anInt10193));
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(BI)V")
	public static void method5337(@OriginalArg(1) int arg0) {
		Static475.anInt8130 = -1;
		Static464.anInt7910 = arg0;
		Static476.anInt8998 = 3;
		Static156.anInt3180 = 100;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5338(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static606.anInt9791 >= 200 && !Static367.aBoolean486 || Static606.anInt9791 >= 200) {
			Static608.method8332(Static369.aClass235_13.method5893(Static455.anInt7738));
			local30 = Static369.aClass235_14.method5893(Static455.anInt7738);
			if (local30 != null) {
				Static608.method8332(local30);
			}
			return;
		}
		local30 = Static353.method5667(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(85) String local85;
		for (@Pc(46) int local46 = 0; local46 < Static606.anInt9791; local46++) {
			@Pc(54) String local54 = Static353.method5667(Static233.aStringArray32[local46]);
			if (local54 != null && local54.equals(local30)) {
				Static608.method8332(arg0 + Static369.aClass235_41.method5893(Static455.anInt7738));
				return;
			}
			if (Static633.aStringArray14[local46] != null) {
				local85 = Static353.method5667(Static633.aStringArray14[local46]);
				if (local85 != null && local85.equals(local30)) {
					Static608.method8332(arg0 + Static369.aClass235_41.method5893(Static455.anInt7738));
					return;
				}
			}
		}
		for (@Pc(112) int local112 = 0; local112 < Static191.anInt3579; local112++) {
			local85 = Static353.method5667(Static151.aStringArray24[local112]);
			if (local85 != null && local85.equals(local30)) {
				Static608.method8332(Static369.aClass235_46.method5893(Static455.anInt7738) + arg0 + Static369.aClass235_47.method5893(Static455.anInt7738));
				return;
			}
			if (Static193.aStringArray82[local112] != null) {
				@Pc(156) String local156 = Static353.method5667(Static193.aStringArray82[local112]);
				if (local156 != null && local156.equals(local30)) {
					Static608.method8332(Static369.aClass235_46.method5893(Static455.anInt7738) + arg0 + Static369.aClass235_47.method5893(Static455.anInt7738));
					return;
				}
			}
		}
		if (Static353.method5667(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString5).equals(local30)) {
			Static608.method8332(Static369.aClass235_44.method5893(Static455.anInt7738));
		} else {
			@Pc(210) Class3_Sub27 local210 = Static59.method1040(Static325.aClass20_2, Static179.aClass314_59);
			local210.aClass3_Sub9_Sub2_2.method5572(Static300.method8285(arg0));
			local210.aClass3_Sub9_Sub2_2.method5638(arg0);
			Static148.method2572(local210);
		}
	}
}
