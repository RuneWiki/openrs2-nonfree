import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class6_Sub3_Sub7 extends Class6_Sub3 {

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(28) int[] local28 = local20[0];
			@Pc(32) int[] local32 = local20[1];
			@Pc(36) int[] local36 = local20[2];
			for (@Pc(38) int local38 = 0; local38 < Static35.anInt670; local38++) {
				this.method1180(local38, arg0);
				@Pc(51) int[][] local51 = this.method7961(Static290.anInt5327, 0);
				local28[local38] = local51[0][Static192.anInt3745];
				local32[local38] = local51[1][Static192.anInt3745];
				local36[local38] = local51[2][Static192.anInt3745];
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			for (@Pc(22) int local22 = 0; local22 < Static35.anInt670; local22++) {
				this.method1180(local22, arg0);
				@Pc(35) int[] local35 = this.method7950(0, Static290.anInt5327);
				local16[local22] = local35[Static192.anInt3745];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(III)V")
	private void method1180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static372.anIntArray481[arg0];
		@Pc(13) int local13 = Static77.anIntArray116[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static192.anInt3745 = arg0;
			Static290.anInt5327 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static290.anInt5327 = arg0;
			Static192.anInt3745 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static192.anInt3745 = Static35.anInt670 - arg1;
			Static290.anInt5327 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static192.anInt3745 = arg0;
			Static290.anInt5327 = Static170.anInt3133 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static192.anInt3745 = Static35.anInt670 - arg0;
			Static290.anInt5327 = Static170.anInt3133 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static290.anInt5327 = Static170.anInt3133 - arg0;
			Static192.anInt3745 = Static35.anInt670 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static290.anInt5327 = Static170.anInt3133 - arg0;
			Static192.anInt3745 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static192.anInt3745 = Static35.anInt670 - arg0;
			Static290.anInt5327 = arg1;
		}
		Static290.anInt5327 &= Static132.anInt2511;
		Static192.anInt3745 &= Static147.anInt2781;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			super.aBoolean674 = arg1.method6019() == 1;
		}
	}
}
