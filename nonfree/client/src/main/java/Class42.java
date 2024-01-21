import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VPIFXIOD")
public final class Class42 {

	@OriginalMember(owner = "client!VPIFXIOD", name = "a", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!VPIFXIOD", name = "b", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!VPIFXIOD", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!VPIFXIOD", name = "<init>", descriptor = "(Lclient!MFMVIYHT;I)V")
	public Class42(@OriginalArg(0) Class10_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt611 = arg0.method311();
			this.anIntArray172 = new int[this.anInt611];
			this.anIntArrayArray15 = new int[this.anInt611][];
			for (@Pc(25) int local25 = 0; local25 < this.anInt611; local25++) {
				this.anIntArray172[local25] = arg0.method311();
			}
			for (@Pc(40) int local40 = 0; local40 < this.anInt611; local40++) {
				@Pc(45) int local45 = arg0.method311();
				this.anIntArrayArray15[local40] = new int[local45];
				for (@Pc(53) int local53 = 0; local53 < local45; local53++) {
					this.anIntArrayArray15[local40][local53] = arg0.method311();
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("51209, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
