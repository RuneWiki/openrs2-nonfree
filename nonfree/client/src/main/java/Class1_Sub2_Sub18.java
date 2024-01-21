import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jh", name = "cb", descriptor = "I")
	private int anInt2195;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(BII)I")
	private int method1445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.anInt2195;
		if (local11 == 1) {
			return arg0 + arg1;
		} else if (local11 == 2) {
			return arg0 - arg1;
		} else if (local11 == 3) {
			return arg1 * arg0 >> 12;
		} else if (local11 == 4) {
			return arg1 == 0 ? 4096 : (arg0 << 12) / arg1;
		} else if (local11 == 5) {
			return 4096 - ((4096 - arg0) * (-arg1 + 4096) >> 12);
		} else if (local11 == 6) {
			return arg1 >= 2048 ? 4096 - ((4096 - arg1) * (-arg0 + 4096) >> 11) : arg1 * arg0 >> 11;
		} else if (local11 == 7) {
			return arg0 == 4096 ? 4096 : (arg1 << 12) / (4096 - arg0);
		} else if (local11 == 8) {
			return arg0 == 0 ? 0 : 4096 - (4096 - arg1 << 12) / arg0;
		} else if (local11 == 9) {
			return arg0 < arg1 ? arg0 : arg1;
		} else if (local11 == 10) {
			return arg1 < arg0 ? arg0 : arg1;
		} else if (local11 == 11) {
			return arg1 >= arg0 ? arg1 - arg0 : -arg1 + arg0;
		} else if (local11 == 12) {
			return arg1 + arg0 - (arg0 * arg1 >> 11);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2195 = arg0.method861();
		} else if (arg1 == 1) {
			super.aBoolean215 = arg0.method861() == 1;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(22) int[] local22 = this.method3130(0, arg0);
			@Pc(28) int[] local28 = this.method3130(1, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static110.anInt2825; local30++) {
				local7[local30] = this.method1445(local22[local30], local28[local30]);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(19) int[][] local19 = this.method3118(arg0, 0);
			@Pc(27) int[][] local27 = this.method3118(arg0, 1);
			@Pc(31) int[] local31 = local7[0];
			@Pc(35) int[] local35 = local7[1];
			@Pc(39) int[] local39 = local7[2];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local27[0];
			@Pc(55) int[] local55 = local27[1];
			@Pc(59) int[] local59 = local19[2];
			@Pc(63) int[] local63 = local27[2];
			for (@Pc(65) int local65 = 0; local65 < Static110.anInt2825; local65++) {
				local31[local65] = this.method1445(local47[local65], local51[local65]);
				local35[local65] = this.method1445(local43[local65], local55[local65]);
				local39[local65] = this.method1445(local59[local65], local63[local65]);
			}
		}
		return local7;
	}
}
