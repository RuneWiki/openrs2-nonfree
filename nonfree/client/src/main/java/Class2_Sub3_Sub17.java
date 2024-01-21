import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class2_Sub3_Sub17 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
	private int anInt2007;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(26) int[] local26 = this.method3011(arg0, 0);
			@Pc(32) int[] local32 = this.method3011(arg0, 1);
			for (@Pc(34) int local34 = 0; local34 < Static53.anInt1184; local34++) {
				local16[local34] = this.method1633(local32[local34], local26[local34]);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt2007 = arg1.method2962();
		} else if (arg0 == 1) {
			super.aBoolean175 = arg1.method2962() == 1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(BII)I")
	private int method1633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.anInt2007;
		if (local11 == 1) {
			return arg1 + arg0;
		} else if (local11 == 2) {
			return arg1 - arg0;
		} else if (local11 == 3) {
			return arg0 * arg1 >> 12;
		} else if (local11 == 4) {
			return arg0 == 0 ? 4096 : (arg1 << 12) / arg0;
		} else if (local11 == 5) {
			return 4096 - ((4096 - arg1) * (4096 - arg0) >> 12);
		} else if (local11 == 6) {
			return arg0 < 2048 ? arg0 * arg1 >> 11 : 4096 - ((4096 - arg1) * (-arg0 + 4096) >> 11);
		} else if (local11 == 7) {
			return arg1 == 4096 ? 4096 : (arg0 << 12) / (4096 - arg1);
		} else if (local11 == 8) {
			return arg1 == 0 ? 0 : 4096 - (4096 - arg0 << 12) / arg1;
		} else if (local11 == 9) {
			return arg0 > arg1 ? arg1 : arg0;
		} else if (local11 == 10) {
			return arg0 >= arg1 ? arg0 : arg1;
		} else if (local11 == 11) {
			return arg1 <= arg0 ? arg0 - arg1 : -arg0 + arg1;
		} else if (local11 == 12) {
			return arg1 + arg0 - (arg0 * arg1 >> 11);
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(21) int[][] local21 = this.method3017(arg0, 0);
			@Pc(27) int[][] local27 = this.method3017(arg0, 1);
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local21[0];
			@Pc(43) int[] local43 = local11[2];
			@Pc(47) int[] local47 = local27[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			for (@Pc(65) int local65 = 0; local65 < Static53.anInt1184; local65++) {
				local35[local65] = this.method1633(local47[local65], local39[local65]);
				local31[local65] = this.method1633(local59[local65], local51[local65]);
				local43[local65] = this.method1633(local63[local65], local55[local65]);
			}
		}
		return local11;
	}
}
