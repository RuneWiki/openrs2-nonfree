import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class4_Sub1_Sub33 extends Class4_Sub1 {

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.aBoolean392 = arg1.method3110() == 1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			for (@Pc(14) int local14 = 0; local14 < Static68.anInt1753; local14++) {
				this.method3785(arg0, local14);
				@Pc(34) int[] local34 = this.method4538(0, Static91.anInt1809);
				local7[local14] = local34[Static189.anInt5670];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)V")
	private void method3785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static10.anIntArray7[arg0];
		@Pc(9) int local9 = Static94.anIntArray163[arg1];
		@Pc(20) float local20 = (float) Math.atan2((double) (local9 - 2048), (double) (local5 - 2048));
		if ((double) local20 >= -3.141592653589793D && (double) local20 <= -2.356194490192345D) {
			Static189.anInt5670 = arg1;
			Static91.anInt1809 = arg0;
		} else if (-1.5707963267948966D >= (double) local20 && (double) local20 >= -2.356194490192345D) {
			Static91.anInt1809 = arg1;
			Static189.anInt5670 = arg0;
		} else if (-0.7853981633974483D >= (double) local20 && (double) local20 >= -1.5707963267948966D) {
			Static189.anInt5670 = Static68.anInt1753 - arg0;
			Static91.anInt1809 = arg1;
		} else if (local20 <= 0.0F && (double) local20 >= -0.7853981633974483D) {
			Static189.anInt5670 = arg1;
			Static91.anInt1809 = Static33.anInt660 - arg0;
		} else if (local20 >= 0.0F && (double) local20 <= 0.7853981633974483D) {
			Static91.anInt1809 = Static33.anInt660 - arg0;
			Static189.anInt5670 = Static68.anInt1753 - arg1;
		} else if ((double) local20 >= 0.7853981633974483D && (double) local20 <= 1.5707963267948966D) {
			Static189.anInt5670 = Static68.anInt1753 - arg0;
			Static91.anInt1809 = Static33.anInt660 - arg1;
		} else if ((double) local20 >= 1.5707963267948966D && (double) local20 <= 2.356194490192345D) {
			Static189.anInt5670 = arg0;
			Static91.anInt1809 = Static33.anInt660 - arg1;
		} else if ((double) local20 >= 2.356194490192345D && (double) local20 <= 3.141592653589793D) {
			Static189.anInt5670 = Static68.anInt1753 - arg1;
			Static91.anInt1809 = arg0;
		}
		Static189.anInt5670 &= Static295.anInt5711;
		Static91.anInt1809 &= Static19.anInt437;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(25) int[] local25 = local16[0];
			@Pc(29) int[] local29 = local16[1];
			@Pc(33) int[] local33 = local16[2];
			for (@Pc(35) int local35 = 0; local35 < Static68.anInt1753; local35++) {
				this.method3785(arg0, local35);
				@Pc(51) int[][] local51 = this.method4549(0, Static91.anInt1809);
				local25[local35] = local51[0][Static189.anInt5670];
				local29[local35] = local51[1][Static189.anInt5670];
				local33[local35] = local51[2][Static189.anInt5670];
			}
		}
		return local16;
	}
}
