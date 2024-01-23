import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!co", name = "u", descriptor = "I")
	public int anInt841;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "I")
	public int anInt837;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "[Z")
	public boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!co", name = "o", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt841 = arg0;
		@Pc(11) Class3_Sub26 local11 = new Class3_Sub26(arg1);
		this.anInt837 = local11.method3915();
		this.aBooleanArray18 = new boolean[this.anInt837];
		this.anIntArrayArray7 = new int[this.anInt837][];
		this.anIntArray67 = new int[this.anInt837];
		this.anIntArray69 = new int[this.anInt837];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt837; local38++) {
			this.anIntArray67[local38] = local11.method3915();
		}
		for (local38 = 0; local38 < this.anInt837; local38++) {
			this.aBooleanArray18[local38] = local11.method3915() == 1;
		}
		for (local38 = 0; local38 < this.anInt837; local38++) {
			this.anIntArray69[local38] = local11.method3948();
		}
		for (local38 = 0; local38 < this.anInt837; local38++) {
			this.anIntArrayArray7[local38] = new int[local11.method3915()];
		}
		for (local38 = 0; local38 < this.anInt837; local38++) {
			for (@Pc(132) int local132 = 0; local132 < this.anIntArrayArray7[local38].length; local132++) {
				this.anIntArrayArray7[local38][local132] = local11.method3915();
			}
		}
	}
}
