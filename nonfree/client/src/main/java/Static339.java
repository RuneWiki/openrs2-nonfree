import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
	public static int anInt6277;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!vs;")
	public static Class311 aClass311_1;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	public static int anInt6286;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!dn;")
	public static Class69 aClass69_66;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!pt;")
	public static final Class230 aClass230_35 = new Class230(512);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!md;BILclient!md;IIII)V")
	public static void method5711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20_Sub1_Sub1 arg2, @OriginalArg(5) Class20_Sub1_Sub1 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg2.method7813();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class104 local20 = (Class104) Static402.aClass277_54.method7014((long) local7);
		if (local20 == null) {
			@Pc(27) Class70[] local27 = Static547.method1918(Static46.aClass69_14, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static455.aClass4_11.method7149(local27[0]);
			Static402.aClass277_54.method7016(local20, (long) local7);
		}
		Static538.method8167(arg5 >> 1, arg0 >> 1, arg3.aByte108, 0, arg3.anInt8954, arg3.method7808() * 64, arg3.anInt8949);
		@Pc(73) int local73 = arg1 + Static32.anIntArray66[0] - 18;
		@Pc(81) int local81 = local73 + arg4 / 4 * 18;
		@Pc(91) int local91 = Static32.anIntArray66[1] + arg6 - 16 - 54;
		@Pc(99) int local99 = local91 + arg4 % 4 * 18;
		local20.method7716(local81, local99);
		if (arg2 == arg3) {
			Static455.aClass4_11.method7190(local99 - 1, 18, -256, 18, local81 - 1);
		}
		@Pc(121) Class46_Sub2 local121 = Static409.method6501();
		local121.anInt1872 = local81;
		local121.anInt1871 = local99 + 16;
		local121.anInt1870 = local99;
		local121.anInt1873 = local81 + 16;
		local121.aClass20_Sub1_Sub1_1 = arg2;
		Static456.aClass184_37.method5142(local121);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	public static void method5712() {
		if (Static19.anIntArray30 != null) {
			return;
		}
		Static19.anIntArray30 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
			@Pc(44) float local44 = ((float) (local31 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(53) float local53 = (float) (local31 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(55) int local55 = 0; local55 < 128; local55++) {
				@Pc(62) float local62 = (float) local55 / 128.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(68) float local68 = 0.0F;
				@Pc(72) float local72 = local44 / 60.0F;
				@Pc(75) int local75 = (int) local72;
				@Pc(79) int local79 = local75 % 6;
				@Pc(84) float local84 = local72 - (float) local75;
				@Pc(91) float local91 = (1.0F - local53) * local62;
				@Pc(100) float local100 = local62 * (1.0F - local53 * local84);
				@Pc(112) float local112 = (1.0F - local53 * (1.0F - local84)) * local62;
				if (local79 == 0) {
					local66 = local112;
					local68 = local91;
					local64 = local62;
				} else if (local79 == 1) {
					local64 = local100;
					local68 = local91;
					local66 = local62;
				} else if (local79 == 2) {
					local68 = local112;
					local66 = local62;
					local64 = local91;
				} else if (local79 == 3) {
					local68 = local62;
					local64 = local91;
					local66 = local100;
				} else if (local79 == 4) {
					local66 = local91;
					local64 = local112;
					local68 = local62;
				} else if (local79 == 5) {
					local68 = local100;
					local66 = local91;
					local64 = local62;
				}
				local64 = (float) Math.pow((double) local64, local19);
				local66 = (float) Math.pow((double) local66, local19);
				local68 = (float) Math.pow((double) local68, local19);
				@Pc(204) int local204 = (int) (local64 * 256.0F);
				@Pc(209) int local209 = (int) (local66 * 256.0F);
				@Pc(214) int local214 = (int) (local68 * 256.0F);
				@Pc(226) int local226 = (local209 << 8) + (local204 << 16) + local214 - 16777216;
				Static19.anIntArray30[local21++] = local226;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIILclient!fa;)V")
	public static void method5713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub12 arg3) {
		@Pc(16) long local16 = (long) (arg2 << 28 | arg1 << 14 | arg0);
		@Pc(22) Class1_Sub20 local22 = (Class1_Sub20) Static4.aClass230_2.method6144(local16);
		if (local22 == null) {
			local22 = new Class1_Sub20();
			Static4.aClass230_2.method6139(local16, local22);
			local22.aClass295_16.method7533(arg3);
			return;
		}
		@Pc(45) Class180 local45 = Static181.aClass316_1.method8107(arg3.anInt2502);
		@Pc(48) int local48 = local45.anInt5393;
		if (local45.anInt5433 == 1) {
			local48 *= arg3.anInt2500 + 1;
		}
		for (@Pc(71) Class1_Sub12 local71 = (Class1_Sub12) local22.aClass295_16.method7543(); local71 != null; local71 = (Class1_Sub12) local22.aClass295_16.method7540()) {
			local45 = Static181.aClass316_1.method8107(local71.anInt2502);
			@Pc(82) int local82 = local45.anInt5393;
			if (local45.anInt5433 == 1) {
				local82 *= local71.anInt2500 + 1;
			}
			if (local48 > local82) {
				Static363.method5896(arg3, local71);
				return;
			}
		}
		local22.aClass295_16.method7533(arg3);
	}
}
