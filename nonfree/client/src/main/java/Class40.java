import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!USEDATIW")
public final class Class40 {

	@OriginalMember(owner = "client!USEDATIW", name = "a", descriptor = "Z")
	private boolean aBoolean156 = true;

	@OriginalMember(owner = "client!USEDATIW", name = "b", descriptor = "I")
	private int anInt622;

	@OriginalMember(owner = "client!USEDATIW", name = "c", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!USEDATIW", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!USEDATIW", name = "<init>", descriptor = "(ZLclient!NHEPCMLW;)V")
	public Class40(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			this.anInt622 = arg1.method274();
			this.anIntArray186 = new int[this.anInt622];
			this.anIntArrayArray16 = new int[this.anInt622][];
			for (@Pc(22) int local22 = 0; local22 < this.anInt622; local22++) {
				this.anIntArray186[local22] = arg1.method274();
			}
			for (@Pc(37) int local37 = 0; local37 < this.anInt622; local37++) {
				@Pc(42) int local42 = arg1.method274();
				this.anIntArrayArray16[local37] = new int[local42];
				for (@Pc(50) int local50 = 0; local50 < local42; local50++) {
					this.anIntArrayArray16[local37][local50] = arg1.method274();
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("60367, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
