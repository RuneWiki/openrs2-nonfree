import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!ko", name = "qb", descriptor = "I")
	public static int anInt5896;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method5330(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(local8 + local10);
		for (@Pc(47) int local47 = 0; local47 < local8; local47++) {
			@Pc(53) char local53 = arg0.charAt(local47);
			if (local53 == '<') {
				local45.append("<lt>");
			} else if (local53 == '>') {
				local45.append("<gt>");
			} else {
				local45.append(local53);
			}
		}
		return local45.toString();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZIIII)V")
	public static void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) Class326[] local7 = Static382.aClass326Array3;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class326 local15 = local7[local9];
			if (local15 != null && local15.anInt9321 == 2) {
				Static588.method8876(local15.anInt9317, local15.anInt9323, arg2 >> 1, local15.anInt9318, arg0 >> 1, local15.anInt9325 * 2);
				if (Static91.anIntArray83[0] > -1 && Static62.anInt1184 % 20 < 10) {
					@Pc(60) Class71 local60 = Static200.aClass71Array21[local15.anInt9319];
					@Pc(68) int local68 = arg1 + Static91.anIntArray83[0] - 12;
					@Pc(76) int local76 = Static91.anIntArray83[1] + arg3 - 28;
					local60.method7703(local68, local76);
					Static220.method4070(local76 + local60.method7711(), local76, local68, local60.method7709() + local68);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIII)V")
	public static void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static631.anInt10922 < arg0 || Static427.anInt7845 > arg4) {
			return;
		}
		@Pc(30) boolean local30;
		if (arg2 < Static457.anInt8209) {
			arg2 = Static457.anInt8209;
			local30 = false;
		} else if (Static407.anInt7583 >= arg2) {
			local30 = true;
		} else {
			arg2 = Static407.anInt7583;
			local30 = false;
		}
		@Pc(55) boolean local55;
		if (Static457.anInt8209 > arg1) {
			arg1 = Static457.anInt8209;
			local55 = false;
		} else if (arg1 <= Static407.anInt7583) {
			local55 = true;
		} else {
			local55 = false;
			arg1 = Static407.anInt7583;
		}
		if (Static427.anInt7845 <= arg0) {
			Static567.method8614(arg2, arg1, Static186.anIntArrayArray12[arg0++], arg3);
		} else {
			arg0 = Static427.anInt7845;
		}
		if (Static631.anInt10922 < arg4) {
			arg4 = Static631.anInt10922;
		} else {
			Static567.method8614(arg2, arg1, Static186.anIntArrayArray12[arg4--], arg3);
		}
		@Pc(109) int local109;
		if (local30 && local55) {
			for (local109 = arg0; local109 <= arg4; local109++) {
				@Pc(115) int[] local115 = Static186.anIntArrayArray12[local109];
				local115[arg2] = local115[arg1] = arg3;
			}
			return;
		}
		if (local30) {
			for (local109 = arg0; local109 <= arg4; local109++) {
				Static186.anIntArrayArray12[local109][arg2] = arg3;
			}
			return;
		}
		if (local55) {
			for (local109 = arg0; local109 <= arg4; local109++) {
				Static186.anIntArrayArray12[local109][arg1] = arg3;
			}
			return;
		}
	}
}
