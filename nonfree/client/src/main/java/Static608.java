import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static608 {

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "[I")
	public static int[] anIntArray621;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IIZILclient!hk;IB[B)Lclient!vq;")
	public static Class39_Sub4_Sub1 method8045(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class16_Sub2 arg2, @OriginalArg(7) byte[] arg3) {
		if (arg2.aBoolean314 || Static9.method94(arg0) && Static9.method94(arg1)) {
			return new Class39_Sub4_Sub1(arg2, 3553, 6406, arg0, arg1, false, arg3, 6406);
		} else if (arg2.aBoolean318) {
			return new Class39_Sub4_Sub1(arg2, 34037, 6406, arg0, arg1, false, arg3, 6406);
		} else {
			return new Class39_Sub4_Sub1(arg2, 6406, arg0, arg1, Static527.method7377(arg0), Static527.method7377(arg1), arg3, 6406);
		}
	}
}
