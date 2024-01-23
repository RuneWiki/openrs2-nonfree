import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static22.anInt421; local35++) {
				this.method191(arg0, local35);
				@Pc(53) int[][] local53 = this.method4965(Static301.anInt5942, 0);
				local25[local35] = local53[0][Static270.anInt5509];
				local29[local35] = local53[1][Static270.anInt5509];
				local33[local35] = local53[2][Static270.anInt5509];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.aBoolean430 = arg1.method3915() == 1;
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			for (@Pc(23) int local23 = 0; local23 < Static22.anInt421; local23++) {
				this.method191(arg0, local23);
				@Pc(37) int[] local37 = this.method4954(Static301.anInt5942, 0);
				local17[local23] = local37[Static270.anInt5509];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(III)V")
	private void method191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = Static205.anIntArray450[arg0];
		@Pc(13) int local13 = Static185.anIntArray424[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local13 - 2048), (double) (local5 - 2048));
		if (-3.141592653589793D <= (double) local24 && -2.356194490192345D >= (double) local24) {
			Static270.anInt5509 = arg1;
			Static301.anInt5942 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && -2.356194490192345D <= (double) local24) {
			Static270.anInt5509 = arg0;
			Static301.anInt5942 = arg1;
		} else if (-0.7853981633974483D >= (double) local24 && -1.5707963267948966D <= (double) local24) {
			Static301.anInt5942 = arg1;
			Static270.anInt5509 = Static22.anInt421 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static270.anInt5509 = arg1;
			Static301.anInt5942 = Static62.anInt1150 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static270.anInt5509 = Static22.anInt421 - arg1;
			Static301.anInt5942 = Static62.anInt1150 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static301.anInt5942 = Static62.anInt1150 - arg1;
			Static270.anInt5509 = Static22.anInt421 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static301.anInt5942 = Static62.anInt1150 - arg1;
			Static270.anInt5509 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static270.anInt5509 = Static22.anInt421 - arg1;
			Static301.anInt5942 = arg0;
		}
		Static301.anInt5942 &= Static148.anInt2810;
		Static270.anInt5509 &= Static84.anInt1566;
	}
}
