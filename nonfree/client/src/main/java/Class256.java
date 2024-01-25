import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class256 {

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
	private final int[] anIntArray485;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "[I")
	private final int[] anIntArray481;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "[I")
	private final int[] anIntArray487;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "[I")
	private final int[] anIntArray483;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "[I")
	private final int[] anIntArray482;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "[I")
	private final int[] anIntArray488;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "[I")
	private final int[] anIntArray486;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class256(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method8592(255);
		this.anIntArray485 = new int[local7];
		this.anIntArray481 = new int[local7];
		this.anIntArray487 = new int[local7];
		this.anIntArray483 = new int[local7];
		this.anIntArray482 = new int[local7];
		this.anIntArray488 = new int[local7];
		this.anIntArray486 = new int[local7];
		for (@Pc(37) int local37 = 0; local37 < local7; local37++) {
			this.anIntArray486[local37] = arg0.method8575() - 5120;
			this.anIntArray481[local37] = arg0.method8575() - 5120;
			this.anIntArray482[local37] = arg0.method8598();
			this.anIntArray487[local37] = arg0.method8575() - 5120;
			this.anIntArray483[local37] = arg0.method8575() - 5120;
			this.anIntArray488[local37] = arg0.method8598();
			this.anIntArray485[local37] = arg0.method8598();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
	public void method6148(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = new int[this.anIntArray486.length << 1][4];
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray486.length; local15++) {
			local13[local15 * 2][0] = this.anIntArray486[local15];
			local13[local15 * 2][1] = this.anIntArray482[local15];
			local13[local15 * 2][2] = this.anIntArray481[local15];
			local13[local15 * 2][3] = this.anIntArray485[local15];
			local13[local15 * 2 + 1][0] = this.anIntArray487[local15];
			local13[local15 * 2 + 1][1] = this.anIntArray488[local15];
			local13[local15 * 2 + 1][2] = this.anIntArray483[local15];
			local13[local15 * 2 + 1][3] = this.anIntArray485[local15];
		}
		Static182.anIntArrayArrayArray27[arg0] = local13;
	}
}
