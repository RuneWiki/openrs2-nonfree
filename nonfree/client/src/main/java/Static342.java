import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!vg", name = "ab", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_218 = new Class221(102, 8);

	@OriginalMember(owner = "client!vg", name = "bb", descriptor = "[I")
	public static final int[] anIntArray508 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!vg", name = "cb", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_155 = new Class140("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!tb;Lclient!dh;ZLclient!dr;Lclient!fc;III)V")
	public static void method5578(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class2_Sub8 arg1, @OriginalArg(3) Class37 arg2, @OriginalArg(4) Class66 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg1.anInt1042 - arg4 / 2 - 5;
		@Pc(19) int local19 = arg6 + 2;
		if (arg3.anInt1767 != 0) {
			arg2.method3694(arg4 + 10, arg3.anInt1767, arg0.method5128() * arg5 + arg6 + 1 - local19, local15, local19);
		}
		if (arg3.anInt1731 != 0) {
			arg2.method3737(arg0.method5128() * arg5 + arg6 + 1 - local19, local15, arg3.anInt1731, local19, arg4 + 10);
		}
		@Pc(72) int local72 = arg3.anInt1747;
		if (arg1.aBoolean104 && arg3.anInt1735 != -1) {
			local72 = arg3.anInt1735;
		}
		for (@Pc(89) int local89 = 0; local89 < arg5; local89++) {
			@Pc(95) String local95 = Static358.aStringArray43[local89];
			if (arg5 - 1 > local89) {
				local95 = local95.substring(0, local95.length() - 4);
			}
			arg0.method5131(arg2, local95, arg1.anInt1042, arg6, local72);
			arg6 += arg0.method5128();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBI)V")
	public static void method5579(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) Class191 local9 = Static68.aClass191ArrayArray1[arg0][arg1];
		Static310.method5163(5000, local9 == null ? Static84.aClass191_2 : local9);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
	public static void method5580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static300.method5057(Static182.aClass157_89);
		Static197.aClass2_Sub12_Sub2_2.method3115(arg1);
		Static197.aClass2_Sub12_Sub2_2.method3138(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!bs;Z)Z")
	public static boolean method5581(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static9.aClass105Array1 == Static121.aClass105Array3;
		@Pc(8) int local8 = 0;
		arg0.method5767();
		if (arg0.aShort89 < 0 || arg0.aShort90 < 0 || arg0.aShort88 >= Static344.anInt6692 || arg0.aShort87 >= Static63.anInt1129) {
			return false;
		}
		@Pc(34) int local34;
		for (@Pc(30) int local30 = arg0.aShort89; local30 <= arg0.aShort88; local30++) {
			for (local34 = arg0.aShort90; local34 <= arg0.aShort87; local34++) {
				@Pc(41) Class51 local41 = Static261.method4461(arg0.aByte77, local30, local34);
				if (local41 != null) {
					@Pc(45) int local45 = 0;
					if (local30 > arg0.aShort89) {
						local45++;
					}
					if (local30 < arg0.aShort88) {
						local45 += 4;
					}
					if (local34 > arg0.aShort90) {
						local45 += 8;
					}
					if (local34 < arg0.aShort87) {
						local45 += 2;
					}
					@Pc(70) Class11 local70 = Static88.method1744(arg0, local45);
					@Pc(73) Class11 local73 = local41.aClass11_2;
					if (local73 == null) {
						local41.aClass11_2 = local70;
					} else {
						while (local73.aClass11_1 != null) {
							local73 = local73.aClass11_1;
						}
						local73.aClass11_1 = local70;
					}
					local41.aByte7 = (byte) (local41.aByte7 | local45);
				}
				if (local6 && Static26.anIntArrayArray35[local30][local34] != 0) {
					local8 = Static26.anIntArrayArray35[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort89; local34 <= arg0.aShort88; local34++) {
				for (@Pc(130) int local130 = arg0.aShort90; local130 <= arg0.aShort87; local130++) {
					if (Static26.anIntArrayArray35[local34][local130] == 0) {
						Static26.anIntArrayArray35[local34][local130] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static230.aClass1_Sub2Array6[Static204.anInt4466++] = arg0;
		}
		return true;
	}
}
