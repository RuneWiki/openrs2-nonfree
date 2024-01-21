import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ETJKXQLD")
public final class Class13 {

	@OriginalMember(owner = "client!ETJKXQLD", name = "a", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!ETJKXQLD", name = "b", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!ETJKXQLD", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ETJKXQLD", name = "<init>", descriptor = "(ZLclient!LDILQFVA;)V")
	public Class13(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0) {
				throw new NullPointerException();
			}
			this.anInt250 = arg1.method359();
			this.anIntArray36 = new int[this.anInt250];
			this.anIntArrayArray4 = new int[this.anInt250][];
			for (@Pc(25) int local25 = 0; local25 < this.anInt250; local25++) {
				this.anIntArray36[local25] = arg1.method359();
			}
			for (@Pc(40) int local40 = 0; local40 < this.anInt250; local40++) {
				@Pc(45) int local45 = arg1.method359();
				this.anIntArrayArray4[local40] = new int[local45];
				for (@Pc(53) int local53 = 0; local53 < local45; local53++) {
					this.anIntArrayArray4[local40][local53] = arg1.method359();
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("11325, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
