import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class3_Sub2_Sub11 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
	private int anInt1714;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(29) int[] local29 = this.method2787(arg0, 0);
			@Pc(35) int[] local35 = this.method2787(arg0, 1);
			for (@Pc(37) int local37 = 0; local37 < Static86.anInt1942; local37++) {
				local19[local37] = this.method1321(local29[local37], local35[local37]);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1714 = arg0.method1354();
		} else if (arg1 == 1) {
			super.aBoolean271 = arg0.method1354() == 1;
		}
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(III)I")
	private int method1321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt1714;
		if (local6 == 1) {
			return arg1 + arg0;
		} else if (local6 == 2) {
			return arg0 - arg1;
		} else if (local6 == 3) {
			return arg1 * arg0 >> 12;
		} else if (local6 == 4) {
			return arg1 == 0 ? 4096 : (arg0 << 12) / arg1;
		} else if (local6 == 5) {
			return 4096 - ((4096 - arg1) * (4096 - arg0) >> 12);
		} else if (local6 == 6) {
			return arg1 < 2048 ? arg0 * arg1 >> 11 : 4096 - ((4096 - arg0) * (4096 - arg1) >> 11);
		} else if (local6 == 7) {
			return arg0 == 4096 ? 4096 : (arg1 << 12) / (4096 - arg0);
		} else if (local6 == 8) {
			return arg0 == 0 ? 0 : 4096 - (4096 - arg1 << 12) / arg0;
		} else if (local6 == 9) {
			return arg0 >= arg1 ? arg1 : arg0;
		} else if (local6 == 10) {
			return arg0 > arg1 ? arg0 : arg1;
		} else if (local6 == 11) {
			return arg1 >= arg0 ? arg1 - arg0 : -arg1 + arg0;
		} else if (local6 == 12) {
			return arg0 + arg1 - (arg1 * arg0 >> 11);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(26) int[][] local26 = this.method2785(arg0, 0);
			@Pc(32) int[][] local32 = this.method2785(arg0, 1);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[2];
			@Pc(68) int[] local68 = local32[1];
			for (@Pc(70) int local70 = 0; local70 < Static86.anInt1942; local70++) {
				local36[local70] = this.method1321(local48[local70], local60[local70]);
				local40[local70] = this.method1321(local52[local70], local68[local70]);
				local44[local70] = this.method1321(local56[local70], local64[local70]);
			}
		}
		return local11;
	}
}
