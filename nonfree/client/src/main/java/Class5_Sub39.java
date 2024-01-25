import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class5_Sub39 extends Class5 {

	@OriginalMember(owner = "client!pfa", name = "m", descriptor = "I")
	public final int anInt7688;

	@OriginalMember(owner = "client!pfa", name = "v", descriptor = "I")
	public final int anInt7685;

	@OriginalMember(owner = "client!pfa", name = "l", descriptor = "[Z")
	public final boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!pfa", name = "r", descriptor = "[I")
	public final int[] anIntArray462;

	@OriginalMember(owner = "client!pfa", name = "t", descriptor = "[I")
	public final int[] anIntArray463;

	@OriginalMember(owner = "client!pfa", name = "y", descriptor = "[[I")
	public final int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt7688 = arg0;
		@Pc(11) Class5_Sub23 local11 = new Class5_Sub23(arg1);
		this.anInt7685 = local11.method8529();
		this.aBooleanArray18 = new boolean[this.anInt7685];
		this.anIntArray462 = new int[this.anInt7685];
		this.anIntArray463 = new int[this.anInt7685];
		this.anIntArrayArray45 = new int[this.anInt7685][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt7685; local38++) {
			this.anIntArray463[local38] = local11.method8529();
			if (this.anIntArray463[local38] == 6) {
				this.anIntArray463[local38] = 2;
			}
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt7685; local69++) {
			this.aBooleanArray18[local69] = local11.method8529() == 1;
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt7685; local99++) {
			this.anIntArray462[local99] = local11.method8519();
		}
		for (@Pc(119) int local119 = 0; local119 < this.anInt7685; local119++) {
			this.anIntArrayArray45[local119] = new int[local11.method8529()];
		}
		for (@Pc(144) int local144 = 0; local144 < this.anInt7685; local144++) {
			for (@Pc(150) int local150 = 0; local150 < this.anIntArrayArray45[local144].length; local150++) {
				this.anIntArrayArray45[local144][local150] = local11.method8529();
			}
		}
	}
}
