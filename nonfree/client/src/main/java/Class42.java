import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XEMMPKIX")
public final class Class42 {

	@OriginalMember(owner = "client!XEMMPKIX", name = "a", descriptor = "I")
	private int anInt656;

	@OriginalMember(owner = "client!XEMMPKIX", name = "b", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!XEMMPKIX", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!XEMMPKIX", name = "<init>", descriptor = "(Lclient!PGNBHFUF;I)V")
	public Class42(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt656 = arg0.method355();
			this.anIntArray157 = new int[this.anInt656];
			this.anIntArrayArray15 = new int[this.anInt656][];
			for (@Pc(25) int local25 = 0; local25 < this.anInt656; local25++) {
				this.anIntArray157[local25] = arg0.method355();
			}
			for (@Pc(40) int local40 = 0; local40 < this.anInt656; local40++) {
				@Pc(45) int local45 = arg0.method355();
				this.anIntArrayArray15[local40] = new int[local45];
				for (@Pc(53) int local53 = 0; local53 < local45; local53++) {
					this.anIntArrayArray15[local40][local53] = arg0.method355();
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("12644, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
