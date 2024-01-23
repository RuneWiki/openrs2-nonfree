import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class8_Sub3_Sub13 extends Class8_Sub3 {

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			for (@Pc(24) int local24 = 0; local24 < Static239.anInt4789; local24++) {
				this.method1229(arg0, local24);
				@Pc(42) int[] local42 = this.method4230(Static45.anInt5487, 0);
				local13[local24] = local42[Static55.anInt1228];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
	private void method1229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static171.anIntArray258[arg1];
		@Pc(13) int local13 = Static33.anIntArray50[arg0];
		@Pc(29) float local29 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if (-3.141592653589793D <= (double) local29 && (double) local29 <= -2.356194490192345D) {
			Static55.anInt1228 = arg1;
			Static45.anInt5487 = arg0;
		} else if (-1.5707963267948966D >= (double) local29 && -2.356194490192345D <= (double) local29) {
			Static45.anInt5487 = arg1;
			Static55.anInt1228 = arg0;
		} else if (-0.7853981633974483D >= (double) local29 && -1.5707963267948966D <= (double) local29) {
			Static55.anInt1228 = Static239.anInt4789 - arg0;
			Static45.anInt5487 = arg1;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static45.anInt5487 = Static86.anInt1852 - arg0;
			Static55.anInt1228 = arg1;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static45.anInt5487 = Static86.anInt1852 - arg0;
			Static55.anInt1228 = Static239.anInt4789 - arg1;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static55.anInt1228 = Static239.anInt4789 - arg0;
			Static45.anInt5487 = Static86.anInt1852 - arg1;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static45.anInt5487 = Static86.anInt1852 - arg1;
			Static55.anInt1228 = arg0;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static45.anInt5487 = arg0;
			Static55.anInt1228 = Static239.anInt4789 - arg1;
		}
		Static45.anInt5487 &= Static51.anInt1120;
		Static55.anInt1228 &= Static214.anInt4402;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(19) int[] local19 = local11[1];
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static239.anInt4789; local29++) {
				this.method1229(arg0, local29);
				@Pc(51) int[][] local51 = this.method4224(Static45.anInt5487, 0);
				local23[local29] = local51[0][Static55.anInt1228];
				local19[local29] = local51[1][Static55.anInt1228];
				local27[local29] = local51[2][Static55.anInt1228];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.aBoolean469 = arg1.method2334() == 1;
		}
	}
}
