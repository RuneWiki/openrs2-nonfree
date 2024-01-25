import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	public static int anInt1125;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!uc;")
	public static final Class328 aClass328_3 = new Class328(12, 7);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public static int anInt1126 = 0;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public static int anInt1132 = 0;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!c", name = "q", descriptor = "I")
	public static int anInt1133 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method1127() {
		try {
			if (Static171.anInt3648 == 1) {
				@Pc(12) int local12 = Static587.aClass6_Sub18_Sub2_3.method3319();
				if (local12 > 0 && Static587.aClass6_Sub18_Sub2_3.method3312()) {
					local12 -= Static213.anInt8692;
					if (local12 < 0) {
						local12 = 0;
					}
					Static587.aClass6_Sub18_Sub2_3.method3316(local12);
					return;
				}
				Static587.aClass6_Sub18_Sub2_3.method3293();
				Static587.aClass6_Sub18_Sub2_3.method3296();
				if (Static377.aClass251_90 == null) {
					Static171.anInt3648 = 0;
				} else {
					Static171.anInt3648 = 2;
				}
				Static546.aClass93_1 = null;
				Static335.aClass6_Sub24_2 = null;
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static587.aClass6_Sub18_Sub2_3.method3293();
			Static171.anInt3648 = 0;
			Static377.aClass251_90 = null;
			Static335.aClass6_Sub24_2 = null;
			Static546.aClass93_1 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z")
	public static boolean method1128(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static128.anInt2923; local1 < Static107.anInt2060; local1++) {
			@Pc(6) Class276[][] local6 = Static270.aClass276ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static156.anInt3342; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static213.anInt8691 + local9;
				@Pc(18) int local18 = Static213.anInt8691 - local9;
				if (local14 >= Static257.anInt5018 || local18 < Static68.anInt8339) {
					for (@Pc(27) int local27 = -Static156.anInt3342; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static117.anInt2704 + local27;
						@Pc(36) int local36 = Static117.anInt2704 - local27;
						@Pc(48) Class276 local48;
						if (local14 >= Static257.anInt5018) {
							if (local32 >= Static571.anInt9347) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean525) {
									Static300.aBoolean390 = arg0;
									Static476.aClass1_1.method7676(local48);
									Static476.aClass1_1.method7677();
								}
							}
							if (local36 < Static319.anInt5798) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean525) {
									Static300.aBoolean390 = arg0;
									Static476.aClass1_1.method7676(local48);
									Static476.aClass1_1.method7677();
								}
							}
						}
						if (local18 < Static68.anInt8339) {
							if (local32 >= Static571.anInt9347) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean525) {
									Static300.aBoolean390 = arg0;
									Static476.aClass1_1.method7676(local48);
									Static476.aClass1_1.method7677();
								}
							}
							if (local36 < Static319.anInt5798) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean525) {
									Static300.aBoolean390 = arg0;
									Static476.aClass1_1.method7676(local48);
									Static476.aClass1_1.method7677();
								}
							}
						}
						if (Static371.anInt6583 == 0) {
							if (Static129.aBoolean209) {
								Static476.aClass1_1.method7678(24);
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
