import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class4_Sub3_Sub13 extends Class4_Sub3 {

	@OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
	private int anInt1455;

	@OriginalMember(owner = "client!gf", name = "db", descriptor = "Z")
	private boolean aBoolean69;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1455 = arg1.method1252();
		} else if (arg0 == 1) {
			this.aBoolean69 = arg1.method1253() == 1;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(25) int[] local25 = this.method3149(arg0 - 1 & Static5.anInt216, 0);
			@Pc(31) int[] local31 = this.method3149(arg0, 0);
			@Pc(41) int[] local41 = this.method3149(Static5.anInt216 & arg0 + 1, 0);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static134.anInt3188; local55++) {
				@Pc(69) int local69 = (local41[local55] - local25[local55]) * this.anInt1455;
				@Pc(89) int local89 = (local31[Static2.anInt80 & local55 + 1] - local31[Static2.anInt80 & local55 - 1]) * this.anInt1455;
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((local103 + local109 + 4096) / 4096)) * 4096.0D);
				@Pc(134) int local134;
				@Pc(130) int local130;
				@Pc(132) int local132;
				if (local123 == 0) {
					local130 = 0;
					local132 = 0;
					local134 = 0;
				} else {
					local130 = local69 / local123;
					local134 = local89 / local123;
					local132 = 16777216 / local123;
				}
				if (this.aBoolean69) {
					local134 = (local134 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
					local130 = (local130 >> 1) + 2048;
				}
				local45[local55] = local134;
				local49[local55] = local130;
				local53[local55] = local132;
			}
		}
		return local11;
	}
}
