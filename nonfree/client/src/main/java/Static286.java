import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	public static int anInt5139;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "F")
	public static float aFloat73 = 0.0F;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!ju;)I")
	public static int method4125(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(7) String local7 = Static398.method5260(arg0);
		@Pc(9) int[] local9 = null;
		if (Static16.method324(arg0.anInt3716)) {
			local9 = Static318.aClass144_6.method3265((int) arg0.aLong114).anIntArray81;
		} else if (arg0.anInt3720 != -1) {
			local9 = Static318.aClass144_6.method3265(arg0.anInt3720).anIntArray81;
		} else if (Static387.method5124(arg0.anInt3716)) {
			@Pc(32) Class3_Sub2_Sub1_Sub1 local32 = Static174.aClass3_Sub2_Sub1_Sub1Array1[(int) arg0.aLong114];
			if (local32 != null) {
				@Pc(37) Class65 local37 = local32.aClass65_1;
				if (local37.anIntArray155 != null) {
					local37 = local37.method1710(Static344.aClass108_1);
				}
				if (local37 != null) {
					local9 = local37.anIntArray158;
				}
			}
		} else if (Static429.method5145(arg0.anInt3716)) {
			@Pc(75) Class134 local75;
			if (arg0.anInt3716 == 1006) {
				local75 = Static118.aClass165_2.method3799((int) arg0.aLong114);
			} else {
				local75 = Static118.aClass165_2.method3799((int) (arg0.aLong114 >>> 32 & 0x7FFFFFFFL));
			}
			if (local75.anIntArray322 != null) {
				local75 = local75.method2969(Static344.aClass108_1);
			}
			if (local75 != null) {
				local9 = local75.anIntArray323;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static336.method4687(local9);
		}
		@Pc(136) int local136 = Static172.aClass58_5.method1349(local7, Static90.aClass17Array3);
		if (arg0.aBoolean282) {
			local136 += Static31.aClass17_4.la() + 4;
		}
		return local136;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!si;)V")
	public static void method4126(@OriginalArg(1) Class2_Sub23 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static194.aClass220_1 != null) {
			@Pc(20) int local20;
			try {
				Static194.aClass220_1.method4796(0L);
				Static194.aClass220_1.method4795(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method5462(24, local8);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4127(@OriginalArg(1) String arg0) {
		if (!Static385.aBoolean441) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static337.anInt5822;
		@Pc(18) int[] local18 = Static203.anIntArray384;
		for (@Pc(20) int local20 = 0; local20 < local12; local20++) {
			@Pc(28) Class3_Sub2_Sub1_Sub2 local28 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local18[local20]];
			if (local28 != null && local28 != Static375.aClass3_Sub2_Sub1_Sub2_7 && local28.aString56 != null && local28.aString56.equalsIgnoreCase(arg0)) {
				Static159.method2586(Static343.aClass54_86);
				Static424.aClass2_Sub23_Sub2_1.method5507(local18[local20]);
				Static424.aClass2_Sub23_Sub2_1.method5459(0);
				Static424.aClass2_Sub23_Sub2_1.method5470(Static423.anInt7418);
				Static424.aClass2_Sub23_Sub2_1.method5478(Static142.anInt3047);
				Static424.aClass2_Sub23_Sub2_1.method5470(Static154.anInt3161);
				local10 = true;
				Static346.method4766(0, 0, true, -2, local28.method4935(), local28.anIntArray524[0], local28.method4935(), local28.anIntArray525[0]);
				break;
			}
		}
		if (!local10) {
			Static321.method4516(Static250.aClass209_105.method4562(Static388.anInt6533) + arg0);
		}
		if (Static385.aBoolean441) {
			Static237.method3667();
		}
	}
}
