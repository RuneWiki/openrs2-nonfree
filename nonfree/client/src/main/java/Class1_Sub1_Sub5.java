import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(III)I")
	private int method871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt1038;
		if (local6 == 1) {
			return arg0 + arg1;
		} else if (local6 == 2) {
			return arg0 - arg1;
		} else if (local6 == 3) {
			return arg1 * arg0 >> 12;
		} else if (local6 == 4) {
			return arg1 == 0 ? 4096 : (arg0 << 12) / arg1;
		} else if (local6 == 5) {
			return 4096 - ((4096 - arg1) * (-arg0 + 4096) >> 12);
		} else if (local6 == 6) {
			return arg1 < 2048 ? arg1 * arg0 >> 11 : 4096 - ((4096 - arg1) * (-arg0 + 4096) >> 11);
		} else if (local6 == 7) {
			return arg0 == 4096 ? 4096 : (arg1 << 12) / (4096 - arg0);
		} else if (local6 == 8) {
			return arg0 == 0 ? 0 : 4096 - (4096 - arg1 << 12) / arg0;
		} else if (local6 == 9) {
			return arg0 < arg1 ? arg0 : arg1;
		} else if (local6 == 10) {
			return arg1 < arg0 ? arg0 : arg1;
		} else if (local6 == 11) {
			return arg1 >= arg0 ? arg1 - arg0 : arg0 + -arg1;
		} else if (local6 == 12) {
			return arg1 + arg0 - (arg0 * arg1 >> 11);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(17) int[] local17 = this.method3012(0, arg0);
			@Pc(23) int[] local23 = this.method3012(1, arg0);
			for (@Pc(25) int local25 = 0; local25 < Static65.anInt1933; local25++) {
				local7[local25] = this.method871(local17[local25], local23[local25]);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(21) int[][] local21 = this.method3013(arg0, 0);
			@Pc(27) int[][] local27 = this.method3013(arg0, 1);
			@Pc(31) int[] local31 = local21[0];
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			for (@Pc(65) int local65 = 0; local65 < Static65.anInt1933; local65++) {
				local35[local65] = this.method871(local31[local65], local55[local65]);
				local39[local65] = this.method871(local47[local65], local59[local65]);
				local43[local65] = this.method871(local51[local65], local63[local65]);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1038 = arg1.method1607();
		} else if (arg0 == 1) {
			super.aBoolean319 = arg1.method1607() == 1;
		}
	}
}
