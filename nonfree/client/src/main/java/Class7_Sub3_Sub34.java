import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class7_Sub3_Sub34 extends Class7_Sub3 {

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(III)V")
	private void method5053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static185.anIntArray298[arg1];
		@Pc(13) int local13 = Static203.anIntArray322[arg0];
		@Pc(32) float local32 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static139.anInt2664 = arg1;
			Static256.anInt4317 = arg0;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static139.anInt2664 = arg0;
			Static256.anInt4317 = arg1;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static256.anInt4317 = arg1;
			Static139.anInt2664 = Static58.anInt1052 - arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static256.anInt4317 = Static383.anInt6175 - arg0;
			Static139.anInt2664 = arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static256.anInt4317 = Static383.anInt6175 - arg0;
			Static139.anInt2664 = Static58.anInt1052 - arg1;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static139.anInt2664 = Static58.anInt1052 - arg0;
			Static256.anInt4317 = Static383.anInt6175 - arg1;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static256.anInt4317 = Static383.anInt6175 - arg1;
			Static139.anInt2664 = arg0;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static139.anInt2664 = Static58.anInt1052 - arg1;
			Static256.anInt4317 = arg0;
		}
		Static256.anInt4317 &= Static25.anInt366;
		Static139.anInt2664 &= Static410.anInt6497;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			super.aBoolean490 = arg1.method3981() == 1;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			for (@Pc(25) int local25 = 0; local25 < Static58.anInt1052; local25++) {
				this.method5053(arg0, local25);
				@Pc(38) int[] local38 = this.method5591(0, Static256.anInt4317);
				local19[local25] = local38[Static139.anInt2664];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static58.anInt1052; local34++) {
				this.method5053(arg0, local34);
				@Pc(47) int[][] local47 = this.method5597(0, Static256.anInt4317);
				local24[local34] = local47[0][Static139.anInt2664];
				local28[local34] = local47[1][Static139.anInt2664];
				local32[local34] = local47[2][Static139.anInt2664];
			}
		}
		return local16;
	}
}
