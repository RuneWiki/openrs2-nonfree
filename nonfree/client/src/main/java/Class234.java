import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class234 {

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "[I")
	private final int[] anIntArray365;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "[I")
	private final int[] anIntArray364;

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "[I")
	private final int[] anIntArray363;

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "[I")
	private final int[] anIntArray367;

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "[I")
	private final int[] anIntArray366;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "[I")
	private final int[] anIntArray369;

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "[I")
	private final int[] anIntArray368;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class234(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(7) int local7 = arg0.method5331();
		this.anIntArray365 = new int[local7];
		this.anIntArray364 = new int[local7];
		this.anIntArray363 = new int[local7];
		this.anIntArray367 = new int[local7];
		this.anIntArray366 = new int[local7];
		this.anIntArray369 = new int[local7];
		this.anIntArray368 = new int[local7];
		for (@Pc(37) int local37 = 0; local37 < local7; local37++) {
			this.anIntArray369[local37] = arg0.method5272() - 5120;
			this.anIntArray365[local37] = arg0.method5272() - 5120;
			this.anIntArray366[local37] = arg0.method5281();
			this.anIntArray367[local37] = arg0.method5272() - 5120;
			this.anIntArray363[local37] = arg0.method5272() - 5120;
			this.anIntArray364[local37] = arg0.method5281();
			this.anIntArray368[local37] = arg0.method5281();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BI)V")
	public void method5700(@OriginalArg(1) int arg0) {
		@Pc(22) int[][] local22 = new int[this.anIntArray369.length << 1][4];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray369.length; local24++) {
			local22[local24 * 2][0] = this.anIntArray369[local24];
			local22[local24 * 2][1] = this.anIntArray366[local24];
			local22[local24 * 2][2] = this.anIntArray365[local24];
			local22[local24 * 2][3] = this.anIntArray368[local24];
			local22[local24 * 2 + 1][0] = this.anIntArray367[local24];
			local22[local24 * 2 + 1][1] = this.anIntArray364[local24];
			local22[local24 * 2 + 1][2] = this.anIntArray363[local24];
			local22[local24 * 2 + 1][3] = this.anIntArray368[local24];
		}
		Static367.anIntArrayArrayArray5[arg0] = local22;
	}
}
