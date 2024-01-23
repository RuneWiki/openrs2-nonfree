import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(15) int[] local15 = local7[1];
			@Pc(19) int[] local19 = local7[0];
			@Pc(23) int[] local23 = local7[2];
			for (@Pc(25) int local25 = 0; local25 < Static54.anInt953; local25++) {
				this.method1986(arg0, local25);
				@Pc(38) int[][] local38 = this.method3952(0, Static119.anInt2799);
				local19[local25] = local38[0][Static128.anInt2872];
				local15[local25] = local38[1][Static128.anInt2872];
				local23[local25] = local38[2][Static128.anInt2872];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			for (@Pc(22) int local22 = 0; local22 < Static54.anInt953; local22++) {
				this.method1986(arg0, local22);
				@Pc(35) int[] local35 = this.method3955(0, Static119.anInt2799);
				local16[local22] = local35[Static128.anInt2872];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIB)V")
	private void method1986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static157.anIntArray604[arg0];
		@Pc(13) int local13 = Static179.anIntArray682[arg1];
		@Pc(32) float local32 = (float) Math.atan2((double) (local13 - 2048), (double) (local9 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static119.anInt2799 = arg0;
			Static128.anInt2872 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static128.anInt2872 = arg0;
			Static119.anInt2799 = arg1;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static128.anInt2872 = Static54.anInt953 - arg0;
			Static119.anInt2799 = arg1;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static119.anInt2799 = Static11.anInt313 - arg0;
			Static128.anInt2872 = arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static128.anInt2872 = Static54.anInt953 - arg1;
			Static119.anInt2799 = Static11.anInt313 - arg0;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static128.anInt2872 = Static54.anInt953 - arg0;
			Static119.anInt2799 = Static11.anInt313 - arg1;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static128.anInt2872 = arg0;
			Static119.anInt2799 = Static11.anInt313 - arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static119.anInt2799 = arg0;
			Static128.anInt2872 = Static54.anInt953 - arg1;
		}
		Static119.anInt2799 &= Static156.anInt3604;
		Static128.anInt2872 &= Static74.anInt1601;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean212 = arg0.method2122() == 1;
		}
	}
}
