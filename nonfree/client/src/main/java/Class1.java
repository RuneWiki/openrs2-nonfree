import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AECNGNXZ")
public final class Class1 {

	@OriginalMember(owner = "client!AECNGNXZ", name = "a", descriptor = "I")
	private int anInt1 = 68;

	@OriginalMember(owner = "client!AECNGNXZ", name = "b", descriptor = "I")
	private int anInt2;

	@OriginalMember(owner = "client!AECNGNXZ", name = "c", descriptor = "[I")
	public int[] anIntArray1;

	@OriginalMember(owner = "client!AECNGNXZ", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!AECNGNXZ", name = "<init>", descriptor = "(ZLclient!GLMIQHJI;)V")
	public Class1(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			this.anInt2 = arg1.method165();
			this.anIntArray1 = new int[this.anInt2];
			this.anIntArrayArray1 = new int[this.anInt2][];
			for (@Pc(22) int local22 = 0; local22 < this.anInt2; local22++) {
				this.anIntArray1[local22] = arg1.method165();
			}
			for (@Pc(37) int local37 = 0; local37 < this.anInt2; local37++) {
				@Pc(42) int local42 = arg1.method165();
				this.anIntArrayArray1[local37] = new int[local42];
				for (@Pc(50) int local50 = 0; local50 < local42; local50++) {
					this.anIntArrayArray1[local37][local50] = arg1.method165();
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("81837, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
