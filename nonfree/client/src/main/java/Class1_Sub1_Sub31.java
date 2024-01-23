import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(30) int[][] local30 = this.method4758(0, arg0);
			@Pc(34) int[] local34 = local30[1];
			@Pc(38) int[] local38 = local30[0];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local7[0];
			@Pc(50) int[] local50 = local7[2];
			@Pc(54) int[] local54 = local7[1];
			for (@Pc(56) int local56 = 0; local56 < Static75.anInt1848; local56++) {
				local46[local56] = 4096 - local38[local56];
				local54[local56] = 4096 - local34[local56];
				local50[local56] = 4096 - local42[local56];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(27) int[] local27 = this.method4746(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static75.anInt1848; local29++) {
				local16[local29] = 4096 - local27[local29];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean324 = arg0.method2655() == 1;
		}
	}
}
