import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private int anInt535 = 117;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private int anInt536;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!lb;I)V")
	public Class10(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt536 = arg0.method480();
			this.anIntArray161 = new int[this.anInt536];
			this.anIntArrayArray12 = new int[this.anInt536][];
			for (@Pc(27) int local27 = 0; local27 < this.anInt536; local27++) {
				this.anIntArray161[local27] = arg0.method480();
			}
			for (@Pc(42) int local42 = 0; local42 < this.anInt536; local42++) {
				@Pc(47) int local47 = arg0.method480();
				this.anIntArrayArray12[local42] = new int[local47];
				for (@Pc(55) int local55 = 0; local55 < local47; local55++) {
					this.anIntArrayArray12[local42][local55] = arg0.method480();
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("44885, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
