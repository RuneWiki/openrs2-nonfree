import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TULKBDIJ")
public final class Class38 {

	@OriginalMember(owner = "client!TULKBDIJ", name = "a", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!TULKBDIJ", name = "b", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!TULKBDIJ", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!TULKBDIJ", name = "<init>", descriptor = "(Lclient!EYMNCFMK;Z)V")
	public Class38(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt700 = arg0.method155();
			this.anIntArray168 = new int[this.anInt700];
			this.anIntArrayArray17 = new int[this.anInt700][];
			for (@Pc(28) int local28 = 0; local28 < this.anInt700; local28++) {
				this.anIntArray168[local28] = arg0.method155();
			}
			for (@Pc(43) int local43 = 0; local43 < this.anInt700; local43++) {
				@Pc(48) int local48 = arg0.method155();
				this.anIntArrayArray17[local43] = new int[local48];
				for (@Pc(56) int local56 = 0; local56 < local48; local56++) {
					this.anIntArrayArray17[local43][local56] = arg0.method155();
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("94113, " + arg0 + ", " + arg1 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}
}
