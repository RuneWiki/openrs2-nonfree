import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!tq;)Z")
	public static boolean method4679(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method5577(2);
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(103) int local103;
		@Pc(107) int local107;
		@Pc(113) int local113;
		if (local8 == 0) {
			if (arg1.method5577(1) != 0) {
				method4679(arg0, arg1);
			}
			local29 = arg1.method5577(6);
			local34 = arg1.method5577(6);
			@Pc(46) boolean local46 = arg1.method5577(1) == 1;
			if (local46) {
				Static18.anIntArray38[Static422.anInt3434++] = arg0;
			}
			if (Static435.aClass11_Sub5_Sub2_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(69) Class175 local69 = Static385.aClass175Array1[arg0];
			@Pc(77) Class11_Sub5_Sub2_Sub1 local77 = Static435.aClass11_Sub5_Sub2_Sub1Array1[arg0] = new Class11_Sub5_Sub2_Sub1();
			local77.anInt7670 = arg0;
			if (Static176.aClass2_Sub17Array1[arg0] != null) {
				local77.method2106(Static176.aClass2_Sub17Array1[arg0]);
			}
			local77.method6225(true, local69.anInt4625);
			local77.anInt7656 = local69.anInt4622;
			local103 = local69.anInt4624;
			local107 = local103 >> 28;
			local113 = local103 >> 14 & 0xFF;
			local77.aBoolean144 = local69.aBoolean331;
			@Pc(121) int local121 = local103 & 0xFF;
			local77.aByteArray96[0] = Static436.aByteArray89[arg0];
			local77.aByte101 = (byte) local107;
			local77.method2111((local113 << 6) + local29 - Static386.anInt7205, (local121 << 6) - -local34 + -Static153.anInt2798);
			local77.aBoolean146 = false;
			Static385.aClass175Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local29 = arg1.method5577(2);
			local34 = Static385.aClass175Array1[arg0].anInt4624;
			Static385.aClass175Array1[arg0].anInt4624 = (((local34 >> 28) + local29 & 0x3) << 28) + (local34 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(214) int local214;
			@Pc(219) int local219;
			@Pc(228) int local228;
			if (local8 != 2) {
				local29 = arg1.method5577(18);
				local34 = local29 >> 16;
				local214 = local29 >> 8 & 0xFF;
				local219 = local29 & 0xFF;
				local228 = Static385.aClass175Array1[arg0].anInt4624;
				local103 = (local228 >> 28) + local34 & 0x3;
				local107 = (local228 >> 14) + local214 & 0xFF;
				local113 = local228 + local219 & 0xFF;
				Static385.aClass175Array1[arg0].anInt4624 = local113 + (local107 << 14) + (local103 << 28);
				return false;
			}
			local29 = arg1.method5577(5);
			local34 = local29 >> 3;
			local214 = local29 & 0x7;
			local219 = Static385.aClass175Array1[arg0].anInt4624;
			local228 = (local219 >> 28) + local34 & 0x3;
			local103 = local219 >> 14 & 0xFF;
			local107 = local219 & 0xFF;
			if (local214 == 0) {
				local107--;
				local103--;
			}
			if (local214 == 1) {
				local107--;
			}
			if (local214 == 2) {
				local107--;
				local103++;
			}
			if (local214 == 3) {
				local103--;
			}
			if (local214 == 4) {
				local103++;
			}
			if (local214 == 5) {
				local103--;
				local107++;
			}
			if (local214 == 6) {
				local107++;
			}
			if (local214 == 7) {
				local107++;
				local103++;
			}
			Static385.aClass175Array1[arg0].anInt4624 = (local103 << 14) + ((local228 << 28) + local107);
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
	public static void method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg2 * Static434.aClass165_Sub1_1.anInt4208 >> 8;
		if (local6 != 0 && arg1 != -1) {
			Static124.method1968(arg1, Static354.aClass171_80, local6);
			Static235.aBoolean262 = true;
		}
	}
}
