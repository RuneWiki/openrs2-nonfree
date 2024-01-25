import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			super.aBoolean696 = arg1.method4393() == 1;
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(III)V")
	private void method6011(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static436.anIntArray506[arg1];
		@Pc(21) int local21 = Static337.anIntArray406[arg0];
		@Pc(32) float local32 = (float) Math.atan2((double) (local17 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static470.anInt7978 = arg0;
			Static517.anInt8561 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static470.anInt7978 = arg1;
			Static517.anInt8561 = arg0;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static470.anInt7978 = arg1;
			Static517.anInt8561 = Static87.anInt1964 - arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static470.anInt7978 = Static4.anInt81 - arg0;
			Static517.anInt8561 = arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static470.anInt7978 = Static4.anInt81 - arg0;
			Static517.anInt8561 = Static87.anInt1964 - arg1;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static470.anInt7978 = Static4.anInt81 - arg1;
			Static517.anInt8561 = Static87.anInt1964 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static517.anInt8561 = arg0;
			Static470.anInt7978 = Static4.anInt81 - arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static470.anInt7978 = arg0;
			Static517.anInt8561 = Static87.anInt1964 - arg1;
		}
		Static470.anInt7978 &= Static561.anInt6003;
		Static517.anInt8561 &= Static451.anInt8721;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			for (@Pc(27) int local27 = 0; local27 < Static87.anInt1964; local27++) {
				this.method6011(arg0, local27);
				@Pc(40) int[] local40 = this.method7882(0, Static470.anInt7978);
				local21[local27] = local40[Static517.anInt8561];
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static87.anInt1964; local34++) {
				this.method6011(arg0, local34);
				@Pc(47) int[][] local47 = this.method7880(Static470.anInt7978, 0);
				local24[local34] = local47[0][Static517.anInt8561];
				local28[local34] = local47[1][Static517.anInt8561];
				local32[local34] = local47[2][Static517.anInt8561];
			}
		}
		return local16;
	}
}
