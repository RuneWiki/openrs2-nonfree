import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class6_Sub8_Sub29 extends Class6_Sub8 {

	@OriginalMember(owner = "client!ps", name = "G", descriptor = "I")
	private int anInt8072 = 4096;

	@OriginalMember(owner = "client!ps", name = "D", descriptor = "Z")
	private boolean aBoolean607 = true;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(33) int[] local33 = this.method8930(Static165.anInt3453 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method8930(arg0, 0);
			@Pc(49) int[] local49 = this.method8930(Static165.anInt3453 & arg0 + 1, 0);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static83.anInt1268; local63++) {
				@Pc(77) int local77 = (local49[local63] - local33[local63]) * this.anInt8072;
				@Pc(97) int local97 = this.anInt8072 * (local39[Static333.anInt5727 & local63 + 1] - local39[Static333.anInt5727 & local63 - 1]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local117 + local111 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(140) int local140;
				@Pc(148) int local148;
				@Pc(144) int local144;
				if (local131 == 0) {
					local144 = 0;
					local140 = 0;
					local148 = 0;
				} else {
					local140 = local97 / local131;
					local144 = 16777216 / local131;
					local148 = local77 / local131;
				}
				if (this.aBoolean607) {
					local140 = (local140 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local148 = (local148 >> 1) + 2048;
				}
				local53[local63] = local140;
				local57[local63] = local148;
				local61[local63] = local144;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt8072 = arg1.method3018();
		} else if (arg0 == 1) {
			this.aBoolean607 = arg1.method3030() == 1;
		}
	}
}
