import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "[J")
	public static final long[] aLongArray21 = new long[10];

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "Z")
	public static boolean aBoolean800 = false;

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "Lclient!bja;")
	public static final Class27 aClass27_35 = new Class27(0, 2, 2, 1);

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "[Lclient!ne;")
	public static final Class4_Sub5_Sub15[] aClass4_Sub5_Sub15Array6 = new Class4_Sub5_Sub15[14];

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!ha;IIIII)V")
	public static void method8937(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if ((Static191.aClass17_31 == null || Static376.aClass17_50 == null || Static16.aClass17_2 == null) && Static368.aClass34_80.method1235(Static355.anInt5411) && Static368.aClass34_80.method1235(Static404.anInt5859) && Static368.aClass34_80.method1235(Static3.anInt3612)) {
			@Pc(31) Class51 local31 = Static682.method1662(Static368.aClass34_80, Static404.anInt5859, 0);
			Static376.aClass17_50 = arg1.method8147(local31, true);
			local31.method1656();
			Static563.aClass17_53 = arg1.method8147(local31, true);
			Static191.aClass17_31 = arg1.method8147(Static682.method1662(Static368.aClass34_80, Static355.anInt5411, 0), true);
			@Pc(56) Class51 local56 = Static682.method1662(Static368.aClass34_80, Static3.anInt3612, 0);
			Static16.aClass17_2 = arg1.method8147(local56, true);
			local56.method1656();
			Static312.aClass17_46 = arg1.method8147(local56, true);
		}
		if (Static191.aClass17_31 == null || Static376.aClass17_50 == null || Static16.aClass17_2 == null) {
			return;
		}
		@Pc(89) int local89 = (arg2 - Static16.aClass17_2.method5268() * 2) / Static191.aClass17_31.method5268();
		for (@Pc(91) int local91 = 0; local91 < local89; local91++) {
			Static191.aClass17_31.method5246(Static16.aClass17_2.method5268() + arg0 + Static191.aClass17_31.method5268() * local91, arg4 - (-arg3 - -Static191.aClass17_31.method5253()));
		}
		@Pc(132) int local132 = (arg3 - Static16.aClass17_2.method5253() - 20) / Static376.aClass17_50.method5253();
		for (@Pc(134) int local134 = 0; local134 < local132; local134++) {
			Static376.aClass17_50.method5246(arg0, arg4 + local134 * Static376.aClass17_50.method5253() + 20);
			Static563.aClass17_53.method5246(arg0 + arg2 - Static563.aClass17_53.method5268(), local134 * Static376.aClass17_50.method5253() + (arg4 - -20));
		}
		Static16.aClass17_2.method5246(arg0, arg4 + arg3 - Static16.aClass17_2.method5253());
		Static312.aClass17_46.method5246(arg0 + arg2 - Static16.aClass17_2.method5268(), -Static16.aClass17_2.method5253() + (arg4 - -arg3));
	}
}
