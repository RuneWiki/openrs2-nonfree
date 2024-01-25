import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class4_Sub1_Sub13 extends Class4_Sub1 {

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			for (@Pc(25) int local25 = 0; local25 < Static376.anInt7260; local25++) {
				this.method3799(local25, arg0);
				@Pc(38) int[] local38 = this.method8392(Static400.anInt7642, 0);
				local19[local25] = local38[Static223.anInt4079];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IBI)V")
	private void method3799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static292.anIntArray394[arg0];
		@Pc(17) int local17 = Static442.anIntArray449[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static400.anInt7642 = arg1;
			Static223.anInt4079 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static400.anInt7642 = arg0;
			Static223.anInt4079 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static223.anInt4079 = Static376.anInt7260 - arg1;
			Static400.anInt7642 = arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static400.anInt7642 = Static477.anInt8774 - arg1;
			Static223.anInt4079 = arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static223.anInt4079 = Static376.anInt7260 - arg0;
			Static400.anInt7642 = Static477.anInt8774 - arg1;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static400.anInt7642 = Static477.anInt8774 - arg0;
			Static223.anInt4079 = Static376.anInt7260 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static223.anInt4079 = arg1;
			Static400.anInt7642 = Static477.anInt8774 - arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static400.anInt7642 = arg1;
			Static223.anInt4079 = Static376.anInt7260 - arg0;
		}
		Static400.anInt7642 &= Static237.anInt4286;
		Static223.anInt4079 &= Static569.anInt9982;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static376.anInt7260; local34++) {
				this.method3799(local34, arg0);
				@Pc(49) int[][] local49 = this.method8385(Static400.anInt7642, 0);
				local24[local34] = local49[0][Static223.anInt4079];
				local28[local34] = local49[1][Static223.anInt4079];
				local32[local34] = local49[2][Static223.anInt4079];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean726 = arg1.method4905() == 1;
		}
	}
}
