import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean796 = arg0.method5337() == 1;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static395.anInt6592; local34++) {
				this.method227(arg0, local34);
				@Pc(47) int[][] local47 = this.method5696(Static341.anInt5837, 0);
				local24[local34] = local47[0][Static3.anInt5806];
				local28[local34] = local47[1][Static3.anInt5806];
				local32[local34] = local47[2][Static3.anInt5806];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(III)V")
	private void method227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static119.anIntArray146[arg1];
		@Pc(21) int local21 = Static419.anIntArray472[arg0];
		@Pc(32) float local32 = (float) Math.atan2((double) (local9 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static341.anInt5837 = arg0;
			Static3.anInt5806 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static341.anInt5837 = arg1;
			Static3.anInt5806 = arg0;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static3.anInt5806 = Static395.anInt6592 - arg0;
			Static341.anInt5837 = arg1;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static341.anInt5837 = Static186.anInt3223 - arg0;
			Static3.anInt5806 = arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static341.anInt5837 = Static186.anInt3223 - arg0;
			Static3.anInt5806 = Static395.anInt6592 - arg1;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static341.anInt5837 = Static186.anInt3223 - arg1;
			Static3.anInt5806 = Static395.anInt6592 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static341.anInt5837 = Static186.anInt3223 - arg1;
			Static3.anInt5806 = arg0;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static341.anInt5837 = arg0;
			Static3.anInt5806 = Static395.anInt6592 - arg1;
		}
		Static341.anInt5837 &= Static452.anInt7487;
		Static3.anInt5806 &= Static247.anInt4469;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			for (@Pc(17) int local17 = 0; local17 < Static395.anInt6592; local17++) {
				this.method227(arg0, local17);
				@Pc(30) int[] local30 = this.method5695(Static341.anInt5837, 0);
				local11[local17] = local30[Static3.anInt5806];
			}
		}
		return local11;
	}
}
