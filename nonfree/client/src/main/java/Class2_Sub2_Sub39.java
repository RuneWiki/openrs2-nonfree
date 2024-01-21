import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class2_Sub2_Sub39 extends Class2_Sub2 {

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static106.anInt3045; local37++) {
				this.method3574(arg0, local37);
				@Pc(50) int[][] local50 = this.method3557(Static157.anInt3984, 0);
				local27[local37] = local50[0][Static120.anInt3326];
				local31[local37] = local50[1][Static120.anInt3326];
				local35[local37] = local50[2][Static120.anInt3326];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)V")
	private void method3574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static15.anIntArray41[arg1];
		@Pc(19) int local19 = Static160.anIntArray187[arg0];
		@Pc(30) float local30 = (float) Math.atan2((double) (local9 - 2048), (double) (local19 - 2048));
		if ((double) local30 >= -3.141592653589793D && (double) local30 <= -2.356194490192345D) {
			Static157.anInt3984 = arg0;
			Static120.anInt3326 = arg1;
		} else if ((double) local30 <= -1.5707963267948966D && (double) local30 >= -2.356194490192345D) {
			Static157.anInt3984 = arg1;
			Static120.anInt3326 = arg0;
		} else if ((double) local30 <= -0.7853981633974483D && (double) local30 >= -1.5707963267948966D) {
			Static120.anInt3326 = Static106.anInt3045 - arg0;
			Static157.anInt3984 = arg1;
		} else if (local30 <= 0.0F && (double) local30 >= -0.7853981633974483D) {
			Static120.anInt3326 = arg1;
			Static157.anInt3984 = Static57.anInt1795 - arg0;
		} else if (local30 >= 0.0F && (double) local30 <= 0.7853981633974483D) {
			Static157.anInt3984 = Static57.anInt1795 - arg0;
			Static120.anInt3326 = Static106.anInt3045 - arg1;
		} else if ((double) local30 >= 0.7853981633974483D && (double) local30 <= 1.5707963267948966D) {
			Static157.anInt3984 = Static57.anInt1795 - arg1;
			Static120.anInt3326 = Static106.anInt3045 - arg0;
		} else if ((double) local30 >= 1.5707963267948966D && (double) local30 <= 2.356194490192345D) {
			Static120.anInt3326 = arg0;
			Static157.anInt3984 = Static57.anInt1795 - arg1;
		} else if ((double) local30 >= 2.356194490192345D && (double) local30 <= 3.141592653589793D) {
			Static120.anInt3326 = Static106.anInt3045 - arg1;
			Static157.anInt3984 = arg0;
		}
		Static120.anInt3326 &= Static96.anInt3099;
		Static157.anInt3984 &= Static53.anInt1668;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			super.aBoolean183 = arg1.method218() == 1;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			for (@Pc(23) int local23 = 0; local23 < Static106.anInt3045; local23++) {
				this.method3574(arg0, local23);
				@Pc(36) int[] local36 = this.method3569(Static157.anInt3984, 0);
				local17[local23] = local36[Static120.anInt3326];
			}
		}
		return local17;
	}
}
