import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	public static int anInt353;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public static int anInt352 = 0;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_3 = new Class242(33, 2);

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIILclient!na;)V")
	public static void method353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub2 arg3) {
		@Pc(4) Class216 local4 = Static161.method2122(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub2_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!nh;Z)Z")
	public static boolean method354(@OriginalArg(0) Class170 arg0) {
		return Static85.aClass170_9 == arg0 || Static362.aClass170_7 == arg0 || Static374.aClass170_8 == arg0 || Static82.aClass170_1 == arg0;
	}
}
