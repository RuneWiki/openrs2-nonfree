import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(III)V")
	private void method2454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static175.anIntArray302[arg1];
		@Pc(13) int local13 = Static94.anIntArray321[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static225.anInt4488 = arg0;
			Static53.anInt1469 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static225.anInt4488 = arg1;
			Static53.anInt1469 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static53.anInt1469 = Static110.anInt2934 - arg0;
			Static225.anInt4488 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static225.anInt4488 = Static166.anInt3882 - arg0;
			Static53.anInt1469 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static225.anInt4488 = Static166.anInt3882 - arg0;
			Static53.anInt1469 = Static110.anInt2934 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static225.anInt4488 = Static166.anInt3882 - arg1;
			Static53.anInt1469 = Static110.anInt2934 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static53.anInt1469 = arg0;
			Static225.anInt4488 = Static166.anInt3882 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static225.anInt4488 = arg0;
			Static53.anInt1469 = Static110.anInt2934 - arg1;
		}
		Static53.anInt1469 &= Static2.anInt38;
		Static225.anInt4488 &= Static42.anInt1193;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(19) int[] local19 = local11[1];
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static110.anInt2934; local29++) {
				this.method2454(arg0, local29);
				@Pc(42) int[][] local42 = this.method4129(0, Static225.anInt4488);
				local23[local29] = local42[0][Static53.anInt1469];
				local19[local29] = local42[1][Static53.anInt1469];
				local27[local29] = local42[2][Static53.anInt1469];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			for (@Pc(13) int local13 = 0; local13 < Static110.anInt2934; local13++) {
				this.method2454(arg0, local13);
				@Pc(26) int[] local26 = this.method4117(0, Static225.anInt4488);
				local7[local13] = local26[Static53.anInt1469];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean275 = arg0.method1772() == 1;
		}
	}
}
