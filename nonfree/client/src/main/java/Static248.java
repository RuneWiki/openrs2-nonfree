import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	public static int anInt5406 = 0;

	@OriginalMember(owner = "client!io", name = "d", descriptor = "[I")
	public static final int[] anIntArray223 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method4428(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static566.anInt9748 > 0) {
			local18 = Static298.aByteArrayArray17[--Static566.anInt9748];
			Static298.aByteArrayArray17[Static566.anInt9748] = null;
			return local18;
		} else if (arg0 == 5000 && Static72.anInt2387 > 0) {
			local18 = Static623.aByteArrayArray34[--Static72.anInt2387];
			Static623.aByteArrayArray34[Static72.anInt2387] = null;
			return local18;
		} else if (arg0 == 30000 && Static21.anInt646 > 0) {
			local18 = Static221.aByteArrayArray10[--Static21.anInt646];
			Static221.aByteArrayArray10[Static21.anInt646] = null;
			return local18;
		} else {
			if (Static353.aByteArrayArrayArray2 != null) {
				for (@Pc(73) int local73 = 0; local73 < Static176.anIntArray183.length; local73++) {
					if (arg0 == Static176.anIntArray183[local73] && Static174.anIntArray180[local73] > 0) {
						@Pc(99) byte[] local99 = Static353.aByteArrayArrayArray2[local73][--Static174.anIntArray180[local73]];
						Static353.aByteArrayArrayArray2[local73][Static174.anIntArray180[local73]] = null;
						return local99;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!gg;)V")
	public static void method4430(@OriginalArg(0) Class9_Sub4 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class9_Sub4 local7 = null;
			for (@Pc(11) Class9_Sub4 local11 = Static645.aClass9_Sub4Array6[local4]; local11 != null; local11 = local11.aClass9_Sub4_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static645.aClass9_Sub4Array6[local4] = local11.aClass9_Sub4_23;
					} else {
						local7.aClass9_Sub4_23 = local11.aClass9_Sub4_23;
					}
					Static610.aBoolean810 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class9_Sub4 local43 = Static611.aClass9_Sub4Array5[local4]; local43 != null; local43 = local43.aClass9_Sub4_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static611.aClass9_Sub4Array5[local4] = local43.aClass9_Sub4_23;
					} else {
						local7.aClass9_Sub4_23 = local43.aClass9_Sub4_23;
					}
					Static610.aBoolean810 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class9_Sub4 local75 = Static249.aClass9_Sub4Array4[local4]; local75 != null; local75 = local75.aClass9_Sub4_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static249.aClass9_Sub4Array4[local4] = local75.aClass9_Sub4_23;
					} else {
						local7.aClass9_Sub4_23 = local75.aClass9_Sub4_23;
					}
					Static610.aBoolean810 = true;
					return;
				}
				local7 = local75;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B[B)V")
	public static synchronized void method4431(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static566.anInt9748 < 1000) {
			Static298.aByteArrayArray17[Static566.anInt9748++] = arg0;
		} else if (arg0.length == 5000 && Static72.anInt2387 < 250) {
			Static623.aByteArrayArray34[Static72.anInt2387++] = arg0;
		} else if (arg0.length == 30000 && Static21.anInt646 < 50) {
			Static221.aByteArrayArray10[Static21.anInt646++] = arg0;
		} else if (Static353.aByteArrayArrayArray2 != null) {
			for (@Pc(66) int local66 = 0; local66 < Static176.anIntArray183.length; local66++) {
				if (Static176.anIntArray183[local66] == arg0.length && Static174.anIntArray180[local66] < Static353.aByteArrayArrayArray2[local66].length) {
					Static353.aByteArrayArrayArray2[local66][Static174.anIntArray180[local66]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()V")
	public static void method4432() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static52.aClass186ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static52.aClass186ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static623.anInt10485; local6++) {
					for (local9 = 0; local9 < Static142.anInt3372; local9++) {
						if (Static52.aClass186ArrayArrayArray2[local3][local6][local9] != null) {
							Static52.aClass186ArrayArrayArray2[local3][local6][local9].method5328();
						}
						Static52.aClass186ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static52.aClass186ArrayArrayArray2 = null;
		Static150.aClass245Array2 = null;
		if (Static444.aClass186ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static444.aClass186ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static623.anInt10485; local6++) {
					for (local9 = 0; local9 < Static142.anInt3372; local9++) {
						if (Static444.aClass186ArrayArrayArray3[local3][local6][local9] != null) {
							Static444.aClass186ArrayArrayArray3[local3][local6][local9].method5328();
						}
						Static444.aClass186ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static444.aClass186ArrayArrayArray3 = null;
		Static152.aClass245Array3 = null;
		Static26.aClass186ArrayArrayArray1 = null;
		Static148.aClass245Array1 = null;
		Static137.aBooleanArrayArray1 = null;
		Static551.aBooleanArrayArray7 = null;
		Static592.anIntArray540 = null;
		Static71.aBooleanArrayArrayArray1 = null;
		Static223.aBooleanArrayArrayArray2 = null;
		Static482.method7109();
		if (Static560.aClass9_Sub4_Sub2Array1 != null) {
			for (local3 = 0; local3 < Static592.anInt10005; local3++) {
				Static560.aClass9_Sub4_Sub2Array1[local3] = null;
			}
			Static592.anInt10005 = 0;
		}
		Static645.aClass9_Sub4Array6 = null;
		Static611.aClass9_Sub4Array5 = null;
		Static249.aClass9_Sub4Array4 = null;
		if (Static67.aClass9_Sub4Array3 != null) {
			for (local3 = 0; local3 < Static67.aClass9_Sub4Array3.length; local3++) {
				Static67.aClass9_Sub4Array3[local3] = null;
			}
			Static525.anInt9179 = 0;
		}
		if (Static547.aClass9_Sub4Array2 != null) {
			for (local3 = 0; local3 < Static547.aClass9_Sub4Array2.length; local3++) {
				Static547.aClass9_Sub4Array2[local3] = null;
			}
			Static604.anInt10261 = 0;
		}
		if (Static489.aClass3Array1 != null) {
			for (local3 = 0; local3 < Static402.anInt7480; local3++) {
				Static489.aClass3Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static618.anInt10427; local6++) {
				for (local9 = 0; local9 < Static623.anInt10485; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static142.anInt3372; local195++) {
						Static531.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static402.anInt7480 = 0;
		}
		Static300.method5130();
		Static418.aClass100_1 = Static418.aClass100_2;
		Static418.aClass100_1.method3066();
		Static578.aByteArrayArray32 = null;
		Static80.anIntArrayArray5 = null;
		Static527.aShortArrayArray30 = null;
		if (Static93.aClass188Array1 != null) {
			Static438.method6714();
			Static472.aClass5_14.method6146(1);
			Static472.aClass5_14.method6170(0);
		}
		if (Static512.aClass260Array1 != null) {
			Static512.aClass260Array1 = null;
		}
		Static472.aClass5_14 = null;
	}
}
