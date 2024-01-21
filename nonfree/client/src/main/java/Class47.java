import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WPDTVMXY")
public final class Class47 {

	@OriginalMember(owner = "client!WPDTVMXY", name = "a", descriptor = "I")
	private int anInt741;

	@OriginalMember(owner = "client!WPDTVMXY", name = "b", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!WPDTVMXY", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!WPDTVMXY", name = "<init>", descriptor = "(Lclient!PKHWFJLM;Z)V")
	public Class47(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt741 = arg0.method240();
			this.anIntArray193 = new int[this.anInt741];
			this.anIntArrayArray18 = new int[this.anInt741][];
			for (@Pc(28) int local28 = 0; local28 < this.anInt741; local28++) {
				this.anIntArray193[local28] = arg0.method240();
			}
			for (@Pc(43) int local43 = 0; local43 < this.anInt741; local43++) {
				@Pc(48) int local48 = arg0.method240();
				this.anIntArrayArray18[local43] = new int[local48];
				for (@Pc(56) int local56 = 0; local56 < local48; local56++) {
					this.anIntArrayArray18[local43][local56] = arg0.method240();
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("97712, " + arg0 + ", " + arg1 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}
}
