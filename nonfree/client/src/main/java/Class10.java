import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private int anInt532;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!lb;Z)V")
	public Class10(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt533 = arg0.method480();
			this.anIntArray161 = new int[this.anInt533];
			this.anIntArrayArray12 = new int[this.anInt533][];
			for (@Pc(24) int local24 = 0; local24 < this.anInt533; local24++) {
				this.anIntArray161[local24] = arg0.method480();
			}
			for (@Pc(39) int local39 = 0; local39 < this.anInt533; local39++) {
				@Pc(44) int local44 = arg0.method480();
				this.anIntArrayArray12[local39] = new int[local44];
				for (@Pc(52) int local52 = 0; local52 < local44; local52++) {
					this.anIntArrayArray12[local39][local52] = arg0.method480();
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("203, " + arg0 + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
