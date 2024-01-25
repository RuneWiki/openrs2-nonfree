import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	public static int anInt4296;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method3940() {
		Static321.method5618();
		Static324.method5684();
		Static269.method4874();
		Static209.method4332();
		Static34.method805();
		Static267.method4828();
		Static221.method3901();
		Static237.method4078();
		Static281.method5075();
		Static88.method1958();
		Static122.method3996();
		Static149.method2894();
		Static167.method3158();
		Static247.method4481();
		Static248.method4501();
		Static77.method1750();
		Static191.method3434();
		Static299.method4604();
		Static44.method1078();
		Static257.method4675();
		Static225.method3964();
		Static336.method5828();
		if (Static158.anInt3190 != 0) {
			for (@Pc(66) int local66 = 0; local66 < Static282.aByteArrayArray17.length; local66++) {
				Static282.aByteArrayArray17[local66] = null;
			}
			Static85.anInt1833 = 0;
		}
		Static157.method2973();
		Static42.method994();
		Static272.method4920();
		Static47.method1120();
		Static346.method5941();
		Static72.aClass119_47.method3304();
		Static147.aClass4_2.method4271();
		Static260.aClass179_9.method5088();
		Static202.method3645();
		Static86.aClass191_55.method5432();
		Static275.aClass191_181.method5432();
		Static31.aClass191_18.method5432();
		Static178.aClass191_111.method5432();
		Static299.aClass191_164.method5432();
		Static122.aClass191_148.method5432();
		Static91.aClass191_59.method5432();
		Static201.aClass191_132.method5432();
		Static59.aClass191_35.method5432();
		Static229.aClass191_78.method5432();
		Static261.aClass191_169.method5432();
		Static198.aClass191_129.method5432();
		Static253.aClass191_222.method5432();
		Static318.aClass191_204.method5432();
		Static342.aClass191_221.method5432();
		Static355.aClass191_223.method5432();
		Static184.aClass191_116.method5432();
		Static233.aClass191_150.method5432();
		Static85.aClass191_53.method5432();
		Static68.aClass191_41.method5432();
		Static278.aClass191_182.method5432();
		Static137.aClass191_88.method5432();
		Static205.aClass191_135.method5432();
		Static133.aClass191_84.method5432();
		Static177.aClass191_110.method5432();
		Static179.aClass191_112.method5432();
		Static46.aClass191_26.method5432();
		Static186.aClass191_174.method5432();
		Static211.aClass191_140.method5432();
		Static112.aClass119_75.method3304();
		Static50.aClass119_31.method3304();
		Static121.aClass119_77.method3304();
		Static151.aClass119_94.method3304();
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public static void method3941() {
		@Pc(13) int local13 = Static116.method2494();
		if (local13 == 0) {
			Static66.aByteArrayArrayArray3 = null;
			Static289.method5130(0);
		} else if (local13 == 1) {
			Static315.method5536((byte) 0);
			Static289.method5130(512);
			if (Static313.aByteArrayArrayArray12 != null) {
				Static300.method5154();
			}
		} else {
			Static315.method5536((byte) (Static241.anInt4651 - 4 & 0xFF));
			Static289.method5130(2);
		}
		Static145.anInt6939 = Static182.anInt3603;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method3943(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(18) int local18 = 0;
		@Pc(24) int local24 = arg1 ? 32768 : 0;
		@Pc(32) int local32 = (arg1 ? Static322.anInt6491 : Static69.anInt1505) + local24;
		for (@Pc(34) int local34 = local24; local34 < local32; local34++) {
			@Pc(40) Class2_Sub11_Sub3 local40 = Static10.method374(local34);
			if (local40.aBoolean179 && local40.method2134().toLowerCase().indexOf(local8) != -1) {
				if (local18 >= 50) {
					Static69.anInt1499 = -1;
					Static64.aShortArray43 = null;
					return;
				}
				if (local11.length <= local18) {
					@Pc(76) short[] local76 = new short[local11.length * 2];
					for (@Pc(78) int local78 = 0; local78 < local18; local78++) {
						local76[local78] = local11[local78];
					}
					local11 = local76;
				}
				local11[local18++] = (short) local34;
			}
		}
		Static332.anInt3540 = 0;
		Static69.anInt1499 = local18;
		Static64.aShortArray43 = local11;
		@Pc(115) String[] local115 = new String[Static69.anInt1499];
		for (@Pc(117) int local117 = 0; local117 < Static69.anInt1499; local117++) {
			local115[local117] = Static10.method374(local11[local117]).method2134();
		}
		Static47.method1121(local115, Static64.aShortArray43);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BZLjava/lang/String;Lclient!sj;)V")
	public static void method3945(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class37 arg2) {
		@Pc(20) int local20 = Static24.aClass188_1.method5315(null, arg1, 250);
		@Pc(29) int local29 = Static24.aClass188_1.method5313(250, null, arg1) * 13;
		Static147.aClass4_2.method4246(6, 6, local20 + 4 + 4, local29 + 4 + 4, -16777216, 0);
		Static147.aClass4_2.method4287(6, 6, local20 + 8, local29 + 4 - -4, -1, 0);
		arg2.method5251(10, null, local29, 0, 10, -1, null, null, 1, 0, -1, local20, arg1, 0, 1);
		Static152.method2935(local29 + 4 + 4, 6, 6, local20 + 4 + 4);
		if (arg0) {
			Static147.aClass4_2.method4298();
		}
	}
}
