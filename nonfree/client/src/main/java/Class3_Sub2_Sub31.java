import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class3_Sub2_Sub31 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(III)V")
	private void method7065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static352.anIntArray400[arg0];
		@Pc(13) int local13 = Static328.anIntArray387[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static177.anInt4211 = arg1;
			Static211.anInt4910 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static177.anInt4211 = arg0;
			Static211.anInt4910 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static177.anInt4211 = arg0;
			Static211.anInt4910 = Static164.anInt8839 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static177.anInt4211 = Static638.anInt10476 - arg1;
			Static211.anInt4910 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static177.anInt4211 = Static638.anInt10476 - arg1;
			Static211.anInt4910 = Static164.anInt8839 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static211.anInt4910 = Static164.anInt8839 - arg1;
			Static177.anInt4211 = Static638.anInt10476 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static177.anInt4211 = Static638.anInt10476 - arg0;
			Static211.anInt4910 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static211.anInt4910 = Static164.anInt8839 - arg0;
			Static177.anInt4211 = arg1;
		}
		Static177.anInt4211 &= Static46.anInt1029;
		Static211.anInt4910 &= Static52.anInt1120;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			super.aBoolean855 = arg1.method8401() == 1;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static164.anInt8839; local29++) {
				this.method7065(local29, arg0);
				@Pc(44) int[][] local44 = this.method8337(0, Static177.anInt4211);
				local19[local29] = local44[0][Static211.anInt4910];
				local23[local29] = local44[1][Static211.anInt4910];
				local27[local29] = local44[2][Static211.anInt4910];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			for (@Pc(25) int local25 = 0; local25 < Static164.anInt8839; local25++) {
				this.method7065(local25, arg0);
				@Pc(38) int[] local38 = this.method8340(Static177.anInt4211, 0);
				local11[local25] = local38[Static211.anInt4910];
			}
		}
		return local11;
	}
}
