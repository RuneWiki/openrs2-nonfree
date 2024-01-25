import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static501.anInt8748; local34++) {
				this.method1392(local34, arg0);
				@Pc(49) int[][] local49 = this.method7833(0, Static290.anInt5278);
				local24[local34] = local49[0][Static260.anInt4747];
				local28[local34] = local49[1][Static260.anInt4747];
				local32[local34] = local49[2][Static260.anInt4747];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			super.aBoolean711 = arg1.method7974() == 1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)V")
	private void method1392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static95.anIntArray77[arg0];
		@Pc(13) int local13 = Static583.anIntArray614[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static260.anInt4747 = arg0;
			Static290.anInt5278 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static290.anInt5278 = arg0;
			Static260.anInt4747 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static260.anInt4747 = Static501.anInt8748 - arg1;
			Static290.anInt5278 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static260.anInt4747 = arg0;
			Static290.anInt5278 = Static8.anInt5990 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static260.anInt4747 = Static501.anInt8748 - arg0;
			Static290.anInt5278 = Static8.anInt5990 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static290.anInt5278 = Static8.anInt5990 - arg0;
			Static260.anInt4747 = Static501.anInt8748 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static290.anInt5278 = Static8.anInt5990 - arg0;
			Static260.anInt4747 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static290.anInt5278 = arg1;
			Static260.anInt4747 = Static501.anInt8748 - arg0;
		}
		Static290.anInt5278 &= Static98.anInt1743;
		Static260.anInt4747 &= Static326.anInt4973;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			for (@Pc(17) int local17 = 0; local17 < Static501.anInt8748; local17++) {
				this.method1392(local17, arg0);
				@Pc(32) int[] local32 = this.method7836(Static290.anInt5278, 0);
				local11[local17] = local32[Static260.anInt4747];
			}
		}
		return local11;
	}
}
