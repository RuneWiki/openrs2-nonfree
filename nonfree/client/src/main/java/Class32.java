import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OAUECDUZ")
public final class Class32 {

	@OriginalMember(owner = "client!OAUECDUZ", name = "a", descriptor = "I")
	private int anInt534;

	@OriginalMember(owner = "client!OAUECDUZ", name = "b", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!OAUECDUZ", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!OAUECDUZ", name = "<init>", descriptor = "(Lclient!EGCCHUZS;I)V")
	public Class32(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt534 = arg0.method167();
			this.anIntArray140 = new int[this.anInt534];
			this.anIntArrayArray12 = new int[this.anInt534][];
			for (@Pc(26) int local26 = 0; local26 < this.anInt534; local26++) {
				this.anIntArray140[local26] = arg0.method167();
			}
			for (@Pc(41) int local41 = 0; local41 < this.anInt534; local41++) {
				@Pc(46) int local46 = arg0.method167();
				this.anIntArrayArray12[local41] = new int[local46];
				for (@Pc(54) int local54 = 0; local54 < local46; local54++) {
					this.anIntArrayArray12[local41][local54] = arg0.method167();
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("95435, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
