import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MJPGHGEY")
public final class Class26 {

	@OriginalMember(owner = "client!MJPGHGEY", name = "a", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!MJPGHGEY", name = "b", descriptor = "[I")
	public int[] anIntArray111;

	@OriginalMember(owner = "client!MJPGHGEY", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!MJPGHGEY", name = "<init>", descriptor = "(Lclient!PQBRPYKE;I)V")
	public Class26(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt331 = arg0.method239();
			this.anIntArray111 = new int[this.anInt331];
			this.anIntArrayArray13 = new int[this.anInt331][];
			for (@Pc(28) int local28 = 0; local28 < this.anInt331; local28++) {
				this.anIntArray111[local28] = arg0.method239();
			}
			for (@Pc(43) int local43 = 0; local43 < this.anInt331; local43++) {
				@Pc(48) int local48 = arg0.method239();
				this.anIntArrayArray13[local43] = new int[local48];
				for (@Pc(56) int local56 = 0; local56 < local48; local56++) {
					this.anIntArrayArray13[local43][local56] = arg0.method239();
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("95423, " + arg0 + ", " + arg1 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}
}
