import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!lt", name = "L", descriptor = "I")
	public static int anInt4569;

	@OriginalMember(owner = "client!lt", name = "H", descriptor = "Lclient!mq;")
	public static Class156 aClass156_9 = null;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZB)Lclient!nm;")
	public static Class3_Sub32 method3609(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) long local12 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub32) Static188.aClass11_24.method324(local12);
	}
}
