import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	public final int anInt2065;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
	public final int anInt2066;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "[I")
	public final int[] anIntArray181;

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "[I")
	public final int[] anIntArray180;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "[Z")
	public final boolean[] aBooleanArray53;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "[[I")
	public final int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2065 = arg0;
		@Pc(11) Class1_Sub19 local11 = new Class1_Sub19(arg1);
		this.anInt2066 = local11.method2915();
		this.anIntArray181 = new int[this.anInt2066];
		this.anIntArray180 = new int[this.anInt2066];
		this.aBooleanArray53 = new boolean[this.anInt2066];
		this.anIntArrayArray21 = new int[this.anInt2066][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2066; local38++) {
			this.anIntArray181[local38] = local11.method2915();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt2066; local58++) {
			this.aBooleanArray53[local58] = local11.method2915() == 1;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt2066; local85++) {
			this.anIntArray180[local85] = local11.method2896();
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt2066; local101++) {
			this.anIntArrayArray21[local101] = new int[local11.method2915()];
		}
		for (@Pc(122) int local122 = 0; local122 < this.anInt2066; local122++) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArrayArray21[local122].length; local126++) {
				this.anIntArrayArray21[local122][local126] = local11.method2915();
			}
		}
	}
}
