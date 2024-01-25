import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class6_Sub4_Sub15 extends Class6_Sub4 {

	@OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
	private int anInt4348 = 4096;

	@OriginalMember(owner = "client!hs", name = "K", descriptor = "Z")
	private boolean aBoolean308 = true;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(33) int[] local33 = this.method8313(arg0 - 1 & Static2.anInt12, 0);
			@Pc(39) int[] local39 = this.method8313(arg0, 0);
			@Pc(49) int[] local49 = this.method8313(Static2.anInt12 & arg0 + 1, 0);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static6.anInt111; local63++) {
				@Pc(77) int local77 = this.anInt4348 * (local49[local63] - local33[local63]);
				@Pc(97) int local97 = this.anInt4348 * (local39[Static325.anInt6209 & local63 + 1] - local39[local63 - 1 & Static325.anInt6209]);
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local117 + local111 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(139) int local139;
				@Pc(137) int local137;
				@Pc(135) int local135;
				if (local131 == 0) {
					local135 = 0;
					local137 = 0;
					local139 = 0;
				} else {
					local139 = local97 / local131;
					local135 = 16777216 / local131;
					local137 = local77 / local131;
				}
				if (this.aBoolean308) {
					local137 = (local137 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
				}
				local53[local63] = local139;
				local57[local63] = local137;
				local61[local63] = local135;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt4348 = arg1.method8571();
		} else if (arg0 == 1) {
			this.aBoolean308 = arg1.method8604() == 1;
		}
	}
}
