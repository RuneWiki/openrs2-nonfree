import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TJOELOUM")
public final class Class30 {

	@OriginalMember(owner = "client!TJOELOUM", name = "a", descriptor = "I")
	private int anInt675 = 25735;

	@OriginalMember(owner = "client!TJOELOUM", name = "b", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!TJOELOUM", name = "c", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!TJOELOUM", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!TJOELOUM", name = "<init>", descriptor = "(Lclient!GHHPHSRU;I)V")
	public Class30(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt676 = arg0.method89();
			this.anIntArray168 = new int[this.anInt676];
			this.anIntArrayArray18 = new int[this.anInt676][];
			for (@Pc(27) int local27 = 0; local27 < this.anInt676; local27++) {
				this.anIntArray168[local27] = arg0.method89();
			}
			for (@Pc(42) int local42 = 0; local42 < this.anInt676; local42++) {
				@Pc(47) int local47 = arg0.method89();
				this.anIntArrayArray18[local42] = new int[local47];
				for (@Pc(55) int local55 = 0; local55 < local47; local55++) {
					this.anIntArrayArray18[local42][local55] = arg0.method89();
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("22722, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
