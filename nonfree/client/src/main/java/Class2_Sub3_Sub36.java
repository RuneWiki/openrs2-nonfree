import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class2_Sub3_Sub36 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ug", name = "T", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
	private int anInt3667;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt3667 = arg1.method2933();
		} else if (arg0 == 1) {
			this.aBoolean154 = arg1.method2962() == 1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(30) int[] local30 = this.method3011(arg0 - 1 & Static134.anInt2915, 0);
			@Pc(36) int[] local36 = this.method3011(arg0, 0);
			@Pc(48) int[] local48 = this.method3011(arg0 + 1 & Static134.anInt2915, 0);
			@Pc(52) int[] local52 = local16[0];
			@Pc(56) int[] local56 = local16[1];
			@Pc(60) int[] local60 = local16[2];
			for (@Pc(62) int local62 = 0; local62 < Static53.anInt1184; local62++) {
				@Pc(76) int local76 = (local48[local62] - local30[local62]) * this.anInt3667;
				@Pc(96) int local96 = this.anInt3667 * (local36[local62 + 1 & Static27.anInt588] - local36[local62 - 1 & Static27.anInt588]);
				@Pc(100) int local100 = local96 >> 12;
				@Pc(106) int local106 = local100 * local100 >> 12;
				@Pc(110) int local110 = local76 >> 12;
				@Pc(116) int local116 = local110 * local110 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((local106 + local116 + 4096) / 4096)) * 4096.0D);
				@Pc(140) int local140;
				@Pc(144) int local144;
				@Pc(136) int local136;
				if (local130 == 0) {
					local140 = 0;
					local144 = 0;
					local136 = 0;
				} else {
					local136 = 16777216 / local130;
					local140 = local96 / local130;
					local144 = local76 / local130;
				}
				if (this.aBoolean154) {
					local140 = (local140 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
				}
				local52[local62] = local140;
				local56[local62] = local144;
				local60[local62] = local136;
			}
		}
		return local16;
	}
}
