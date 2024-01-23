import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class2_Sub2_Sub32 extends Class2_Sub2 {

	@OriginalMember(owner = "client!s", name = "S", descriptor = "I")
	private int anInt4229 = 4096;

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "Z")
	private boolean aBoolean182 = true;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(30) int[] local30 = this.method3955(0, Static156.anInt3604 & arg0 - 1);
			@Pc(36) int[] local36 = this.method3955(0, arg0);
			@Pc(46) int[] local46 = this.method3955(0, arg0 + 1 & Static156.anInt3604);
			@Pc(50) int[] local50 = local16[1];
			@Pc(54) int[] local54 = local16[0];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static54.anInt953; local60++) {
				@Pc(73) int local73 = (local46[local60] - local30[local60]) * this.anInt4229;
				@Pc(77) int local77 = local73 >> 12;
				@Pc(97) int local97 = this.anInt4229 * (local36[Static74.anInt1601 & local60 + 1] - local36[local60 - 1 & Static74.anInt1601]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(107) int local107 = local101 * local101 >> 12;
				@Pc(113) int local113 = local77 * local77 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local107 + local113 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133;
				@Pc(137) int local137;
				@Pc(141) int local141;
				if (local127 == 0) {
					local137 = 0;
					local133 = 0;
					local141 = 0;
				} else {
					local133 = local97 / local127;
					local137 = local73 / local127;
					local141 = 16777216 / local127;
				}
				if (this.aBoolean182) {
					local141 = (local141 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local54[local60] = local133;
				local50[local60] = local137;
				local58[local60] = local141;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4229 = arg0.method2095();
		} else if (arg1 == 1) {
			this.aBoolean182 = arg0.method2122() == 1;
		}
	}
}
