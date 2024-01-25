import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!al", name = "l", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_6 = new Class55("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILjava/lang/String;IBI)V")
	public static void method92(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class95 local8 = Static407.method5110(arg0, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray30 != null) {
			@Pc(18) Class7_Sub18 local18 = new Class7_Sub18();
			local18.aString23 = arg1;
			local18.anInt2472 = arg3;
			local18.anObjectArray1 = local8.anObjectArray30;
			local18.aClass95_5 = local8;
			Static159.method2352(local18);
		}
		if (Static206.anInt3642 != 9) {
			return;
		}
		@Pc(41) boolean local41 = true;
		if (local8.anInt2607 != 0) {
			local41 = Static199.method2855(local8);
		}
		if (!local41 || !Static52.method725(local8).method1908(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static81.method1414(Static196.aClass2_59);
			Static201.method2884(local8.anInt2599, arg2, arg0);
		}
		if (arg3 == 2) {
			Static81.method1414(Static41.aClass2_14);
			Static201.method2884(local8.anInt2599, arg2, arg0);
		}
		if (arg3 == 3) {
			Static81.method1414(Static327.aClass2_87);
			Static201.method2884(local8.anInt2599, arg2, arg0);
		}
		if (arg3 == 4) {
			Static81.method1414(Static90.aClass2_37);
			Static201.method2884(local8.anInt2599, arg2, arg0);
		}
		if (arg3 == 5) {
			Static81.method1414(Static312.aClass2_80);
			Static201.method2884(local8.anInt2599, arg2, arg0);
		}
		if (arg3 == 6) {
			Static81.method1414(Static148.aClass2_50);
			Static201.method2884(local8.anInt2599, arg2, arg0);
		}
		if (arg3 == 7) {
			Static81.method1414(Static75.aClass2_28);
			Static201.method2884(local8.anInt2599, arg2, arg0);
		}
		if (arg3 == 8) {
			Static81.method1414(Static11.aClass2_3);
			Static201.method2884(local8.anInt2599, arg2, arg0);
		}
		if (arg3 == 9) {
			Static81.method1414(Static20.aClass2_42);
			Static201.method2884(local8.anInt2599, arg2, arg0);
		}
		if (arg3 == 10) {
			Static81.method1414(Static225.aClass2_77);
			Static201.method2884(local8.anInt2599, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public static void method94() {
		if (Static67.aFloat36 < 1024.0F) {
			Static67.aFloat36 = 1024.0F;
		}
		if (Static67.aFloat36 > 3072.0F) {
			Static67.aFloat36 = 3072.0F;
		}
		while (Static97.aFloat52 >= 16384.0F) {
			Static97.aFloat52 -= 16384.0F;
		}
		while (Static97.aFloat52 < 0.0F) {
			Static97.aFloat52 += 16384.0F;
		}
		@Pc(41) int local41 = Static335.anInt5453 >> 7;
		@Pc(45) int local45 = Static87.anInt1714 >> 7;
		@Pc(53) int local53 = Static333.method2748(Static268.anInt4539, Static87.anInt1714, Static335.anInt5453);
		@Pc(55) int local55 = 0;
		@Pc(85) int local85;
		if (local41 > 3 && local45 > 3 && local41 < Static333.anInt3375 - 4 && local45 < Static102.anInt2086 - 4) {
			for (local85 = local41 - 4; local85 <= local41 + 4; local85++) {
				for (@Pc(91) int local91 = local45 - 4; local91 <= local45 + 4; local91++) {
					@Pc(95) int local95 = Static268.anInt4539;
					if (local95 < 3 && Static148.method2268(local91, local85)) {
						local95++;
					}
					@Pc(108) int local108 = 0;
					if (Static386.aClass46_Sub1_2.aByteArrayArrayArray10 != null && Static386.aClass46_Sub1_2.aByteArrayArrayArray10[local95] != null) {
						local108 = (Static386.aClass46_Sub1_2.aByteArrayArrayArray10[local95][local85][local91] & 0xFF) * 8;
					}
					@Pc(141) int local141 = local108 + local53 - Static244.aClass165Array8[local95].l(local85, local91);
					if (local141 > local55) {
						local55 = local141;
					}
				}
			}
		}
		local85 = (local55 >> 0) * 1536;
		if (local85 > 786432) {
			local85 = 786432;
		}
		if (local85 < 262144) {
			local85 = 262144;
		}
		if (local85 > Static290.anInt4840) {
			Static290.anInt4840 += (local85 - Static290.anInt4840) / 24;
		} else if (local85 < Static290.anInt4840) {
			Static290.anInt4840 += (local85 - Static290.anInt4840) / 80;
		}
	}
}
