import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean231 = arg0.method2771() == 1;
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(III)V")
	private void method1855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static187.anIntArray362[arg1];
		@Pc(17) int local17 = Static45.anIntArray97[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local17 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static127.anInt2788 = arg0;
			Static164.anInt3667 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static164.anInt3667 = arg0;
			Static127.anInt2788 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static127.anInt2788 = Static115.anInt2578 - arg1;
			Static164.anInt3667 = arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static127.anInt2788 = arg0;
			Static164.anInt3667 = Static31.anInt857 - arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static127.anInt2788 = Static115.anInt2578 - arg0;
			Static164.anInt3667 = Static31.anInt857 - arg1;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static164.anInt3667 = Static31.anInt857 - arg0;
			Static127.anInt2788 = Static115.anInt2578 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static127.anInt2788 = arg1;
			Static164.anInt3667 = Static31.anInt857 - arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static164.anInt3667 = arg1;
			Static127.anInt2788 = Static115.anInt2578 - arg0;
		}
		Static127.anInt2788 &= Static48.anInt1202;
		Static164.anInt3667 &= Static91.anInt2110;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			for (@Pc(13) int local13 = 0; local13 < Static115.anInt2578; local13++) {
				this.method1855(local13, arg0);
				@Pc(26) int[] local26 = this.method3580(Static164.anInt3667, 0);
				local7[local13] = local26[Static127.anInt2788];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(15) int[] local15 = local7[2];
			@Pc(19) int[] local19 = local7[0];
			@Pc(23) int[] local23 = local7[1];
			for (@Pc(25) int local25 = 0; local25 < Static115.anInt2578; local25++) {
				this.method1855(local25, arg0);
				@Pc(38) int[][] local38 = this.method3579(Static164.anInt3667, 0);
				local19[local25] = local38[0][Static127.anInt2788];
				local23[local25] = local38[1][Static127.anInt2788];
				local15[local25] = local38[2][Static127.anInt2788];
			}
		}
		return local7;
	}
}
