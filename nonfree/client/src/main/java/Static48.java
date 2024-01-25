import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
	public static int anInt4159;

	@OriginalMember(owner = "client!cn", name = "B", descriptor = "Lclient!iq;")
	public static Class104 aClass104_105;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "[B")
	public static final byte[] aByteArray48 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BIIIIII)V")
	public static void method3550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg0);
		@Pc(17) int local17 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg3);
		@Pc(25) int local25 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg2);
		@Pc(33) int local33 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg5);
		@Pc(41) int local41 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg0 + arg4);
		@Pc(52) int local52 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg3 - arg4);
		for (@Pc(54) int local54 = local11; local54 < local41; local54++) {
			Static115.method2278(Static364.anIntArrayArray57[local54], local33, arg1, local25);
		}
		for (@Pc(74) int local74 = local17; local74 > local52; local74--) {
			Static115.method2278(Static364.anIntArrayArray57[local74], local33, arg1, local25);
		}
		@Pc(96) int local96 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg2 + arg4);
		@Pc(109) int local109 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg5 - arg4);
		for (@Pc(111) int local111 = local41; local111 <= local52; local111++) {
			@Pc(117) int[] local117 = Static364.anIntArrayArray57[local111];
			Static115.method2278(local117, local96, arg1, local25);
			Static115.method2278(local117, local33, arg1, local109);
		}
	}
}
