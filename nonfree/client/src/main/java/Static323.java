import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
	public static int anInt5579;

	@OriginalMember(owner = "client!kq", name = "C", descriptor = "[Lclient!tb;")
	public static Class49[] aClass49Array7;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIB)I")
	public static int method5076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(23) int local23 = 65536 - Class6_Sub2_Sub12.anIntArray292[arg1 * 8192 / arg2] >> 1;
		return (arg3 * local23 >> 16) + ((65536 - local23) * arg0 >> 16);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIILclient!ml;I)Lclient!gda;")
	public static Class44_Sub1_Sub1 method5077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class75_Sub3 arg4) {
		if (arg4.aBoolean495 || Static232.method4114(arg1) && Static232.method4114(arg2)) {
			return new Class44_Sub1_Sub1(arg4, 3553, arg0, arg3, arg1, arg2, true);
		} else if (arg4.aBoolean492) {
			return new Class44_Sub1_Sub1(arg4, 34037, arg0, arg3, arg1, arg2, true);
		} else {
			return new Class44_Sub1_Sub1(arg4, arg0, arg3, arg1, arg2, Static314.method4970(arg1), Static314.method4970(arg2), true);
		}
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(II)Z")
	public static boolean method5078(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class6_Sub2_Sub11 local18 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8124(); local18 != null; local18 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8134()) {
			if (Static67.method810(local18.anInt5173) && local18.aLong169 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
