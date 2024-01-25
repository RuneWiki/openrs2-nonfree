import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!aba", name = "H", descriptor = "I")
	private int anInt64 = 4096;

	@OriginalMember(owner = "client!aba", name = "K", descriptor = "Z")
	private boolean aBoolean4 = true;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt64 = arg0.method5610();
		} else if (arg1 == 1) {
			this.aBoolean4 = arg0.method5633() == 1;
		}
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(33) int[] local33 = this.method8669(arg0 - 1 & Static575.anInt9412, 0);
			@Pc(39) int[] local39 = this.method8669(arg0, 0);
			@Pc(49) int[] local49 = this.method8669(Static575.anInt9412 & arg0 + 1, 0);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static201.anInt3738; local63++) {
				@Pc(77) int local77 = (local49[local63] - local33[local63]) * this.anInt64;
				@Pc(97) int local97 = (local39[Static201.anInt3740 & local63 + 1] - local39[local63 - 1 & Static201.anInt3740]) * this.anInt64;
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local117 + local111 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(138) int local138;
				@Pc(142) int local142;
				@Pc(140) int local140;
				if (local131 == 0) {
					local138 = 0;
					local140 = 0;
					local142 = 0;
				} else {
					local140 = 16777216 / local131;
					local142 = local77 / local131;
					local138 = local97 / local131;
				}
				if (this.aBoolean4) {
					local142 = (local142 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
				}
				local53[local63] = local138;
				local57[local63] = local142;
				local61[local63] = local140;
			}
		}
		return local19;
	}
}
