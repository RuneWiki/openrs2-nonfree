import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class6_Sub5_Sub5 extends Class6_Sub5 {

	@OriginalMember(owner = "client!cn", name = "L", descriptor = "I")
	private int anInt1460 = 4096;

	@OriginalMember(owner = "client!cn", name = "S", descriptor = "Z")
	private boolean aBoolean116 = true;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(34) int[] local34 = this.method6543(0, arg0 - 1 & Static52.anInt1464);
			@Pc(40) int[] local40 = this.method6543(0, arg0);
			@Pc(50) int[] local50 = this.method6543(0, arg0 + 1 & Static52.anInt1464);
			@Pc(54) int[] local54 = local11[0];
			@Pc(58) int[] local58 = local11[1];
			@Pc(62) int[] local62 = local11[2];
			for (@Pc(64) int local64 = 0; local64 < Static240.anInt4386; local64++) {
				@Pc(77) int local77 = (local50[local64] - local34[local64]) * this.anInt1460;
				@Pc(97) int local97 = this.anInt1460 * (local40[local64 + 1 & Static408.anInt7338] - local40[local64 - 1 & Static408.anInt7338]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local117 + local111 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(137) int local137;
				@Pc(135) int local135;
				@Pc(139) int local139;
				if (local131 == 0) {
					local135 = 0;
					local137 = 0;
					local139 = 0;
				} else {
					local137 = local97 / local131;
					local139 = 16777216 / local131;
					local135 = local77 / local131;
				}
				if (this.aBoolean116) {
					local135 = (local135 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local54[local64] = local137;
				local58[local64] = local135;
				local62[local64] = local139;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt1460 = arg1.method6485();
		} else if (arg0 == 1) {
			this.aBoolean116 = arg1.method6433() == 1;
		}
	}
}
