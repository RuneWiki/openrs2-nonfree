import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class5_Sub2_Sub19 extends Class5_Sub2 {

	@OriginalMember(owner = "client!mi", name = "K", descriptor = "Z")
	private boolean aBoolean421 = true;

	@OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
	private int anInt5802 = 4096;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(33) int[] local33 = this.method9042(Static273.anInt4903 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method9042(arg0, 0);
			@Pc(49) int[] local49 = this.method9042(arg0 + 1 & Static273.anInt4903, 0);
			@Pc(53) int[] local53 = local11[0];
			@Pc(57) int[] local57 = local11[1];
			@Pc(61) int[] local61 = local11[2];
			for (@Pc(63) int local63 = 0; local63 < Static597.anInt10025; local63++) {
				@Pc(77) int local77 = this.anInt5802 * (local49[local63] - local33[local63]);
				@Pc(96) int local96 = this.anInt5802 * (local39[local63 + 1 & Static28.anInt365] - local39[Static28.anInt365 & local63 - 1]);
				@Pc(100) int local100 = local96 >> 12;
				@Pc(104) int local104 = local77 >> 12;
				@Pc(110) int local110 = local100 * local100 >> 12;
				@Pc(116) int local116 = local104 * local104 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((float) (local110 + local116 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(140) int local140;
				@Pc(144) int local144;
				if (local130 == 0) {
					local144 = 0;
					local140 = 0;
					local136 = 0;
				} else {
					local136 = local96 / local130;
					local140 = local77 / local130;
					local144 = 16777216 / local130;
				}
				if (this.aBoolean421) {
					local140 = (local140 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
				}
				local53[local63] = local136;
				local57[local63] = local140;
				local61[local63] = local144;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5802 = arg0.method5968();
		} else if (arg1 == 1) {
			this.aBoolean421 = arg0.method5966() == 1;
		}
	}
}
