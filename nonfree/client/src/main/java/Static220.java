import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hs", name = "R", descriptor = "Lclient!lv;")
	public static Class214 aClass214_2;

	@OriginalMember(owner = "client!hs", name = "S", descriptor = "I")
	public static int anInt4532;

	@OriginalMember(owner = "client!hs", name = "T", descriptor = "Lclient!qw;")
	public static Class286 aClass286_1;

	@OriginalMember(owner = "client!hs", name = "L", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_121 = new Class194(104, 0);

	@OriginalMember(owner = "client!hs", name = "N", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_122 = new Class194(35, -2);

	@OriginalMember(owner = "client!hs", name = "Q", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V")
	public static void method3849(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static528.anInt8950 != -1) {
				Static494.method7222(Static528.anInt8950);
			}
			for (@Pc(19) Class3_Sub1 local19 = (Class3_Sub1) Static128.aClass25_7.method435(); local19 != null; local19 = (Class3_Sub1) Static128.aClass25_7.method432()) {
				if (!local19.method8683()) {
					local19 = (Class3_Sub1) Static128.aClass25_7.method435();
					if (local19 == null) {
						break;
					}
				}
				Static69.method1233(local19, true, false);
			}
			Static528.anInt8950 = -1;
			Static128.aClass25_7 = new Class25(8);
			Static483.method7126();
			Static528.anInt8950 = Static408.anInt7195;
			Static228.method3952(false);
			Static647.method8677();
			Static400.method6287(Static528.anInt8950);
		}
		Static207.aBoolean269 = true;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method3850(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static191.anInt3579 >= 100) {
			Static608.method8332(Static369.aClass235_42.method5893(Static455.anInt7738));
			return;
		}
		@Pc(29) String local29 = Static353.method5667(arg1);
		if (local29 == null) {
			return;
		}
		@Pc(73) String local73;
		for (@Pc(34) int local34 = 0; local34 < Static191.anInt3579; local34++) {
			@Pc(42) String local42 = Static353.method5667(Static151.aStringArray24[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static608.method8332(arg1 + Static369.aClass235_43.method5893(Static455.anInt7738));
				return;
			}
			if (Static193.aStringArray82[local34] != null) {
				local73 = Static353.method5667(Static193.aStringArray82[local34]);
				if (local73 != null && local73.equals(local29)) {
					Static608.method8332(arg1 + Static369.aClass235_43.method5893(Static455.anInt7738));
					return;
				}
			}
		}
		for (@Pc(104) int local104 = 0; local104 < Static606.anInt9791; local104++) {
			local73 = Static353.method5667(Static233.aStringArray32[local104]);
			if (local73 != null && local73.equals(local29)) {
				Static608.method8332(Static369.aClass235_48.method5893(Static455.anInt7738) + arg1 + Static369.aClass235_49.method5893(Static455.anInt7738));
				return;
			}
			if (Static633.aStringArray14[local104] != null) {
				@Pc(150) String local150 = Static353.method5667(Static633.aStringArray14[local104]);
				if (local150 != null && local150.equals(local29)) {
					Static608.method8332(Static369.aClass235_48.method5893(Static455.anInt7738) + arg1 + Static369.aClass235_49.method5893(Static455.anInt7738));
					return;
				}
			}
		}
		if (Static353.method5667(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString5).equals(local29)) {
			Static608.method8332(Static369.aClass235_45.method5893(Static455.anInt7738));
			return;
		}
		@Pc(210) Class3_Sub27 local210 = Static59.method1040(Static325.aClass20_2, Static513.aClass314_126);
		local210.aClass3_Sub9_Sub2_2.method5572(Static300.method8285(arg1) + 1);
		local210.aClass3_Sub9_Sub2_2.method5638(arg1);
		local210.aClass3_Sub9_Sub2_2.method5572(arg0 ? 1 : 0);
		Static148.method2572(local210);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZB)V")
	public static void method3852(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static515.anInt8712;
		@Pc(12) int local12 = Static496.anInt828;
		if (arg0 && Static40.aBoolean34) {
			local10 <<= 0x1;
			local12 = -local10;
		}
		Static266.aClass82_8.f(local12, local10);
	}
}
