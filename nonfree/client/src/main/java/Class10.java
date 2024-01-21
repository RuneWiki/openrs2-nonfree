import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private int anInt503;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILclient!lb;)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt503 = arg1.method472();
			this.anIntArray159 = new int[this.anInt503];
			this.anIntArrayArray12 = new int[this.anInt503][];
			@Pc(23) int local23;
			if (arg0 < 0 || arg0 > 0) {
				for (local23 = 1; local23 > 0; local23++) {
				}
			}
			for (local23 = 0; local23 < this.anInt503; local23++) {
				this.anIntArray159[local23] = arg1.method472();
			}
			for (@Pc(45) int local45 = 0; local45 < this.anInt503; local45++) {
				@Pc(50) int local50 = arg1.method472();
				this.anIntArrayArray12[local45] = new int[local50];
				for (@Pc(58) int local58 = 0; local58 < local50; local58++) {
					this.anIntArrayArray12[local45][local58] = arg1.method472();
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("49536, " + arg0 + ", " + arg1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
