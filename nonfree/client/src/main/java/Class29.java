import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NSCXCZCZ")
public final class Class29 {

	@OriginalMember(owner = "client!NSCXCZCZ", name = "a", descriptor = "I")
	private int anInt522 = -32217;

	@OriginalMember(owner = "client!NSCXCZCZ", name = "b", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!NSCXCZCZ", name = "c", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!NSCXCZCZ", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!NSCXCZCZ", name = "<init>", descriptor = "(ZLclient!JHKSAGUC;)V")
	public Class29(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt523 = arg1.method238();
			this.anIntArray92 = new int[this.anInt523];
			this.anIntArrayArray9 = new int[this.anInt523][];
			for (@Pc(27) int local27 = 0; local27 < this.anInt523; local27++) {
				this.anIntArray92[local27] = arg1.method238();
			}
			for (@Pc(42) int local42 = 0; local42 < this.anInt523; local42++) {
				@Pc(47) int local47 = arg1.method238();
				this.anIntArrayArray9[local42] = new int[local47];
				for (@Pc(55) int local55 = 0; local55 < local47; local55++) {
					this.anIntArrayArray9[local42][local55] = arg1.method238();
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("18455, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
