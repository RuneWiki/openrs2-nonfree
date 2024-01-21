import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ac", name = "ob", descriptor = "Z")
	private boolean aBoolean6;

	@OriginalMember(owner = "client!ac", name = "nb", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt151 = arg1.method1680();
		} else if (arg0 == 1) {
			this.aBoolean6 = arg1.method1698() == 1;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(25) int[] local25 = this.method2901(0, Static1.anInt2959 & arg0 - 1);
			@Pc(31) int[] local31 = this.method2901(0, arg0);
			@Pc(41) int[] local41 = this.method2901(0, arg0 + 1 & Static1.anInt2959);
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static54.anInt1423; local55++) {
				@Pc(69) int local69 = (local41[local55] - local25[local55]) * this.anInt151;
				@Pc(89) int local89 = (local31[local55 + 1 & Static73.anInt1916] - local31[Static73.anInt1916 & local55 - 1]) * this.anInt151;
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local97 * local97 >> 12;
				@Pc(109) int local109 = local93 * local93 >> 12;
				@Pc(122) int local122 = (int) (Math.sqrt((double) ((local103 + local109 + 4096) / 4096)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(128) int local128;
				@Pc(132) int local132;
				if (local122 == 0) {
					local132 = 0;
					local128 = 0;
					local136 = 0;
				} else {
					local128 = local69 / local122;
					local132 = 16777216 / local122;
					local136 = local89 / local122;
				}
				if (this.aBoolean6) {
					local128 = (local128 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
				}
				local49[local55] = local136;
				local45[local55] = local128;
				local53[local55] = local132;
			}
		}
		return local11;
	}
}
