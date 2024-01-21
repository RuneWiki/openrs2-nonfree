import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LMYEIVWK")
public final class Class22 {

	@OriginalMember(owner = "client!LMYEIVWK", name = "a", descriptor = "Z")
	private boolean aBoolean95 = true;

	@OriginalMember(owner = "client!LMYEIVWK", name = "b", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!LMYEIVWK", name = "c", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!LMYEIVWK", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!LMYEIVWK", name = "<init>", descriptor = "(Lclient!RSWRPCHR;I)V")
	public Class22(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt356 = arg0.method340();
			this.anIntArray81 = new int[this.anInt356];
			this.anIntArrayArray8 = new int[this.anInt356][];
			for (@Pc(32) int local32 = 0; local32 < this.anInt356; local32++) {
				this.anIntArray81[local32] = arg0.method340();
			}
			for (@Pc(47) int local47 = 0; local47 < this.anInt356; local47++) {
				@Pc(52) int local52 = arg0.method340();
				this.anIntArrayArray8[local47] = new int[local52];
				for (@Pc(60) int local60 = 0; local60 < local52; local60++) {
					this.anIntArrayArray8[local47][local60] = arg0.method340();
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("41039, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
