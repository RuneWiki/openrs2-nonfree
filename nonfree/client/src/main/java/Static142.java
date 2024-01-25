import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "Lclient!dn;")
	public static Class56 aClass56_35;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_97 = new Class175("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
	public static int anInt3209 = 0;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_26 = new Class5(32);

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
	public static int anInt3212 = 0;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method2551(@OriginalArg(1) Class75 arg0) {
		if (Static169.anInt3551 < 2 && !Static59.aBoolean111 || Static435.aClass68_14 != null) {
			return;
		}
		@Pc(42) String local42;
		if (Static59.aBoolean111 && Static169.anInt3551 < 2) {
			local42 = Static276.aString52 + Static4.aClass175_34.method4201(Static216.anInt4257) + Static128.aString25 + " ->";
		} else if (Static93.aBoolean163 && Static19.aClass16_1.method580(81) && Static169.anInt3551 > 2) {
			local42 = Static262.method3968((Class3_Sub38) Static374.aClass229_41.aClass3_233.aClass3_262.aClass3_262);
		} else {
			@Pc(49) Class3_Sub38 local49 = (Class3_Sub38) Static374.aClass229_41.aClass3_233.aClass3_262;
			local42 = Static262.method3968(local49);
			@Pc(55) int[] local55 = null;
			if (Static54.method1102(local49.anInt6532)) {
				local55 = Static89.aClass157_1.method3832((int) local49.aLong192).anIntArray434;
			} else if (local49.anInt6528 != -1) {
				local55 = Static89.aClass157_1.method3832(local49.anInt6528).anIntArray434;
			} else if (Static116.method5249(local49.anInt6532)) {
				@Pc(131) Class1_Sub3_Sub3_Sub2 local131 = Static451.aClass1_Sub3_Sub3_Sub2Array1[(int) local49.aLong192];
				if (local131 != null) {
					@Pc(136) Class47 local136 = local131.aClass47_1;
					if (local136.anIntArray134 != null) {
						local136 = local136.method1296(Static369.aClass11_1);
					}
					if (local136 != null) {
						local55 = local136.anIntArray137;
					}
				}
			} else if (Static34.method820(local49.anInt6532)) {
				@Pc(99) Class128 local99;
				if (local49.anInt6532 == 1004) {
					local99 = Static55.aClass25_1.method855((int) local49.aLong192);
				} else {
					local99 = Static55.aClass25_1.method855((int) (local49.aLong192 >>> 32 & 0x7FFFFFFFL));
				}
				if (local99.anIntArray307 != null) {
					local99 = local99.method3307(Static369.aClass11_1);
				}
				if (local99 != null) {
					local55 = local99.anIntArray303;
				}
			}
			if (local55 != null) {
				local42 = local42 + Static39.method921(local55);
			}
		}
		if (Static169.anInt3551 > 2) {
			local42 = local42 + "<col=ffffff> / " + (Static169.anInt3551 - 2) + Static367.aClass175_211.method4201(Static216.anInt4257);
		}
		if (Static252.aClass68_7 != null) {
			@Pc(216) Class65 local216 = Static252.aClass68_7.method1730(arg0);
			if (local216 == null) {
				local216 = Static399.aClass65_7;
			}
			local216.method5808(Static252.aClass68_7.anInt2143, Static410.anInt7098, Static252.aClass68_7.lb, Static252.aClass68_7.anInt2179, Static252.aClass68_7.anInt2178, Static293.anInt3445, Static218.aRandom1, Static252.aClass68_7.anInt2174, Static252.aClass68_7.anInt2138, Static422.anInt7278, Static270.aClass22Array21, Static318.anIntArray243, local42, Static184.anIntArray285);
			Static63.method5248(Static318.anIntArray243[3], Static318.anIntArray243[1], Static318.anIntArray243[0], Static318.anIntArray243[2]);
		} else if (Static364.aClass68_11 != null && Static436.aClass89_3 == Static114.aClass89_2) {
			@Pc(281) int local281 = Static399.aClass65_7.method5803(Static50.anInt1231 + 4, Static270.aClass22Array21, Static214.anInt4209 + 16, local42, Static184.anIntArray285, Static422.anInt7278, Static218.aRandom1);
			Static63.method5248(16, Static214.anInt4209, Static50.anInt1231 + 4, local281 + Static222.aClass179_10.method4385(local42));
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)I")
	public static int method2552(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)Lclient!it;")
	public static Class115 method2553(@OriginalArg(1) int arg0) {
		@Pc(10) Class115 local10 = (Class115) Static409.aClass5_55.method104((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static221.aClass56_54.method1384(1, arg0);
		local10 = new Class115();
		local10.anInt3699 = arg0;
		if (local25 != null) {
			local10.method3064(new Class3_Sub2(local25));
		}
		local10.method3062();
		if (local10.anInt3689 == 2 && Static157.aClass127_17.method3246((long) arg0) == null) {
			Static157.aClass127_17.method3257((long) arg0, new Class3_Sub25(Static428.anInt7307));
			Static286.aClass115Array9[Static428.anInt7307++] = local10;
		}
		Static409.aClass5_55.method114((long) arg0, local10);
		return local10;
	}
}
