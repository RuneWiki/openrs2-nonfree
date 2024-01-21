import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class3_Sub2_Sub19 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean190 = arg0.method1278() == 1;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZII)V")
	private void method1745(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static34.anIntArray37[arg0];
		@Pc(9) int local9 = Static133.anIntArray187[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local5 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static42.anInt880 = arg1;
			Static188.anInt3823 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static42.anInt880 = arg0;
			Static188.anInt3823 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static42.anInt880 = Static190.anInt3865 - arg0;
			Static188.anInt3823 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static188.anInt3823 = Static97.anInt2014 - arg0;
			Static42.anInt880 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static188.anInt3823 = Static97.anInt2014 - arg0;
			Static42.anInt880 = Static190.anInt3865 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static42.anInt880 = Static190.anInt3865 - arg0;
			Static188.anInt3823 = Static97.anInt2014 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static42.anInt880 = arg0;
			Static188.anInt3823 = Static97.anInt2014 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static42.anInt880 = Static190.anInt3865 - arg1;
			Static188.anInt3823 = arg0;
		}
		Static188.anInt3823 &= Static170.anInt1101;
		Static42.anInt880 &= Static134.anInt2681;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static190.anInt3865; local37++) {
				this.method1745(arg0, local37);
				@Pc(50) int[][] local50 = this.method3332(0, Static188.anInt3823);
				local27[local37] = local50[0][Static42.anInt880];
				local31[local37] = local50[1][Static42.anInt880];
				local35[local37] = local50[2][Static42.anInt880];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			for (@Pc(17) int local17 = 0; local17 < Static190.anInt3865; local17++) {
				this.method1745(arg0, local17);
				@Pc(30) int[] local30 = this.method3328(0, Static188.anInt3823);
				local11[local17] = local30[Static42.anInt880];
			}
		}
		return local11;
	}
}
