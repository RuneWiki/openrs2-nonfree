import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!en", name = "n", descriptor = "I")
	public final int anInt2831;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "I")
	public final int anInt2833;

	@OriginalMember(owner = "client!en", name = "r", descriptor = "[I")
	public final int[] anIntArray136;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "[Z")
	public final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!en", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!en", name = "q", descriptor = "[I")
	public final int[] anIntArray135;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2831 = arg0;
		@Pc(11) Class3_Sub28 local11 = new Class3_Sub28(arg1);
		this.anInt2833 = local11.method5322(-17);
		this.anIntArray136 = new int[this.anInt2833];
		this.aBooleanArray8 = new boolean[this.anInt2833];
		this.anIntArrayArray15 = new int[this.anInt2833][];
		this.anIntArray135 = new int[this.anInt2833];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2833; local38++) {
			this.anIntArray135[local38] = local11.method5322(-93);
			if (this.anIntArray135[local38] == 6) {
				this.anIntArray135[local38] = 2;
			}
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt2833; local73++) {
			this.aBooleanArray8[local73] = local11.method5322(-26) == 1;
		}
		for (@Pc(105) int local105 = 0; local105 < this.anInt2833; local105++) {
			this.anIntArray136[local105] = local11.method5272();
		}
		for (@Pc(125) int local125 = 0; local125 < this.anInt2833; local125++) {
			this.anIntArrayArray15[local125] = new int[local11.method5322(-92)];
		}
		for (@Pc(150) int local150 = 0; local150 < this.anInt2833; local150++) {
			for (@Pc(156) int local156 = 0; local156 < this.anIntArrayArray15[local150].length; local156++) {
				this.anIntArrayArray15[local150][local156] = local11.method5322(-109);
			}
		}
	}
}
