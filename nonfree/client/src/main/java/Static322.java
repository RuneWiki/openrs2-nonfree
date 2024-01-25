import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_133 = new Class25(18, 6);

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "[I")
	public static final int[] anIntArray484 = new int[25];

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "[I")
	public static final int[] anIntArray485 = new int[14];

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_77 = new Class208(16, 8);

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "()V")
	public static void method4569() {
		for (@Pc(1) int local1 = 0; local1 < Static315.anInt5651; local1++) {
			@Pc(6) Class11_Sub5 local6 = Static218.aClass11_Sub5Array3[local1];
			Static444.method6031(local6);
			Static218.aClass11_Sub5Array3[local1] = null;
		}
		Static315.anInt5651 = 0;
	}
}
