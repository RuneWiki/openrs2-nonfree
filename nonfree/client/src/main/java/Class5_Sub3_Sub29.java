import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class5_Sub3_Sub29 extends Class5_Sub3 {

	@OriginalMember(owner = "client!sba", name = "N", descriptor = "I")
	private int anInt8565 = 4096;

	@OriginalMember(owner = "client!sba", name = "H", descriptor = "Z")
	private boolean aBoolean563 = true;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8565 = arg0.method7333();
		} else if (arg1 == 1) {
			this.aBoolean563 = arg0.method7291() == 1;
		}
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(34) int[] local34 = this.method9205(arg0 - 1 & Static652.anInt10663, 0);
			@Pc(42) int[] local42 = this.method9205(arg0, 0);
			@Pc(54) int[] local54 = this.method9205(Static652.anInt10663 & arg0 + 1, 0);
			@Pc(58) int[] local58 = local18[0];
			@Pc(62) int[] local62 = local18[1];
			@Pc(66) int[] local66 = local18[2];
			for (@Pc(68) int local68 = 0; local68 < Static7.anInt102; local68++) {
				@Pc(82) int local82 = this.anInt8565 * (local54[local68] - local34[local68]);
				@Pc(102) int local102 = this.anInt8565 * (local42[Static517.anInt8205 & local68 + 1] - local42[local68 - 1 & Static517.anInt8205]);
				@Pc(106) int local106 = local102 >> 12;
				@Pc(110) int local110 = local82 >> 12;
				@Pc(116) int local116 = local106 * local106 >> 12;
				@Pc(122) int local122 = local110 * local110 >> 12;
				@Pc(136) int local136 = (int) (Math.sqrt((double) ((float) (local122 + local116 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(140) int local140;
				@Pc(144) int local144;
				@Pc(142) int local142;
				if (local136 == 0) {
					local140 = 0;
					local142 = 0;
					local144 = 0;
				} else {
					local144 = local82 / local136;
					local140 = local102 / local136;
					local142 = 16777216 / local136;
				}
				if (this.aBoolean563) {
					local140 = (local140 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local142 = (local142 >> 1) + 2048;
				}
				local58[local68] = local140;
				local62[local68] = local144;
				local66[local68] = local142;
			}
		}
		return local18;
	}
}
