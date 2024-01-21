import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ca", name = "bb", descriptor = "Z")
	private boolean aBoolean21;

	@OriginalMember(owner = "client!ca", name = "ab", descriptor = "I")
	private int anInt588;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(31) int[] local31 = this.method3401(arg0 - 1 & Static14.anInt436, 0);
			@Pc(37) int[] local37 = this.method3401(arg0, 0);
			@Pc(47) int[] local47 = this.method3401(Static14.anInt436 & arg0 + 1, 0);
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[0];
			@Pc(59) int[] local59 = local11[2];
			for (@Pc(61) int local61 = 0; local61 < Static22.anInt596; local61++) {
				@Pc(75) int local75 = this.anInt588 * (local47[local61] - local31[local61]);
				@Pc(95) int local95 = this.anInt588 * (local37[local61 + 1 & Static28.anInt833] - local37[Static28.anInt833 & local61 - 1]);
				@Pc(99) int local99 = local95 >> 12;
				@Pc(105) int local105 = local99 * local99 >> 12;
				@Pc(109) int local109 = local75 >> 12;
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((local115 + local105 + 4096) / 4096)) * 4096.0D);
				@Pc(132) int local132;
				@Pc(134) int local134;
				@Pc(136) int local136;
				if (local128 == 0) {
					local132 = 0;
					local134 = 0;
					local136 = 0;
				} else {
					local132 = local95 / local128;
					local136 = 16777216 / local128;
					local134 = local75 / local128;
				}
				if (this.aBoolean21) {
					local134 = (local134 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
				}
				local55[local61] = local132;
				local51[local61] = local134;
				local59[local61] = local136;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt588 = arg1.method1280();
		} else if (arg0 == 1) {
			this.aBoolean21 = arg1.method1234() == 1;
		}
	}
}
