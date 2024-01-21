import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
	private int anInt2040 = 4096;

	@OriginalMember(owner = "client!jj", name = "cb", descriptor = "Z")
	private boolean aBoolean120 = true;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(33) int[] local33 = this.method3393(arg0 - 1 & Static15.anInt388, 0);
			@Pc(39) int[] local39 = this.method3393(arg0, 0);
			@Pc(49) int[] local49 = this.method3393(Static15.anInt388 & arg0 + 1, 0);
			@Pc(53) int[] local53 = local19[1];
			@Pc(57) int[] local57 = local19[2];
			@Pc(61) int[] local61 = local19[0];
			for (@Pc(63) int local63 = 0; local63 < Static107.anInt2321; local63++) {
				@Pc(85) int local85 = (local39[Static144.anInt2893 & local63 + 1] - local39[Static144.anInt2893 & local63 - 1]) * this.anInt2040;
				@Pc(97) int local97 = (local49[local63] - local33[local63]) * this.anInt2040;
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local85 >> 12;
				@Pc(111) int local111 = local105 * local105 >> 12;
				@Pc(117) int local117 = local101 * local101 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local117 + local111 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(140) int local140;
				@Pc(148) int local148;
				@Pc(144) int local144;
				if (local131 == 0) {
					local140 = 0;
					local148 = 0;
					local144 = 0;
				} else {
					local140 = local85 / local131;
					local144 = 16777216 / local131;
					local148 = local97 / local131;
				}
				if (this.aBoolean120) {
					local148 = (local148 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
				}
				local61[local63] = local140;
				local53[local63] = local148;
				local57[local63] = local144;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2040 = arg0.method3023();
		} else if (arg1 == 1) {
			this.aBoolean120 = arg0.method3010() == 1;
		}
	}
}
