import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class2_Sub2_Sub26 extends Class2_Sub2 {

	@OriginalMember(owner = "client!og", name = "P", descriptor = "I")
	private int anInt2669;

	@OriginalMember(owner = "client!og", name = "bb", descriptor = "Z")
	private boolean aBoolean117;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(30) int[] local30 = this.method2573(Static75.anInt1778 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method2573(arg0, 0);
			@Pc(46) int[] local46 = this.method2573(Static75.anInt1778 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static149.anInt3233; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt2669;
				@Pc(78) int local78 = local74 >> 12;
				@Pc(84) int local84 = local78 * local78 >> 12;
				@Pc(103) int local103 = (local36[local60 + 1 & Static145.anInt2636] - local36[Static145.anInt2636 & local60 - 1]) * this.anInt2669;
				@Pc(107) int local107 = local103 >> 12;
				@Pc(113) int local113 = local107 * local107 >> 12;
				@Pc(126) int local126 = (int) (Math.sqrt((double) ((local84 + local113 + 4096) / 4096)) * 4096.0D);
				@Pc(133) int local133;
				@Pc(135) int local135;
				@Pc(137) int local137;
				if (local126 == 0) {
					local133 = 0;
					local135 = 0;
					local137 = 0;
				} else {
					local135 = local74 / local126;
					local137 = 16777216 / local126;
					local133 = local103 / local126;
				}
				if (this.aBoolean117) {
					local137 = (local137 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
				}
				local50[local60] = local133;
				local54[local60] = local135;
				local58[local60] = local137;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2669 = arg1.method1456();
		} else if (arg0 == 1) {
			this.aBoolean117 = arg1.method1461() == 1;
		}
	}
}
