import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private int anInt517;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!lb;I)V")
	public Class10(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt517 = arg0.method476();
			this.anIntArray161 = new int[this.anInt517];
			if (arg1 != 0) {
				throw new NullPointerException();
			}
			this.anIntArrayArray12 = new int[this.anInt517][];
			for (@Pc(25) int local25 = 0; local25 < this.anInt517; local25++) {
				this.anIntArray161[local25] = arg0.method476();
			}
			for (@Pc(40) int local40 = 0; local40 < this.anInt517; local40++) {
				@Pc(45) int local45 = arg0.method476();
				this.anIntArrayArray12[local40] = new int[local45];
				for (@Pc(53) int local53 = 0; local53 < local45; local53++) {
					this.anIntArrayArray12[local40][local53] = arg0.method476();
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("27585, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
