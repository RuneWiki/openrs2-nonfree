import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static436 {

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_131 = new Class186(46, -2);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!bp;ILclient!bp;)V")
	public static void method5891(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0.aClass6_Sub1_55 != null) {
			arg0.method5984();
		}
		arg0.aClass6_Sub1_56 = arg1.aClass6_Sub1_56;
		arg0.aClass6_Sub1_55 = arg1;
		arg0.aClass6_Sub1_55.aClass6_Sub1_56 = arg0;
		arg0.aClass6_Sub1_56.aClass6_Sub1_55 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZI)I")
	public static int method5892(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static118.anIntArray216[arg0 & 0x3] : Static422.anIntArray604[arg0 & 0x3];
	}
}
