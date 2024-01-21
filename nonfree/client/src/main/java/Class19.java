import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KLNBCMBU")
public final class Class19 {

	@OriginalMember(owner = "client!KLNBCMBU", name = "a", descriptor = "B")
	private byte aByte10 = 2;

	@OriginalMember(owner = "client!KLNBCMBU", name = "b", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!KLNBCMBU", name = "c", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!KLNBCMBU", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!KLNBCMBU", name = "<init>", descriptor = "(Lclient!BJPWOXRJ;B)V")
	public Class19(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt391 = arg0.method22();
			@Pc(20) int local20;
			if (arg1 == this.aByte10) {
				@Pc(16) boolean local16 = false;
			} else {
				for (local20 = 1; local20 > 0; local20++) {
				}
			}
			this.anIntArray112 = new int[this.anInt391];
			this.anIntArrayArray14 = new int[this.anInt391][];
			for (local20 = 0; local20 < this.anInt391; local20++) {
				this.anIntArray112[local20] = arg0.method22();
			}
			for (@Pc(52) int local52 = 0; local52 < this.anInt391; local52++) {
				@Pc(57) int local57 = arg0.method22();
				this.anIntArrayArray14[local52] = new int[local57];
				for (@Pc(65) int local65 = 0; local65 < local57; local65++) {
					this.anIntArrayArray14[local52][local65] = arg0.method22();
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("43647, " + arg0 + ", " + arg1 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
