import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class2_Sub1_Sub24 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			for (@Pc(22) int local22 = 0; local22 < Static135.anInt2897; local22++) {
				this.method2616(local22, arg0);
				@Pc(35) int[] local35 = this.method3265(Static94.anInt1988, 0);
				local12[local22] = local35[Static210.anInt4186];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static135.anInt2897; local34++) {
				this.method2616(local34, arg0);
				@Pc(47) int[][] local47 = this.method3259(Static94.anInt1988, 0);
				local24[local34] = local47[0][Static210.anInt4186];
				local28[local34] = local47[1][Static210.anInt4186];
				local32[local34] = local47[2][Static210.anInt4186];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean196 = arg0.method260() == 1;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIZ)V")
	private void method2616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static107.anIntArray304[arg0];
		@Pc(13) int local13 = Static81.anIntArray174[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static94.anInt1988 = arg1;
			Static210.anInt4186 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static94.anInt1988 = arg0;
			Static210.anInt4186 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static94.anInt1988 = arg0;
			Static210.anInt4186 = Static135.anInt2897 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static210.anInt4186 = arg0;
			Static94.anInt1988 = Static102.anInt2347 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static94.anInt1988 = Static102.anInt2347 - arg1;
			Static210.anInt4186 = Static135.anInt2897 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static210.anInt4186 = Static135.anInt2897 - arg1;
			Static94.anInt1988 = Static102.anInt2347 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static210.anInt4186 = arg1;
			Static94.anInt1988 = Static102.anInt2347 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static94.anInt1988 = arg1;
			Static210.anInt4186 = Static135.anInt2897 - arg0;
		}
		Static210.anInt4186 &= Static201.anInt3995;
		Static94.anInt1988 &= Static207.anInt4078;
	}
}
