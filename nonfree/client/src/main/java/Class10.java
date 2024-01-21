import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private int anInt533 = 1;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private int anInt534;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!lb;I)V")
	public Class10(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt534 = arg0.method480();
			this.anIntArray161 = new int[this.anInt534];
			this.anIntArrayArray12 = new int[this.anInt534][];
			for (@Pc(22) int local22 = 0; local22 < this.anInt534; local22++) {
				this.anIntArray161[local22] = arg0.method480();
			}
			for (@Pc(37) int local37 = 0; local37 < this.anInt534; local37++) {
				@Pc(42) int local42 = arg0.method480();
				this.anIntArrayArray12[local37] = new int[local42];
				for (@Pc(50) int local50 = 0; local50 < local42; local50++) {
					this.anIntArrayArray12[local37][local50] = arg0.method480();
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("41343, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
