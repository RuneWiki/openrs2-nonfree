import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class2_Sub4_Sub35 extends Class2_Sub4 {

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean190 = arg1.method1534() == 1;
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(III)V")
	private void method2915(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static141.anIntArray130[arg1];
		@Pc(13) int local13 = Static2.anIntArray5[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static216.anInt4543 = arg0;
			Static184.anInt2029 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static216.anInt4543 = arg1;
			Static184.anInt2029 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static216.anInt4543 = arg1;
			Static184.anInt2029 = Static118.anInt2608 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static184.anInt2029 = arg1;
			Static216.anInt4543 = Static38.anInt3056 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static184.anInt2029 = Static118.anInt2608 - arg1;
			Static216.anInt4543 = Static38.anInt3056 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static184.anInt2029 = Static118.anInt2608 - arg0;
			Static216.anInt4543 = Static38.anInt3056 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static184.anInt2029 = arg0;
			Static216.anInt4543 = Static38.anInt3056 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static184.anInt2029 = Static118.anInt2608 - arg1;
			Static216.anInt4543 = arg0;
		}
		Static216.anInt4543 &= Static167.anInt3559;
		Static184.anInt2029 &= Static82.anInt1734;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(26) int[] local26 = local18[2];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[0];
			for (@Pc(36) int local36 = 0; local36 < Static118.anInt2608; local36++) {
				this.method2915(arg0, local36);
				@Pc(49) int[][] local49 = this.method3130(Static216.anInt4543, 0);
				local34[local36] = local49[0][Static184.anInt2029];
				local30[local36] = local49[1][Static184.anInt2029];
				local26[local36] = local49[2][Static184.anInt2029];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			for (@Pc(17) int local17 = 0; local17 < Static118.anInt2608; local17++) {
				this.method2915(arg0, local17);
				@Pc(30) int[] local30 = this.method3129(0, Static216.anInt4543);
				local11[local17] = local30[Static184.anInt2029];
			}
		}
		return local11;
	}
}
