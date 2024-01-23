import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!cg;")
	public static Class22 aClass22_74;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!cg;")
	public static Class22 aClass22_75;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
	public static int anInt4196;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!lg;")
	public static Class97 aClass97_19;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	public static int anInt4197 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
	public static void method3398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class149 local7 = Static194.method3177(arg0);
		@Pc(10) int local10 = local7.anInt4768;
		@Pc(13) int local13 = local7.anInt4771;
		@Pc(20) int local20 = Class13_Sub2.anIntArray71[local13 - local10];
		@Pc(23) int local23 = local7.anInt4772;
		if (arg1 < 0 || arg1 > local20) {
			arg1 = 0;
		}
		local20 <<= local10;
		Static298.method4227(local23, Static298.anIntArray414[local23] & ~local20 | arg1 << local10 & local20);
	}
}
