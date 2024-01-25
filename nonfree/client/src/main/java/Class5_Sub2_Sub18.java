import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class5_Sub2_Sub18 extends Class5_Sub2 {

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(BII)V")
	private void method4440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static68.anIntArray94[arg1];
		@Pc(13) int local13 = Static61.anIntArray80[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static61.anInt985 = arg0;
			Static475.anInt8690 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static475.anInt8690 = arg0;
			Static61.anInt985 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static61.anInt985 = arg1;
			Static475.anInt8690 = Static314.anInt6320 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static61.anInt985 = Static423.anInt7200 - arg0;
			Static475.anInt8690 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static61.anInt985 = Static423.anInt7200 - arg0;
			Static475.anInt8690 = Static314.anInt6320 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static475.anInt8690 = Static314.anInt6320 - arg0;
			Static61.anInt985 = Static423.anInt7200 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static61.anInt985 = Static423.anInt7200 - arg1;
			Static475.anInt8690 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static475.anInt8690 = Static314.anInt6320 - arg1;
			Static61.anInt985 = arg0;
		}
		Static475.anInt8690 &= Static550.anInt6610;
		Static61.anInt985 &= Static271.anInt4487;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			for (@Pc(22) int local22 = 0; local22 < Static314.anInt6320; local22++) {
				this.method4440(arg0, local22);
				@Pc(35) int[] local35 = this.method8821(Static61.anInt985, 0);
				local11[local22] = local35[Static475.anInt8690];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean834 = arg0.method8645() == 1;
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static314.anInt6320; local34++) {
				this.method4440(arg0, local34);
				@Pc(47) int[][] local47 = this.method8823(Static61.anInt985, 0);
				local24[local34] = local47[0][Static475.anInt8690];
				local28[local34] = local47[1][Static475.anInt8690];
				local32[local34] = local47[2][Static475.anInt8690];
			}
		}
		return local11;
	}
}
