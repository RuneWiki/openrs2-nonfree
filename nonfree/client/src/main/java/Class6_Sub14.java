import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	public final int anInt3093;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
	private final int anInt3087;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "[I")
	public final int[] anIntArray291;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "[[I")
	public final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3093 = arg0;
		@Pc(11) Class6_Sub1 local11 = new Class6_Sub1(arg1);
		this.anInt3087 = local11.method1495();
		this.anIntArray291 = new int[this.anInt3087];
		this.anIntArrayArray23 = new int[this.anInt3087][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt3087; local28++) {
			this.anIntArray291[local28] = local11.method1495();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt3087; local44++) {
			this.anIntArrayArray23[local44] = new int[local11.method1495()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt3087; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray23[local61].length; local65++) {
				this.anIntArrayArray23[local61][local65] = local11.method1495();
			}
		}
	}
}
