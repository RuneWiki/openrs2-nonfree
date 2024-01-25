import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class2_Sub11_Sub4 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static301.anInt10214; local29++) {
				this.method2225(local29, arg0);
				@Pc(42) int[][] local42 = this.method9538(0, Static228.anInt7273);
				local19[local29] = local42[0][Static584.anInt9205];
				local23[local29] = local42[1][Static584.anInt9205];
				local27[local29] = local42[2][Static584.anInt9205];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BII)V")
	private void method2225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static523.anIntArray461[arg0];
		@Pc(13) int local13 = Static137.anIntArray170[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static228.anInt7273 = arg1;
			Static584.anInt9205 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static584.anInt9205 = arg1;
			Static228.anInt7273 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static228.anInt7273 = arg0;
			Static584.anInt9205 = Static301.anInt10214 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static584.anInt9205 = arg0;
			Static228.anInt7273 = Static609.anInt9448 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static584.anInt9205 = Static301.anInt10214 - arg0;
			Static228.anInt7273 = Static609.anInt9448 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static228.anInt7273 = Static609.anInt9448 - arg0;
			Static584.anInt9205 = Static301.anInt10214 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static228.anInt7273 = Static609.anInt9448 - arg0;
			Static584.anInt9205 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static584.anInt9205 = Static301.anInt10214 - arg0;
			Static228.anInt7273 = arg1;
		}
		Static228.anInt7273 &= Static332.anInt5074;
		Static584.anInt9205 &= Static78.anInt1356;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			for (@Pc(17) int local17 = 0; local17 < Static301.anInt10214; local17++) {
				this.method2225(local17, arg0);
				@Pc(30) int[] local30 = this.method9540(Static228.anInt7273, 0);
				local11[local17] = local30[Static584.anInt9205];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			super.aBoolean936 = arg1.method8581(-17416) == 1;
		}
	}
}
