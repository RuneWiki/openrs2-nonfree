import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!st", name = "n", descriptor = "I")
	public static int anInt6606;

	@OriginalMember(owner = "client!st", name = "f", descriptor = "I")
	public static int anInt6599 = 0;

	@OriginalMember(owner = "client!st", name = "q", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_41 = new Class229();

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIILclient!dn;IIZ)V")
	public static void method5172(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class56 arg2, @OriginalArg(5) int arg3) {
		Static27.aClass56_11 = arg2;
		Static347.anInt6319 = 1;
		Static76.anInt1664 = 0;
		Static437.aBoolean516 = false;
		Static454.anInt7690 = arg1;
		Static290.anInt5320 = arg3;
		Static80.anInt1719 = Static408.aClass3_Sub5_Sub1_118.method3607() / arg0;
		if (Static80.anInt1719 < 1) {
			Static80.anInt1719 = 1;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)I")
	public static int method5173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static322.method4692(arg0 - 1, arg1 - 1) + Static322.method4692(arg0 + 1, arg1 + -1) + Static322.method4692(arg0 + -1, arg1 + 1) + Static322.method4692(arg0 + 1, arg1 + 1);
		@Pc(73) int local73 = Static322.method4692(arg0 - 1, arg1) + Static322.method4692(arg0 + 1, arg1) + Static322.method4692(arg0, arg1 - 1) + Static322.method4692(arg0, arg1 - -1);
		@Pc(78) int local78 = Static322.method4692(arg0, arg1);
		return local41 / 16 + local73 / 8 + local78 / 4;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!dn;)V")
	public static void method5176(@OriginalArg(1) Class56 arg0) {
		Static226.aClass56_58 = arg0;
	}
}
