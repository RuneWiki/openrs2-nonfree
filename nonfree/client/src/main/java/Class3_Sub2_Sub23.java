import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class3_Sub2_Sub23 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static491.anInt8519; local29++) {
				this.method6768(local29, arg0);
				@Pc(44) int[][] local44 = this.method8595(Static175.anInt3396, 0);
				local19[local29] = local44[0][Static614.anInt9933];
				local23[local29] = local44[1][Static614.anInt9933];
				local27[local29] = local44[2][Static614.anInt9933];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			for (@Pc(17) int local17 = 0; local17 < Static491.anInt8519; local17++) {
				this.method6768(local17, arg0);
				@Pc(30) int[] local30 = this.method8603(Static175.anInt3396, 0);
				local11[local17] = local30[Static614.anInt9933];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pha", name = "d", descriptor = "(III)V")
	private void method6768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static546.anIntArray582[arg0];
		@Pc(17) int local17 = Static372.anIntArray207[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static175.anInt3396 = arg1;
			Static614.anInt9933 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static614.anInt9933 = arg1;
			Static175.anInt3396 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static614.anInt9933 = Static491.anInt8519 - arg1;
			Static175.anInt3396 = arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static614.anInt9933 = arg0;
			Static175.anInt3396 = Static336.anInt6310 - arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static614.anInt9933 = Static491.anInt8519 - arg0;
			Static175.anInt3396 = Static336.anInt6310 - arg1;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static175.anInt3396 = Static336.anInt6310 - arg0;
			Static614.anInt9933 = Static491.anInt8519 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static175.anInt3396 = Static336.anInt6310 - arg0;
			Static614.anInt9933 = arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static175.anInt3396 = arg1;
			Static614.anInt9933 = Static491.anInt8519 - arg0;
		}
		Static614.anInt9933 &= Static309.anInt5846;
		Static175.anInt3396 &= Class4_Sub1_Sub3_Sub2.lb;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean720 = arg0.method4225() == 1;
		}
	}
}
