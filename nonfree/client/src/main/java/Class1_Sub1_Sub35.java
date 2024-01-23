import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(III)V")
	private void method4098(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static256.anIntArray474[arg0];
		@Pc(13) int local13 = Static3.anIntArray3[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local13 - 2048), (double) (local9 - 2048));
		if (-3.141592653589793D <= (double) local24 && -2.356194490192345D >= (double) local24) {
			Static244.anInt4356 = arg0;
			Static43.anInt1063 = arg1;
		} else if (-1.5707963267948966D >= (double) local24 && -2.356194490192345D <= (double) local24) {
			Static244.anInt4356 = arg1;
			Static43.anInt1063 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static43.anInt1063 = Static62.anInt1350 - arg0;
			Static244.anInt4356 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static43.anInt1063 = arg1;
			Static244.anInt4356 = Static265.anInt5306 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static244.anInt4356 = Static265.anInt5306 - arg0;
			Static43.anInt1063 = Static62.anInt1350 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static244.anInt4356 = Static265.anInt5306 - arg1;
			Static43.anInt1063 = Static62.anInt1350 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static244.anInt4356 = Static265.anInt5306 - arg1;
			Static43.anInt1063 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static244.anInt4356 = arg0;
			Static43.anInt1063 = Static62.anInt1350 - arg1;
		}
		Static244.anInt4356 &= Static279.anInt5616;
		Static43.anInt1063 &= Static302.anInt6003;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean410 = arg0.method2199() == 1;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			for (@Pc(18) int local18 = 0; local18 < Static62.anInt1350; local18++) {
				this.method4098(arg0, local18);
				@Pc(36) int[] local36 = this.method4716(0, Static244.anInt4356);
				local11[local18] = local36[Static43.anInt1063];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static62.anInt1350; local35++) {
				this.method4098(arg0, local35);
				@Pc(49) int[][] local49 = this.method4715(Static244.anInt4356, 0);
				local25[local35] = local49[0][Static43.anInt1063];
				local29[local35] = local49[1][Static43.anInt1063];
				local33[local35] = local49[2][Static43.anInt1063];
			}
		}
		return local17;
	}
}
