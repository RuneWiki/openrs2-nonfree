import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class3_Sub5_Sub37 extends Class3_Sub5 {

	@OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
	private int anInt4385;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BII)I")
	private int method3091(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.anInt4385;
		if (local11 == 1) {
			return arg0 + arg1;
		} else if (local11 == 2) {
			return arg1 - arg0;
		} else if (local11 == 3) {
			return arg1 * arg0 >> 12;
		} else if (local11 == 4) {
			return arg0 == 0 ? 4096 : (arg1 << 12) / arg0;
		} else if (local11 == 5) {
			return 4096 - ((4096 - arg0) * (-arg1 + 4096) >> 12);
		} else if (local11 == 6) {
			return arg0 >= 2048 ? 4096 - ((4096 - arg1) * (4096 - arg0) >> 11) : arg0 * arg1 >> 11;
		} else if (local11 == 7) {
			return arg1 == 4096 ? 4096 : (arg0 << 12) / (4096 - arg1);
		} else if (local11 == 8) {
			return arg1 == 0 ? 0 : 4096 - (4096 - arg0 << 12) / arg1;
		} else if (local11 == 9) {
			return arg1 < arg0 ? arg1 : arg0;
		} else if (local11 == 10) {
			return arg1 > arg0 ? arg1 : arg0;
		} else if (local11 == 11) {
			return arg1 <= arg0 ? arg0 - arg1 : arg1 - arg0;
		} else if (local11 == 12) {
			return arg0 + arg1 - (arg1 * arg0 >> 11);
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt4385 = arg1.method2107();
		} else if (arg0 == 1) {
			super.aBoolean178 = arg1.method2107() == 1;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(25) int[] local25 = this.method3167(arg0, 0);
			@Pc(31) int[] local31 = this.method3167(arg0, 1);
			for (@Pc(33) int local33 = 0; local33 < Static104.anInt2195; local33++) {
				local7[local33] = this.method3091(local31[local33], local25[local33]);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(21) int[][] local21 = this.method3163(0, arg0);
			@Pc(27) int[][] local27 = this.method3163(1, arg0);
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local21[0];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[1];
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			for (@Pc(65) int local65 = 0; local65 < Static104.anInt2195; local65++) {
				local47[local65] = this.method3091(local55[local65], local35[local65]);
				local31[local65] = this.method3091(local59[local65], local43[local65]);
				local39[local65] = this.method3091(local63[local65], local51[local65]);
			}
		}
		return local11;
	}
}
