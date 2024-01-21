import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class1_Sub4_Sub29 extends Class1_Sub4 {

	@OriginalMember(owner = "client!sg", name = "nb", descriptor = "I")
	private int anInt4094;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4094 = arg0.method544();
		} else if (arg1 == 1) {
			super.aBoolean210 = arg0.method544() == 1;
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(26) int[] local26 = this.method3215(arg0, 0);
			@Pc(32) int[] local32 = this.method3215(arg0, 1);
			for (@Pc(34) int local34 = 0; local34 < Static73.anInt1888; local34++) {
				local16[local34] = this.method2799(local26[local34], local32[local34]);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBI)I")
	private int method2799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.anInt4094;
		if (local11 == 1) {
			return arg1 + arg0;
		} else if (local11 == 2) {
			return arg0 - arg1;
		} else if (local11 == 3) {
			return arg1 * arg0 >> 12;
		} else if (local11 == 4) {
			return arg1 == 0 ? 4096 : (arg0 << 12) / arg1;
		} else if (local11 == 5) {
			return 4096 - ((4096 - arg1) * (4096 - arg0) >> 12);
		} else if (local11 == 6) {
			return arg1 < 2048 ? arg0 * arg1 >> 11 : 4096 - ((4096 - arg1) * (4096 - arg0) >> 11);
		} else if (local11 == 7) {
			return arg0 == 4096 ? 4096 : (arg1 << 12) / (4096 - arg0);
		} else if (local11 == 8) {
			return arg0 == 0 ? 0 : 4096 - (4096 - arg1 << 12) / arg0;
		} else if (local11 == 9) {
			return arg0 < arg1 ? arg0 : arg1;
		} else if (local11 == 10) {
			return arg1 < arg0 ? arg0 : arg1;
		} else if (local11 == 11) {
			return arg0 > arg1 ? arg0 - arg1 : -arg0 + arg1;
		} else if (local11 == 12) {
			return arg1 + arg0 - (arg1 * arg0 >> 11);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(21) int[][] local21 = this.method3217(0, arg0);
			@Pc(27) int[][] local27 = this.method3217(1, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			for (@Pc(65) int local65 = 0; local65 < Static73.anInt1888; local65++) {
				local31[local65] = this.method2799(local43[local65], local55[local65]);
				local35[local65] = this.method2799(local47[local65], local59[local65]);
				local39[local65] = this.method2799(local51[local65], local63[local65]);
			}
		}
		return local11;
	}
}
