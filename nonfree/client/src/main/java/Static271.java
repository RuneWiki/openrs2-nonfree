import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!pf", name = "Ob", descriptor = "Lclient!dq;")
	public static Class53 aClass53_4;

	@OriginalMember(owner = "client!pf", name = "Lb", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_146 = new Class41(75, 4);

	@OriginalMember(owner = "client!pf", name = "Rb", descriptor = "[I")
	public static final int[] anIntArray596 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pf", name = "Tb", descriptor = "[I")
	public static final int[] anIntArray597 = new int[100];

	@OriginalMember(owner = "client!pf", name = "Ub", descriptor = "I")
	public static int anInt4862 = 0;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "(II)I")
	public static int method4255(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "(IB)V")
	public static void method4256(@OriginalArg(0) int arg0) {
		Static186.anIntArray763 = new int[arg0];
		Static305.anIntArray250 = new int[arg0];
		Static54.anIntArray149 = new int[arg0];
		Static323.anIntArray696 = new int[arg0];
		Static227.anIntArray515 = new int[arg0];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
	public static int method4258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(32) int local32 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local32;
		}
		return arg0;
	}
}
