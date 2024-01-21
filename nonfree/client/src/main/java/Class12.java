import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FGDIESUZ")
public final class Class12 {

	@OriginalMember(owner = "client!FGDIESUZ", name = "a", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!FGDIESUZ", name = "b", descriptor = "[I")
	public int[] anIntArray38;

	@OriginalMember(owner = "client!FGDIESUZ", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!FGDIESUZ", name = "<init>", descriptor = "(Lclient!TKPFKOXP;I)V")
	public Class12(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt174 = arg0.method492();
			this.anIntArray38 = new int[this.anInt174];
			this.anIntArrayArray6 = new int[this.anInt174][];
			for (@Pc(25) int local25 = 0; local25 < this.anInt174; local25++) {
				this.anIntArray38[local25] = arg0.method492();
			}
			for (@Pc(40) int local40 = 0; local40 < this.anInt174; local40++) {
				@Pc(45) int local45 = arg0.method492();
				this.anIntArrayArray6[local40] = new int[local45];
				for (@Pc(53) int local53 = 0; local53 < local45; local53++) {
					this.anIntArrayArray6[local40][local53] = arg0.method492();
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("92011, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
