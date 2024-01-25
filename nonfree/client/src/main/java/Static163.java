import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	public static int anInt3084;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "I")
	public static int anInt3089;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "I")
	public static int anInt3085 = -1;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	public static int anInt3087 = 0;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "F")
	public static float aFloat69 = 1024.0F;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	public static void method3244() {
		Static253.method4341();
		Static16.aClass81_1 = null;
		Static139.aClass14ArrayArray1 = null;
		Static349.aClass19_4 = null;
		Static201.aClass19_2 = null;
		Static316.aClass19_3 = null;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIII)V")
	public static void method3245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static6.method125(arg4, Static230.anInt4308, Static327.anInt3039);
		@Pc(19) int local19 = Static6.method125(arg2, Static230.anInt4308, Static327.anInt3039);
		@Pc(25) int local25 = Static6.method125(arg1, Static265.anInt4933, Static311.anInt5837);
		@Pc(31) int local31 = Static6.method125(arg5, Static265.anInt4933, Static311.anInt5837);
		@Pc(39) int local39 = Static6.method125(arg3 + arg4, Static230.anInt4308, Static327.anInt3039);
		@Pc(48) int local48 = Static6.method125(arg2 - arg3, Static230.anInt4308, Static327.anInt3039);
		for (@Pc(50) int local50 = local11; local50 < local39; local50++) {
			Static14.method247(local31, arg0, Static11.anIntArrayArray11[local50], local25);
		}
		for (@Pc(66) int local66 = local19; local66 > local48; local66--) {
			Static14.method247(local31, arg0, Static11.anIntArrayArray11[local66], local25);
		}
		@Pc(92) int local92 = Static6.method125(arg1 + arg3, Static265.anInt4933, Static311.anInt5837);
		@Pc(100) int local100 = Static6.method125(arg5 - arg3, Static265.anInt4933, Static311.anInt5837);
		for (@Pc(102) int local102 = local39; local102 <= local48; local102++) {
			@Pc(108) int[] local108 = Static11.anIntArrayArray11[local102];
			Static14.method247(local92, arg0, local108, local25);
			Static14.method247(local31, arg0, local108, local100);
		}
	}
}
