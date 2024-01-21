import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V")
	private void method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = Static204.anIntArray179[arg1];
		@Pc(17) int local17 = Static193.anIntArray277[arg0];
		@Pc(32) float local32 = (float) Math.atan2((double) (local5 - 2048), (double) (local17 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static180.anInt4469 = arg1;
			Static110.anInt2382 = arg0;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static180.anInt4469 = arg0;
			Static110.anInt2382 = arg1;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static110.anInt2382 = arg1;
			Static180.anInt4469 = Static107.anInt2321 - arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static110.anInt2382 = Static123.anInt2607 - arg0;
			Static180.anInt4469 = arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static180.anInt4469 = Static107.anInt2321 - arg1;
			Static110.anInt2382 = Static123.anInt2607 - arg0;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static180.anInt4469 = Static107.anInt2321 - arg0;
			Static110.anInt2382 = Static123.anInt2607 - arg1;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static110.anInt2382 = Static123.anInt2607 - arg1;
			Static180.anInt4469 = arg0;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static110.anInt2382 = arg0;
			Static180.anInt4469 = Static107.anInt2321 - arg1;
		}
		Static110.anInt2382 &= Static15.anInt388;
		Static180.anInt4469 &= Static144.anInt2893;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			for (@Pc(23) int local23 = 0; local23 < Static107.anInt2321; local23++) {
				this.method1757(arg0, local23);
				@Pc(36) int[] local36 = this.method3393(Static110.anInt2382, 0);
				local17[local23] = local36[Static180.anInt4469];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean241 = arg0.method3010() == 1;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(24) int[] local24 = local16[1];
			@Pc(28) int[] local28 = local16[2];
			@Pc(32) int[] local32 = local16[0];
			for (@Pc(34) int local34 = 0; local34 < Static107.anInt2321; local34++) {
				this.method1757(arg0, local34);
				@Pc(47) int[][] local47 = this.method3397(0, Static110.anInt2382);
				local32[local34] = local47[0][Static180.anInt4469];
				local24[local34] = local47[1][Static180.anInt4469];
				local28[local34] = local47[2][Static180.anInt4469];
			}
		}
		return local16;
	}
}
