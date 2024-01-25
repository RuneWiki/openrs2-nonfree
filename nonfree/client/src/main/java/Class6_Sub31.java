import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class6_Sub31 extends Class6 {

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
	public final int anInt4849;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
	public final int anInt4851;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "[I")
	public final int[] anIntArray277;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "[Z")
	public final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "[I")
	public final int[] anIntArray276;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(I[B)V")
	public Class6_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4849 = arg0;
		@Pc(11) Class6_Sub23 local11 = new Class6_Sub23(arg1);
		this.anInt4851 = local11.method8374();
		this.anIntArray277 = new int[this.anInt4851];
		this.anIntArrayArray26 = new int[this.anInt4851][];
		this.aBooleanArray16 = new boolean[this.anInt4851];
		this.anIntArray276 = new int[this.anInt4851];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4851; local38++) {
			this.anIntArray277[local38] = local11.method8374();
			if (this.anIntArray277[local38] == 6) {
				this.anIntArray277[local38] = 2;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt4851; local67++) {
			this.aBooleanArray16[local67] = local11.method8374() == 1;
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt4851; local92++) {
			this.anIntArray276[local92] = local11.method8363();
		}
		for (@Pc(108) int local108 = 0; local108 < this.anInt4851; local108++) {
			this.anIntArrayArray26[local108] = new int[local11.method8374()];
		}
		for (@Pc(125) int local125 = 0; local125 < this.anInt4851; local125++) {
			for (@Pc(129) int local129 = 0; local129 < this.anIntArrayArray26[local125].length; local129++) {
				this.anIntArrayArray26[local125][local129] = local11.method8374();
			}
		}
	}
}
