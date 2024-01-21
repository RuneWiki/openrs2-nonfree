import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EHKAWURP")
public final class Class8 {

	@OriginalMember(owner = "client!EHKAWURP", name = "a", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!EHKAWURP", name = "b", descriptor = "[I")
	public int[] anIntArray23;

	@OriginalMember(owner = "client!EHKAWURP", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!EHKAWURP", name = "<init>", descriptor = "(Lclient!MNKDCXXG;Z)V")
	public Class8(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt201 = arg0.method307();
			this.anIntArray23 = new int[this.anInt201];
			this.anIntArrayArray2 = new int[this.anInt201][];
			for (@Pc(25) int local25 = 0; local25 < this.anInt201; local25++) {
				this.anIntArray23[local25] = arg0.method307();
			}
			for (@Pc(40) int local40 = 0; local40 < this.anInt201; local40++) {
				@Pc(45) int local45 = arg0.method307();
				this.anIntArrayArray2[local40] = new int[local45];
				for (@Pc(53) int local53 = 0; local53 < local45; local53++) {
					this.anIntArrayArray2[local40][local53] = arg0.method307();
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("98964, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
