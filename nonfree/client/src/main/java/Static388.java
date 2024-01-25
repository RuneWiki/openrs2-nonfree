import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!qba", name = "H", descriptor = "[I")
	public static int[] anIntArray669;

	@OriginalMember(owner = "client!qba", name = "P", descriptor = "I")
	public static int anInt6883;

	@OriginalMember(owner = "client!qba", name = "R", descriptor = "I")
	public static int anInt6884;

	@OriginalMember(owner = "client!qba", name = "B", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_99 = new Class252(70, 2);

	@OriginalMember(owner = "client!qba", name = "N", descriptor = "Lclient!pt;")
	public static final Class230 aClass230_40 = new Class230(16);

	@OriginalMember(owner = "client!qba", name = "Q", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIII)V")
	public static void method6198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static538.anInt9485 + arg1;
		@Pc(14) int local14 = arg0 + Static282.anInt5380;
		if (Static263.aClass64ArrayArrayArray3 == null || arg1 < 0 || arg0 < 0 || Static237.anInt4563 <= arg1 || Static373.anInt6694 <= arg0) {
			return;
		}
		@Pc(44) long local44 = (long) (arg2 << 28 | local14 << 14 | local9);
		@Pc(50) Class1_Sub20 local50 = (Class1_Sub20) Static4.aClass230_2.method6144(local44);
		if (local50 == null) {
			Static479.method7470(arg2, arg1, arg0);
			return;
		}
		@Pc(64) Class1_Sub12 local64 = (Class1_Sub12) local50.aClass295_16.method7543();
		if (local64 == null) {
			Static479.method7470(arg2, arg1, arg0);
			return;
		}
		@Pc(78) Class20_Sub3_Sub1 local78 = (Class20_Sub3_Sub1) Static479.method7470(arg2, arg1, arg0);
		if (local78 == null) {
			local78 = new Class20_Sub3_Sub1();
		} else {
			local78.anInt1467 = local78.anInt1473 = -1;
		}
		local78.anInt1468 = local64.anInt2500;
		local78.anInt1466 = local64.anInt2502;
		label46: while (true) {
			@Pc(106) Class1_Sub12 local106 = (Class1_Sub12) local50.aClass295_16.method7540();
			if (local106 == null) {
				break;
			}
			if (local78.anInt1466 != local106.anInt2502) {
				local78.anInt1467 = local106.anInt2502;
				local78.anInt1477 = local106.anInt2500;
				while (true) {
					@Pc(127) Class1_Sub12 local127 = (Class1_Sub12) local50.aClass295_16.method7540();
					if (local127 == null) {
						break label46;
					}
					if (local127.anInt2502 != local78.anInt1466 && local78.anInt1467 != local127.anInt2502) {
						local78.anInt1473 = local127.anInt2502;
						local78.anInt1469 = local127.anInt2500;
					}
				}
			}
		}
		@Pc(180) int local180 = Static508.method7754((arg0 << 7) + 64, (arg1 << 7) + 64, arg2);
		Static433.method6713(arg2, arg1, arg0, local180, local78);
	}

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "(B)V")
	public static void method6201() {
		@Pc(12) int local12 = Static207.anInt4085;
		@Pc(14) int[] local14 = Static209.anIntArray327;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class20_Sub1_Sub1_Sub1 local24 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local14[local16]];
			if (local24 != null) {
				Static409.method6503(local24.method7808(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "(III)Z")
	public static boolean method6204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static303.method5348(arg1, arg0) | (arg0 & 0x70000) != 0 || Static263.method4733(arg0, arg1);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!mca;ZIBZILclient!mca;)I")
	public static int method6206(@OriginalArg(0) Class38_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class38_Sub1 arg5) {
		@Pc(15) int local15 = Static189.method3654(arg4, arg3, arg0, arg5);
		if (local15 != 0) {
			return arg3 ? -local15 : local15;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(38) int local38 = Static189.method3654(arg2, arg1, arg0, arg5);
			return arg1 ? -local38 : local38;
		}
	}
}
