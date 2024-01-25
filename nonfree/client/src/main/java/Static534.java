import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
	public static int anInt8996;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "[F")
	public static final float[] aFloatArray92 = new float[4];

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "[J")
	public static final long[] aLongArray23 = new long[10];

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method7513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = Static27.method393(arg1, Static280.anInt5114, Static356.anInt6028);
		@Pc(19) int local19 = Static27.method393(arg3, Static280.anInt5114, Static356.anInt6028);
		@Pc(25) int local25 = Static27.method393(arg2, Static85.anInt1313, Static316.anInt6313);
		@Pc(31) int local31 = Static27.method393(arg5, Static85.anInt1313, Static316.anInt6313);
		@Pc(40) int local40 = Static27.method393(arg1 + arg6, Static280.anInt5114, Static356.anInt6028);
		@Pc(51) int local51 = Static27.method393(arg3 - arg6, Static280.anInt5114, Static356.anInt6028);
		for (@Pc(53) int local53 = local11; local53 < local40; local53++) {
			Static482.method7040(arg0, local25, Static384.anIntArrayArray38[local53], local31);
		}
		for (@Pc(71) int local71 = local19; local71 > local51; local71--) {
			Static482.method7040(arg0, local25, Static384.anIntArrayArray38[local71], local31);
		}
		@Pc(101) int local101 = Static27.method393(arg6 + arg2, Static85.anInt1313, Static316.anInt6313);
		@Pc(109) int local109 = Static27.method393(arg5 - arg6, Static85.anInt1313, Static316.anInt6313);
		for (@Pc(117) int local117 = local40; local117 <= local51; local117++) {
			@Pc(123) int[] local123 = Static384.anIntArrayArray38[local117];
			Static482.method7040(arg0, local25, local123, local101);
			Static482.method7040(arg4, local101, local123, local109);
			Static482.method7040(arg0, local109, local123, local31);
		}
	}
}
