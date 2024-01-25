import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class2_Sub4_Sub38 extends Class2_Sub4 {

	@OriginalMember(owner = "client!wia", name = "H", descriptor = "Z")
	private boolean aBoolean752 = true;

	@OriginalMember(owner = "client!wia", name = "L", descriptor = "I")
	private int anInt10334 = 4096;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10334 = arg0.method2825();
		} else if (arg1 == 1) {
			this.aBoolean752 = arg0.method2859() == 1;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(33) int[] local33 = this.method8892(arg0 - 1 & Static463.anInt7489, 0);
			@Pc(39) int[] local39 = this.method8892(arg0, 0);
			@Pc(49) int[] local49 = this.method8892(Static463.anInt7489 & arg0 + 1, 0);
			@Pc(53) int[] local53 = local11[0];
			@Pc(57) int[] local57 = local11[1];
			@Pc(61) int[] local61 = local11[2];
			for (@Pc(63) int local63 = 0; local63 < Static395.anInt6816; local63++) {
				@Pc(77) int local77 = this.anInt10334 * (local49[local63] - local33[local63]);
				@Pc(97) int local97 = (local39[local63 + 1 & Static104.anInt2340] - local39[Static104.anInt2340 & local63 - 1]) * this.anInt10334;
				@Pc(101) int local101 = local97 >> 12;
				@Pc(105) int local105 = local77 >> 12;
				@Pc(111) int local111 = local101 * local101 >> 12;
				@Pc(117) int local117 = local105 * local105 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local117 + local111 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(137) int local137;
				@Pc(141) int local141;
				@Pc(145) int local145;
				if (local131 == 0) {
					local141 = 0;
					local137 = 0;
					local145 = 0;
				} else {
					local137 = local97 / local131;
					local141 = local77 / local131;
					local145 = 16777216 / local131;
				}
				if (this.aBoolean752) {
					local141 = (local141 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
				}
				local53[local63] = local137;
				local57[local63] = local141;
				local61[local63] = local145;
			}
		}
		return local11;
	}
}
