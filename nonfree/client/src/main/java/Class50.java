import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XZSJUDQY")
public final class Class50 {

	@OriginalMember(owner = "client!XZSJUDQY", name = "a", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!XZSJUDQY", name = "b", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!XZSJUDQY", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!XZSJUDQY", name = "<init>", descriptor = "(Lclient!WBEWPIXO;I)V")
	public Class50(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt810 = arg0.method468();
			this.anIntArray203 = new int[this.anInt810];
			this.anIntArrayArray21 = new int[this.anInt810][];
			for (@Pc(19) int local19 = 0; local19 < this.anInt810; local19++) {
				this.anIntArray203[local19] = arg0.method468();
			}
			for (@Pc(34) int local34 = 0; local34 < this.anInt810; local34++) {
				@Pc(39) int local39 = arg0.method468();
				this.anIntArrayArray21[local34] = new int[local39];
				for (@Pc(47) int local47 = 0; local47 < local39; local47++) {
					this.anIntArrayArray21[local34][local47] = arg0.method468();
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("90605, " + arg0 + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
