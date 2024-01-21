import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MOLQXLMB")
public final class Class33 {

	@OriginalMember(owner = "client!MOLQXLMB", name = "a", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!MOLQXLMB", name = "b", descriptor = "[I")
	public int[] anIntArray100;

	@OriginalMember(owner = "client!MOLQXLMB", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!MOLQXLMB", name = "<init>", descriptor = "(Lclient!XGRGMPUQ;Z)V")
	public Class33(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt452 = arg0.method437();
			this.anIntArray100 = new int[this.anInt452];
			this.anIntArrayArray6 = new int[this.anInt452][];
			for (@Pc(28) int local28 = 0; local28 < this.anInt452; local28++) {
				this.anIntArray100[local28] = arg0.method437();
			}
			for (@Pc(43) int local43 = 0; local43 < this.anInt452; local43++) {
				@Pc(48) int local48 = arg0.method437();
				this.anIntArrayArray6[local43] = new int[local48];
				for (@Pc(56) int local56 = 0; local56 < local48; local56++) {
					this.anIntArrayArray6[local43][local56] = arg0.method437();
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("86072, " + arg0 + ", " + arg1 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}
}
