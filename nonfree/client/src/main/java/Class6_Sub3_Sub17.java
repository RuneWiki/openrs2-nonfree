import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class6_Sub3_Sub17 extends Class6_Sub3 {

	@OriginalMember(owner = "client!gba", name = "G", descriptor = "Z")
	private boolean aBoolean238 = true;

	@OriginalMember(owner = "client!gba", name = "L", descriptor = "I")
	private int anInt3050 = 4096;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(30) int[] local30 = this.method7950(0, arg0 - 1 & Static132.anInt2511);
			@Pc(36) int[] local36 = this.method7950(0, arg0);
			@Pc(46) int[] local46 = this.method7950(0, arg0 + 1 & Static132.anInt2511);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static35.anInt670; local60++) {
				@Pc(73) int local73 = this.anInt3050 * (local46[local60] - local30[local60]);
				@Pc(93) int local93 = (local36[Static147.anInt2781 & local60 + 1] - local36[local60 - 1 & Static147.anInt2781]) * this.anInt3050;
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local73 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local113 + local107 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133;
				@Pc(137) int local137;
				@Pc(141) int local141;
				if (local127 == 0) {
					local133 = 0;
					local141 = 0;
					local137 = 0;
				} else {
					local133 = local93 / local127;
					local137 = local73 / local127;
					local141 = 16777216 / local127;
				}
				if (this.aBoolean238) {
					local137 = (local137 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
				}
				local50[local60] = local133;
				local54[local60] = local137;
				local58[local60] = local141;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt3050 = arg1.method6044();
		} else if (arg0 == 1) {
			this.aBoolean238 = arg1.method6019() == 1;
		}
	}
}
