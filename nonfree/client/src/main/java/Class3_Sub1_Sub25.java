import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class3_Sub1_Sub25 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nr", name = "O", descriptor = "Z")
	private boolean aBoolean603 = true;

	@OriginalMember(owner = "client!nr", name = "N", descriptor = "I")
	private int anInt7137 = 4096;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(33) int[] local33 = this.method8362(arg0 - 1 & Static483.anInt9026, 0);
			@Pc(39) int[] local39 = this.method8362(arg0, 0);
			@Pc(49) int[] local49 = this.method8362(Static483.anInt9026 & arg0 + 1, 0);
			@Pc(53) int[] local53 = local11[0];
			@Pc(57) int[] local57 = local11[1];
			@Pc(61) int[] local61 = local11[2];
			for (@Pc(63) int local63 = 0; local63 < Static131.anInt2935; local63++) {
				@Pc(77) int local77 = (local49[local63] - local33[local63]) * this.anInt7137;
				@Pc(97) int local97 = this.anInt7137 * (local39[Static251.anInt5425 & local63 + 1] - local39[local63 - 1 & Static251.anInt5425]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(132) int local132 = (int) (Math.sqrt((double) ((float) (local111 + local117 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(149) int local149;
				@Pc(141) int local141;
				@Pc(145) int local145;
				if (local132 == 0) {
					local141 = 0;
					local149 = 0;
					local145 = 0;
				} else {
					local141 = local77 / local132;
					local145 = 16777216 / local132;
					local149 = local97 / local132;
				}
				if (this.aBoolean603) {
					local145 = (local145 >> 1) + 2048;
					local149 = (local149 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
				}
				local53[local63] = local149;
				local57[local63] = local141;
				local61[local63] = local145;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt7137 = arg1.method6535();
		} else if (arg0 == 1) {
			this.aBoolean603 = arg1.method6538() == 1;
		}
	}
}
