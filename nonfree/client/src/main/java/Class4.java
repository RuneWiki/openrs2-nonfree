import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ANHDGPPA")
public final class Class4 {

	@OriginalMember(owner = "client!ANHDGPPA", name = "a", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ANHDGPPA", name = "b", descriptor = "I")
	private int anInt31;

	@OriginalMember(owner = "client!ANHDGPPA", name = "c", descriptor = "[I")
	public int[] anIntArray4;

	@OriginalMember(owner = "client!ANHDGPPA", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ANHDGPPA", name = "<init>", descriptor = "(ILclient!XJCNBMKS;)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt31 = arg1.method498();
			this.anIntArray4 = new int[this.anInt31];
			if (arg0 <= 0) {
				this.aBoolean15 = !this.aBoolean15;
			}
			this.anIntArrayArray1 = new int[this.anInt31][];
			for (@Pc(32) int local32 = 0; local32 < this.anInt31; local32++) {
				this.anIntArray4[local32] = arg1.method498();
			}
			for (@Pc(47) int local47 = 0; local47 < this.anInt31; local47++) {
				@Pc(52) int local52 = arg1.method498();
				this.anIntArrayArray1[local47] = new int[local52];
				for (@Pc(60) int local60 = 0; local60 < local52; local60++) {
					this.anIntArrayArray1[local47][local60] = arg1.method498();
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("97484, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
