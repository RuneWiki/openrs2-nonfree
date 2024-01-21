import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "[I")
	public static int[] anIntArray51;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!ae;")
	public static Class1_Sub2_Sub1_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "[S")
	public static short[] aShortArray1;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "[I")
	public static int[] anIntArray50 = new int[256];

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_178 = Static161.method2971("null");

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "[I")
	public static int[] anIntArray52 = new int[1000];

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!gb;Z)V")
	public static void method458(@OriginalArg(0) Class24 arg0) {
		Static113.aClass24_1 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([IIIIIII)V")
	public static void method459(@OriginalArg(0) int[] arg0) {
		Static103.anInt2867 = 25;
		Static150.aBooleanArrayArrayArrayArray1 = new boolean[8][32][Static103.anInt2867 + Static103.anInt2867 + 1][Static103.anInt2867 + Static103.anInt2867 + 1];
		Static108.anInt2952 = 0;
		Static34.anInt1158 = 0;
		Static25.anInt874 = 512;
		Static97.anInt4165 = 334;
		Static125.anInt3240 = 256;
		Static157.anInt3720 = 167;
		@Pc(45) boolean[][][][] local45 = new boolean[9][32][Static103.anInt2867 + Static103.anInt2867 + 3][Static103.anInt2867 + Static103.anInt2867 + 3];
		@Pc(50) int local50;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(93) int local93;
		@Pc(97) int local97;
		for (@Pc(47) int local47 = 128; local47 <= 384; local47 += 32) {
			for (local50 = 0; local50 < 2048; local50 += 64) {
				Static1.anInt64 = Class1_Sub2_Sub1_Sub2.anIntArray41[local47];
				Static179.anInt4051 = Class1_Sub2_Sub1_Sub2.anIntArray38[local47];
				Static35.anInt1194 = Class1_Sub2_Sub1_Sub2.anIntArray41[local50];
				Static125.anInt3233 = Class1_Sub2_Sub1_Sub2.anIntArray38[local50];
				local73 = (local47 - 128) / 32;
				local77 = local50 / 64;
				for (local82 = -(Static103.anInt2867 + 1); local82 <= Static103.anInt2867 + 1; local82++) {
					for (@Pc(88) int local88 = -(Static103.anInt2867 + 1); local88 <= Static103.anInt2867 + 1; local88++) {
						local93 = local82 * 128;
						local97 = local88 * 128;
						@Pc(99) boolean local99 = false;
						for (@Pc(102) int local102 = -500; local102 <= 800; local102 += 128) {
							if (Static14.method535(local93, arg0[local73] + local102, local97)) {
								local99 = true;
								break;
							}
						}
						local45[local73][local77][local82 + Static103.anInt2867 + 1][local88 + Static103.anInt2867 + 1] = local99;
					}
				}
			}
		}
		for (local50 = 0; local50 < 8; local50++) {
			for (local73 = 0; local73 < 32; local73++) {
				for (local77 = -Static103.anInt2867; local77 < Static103.anInt2867; local77++) {
					for (local82 = -Static103.anInt2867; local82 < Static103.anInt2867; local82++) {
						@Pc(174) boolean local174 = false;
						label76: for (local93 = -1; local93 <= 1; local93++) {
							for (local97 = -1; local97 <= 1; local97++) {
								if (local45[local50][local73][local77 + local93 + Static103.anInt2867 + 1][local82 + local97 + Static103.anInt2867 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50][(local73 + 1) % 31][local77 + local93 + Static103.anInt2867 + 1][local82 + local97 + Static103.anInt2867 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][local73][local77 + local93 + Static103.anInt2867 + 1][local82 + local97 + Static103.anInt2867 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][(local73 + 1) % 31][local77 + local93 + Static103.anInt2867 + 1][local82 + local97 + Static103.anInt2867 + 1]) {
									local174 = true;
									break label76;
								}
							}
						}
						Static150.aBooleanArrayArrayArrayArray1[local50][local73][local77 + Static103.anInt2867][local82 + Static103.anInt2867] = local174;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public static void method460() {
		aClass13_178 = null;
		anIntArray52 = null;
		aShortArray1 = null;
		anIntArray51 = null;
		anIntArray50 = null;
		aClass1_Sub2_Sub1_Sub1_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Lclient!ca;")
	public static Class7 method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass7_1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!dd;ILclient!dd;SIJ)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) long arg5) {
		if (Static46.aBoolean106 || Static53.anInt1722 >= 500) {
			return;
		}
		Static58.aClass13Array15[Static53.anInt1722] = arg2;
		Static164.aClass13Array27[Static53.anInt1722] = arg1;
		Static147.aShortArray41[Static53.anInt1722] = arg3;
		Static130.aLongArray6[Static53.anInt1722] = arg5;
		Static29.anIntArray115[Static53.anInt1722] = arg4;
		Static65.anIntArray199[Static53.anInt1722] = arg0;
		Static53.anInt1722++;
	}
}
