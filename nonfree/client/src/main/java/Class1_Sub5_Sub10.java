import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub5_Sub10 extends Class1_Sub5 {

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
	private int anInt1354;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1354 = arg0.method336();
		} else if (arg1 == 1) {
			super.aBoolean173 = arg0.method336() == 1;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(26) int[] local26 = this.method3145(0, arg0);
			@Pc(32) int[] local32 = this.method3145(1, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static177.anInt4018; local34++) {
				local16[local34] = this.method1009(local26[local34], local32[local34]);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(21) int[][] local21 = this.method3144(arg0, 0);
			@Pc(27) int[][] local27 = this.method3144(arg0, 1);
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local21[1];
			@Pc(43) int[] local43 = local21[2];
			@Pc(47) int[] local47 = local27[0];
			@Pc(51) int[] local51 = local21[0];
			@Pc(55) int[] local55 = local11[2];
			@Pc(59) int[] local59 = local27[2];
			@Pc(63) int[] local63 = local27[1];
			for (@Pc(65) int local65 = 0; local65 < Static177.anInt4018; local65++) {
				local35[local65] = this.method1009(local51[local65], local47[local65]);
				local31[local65] = this.method1009(local39[local65], local63[local65]);
				local55[local65] = this.method1009(local43[local65], local59[local65]);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZII)I")
	private int method1009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt1354;
		if (local6 == 1) {
			return arg0 + arg1;
		} else if (local6 == 2) {
			return arg0 - arg1;
		} else if (local6 == 3) {
			return arg1 * arg0 >> 12;
		} else if (local6 == 4) {
			return arg1 == 0 ? 4096 : (arg0 << 12) / arg1;
		} else if (local6 == 5) {
			return 4096 - ((4096 - arg0) * (-arg1 + 4096) >> 12);
		} else if (local6 == 6) {
			return arg1 < 2048 ? arg0 * arg1 >> 11 : 4096 - ((4096 - arg0) * (-arg1 + 4096) >> 11);
		} else if (local6 == 7) {
			return arg0 == 4096 ? 4096 : (arg1 << 12) / (4096 - arg0);
		} else if (local6 == 8) {
			return arg0 == 0 ? 0 : 4096 - (4096 - arg1 << 12) / arg0;
		} else if (local6 == 9) {
			return arg0 >= arg1 ? arg1 : arg0;
		} else if (local6 == 10) {
			return arg1 >= arg0 ? arg1 : arg0;
		} else if (local6 == 11) {
			return arg1 < arg0 ? arg0 - arg1 : arg1 - arg0;
		} else if (local6 == 12) {
			return arg1 + arg0 - (arg0 * arg1 >> 11);
		} else {
			return arg0;
		}
	}
}
