import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "[J")
	public static final long[] aLongArray13 = new long[32];

	@OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
	public static int anInt6482 = 0;

	@OriginalMember(owner = "client!nq", name = "y", descriptor = "[I")
	public static final int[] anIntArray361 = new int[] { 25000, 2000 };

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Z")
	public static boolean method5225() {
		return Static530.anInt9251 == 0 ? Static548.aClass3_Sub16_Sub3_4.method6106() : true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)Lclient!uda;")
	public static Class3_Sub7_Sub18 method5226(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub7_Sub18 local12 = (Class3_Sub7_Sub18) Static456.aClass321_2.method7220((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static468.aClass284_131.method6331(arg0, 0);
		if (local22 == null || local22.length <= 1) {
			return null;
		}
		try {
			local12 = Static556.method7414(local22);
		} catch (@Pc(40) Exception local40) {
			throw new RuntimeException(local40.getMessage() + " S: " + arg0);
		}
		Static456.aClass321_2.method7223((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)V")
	public static void method5228(@OriginalArg(1) int arg0) {
		if (Static391.anInt6956 == arg0) {
			return;
		}
		Static345.anInt6228 = Static535.anInt9341 = Static481.anIntArray496[arg0];
		Static66.method1639();
		Static212.anIntArrayArray58 = new int[Static345.anInt6228][Static535.anInt9341];
		Static348.anIntArrayArray32 = new int[Static345.anInt6228][Static535.anInt9341];
		Static110.anIntArrayArrayArray1 = new int[4][Static345.anInt6228 >> 3][Static535.anInt9341 >> 3];
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			Static187.aClass220Array1[local44] = Static549.method7511(Static535.anInt9341, Static345.anInt6228);
		}
		Static435.aByteArrayArrayArray11 = new byte[4][Static345.anInt6228][Static535.anInt9341];
		Static556.method7417(Static535.anInt9341, Static345.anInt6228);
		Static514.method6932(Static535.anInt9341 >> 3, Static345.anInt6228 >> 3, Static319.aClass31_11);
		Static391.anInt6956 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V")
	public static void method5229(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub7_Sub19 local13 = Static73.method5992(9, arg0);
		local13.method7364();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!r;Lclient!ob;II)V")
	public static void method5230(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2) {
		@Pc(21) int local21;
		if (Static25.anIntArray16 != null && arg1.aByte89 >= arg2) {
			for (local21 = 0; local21 < Static25.anIntArray16.length; local21++) {
				if (Static25.anIntArray16[local21] != -1000000 && (arg1.anIntArray366[0] <= Static25.anIntArray16[local21] || arg1.anIntArray366[1] <= Static25.anIntArray16[local21] || Static25.anIntArray16[local21] >= arg1.anIntArray366[2] || Static25.anIntArray16[local21] >= arg1.anIntArray366[3]) && (Static240.anIntArray225[local21] >= arg1.anIntArray368[0] || Static240.anIntArray225[local21] >= arg1.anIntArray368[1] || arg1.anIntArray368[2] <= Static240.anIntArray225[local21] || Static240.anIntArray225[local21] >= arg1.anIntArray368[3]) && (Static285.anIntArray254[local21] <= arg1.anIntArray368[0] || arg1.anIntArray368[1] >= Static285.anIntArray254[local21] || arg1.anIntArray368[2] >= Static285.anIntArray254[local21] || Static285.anIntArray254[local21] <= arg1.anIntArray368[3]) && (arg1.anIntArray367[0] <= Static504.anIntArray519[local21] || arg1.anIntArray367[1] <= Static504.anIntArray519[local21] || Static504.anIntArray519[local21] >= arg1.anIntArray367[2] || Static504.anIntArray519[local21] >= arg1.anIntArray367[3]) && (arg1.anIntArray367[0] >= Static446.anIntArray470[local21] || arg1.anIntArray367[1] >= Static446.anIntArray470[local21] || Static446.anIntArray470[local21] <= arg1.anIntArray367[2] || Static446.anIntArray470[local21] <= arg1.anIntArray367[3])) {
					return;
				}
			}
		}
		@Pc(278) int local278;
		@Pc(298) int local298;
		@Pc(316) boolean local316;
		@Pc(348) float local348;
		if (arg1.aByte90 == 1) {
			local21 = Static219.anInt4585 + arg1.aShort85 - Static261.anInt5023;
			if (local21 >= 0 && local21 <= Static219.anInt4585 + Static219.anInt4585) {
				local278 = arg1.aShort83 + Static219.anInt4585 - Static216.anInt4499;
				if (local278 < 0) {
					local278 = 0;
				} else if (Static219.anInt4585 + Static219.anInt4585 < local278) {
					return;
				}
				local298 = arg1.aShort86 + Static219.anInt4585 - Static216.anInt4499;
				if (Static219.anInt4585 + Static219.anInt4585 < local298) {
					local298 = Static219.anInt4585 + Static219.anInt4585;
				} else if (local298 < 0) {
					return;
				}
				local316 = false;
				while (local298 >= local278) {
					if (Static209.aBooleanArrayArray11[local21][local278++]) {
						local316 = true;
						break;
					}
				}
				if (local316) {
					local348 = Static459.anInt8015 - arg1.anIntArray368[0];
					if (local348 < 0.0F) {
						local348 *= -1.0F;
					}
					if (!local348 < (float) Static440.anInt7810 && (Static328.method4870(arg1, 0) && (Static328.method4870(arg1, 1) && (Static328.method4870(arg1, 2) && Static328.method4870(arg1, 3))))) {
						Static122.aClass236Array3[Static473.anInt8222++] = arg1;
					}
				}
			}
		} else if (arg1.aByte90 == 2) {
			local21 = arg1.aShort83 + Static219.anInt4585 - Static216.anInt4499;
			if (local21 >= 0 && local21 <= Static219.anInt4585 + Static219.anInt4585) {
				local278 = Static219.anInt4585 + arg1.aShort85 - Static261.anInt5023;
				if (local278 < 0) {
					local278 = 0;
				} else if (local278 > Static219.anInt4585 + Static219.anInt4585) {
					return;
				}
				local298 = arg1.aShort84 + Static219.anInt4585 - Static261.anInt5023;
				if (local298 > Static219.anInt4585 + Static219.anInt4585) {
					local298 = Static219.anInt4585 + Static219.anInt4585;
				} else if (local298 < 0) {
					return;
				}
				local316 = false;
				while (local278 <= local298) {
					if (Static209.aBooleanArrayArray11[local278++][local21]) {
						local316 = true;
						break;
					}
				}
				if (local316) {
					local348 = Static466.anInt8096 - arg1.anIntArray367[0];
					if (local348 < 0.0F) {
						local348 *= -1.0F;
					}
					if (!((float) Static440.anInt7810 > local348) && (Static328.method4870(arg1, 0) && (Static328.method4870(arg1, 1) && (Static328.method4870(arg1, 2) && Static328.method4870(arg1, 3))))) {
						Static122.aClass236Array3[Static473.anInt8222++] = arg1;
					}
				}
			}
		} else if (arg1.aByte90 == 16 || arg1.aByte90 == 8) {
			local21 = Static219.anInt4585 + arg1.aShort85 - Static261.anInt5023;
			if (local21 >= 0 && local21 <= Static219.anInt4585 + Static219.anInt4585) {
				local278 = arg1.aShort83 + Static219.anInt4585 - Static216.anInt4499;
				if (local278 >= 0 && Static219.anInt4585 + Static219.anInt4585 >= local278 && Static209.aBooleanArrayArray11[local21][local278]) {
					@Pc(601) float local601 = (float) (Static459.anInt8015 - arg1.anIntArray368[0]);
					if (local601 < 0.0F) {
						local601 *= -1.0F;
					}
					@Pc(618) float local618 = (float) (Static466.anInt8096 - arg1.anIntArray367[0]);
					if (local618 < 0.0F) {
						local618 *= -1.0F;
					}
					if ((!(local601 < (float) Static440.anInt7810) || !(local618 < (float) Static440.anInt7810)) && (Static328.method4870(arg1, 0) && (Static328.method4870(arg1, 1) && (Static328.method4870(arg1, 2) && Static328.method4870(arg1, 3))))) {
						Static122.aClass236Array3[Static473.anInt8222++] = arg1;
					}
				}
			}
		} else if (arg1.aByte90 == 4) {
			@Pc(683) float local683 = (float) (arg1.anIntArray366[0] - Static422.anInt7522);
			if (!(local683 <= (float) Static541.anInt9451)) {
				local278 = Static219.anInt4585 + arg1.aShort83 - Static216.anInt4499;
				if (local278 < 0) {
					local278 = 0;
				} else if (Static219.anInt4585 + Static219.anInt4585 < local278) {
					return;
				}
				local298 = arg1.aShort86 + Static219.anInt4585 - Static216.anInt4499;
				if (local298 > Static219.anInt4585 + Static219.anInt4585) {
					local298 = Static219.anInt4585 + Static219.anInt4585;
				} else if (local298 < 0) {
					return;
				}
				@Pc(738) int local738 = arg1.aShort85 + Static219.anInt4585 - Static261.anInt5023;
				if (local738 < 0) {
					local738 = 0;
				} else if (Static219.anInt4585 + Static219.anInt4585 < local738) {
					return;
				}
				@Pc(765) int local765 = arg1.aShort84 + Static219.anInt4585 - Static261.anInt5023;
				if (local765 > Static219.anInt4585 + Static219.anInt4585) {
					local765 = Static219.anInt4585 + Static219.anInt4585;
				} else if (local765 < 0) {
					return;
				}
				@Pc(785) boolean local785 = false;
				label283: for (@Pc(787) int local787 = local738; local787 <= local765; local787++) {
					for (@Pc(791) int local791 = local278; local791 <= local298; local791++) {
						if (Static209.aBooleanArrayArray11[local787][local791]) {
							local785 = true;
							break label283;
						}
					}
				}
				if (local785 && (Static328.method4870(arg1, 0) && (Static328.method4870(arg1, 1) && (Static328.method4870(arg1, 2) && Static328.method4870(arg1, 3))))) {
					Static122.aClass236Array3[Static473.anInt8222++] = arg1;
				}
			}
		}
	}
}
