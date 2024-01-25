import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
	public final int anInt2359;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
	public final int anInt2358;

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "[[I")
	public final int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "[I")
	public final int[] anIntArray114;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "[I")
	public final int[] anIntArray115;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2359 = arg0;
		@Pc(11) Class1_Sub11 local11 = new Class1_Sub11(arg1);
		this.anInt2358 = local11.method4463();
		this.anIntArrayArray58 = new int[this.anInt2358][];
		this.aBooleanArray14 = new boolean[this.anInt2358];
		this.anIntArray114 = new int[this.anInt2358];
		this.anIntArray115 = new int[this.anInt2358];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2358; local38++) {
			this.anIntArray115[local38] = local11.method4463();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt2358; local58++) {
			this.aBooleanArray14[local58] = local11.method4463() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt2358; local81++) {
			this.anIntArray114[local81] = local11.method4485();
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt2358; local101++) {
			this.anIntArrayArray58[local101] = new int[local11.method4463()];
		}
		for (@Pc(122) int local122 = 0; local122 < this.anInt2358; local122++) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArrayArray58[local122].length; local126++) {
				this.anIntArrayArray58[local122][local126] = local11.method4463();
			}
		}
	}
}
