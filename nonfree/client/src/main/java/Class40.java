import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!URJIIMJU")
public final class Class40 {

	@OriginalMember(owner = "client!URJIIMJU", name = "a", descriptor = "Z")
	private boolean aBoolean141 = true;

	@OriginalMember(owner = "client!URJIIMJU", name = "b", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!URJIIMJU", name = "c", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!URJIIMJU", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!URJIIMJU", name = "<init>", descriptor = "(Lclient!WNCFPLWV;I)V")
	public Class40(@OriginalArg(0) Class3_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt638 = arg0.method458();
			this.anIntArray170 = new int[this.anInt638];
			this.anIntArrayArray18 = new int[this.anInt638][];
			for (@Pc(33) int local33 = 0; local33 < this.anInt638; local33++) {
				this.anIntArray170[local33] = arg0.method458();
			}
			for (@Pc(48) int local48 = 0; local48 < this.anInt638; local48++) {
				@Pc(53) int local53 = arg0.method458();
				this.anIntArrayArray18[local48] = new int[local53];
				for (@Pc(61) int local61 = 0; local61 < local53; local61++) {
					this.anIntArrayArray18[local48][local61] = arg0.method458();
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("94551, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}
}
