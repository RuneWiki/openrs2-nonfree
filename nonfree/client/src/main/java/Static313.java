import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_120 = new Class265(50, 12);

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "[I")
	public static final int[] anIntArray450 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "[I")
	public static final int[] anIntArray451 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZZZ)V")
	public static void method4399(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static252.anInt4749--;
			if (Static252.anInt4749 == 0) {
				Static199.anIntArray337 = null;
			}
		}
		if (arg0) {
			Static82.anInt1800--;
			if (Static82.anInt1800 == 0) {
				Static244.anIntArray595 = null;
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!q;ZZZ)V")
	public static void method4400(@OriginalArg(0) Class2_Sub35 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt5537;
		@Pc(12) int local12 = (int) arg0.aLong227;
		arg0.method5866();
		if (arg1) {
			Static384.method5097(local8);
		}
		Static87.method1705(local8);
		@Pc(27) Class68 local27 = Static165.method2704(local12);
		if (local27 != null) {
			Static78.method1460(local27);
		}
		Static429.method5146();
		if (!arg2 && Static410.anInt6841 != -1) {
			Static76.method1390(Static410.anInt6841, 1);
		}
		@Pc(48) Class15 local48 = new Class15(Static113.aClass163_11);
		for (@Pc(57) Class2_Sub35 local57 = (Class2_Sub35) local48.method314(); local57 != null; local57 = (Class2_Sub35) local48.method317()) {
			if (!local57.method5865()) {
				local57 = (Class2_Sub35) local48.method314();
				if (local57 == null) {
					return;
				}
			}
			if (local57.anInt5541 == 3) {
				@Pc(81) int local81 = (int) local57.aLong227;
				if (local8 == local81 >>> 16) {
					method4400(local57, true, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!gg;Z)Z")
	public static boolean method4402(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static58.aClass64Array1 == Static440.aClass64Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method4918();
		if (arg0.aShort85 < 0 || arg0.aShort86 < 0 || arg0.aShort87 >= Static42.anInt4340 || arg0.aShort88 >= Static386.anInt6463) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort85; local34 <= arg0.aShort87; local34++) {
			for (local38 = arg0.aShort86; local38 <= arg0.aShort88; local38++) {
				@Pc(45) Class106 local45 = Static292.method4206(arg0.aByte89, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort85) {
						local49++;
					}
					if (local34 < arg0.aShort87) {
						local49 += 4;
					}
					if (local38 > arg0.aShort86) {
						local49 += 8;
					}
					if (local38 < arg0.aShort88) {
						local49 += 2;
					}
					@Pc(74) Class4 local74 = Static145.method2417(local49, arg0);
					@Pc(77) Class4 local77 = local45.aClass4_3;
					if (local77 == null) {
						local45.aClass4_3 = local74;
					} else {
						while (local77.aClass4_1 != null) {
							local77 = local77.aClass4_1;
						}
						local77.aClass4_1 = local74;
					}
					local45.aByte42 = (byte) (local45.aByte42 | local49);
					if (local6 && (Static225.anIntArrayArray41[local34][local38] & 0xFF000000) != 0) {
						local8 = Static225.anIntArrayArray41[local34][local38];
						local10 = Static74.aByteArrayArray12[local34][local38];
						local12 = Static360.aByteArrayArray56[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort85; local38 <= arg0.aShort87; local38++) {
				for (@Pc(150) int local150 = arg0.aShort86; local150 <= arg0.aShort88; local150++) {
					if ((Static225.anIntArrayArray41[local38][local150] & 0xFF000000) == 0) {
						Static225.anIntArrayArray41[local38][local150] = local8;
						Static74.aByteArrayArray12[local38][local150] = local10;
						Static360.aByteArrayArray56[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static96.aClass3_Sub2Array2[Static177.anInt3468++] = arg0;
		}
		return true;
	}
}
