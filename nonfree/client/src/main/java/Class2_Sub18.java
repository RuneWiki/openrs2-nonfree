import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
	public final int anInt2788;

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
	public final int anInt2787;

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "[Z")
	public final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!hba", name = "n", descriptor = "[I")
	public final int[] anIntArray231;

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "[I")
	public final int[] anIntArray230;

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "[[I")
	public final int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2788 = arg0;
		@Pc(11) Class2_Sub7 local11 = new Class2_Sub7(arg1);
		this.anInt2787 = local11.method4464();
		this.aBooleanArray8 = new boolean[this.anInt2787];
		this.anIntArray231 = new int[this.anInt2787];
		this.anIntArray230 = new int[this.anInt2787];
		this.anIntArrayArray32 = new int[this.anInt2787][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2787; local38++) {
			this.anIntArray230[local38] = local11.method4464();
			if (this.anIntArray230[local38] == 6) {
				this.anIntArray230[local38] = 2;
			}
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt2787; local69++) {
			this.aBooleanArray8[local69] = local11.method4464() == 1;
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt2787; local92++) {
			this.anIntArray231[local92] = local11.method4518();
		}
		for (@Pc(108) int local108 = 0; local108 < this.anInt2787; local108++) {
			this.anIntArrayArray32[local108] = new int[local11.method4464()];
		}
		for (@Pc(125) int local125 = 0; local125 < this.anInt2787; local125++) {
			for (@Pc(129) int local129 = 0; local129 < this.anIntArrayArray32[local125].length; local129++) {
				this.anIntArrayArray32[local125][local129] = local11.method4464();
			}
		}
	}
}
