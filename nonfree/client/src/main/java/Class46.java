import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class46 {

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "[I")
	public static final int[] anIntArray105 = new int[99];

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "Lclient!tb;")
	public Class1_Sub2_Sub17 aClass1_Sub2_Sub17_1;

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "[I")
	public int[] anIntArray104;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
	public int anInt1509;

	static {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 99; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) ((double) local17 + Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D);
			local10 += local30;
			anIntArray105[local12] = local10 / 4;
		}
	}
}
