import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(III)V")
	private void method3183(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static434.anIntArray495[arg1];
		@Pc(21) int local21 = Static258.anIntArray335[arg0];
		@Pc(32) float local32 = (float) Math.atan2((double) (local9 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static89.anInt1209 = arg0;
			Static220.anInt4036 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static89.anInt1209 = arg1;
			Static220.anInt4036 = arg0;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static89.anInt1209 = arg1;
			Static220.anInt4036 = Static218.anInt3990 - arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static220.anInt4036 = arg1;
			Static89.anInt1209 = Static54.anInt778 - arg0;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static220.anInt4036 = Static218.anInt3990 - arg1;
			Static89.anInt1209 = Static54.anInt778 - arg0;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static220.anInt4036 = Static218.anInt3990 - arg0;
			Static89.anInt1209 = Static54.anInt778 - arg1;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static220.anInt4036 = arg0;
			Static89.anInt1209 = Static54.anInt778 - arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static89.anInt1209 = arg0;
			Static220.anInt4036 = Static218.anInt3990 - arg1;
		}
		Static220.anInt4036 &= Static147.anInt2302;
		Static89.anInt1209 &= Static464.anInt6761;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			for (@Pc(22) int local22 = 0; local22 < Static218.anInt3990; local22++) {
				this.method3183(arg0, local22);
				@Pc(35) int[] local35 = this.method5964(Static89.anInt1209, 0);
				local16[local22] = local35[Static220.anInt4036];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static218.anInt3990; local34++) {
				this.method3183(arg0, local34);
				@Pc(51) int[][] local51 = this.method5968(0, Static89.anInt1209);
				local24[local34] = local51[0][Static220.anInt4036];
				local28[local34] = local51[1][Static220.anInt4036];
				local32[local34] = local51[2][Static220.anInt4036];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean650 = arg0.method2915() == 1;
		}
	}
}
