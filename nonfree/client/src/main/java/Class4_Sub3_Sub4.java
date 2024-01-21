import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class4_Sub3_Sub4 extends Class4_Sub3 {

	@OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt448 = arg1.method1253();
		} else if (arg0 == 1) {
			super.aBoolean170 = arg1.method1253() == 1;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)I")
	private int method261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt448;
		if (local6 == 1) {
			return arg1 + arg0;
		} else if (local6 == 2) {
			return arg1 - arg0;
		} else if (local6 == 3) {
			return arg0 * arg1 >> 12;
		} else if (local6 == 4) {
			return arg0 == 0 ? 4096 : (arg1 << 12) / arg0;
		} else if (local6 == 5) {
			return 4096 - ((4096 - arg1) * (-arg0 + 4096) >> 12);
		} else if (local6 == 6) {
			return arg0 < 2048 ? arg1 * arg0 >> 11 : 4096 - ((4096 - arg1) * (4096 - arg0) >> 11);
		} else if (local6 == 7) {
			return arg1 == 4096 ? 4096 : (arg0 << 12) / (4096 - arg1);
		} else if (local6 == 8) {
			return arg1 == 0 ? 0 : 4096 - (4096 - arg0 << 12) / arg1;
		} else if (local6 == 9) {
			return arg0 > arg1 ? arg1 : arg0;
		} else if (local6 == 10) {
			return arg1 <= arg0 ? arg0 : arg1;
		} else if (local6 == 11) {
			return arg1 <= arg0 ? arg0 - arg1 : arg1 - arg0;
		} else if (local6 == 12) {
			return arg1 + arg0 - (arg0 * arg1 >> 11);
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(28) int[][] local28 = this.method3150(0, arg0);
			@Pc(34) int[][] local34 = this.method3150(1, arg0);
			@Pc(38) int[] local38 = local18[1];
			@Pc(42) int[] local42 = local18[2];
			@Pc(46) int[] local46 = local18[0];
			@Pc(50) int[] local50 = local28[1];
			@Pc(54) int[] local54 = local28[0];
			@Pc(58) int[] local58 = local34[0];
			@Pc(62) int[] local62 = local28[2];
			@Pc(66) int[] local66 = local34[2];
			@Pc(70) int[] local70 = local34[1];
			for (@Pc(72) int local72 = 0; local72 < Static134.anInt3188; local72++) {
				local46[local72] = this.method261(local58[local72], local54[local72]);
				local38[local72] = this.method261(local70[local72], local50[local72]);
				local42[local72] = this.method261(local66[local72], local62[local72]);
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(21) int[] local21 = this.method3149(arg0, 0);
			@Pc(27) int[] local27 = this.method3149(arg0, 1);
			for (@Pc(29) int local29 = 0; local29 < Static134.anInt3188; local29++) {
				local11[local29] = this.method261(local27[local29], local21[local29]);
			}
		}
		return local11;
	}
}
