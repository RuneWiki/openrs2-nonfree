import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private int anInt578 = 32319;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	private int anInt579;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(ZLclient!mb;)V")
	public Class12(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt579 = arg1.method498();
			this.anIntArray164 = new int[this.anInt579];
			this.anIntArrayArray11 = new int[this.anInt579][];
			for (@Pc(30) int local30 = 0; local30 < this.anInt579; local30++) {
				this.anIntArray164[local30] = arg1.method498();
			}
			for (@Pc(45) int local45 = 0; local45 < this.anInt579; local45++) {
				@Pc(50) int local50 = arg1.method498();
				this.anIntArrayArray11[local45] = new int[local50];
				for (@Pc(58) int local58 = 0; local58 < local50; local58++) {
					this.anIntArrayArray11[local45][local58] = arg1.method498();
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("71605, " + arg0 + ", " + arg1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
