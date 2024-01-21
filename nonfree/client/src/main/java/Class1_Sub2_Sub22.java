import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			super.aBoolean173 = arg1.method1234() == 1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(17) int[] local17 = this.method3401(arg0, 0);
			for (@Pc(19) int local19 = 0; local19 < Static22.anInt596; local19++) {
				local7[local19] = 4096 - local17[local19];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(30) int[][] local30 = this.method3390(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local20[0];
			@Pc(42) int[] local42 = local20[1];
			@Pc(46) int[] local46 = local30[2];
			@Pc(50) int[] local50 = local30[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static22.anInt596; local56++) {
				local38[local56] = 4096 - local34[local56];
				local42[local56] = 4096 - local50[local56];
				local54[local56] = 4096 - local46[local56];
			}
		}
		return local20;
	}
}
