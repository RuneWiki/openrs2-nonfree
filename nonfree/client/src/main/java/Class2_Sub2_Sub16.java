import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "[I")
	public static final int[] anIntArray208 = new int[4096];

	static {
		for (@Pc(7) int local7 = 0; local7 < 4096; local7++) {
			anIntArray208[local7] = Static415.method5239(local7);
		}
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)V")
	private void method2178(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static145.anIntArray199[arg1];
		@Pc(13) int local13 = Static405.anIntArray555[arg0];
		@Pc(32) float local32 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static164.anInt4840 = arg0;
			Static222.anInt5739 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static164.anInt4840 = arg1;
			Static222.anInt5739 = arg0;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static164.anInt4840 = arg1;
			Static222.anInt5739 = Static217.anInt3574 - arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static164.anInt4840 = Static290.anInt4775 - arg0;
			Static222.anInt5739 = arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static164.anInt4840 = Static290.anInt4775 - arg0;
			Static222.anInt5739 = Static217.anInt3574 - arg1;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static164.anInt4840 = Static290.anInt4775 - arg1;
			Static222.anInt5739 = Static217.anInt3574 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static222.anInt5739 = arg0;
			Static164.anInt4840 = Static290.anInt4775 - arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static164.anInt4840 = arg0;
			Static222.anInt5739 = Static217.anInt3574 - arg1;
		}
		Static164.anInt4840 &= Static157.anInt2698;
		Static222.anInt5739 &= Static127.anInt2287;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			for (@Pc(24) int local24 = 0; local24 < Static217.anInt3574; local24++) {
				this.method2178(arg0, local24);
				@Pc(37) int[] local37 = this.method5472(Static164.anInt4840, 0);
				local18[local24] = local37[Static222.anInt5739];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static217.anInt3574; local34++) {
				this.method2178(arg0, local34);
				@Pc(49) int[][] local49 = this.method5474(0, Static164.anInt4840);
				local24[local34] = local49[0][Static222.anInt5739];
				local28[local34] = local49[1][Static222.anInt5739];
				local32[local34] = local49[2][Static222.anInt5739];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean509 = arg0.method3580() == 1;
		}
	}
}
