import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
	private int anInt1877;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "Z")
	private boolean aBoolean78;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(33) int[] local33 = this.method2904(0, arg0 - 1 & Static169.anInt3754);
			@Pc(39) int[] local39 = this.method2904(0, arg0);
			@Pc(49) int[] local49 = this.method2904(0, arg0 + 1 & Static169.anInt3754);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static141.anInt3261; local63++) {
				@Pc(77) int local77 = this.anInt1877 * (local49[local63] - local33[local63]);
				@Pc(97) int local97 = (local39[local63 + 1 & Static67.anInt1764] - local39[Static67.anInt1764 & local63 - 1]) * this.anInt1877;
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((local117 + local111 + 4096) / 4096)) * 4096.0D);
				@Pc(139) int local139;
				@Pc(147) int local147;
				@Pc(143) int local143;
				if (local130 == 0) {
					local143 = 0;
					local139 = 0;
					local147 = 0;
				} else {
					local139 = local97 / local130;
					local143 = 16777216 / local130;
					local147 = local77 / local130;
				}
				if (this.aBoolean78) {
					local139 = (local139 >> 1) + 2048;
					local147 = (local147 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
				}
				local53[local63] = local139;
				local57[local63] = local147;
				local61[local63] = local143;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt1877 = arg1.method208();
		} else if (arg0 == 1) {
			this.aBoolean78 = arg1.method191() == 1;
		}
	}
}
