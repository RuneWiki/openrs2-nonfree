import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public final class Class3_Sub55 extends Class3 {

	@OriginalMember(owner = "client!wha", name = "n", descriptor = "I")
	public final int anInt10567;

	@OriginalMember(owner = "client!wha", name = "s", descriptor = "I")
	public final int anInt10570;

	@OriginalMember(owner = "client!wha", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!wha", name = "o", descriptor = "[I")
	public final int[] anIntArray934;

	@OriginalMember(owner = "client!wha", name = "u", descriptor = "[I")
	public final int[] anIntArray935;

	@OriginalMember(owner = "client!wha", name = "p", descriptor = "[Z")
	public final boolean[] aBooleanArray56;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub55(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt10567 = arg0;
		@Pc(11) Class3_Sub25 local11 = new Class3_Sub25(arg1);
		this.anInt10570 = local11.method8632();
		this.anIntArrayArray66 = new int[this.anInt10570][];
		this.anIntArray934 = new int[this.anInt10570];
		this.anIntArray935 = new int[this.anInt10570];
		this.aBooleanArray56 = new boolean[this.anInt10570];
		for (@Pc(38) int local38 = 0; local38 < this.anInt10570; local38++) {
			this.anIntArray935[local38] = local11.method8632();
			if (this.anIntArray935[local38] == 6) {
				this.anIntArray935[local38] = 2;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt10570; local65++) {
			this.aBooleanArray56[local65] = local11.method8632() == 1;
		}
		for (@Pc(86) int local86 = 0; local86 < this.anInt10570; local86++) {
			this.anIntArray934[local86] = local11.method8593();
		}
		for (@Pc(106) int local106 = 0; local106 < this.anInt10570; local106++) {
			this.anIntArrayArray66[local106] = new int[local11.method8632()];
		}
		for (@Pc(123) int local123 = 0; local123 < this.anInt10570; local123++) {
			for (@Pc(127) int local127 = 0; local127 < this.anIntArrayArray66[local123].length; local127++) {
				this.anIntArrayArray66[local123][local127] = local11.method8632();
			}
		}
	}
}
