import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!lp", name = "R", descriptor = "I")
	public static int anInt5792;

	@OriginalMember(owner = "client!lp", name = "Q", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_87 = new Class67("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!lp", name = "U", descriptor = "I")
	public static int anInt5795 = -1;

	@OriginalMember(owner = "client!lp", name = "V", descriptor = "I")
	public static int anInt5796 = -1;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIILclient!oa;II)V")
	public static void method4839(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.ca(arg4, arg1, arg3 + arg4, arg0 + arg1);
		arg2.method7459(arg3, arg1, -16777216, arg0, arg4);
		if (Static133.anInt2744 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static55.anInt1982 / (float) Static55.anInt1972;
		@Pc(35) int local35 = arg3;
		@Pc(37) int local37 = arg0;
		if (local33 < 1.0F) {
			local37 = (int) ((float) arg3 * local33);
		} else {
			local35 = (int) ((float) arg0 / local33);
		}
		@Pc(64) int local64 = arg1 + (arg0 - local37) / 2;
		@Pc(73) int local73 = arg4 + (arg3 - local35) / 2;
		if (Static456.aClass119_31 == null || Static456.aClass119_31.QA() != arg3 || arg0 != Static456.aClass119_31.b()) {
			Static55.method1835(Static55.anInt1978, Static55.anInt1982 + Static55.anInt1974, Static55.anInt1972 + Static55.anInt1978, Static55.anInt1974, local73, local64, local73 + local35, local37 + local64);
			Static55.method1850(arg2);
			Static456.aClass119_31 = arg2.method7457(local73, local64, local35, local37, false);
		}
		Static456.aClass119_31.method6678(local73, local64);
		@Pc(124) int local124 = Static447.anInt8185 * local35 / Static55.anInt1972;
		@Pc(130) int local130 = Static123.anInt2605 * local37 / Static55.anInt1982;
		@Pc(139) int local139 = local73 + Static271.anInt5622 * local35 / Static55.anInt1972;
		@Pc(153) int local153 = local37 + local64 - local130 - Static298.anInt9334 * local37 / Static55.anInt1982;
		@Pc(155) int local155 = -1996554240;
		if (Static332.aClass44_4 == Static222.aClass44_2) {
			local155 = -1996488705;
		}
		arg2.C(local139, local153, local124, local130, local155, 1);
		arg2.method7484(local139, local153, local124, local130, local155, 0);
		if (Static307.anInt4841 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static106.anInt2360 <= 50) {
			local193 = Static106.anInt2360 * 5;
		} else {
			local193 = (100 - Static106.anInt2360) * 5;
		}
		for (@Pc(207) Class3_Sub31 local207 = (Class3_Sub31) Static55.aClass71_19.method2089(); local207 != null; local207 = (Class3_Sub31) Static55.aClass71_19.method2086()) {
			@Pc(215) Class179 local215 = Static55.aClass135_2.method3801(local207.anInt5809);
			if (Static47.method7754(local215)) {
				@Pc(244) int local244;
				@Pc(256) int local256;
				if (Static469.anInt8466 == local207.anInt5809) {
					local244 = local73 + local35 * local207.anInt5808 / Static55.anInt1972;
					local256 = local64 + local37 * (Static55.anInt1982 - local207.anInt5806) / Static55.anInt1982;
					arg2.method7459(4, local256 - 2, local193 << 24 | 0xFFFF00, 4, local244 - 2);
				} else if (Static213.anInt4694 != -1 && local215.anInt5728 == Static213.anInt4694) {
					local244 = local73 + local35 * local207.anInt5808 / Static55.anInt1972;
					local256 = (Static55.anInt1982 - local207.anInt5806) * local37 / Static55.anInt1982 + local64;
					arg2.method7459(4, local256 - 2, local193 << 24 | 0xFFFF00, 4, local244 - 2);
				}
			}
		}
	}
}
