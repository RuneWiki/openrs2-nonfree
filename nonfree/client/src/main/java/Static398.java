import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "Lclient!eu;")
	public static Class102 aClass102_1;

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "Lclient!sda;")
	public static Class312 aClass312_1;

	@OriginalMember(owner = "client!oe", name = "U", descriptor = "Lclient!fi;")
	public static Class109 aClass109_3;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method6168(@OriginalArg(1) Class126 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static144.aBoolean196) {
			local7 = Static577.method8147();
			local9 = Static601.method8395();
		}
		@Pc(28) int local28 = Static403.anInt6941 + local7;
		@Pc(33) int local33 = Static649.anInt10496 + local9;
		@Pc(35) int local35 = Static42.anInt712;
		@Pc(39) int local39 = Static334.anInt5796 - 3;
		Static479.method6949(arg0, Static42.anInt712, Static403.anInt6941 + local7, Static76.aClass58_25.method1237(Static321.anInt5554), Static334.anInt5796, local9 + Static649.anInt10496);
		@Pc(63) int local63 = local7 + Static81.aClass13_1.method6355();
		@Pc(69) int local69 = local9 + Static81.aClass13_1.method6347();
		@Pc(73) int local73;
		@Pc(78) Class5_Sub4_Sub14 local78;
		@Pc(95) int local95;
		@Pc(285) int local285;
		@Pc(172) Class5_Sub4_Sub6 local172;
		@Pc(273) Class5_Sub4_Sub14 local273;
		if (Static585.aBoolean771) {
			local73 = 0;
			for (local172 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1538(); local172 != null; local172 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1536()) {
				local95 = local33 + local73 * 16 + 20 + 13;
				local73++;
				if (Static403.anInt6941 + local7 < local63 && local63 < local7 + Static403.anInt6941 + Static42.anInt712 && local69 > local95 - 13 && local95 + 4 > local69 && (local172.anInt2325 > 1 || ((Class5_Sub4_Sub14) local172.aClass80_3.aClass5_Sub4_14.aClass5_Sub4_67).aBoolean475)) {
					arg0.aa(Static403.anInt6941 + local7, local95 - 12, Static42.anInt712, 16, Static463.anInt7856 | 255 - Static235.anInt3999 << 24, 1);
				}
			}
			if (Static472.aClass5_Sub4_Sub6_1 != null) {
				Static479.method6949(arg0, Static501.anInt9504, Static345.anInt5965, Static472.aClass5_Sub4_Sub6_1.aString36, Static266.anInt4412, Static537.anInt8920);
				local73 = 0;
				for (local273 = (Class5_Sub4_Sub14) Static472.aClass5_Sub4_Sub6_1.aClass80_3.method1538(); local273 != null; local273 = (Class5_Sub4_Sub14) Static472.aClass5_Sub4_Sub6_1.aClass80_3.method1536()) {
					local285 = local73 * 16 + Static537.anInt8920 + 13 + 20;
					if (Static345.anInt5965 < local63 && local63 < Static501.anInt9504 + Static345.anInt5965 && local69 > local285 - 13 && local69 < local285 + 4 && local273.aBoolean475) {
						arg0.aa(Static345.anInt5965, local285 - 12, Static501.anInt9504, 16, Static463.anInt7856 | 255 - Static235.anInt3999 << 24, 1);
					}
					local73++;
				}
				Static217.method3303(arg0, Static537.anInt8920, Static501.anInt9504, Static266.anInt4412, Static345.anInt5965);
			}
		} else {
			local73 = 0;
			for (local78 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7313(); local78 != null; local78 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7301()) {
				local95 = local33 + (Static642.anInt10370 - 1 + -local73) * 16 + 13 + 20;
				if (Static403.anInt6941 + local7 < local63 && local63 < Static403.anInt6941 + local7 + Static42.anInt712 && local95 - 13 < local69 && local69 < local95 + 4 && local78.aBoolean475) {
					arg0.aa(Static403.anInt6941 + local7, local95 - 12, Static42.anInt712, 16, Static463.anInt7856 | 255 - Static235.anInt3999 << 24, 1);
				}
				local73++;
			}
		}
		Static217.method3303(arg0, local9 + Static649.anInt10496, Static42.anInt712, Static334.anInt5796, Static403.anInt6941 + local7);
		if (Static585.aBoolean771) {
			local73 = 0;
			for (local172 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1538(); local172 != null; local172 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1536()) {
				local95 = local9 + Static649.anInt10496 + local73 * 16 + 20 + 13;
				if (local172.anInt2325 == 1) {
					Static1.method5722(Static334.anInt5796, local95, Static403.anInt6941 + local7, arg0, Static455.anInt7665 | 0xFF000000, Static455.anInt7661 | 0xFF000000, (Class5_Sub4_Sub14) local172.aClass80_3.aClass5_Sub4_14.aClass5_Sub4_67, local69, Static42.anInt712, local63, local9 + Static649.anInt10496);
				} else {
					Static583.method8178(Static455.anInt7661 | 0xFF000000, Static42.anInt712, arg0, Static334.anInt5796, Static649.anInt10496 + local9, Static455.anInt7665 | 0xFF000000, local95, local63, local69, local172, local7 + Static403.anInt6941);
				}
				local73++;
			}
			if (Static472.aClass5_Sub4_Sub6_1 != null) {
				local73 = 0;
				for (local273 = (Class5_Sub4_Sub14) Static472.aClass5_Sub4_Sub6_1.aClass80_3.method1538(); local273 != null; local273 = (Class5_Sub4_Sub14) Static472.aClass5_Sub4_Sub6_1.aClass80_3.method1536()) {
					local285 = local73 * 16 + Static537.anInt8920 + 13 + 20;
					local73++;
					Static1.method5722(Static266.anInt4412, local285, Static345.anInt5965, arg0, Static455.anInt7665 | 0xFF000000, Static455.anInt7661 | 0xFF000000, local273, local69, Static501.anInt9504, local63, Static537.anInt8920);
				}
				Static286.method7988(Static537.anInt8920, Static345.anInt5965, Static501.anInt9504, Static266.anInt4412);
			}
		} else {
			local73 = 0;
			for (local78 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7313(); local78 != null; local78 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7301()) {
				local95 = (Static642.anInt10370 - local73 - 1) * 16 + local33 + 13 + 20;
				Static1.method5722(local39, local95, local28, arg0, Static455.anInt7665 | 0xFF000000, Static455.anInt7661 | 0xFF000000, local78, local69, local35, local63, local33);
				local73++;
			}
		}
		Static286.method7988(Static649.anInt10496 + local9, local7 + Static403.anInt6941, Static42.anInt712, Static334.anInt5796);
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)V")
	public static void method6171() {
		Static279.anIntArray374 = null;
		Static366.anIntArray505 = null;
		Static222.anIntArray315 = null;
		Static560.anIntArray710 = null;
		Static26.anIntArray38 = null;
		Static268.aBoolean365 = false;
	}
}
