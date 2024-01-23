import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gg", name = "gb", descriptor = "Z")
	private boolean aBoolean72 = true;

	@OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
	private int anInt1523 = 4096;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(30) int[] local30 = this.method3733(arg0 - 1 & Static148.anInt3213, 0);
			@Pc(36) int[] local36 = this.method3733(arg0, 0);
			@Pc(46) int[] local46 = this.method3733(arg0 + 1 & Static148.anInt3213, 0);
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local16[0];
			@Pc(58) int[] local58 = local16[1];
			for (@Pc(60) int local60 = 0; local60 < Static157.anInt3431; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt1523;
				@Pc(94) int local94 = (local36[local60 + 1 & Static74.anInt1679] - local36[local60 - 1 & Static74.anInt1679]) * this.anInt1523;
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local108 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(141) int local141;
				@Pc(137) int local137;
				@Pc(145) int local145;
				if (local128 == 0) {
					local141 = 0;
					local145 = 0;
					local137 = 0;
				} else {
					local137 = local74 / local128;
					local141 = local94 / local128;
					local145 = 16777216 / local128;
				}
				if (this.aBoolean72) {
					local145 = (local145 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local54[local60] = local141;
				local58[local60] = local137;
				local50[local60] = local145;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1523 = arg0.method3805();
		} else if (arg1 == 1) {
			this.aBoolean72 = arg0.method3793() == 1;
		}
	}
}
