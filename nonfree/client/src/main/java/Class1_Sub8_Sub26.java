import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class1_Sub8_Sub26 extends Class1_Sub8 {

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			for (@Pc(25) int local25 = 0; local25 < Static18.anInt439; local25++) {
				this.method4520(local25, arg0);
				@Pc(38) int[] local38 = this.method6037(0, Static105.anInt2418);
				local19[local25] = local38[Static447.anInt7832];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(III)V")
	private void method4520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static198.anIntArray749[arg0];
		@Pc(13) int local13 = Static134.anIntArray308[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static447.anInt7832 = arg0;
			Static105.anInt2418 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static447.anInt7832 = arg1;
			Static105.anInt2418 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static447.anInt7832 = Static18.anInt439 - arg1;
			Static105.anInt2418 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static105.anInt2418 = Static217.anInt4363 - arg1;
			Static447.anInt7832 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static447.anInt7832 = Static18.anInt439 - arg0;
			Static105.anInt2418 = Static217.anInt4363 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static105.anInt2418 = Static217.anInt4363 - arg0;
			Static447.anInt7832 = Static18.anInt439 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static447.anInt7832 = arg1;
			Static105.anInt2418 = Static217.anInt4363 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static105.anInt2418 = arg1;
			Static447.anInt7832 = Static18.anInt439 - arg0;
		}
		Static447.anInt7832 &= Static283.anInt5397;
		Static105.anInt2418 &= Static443.anInt7904;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static18.anInt439; local29++) {
				this.method4520(local29, arg0);
				@Pc(42) int[][] local42 = this.method6035(Static105.anInt2418, 0);
				local19[local29] = local42[0][Static447.anInt7832];
				local23[local29] = local42[1][Static447.anInt7832];
				local27[local29] = local42[2][Static447.anInt7832];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			super.aBoolean508 = arg1.method1171() == 1;
		}
	}
}
