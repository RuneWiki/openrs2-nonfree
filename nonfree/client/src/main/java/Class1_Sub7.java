import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "I")
	public final int anInt1413;

	@OriginalMember(owner = "client!cda", name = "t", descriptor = "I")
	public final int anInt1416;

	@OriginalMember(owner = "client!cda", name = "m", descriptor = "[[I")
	public final int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!cda", name = "r", descriptor = "[I")
	public final int[] anIntArray96;

	@OriginalMember(owner = "client!cda", name = "p", descriptor = "[I")
	public final int[] anIntArray95;

	@OriginalMember(owner = "client!cda", name = "s", descriptor = "[Z")
	public final boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1413 = arg0;
		@Pc(11) Class1_Sub17 local11 = new Class1_Sub17(arg1);
		this.anInt1416 = local11.method4487();
		this.anIntArrayArray11 = new int[this.anInt1416][];
		this.anIntArray96 = new int[this.anInt1416];
		this.anIntArray95 = new int[this.anInt1416];
		this.aBooleanArray1 = new boolean[this.anInt1416];
		for (@Pc(38) int local38 = 0; local38 < this.anInt1416; local38++) {
			this.anIntArray96[local38] = local11.method4487();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt1416; local58++) {
			this.aBooleanArray1[local58] = local11.method4487() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt1416; local81++) {
			this.anIntArray95[local81] = local11.method4494();
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt1416; local97++) {
			this.anIntArrayArray11[local97] = new int[local11.method4487()];
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt1416; local114++) {
			for (@Pc(118) int local118 = 0; local118 < this.anIntArrayArray11[local114].length; local118++) {
				this.anIntArrayArray11[local114][local118] = local11.method4487();
			}
		}
	}
}
