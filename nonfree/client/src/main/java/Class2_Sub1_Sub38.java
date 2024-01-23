import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class2_Sub1_Sub38 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
	private int anInt5623 = 4096;

	@OriginalMember(owner = "client!ui", name = "R", descriptor = "Z")
	private boolean aBoolean370 = true;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(33) int[] local33 = this.method4601(arg0 - 1 & Static107.anInt2459, 0);
			@Pc(39) int[] local39 = this.method4601(arg0, 0);
			@Pc(49) int[] local49 = this.method4601(arg0 + 1 & Static107.anInt2459, 0);
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[0];
			for (@Pc(63) int local63 = 0; local63 < Static281.anInt5558; local63++) {
				@Pc(81) int local81 = this.anInt5623 * (local49[local63] - local33[local63]);
				@Pc(85) int local85 = local81 >> 12;
				@Pc(105) int local105 = (local39[Static226.anInt6054 & local63 + 1] - local39[Static226.anInt6054 & local63 - 1]) * this.anInt5623;
				@Pc(109) int local109 = local105 >> 12;
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(121) int local121 = local85 * local85 >> 12;
				@Pc(136) int local136 = (int) (Math.sqrt((double) ((float) (local115 + local121 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(143) int local143;
				@Pc(147) int local147;
				@Pc(145) int local145;
				if (local136 == 0) {
					local143 = 0;
					local145 = 0;
					local147 = 0;
				} else {
					local145 = 16777216 / local136;
					local143 = local105 / local136;
					local147 = local81 / local136;
				}
				if (this.aBoolean370) {
					local145 = (local145 >> 1) + 2048;
					local147 = (local147 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
				}
				local61[local63] = local143;
				local57[local63] = local147;
				local53[local63] = local145;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5623 = arg0.method2130();
		} else if (arg1 == 1) {
			this.aBoolean370 = arg0.method2146() == 1;
		}
	}
}
