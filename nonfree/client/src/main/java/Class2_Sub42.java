import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
	public final int anInt8911;

	@OriginalMember(owner = "client!raa", name = "z", descriptor = "I")
	public final int anInt8914;

	@OriginalMember(owner = "client!raa", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "[I")
	public final int[] anIntArray569;

	@OriginalMember(owner = "client!raa", name = "u", descriptor = "[I")
	public final int[] anIntArray570;

	@OriginalMember(owner = "client!raa", name = "o", descriptor = "[Z")
	public final boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt8911 = arg0;
		@Pc(11) Class2_Sub11 local11 = new Class2_Sub11(arg1);
		this.anInt8914 = local11.method8383();
		this.anIntArrayArray49 = new int[this.anInt8914][];
		this.anIntArray569 = new int[this.anInt8914];
		this.anIntArray570 = new int[this.anInt8914];
		this.aBooleanArray22 = new boolean[this.anInt8914];
		for (@Pc(38) int local38 = 0; local38 < this.anInt8914; local38++) {
			this.anIntArray569[local38] = local11.method8383();
			if (this.anIntArray569[local38] == 6) {
				this.anIntArray569[local38] = 2;
			}
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt8914; local69++) {
			this.aBooleanArray22[local69] = local11.method8383() == 1;
		}
		for (@Pc(96) int local96 = 0; local96 < this.anInt8914; local96++) {
			this.anIntArray570[local96] = local11.method8326();
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt8914; local116++) {
			this.anIntArrayArray49[local116] = new int[local11.method8383()];
		}
		for (@Pc(137) int local137 = 0; local137 < this.anInt8914; local137++) {
			for (@Pc(141) int local141 = 0; local141 < this.anIntArrayArray49[local137].length; local141++) {
				this.anIntArrayArray49[local137][local141] = local11.method8383();
			}
		}
	}
}
