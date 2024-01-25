import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static661 {

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZ)Lclient!is;")
	public static Class172 method9672(@OriginalArg(0) int arg0) {
		@Pc(10) Class172 local10 = (Class172) Static567.aClass22_58.method462((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static28.aClass124_8.method3641(1, arg0);
		local10 = new Class172();
		local10.anInt5063 = arg0;
		if (local20 != null) {
			local10.method4576(new Class2_Sub8(local20));
		}
		local10.method4568();
		if (local10.anInt5065 == 2 && Static346.aClass335_20.method8357((long) arg0) == null) {
			Static346.aClass335_20.method8356(new Class2_Sub14(Static78.anInt1445), (long) arg0);
			Static31.aClass172Array1[Static78.anInt1445++] = local10;
		}
		Static567.aClass22_58.method470((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wia", name = "g", descriptor = "(I)V")
	public static void method9673() {
		Static634.anInt10948++;
		Static56.anInt1101 = 0;
		Static406.anInt7569 = 0;
		Static568.method8664();
		Static506.method7901();
		Static330.method5445();
		@Pc(29) boolean local29 = false;
		@Pc(37) int local37;
		for (@Pc(31) int local31 = 0; local31 < Static406.anInt7569; local31++) {
			local37 = Static620.anIntArray562[local31];
			@Pc(44) Class2_Sub6 local44 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local37);
			@Pc(47) Class15_Sub3_Sub3_Sub1_Sub2 local47 = local44.aClass15_Sub3_Sub3_Sub1_Sub2_1;
			if (Static183.aBoolean305 && Static564.method8559(local37)) {
				Static482.method7662();
			}
			if (local47.anInt3999 != Static634.anInt10948) {
				if (local47.aClass312_1.method7946()) {
					Static656.method9621(local47);
				}
				local47.method3698((Class312) null);
				local44.method9825();
				local29 = true;
			}
		}
		if (local29) {
			Static487.anInt8726 = Static630.aClass335_29.method8361();
			Static630.aClass335_29.method8360(Static275.aClass2_Sub6Array1);
		}
		if (Static206.aClass2_Sub8_Sub2_1.anInt5725 != Static538.anInt9383) {
			throw new RuntimeException("gnp1 pos:" + Static206.aClass2_Sub8_Sub2_1.anInt5725 + " psize:" + Static538.anInt9383);
		}
		for (local37 = 0; local37 < Static532.anInt9330; local37++) {
			if (Static630.aClass335_29.method8357((long) Static84.anIntArray73[local37]) == null) {
				throw new RuntimeException("gnp2 pos:" + local37 + " size:" + Static532.anInt9330);
			}
		}
		if (Static487.anInt8726 - Static532.anInt9330 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static487.anInt8726 - Static532.anInt9330));
		}
		for (@Pc(163) int local163 = 0; local163 < Static487.anInt8726; local163++) {
			if (Static634.anInt10948 != Static275.aClass2_Sub6Array1[local163].aClass15_Sub3_Sub3_Sub1_Sub2_1.anInt3999) {
				throw new RuntimeException("gnp4 uk:" + Static275.aClass2_Sub6Array1[local163].aClass15_Sub3_Sub3_Sub1_Sub2_1.anInt3977);
			}
		}
	}
}
