import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class4_Sub6_Sub9 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean355 = arg0.method1874() == 1;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			for (@Pc(24) int local24 = 0; local24 < Static2.anInt19; local24++) {
				this.method1040(local24, arg0);
				@Pc(38) int[] local38 = this.method4372(0, Static125.anInt2691);
				local13[local24] = local38[Static50.anInt534];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(III)V")
	private void method1040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static273.anIntArray127[arg1];
		@Pc(13) int local13 = Static192.anIntArray318[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local13 - 2048), (double) (local9 - 2048));
		if ((double) local24 >= -3.141592653589793D && -2.356194490192345D >= (double) local24) {
			Static50.anInt534 = arg0;
			Static125.anInt2691 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && -2.356194490192345D <= (double) local24) {
			Static125.anInt2691 = arg0;
			Static50.anInt534 = arg1;
		} else if (-0.7853981633974483D >= (double) local24 && -1.5707963267948966D <= (double) local24) {
			Static50.anInt534 = Static2.anInt19 - arg1;
			Static125.anInt2691 = arg0;
		} else if (local24 <= 0.0F && -0.7853981633974483D <= (double) local24) {
			Static50.anInt534 = arg0;
			Static125.anInt2691 = Static16.anInt308 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static125.anInt2691 = Static16.anInt308 - arg1;
			Static50.anInt534 = Static2.anInt19 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static125.anInt2691 = Static16.anInt308 - arg0;
			Static50.anInt534 = Static2.anInt19 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static50.anInt534 = arg1;
			Static125.anInt2691 = Static16.anInt308 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static50.anInt534 = Static2.anInt19 - arg0;
			Static125.anInt2691 = arg1;
		}
		Static50.anInt534 &= Static168.anInt3337;
		Static125.anInt2691 &= Static137.anInt2812;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static2.anInt19; local35++) {
				this.method1040(local35, arg0);
				@Pc(53) int[][] local53 = this.method4377(Static125.anInt2691, 0);
				local25[local35] = local53[0][Static50.anInt534];
				local29[local35] = local53[1][Static50.anInt534];
				local33[local35] = local53[2][Static50.anInt534];
			}
		}
		return local17;
	}
}
