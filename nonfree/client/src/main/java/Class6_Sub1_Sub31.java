import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class6_Sub1_Sub31 extends Class6_Sub1 {

	@OriginalMember(owner = "client!s", name = "J", descriptor = "I")
	private int anInt8432 = 4096;

	@OriginalMember(owner = "client!s", name = "K", descriptor = "Z")
	private boolean aBoolean625 = true;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(31) int[] local31 = this.method8165(0, arg0 - 1 & Static574.anInt9711);
			@Pc(39) int[] local39 = this.method8165(0, arg0);
			@Pc(49) int[] local49 = this.method8165(0, arg0 + 1 & Static574.anInt9711);
			@Pc(53) int[] local53 = local17[0];
			@Pc(57) int[] local57 = local17[1];
			@Pc(61) int[] local61 = local17[2];
			for (@Pc(63) int local63 = 0; local63 < Static289.anInt5549; local63++) {
				@Pc(77) int local77 = this.anInt8432 * (local49[local63] - local31[local63]);
				@Pc(97) int local97 = this.anInt8432 * (local39[Static153.anInt3343 & local63 + 1] - local39[Static153.anInt3343 & local63 - 1]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(132) int local132 = (int) (Math.sqrt((double) ((float) (local111 + local117 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(149) int local149;
				@Pc(145) int local145;
				@Pc(141) int local141;
				if (local132 == 0) {
					local149 = 0;
					local145 = 0;
					local141 = 0;
				} else {
					local141 = 16777216 / local132;
					local145 = local77 / local132;
					local149 = local97 / local132;
				}
				if (this.aBoolean625) {
					local141 = (local141 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
					local149 = (local149 >> 1) + 2048;
				}
				local53[local63] = local149;
				local57[local63] = local145;
				local61[local63] = local141;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt8432 = arg1.method4999();
		} else if (arg0 == 1) {
			this.aBoolean625 = arg1.method4966() == 1;
		}
	}
}
