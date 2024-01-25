import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public class Class37 {

	@OriginalMember(owner = "client!co", name = "v", descriptor = "[Lclient!ss;")
	private static final Class223[] aClass223Array2 = new Class223[32];

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	public int anInt4351;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "Ljava/lang/Object;")
	public Object anObject7;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "[Lclient!dd;")
	public final Class4_Sub8[] aClass4_Sub8Array3 = new Class4_Sub8[8];

	@OriginalMember(owner = "client!co", name = "g", descriptor = "[I")
	public final int[] anIntArray347 = new int[100];

	@OriginalMember(owner = "client!co", name = "k", descriptor = "[I")
	public final int[] anIntArray348 = new int[3];

	@OriginalMember(owner = "client!co", name = "f", descriptor = "[Lclient!vj;")
	public final Class6_Sub2[] aClass6_Sub2Array3 = new Class6_Sub2[100];

	static {
		@Pc(72) Class223[] local72 = Static57.method1157();
		for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
			aClass223Array2[local72[local74].anInt6527] = local72[local74];
		}
	}
}
