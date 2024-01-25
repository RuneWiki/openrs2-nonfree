import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public final class Class5_Sub55 extends Class5 {

	@OriginalMember(owner = "client!wha", name = "t", descriptor = "I")
	public final int anInt10636;

	@OriginalMember(owner = "client!wha", name = "o", descriptor = "I")
	public final int anInt10633;

	@OriginalMember(owner = "client!wha", name = "p", descriptor = "[I")
	public final int[] anIntArray604;

	@OriginalMember(owner = "client!wha", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!wha", name = "n", descriptor = "[Z")
	public final boolean[] aBooleanArray40;

	@OriginalMember(owner = "client!wha", name = "s", descriptor = "[I")
	public final int[] anIntArray605;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub55(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt10636 = arg0;
		@Pc(9) Class5_Sub41 local9 = new Class5_Sub41(arg1);
		this.anInt10633 = local9.method7816();
		this.anIntArray604 = new int[this.anInt10633];
		this.anIntArrayArray60 = new int[this.anInt10633][];
		this.aBooleanArray40 = new boolean[this.anInt10633];
		this.anIntArray605 = new int[this.anInt10633];
		for (@Pc(36) int local36 = 0; local36 < this.anInt10633; local36++) {
			this.anIntArray604[local36] = local9.method7816();
			if (this.anIntArray604[local36] == 6) {
				this.anIntArray604[local36] = 2;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < this.anInt10633; local64++) {
			this.aBooleanArray40[local64] = local9.method7816() == 1;
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt10633; local90++) {
			this.anIntArray605[local90] = local9.method7860();
		}
		for (@Pc(105) int local105 = 0; local105 < this.anInt10633; local105++) {
			this.anIntArrayArray60[local105] = new int[local9.method7816()];
		}
		for (@Pc(121) int local121 = 0; local121 < this.anInt10633; local121++) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArrayArray60[local121].length; local124++) {
				this.anIntArrayArray60[local121][local124] = local9.method7816();
			}
		}
	}
}
