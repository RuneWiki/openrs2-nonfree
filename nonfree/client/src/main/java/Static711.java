import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static711 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Lclient!hja;")
	public static Class157 aClass157_1;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public static int anInt10853 = 0;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Lclient!hfa;")
	public static final Class152 aClass152_10 = new Class152(9, 2);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!ifa;)I")
	public static int method9465(@OriginalArg(1) Class175 arg0) {
		if (Static172.aClass175_2 == arg0) {
			return 9216;
		} else if (arg0 == Static617.aClass175_6) {
			return 34065;
		} else if (arg0 == Static540.aClass175_5) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public static void method9467() {
		@Pc(15) Class2_Sub20_Sub2 local15 = Static487.aClass221_2.aClass2_Sub20_Sub2_2;
		while (local15.method8599(Static487.aClass221_2.anInt5773) >= 15) {
			@Pc(29) int local29 = local15.method8608(15);
			if (local29 == 32767) {
				break;
			}
			@Pc(34) boolean local34 = false;
			@Pc(41) Class2_Sub49 local41 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local29, 0);
			@Pc(47) Class4_Sub2_Sub1_Sub2_Sub2 local47;
			if (local41 == null) {
				local47 = new Class4_Sub2_Sub1_Sub2_Sub2();
				local47.anInt2320 = local29;
				local41 = new Class2_Sub49(local47);
				Static467.aClass218_37.method5099(local41, (long) local29);
				local34 = true;
				Static459.aClass2_Sub49Array1[Static676.anInt10488++] = local41;
			}
			local47 = local41.aClass4_Sub2_Sub1_Sub2_Sub2_3;
			Static266.anIntArray305[Static217.anInt3445++] = local29;
			local47.anInt2360 = Static646.anInt9915;
			if (local47.aClass261_1 != null && local47.aClass261_1.method6273()) {
				Static647.method8754(local47);
			}
			@Pc(105) int local105 = local15.method8608(1);
			@Pc(116) int local116 = (local15.method8608(3) + 4 & 0xB7000007) << 11;
			@Pc(121) int local121 = local15.method8608(2);
			@Pc(126) int local126 = local15.method8608(1);
			if (local126 == 1) {
				Static45.anIntArray57[Static584.anInt9206++] = local29;
			}
			@Pc(146) int local146 = local15.method8608(5);
			local47.method2068(Static192.aClass41_1.method754(local15.method8608(15), 2));
			if (local146 > 15) {
				local146 -= 32;
			}
			@Pc(169) int local169 = local15.method8608(5);
			if (local169 > 15) {
				local169 -= 32;
			}
			local47.method2057(local47.aClass261_1.anInt7010);
			local47.anInt2357 = local47.aClass261_1.anInt7015 << 3;
			if (local34) {
				local47.method2054(true, local116);
			}
			local47.method2071(local121, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray183[0] + local169, local146 + Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray182[0], local105 == 1, local47.method2046());
			if (local47.aClass261_1.method6273()) {
				Static255.method3624(local47.anIntArray182[0], (Class4_Sub2_Sub1_Sub2_Sub1) null, 0, local47, (Class81) null, local47.anIntArray183[0], local47.aByte133);
			}
		}
		local15.method8605();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
	public static void method9468(@OriginalArg(1) int arg0) {
		Static226.anInt3596 = arg0;
		Static33.aClass85_3.method1748();
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)I")
	public static int method9469() {
		return 15;
	}
}
