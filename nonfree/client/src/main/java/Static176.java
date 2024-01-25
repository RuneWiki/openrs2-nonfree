import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Lclient!os;")
	public static final Class182 aClass182_124 = new Class182("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)Z")
	public static boolean method2938(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static222.anInt4181; local1 < Static285.anInt5004; local1++) {
			@Pc(6) Class11[][] local6 = Static309.aClass11ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static451.anInt7524; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static18.anInt316 + local9;
				@Pc(18) int local18 = Static18.anInt316 - local9;
				if (local14 >= Static12.anInt226 || local18 < Static430.anInt7228) {
					for (@Pc(27) int local27 = -Static451.anInt7524; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static265.anInt4683 + local27;
						@Pc(36) int local36 = Static265.anInt4683 - local27;
						@Pc(48) Class11 local48;
						if (local14 >= Static12.anInt226) {
							if (local32 >= Static137.anInt2871) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean9) {
									Static299.aBoolean313 = arg0;
									Static39.aClass8_1.method3746(local48);
									Static39.aClass8_1.method3750();
								}
							}
							if (local36 < Static256.anInt4594) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean9) {
									Static299.aBoolean313 = arg0;
									Static39.aClass8_1.method3746(local48);
									Static39.aClass8_1.method3750();
								}
							}
						}
						if (local18 < Static430.anInt7228) {
							if (local32 >= Static137.anInt2871) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean9) {
									Static299.aBoolean313 = arg0;
									Static39.aClass8_1.method3746(local48);
									Static39.aClass8_1.method3750();
								}
							}
							if (local36 < Static256.anInt4594) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean9) {
									Static299.aBoolean313 = arg0;
									Static39.aClass8_1.method3746(local48);
									Static39.aClass8_1.method3750();
								}
							}
						}
						if (Static168.anInt3351 == 0) {
							if (Static97.aBoolean73) {
								Static39.aClass8_1.method3754(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)V")
	public static void method2939(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static416.aBooleanArray22[arg0]) {
			Static348.aClass187_107.method4297(arg0);
			Static166.aClass89ArrayArray2[arg0] = null;
			Static61.aClass89ArrayArray1[arg0] = null;
			Static416.aBooleanArray22[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BIIIIIII)V")
	public static void method2941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = Static199.aShort63 + local7 * (Static197.aShort60 - Static199.aShort63) / 100;
		@Pc(39) int local39 = arg5 * local33 >> 8;
		@Pc(45) int local45 = 16384 - arg6 & 0x3FFF;
		@Pc(52) int local52 = 16384 - arg2 & 0x3FFF;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = local39;
		if (local45 != 0) {
			local56 = Class250.anIntArray675[local45] * -local39 >> 15;
			local58 = local39 * Class250.anIntArray674[local45] >> 15;
		}
		if (local52 != 0) {
			local54 = Class250.anIntArray675[local52] * local58 >> 15;
			local58 = Class250.anIntArray674[local52] * local58 >> 15;
		}
		Static50.anInt906 = arg4 - local58;
		Static362.anInt6155 = arg2;
		Static242.anInt5735 = 0;
		Static80.anInt1679 = arg3 - local54;
		Static8.anInt121 = arg0 - local56;
		Static127.anInt2604 = arg6;
	}
}
