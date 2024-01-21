import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!ad", name = "db", descriptor = "Z")
	private boolean aBoolean5;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt122 = arg1.method1510();
		} else if (arg0 == 1) {
			this.aBoolean5 = arg1.method1545() == 1;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(33) int[] local33 = this.method3120(0, arg0 - 1 & Static106.anInt2755);
			@Pc(39) int[] local39 = this.method3120(0, arg0);
			@Pc(49) int[] local49 = this.method3120(0, arg0 + 1 & Static106.anInt2755);
			@Pc(53) int[] local53 = local11[1];
			@Pc(57) int[] local57 = local11[0];
			@Pc(61) int[] local61 = local11[2];
			for (@Pc(63) int local63 = 0; local63 < Static129.anInt3285; local63++) {
				@Pc(77) int local77 = (local49[local63] - local33[local63]) * this.anInt122;
				@Pc(97) int local97 = (local39[Static105.anInt2733 & local63 + 1] - local39[local63 - 1 & Static105.anInt2733]) * this.anInt122;
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((local111 + local117 + 4096) / 4096)) * 4096.0D);
				@Pc(139) int local139;
				@Pc(137) int local137;
				@Pc(141) int local141;
				if (local130 == 0) {
					local137 = 0;
					local139 = 0;
					local141 = 0;
				} else {
					local141 = 16777216 / local130;
					local139 = local97 / local130;
					local137 = local77 / local130;
				}
				if (this.aBoolean5) {
					local141 = (local141 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
				}
				local57[local63] = local139;
				local53[local63] = local137;
				local61[local63] = local141;
			}
		}
		return local11;
	}
}
