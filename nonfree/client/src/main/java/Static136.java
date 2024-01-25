import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
	public static int anInt7478;

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "Lclient!um;")
	public static Class243 aClass243_256;

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
	public static int anInt7479;

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "Lclient!ua;")
	public static Class237 aClass237_27 = new Class237(8);

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_122 = new Class194(60, 8);

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_193 = new Class129(16, 17);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method6008(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static288.method3576(Static77.aClass194_19);
		Static281.aClass5_Sub15_Sub2_13.method5583(Static21.method357(arg1) + 1);
		Static281.aClass5_Sub15_Sub2_13.method5545(arg1);
		Static281.aClass5_Sub15_Sub2_13.method5583(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!uu;IZ)Z")
	public static boolean method6009(@OriginalArg(0) Class5_Sub15_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method5610(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(110) int local110;
		if (local8 == 0) {
			if (arg0.method5610(1) != 0) {
				method6009(arg0, arg1);
			}
			local28 = arg0.method5610(6);
			local33 = arg0.method5610(6);
			@Pc(43) boolean local43 = arg0.method5610(1) == 1;
			if (local43) {
				Static52.anIntArray44[Static246.anInt3974++] = arg1;
			}
			if (Static359.aClass2_Sub1_Sub3_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(66) Class105 local66 = Static99.aClass105Array1[arg1];
			@Pc(74) Class2_Sub1_Sub3_Sub2 local74 = Static359.aClass2_Sub1_Sub3_Sub2Array1[arg1] = new Class2_Sub1_Sub3_Sub2();
			local74.anInt6126 = arg1;
			if (Static21.aClass5_Sub15Array1[arg1] != null) {
				local74.method4923(Static21.aClass5_Sub15Array1[arg1]);
			}
			local74.method4909(local66.anInt2835, true);
			local74.anInt6176 = local66.anInt2833;
			local100 = local66.anInt2839;
			local104 = local100 >> 28;
			local110 = local100 >> 14 & 0xFF;
			@Pc(114) int local114 = local100 & 0xFF;
			local74.aBoolean412 = local66.aBoolean182;
			local74.aByteArray78[0] = Static142.aByteArray31[arg1];
			local74.aByte105 = (byte) local104;
			local74.method4930(local28 + (local110 << 6) - Static31.anInt618, local33 + (local114 << 6) + -Static226.anInt3768);
			local74.aBoolean414 = false;
			Static99.aClass105Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method5610(2);
			local33 = Static99.aClass105Array1[arg1].anInt2839;
			Static99.aClass105Array1[arg1].anInt2839 = (local33 & 0xFFFFFFF) + (((local33 >> 28) + local28 & 0x3) << 28);
			return false;
		} else {
			@Pc(208) int local208;
			@Pc(213) int local213;
			@Pc(221) int local221;
			if (local8 != 2) {
				local28 = arg0.method5610(18);
				local33 = local28 >> 16;
				local208 = local28 >> 8 & 0xFF;
				local213 = local28 & 0xFF;
				local221 = Static99.aClass105Array1[arg1].anInt2839;
				local100 = local33 + (local221 >> 28) & 0x3;
				local104 = local208 + (local221 >> 14) & 0xFF;
				local110 = local213 + local221 & 0xFF;
				Static99.aClass105Array1[arg1].anInt2839 = local110 + (local100 << 28) + (local104 << 14);
				return false;
			}
			local28 = arg0.method5610(5);
			local33 = local28 >> 3;
			local208 = local28 & 0x7;
			local213 = Static99.aClass105Array1[arg1].anInt2839;
			local221 = local33 + (local213 >> 28) & 0x3;
			local100 = local213 >> 14 & 0xFF;
			local104 = local213 & 0xFF;
			if (local208 == 0) {
				local100--;
				local104--;
			}
			if (local208 == 1) {
				local104--;
			}
			if (local208 == 2) {
				local104--;
				local100++;
			}
			if (local208 == 3) {
				local100--;
			}
			if (local208 == 4) {
				local100++;
			}
			if (local208 == 5) {
				local104++;
				local100--;
			}
			if (local208 == 6) {
				local104++;
			}
			if (local208 == 7) {
				local100++;
				local104++;
			}
			Static99.aClass105Array1[arg1].anInt2839 = (local221 << 28) + (local100 << 14) + local104;
			return false;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZ)V")
	public static void method6010(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0) {
			Static407.aClass200_9 = Static464.method5875(Static71.anInterface8_138, Static246.aCanvas2, Static216.aClass1_Sub1_1.anInt4518 * 2, Static7.aClass93_1, arg0);
		} else {
			if (arg1) {
				Static407.aClass200_9 = Static464.method5875(Static71.anInterface8_138, Static246.aCanvas2, 0, Static7.aClass93_1, 0);
				Static407.aClass200_9.t(0);
				@Pc(44) Class14 local44 = Static215.method2844(Static147.anInt2653, Static281.aClass243_250);
				@Pc(53) Class23 local53 = Static407.aClass200_9.method5837(local44, Static470.method4679(Static344.aClass243_196, Static147.anInt2653));
				Static255.method3305(local53, Static427.aClass198_118.method4012(Static38.anInt4834), true);
				Static407.aClass200_9.method5813();
				Static260.method3340();
				Static407.aClass200_9.method5827();
			}
			try {
				Static407.aClass200_9 = Static464.method5875(Static71.anInterface8_138, Static246.aCanvas2, Static216.aClass1_Sub1_1.anInt4518 * 2, Static7.aClass93_1, arg0);
				if (Static407.aClass200_9.method5816()) {
					@Pc(84) boolean local84 = true;
					try {
						local84 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(94) Throwable local94) {
					}
					@Pc(100) Class5_Sub28 local100;
					if (local84) {
						local100 = Static407.aClass200_9.method5817(146800640);
					} else {
						local100 = Static407.aClass200_9.method5817(104857600);
					}
					Static407.aClass200_9.method5822(local100);
				}
			} catch (@Pc(111) Throwable local111) {
				Static407.aClass200_9 = Static464.method5875(Static71.anInterface8_138, Static246.aCanvas2, 0, Static7.aClass93_1, 0);
				arg0 = 0;
			}
		}
		Static146.anInt2644 = arg0;
		Static352.method4976();
		if (!Static407.aClass200_9.method5873()) {
			Static60.anInt1114 = 1;
		}
		Static407.aClass200_9.method5845(Static60.anInt1114);
		Static407.aClass200_9.method5838(0);
		Static407.aClass200_9.ya(8);
		Static43.aClass29_5 = Static407.aClass200_9.method5880();
		Static344.aClass29_6 = Static407.aClass200_9.method5880();
		Static81.method1209();
		Static407.aClass200_9.method5819(!Static216.aClass1_Sub1_1.aBoolean314);
		if (Static407.aClass200_9.method5862()) {
			Static13.method253(Static216.aClass1_Sub1_1.aBoolean304);
		}
		Static51.method807(Static433.anInt7210 >> 3, Static407.aClass200_9, Static418.anInt6969 >> 3);
		Static454.method5952();
		Static81.aBoolean103 = false;
	}
}
