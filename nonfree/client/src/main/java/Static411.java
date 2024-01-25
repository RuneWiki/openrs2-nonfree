import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "Lclient!sea;")
	public static Class308 aClass308_147;

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "Lclient!rt;")
	public static Class302 aClass302_8;

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "[I")
	public static int[] anIntArray437 = null;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([BIZ)V")
	public static void method5855(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static334.aClass1_Sub3_4 == null) {
			Static334.aClass1_Sub3_4 = new Class1_Sub3(20000);
		}
		Static334.aClass1_Sub3_4.method7973(arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static205.method3167(Static334.aClass1_Sub3_4.aByteArray104);
		Static332.aClass248_Sub1Array1 = new Class248_Sub1[Static152.anInt2863];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = Static253.anInt4668; local41 <= Static281.anInt5189; local41++) {
			@Pc(47) Class248_Sub1 local47 = Static160.method2621(local41);
			if (local47 != null) {
				Static332.aClass248_Sub1Array1[local39++] = local47;
			}
		}
		Static118.aBoolean183 = false;
		Static72.aLong41 = Static480.method6650();
		Static334.aClass1_Sub3_4 = null;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	public static void method5856() {
		if (Static31.aClass78_18 == null) {
			return;
		}
		Static572.aClass196_9.method4031();
		Static482.method6676();
		Static339.method5062();
		Static366.method5382();
		Static61.method1009();
		Static367.method5660();
		if (Static242.aClass289_1 != null) {
			Static242.aClass289_1.method6202();
		}
		Static264.method3877();
		Static412.method5871();
		Static426.method6101();
		Static555.method7529();
		Static59.method996(false);
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Class11_Sub1_Sub1_Sub3_Sub1 local47 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local41];
			if (local47 != null) {
				for (@Pc(51) int local51 = 0; local51 < local47.aClass52Array3.length; local51++) {
					local47.aClass52Array3[local51] = null;
				}
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static547.anInt9151; local74++) {
			@Pc(81) Class11_Sub1_Sub1_Sub3_Sub2 local81 = Static501.aClass1_Sub33Array1[local74].aClass11_Sub1_Sub1_Sub3_Sub2_2;
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < local81.aClass52Array3.length; local85++) {
					local81.aClass52Array3[local85] = null;
				}
			}
		}
		Static160.aClass34_1 = null;
		Static586.aClass34_6 = null;
		Static31.aClass78_18.method6786();
		Static31.aClass78_18 = null;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;ZZI)V")
	public static void method5861(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static161.aClass308_66.anInt8167 = 1;
		@Pc(16) String local16 = arg2.toLowerCase();
		@Pc(19) short[] local19 = new short[16];
		@Pc(21) int local21 = -1;
		@Pc(23) String local23 = null;
		if (arg1 != -1) {
			@Pc(31) Class94 local31 = Static256.aClass263_1.method5592(arg1);
			if (local31 == null || local31.method2329() != arg4) {
				return;
			}
			if (local31.method2329()) {
				local23 = local31.aString24;
			} else {
				local21 = local31.anInt2658;
			}
		}
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < Static230.aClass225_1.anInt6004; local55++) {
			@Pc(62) Class222 local62 = Static230.aClass225_1.method4857(local55);
			if ((!arg0 || local62.aBoolean463) && local62.anInt5866 == -1 && local62.anInt5898 == -1 && local62.anInt5887 == 0 && local62.aString70.toLowerCase().indexOf(local16) != -1) {
				if (arg1 != -1) {
					if (arg4) {
						if (!arg3.equals(local62.method4791(arg1, local23))) {
							continue;
						}
					} else if (arg5 != local62.method4794(local21, arg1)) {
						continue;
					}
				}
				if (local53 >= 250) {
					Static413.aShortArray100 = null;
					Static401.anInt7187 = -1;
					return;
				}
				if (local19.length <= local53) {
					@Pc(132) short[] local132 = new short[local19.length * 2];
					for (@Pc(134) int local134 = 0; local134 < local53; local134++) {
						local132[local134] = local19[local134];
					}
					local19 = local132;
				}
				local19[local53++] = (short) local55;
			}
		}
		Static401.anInt7187 = local53;
		Static577.anInt9528 = 0;
		Static413.aShortArray100 = local19;
		@Pc(172) String[] local172 = new String[Static401.anInt7187];
		for (@Pc(174) int local174 = 0; local174 < Static401.anInt7187; local174++) {
			local172[local174] = Static230.aClass225_1.method4857(local19[local174]).aString70;
		}
		Static315.method4681(local172, Static413.aShortArray100);
		Static161.aClass308_66.method6543();
		Static161.aClass308_66.anInt8167 = 2;
	}
}
