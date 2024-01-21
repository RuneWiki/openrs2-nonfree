import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub5_Sub25 extends Class1_Sub5 {

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
	private int anInt2808;

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "Z")
	private boolean aBoolean110;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(33) int[] local33 = this.method3145(0, Static151.anInt3420 & arg0 - 1);
			@Pc(39) int[] local39 = this.method3145(0, arg0);
			@Pc(49) int[] local49 = this.method3145(0, arg0 + 1 & Static151.anInt3420);
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local19[0];
			@Pc(61) int[] local61 = local19[1];
			for (@Pc(63) int local63 = 0; local63 < Static177.anInt4018; local63++) {
				@Pc(77) int local77 = (local49[local63] - local33[local63]) * this.anInt2808;
				@Pc(97) int local97 = this.anInt2808 * (local39[local63 + 1 & Static47.anInt1130] - local39[local63 - 1 & Static47.anInt1130]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((local117 + local111 + 4096) / 4096)) * 4096.0D);
				@Pc(147) int local147;
				@Pc(143) int local143;
				@Pc(139) int local139;
				if (local130 == 0) {
					local139 = 0;
					local143 = 0;
					local147 = 0;
				} else {
					local139 = 16777216 / local130;
					local143 = local77 / local130;
					local147 = local97 / local130;
				}
				if (this.aBoolean110) {
					local147 = (local147 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
				}
				local57[local63] = local147;
				local61[local63] = local143;
				local53[local63] = local139;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2808 = arg0.method359();
		} else if (arg1 == 1) {
			this.aBoolean110 = arg0.method336() == 1;
		}
	}
}
