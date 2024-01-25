import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class4_Sub6_Sub34 extends Class4_Sub6 {

	static {
		new Class159("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(III)V")
	private void method5141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = Static339.anIntArray4[arg0];
		@Pc(21) int local21 = Static128.anIntArray265[arg1];
		@Pc(32) float local32 = (float) Math.atan2((double) (local17 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static325.anInt6225 = arg1;
			Static205.anInt4314 = arg0;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static205.anInt4314 = arg1;
			Static325.anInt6225 = arg0;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static325.anInt6225 = arg0;
			Static205.anInt4314 = Static31.anInt797 - arg1;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static205.anInt4314 = arg0;
			Static325.anInt6225 = Static223.anInt4562 - arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static325.anInt6225 = Static223.anInt4562 - arg1;
			Static205.anInt4314 = Static31.anInt797 - arg0;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static205.anInt4314 = Static31.anInt797 - arg1;
			Static325.anInt6225 = Static223.anInt4562 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static325.anInt6225 = Static223.anInt4562 - arg0;
			Static205.anInt4314 = arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static325.anInt6225 = arg1;
			Static205.anInt4314 = Static31.anInt797 - arg0;
		}
		Static205.anInt4314 &= Static335.anInt6403;
		Static325.anInt6225 &= Static341.anInt266;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean489 = arg1.method3440() == 1;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static31.anInt797; local34++) {
				this.method5141(local34, arg0);
				@Pc(47) int[][] local47 = this.method5693(0, Static325.anInt6225);
				local24[local34] = local47[0][Static205.anInt4314];
				local28[local34] = local47[1][Static205.anInt4314];
				local32[local34] = local47[2][Static205.anInt4314];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			for (@Pc(25) int local25 = 0; local25 < Static31.anInt797; local25++) {
				this.method5141(local25, arg0);
				@Pc(38) int[] local38 = this.method5702(Static325.anInt6225, 0);
				local19[local25] = local38[Static205.anInt4314];
			}
		}
		return local19;
	}
}
