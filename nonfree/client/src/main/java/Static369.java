import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static369 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[IILclient!mm;ZI)Lclient!vj;")
	public static Class60_Sub4_Sub1 method5852(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class55_Sub1 arg3) {
		if (arg3.aBoolean326 || Static224.method4077(arg0) && Static224.method4077(arg2)) {
			return new Class60_Sub4_Sub1(arg3, 3553, arg0, arg2, false, arg1);
		} else if (arg3.aBoolean315) {
			return new Class60_Sub4_Sub1(arg3, 34037, arg0, arg2, false, arg1);
		} else {
			return new Class60_Sub4_Sub1(arg3, arg0, arg2, Static109.method1929(arg0), Static109.method1929(arg2), arg1);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIILclient!mm;)Lclient!vj;")
	public static Class60_Sub4_Sub1 method5853(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class55_Sub1 arg4) {
		if (arg4.aBoolean326 || Static224.method4077(arg3) && Static224.method4077(arg0)) {
			return new Class60_Sub4_Sub1(arg4, 3553, arg2, arg1, arg3, arg0, true);
		} else if (arg4.aBoolean315) {
			return new Class60_Sub4_Sub1(arg4, 34037, arg2, arg1, arg3, arg0, true);
		} else {
			return new Class60_Sub4_Sub1(arg4, arg2, arg1, arg3, arg0, Static109.method1929(arg3), Static109.method1929(arg0), true);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZI[BIIILclient!mm;)Lclient!vj;")
	public static Class60_Sub4_Sub1 method5854(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class55_Sub1 arg3) {
		if (arg3.aBoolean326 || Static224.method4077(arg2) && Static224.method4077(arg0)) {
			return new Class60_Sub4_Sub1(arg3, 3553, 6406, arg2, arg0, false, arg1, 6406);
		} else if (arg3.aBoolean315) {
			return new Class60_Sub4_Sub1(arg3, 34037, 6406, arg2, arg0, false, arg1, 6406);
		} else {
			return new Class60_Sub4_Sub1(arg3, 6406, arg2, arg0, Static109.method1929(arg2), Static109.method1929(arg0), arg1, 6406);
		}
	}
}
