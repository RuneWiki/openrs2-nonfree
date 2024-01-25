import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class4_Sub41 extends Class4 {

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	public final int anInt6168;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
	public final int anInt6171;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "[I")
	public final int[] anIntArray481;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "[I")
	public final int[] anIntArray480;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "[Z")
	public final boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray172;

	static {
		new Class159("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6168 = arg0;
		@Pc(11) Class4_Sub11 local11 = new Class4_Sub11(arg1);
		this.anInt6171 = local11.method3440();
		this.anIntArray481 = new int[this.anInt6171];
		this.anIntArray480 = new int[this.anInt6171];
		this.aBooleanArray28 = new boolean[this.anInt6171];
		this.anIntArrayArray172 = new int[this.anInt6171][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt6171; local38++) {
			this.anIntArray481[local38] = local11.method3440();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt6171; local54++) {
			this.aBooleanArray28[local54] = local11.method3440() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt6171; local79++) {
			this.anIntArray480[local79] = local11.method3401();
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt6171; local99++) {
			this.anIntArrayArray172[local99] = new int[local11.method3440()];
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt6171; local120++) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArrayArray172[local120].length; local124++) {
				this.anIntArrayArray172[local120][local124] = local11.method3440();
			}
		}
	}
}
