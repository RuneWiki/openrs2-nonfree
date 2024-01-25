import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!jga", name = "z", descriptor = "[[I")
	public static int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!jga", name = "B", descriptor = "[I")
	public static final int[] anIntArray385 = new int[1];

	@OriginalMember(owner = "client!jga", name = "R", descriptor = "I")
	public static int anInt4757 = 0;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLclient!so;)Lclient!no;")
	public static Class92_Sub2 method3981(@OriginalArg(1) Class14_Sub29 arg0) {
		@Pc(7) Class92 local7 = Static64.method1268(arg0);
		@Pc(11) int local11 = arg0.method5878();
		@Pc(15) int local15 = arg0.method5878();
		@Pc(19) int local19 = arg0.method5900();
		return new Class92_Sub2(local7.aClass168_13, local7.aClass339_13, local7.anInt10908, local7.anInt10902, local7.anInt10903, local7.anInt10907, local7.anInt10904, local7.anInt10910, local7.anInt10905, local11, local15, local19);
	}
}
