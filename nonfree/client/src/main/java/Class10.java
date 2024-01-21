import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILclient!lb;)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt523 = arg1.method473();
			this.anIntArray159 = new int[this.anInt523];
			this.anIntArrayArray12 = new int[this.anInt523][];
			for (@Pc(29) int local29 = 0; local29 < this.anInt523; local29++) {
				this.anIntArray159[local29] = arg1.method473();
			}
			for (@Pc(44) int local44 = 0; local44 < this.anInt523; local44++) {
				@Pc(49) int local49 = arg1.method473();
				this.anIntArrayArray12[local44] = new int[local49];
				for (@Pc(57) int local57 = 0; local57 < local49; local57++) {
					this.anIntArrayArray12[local44][local57] = arg1.method473();
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("90869, " + arg0 + ", " + arg1 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}
}
