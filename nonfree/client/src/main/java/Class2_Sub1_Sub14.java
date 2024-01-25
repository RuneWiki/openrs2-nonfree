import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			super.aBoolean498 = arg1.method5732() == 1;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			for (@Pc(24) int local24 = 0; local24 < Static391.anInt7118; local24++) {
				this.method2327(arg0, local24);
				@Pc(37) int[] local37 = this.method6069(0, Static182.anInt3891);
				local18[local24] = local37[Static51.anInt1113];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)V")
	private void method2327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static167.anIntArray267[arg1];
		@Pc(13) int local13 = Static229.anIntArray382[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static51.anInt1113 = arg1;
			Static182.anInt3891 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static51.anInt1113 = arg0;
			Static182.anInt3891 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static182.anInt3891 = arg1;
			Static51.anInt1113 = Static391.anInt7118 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static51.anInt1113 = arg1;
			Static182.anInt3891 = Static299.anInt5583 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static182.anInt3891 = Static299.anInt5583 - arg0;
			Static51.anInt1113 = Static391.anInt7118 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static182.anInt3891 = Static299.anInt5583 - arg1;
			Static51.anInt1113 = Static391.anInt7118 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static51.anInt1113 = arg0;
			Static182.anInt3891 = Static299.anInt5583 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static182.anInt3891 = arg0;
			Static51.anInt1113 = Static391.anInt7118 - arg1;
		}
		Static182.anInt3891 &= Static67.anInt1510;
		Static51.anInt1113 &= Static235.anInt4676;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static391.anInt7118; local29++) {
				this.method2327(arg0, local29);
				@Pc(42) int[][] local42 = this.method6061(0, Static182.anInt3891);
				local19[local29] = local42[0][Static51.anInt1113];
				local23[local29] = local42[1][Static51.anInt1113];
				local27[local29] = local42[2][Static51.anInt1113];
			}
		}
		return local11;
	}
}
