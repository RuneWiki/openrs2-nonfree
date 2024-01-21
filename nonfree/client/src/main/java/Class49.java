import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YMEZTXZW")
public final class Class49 {

	@OriginalMember(owner = "client!YMEZTXZW", name = "a", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!YMEZTXZW", name = "b", descriptor = "I")
	private int anInt814;

	@OriginalMember(owner = "client!YMEZTXZW", name = "c", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!YMEZTXZW", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!YMEZTXZW", name = "<init>", descriptor = "(ILclient!RGCGKKUR;)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub4 arg1) {
		try {
			this.anInt814 = arg1.method411();
			this.anIntArray207 = new int[this.anInt814];
			this.anIntArrayArray21 = new int[this.anInt814][];
			for (@Pc(32) int local32 = 0; local32 < this.anInt814; local32++) {
				this.anIntArray207[local32] = arg1.method411();
			}
			for (@Pc(47) int local47 = 0; local47 < this.anInt814; local47++) {
				@Pc(52) int local52 = arg1.method411();
				this.anIntArrayArray21[local47] = new int[local52];
				for (@Pc(60) int local60 = 0; local60 < local52; local60++) {
					this.anIntArrayArray21[local47][local60] = arg1.method411();
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("95145, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
