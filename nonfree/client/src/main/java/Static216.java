import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray28 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "[I")
	public static final int[] anIntArray224 = new int[32];

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
	public static int anInt2086 = -1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!aca;)V")
	public static void method1968(@OriginalArg(1) Class4_Sub1 arg0) {
		arg0.aClass6_1 = null;
		@Pc(12) int local12 = arg0.aClass4_Sub7Array1.length;
		for (@Pc(20) int local20 = 0; local20 < local12; local20++) {
			arg0.aClass4_Sub7Array1[local20].aBoolean573 = false;
		}
		@Pc(34) Class90[] local34 = Class3_Sub1_Sub25.aClass90Array1;
		synchronized (Class3_Sub1_Sub25.aClass90Array1) {
			if (local12 < Class3_Sub1_Sub25.aClass90Array1.length && Static162.anIntArray373[local12] < 200) {
				Class3_Sub1_Sub25.aClass90Array1[local12].method2322(arg0);
				@Pc(61) int local61 = Static162.anIntArray373[local12]++;
			}
		}
	}
}
