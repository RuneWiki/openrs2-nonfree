import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BIWBGZXL")
public final class Class1 {

	@OriginalMember(owner = "client!BIWBGZXL", name = "a", descriptor = "I")
	private int anInt1;

	@OriginalMember(owner = "client!BIWBGZXL", name = "b", descriptor = "[I")
	public int[] anIntArray1;

	@OriginalMember(owner = "client!BIWBGZXL", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!BIWBGZXL", name = "<init>", descriptor = "(Lclient!MLYYHULT;I)V")
	public Class1(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt1 = arg0.method200();
			this.anIntArray1 = new int[this.anInt1];
			this.anIntArrayArray1 = new int[this.anInt1][];
			for (@Pc(26) int local26 = 0; local26 < this.anInt1; local26++) {
				this.anIntArray1[local26] = arg0.method200();
			}
			for (@Pc(41) int local41 = 0; local41 < this.anInt1; local41++) {
				@Pc(46) int local46 = arg0.method200();
				this.anIntArrayArray1[local41] = new int[local46];
				for (@Pc(54) int local54 = 0; local54 < local46; local54++) {
					this.anIntArrayArray1[local41][local54] = arg0.method200();
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("43217, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
