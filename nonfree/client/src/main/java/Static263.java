import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "Lclient!in;")
	public static final Class169 aClass169_129 = new Class169(27, 8);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)Lclient!jd;")
	public static Class177 method4525(@OriginalArg(0) int arg0) {
		@Pc(8) Class177[] local8 = Static126.method2281();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class177 local16 = local8[local10];
			if (arg0 == local16.anInt5125) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!lea;III[IIZI)Lclient!uk;")
	public static Class50_Sub4_Sub1 method4527(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg0.aBoolean457 || Static100.method1457(arg2) && Static100.method1457(arg3)) {
			return new Class50_Sub4_Sub1(arg0, 3553, arg2, arg3, false, arg4, arg1, 0);
		} else if (arg0.aBoolean467) {
			return new Class50_Sub4_Sub1(arg0, 34037, arg2, arg3, false, arg4, arg1, 0);
		} else {
			return new Class50_Sub4_Sub1(arg0, arg2, arg3, Static432.method7064(arg2), Static432.method7064(arg3), arg4);
		}
	}
}
