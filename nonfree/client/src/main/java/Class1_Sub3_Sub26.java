import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class1_Sub3_Sub26 extends Class1_Sub3 {

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean614 = arg0.method3922() == 1;
		}
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(IBI)V")
	private void method5155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static228.anIntArray442[arg1];
		@Pc(13) int local13 = Static7.anIntArray20[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static345.anInt6182 = arg1;
			Static294.anInt5493 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static345.anInt6182 = arg0;
			Static294.anInt5493 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static294.anInt5493 = arg1;
			Static345.anInt6182 = Static452.anInt7734 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static345.anInt6182 = arg1;
			Static294.anInt5493 = Static272.anInt5156 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static294.anInt5493 = Static272.anInt5156 - arg0;
			Static345.anInt6182 = Static452.anInt7734 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static345.anInt6182 = Static452.anInt7734 - arg0;
			Static294.anInt5493 = Static272.anInt5156 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static294.anInt5493 = Static272.anInt5156 - arg1;
			Static345.anInt6182 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static294.anInt5493 = arg0;
			Static345.anInt6182 = Static452.anInt7734 - arg1;
		}
		Static294.anInt5493 &= Static323.anInt5914;
		Static345.anInt6182 &= Static80.anInt1453;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			for (@Pc(24) int local24 = 0; local24 < Static452.anInt7734; local24++) {
				this.method5155(arg0, local24);
				@Pc(39) int[] local39 = this.method7128(0, Static294.anInt5493);
				local13[local24] = local39[Static345.anInt6182];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static452.anInt7734; local34++) {
				this.method5155(arg0, local34);
				@Pc(47) int[][] local47 = this.method7130(Static294.anInt5493, 0);
				local24[local34] = local47[0][Static345.anInt6182];
				local28[local34] = local47[1][Static345.anInt6182];
				local32[local34] = local47[2][Static345.anInt6182];
			}
		}
		return local11;
	}
}
