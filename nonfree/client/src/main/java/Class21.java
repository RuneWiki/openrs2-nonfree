import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JLLLGAIH")
public final class Class21 {

	@OriginalMember(owner = "client!JLLLGAIH", name = "a", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!JLLLGAIH", name = "b", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!JLLLGAIH", name = "c", descriptor = "[I")
	public int[] anIntArray63;

	@OriginalMember(owner = "client!JLLLGAIH", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!JLLLGAIH", name = "<init>", descriptor = "(Lclient!BSNPYLEV;Z)V")
	public Class21(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt259 = arg0.method94();
			this.anIntArray63 = new int[this.anInt259];
			this.anIntArrayArray10 = new int[this.anInt259][];
			for (@Pc(32) int local32 = 0; local32 < this.anInt259; local32++) {
				this.anIntArray63[local32] = arg0.method94();
			}
			for (@Pc(47) int local47 = 0; local47 < this.anInt259; local47++) {
				@Pc(52) int local52 = arg0.method94();
				this.anIntArrayArray10[local47] = new int[local52];
				for (@Pc(60) int local60 = 0; local60 < local52; local60++) {
					this.anIntArrayArray10[local47][local60] = arg0.method94();
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("66339, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
