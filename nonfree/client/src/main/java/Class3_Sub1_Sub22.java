import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class3_Sub1_Sub22 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
	private int anInt3032;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3032 = arg1.method1545();
		} else if (arg0 == 1) {
			super.aBoolean191 = arg1.method1545() == 1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(28) int[] local28 = this.method3120(0, arg0);
			@Pc(34) int[] local34 = this.method3120(1, arg0);
			for (@Pc(36) int local36 = 0; local36 < Static129.anInt3285; local36++) {
				local18[local36] = this.method2371(local28[local36], local34[local36]);
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIZ)I")
	private int method2371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt3032;
		if (local6 == 1) {
			return arg1 + arg0;
		} else if (local6 == 2) {
			return arg0 - arg1;
		} else if (local6 == 3) {
			return arg1 * arg0 >> 12;
		} else if (local6 == 4) {
			return arg1 == 0 ? 4096 : (arg0 << 12) / arg1;
		} else if (local6 == 5) {
			return 4096 - ((4096 - arg1) * (-arg0 + 4096) >> 12);
		} else if (local6 == 6) {
			return arg1 >= 2048 ? 4096 - ((4096 - arg1) * (-arg0 + 4096) >> 11) : arg1 * arg0 >> 11;
		} else if (local6 == 7) {
			return arg0 == 4096 ? 4096 : (arg1 << 12) / (4096 - arg0);
		} else if (local6 == 8) {
			return arg0 == 0 ? 0 : 4096 - (4096 - arg1 << 12) / arg0;
		} else if (local6 == 9) {
			return arg1 > arg0 ? arg0 : arg1;
		} else if (local6 == 10) {
			return arg0 <= arg1 ? arg1 : arg0;
		} else if (local6 == 11) {
			return arg1 >= arg0 ? arg1 - arg0 : arg0 - arg1;
		} else if (local6 == 12) {
			return arg1 + arg0 - (arg0 * arg1 >> 11);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(30) int[][] local30 = this.method3124(0, arg0);
			@Pc(36) int[][] local36 = this.method3124(1, arg0);
			@Pc(40) int[] local40 = local20[1];
			@Pc(44) int[] local44 = local20[0];
			@Pc(48) int[] local48 = local20[2];
			@Pc(52) int[] local52 = local30[1];
			@Pc(56) int[] local56 = local30[2];
			@Pc(60) int[] local60 = local30[0];
			@Pc(64) int[] local64 = local36[0];
			@Pc(68) int[] local68 = local36[1];
			@Pc(72) int[] local72 = local36[2];
			for (@Pc(74) int local74 = 0; local74 < Static129.anInt3285; local74++) {
				local44[local74] = this.method2371(local60[local74], local64[local74]);
				local40[local74] = this.method2371(local52[local74], local68[local74]);
				local48[local74] = this.method2371(local56[local74], local72[local74]);
			}
		}
		return local20;
	}
}
