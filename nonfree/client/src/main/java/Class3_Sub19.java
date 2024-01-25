import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
	public final int anInt2647;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	public final int anInt2645;

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "[Z")
	public final boolean[] aBooleanArray64;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "[I")
	public final int[] anIntArray280;

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "[I")
	public final int[] anIntArray282;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2647 = arg0;
		@Pc(11) Class3_Sub5 local11 = new Class3_Sub5(arg1);
		this.anInt2645 = local11.method2739();
		this.aBooleanArray64 = new boolean[this.anInt2645];
		this.anIntArray280 = new int[this.anInt2645];
		this.anIntArray282 = new int[this.anInt2645];
		this.anIntArrayArray23 = new int[this.anInt2645][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2645; local38++) {
			this.anIntArray280[local38] = local11.method2739();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt2645; local54++) {
			this.aBooleanArray64[local54] = local11.method2739() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt2645; local79++) {
			this.anIntArray282[local79] = local11.method2767();
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt2645; local99++) {
			this.anIntArrayArray23[local99] = new int[local11.method2739()];
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt2645; local120++) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArrayArray23[local120].length; local124++) {
				this.anIntArrayArray23[local120][local124] = local11.method2739();
			}
		}
	}
}
