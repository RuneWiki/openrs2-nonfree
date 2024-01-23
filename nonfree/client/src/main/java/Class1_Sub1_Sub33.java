import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BII)V")
	private void method3497(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static36.anIntArray81[arg1];
		@Pc(21) int local21 = Static187.anIntArray345[arg0];
		@Pc(32) float local32 = (float) Math.atan2((double) (local17 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static189.anInt4166 = arg1;
			Static210.anInt4519 = arg0;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static189.anInt4166 = arg0;
			Static210.anInt4519 = arg1;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static210.anInt4519 = arg1;
			Static189.anInt4166 = Static11.anInt294 - arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static189.anInt4166 = arg1;
			Static210.anInt4519 = Static116.anInt2571 - arg0;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static189.anInt4166 = Static11.anInt294 - arg1;
			Static210.anInt4519 = Static116.anInt2571 - arg0;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static189.anInt4166 = Static11.anInt294 - arg0;
			Static210.anInt4519 = Static116.anInt2571 - arg1;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static210.anInt4519 = Static116.anInt2571 - arg1;
			Static189.anInt4166 = arg0;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static189.anInt4166 = Static11.anInt294 - arg1;
			Static210.anInt4519 = arg0;
		}
		Static189.anInt4166 &= Static147.anInt3169;
		Static210.anInt4519 &= Static30.anInt589;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean442 = arg0.method2945() == 1;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			for (@Pc(22) int local22 = 0; local22 < Static11.anInt294; local22++) {
				this.method3497(arg0, local22);
				@Pc(35) int[] local35 = this.method3706(Static210.anInt4519, 0);
				local11[local22] = local35[Static189.anInt4166];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static11.anInt294; local34++) {
				this.method3497(arg0, local34);
				@Pc(47) int[][] local47 = this.method3713(Static210.anInt4519, 0);
				local24[local34] = local47[0][Static189.anInt4166];
				local28[local34] = local47[1][Static189.anInt4166];
				local32[local34] = local47[2][Static189.anInt4166];
			}
		}
		return local16;
	}
}
