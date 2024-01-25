import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!qe;I)Z")
	public static boolean method7355(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub14_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method6052(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(101) int local101;
		@Pc(105) int local105;
		@Pc(111) int local111;
		if (local8 == 0) {
			if (arg1.method6052(1) != 0) {
				method7355(arg0, arg1);
			}
			local25 = arg1.method6052(6);
			local30 = arg1.method6052(6);
			@Pc(44) boolean local44 = arg1.method6052(1) == 1;
			if (local44) {
				Static451.anIntArray617[Static480.anInt8070++] = arg0;
			}
			if (Static346.aClass29_Sub2_Sub1_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(67) Class47 local67 = Static560.aClass47Array4[arg0];
			@Pc(75) Class29_Sub2_Sub1_Sub2 local75 = Static346.aClass29_Sub2_Sub1_Sub2Array1[arg0] = new Class29_Sub2_Sub1_Sub2();
			local75.anInt8541 = arg0;
			if (Static167.aClass6_Sub14Array1[arg0] != null) {
				local75.method7020(Static167.aClass6_Sub14Array1[arg0]);
			}
			local75.method7007(local67.anInt936, true);
			local75.anInt8513 = local67.anInt934;
			local101 = local67.anInt933;
			local105 = local101 >> 28;
			local111 = local101 >> 14 & 0xFF;
			@Pc(115) int local115 = local101 & 0xFF;
			local75.aBoolean601 = local67.aBoolean48;
			local75.aByteArray110[0] = Static556.aByteArray122[arg0];
			local75.aByte103 = (byte) local105;
			local75.method7024(local25 + (local111 << 6) - Static218.anInt3718, -Static167.anInt3048 + (local115 << 6) - -local30);
			local75.aBoolean603 = false;
			Static560.aClass47Array4[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local25 = arg1.method6052(2);
			local30 = Static560.aClass47Array4[arg0].anInt933;
			Static560.aClass47Array4[arg0].anInt933 = (local30 & 0xFFFFFFF) + (((local30 >> 28) + local25 & 0x3) << 28);
			return false;
		} else {
			@Pc(212) int local212;
			@Pc(217) int local217;
			@Pc(226) int local226;
			if (local8 != 2) {
				local25 = arg1.method6052(18);
				local30 = local25 >> 16;
				local212 = local25 >> 8 & 0xFF;
				local217 = local25 & 0xFF;
				local226 = Static560.aClass47Array4[arg0].anInt933;
				local101 = (local226 >> 28) + local30 & 0x3;
				local105 = (local226 >> 14) + local212 & 0xFF;
				local111 = local217 + local226 & 0xFF;
				Static560.aClass47Array4[arg0].anInt933 = local111 + (local101 << 28) + (local105 << 14);
				return false;
			}
			local25 = arg1.method6052(5);
			local30 = local25 >> 3;
			local212 = local25 & 0x7;
			local217 = Static560.aClass47Array4[arg0].anInt933;
			local226 = (local217 >> 28) + local30 & 0x3;
			local101 = local217 >> 14 & 0xFF;
			local105 = local217 & 0xFF;
			if (local212 == 0) {
				local105--;
				local101--;
			}
			if (local212 == 1) {
				local105--;
			}
			if (local212 == 2) {
				local101++;
				local105--;
			}
			if (local212 == 3) {
				local101--;
			}
			if (local212 == 4) {
				local101++;
			}
			if (local212 == 5) {
				local105++;
				local101--;
			}
			if (local212 == 6) {
				local105++;
			}
			if (local212 == 7) {
				local101++;
				local105++;
			}
			Static560.aClass47Array4[arg0].anInt933 = (local101 << 14) + (local226 << 28) + local105;
			return false;
		}
	}
}
