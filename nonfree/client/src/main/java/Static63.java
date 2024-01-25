import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dr", name = "M", descriptor = "I")
	public static int anInt1492;

	@OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
	public static int anInt1486 = 0;

	@OriginalMember(owner = "client!dr", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString87 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!dr", name = "db", descriptor = "[Lclient!dh;")
	public static Class47_Sub1[] aClass47_Sub1Array1 = new Class47_Sub1[0];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III[B)I")
	public static int method1317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(9) int local9 = -1;
		for (@Pc(11) int local11 = arg0; local11 < arg1; local11++) {
			local9 = local9 >>> 8 ^ Class5_Sub38.anIntArray419[(local9 ^ arg2[local11]) & 0xFF];
		}
		return ~local9;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(Z)Z")
	public static boolean method1320(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static131.anInt2706; local1 < Static248.anInt4820; local1++) {
			@Pc(6) Class51[][] local6 = Static138.aClass51ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static98.anInt2185; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static210.anInt5625 + local9;
				@Pc(18) int local18 = Static210.anInt5625 - local9;
				if (local14 >= Static266.anInt5098 || local18 < Static271.anInt5206) {
					for (@Pc(27) int local27 = -Static98.anInt2185; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static103.anInt2249 + local27;
						@Pc(36) int local36 = Static103.anInt2249 - local27;
						@Pc(48) Class51 local48;
						if (local14 >= Static266.anInt5098) {
							if (local32 >= Static233.anInt4557) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean92) {
									Static176.aBoolean128 = arg0;
									Static134.aClass28_1.method5715(local48);
									Static134.aClass28_1.method5716();
								}
							}
							if (local36 < Static166.anInt3360) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean92) {
									Static176.aBoolean128 = arg0;
									Static134.aClass28_1.method5715(local48);
									Static134.aClass28_1.method5716();
								}
							}
						}
						if (local18 < Static271.anInt5206) {
							if (local32 >= Static233.anInt4557) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean92) {
									Static176.aBoolean128 = arg0;
									Static134.aClass28_1.method5715(local48);
									Static134.aClass28_1.method5716();
								}
							}
							if (local36 < Static166.anInt3360) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean92) {
									Static176.aBoolean128 = arg0;
									Static134.aClass28_1.method5715(local48);
									Static134.aClass28_1.method5716();
								}
							}
						}
						if (Static319.anInt6052 == 0) {
							if (Static65.aBoolean130) {
								Static134.aClass28_1.method5719(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
