import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "Lclient!ln;")
	public static Class157 aClass157_2;

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "[Lclient!o;")
	public static Class137[] aClass137Array8;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_103 = new Class158("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_85 = new Class263(94, 11);

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "Lclient!pu;")
	public static final Class203 aClass203_32 = new Class203();

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "Lclient!dw;")
	public static final Class65 aClass65_5 = new Class65("", 12);

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "[I")
	public static final int[] anIntArray384 = new int[14];

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_86 = new Class263(90, 17);

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "[I")
	public static int[] anIntArray385 = new int[2];

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
	public static void method3065() {
		Static446.method6042(Static404.aClass68_11);
		Static275.anInt5313++;
		if (Static452.aBoolean519 && Static57.aBoolean98) {
			@Pc(26) int local26 = Static336.aClass87_1.method1919();
			@Pc(30) int local30 = Static336.aClass87_1.method1909();
			local30 -= Static200.anInt4108;
			local26 -= Static238.anInt4690;
			if (Static122.anInt2689 > local26) {
				local26 = Static122.anInt2689;
			}
			if (local30 < Static271.anInt5262) {
				local30 = Static271.anInt5262;
			}
			if (Static122.anInt2689 + Static326.aClass68_14.anInt2107 < local26 + Static404.aClass68_11.anInt2107) {
				local26 = Static122.anInt2689 + Static326.aClass68_14.anInt2107 - Static404.aClass68_11.anInt2107;
			}
			if (local30 + Static404.aClass68_11.anInt2149 > Static326.aClass68_14.anInt2149 + Static271.anInt5262) {
				local30 = Static326.aClass68_14.anInt2149 + Static271.anInt5262 - Static404.aClass68_11.anInt2149;
			}
			@Pc(91) int local91 = Static326.aClass68_14.anInt2124 + local26 - Static122.anInt2689;
			@Pc(99) int local99 = Static326.aClass68_14.anInt2125 + local30 - Static271.anInt5262;
			@Pc(150) Class1_Sub10 local150;
			if (Static336.aClass87_1.method1913()) {
				if (Static275.anInt5313 > Static404.aClass68_11.anInt2164) {
					@Pc(190) int local190 = local26 - Static249.anInt4847;
					@Pc(195) int local195 = local30 - Static361.anInt6653;
					if (local190 > Static404.aClass68_11.anInt2121 || local190 < -Static404.aClass68_11.anInt2121 || Static404.aClass68_11.anInt2121 < local195 || local195 < -Static404.aClass68_11.anInt2121) {
						Static256.aBoolean148 = true;
					}
				}
				if (Static404.aClass68_11.anObjectArray14 != null && Static256.aBoolean148) {
					local150 = new Class1_Sub10();
					local150.anInt1364 = local99;
					local150.anObjectArray2 = Static404.aClass68_11.anObjectArray14;
					local150.aClass68_3 = Static404.aClass68_11;
					local150.anInt1366 = local91;
					Static178.method3000(local150);
				}
			} else {
				if (Static256.aBoolean148) {
					Static192.method3103();
					if (Static404.aClass68_11.anObjectArray8 != null) {
						local150 = new Class1_Sub10();
						local150.aClass68_3 = Static404.aClass68_11;
						local150.aClass68_2 = Static315.aClass68_12;
						local150.anInt1364 = local99;
						local150.anObjectArray2 = Static404.aClass68_11.anObjectArray8;
						local150.anInt1366 = local91;
						Static178.method3000(local150);
					}
					if (Static315.aClass68_12 != null && Static55.method1063(Static404.aClass68_11) != null) {
						Static294.method4271(Static315.aClass68_12, Static404.aClass68_11);
					}
				} else if ((Static363.anInt6672 == 1 || Static331.method4676()) && Static126.anInt2794 > 2) {
					Static369.method5148(Static249.anInt4847 + Static238.anInt4690, Static361.anInt6653 + Static200.anInt4108);
				} else if (Static361.method5081()) {
					Static369.method5148(Static238.anInt4690 + Static249.anInt4847, Static361.anInt6653 + Static200.anInt4108);
				}
				Static404.aClass68_11 = null;
			}
		} else if (Static275.anInt5313 > 1) {
			Static404.aClass68_11 = null;
		}
	}
}
