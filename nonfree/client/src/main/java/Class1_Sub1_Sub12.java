import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
	private int anInt1903 = 4;

	@OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
	private int anInt1900 = 4;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1903 = arg0.method2945();
		} else if (arg1 == 1) {
			this.anInt1900 = arg0.method2945();
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(25) int local25 = Static11.anInt294 / this.anInt1903;
			@Pc(30) int local30 = Static116.anInt2571 / this.anInt1900;
			@Pc(38) int[][] local38;
			if (local30 <= 0) {
				local38 = this.method3713(0, 0);
			} else {
				@Pc(44) int local44 = arg0 % local30;
				local38 = this.method3713(Static116.anInt2571 * local44 / local30, 0);
			}
			@Pc(58) int[] local58 = local38[0];
			@Pc(62) int[] local62 = local38[2];
			@Pc(66) int[] local66 = local11[2];
			@Pc(70) int[] local70 = local11[1];
			@Pc(74) int[] local74 = local38[1];
			@Pc(78) int[] local78 = local11[0];
			for (@Pc(80) int local80 = 0; local80 < Static11.anInt294; local80++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local80 % local25;
					local89 = local95 * Static11.anInt294 / local25;
				}
				local78[local80] = local58[local89];
				local70[local80] = local74[local89];
				local66[local80] = local62[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(25) int local25 = Static11.anInt294 / this.anInt1903;
			@Pc(30) int local30 = Static116.anInt2571 / this.anInt1900;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local30 <= 0) {
				local41 = this.method3706(0, 0);
			} else {
				local47 = arg0 % local30;
				local41 = this.method3706(local47 * Static116.anInt2571 / local30, 0);
			}
			for (local47 = 0; local47 < Static11.anInt294; local47++) {
				if (local25 > 0) {
					@Pc(70) int local70 = local47 % local25;
					local16[local47] = local41[Static11.anInt294 * local70 / local25];
				} else {
					local16[local47] = local41[0];
				}
			}
		}
		return local16;
	}
}
