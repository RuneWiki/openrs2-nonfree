import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KVCQPLIW")
public final class Class20 {

	@OriginalMember(owner = "client!KVCQPLIW", name = "a", descriptor = "I")
	private int anInt428 = -588;

	@OriginalMember(owner = "client!KVCQPLIW", name = "b", descriptor = "I")
	private int anInt429;

	@OriginalMember(owner = "client!KVCQPLIW", name = "c", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!KVCQPLIW", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!KVCQPLIW", name = "<init>", descriptor = "(ILclient!MBMGIXGO;)V")
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt429 = arg1.method268();
			this.anIntArray75 = new int[this.anInt429];
			this.anIntArrayArray6 = new int[this.anInt429][];
			for (@Pc(27) int local27 = 0; local27 < this.anInt429; local27++) {
				this.anIntArray75[local27] = arg1.method268();
			}
			for (@Pc(42) int local42 = 0; local42 < this.anInt429; local42++) {
				@Pc(47) int local47 = arg1.method268();
				this.anIntArrayArray6[local42] = new int[local47];
				for (@Pc(55) int local55 = 0; local55 < local47; local55++) {
					this.anIntArrayArray6[local42][local55] = arg1.method268();
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("59011, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
