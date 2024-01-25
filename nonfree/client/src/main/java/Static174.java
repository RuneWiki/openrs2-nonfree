import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!uo;")
	public static Class129 aClass129_5;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt3440 = 0;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_31 = new Class26(30);

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
	public static boolean aBoolean219 = false;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "[I")
	public static final int[] anIntArray224 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "[I")
	public static final int[] anIntArray225 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lclient!oa;")
	public static Class146 method2822(@OriginalArg(1) int arg0) {
		@Pc(10) Class146 local10 = (Class146) Static218.aClass26_27.method332((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static171.aClass144_43.method3896(arg0, 29);
		local10 = new Class146();
		if (local20 != null) {
			local10.method3949(arg0, new Class11_Sub25(local20));
		}
		Static218.aClass26_27.method330((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([IZ)Ljava/lang/String;")
	public static String method2823(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static111.anInt2055;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(26) Class182 local26 = Static241.method4263(arg0[local13]);
			if (local26.anInt5593 != -1) {
				@Pc(42) Class97 local42 = (Class97) Static131.aClass26_20.method332((long) local26.anInt5593);
				if (local42 == null) {
					@Pc(50) Class125 local50 = Static368.method2857(Static182.aClass144_49, local26.anInt5593, 0);
					if (local50 != null) {
						local42 = Static107.aClass129_4.method5018(local50);
						Static131.aClass26_20.method330((long) local26.anInt5593, local42);
					}
				}
				if (local42 != null) {
					Static209.aClass97Array16[local11] = local42;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
