import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public static void method5814(@OriginalArg(0) byte arg0) {
		Static560.anInt9473 = 0;
		Static550.anInt9297++;
		Static552.anInt9321 = 0;
		Static276.method4068();
		Static50.method786();
		Static59.method843();
		@Pc(21) boolean local21 = false;
		@Pc(31) int local31;
		for (@Pc(23) int local23 = 0; local23 < Static552.anInt9321; local23++) {
			local31 = Static118.anIntArray16[local23];
			@Pc(38) Class5_Sub35 local38 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local31, 1);
			@Pc(41) Class8_Sub1_Sub3_Sub2_Sub2 local41 = local38.aClass8_Sub1_Sub3_Sub2_Sub2_2;
			if (Static526.aBoolean669 && Static19.method297(local31)) {
				Static615.method8728();
			}
			if (local41.anInt7040 != Static550.anInt9297) {
				if (local41.aClass227_1.method5327(arg0 ^ 0xFFFF94F8)) {
					Static616.method8741(local41);
				}
				local41.method6004((Class227) null);
				local38.method9327(1);
				local21 = true;
			}
		}
		if (arg0 != -28) {
			method5814((byte) -27);
		}
		if (local21) {
			Static230.anInt3776 = Static623.aClass291_43.method6995();
			Static623.aClass291_43.method6990(Static85.aClass5_Sub35Array1);
		}
		if (Static515.aClass5_Sub23_Sub2_1.anInt9869 != Static327.anInt5853) {
			throw new RuntimeException("gnp1 pos:" + Static515.aClass5_Sub23_Sub2_1.anInt9869 + " psize:" + Static327.anInt5853);
		}
		for (local31 = 0; local31 < Static247.anInt4256; local31++) {
			if (Static623.aClass291_43.method6993((long) Static671.anIntArray620[local31], arg0 + 29) == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static247.anInt4256);
			}
		}
		if (Static230.anInt3776 - Static247.anInt4256 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static230.anInt3776 - Static247.anInt4256));
		}
		for (@Pc(205) int local205 = 0; local205 < Static230.anInt3776; local205++) {
			if (Static550.anInt9297 != Static85.aClass5_Sub35Array1[local205].aClass8_Sub1_Sub3_Sub2_Sub2_2.anInt7040) {
				throw new RuntimeException("gnp4 uk:" + Static85.aClass5_Sub35Array1[local205].aClass8_Sub1_Sub3_Sub2_Sub2_2.anInt6994);
			}
		}
	}
}
