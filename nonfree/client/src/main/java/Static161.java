import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gaa", name = "u", descriptor = "[F")
	public static final float[] aFloatArray53 = new float[4];

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method5441(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0.charAt(local12) == arg1) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I[IIIIZLclient!uca;B)Lclient!ei;")
	public static Class3_Sub1_Sub1 method5444(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class162_Sub3 arg5) {
		if (arg5.aBoolean739 || Static259.method3656(arg2) && Static259.method3656(arg3)) {
			return new Class3_Sub1_Sub1(arg5, 3553, arg2, arg3, false, arg1, arg4, 0);
		} else if (arg5.aBoolean735) {
			return new Class3_Sub1_Sub1(arg5, 34037, arg2, arg3, false, arg1, arg4, 0);
		} else {
			return new Class3_Sub1_Sub1(arg5, arg2, arg3, Static355.method5078(arg2), Static355.method5078(arg3), arg1);
		}
	}
}
