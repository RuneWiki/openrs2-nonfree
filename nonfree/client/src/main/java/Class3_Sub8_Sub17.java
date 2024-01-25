import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class3_Sub8_Sub17 extends Class3_Sub8 {

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "Z")
	private boolean aBoolean357 = true;

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
	private int anInt5503 = 4096;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt5503 = arg1.method7951();
		} else if (arg0 == 1) {
			this.aBoolean357 = arg1.method7954() == 1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(33) int[] local33 = this.method8776(Static635.anInt10496 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method8776(arg0, 0);
			@Pc(49) int[] local49 = this.method8776(Static635.anInt10496 & arg0 + 1, 0);
			@Pc(53) int[] local53 = local11[0];
			@Pc(57) int[] local57 = local11[1];
			@Pc(61) int[] local61 = local11[2];
			for (@Pc(63) int local63 = 0; local63 < Static91.anInt1849; local63++) {
				@Pc(77) int local77 = (local49[local63] - local33[local63]) * this.anInt5503;
				@Pc(97) int local97 = this.anInt5503 * (local39[Static348.anInt5973 & local63 + 1] - local39[Static348.anInt5973 & local63 - 1]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local117 + local111 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(148) int local148;
				@Pc(144) int local144;
				@Pc(140) int local140;
				if (local131 == 0) {
					local148 = 0;
					local140 = 0;
					local144 = 0;
				} else {
					local140 = 16777216 / local131;
					local144 = local77 / local131;
					local148 = local97 / local131;
				}
				if (this.aBoolean357) {
					local148 = (local148 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
				}
				local53[local63] = local148;
				local57[local63] = local144;
				local61[local63] = local140;
			}
		}
		return local11;
	}
}
