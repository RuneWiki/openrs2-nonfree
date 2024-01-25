import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class3_Sub1_Sub32 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static307.anInt4846; local37++) {
				this.method5949(arg0, local37);
				@Pc(50) int[][] local50 = this.method7779(0, Static78.anInt1655);
				local27[local37] = local50[0][Static532.anInt9250];
				local31[local37] = local50[1][Static532.anInt9250];
				local35[local37] = local50[2][Static532.anInt9250];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			super.aBoolean687 = arg1.method7548() == 1;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			for (@Pc(22) int local22 = 0; local22 < Static307.anInt4846; local22++) {
				this.method5949(arg0, local22);
				@Pc(35) int[] local35 = this.method7778(0, Static78.anInt1655);
				local16[local22] = local35[Static532.anInt9250];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZII)V")
	private void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static241.anIntArray759[arg1];
		@Pc(13) int local13 = Static402.anIntArray741[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static78.anInt1655 = arg0;
			Static532.anInt9250 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static78.anInt1655 = arg1;
			Static532.anInt9250 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static78.anInt1655 = arg1;
			Static532.anInt9250 = Static307.anInt4846 - arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static78.anInt1655 = Static397.anInt7340 - arg0;
			Static532.anInt9250 = arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static78.anInt1655 = Static397.anInt7340 - arg0;
			Static532.anInt9250 = Static307.anInt4846 - arg1;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static78.anInt1655 = Static397.anInt7340 - arg1;
			Static532.anInt9250 = Static307.anInt4846 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static532.anInt9250 = arg0;
			Static78.anInt1655 = Static397.anInt7340 - arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static532.anInt9250 = Static307.anInt4846 - arg1;
			Static78.anInt1655 = arg0;
		}
		Static78.anInt1655 &= Static485.anInt8693;
		Static532.anInt9250 &= Static324.anInt6207;
	}
}
