import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TMLYUVVT")
public final class Class37 {

	@OriginalMember(owner = "client!TMLYUVVT", name = "a", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!TMLYUVVT", name = "b", descriptor = "I")
	private int anInt598;

	@OriginalMember(owner = "client!TMLYUVVT", name = "c", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!TMLYUVVT", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!TMLYUVVT", name = "<init>", descriptor = "(ILclient!UAWAYCTK;)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1) {
		try {
			this.anInt598 = arg1.method402();
			this.anIntArray140 = new int[this.anInt598];
			this.anIntArrayArray17 = new int[this.anInt598][];
			for (@Pc(36) int local36 = 0; local36 < this.anInt598; local36++) {
				this.anIntArray140[local36] = arg1.method402();
			}
			for (@Pc(51) int local51 = 0; local51 < this.anInt598; local51++) {
				@Pc(56) int local56 = arg1.method402();
				this.anIntArrayArray17[local51] = new int[local56];
				for (@Pc(64) int local64 = 0; local64 < local56; local64++) {
					this.anIntArrayArray17[local51][local64] = arg1.method402();
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("57518, " + arg0 + ", " + arg1 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}
}
