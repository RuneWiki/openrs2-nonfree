import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QICGPMWF")
public final class Class30 {

	@OriginalMember(owner = "client!QICGPMWF", name = "a", descriptor = "I")
	private int anInt504 = 8;

	@OriginalMember(owner = "client!QICGPMWF", name = "b", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!QICGPMWF", name = "c", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!QICGPMWF", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!QICGPMWF", name = "<init>", descriptor = "(Lclient!TQYMAXSO;I)V")
	public Class30(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt505 = arg0.method406();
			if (arg1 < this.anInt504 || arg1 > this.anInt504) {
				throw new NullPointerException();
			}
			this.anIntArray151 = new int[this.anInt505];
			this.anIntArrayArray16 = new int[this.anInt505][];
			for (@Pc(34) int local34 = 0; local34 < this.anInt505; local34++) {
				this.anIntArray151[local34] = arg0.method406();
			}
			for (@Pc(49) int local49 = 0; local49 < this.anInt505; local49++) {
				@Pc(54) int local54 = arg0.method406();
				this.anIntArrayArray16[local49] = new int[local54];
				for (@Pc(62) int local62 = 0; local62 < local54; local62++) {
					this.anIntArrayArray16[local49][local62] = arg0.method406();
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("54901, " + arg0 + ", " + arg1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}
}
