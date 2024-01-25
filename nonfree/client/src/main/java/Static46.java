import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "Lclient!bja;")
	public static final Class39 aClass39_1 = new Class39();

	@OriginalMember(owner = "client!bja", name = "f", descriptor = "Lclient!bja;")
	public static final Class39 aClass39_2 = new Class39();

	@OriginalMember(owner = "client!bja", name = "g", descriptor = "Lclient!bja;")
	public static final Class39 aClass39_3 = new Class39();

	@OriginalMember(owner = "client!bja", name = "h", descriptor = "Lclient!bja;")
	public static final Class39 aClass39_4 = new Class39();

	@OriginalMember(owner = "client!bja", name = "i", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_14 = new Class187(71, 3);

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(BZ)V")
	public static void method621() {
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub19_2, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub19_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub21_2, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub21_1, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub3_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub24_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub4_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub26_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub20_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub15_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub5_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub10_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub16_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub8_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub28_2, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub28_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub17_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub11_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub13_1, 0);
		Static238.method3423();
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub14_1, 2);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub27_1, 1);
		Static523.method8754();
		Static3.method39();
		Static446.aBoolean570 = true;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(BI)V")
	public static void method622(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static68.aBooleanArray1[arg0]) {
			Static342.aClass50_98.method907(arg0);
			Static227.aClass394ArrayArray2[arg0] = null;
			Static69.aClass394ArrayArray1[arg0] = null;
			Static68.aBooleanArray1[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(ZIII)Lclient!cb;")
	public static Class50 method623(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class287 local5 = null;
		if (Static187.aClass85_2 != null) {
			local5 = new Class287(arg2, Static187.aClass85_2, Static474.aClass85Array1[arg2], 1000000);
		}
		Static366.aClass7_Sub1Array2[arg2] = Static469.aClass291_1.method7098(arg2, Static666.aClass287_4, local5);
		Static366.aClass7_Sub1Array2[arg2].method166();
		return new Class50(Static366.aClass7_Sub1Array2[arg2], arg0, arg1);
	}
}
