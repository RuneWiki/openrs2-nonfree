import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!mv;II)Z")
	public static boolean method3071(@OriginalArg(0) Class1_Sub11_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method3347(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg0.method3347(1) != 0) {
				method3071(arg0, arg1);
			}
			local31 = arg0.method3347(6);
			local36 = arg0.method3347(6);
			@Pc(46) boolean local46 = arg0.method3347(1) == 1;
			if (local46) {
				Static382.anIntArray393[Static405.anInt6543++] = arg1;
			}
			if (Static73.aClass20_Sub3_Sub3_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(69) Class112 local69 = Static230.aClass112Array2[arg1];
			@Pc(77) Class20_Sub3_Sub3_Sub1 local77 = Static73.aClass20_Sub3_Sub3_Sub1Array1[arg1] = new Class20_Sub3_Sub3_Sub1();
			local77.anInt6045 = arg1;
			if (Static72.aClass1_Sub11Array1[arg1] != null) {
				local77.method3882(Static72.aClass1_Sub11Array1[arg1]);
			}
			local77.method4686(local69.anInt2705);
			local77.anInt6012 = local69.anInt2708;
			local102 = local69.anInt2707;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			@Pc(116) int local116 = local102 & 0xFF;
			local77.aBoolean395 = local69.aBoolean216;
			local77.aByteArray67[0] = Static225.aByteArray38[arg1];
			local77.aByte89 = (byte) local106;
			local77.method3877((local112 << 6) + local31 - Static101.anInt6646, -Static278.anInt4392 + local36 + (local116 << 6));
			local77.aBoolean394 = false;
			Static230.aClass112Array2[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.method3347(2);
			local36 = Static230.aClass112Array2[arg1].anInt2707;
			Static230.aClass112Array2[arg1].anInt2707 = ((local31 + (local36 >> 28) & 0x3) << 28) + (local36 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(208) int local208;
			@Pc(213) int local213;
			@Pc(221) int local221;
			if (local8 != 2) {
				local31 = arg0.method3347(18);
				local36 = local31 >> 16;
				local208 = local31 >> 8 & 0xFF;
				local213 = local31 & 0xFF;
				local221 = Static230.aClass112Array2[arg1].anInt2707;
				local102 = (local221 >> 28) + local36 & 0x3;
				local106 = local208 + (local221 >> 14) & 0xFF;
				local112 = local221 + local213 & 0xFF;
				Static230.aClass112Array2[arg1].anInt2707 = local112 + (local102 << 28) + (local106 << 14);
				return false;
			}
			local31 = arg0.method3347(5);
			local36 = local31 >> 3;
			local208 = local31 & 0x7;
			local213 = Static230.aClass112Array2[arg1].anInt2707;
			local221 = (local213 >> 28) + local36 & 0x3;
			local102 = local213 >> 14 & 0xFF;
			local106 = local213 & 0xFF;
			if (local208 == 0) {
				local106--;
				local102--;
			}
			if (local208 == 1) {
				local106--;
			}
			if (local208 == 2) {
				local102++;
				local106--;
			}
			if (local208 == 3) {
				local102--;
			}
			if (local208 == 4) {
				local102++;
			}
			if (local208 == 5) {
				local106++;
				local102--;
			}
			if (local208 == 6) {
				local106++;
			}
			if (local208 == 7) {
				local106++;
				local102++;
			}
			Static230.aClass112Array2[arg1].anInt2707 = local106 + (local102 << 14) + (local221 << 28);
			return false;
		}
	}
}
