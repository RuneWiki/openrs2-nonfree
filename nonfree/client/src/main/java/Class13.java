import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GCTCRUHH")
public final class Class13 {

	@OriginalMember(owner = "client!GCTCRUHH", name = "a", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!GCTCRUHH", name = "b", descriptor = "[I")
	public int[] anIntArray53;

	@OriginalMember(owner = "client!GCTCRUHH", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!GCTCRUHH", name = "<init>", descriptor = "(ILclient!BFQIDHPO;)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1) {
		try {
			this.anInt291 = arg1.method79();
			this.anIntArray53 = new int[this.anInt291];
			this.anIntArrayArray7 = new int[this.anInt291][];
			for (@Pc(26) int local26 = 0; local26 < this.anInt291; local26++) {
				this.anIntArray53[local26] = arg1.method79();
			}
			for (@Pc(41) int local41 = 0; local41 < this.anInt291; local41++) {
				@Pc(46) int local46 = arg1.method79();
				this.anIntArrayArray7[local41] = new int[local46];
				for (@Pc(54) int local54 = 0; local54 < local46; local54++) {
					this.anIntArrayArray7[local41][local54] = arg1.method79();
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("79255, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
