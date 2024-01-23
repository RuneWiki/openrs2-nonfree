import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
	private int anInt6147 = 4096;

	@OriginalMember(owner = "client!wc", name = "Z", descriptor = "Z")
	private boolean aBoolean327 = true;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(34) int[] local34 = this.method4746(0, arg0 - 1 & Static178.anInt4007);
			@Pc(40) int[] local40 = this.method4746(0, arg0);
			@Pc(50) int[] local50 = this.method4746(0, Static178.anInt4007 & arg0 + 1);
			@Pc(54) int[] local54 = local19[2];
			@Pc(58) int[] local58 = local19[1];
			@Pc(62) int[] local62 = local19[0];
			for (@Pc(64) int local64 = 0; local64 < Static75.anInt1848; local64++) {
				@Pc(83) int local83 = this.anInt6147 * (local50[local64] - local34[local64]);
				@Pc(102) int local102 = this.anInt6147 * (local40[Static145.anInt3482 & local64 + 1] - local40[Static145.anInt3482 & local64 - 1]);
				@Pc(106) int local106 = local83 >> 12;
				@Pc(110) int local110 = local102 >> 12;
				@Pc(116) int local116 = local110 * local110 >> 12;
				@Pc(122) int local122 = local106 * local106 >> 12;
				@Pc(136) int local136 = (int) (Math.sqrt((double) ((float) (local122 + local116 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(145) int local145;
				@Pc(153) int local153;
				@Pc(149) int local149;
				if (local136 == 0) {
					local149 = 0;
					local153 = 0;
					local145 = 0;
				} else {
					local145 = local102 / local136;
					local149 = 16777216 / local136;
					local153 = local83 / local136;
				}
				if (this.aBoolean327) {
					local153 = (local153 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
					local149 = (local149 >> 1) + 2048;
				}
				local62[local64] = local145;
				local58[local64] = local153;
				local54[local64] = local149;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6147 = arg0.method2652();
		} else if (arg1 == 1) {
			this.aBoolean327 = arg0.method2655() == 1;
		}
	}
}
