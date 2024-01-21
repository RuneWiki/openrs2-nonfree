import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILclient!lb;)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt529 = arg1.method480();
			this.anIntArray161 = new int[this.anInt529];
			this.anIntArrayArray12 = new int[this.anInt529][];
			for (@Pc(26) int local26 = 0; local26 < this.anInt529; local26++) {
				this.anIntArray161[local26] = arg1.method480();
			}
			for (@Pc(41) int local41 = 0; local41 < this.anInt529; local41++) {
				@Pc(46) int local46 = arg1.method480();
				this.anIntArrayArray12[local41] = new int[local46];
				for (@Pc(54) int local54 = 0; local54 < local46; local54++) {
					this.anIntArrayArray12[local41][local54] = arg1.method480();
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("38393, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
