import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class2_Sub4_Sub5 extends Class2_Sub4 {

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IBI)V")
	private void method1293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static20.anIntArray40[arg0];
		@Pc(13) int local13 = Static415.anIntArray482[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static22.anInt469 = arg1;
			Static90.anInt2214 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static22.anInt469 = arg0;
			Static90.anInt2214 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static22.anInt469 = arg0;
			Static90.anInt2214 = Static395.anInt6816 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static22.anInt469 = Static118.anInt2485 - arg1;
			Static90.anInt2214 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static90.anInt2214 = Static395.anInt6816 - arg0;
			Static22.anInt469 = Static118.anInt2485 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static90.anInt2214 = Static395.anInt6816 - arg1;
			Static22.anInt469 = Static118.anInt2485 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static22.anInt469 = Static118.anInt2485 - arg0;
			Static90.anInt2214 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static22.anInt469 = arg1;
			Static90.anInt2214 = Static395.anInt6816 - arg0;
		}
		Static90.anInt2214 &= Static104.anInt2340;
		Static22.anInt469 &= Static463.anInt7489;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean763 = arg0.method2859() == 1;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			for (@Pc(22) int local22 = 0; local22 < Static395.anInt6816; local22++) {
				this.method1293(local22, arg0);
				@Pc(35) int[] local35 = this.method8892(Static22.anInt469, 0);
				local11[local22] = local35[Static90.anInt2214];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static395.anInt6816; local34++) {
				this.method1293(local34, arg0);
				@Pc(47) int[][] local47 = this.method8898(0, Static22.anInt469);
				local24[local34] = local47[0][Static90.anInt2214];
				local28[local34] = local47[1][Static90.anInt2214];
				local32[local34] = local47[2][Static90.anInt2214];
			}
		}
		return local11;
	}
}
