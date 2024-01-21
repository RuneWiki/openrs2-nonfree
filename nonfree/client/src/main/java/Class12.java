import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private int anInt576;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(BLclient!mb;)V")
	public Class12(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt576 = arg1.method467();
			this.anIntArray157 = new int[this.anInt576];
			this.anIntArrayArray11 = new int[this.anInt576][];
			for (@Pc(33) int local33 = 0; local33 < this.anInt576; local33++) {
				this.anIntArray157[local33] = arg1.method467();
			}
			for (@Pc(48) int local48 = 0; local48 < this.anInt576; local48++) {
				@Pc(53) int local53 = arg1.method467();
				this.anIntArrayArray11[local48] = new int[local53];
				for (@Pc(61) int local61 = 0; local61 < local53; local61++) {
					this.anIntArrayArray11[local48][local61] = arg1.method467();
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("1092, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}
}
