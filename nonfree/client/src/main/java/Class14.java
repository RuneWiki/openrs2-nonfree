import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IIXTARMC")
public final class Class14 {

	@OriginalMember(owner = "client!IIXTARMC", name = "a", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!IIXTARMC", name = "b", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!IIXTARMC", name = "c", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!IIXTARMC", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!IIXTARMC", name = "<init>", descriptor = "(Lclient!EMWAMCXW;I)V")
	public Class14(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt171 = arg0.method97();
			this.anIntArray77 = new int[this.anInt171];
			this.anIntArrayArray11 = new int[this.anInt171][];
			for (@Pc(22) int local22 = 0; local22 < this.anInt171; local22++) {
				this.anIntArray77[local22] = arg0.method97();
			}
			for (@Pc(37) int local37 = 0; local37 < this.anInt171; local37++) {
				@Pc(42) int local42 = arg0.method97();
				this.anIntArrayArray11[local37] = new int[local42];
				for (@Pc(50) int local50 = 0; local50 < local42; local50++) {
					this.anIntArrayArray11[local37][local50] = arg0.method97();
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("72519, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}
}
