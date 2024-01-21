import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GCSWWDCL")
public final class Class8 {

	@OriginalMember(owner = "client!GCSWWDCL", name = "a", descriptor = "I")
	private int anInt106 = 664;

	@OriginalMember(owner = "client!GCSWWDCL", name = "b", descriptor = "B")
	private byte aByte9 = -26;

	@OriginalMember(owner = "client!GCSWWDCL", name = "c", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!GCSWWDCL", name = "d", descriptor = "[I")
	public int[] anIntArray16;

	@OriginalMember(owner = "client!GCSWWDCL", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!GCSWWDCL", name = "<init>", descriptor = "(BLclient!FTMSICIZ;)V")
	public Class8(@OriginalArg(0) byte arg0, @OriginalArg(1) Class4_Sub1_Sub3 arg1) {
		try {
			this.anInt107 = arg1.method102();
			this.anIntArray16 = new int[this.anInt107];
			this.anIntArrayArray1 = new int[this.anInt107][];
			for (@Pc(25) int local25 = 0; local25 < this.anInt107; local25++) {
				this.anIntArray16[local25] = arg1.method102();
			}
			for (@Pc(40) int local40 = 0; local40 < this.anInt107; local40++) {
				@Pc(45) int local45 = arg1.method102();
				this.anIntArrayArray1[local40] = new int[local45];
				for (@Pc(53) int local53 = 0; local53 < local45; local53++) {
					this.anIntArrayArray1[local40][local53] = arg1.method102();
				}
			}
			if (arg0 != this.aByte9) {
				this.anInt106 = -271;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("77377, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
