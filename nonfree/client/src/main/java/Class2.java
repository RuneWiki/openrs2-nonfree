import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AQXKJVRI")
public final class Class2 {

	@OriginalMember(owner = "client!AQXKJVRI", name = "a", descriptor = "B")
	private byte aByte1 = 9;

	@OriginalMember(owner = "client!AQXKJVRI", name = "b", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!AQXKJVRI", name = "c", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!AQXKJVRI", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!AQXKJVRI", name = "<init>", descriptor = "(Lclient!CFARFRSG;B)V")
	public Class2(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt110 = arg0.method59();
			if (arg1 != this.aByte1) {
				throw new NullPointerException();
			}
			this.anIntArray11 = new int[this.anInt110];
			this.anIntArrayArray1 = new int[this.anInt110][];
			for (@Pc(30) int local30 = 0; local30 < this.anInt110; local30++) {
				this.anIntArray11[local30] = arg0.method59();
			}
			for (@Pc(45) int local45 = 0; local45 < this.anInt110; local45++) {
				@Pc(50) int local50 = arg0.method59();
				this.anIntArrayArray1[local45] = new int[local50];
				for (@Pc(58) int local58 = 0; local58 < local50; local58++) {
					this.anIntArrayArray1[local45][local58] = arg0.method59();
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("89281, " + arg0 + ", " + arg1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
