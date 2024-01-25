import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
	public final int anInt5802;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
	public final int anInt5801;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "[I")
	public final int[] anIntArray473;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "[I")
	public final int[] anIntArray472;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "[Z")
	public final boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5802 = arg0;
		@Pc(11) Class3_Sub4 local11 = new Class3_Sub4(arg1);
		this.anInt5801 = local11.method3643();
		this.anIntArray473 = new int[this.anInt5801];
		this.anIntArray472 = new int[this.anInt5801];
		this.aBooleanArray28 = new boolean[this.anInt5801];
		this.anIntArrayArray55 = new int[this.anInt5801][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt5801; local38++) {
			this.anIntArray473[local38] = local11.method3643();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt5801; local58++) {
			this.aBooleanArray28[local58] = local11.method3643() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt5801; local81++) {
			this.anIntArray472[local81] = local11.method3649();
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt5801; local97++) {
			this.anIntArrayArray55[local97] = new int[local11.method3643()];
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt5801; local114++) {
			for (@Pc(118) int local118 = 0; local118 < this.anIntArrayArray55[local114].length; local118++) {
				this.anIntArrayArray55[local114][local118] = local11.method3643();
			}
		}
	}
}
