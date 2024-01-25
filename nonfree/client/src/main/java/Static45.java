import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "[I")
	public static int[] anIntArray70;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_31 = new Class157(47, 8);

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "Lclient!tm;")
	public static final Class193 aClass193_4 = new Class193();

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_2 = new Class143(7, 4);

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(BII)I")
	public static int method855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(28) int local28 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local28;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ui;ILclient!ui;)V")
	public static void method856(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(2) Class2_Sub9 arg1) {
		if (arg1.aClass2_Sub9_62 != null) {
			arg1.method5600();
		}
		arg1.aClass2_Sub9_61 = arg0.aClass2_Sub9_61;
		arg1.aClass2_Sub9_62 = arg0;
		arg1.aClass2_Sub9_62.aClass2_Sub9_61 = arg1;
		arg1.aClass2_Sub9_61.aClass2_Sub9_62 = arg1;
	}
}
