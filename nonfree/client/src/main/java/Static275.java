import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_76 = new Class186(59, 3);

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
	public static int anInt5397 = 0;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
	public static int anInt5398 = -1;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public static void method4676(@OriginalArg(0) int arg0) {
		Static117.anInt2850 = arg0;
		Static59.aClass316_9.method7794();
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)Lclient!in;")
	public static Class2_Sub6 method4678(@OriginalArg(0) int arg0) {
		@Pc(12) Class145[] local12 = Class114.aClass145Array1;
		synchronized (Class114.aClass145Array1) {
			@Pc(32) Class2_Sub6 local32;
			if (arg0 >= Class114.aClass145Array1.length || Class114.aClass145Array1[arg0].method3929()) {
				local32 = new Class2_Sub6();
				local32.aClass2_Sub7Array1 = new Class2_Sub7[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass2_Sub7Array1[local38] = new Class2_Sub7();
				}
			} else {
				local32 = (Class2_Sub6) Class114.aClass145Array1[arg0].method3925();
				local32.method7890();
				@Pc(69) int local69 = Static213.anIntArray328[arg0]--;
			}
			return local32;
		}
	}
}
