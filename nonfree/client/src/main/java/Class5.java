import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CKXVXQFJ")
public final class Class5 {

	@OriginalMember(owner = "client!CKXVXQFJ", name = "a", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!CKXVXQFJ", name = "b", descriptor = "I")
	private int anInt31;

	@OriginalMember(owner = "client!CKXVXQFJ", name = "c", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!CKXVXQFJ", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!CKXVXQFJ", name = "<init>", descriptor = "(ZLclient!NQUAUMDT;)V")
	public Class5(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1) {
		try {
			this.anInt31 = arg1.method262();
			this.anIntArray25 = new int[this.anInt31];
			this.anIntArrayArray3 = new int[this.anInt31][];
			for (@Pc(32) int local32 = 0; local32 < this.anInt31; local32++) {
				this.anIntArray25[local32] = arg1.method262();
			}
			for (@Pc(47) int local47 = 0; local47 < this.anInt31; local47++) {
				@Pc(52) int local52 = arg1.method262();
				this.anIntArrayArray3[local47] = new int[local52];
				for (@Pc(60) int local60 = 0; local60 < local52; local60++) {
					this.anIntArrayArray3[local47][local60] = arg1.method262();
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("67339, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
