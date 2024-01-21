import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WHXBCNTD")
public final class Class42 {

	@OriginalMember(owner = "client!WHXBCNTD", name = "a", descriptor = "I")
	private int anInt718;

	@OriginalMember(owner = "client!WHXBCNTD", name = "b", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!WHXBCNTD", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!WHXBCNTD", name = "<init>", descriptor = "(Lclient!CMGGUSPR;I)V")
	public Class42(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt718 = arg0.method55();
			this.anIntArray188 = new int[this.anInt718];
			this.anIntArrayArray20 = new int[this.anInt718][];
			for (@Pc(25) int local25 = 0; local25 < this.anInt718; local25++) {
				this.anIntArray188[local25] = arg0.method55();
			}
			for (@Pc(40) int local40 = 0; local40 < this.anInt718; local40++) {
				@Pc(45) int local45 = arg0.method55();
				this.anIntArrayArray20[local40] = new int[local45];
				for (@Pc(53) int local53 = 0; local53 < local45; local53++) {
					this.anIntArrayArray20[local40][local53] = arg0.method55();
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("88001, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
