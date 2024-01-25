import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class11 {

	@OriginalMember(owner = "client!aga", name = "k", descriptor = "[I")
	private final int[] anIntArray31;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "[I")
	private final int[] anIntArray37;

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "[I")
	private final int[] anIntArray32;

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "[I")
	private final int[] anIntArray36;

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "[I")
	private final int[] anIntArray35;

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "[I")
	private final int[] anIntArray33;

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "[I")
	private final int[] anIntArray34;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class11(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(7) int local7 = arg0.method2054();
		this.anIntArray31 = new int[local7];
		this.anIntArray37 = new int[local7];
		this.anIntArray32 = new int[local7];
		this.anIntArray36 = new int[local7];
		this.anIntArray35 = new int[local7];
		this.anIntArray33 = new int[local7];
		this.anIntArray34 = new int[local7];
		for (@Pc(37) int local37 = 0; local37 < local7; local37++) {
			this.anIntArray31[local37] = arg0.method2028(-14795) - 5120;
			this.anIntArray34[local37] = arg0.method2028(-14795) - 5120;
			this.anIntArray35[local37] = arg0.method2017();
			this.anIntArray32[local37] = arg0.method2028(-14795) - 5120;
			this.anIntArray33[local37] = arg0.method2028(-14795) - 5120;
			this.anIntArray36[local37] = arg0.method2017();
			this.anIntArray37[local37] = arg0.method2017();
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)V")
	public void method501(@OriginalArg(1) int arg0) {
		@Pc(22) int[][] local22 = new int[this.anIntArray31.length << 1][4];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray31.length; local24++) {
			local22[local24 * 2][0] = this.anIntArray31[local24];
			local22[local24 * 2][1] = this.anIntArray35[local24];
			local22[local24 * 2][2] = this.anIntArray34[local24];
			local22[local24 * 2][3] = this.anIntArray37[local24];
			local22[local24 * 2 + 1][0] = this.anIntArray32[local24];
			local22[local24 * 2 + 1][1] = this.anIntArray36[local24];
			local22[local24 * 2 + 1][2] = this.anIntArray33[local24];
			local22[local24 * 2 + 1][3] = this.anIntArray37[local24];
		}
		Static269.anIntArrayArrayArray5[arg0] = local22;
	}
}
