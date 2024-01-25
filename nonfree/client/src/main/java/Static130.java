import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IFIIIBIZ)[I")
	public static int[] method1803(@OriginalArg(1) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class5_Sub1_Sub20 local15 = new Class5_Sub1_Sub20();
		local15.anInt3283 = 8;
		local15.anInt3278 = 8;
		local15.anInt3289 = (int) (arg0 * 4096.0F);
		local15.aBoolean210 = true;
		local15.anInt3287 = 35;
		local15.anInt3288 = 4;
		local15.method5762();
		Static320.method3944(1, 2048);
		local15.method2647(local11, 0);
		return local11;
	}
}
