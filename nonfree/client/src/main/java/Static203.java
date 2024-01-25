import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "Lclient!wk;")
	public static Class1_Sub2_Sub6_Sub2 aClass1_Sub2_Sub6_Sub2_1;

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
	public static int anInt3616;

	@OriginalMember(owner = "client!jv", name = "A", descriptor = "Lclient!l;")
	public static Interface7 anInterface7_5;

	@OriginalMember(owner = "client!jv", name = "C", descriptor = "I")
	public static int anInt3626;

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_30 = new Class268(64);

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "[I")
	public static final int[] anIntArray227 = new int[4096];

	@OriginalMember(owner = "client!jv", name = "G", descriptor = "I")
	public static int anInt3630 = 0;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZILclient!ba;ILclient!qa;IB)V")
	public static void method3112(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class167 arg4, @OriginalArg(5) int arg5) {
		if (arg0) {
			Static400.aClass2_17.method5829((Static310.anInt5307 - Static400.aClass2_17.d()) / 2, (Static166.anInt3014 - Static400.aClass2_17.ga()) / 2);
			Static322.aClass2_11.method5829((Static310.anInt5307 - Static322.aClass2_11.d()) / 2, 18);
		}
		@Pc(32) String local32 = "";
		if (Static145.aClass113_2 == Static154.aClass113_3) {
			local32 = Static437.aClass174_205.method4208(Static300.anInt5192);
		} else if (Static154.aClass113_3 == Static427.aClass113_4) {
			local32 = Static168.aClass174_96.method4208(Static300.anInt5192);
		}
		arg2.method5169(local32, arg5, Static166.anInt3014 / 2 - 26, -1, Static310.anInt5307 / 2);
		@Pc(70) int local70 = Static166.anInt3014 / 2 - 18;
		arg4.method5996(Static310.anInt5307 / 2 - 152, local70, 304, 34, arg3, 0);
		arg4.method5996(Static310.anInt5307 / 2 - 151, local70 + 1, 302, 32, 0, 0);
		arg4.M(Static310.anInt5307 / 2 - 150, local70 + 2, Static56.anInt1098 * 3, 30, arg1, 0);
		arg4.M(Static56.anInt1098 * 3 + Static310.anInt5307 / 2 - 150, local70 - -2, 300 - Static56.anInt1098 * 3, 30, 0, 0);
		arg2.method5169(Static291.aString55, arg5, Static166.anInt3014 / 2 + 4, -1, Static310.anInt5307 / 2);
	}
}
