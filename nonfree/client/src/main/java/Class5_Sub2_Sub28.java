import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class5_Sub2_Sub28 extends Class5_Sub2 {

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
	private int anInt8235 = 0;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
	private int anInt8240 = 4096;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(28) int[] local28 = this.method9042(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static597.anInt10025; local30++) {
				@Pc(36) int local36 = local28[local30];
				if (this.anInt8235 > local36) {
					local13[local30] = this.anInt8235;
				} else if (local36 > this.anInt8240) {
					local13[local30] = this.anInt8240;
				} else {
					local13[local30] = local36;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8235 = arg0.method5968();
		} else if (arg1 == 1) {
			this.anInt8240 = arg0.method5968();
		} else if (arg1 == 2) {
			super.aBoolean762 = arg0.method5966() == 1;
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(26) int[][] local26 = this.method9033(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static597.anInt10025; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt8235) {
					local42[local52] = this.anInt8235;
				} else if (local58 > this.anInt8240) {
					local42[local52] = this.anInt8240;
				} else {
					local42[local52] = local58;
				}
				if (local62 < this.anInt8235) {
					local46[local52] = this.anInt8235;
				} else if (local62 <= this.anInt8240) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt8240;
				}
				if (this.anInt8235 > local66) {
					local50[local52] = this.anInt8235;
				} else if (local66 > this.anInt8240) {
					local50[local52] = this.anInt8240;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}
}
