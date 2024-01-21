import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class2_Sub2_Sub27 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
	private int anInt2752;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2752 = arg1.method1461();
		} else if (arg0 == 1) {
			super.aBoolean160 = arg1.method1461() == 1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(26) int[][] local26 = this.method2582(0, arg0);
			@Pc(32) int[][] local32 = this.method2582(1, arg0);
			@Pc(36) int[] local36 = local16[2];
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local26[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local26[2];
			@Pc(56) int[] local56 = local26[1];
			@Pc(60) int[] local60 = local32[1];
			@Pc(64) int[] local64 = local32[0];
			@Pc(68) int[] local68 = local32[2];
			for (@Pc(70) int local70 = 0; local70 < Static149.anInt3233; local70++) {
				local40[local70] = this.method1951(local64[local70], local44[local70]);
				local48[local70] = this.method1951(local60[local70], local56[local70]);
				local36[local70] = this.method1951(local68[local70], local52[local70]);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIB)I")
	private int method1951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = this.anInt2752;
		if (local11 == 1) {
			return arg1 + arg0;
		} else if (local11 == 2) {
			return arg1 - arg0;
		} else if (local11 == 3) {
			return arg1 * arg0 >> 12;
		} else if (local11 == 4) {
			return arg0 == 0 ? 4096 : (arg1 << 12) / arg0;
		} else if (local11 == 5) {
			return 4096 - ((4096 - arg0) * (-arg1 + 4096) >> 12);
		} else if (local11 == 6) {
			return arg0 < 2048 ? arg1 * arg0 >> 11 : 4096 - ((4096 - arg0) * (-arg1 + 4096) >> 11);
		} else if (local11 == 7) {
			return arg1 == 4096 ? 4096 : (arg0 << 12) / (4096 - arg1);
		} else if (local11 == 8) {
			return arg1 == 0 ? 0 : 4096 - (4096 - arg0 << 12) / arg1;
		} else if (local11 == 9) {
			return arg0 <= arg1 ? arg0 : arg1;
		} else if (local11 == 10) {
			return arg0 < arg1 ? arg1 : arg0;
		} else if (local11 == 11) {
			return arg0 >= arg1 ? arg0 - arg1 : -arg0 + arg1;
		} else if (local11 == 12) {
			return arg0 + arg1 - (arg0 * arg1 >> 11);
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(26) int[] local26 = this.method2573(arg0, 0);
			@Pc(34) int[] local34 = this.method2573(arg0, 1);
			for (@Pc(36) int local36 = 0; local36 < Static149.anInt3233; local36++) {
				local16[local36] = this.method1951(local34[local36], local26[local36]);
			}
		}
		return local16;
	}
}
