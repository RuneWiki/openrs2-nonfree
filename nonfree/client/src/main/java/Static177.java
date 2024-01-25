import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_65 = new Class90(33, -1);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIII)I")
	public static int method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg2 >> 1) + ((arg1 >> 2 & 0x3F) << 10) + (arg0 >> 5 << 7);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!sj;I)Z")
	public static boolean method2939(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub13_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method7065(2);
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg1.method7065(1) != 0) {
				method2939(arg0, arg1);
			}
			local30 = arg1.method7065(6);
			local35 = arg1.method7065(6);
			@Pc(45) boolean local45 = arg1.method7065(1) == 1;
			if (local45) {
				Static442.anIntArray491[Static124.anInt2827++] = arg0;
			}
			if (Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class337 local68 = Static140.aClass337Array1[arg0];
			@Pc(76) Class21_Sub1_Sub1_Sub1_Sub2 local76 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[arg0] = new Class21_Sub1_Sub1_Sub1_Sub2();
			local76.anInt4256 = arg0;
			if (Static229.aClass4_Sub13Array1[arg0] != null) {
				local76.method3356(Static229.aClass4_Sub13Array1[arg0]);
			}
			local76.method3340(true, local68.anInt10017);
			local76.anInt4263 = local68.anInt10018;
			local102 = local68.anInt10020;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			@Pc(116) int local116 = local102 & 0xFF;
			@Pc(126) int local126 = (local112 << 6) + local30 - Static242.anInt10133;
			@Pc(136) int local136 = (local116 << 6) + local35 - Static157.anInt3323;
			local76.aBoolean302 = local68.aBoolean692;
			local76.aByteArray34[0] = Static298.aByteArray48[arg0];
			local76.aByte127 = local76.aByte128 = (byte) local106;
			if (Static193.method3175(local136, local126)) {
				local76.aByte128++;
			}
			local76.method3346(local126, local136);
			local76.aBoolean303 = false;
			Static140.aClass337Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local30 = arg1.method7065(2);
			local35 = Static140.aClass337Array1[arg0].anInt10020;
			Static140.aClass337Array1[arg0].anInt10020 = (local35 & 0xFFFFFFF) + ((local30 + (local35 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(230) int local230;
			@Pc(235) int local235;
			@Pc(243) int local243;
			if (local8 != 2) {
				local30 = arg1.method7065(18);
				local35 = local30 >> 16;
				local230 = local30 >> 8 & 0xFF;
				local235 = local30 & 0xFF;
				local243 = Static140.aClass337Array1[arg0].anInt10020;
				local102 = local35 + (local243 >> 28) & 0x3;
				local106 = local230 + (local243 >> 14) & 0xFF;
				local112 = local243 + local235 & 0xFF;
				Static140.aClass337Array1[arg0].anInt10020 = (local102 << 28) + (local106 << 14) + local112;
				return false;
			}
			local30 = arg1.method7065(5);
			local35 = local30 >> 3;
			local230 = local30 & 0x7;
			local235 = Static140.aClass337Array1[arg0].anInt10020;
			local243 = local35 + (local235 >> 28) & 0x3;
			local102 = local235 >> 14 & 0xFF;
			local106 = local235 & 0xFF;
			if (local230 == 0) {
				local102--;
				local106--;
			}
			if (local230 == 1) {
				local106--;
			}
			if (local230 == 2) {
				local106--;
				local102++;
			}
			if (local230 == 3) {
				local102--;
			}
			if (local230 == 4) {
				local102++;
			}
			if (local230 == 5) {
				local102--;
				local106++;
			}
			if (local230 == 6) {
				local106++;
			}
			if (local230 == 7) {
				local106++;
				local102++;
			}
			Static140.aClass337Array1[arg0].anInt10020 = local106 + (local102 << 14) + (local243 << 28);
			return false;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BILjava/net/Socket;)Lclient!bj;")
	public static Class36 method2946(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class36_Sub1(arg0, 7500);
	}
}
