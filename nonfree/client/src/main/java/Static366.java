import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!lja", name = "I", descriptor = "I")
	public static int anInt5876;

	@OriginalMember(owner = "client!lja", name = "G", descriptor = "Z")
	public static boolean aBoolean494 = false;

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(III)Lclient!uca;")
	public static Class4_Sub2_Sub4 method5263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub2_Sub4_1;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Lclient!oh;III)V")
	public static void method5264(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static479.anInt7692 = arg2;
		Static587.anInt8114 = arg1;
		Static171.aClass273_3 = arg0;
	}

	@OriginalMember(owner = "client!lja", name = "f", descriptor = "(I)V")
	public static void method5265() {
		Static584.anInt9206 = 0;
		Static646.anInt9915++;
		Static682.anInt11016 = 0;
		Static308.method4290();
		Static711.method9467();
		Static689.method9303(-5870);
		@Pc(21) boolean local21 = false;
		@Pc(31) int local31;
		for (@Pc(23) int local23 = 0; local23 < Static682.anInt11016; local23++) {
			local31 = Static169.anIntArray220[local23];
			@Pc(38) Class2_Sub49 local38 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local31, 0);
			@Pc(41) Class4_Sub2_Sub1_Sub2_Sub2 local41 = local38.aClass4_Sub2_Sub1_Sub2_Sub2_3;
			if (Static646.anInt9915 != local41.anInt2360) {
				if (Static189.aBoolean301 && Static347.method4807(local31)) {
					Static640.method8677();
				}
				if (local41.aClass261_1.method6273()) {
					Static647.method8754(local41);
				}
				local41.method2068((Class261) null);
				local21 = true;
				local38.method9872();
			}
		}
		if (local21) {
			Static676.anInt10488 = Static467.aClass218_37.method5094();
			Static467.aClass218_37.method5091(Static459.aClass2_Sub49Array1);
		}
		if (Static487.aClass221_2.aClass2_Sub20_Sub2_2.anInt9723 != Static487.aClass221_2.anInt5773) {
			throw new RuntimeException("gnp1 pos:" + Static487.aClass221_2.aClass2_Sub20_Sub2_2.anInt9723 + " psize:" + Static487.aClass221_2.anInt5773);
		}
		for (local31 = 0; local31 < Static217.anInt3445; local31++) {
			if (Static467.aClass218_37.method5095((long) Static266.anIntArray305[local31], 0) == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static217.anInt3445);
			}
		}
		if (Static676.anInt10488 - Static217.anInt3445 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static676.anInt10488 - Static217.anInt3445));
		}
		for (@Pc(201) int local201 = 0; local201 < Static676.anInt10488; local201++) {
			if (Static646.anInt9915 != Static459.aClass2_Sub49Array1[local201].aClass4_Sub2_Sub1_Sub2_Sub2_3.anInt2360) {
				throw new RuntimeException("gnp4 uk:" + Static459.aClass2_Sub49Array1[local201].aClass4_Sub2_Sub1_Sub2_Sub2_3.anInt2320);
			}
		}
	}
}
