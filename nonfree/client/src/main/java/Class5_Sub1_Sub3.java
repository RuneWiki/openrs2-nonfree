import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class5_Sub1_Sub3 extends Class5_Sub1 {

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			for (@Pc(24) int local24 = 0; local24 < Static648.anInt9588; local24++) {
				this.method1433(local24, arg0);
				@Pc(39) int[] local39 = this.method9210(0, Static318.anInt5640);
				local18[local24] = local39[Static113.anInt1827];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(26) int[] local26 = local11[0];
			@Pc(30) int[] local30 = local11[1];
			@Pc(34) int[] local34 = local11[2];
			for (@Pc(36) int local36 = 0; local36 < Static648.anInt9588; local36++) {
				this.method1433(local36, arg0);
				@Pc(49) int[][] local49 = this.method9203(0, Static318.anInt5640);
				local26[local36] = local49[0][Static113.anInt1827];
				local30[local36] = local49[1][Static113.anInt1827];
				local34[local36] = local49[2][Static113.anInt1827];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			super.aBoolean786 = arg1.method8529() == 1;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZII)V")
	private void method1433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static293.anIntArray288[arg0];
		@Pc(18) int local18 = Static23.anIntArray27[arg1];
		@Pc(29) float local29 = (float) Math.atan2((double) (local9 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static113.anInt1827 = arg0;
			Static318.anInt5640 = arg1;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static113.anInt1827 = arg1;
			Static318.anInt5640 = arg0;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static113.anInt1827 = Static648.anInt9588 - arg1;
			Static318.anInt5640 = arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static113.anInt1827 = arg0;
			Static318.anInt5640 = Static269.anInt4686 - arg1;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static113.anInt1827 = Static648.anInt9588 - arg0;
			Static318.anInt5640 = Static269.anInt4686 - arg1;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static113.anInt1827 = Static648.anInt9588 - arg1;
			Static318.anInt5640 = Static269.anInt4686 - arg0;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static318.anInt5640 = Static269.anInt4686 - arg0;
			Static113.anInt1827 = arg1;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static113.anInt1827 = Static648.anInt9588 - arg0;
			Static318.anInt5640 = arg1;
		}
		Static113.anInt1827 &= Static116.anInt3312;
		Static318.anInt5640 &= Static542.anInt9254;
	}
}
