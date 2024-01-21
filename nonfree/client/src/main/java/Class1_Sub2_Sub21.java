import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
	private int anInt2747;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(26) int[] local26 = this.method3401(arg0, 0);
			@Pc(32) int[] local32 = this.method3401(arg0, 1);
			for (@Pc(34) int local34 = 0; local34 < Static22.anInt596; local34++) {
				local16[local34] = this.method2037(local26[local34], local32[local34]);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(26) int[][] local26 = this.method3390(arg0, 0);
			@Pc(32) int[][] local32 = this.method3390(arg0, 1);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[2];
			@Pc(44) int[] local44 = local26[1];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local26[2];
			@Pc(56) int[] local56 = local26[0];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[2];
			@Pc(68) int[] local68 = local32[1];
			for (@Pc(70) int local70 = 0; local70 < Static22.anInt596; local70++) {
				local36[local70] = this.method2037(local56[local70], local60[local70]);
				local48[local70] = this.method2037(local44[local70], local68[local70]);
				local40[local70] = this.method2037(local52[local70], local64[local70]);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt2747 = arg1.method1234();
		} else if (arg0 == 1) {
			super.aBoolean173 = arg1.method1234() == 1;
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)I")
	private int method2037(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt2747;
		if (local15 == 1) {
			return arg1 + arg0;
		} else if (local15 == 2) {
			return arg0 - arg1;
		} else if (local15 == 3) {
			return arg1 * arg0 >> 12;
		} else if (local15 == 4) {
			return arg1 == 0 ? 4096 : (arg0 << 12) / arg1;
		} else if (local15 == 5) {
			return 4096 - ((4096 - arg1) * (4096 - arg0) >> 12);
		} else if (local15 == 6) {
			return arg1 >= 2048 ? 4096 - ((4096 - arg0) * (-arg1 + 4096) >> 11) : arg0 * arg1 >> 11;
		} else if (local15 == 7) {
			return arg0 == 4096 ? 4096 : (arg1 << 12) / (4096 - arg0);
		} else if (local15 == 8) {
			return arg0 == 0 ? 0 : 4096 - (4096 - arg1 << 12) / arg0;
		} else if (local15 == 9) {
			return arg0 >= arg1 ? arg1 : arg0;
		} else if (local15 == 10) {
			return arg0 > arg1 ? arg0 : arg1;
		} else if (local15 == 11) {
			return arg1 >= arg0 ? arg1 - arg0 : arg0 - arg1;
		} else if (local15 == 12) {
			return arg1 + arg0 - (arg1 * arg0 >> 11);
		} else {
			return arg0;
		}
	}
}
