import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class6_Sub1_Sub17 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(23) int[] local23 = local15[0];
			@Pc(27) int[] local27 = local15[1];
			@Pc(31) int[] local31 = local15[2];
			for (@Pc(33) int local33 = 0; local33 < Static479.anInt8231; local33++) {
				this.method3696(local33, arg0);
				@Pc(46) int[][] local46 = this.method8959(Static554.anInt9291, 0);
				local23[local33] = local46[0][Static493.anInt8353];
				local27[local33] = local46[1][Static493.anInt8353];
				local31[local33] = local46[2][Static493.anInt8353];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean736 = arg0.method8374() == 1;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			for (@Pc(22) int local22 = 0; local22 < Static479.anInt8231; local22++) {
				this.method3696(local22, arg0);
				@Pc(35) int[] local35 = this.method8963(0, Static554.anInt9291);
				local11[local22] = local35[Static493.anInt8353];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)V")
	private void method3696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static205.anIntArray199[arg0];
		@Pc(13) int local13 = Static230.anIntArray222[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static554.anInt9291 = arg1;
			Static493.anInt8353 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static493.anInt8353 = arg1;
			Static554.anInt9291 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static554.anInt9291 = arg0;
			Static493.anInt8353 = Static479.anInt8231 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static554.anInt9291 = Static434.anInt7425 - arg1;
			Static493.anInt8353 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static493.anInt8353 = Static479.anInt8231 - arg0;
			Static554.anInt9291 = Static434.anInt7425 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static493.anInt8353 = Static479.anInt8231 - arg1;
			Static554.anInt9291 = Static434.anInt7425 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static493.anInt8353 = arg1;
			Static554.anInt9291 = Static434.anInt7425 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static493.anInt8353 = Static479.anInt8231 - arg0;
			Static554.anInt9291 = arg1;
		}
		Static554.anInt9291 &= Static476.anInt8174;
		Static493.anInt8353 &= Static413.anInt7225;
	}
}
