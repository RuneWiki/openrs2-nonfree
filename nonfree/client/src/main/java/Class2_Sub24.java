import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
	public int anInt2868;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
	private int anInt2865;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "[I")
	public int[] anIntArray475;

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "[Z")
	public boolean[] aBooleanArray86;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2868 = arg0;
		@Pc(9) Class2_Sub23 local9 = new Class2_Sub23(arg1);
		this.anInt2865 = local9.method2122();
		this.anIntArray475 = new int[this.anInt2865];
		this.aBooleanArray86 = new boolean[this.anInt2865];
		this.anIntArrayArray26 = new int[this.anInt2865][];
		for (@Pc(31) int local31 = 0; local31 < this.anInt2865; local31++) {
			this.anIntArray475[local31] = local9.method2122();
		}
		for (@Pc(46) int local46 = 0; local46 < this.anInt2865; local46++) {
			this.aBooleanArray86[local46] = local9.method2122() == 1;
		}
		for (@Pc(70) int local70 = 0; local70 < this.anInt2865; local70++) {
			this.anIntArrayArray26[local70] = new int[local9.method2122()];
		}
		for (@Pc(86) int local86 = 0; local86 < this.anInt2865; local86++) {
			for (@Pc(89) int local89 = 0; local89 < this.anIntArrayArray26[local86].length; local89++) {
				this.anIntArrayArray26[local86][local89] = local9.method2122();
			}
		}
	}
}
