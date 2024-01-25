import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!an;")
	public static Class16 aClass16_16;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public static int anInt1954 = 0;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_18 = new Class77(46, -1);

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!rw;")
	public static final Class269 aClass269_1 = new Class269("WIP", 2);

	@OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
	public static final int[] anIntArray183 = new int[1000];

	@OriginalMember(owner = "client!db", name = "h", descriptor = "[S")
	public static short[] aShortArray33 = new short[256];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([II[IILclient!gi;I)Lclient!maa;")
	public static Class145_Sub2 method1824(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42_Sub3 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg2 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(22) int local22 = arg0[local12] + local12 * arg4;
			for (@Pc(24) int local24 = 0; local24 < arg1[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class145_Sub2(arg3, arg4, arg2, local10);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
	public static boolean method1825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static396.method6217(arg0, arg1) || Static4.method199(arg0, arg1);
	}
}
