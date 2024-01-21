import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EPQQXCGW")
public final class Class16 {

	@OriginalMember(owner = "client!EPQQXCGW", name = "a", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!EPQQXCGW", name = "b", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!EPQQXCGW", name = "c", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!EPQQXCGW", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!EPQQXCGW", name = "<init>", descriptor = "(ZLclient!IUVBENCV;)V")
	public Class16(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			this.anInt133 = arg1.method152();
			this.anIntArray37 = new int[this.anInt133];
			this.anIntArrayArray6 = new int[this.anInt133][];
			for (@Pc(32) int local32 = 0; local32 < this.anInt133; local32++) {
				this.anIntArray37[local32] = arg1.method152();
			}
			for (@Pc(47) int local47 = 0; local47 < this.anInt133; local47++) {
				@Pc(52) int local52 = arg1.method152();
				this.anIntArrayArray6[local47] = new int[local52];
				for (@Pc(60) int local60 = 0; local60 < local52; local60++) {
					this.anIntArrayArray6[local47][local60] = arg1.method152();
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("96305, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
