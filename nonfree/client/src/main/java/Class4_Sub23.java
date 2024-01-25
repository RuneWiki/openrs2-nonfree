import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class4_Sub23 extends Class4 {

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	public final int anInt4038;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	public final int anInt4039;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
	public final int[] anIntArray336;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "[Z")
	public final boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "[I")
	public final int[] anIntArray337;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4038 = arg0;
		@Pc(11) Class4_Sub9 local11 = new Class4_Sub9(arg1);
		this.anInt4039 = local11.method5007();
		this.anIntArray336 = new int[this.anInt4039];
		this.aBooleanArray19 = new boolean[this.anInt4039];
		this.anIntArray337 = new int[this.anInt4039];
		this.anIntArrayArray49 = new int[this.anInt4039][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4039; local38++) {
			this.anIntArray336[local38] = local11.method5007();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt4039; local54++) {
			this.aBooleanArray19[local54] = local11.method5007() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt4039; local81++) {
			this.anIntArray337[local81] = local11.method5028();
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt4039; local97++) {
			this.anIntArrayArray49[local97] = new int[local11.method5007()];
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt4039; local114++) {
			for (@Pc(118) int local118 = 0; local118 < this.anIntArrayArray49[local114].length; local118++) {
				this.anIntArrayArray49[local114][local118] = local11.method5007();
			}
		}
	}
}
