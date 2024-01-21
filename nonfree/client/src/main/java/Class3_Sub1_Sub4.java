import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			for (@Pc(22) int local22 = 0; local22 < Static129.anInt3285; local22++) {
				this.method404(local22, arg0);
				@Pc(35) int[] local35 = this.method3120(0, Static31.anInt959);
				local7[local22] = local35[Static151.anInt3730];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)V")
	private void method404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static22.anIntArray152[arg1];
		@Pc(21) int local21 = Static146.anIntArray618[arg0];
		@Pc(36) float local36 = (float) Math.atan2((double) (local21 - 2048), (double) (local5 - 2048));
		if ((double) local36 >= -3.141592653589793D && (double) local36 <= -2.356194490192345D) {
			Static151.anInt3730 = arg0;
			Static31.anInt959 = arg1;
		} else if ((double) local36 <= -1.5707963267948966D && (double) local36 >= -2.356194490192345D) {
			Static31.anInt959 = arg0;
			Static151.anInt3730 = arg1;
		} else if ((double) local36 <= -0.7853981633974483D && (double) local36 >= -1.5707963267948966D) {
			Static151.anInt3730 = Static129.anInt3285 - arg1;
			Static31.anInt959 = arg0;
		} else if (local36 <= 0.0F && (double) local36 >= -0.7853981633974483D) {
			Static151.anInt3730 = arg0;
			Static31.anInt959 = Static104.anInt2685 - arg1;
		} else if (local36 >= 0.0F && (double) local36 <= 0.7853981633974483D) {
			Static151.anInt3730 = Static129.anInt3285 - arg0;
			Static31.anInt959 = Static104.anInt2685 - arg1;
		} else if ((double) local36 >= 0.7853981633974483D && (double) local36 <= 1.5707963267948966D) {
			Static151.anInt3730 = Static129.anInt3285 - arg1;
			Static31.anInt959 = Static104.anInt2685 - arg0;
		} else if ((double) local36 >= 1.5707963267948966D && (double) local36 <= 2.356194490192345D) {
			Static31.anInt959 = Static104.anInt2685 - arg0;
			Static151.anInt3730 = arg1;
		} else if ((double) local36 >= 2.356194490192345D && (double) local36 <= 3.141592653589793D) {
			Static151.anInt3730 = Static129.anInt3285 - arg0;
			Static31.anInt959 = arg1;
		}
		Static31.anInt959 &= Static106.anInt2755;
		Static151.anInt3730 &= Static105.anInt2733;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean191 = arg1.method1545() == 1;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass2_39.method10(arg0);
		@Pc(23) int[] local23 = local19[0];
		@Pc(27) int[] local27 = local19[1];
		@Pc(31) int[] local31 = local19[2];
		if (super.aClass2_39.aBoolean1) {
			for (@Pc(37) int local37 = 0; local37 < Static129.anInt3285; local37++) {
				this.method404(local37, arg0);
				@Pc(50) int[][] local50 = this.method3124(0, Static31.anInt959);
				local23[local37] = local50[0][Static151.anInt3730];
				local27[local37] = local50[1][Static151.anInt3730];
				local31[local37] = local50[2][Static151.anInt3730];
			}
		}
		return local19;
	}
}
