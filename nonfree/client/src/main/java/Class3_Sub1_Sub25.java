import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class3_Sub1_Sub25 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean728 = arg0.method3118() == 1;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(22) int[] local22 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			for (@Pc(28) int local28 = 0; local28 < Static206.anInt4182; local28++) {
				this.method5063(local28, arg0);
				@Pc(41) int[] local41 = this.method7765(0, Static328.anInt5890);
				local22[local28] = local41[Static207.anInt4190];
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)V")
	private void method5063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static329.anIntArray456[arg0];
		@Pc(13) int local13 = Static9.anIntArray15[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static207.anInt4190 = arg0;
			Static328.anInt5890 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static328.anInt5890 = arg0;
			Static207.anInt4190 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static207.anInt4190 = Static206.anInt4182 - arg1;
			Static328.anInt5890 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static207.anInt4190 = arg0;
			Static328.anInt5890 = Static245.anInt4535 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static207.anInt4190 = Static206.anInt4182 - arg0;
			Static328.anInt5890 = Static245.anInt4535 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static328.anInt5890 = Static245.anInt4535 - arg0;
			Static207.anInt4190 = Static206.anInt4182 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static207.anInt4190 = arg1;
			Static328.anInt5890 = Static245.anInt4535 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static207.anInt4190 = Static206.anInt4182 - arg0;
			Static328.anInt5890 = arg1;
		}
		Static207.anInt4190 &= Static439.anInt7283;
		Static328.anInt5890 &= Static469.anInt7679;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static206.anInt4182; local29++) {
				this.method5063(local29, arg0);
				@Pc(42) int[][] local42 = this.method7766(0, Static328.anInt5890);
				local19[local29] = local42[0][Static207.anInt4190];
				local23[local29] = local42[1][Static207.anInt4190];
				local27[local29] = local42[2][Static207.anInt4190];
			}
		}
		return local11;
	}
}
