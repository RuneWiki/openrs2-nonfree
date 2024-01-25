import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class4_Sub29 extends Class4 {

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	public final int anInt4421;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	public final int anInt4423;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "[Z")
	public final boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "[I")
	public final int[] anIntArray361;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "[I")
	public final int[] anIntArray360;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4421 = arg0;
		@Pc(11) Class4_Sub30 local11 = new Class4_Sub30(arg1);
		this.anInt4423 = local11.method4864();
		this.aBooleanArray15 = new boolean[this.anInt4423];
		this.anIntArray361 = new int[this.anInt4423];
		this.anIntArrayArray39 = new int[this.anInt4423][];
		this.anIntArray360 = new int[this.anInt4423];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4423; local38++) {
			this.anIntArray361[local38] = local11.method4864();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt4423; local54++) {
			this.aBooleanArray15[local54] = local11.method4864() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt4423; local79++) {
			this.anIntArray360[local79] = local11.method4877();
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt4423; local99++) {
			this.anIntArrayArray39[local99] = new int[local11.method4864()];
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt4423; local120++) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArrayArray39[local120].length; local124++) {
				this.anIntArrayArray39[local120][local124] = local11.method4864();
			}
		}
	}
}
