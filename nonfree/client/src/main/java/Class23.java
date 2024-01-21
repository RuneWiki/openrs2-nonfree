import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MJXROMKT")
public final class Class23 {

	@OriginalMember(owner = "client!MJXROMKT", name = "a", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!MJXROMKT", name = "b", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!MJXROMKT", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!MJXROMKT", name = "<init>", descriptor = "(ZLclient!SVWJKJVI;)V")
	public Class23(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1) {
		try {
			this.anInt347 = arg1.method405();
			if (!arg0) {
				throw new NullPointerException();
			}
			this.anIntArray117 = new int[this.anInt347];
			this.anIntArrayArray11 = new int[this.anInt347][];
			for (@Pc(25) int local25 = 0; local25 < this.anInt347; local25++) {
				this.anIntArray117[local25] = arg1.method405();
			}
			for (@Pc(40) int local40 = 0; local40 < this.anInt347; local40++) {
				@Pc(45) int local45 = arg1.method405();
				this.anIntArrayArray11[local40] = new int[local45];
				for (@Pc(53) int local53 = 0; local53 < local45; local53++) {
					this.anIntArrayArray11[local40][local53] = arg1.method405();
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("37802, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
