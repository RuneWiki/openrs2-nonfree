import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class6_Sub4_Sub22 extends Class6_Sub4 {

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "Z")
	private boolean aBoolean427 = true;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
	private int anInt6049 = 4096;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(33) int[] local33 = this.method7748(0, arg0 - 1 & Static457.anInt7873);
			@Pc(39) int[] local39 = this.method7748(0, arg0);
			@Pc(49) int[] local49 = this.method7748(0, arg0 + 1 & Static457.anInt7873);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static408.anInt7209; local63++) {
				@Pc(76) int local76 = (local49[local63] - local33[local63]) * this.anInt6049;
				@Pc(96) int local96 = this.anInt6049 * (local39[Static368.anInt6505 & local63 + 1] - local39[local63 - 1 & Static368.anInt6505]);
				@Pc(100) int local100 = local96 >> 12;
				@Pc(104) int local104 = local76 >> 12;
				@Pc(110) int local110 = local100 * local100 >> 12;
				@Pc(116) int local116 = local104 * local104 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((float) (local116 + local110 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(144) int local144;
				@Pc(140) int local140;
				if (local130 == 0) {
					local136 = 0;
					local144 = 0;
					local140 = 0;
				} else {
					local136 = local96 / local130;
					local140 = 16777216 / local130;
					local144 = local76 / local130;
				}
				if (this.aBoolean427) {
					local136 = (local136 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
				}
				local53[local63] = local136;
				local57[local63] = local144;
				local61[local63] = local140;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt6049 = arg1.method6003();
		} else if (arg0 == 1) {
			this.aBoolean427 = arg1.method6069() == 1;
		}
	}
}
