import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class6_Sub11 extends Class6 {

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "[I")
	public static final int[] anIntArray132 = new int[120];

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
	public int anInt1397;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "[Lclient!oaa;")
	public Class224[] aClass224Array1;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "[Lclient!oaa;")
	public Class224[] aClass224Array2;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
	public int anInt1399;

	static {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 120; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) ((double) local17 + Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D);
			local10 += local30;
			anIntArray132[local12] = local10 / 4;
		}
	}
}
