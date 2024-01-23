import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!j", name = "L", descriptor = "Lclient!qd;")
	public static Class137 aClass137_4;

	@OriginalMember(owner = "client!j", name = "P", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "Lclient!an;")
	public static Class10 aClass10_27 = new Class10();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!cc;I)Ljava/lang/String;")
	public static String method2030(@OriginalArg(0) Class22 arg0) {
		if (Static40.method681(arg0).method2834() == 0) {
			return null;
		} else if (arg0.aString12 == null || arg0.aString12.trim().length() == 0) {
			return Static255.aBoolean311 ? "Hidden-use" : null;
		} else {
			return arg0.aString12;
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
	public static void method2031() {
		aClass10_27 = null;
		aShortArrayArray1 = null;
		aClass137_4 = null;
		aFont1 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
	public static void method2032() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static141.aClass4_Sub11ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static141.aClass4_Sub11ArrayArrayArray2.length; local3++) {
				for (local9 = 0; local9 < Static247.anInt4706; local9++) {
					for (local14 = 0; local14 < Static24.anInt439; local14++) {
						Static141.aClass4_Sub11ArrayArrayArray2[local3][local9][local14] = null;
					}
				}
			}
		}
		Static42.aClass4_Sub14ArrayArray1 = null;
		if (Static271.aClass4_Sub11ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static271.aClass4_Sub11ArrayArrayArray3.length; local3++) {
				for (local9 = 0; local9 < Static247.anInt4706; local9++) {
					for (local14 = 0; local14 < Static24.anInt439; local14++) {
						Static271.aClass4_Sub11ArrayArrayArray3[local3][local9][local14] = null;
					}
				}
			}
		}
		Static76.aClass4_Sub14ArrayArray2 = null;
		Static241.anInt4625 = 0;
		if (Static237.aClass145Array2 != null) {
			for (local3 = 0; local3 < Static241.anInt4625; local3++) {
				Static237.aClass145Array2[local3] = null;
			}
		}
		if (Static172.aClass173Array2 != null) {
			for (local3 = 0; local3 < Static94.anInt1947; local3++) {
				Static172.aClass173Array2[local3] = null;
			}
			Static94.anInt1947 = 0;
		}
		if (Static290.aClass173Array3 != null) {
			for (local3 = 0; local3 < Static290.aClass173Array3.length; local3++) {
				Static290.aClass173Array3[local3] = null;
			}
		}
	}
}
