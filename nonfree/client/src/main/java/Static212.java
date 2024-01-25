import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!rw;")
	public static Class294 aClass294_3;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt5852 = 0;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_197 = new Class123(43, 3);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
	public static int method4712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
	public static void method4713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(4, arg1);
		local8.method7363();
		local8.anInt9377 = arg2;
		local8.anInt9381 = arg3;
		local8.anInt9383 = arg0;
	}
}
