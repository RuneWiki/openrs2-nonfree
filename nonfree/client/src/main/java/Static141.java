import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
	public static int anInt2910;

	@OriginalMember(owner = "client!fn", name = "R", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!fn", name = "V", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_42 = new Class40("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

	@OriginalMember(owner = "client!fn", name = "I", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_25 = new Class236(55, 4);

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(B)V")
	public static void method2630() {
		for (@Pc(10) Class5_Sub22 local10 = (Class5_Sub22) Static330.aClass99_53.method2526(); local10 != null; local10 = (Class5_Sub22) Static330.aClass99_53.method2519()) {
			if (local10.anInt3306 > 0) {
				local10.anInt3306--;
			}
			if (local10.anInt3306 != 0) {
				if (local10.anInt3293 > 0) {
					local10.anInt3293--;
				}
				if (local10.anInt3293 == 0 && local10.anInt3297 >= 1 && local10.anInt3296 >= 1 && Static460.anInt7894 - 2 >= local10.anInt3297 && local10.anInt3296 <= Static235.anInt4493 - 2 && (local10.anInt3295 < 0 || Static500.method6899(local10.anInt3295, local10.anInt3298))) {
					Static317.method5107(local10.anInt3298, local10.anInt3305, local10.anInt3301, local10.anInt3297, local10.anInt3296, local10.anInt3294, local10.anInt3295, -1);
					local10.anInt3293 = -1;
					if (local10.anInt3307 == local10.anInt3295 && local10.anInt3307 == -1) {
						local10.method7425();
					} else if (local10.anInt3295 == local10.anInt3307 && local10.anInt3305 == local10.anInt3299 && local10.anInt3304 == local10.anInt3298) {
						local10.method7425();
					}
				}
			} else if (local10.anInt3307 < 0 || Static500.method6899(local10.anInt3307, local10.anInt3304)) {
				Static317.method5107(local10.anInt3304, local10.anInt3299, local10.anInt3301, local10.anInt3297, local10.anInt3296, local10.anInt3294, local10.anInt3307, -1);
				local10.method7425();
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "(I)Ljava/lang/String;")
	public static String method2631() {
		return Static218.aBoolean250 || Static148.aClass5_Sub47_1 == null ? "" : Static148.aClass5_Sub47_1.aString76;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
