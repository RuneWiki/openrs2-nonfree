import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class5_Sub16 extends Class5 {

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	public final int anInt1894;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "I")
	public final int anInt1893;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "[I")
	public final int[] anIntArray120;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "[Z")
	public final boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "[I")
	public final int[] anIntArray119;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1894 = arg0;
		@Pc(11) Class5_Sub22 local11 = new Class5_Sub22(arg1);
		this.anInt1893 = local11.method5966();
		this.anIntArrayArray9 = new int[this.anInt1893][];
		this.anIntArray120 = new int[this.anInt1893];
		this.aBooleanArray3 = new boolean[this.anInt1893];
		this.anIntArray119 = new int[this.anInt1893];
		for (@Pc(38) int local38 = 0; local38 < this.anInt1893; local38++) {
			this.anIntArray120[local38] = local11.method5966();
			if (this.anIntArray120[local38] == 6) {
				this.anIntArray120[local38] = 2;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt1893; local67++) {
			this.aBooleanArray3[local67] = local11.method5966() == 1;
		}
		for (@Pc(88) int local88 = 0; local88 < this.anInt1893; local88++) {
			this.anIntArray119[local88] = local11.method5968();
		}
		for (@Pc(108) int local108 = 0; local108 < this.anInt1893; local108++) {
			this.anIntArrayArray9[local108] = new int[local11.method5966()];
		}
		for (@Pc(125) int local125 = 0; local125 < this.anInt1893; local125++) {
			for (@Pc(129) int local129 = 0; local129 < this.anIntArrayArray9[local125].length; local129++) {
				this.anIntArrayArray9[local125][local129] = local11.method5966();
			}
		}
	}
}
