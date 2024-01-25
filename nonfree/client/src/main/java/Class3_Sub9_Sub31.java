import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class3_Sub9_Sub31 extends Class3_Sub9 {

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			for (@Pc(17) int local17 = 0; local17 < Static62.anInt1251; local17++) {
				this.method6748(local17, arg0);
				@Pc(30) int[] local30 = this.method9162(Static447.anInt7407, 0);
				local11[local17] = local30[Static51.anInt1089];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean804 = arg0.method8632() == 1;
		}
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(III)V")
	private void method6748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static239.anIntArray394[arg0];
		@Pc(17) int local17 = Static147.anIntArray259[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static51.anInt1089 = arg0;
			Static447.anInt7407 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static51.anInt1089 = arg1;
			Static447.anInt7407 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static447.anInt7407 = arg0;
			Static51.anInt1089 = Static62.anInt1251 - arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static447.anInt7407 = Static452.anInt7497 - arg1;
			Static51.anInt1089 = arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static447.anInt7407 = Static452.anInt7497 - arg1;
			Static51.anInt1089 = Static62.anInt1251 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static51.anInt1089 = Static62.anInt1251 - arg1;
			Static447.anInt7407 = Static452.anInt7497 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static51.anInt1089 = arg1;
			Static447.anInt7407 = Static452.anInt7497 - arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static51.anInt1089 = Static62.anInt1251 - arg0;
			Static447.anInt7407 = arg1;
		}
		Static51.anInt1089 &= Static302.anInt5067;
		Static447.anInt7407 &= Static636.anInt10126;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static62.anInt1251; local34++) {
				this.method6748(local34, arg0);
				@Pc(49) int[][] local49 = this.method9167(0, Static447.anInt7407);
				local24[local34] = local49[0][Static51.anInt1089];
				local28[local34] = local49[1][Static51.anInt1089];
				local32[local34] = local49[2][Static51.anInt1089];
			}
		}
		return local16;
	}
}
