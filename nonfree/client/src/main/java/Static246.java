import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!pr", name = "W", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_144 = new Class34("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!pr", name = "X", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_145 = new Class34("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!pr", name = "Y", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)V")
	public static void method4421() {
		if (Static62.anInt1771 < 0) {
			Static62.anInt1771 = 0;
			Static231.anInt4758 = -1;
			Static68.anInt1821 = -1;
		}
		if (Static62.anInt1771 > Static79.anInt4158) {
			Static62.anInt1771 = Static79.anInt4158;
			Static231.anInt4758 = -1;
			Static68.anInt1821 = -1;
		}
		if (Static169.anInt3636 < 0) {
			Static231.anInt4758 = -1;
			Static68.anInt1821 = -1;
			Static169.anInt3636 = 0;
		}
		if (Static169.anInt3636 > Static79.anInt4165) {
			Static231.anInt4758 = -1;
			Static68.anInt1821 = -1;
			Static169.anInt3636 = Static79.anInt4165;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!uo;Lclient!pc;III)V")
	public static void method4422(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class194 local12;
		if (arg3 < Static242.anInt6744) {
			local12 = Static77.aClass194ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass17_Sub5_1 != null && local12.aClass17_Sub5_1.method4778()) {
				arg1.method4786(arg0, 0, 128, 0, true, local12.aClass17_Sub5_1);
			}
		}
		if (arg4 < Static242.anInt6744) {
			local12 = Static77.aClass194ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass17_Sub5_1 != null && local12.aClass17_Sub5_1.method4778()) {
				arg1.method4786(arg0, 128, 0, 0, true, local12.aClass17_Sub5_1);
			}
		}
		if (arg3 < Static242.anInt6744 && arg4 < Static315.anInt6124) {
			local12 = Static77.aClass194ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass17_Sub5_1 != null && local12.aClass17_Sub5_1.method4778()) {
				arg1.method4786(arg0, 128, 128, 0, true, local12.aClass17_Sub5_1);
			}
		}
		if (arg3 < Static242.anInt6744 && arg4 > 0) {
			local12 = Static77.aClass194ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass17_Sub5_1 != null && local12.aClass17_Sub5_1.method4778()) {
				arg1.method4786(arg0, -128, 128, 0, true, local12.aClass17_Sub5_1);
			}
		}
	}
}
