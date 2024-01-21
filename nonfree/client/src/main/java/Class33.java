import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QZXSFRVC")
public final class Class33 {

	@OriginalMember(owner = "client!QZXSFRVC", name = "a", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!QZXSFRVC", name = "b", descriptor = "I")
	private int anInt444 = -32392;

	@OriginalMember(owner = "client!QZXSFRVC", name = "c", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!QZXSFRVC", name = "d", descriptor = "[I")
	public int[] anIntArray122;

	@OriginalMember(owner = "client!QZXSFRVC", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!QZXSFRVC", name = "<init>", descriptor = "(ZLclient!LBBVYYXO;)V")
	public Class33(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub3 arg1) {
		try {
			this.anInt445 = arg1.method267();
			this.anIntArray122 = new int[this.anInt445];
			this.anIntArrayArray14 = new int[this.anInt445][];
			for (@Pc(30) int local30 = 0; local30 < this.anInt445; local30++) {
				this.anIntArray122[local30] = arg1.method267();
			}
			for (@Pc(45) int local45 = 0; local45 < this.anInt445; local45++) {
				@Pc(50) int local50 = arg1.method267();
				this.anIntArrayArray14[local45] = new int[local50];
				for (@Pc(58) int local58 = 0; local58 < local50; local58++) {
					this.anIntArrayArray14[local45][local58] = arg1.method267();
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("8735, " + arg0 + ", " + arg1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
