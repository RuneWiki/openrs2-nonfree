import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
	private int anInt1333;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(21) int[] local21 = this.method2904(0, arg0);
			@Pc(27) int[] local27 = this.method2904(1, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static141.anInt3261; local29++) {
				local11[local29] = this.method964(local21[local29], local27[local29]);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IBI)I")
	private int method964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt1333;
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
			return arg1 < 2048 ? arg1 * arg0 >> 11 : 4096 - ((4096 - arg0) * (-arg1 + 4096) >> 11);
		} else if (local6 == 7) {
			return arg0 == 4096 ? 4096 : (arg1 << 12) / (4096 - arg0);
		} else if (local6 == 8) {
			return arg0 == 0 ? 0 : 4096 - (4096 - arg1 << 12) / arg0;
		} else if (local6 == 9) {
			return arg1 > arg0 ? arg0 : arg1;
		} else if (local6 == 10) {
			return arg0 > arg1 ? arg0 : arg1;
		} else if (local6 == 11) {
			return arg0 > arg1 ? arg0 - arg1 : arg1 + -arg0;
		} else if (local6 == 12) {
			return arg1 + arg0 - (arg1 * arg0 >> 11);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt1333 = arg1.method191();
		} else if (arg0 == 1) {
			super.aBoolean171 = arg1.method191() == 1;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(17) int[][] local17 = this.method2913(arg0, 0);
			@Pc(23) int[][] local23 = this.method2913(arg0, 1);
			@Pc(27) int[] local27 = local7[0];
			@Pc(31) int[] local31 = local7[1];
			@Pc(35) int[] local35 = local7[2];
			@Pc(39) int[] local39 = local17[0];
			@Pc(43) int[] local43 = local17[1];
			@Pc(47) int[] local47 = local17[2];
			@Pc(51) int[] local51 = local23[0];
			@Pc(55) int[] local55 = local23[1];
			@Pc(59) int[] local59 = local23[2];
			for (@Pc(61) int local61 = 0; local61 < Static141.anInt3261; local61++) {
				local27[local61] = this.method964(local39[local61], local51[local61]);
				local31[local61] = this.method964(local43[local61], local55[local61]);
				local35[local61] = this.method964(local47[local61], local59[local61]);
			}
		}
		return local7;
	}
}
