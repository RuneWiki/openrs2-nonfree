import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
	public final int anInt4840;

	@OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
	public final int anInt4836;

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "[I")
	public final int[] anIntArray423;

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "[Z")
	public final boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "[I")
	public final int[] anIntArray422;

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4840 = arg0;
		@Pc(9) Class1_Sub5 local9 = new Class1_Sub5(arg1);
		this.anInt4836 = local9.method5366();
		this.anIntArray423 = new int[this.anInt4836];
		this.aBooleanArray35 = new boolean[this.anInt4836];
		this.anIntArray422 = new int[this.anInt4836];
		this.anIntArrayArray49 = new int[this.anInt4836][];
		for (@Pc(36) int local36 = 0; local36 < this.anInt4836; local36++) {
			this.anIntArray422[local36] = local9.method5366();
		}
		for (@Pc(51) int local51 = 0; local51 < this.anInt4836; local51++) {
			this.aBooleanArray35[local51] = local9.method5366() == 1;
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt4836; local75++) {
			this.anIntArray423[local75] = local9.method5362();
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt4836; local90++) {
			this.anIntArrayArray49[local90] = new int[local9.method5366()];
		}
		for (@Pc(106) int local106 = 0; local106 < this.anInt4836; local106++) {
			for (@Pc(109) int local109 = 0; local109 < this.anIntArrayArray49[local106].length; local109++) {
				this.anIntArrayArray49[local106][local109] = local9.method5366();
			}
		}
	}
}
