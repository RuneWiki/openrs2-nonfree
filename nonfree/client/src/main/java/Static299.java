import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString42;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_85 = new Class186(34, 0);

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
	public static int anInt4962 = 0;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)Z")
	public static boolean method4385(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static71.anInt1486; local1 < Static268.anInt4600; local1++) {
			@Pc(6) Class189[][] local6 = Static30.aClass189ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static99.anInt1813; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static165.anInt2942 + local9;
				@Pc(18) int local18 = Static165.anInt2942 - local9;
				if (local14 >= Static167.anInt2998 || local18 < Static117.anInt2049) {
					for (@Pc(27) int local27 = -Static99.anInt1813; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static97.anInt1799 + local27;
						@Pc(36) int local36 = Static97.anInt1799 - local27;
						@Pc(48) Class189 local48;
						if (local14 >= Static167.anInt2998) {
							if (local32 >= Static57.anInt1201) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean342) {
									Static446.aBoolean494 = arg0;
									Static19.aClass10_1.method5383(local48);
									Static19.aClass10_1.method5381();
								}
							}
							if (local36 < Static329.anInt5591) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean342) {
									Static446.aBoolean494 = arg0;
									Static19.aClass10_1.method5383(local48);
									Static19.aClass10_1.method5381();
								}
							}
						}
						if (local18 < Static117.anInt2049) {
							if (local32 >= Static57.anInt1201) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean342) {
									Static446.aBoolean494 = arg0;
									Static19.aClass10_1.method5383(local48);
									Static19.aClass10_1.method5381();
								}
							}
							if (local36 < Static329.anInt5591) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean342) {
									Static446.aBoolean494 = arg0;
									Static19.aClass10_1.method5383(local48);
									Static19.aClass10_1.method5381();
								}
							}
						}
						if (Static96.anInt1790 == 0) {
							if (Static439.aBoolean490) {
								Static19.aClass10_1.method5379(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)[Lclient!vh;")
	public static Class253[] method4386() {
		return new Class253[] { Static411.aClass253_4, Static343.aClass253_3, Static131.aClass253_1 };
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Lclient!tq;")
	public static Class239 method4387(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static129.aClass239ArrayArray1[local13] == null || Static129.aClass239ArrayArray1[local13][local17] == null) {
			@Pc(31) boolean local31 = Static367.method5802(local13);
			if (!local31) {
				return null;
			}
		}
		return Static129.aClass239ArrayArray1[local13][local17];
	}
}
