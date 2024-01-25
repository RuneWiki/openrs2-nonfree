import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "Lclient!lf;")
	public static final Class210 aClass210_1 = new Class210(9, 2);

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "[I")
	public static final int[] anIntArray68 = new int[14];

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method822(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg1, 2);
		local9.method3955();
		local9.aString42 = arg0;
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)I")
	public static int method824() {
		return Static227.method3321(false);
	}
}
