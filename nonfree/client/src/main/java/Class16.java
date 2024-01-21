import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HSGACJOH")
public final class Class16 {

	@OriginalMember(owner = "client!HSGACJOH", name = "a", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!HSGACJOH", name = "b", descriptor = "[I")
	public int[] anIntArray58;

	@OriginalMember(owner = "client!HSGACJOH", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!HSGACJOH", name = "<init>", descriptor = "(BLclient!DNRIFKTO;)V")
	public Class16(@OriginalArg(0) byte arg0, @OriginalArg(1) Class2_Sub1_Sub4 arg1) {
		try {
			this.anInt317 = arg1.method94();
			this.anIntArray58 = new int[this.anInt317];
			this.anIntArrayArray5 = new int[this.anInt317][];
			for (@Pc(29) int local29 = 0; local29 < this.anInt317; local29++) {
				this.anIntArray58[local29] = arg1.method94();
			}
			for (@Pc(44) int local44 = 0; local44 < this.anInt317; local44++) {
				@Pc(49) int local49 = arg1.method94();
				this.anIntArrayArray5[local44] = new int[local49];
				for (@Pc(57) int local57 = 0; local57 < local49; local57++) {
					this.anIntArrayArray5[local44][local57] = arg1.method94();
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("28298, " + arg0 + ", " + arg1 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}
}
