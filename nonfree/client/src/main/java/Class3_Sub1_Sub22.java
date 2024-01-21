import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class3_Sub1_Sub22 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			super.aBoolean171 = arg1.method191() == 1;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass48_39.method1402(arg0);
		@Pc(23) int[] local23 = local19[1];
		@Pc(27) int[] local27 = local19[0];
		@Pc(31) int[] local31 = local19[2];
		if (super.aClass48_39.aBoolean87) {
			for (@Pc(37) int local37 = 0; local37 < Static141.anInt3261; local37++) {
				this.method1596(local37, arg0);
				@Pc(50) int[][] local50 = this.method2913(Static3.anInt82, 0);
				local27[local37] = local50[0][Static34.anInt937];
				local23[local37] = local50[1][Static34.anInt937];
				local31[local37] = local50[2][Static34.anInt937];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			for (@Pc(17) int local17 = 0; local17 < Static141.anInt3261; local17++) {
				this.method1596(local17, arg0);
				@Pc(30) int[] local30 = this.method2904(0, Static3.anInt82);
				local7[local17] = local30[Static34.anInt937];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IBI)V")
	private void method1596(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static125.anIntArray336[arg1];
		@Pc(13) int local13 = Static85.anIntArray47[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local13 - 2048), (double) (local9 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static34.anInt937 = arg0;
			Static3.anInt82 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static3.anInt82 = arg0;
			Static34.anInt937 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static3.anInt82 = arg0;
			Static34.anInt937 = Static141.anInt3261 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static3.anInt82 = Static141.anInt3259 - arg1;
			Static34.anInt937 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static3.anInt82 = Static141.anInt3259 - arg1;
			Static34.anInt937 = Static141.anInt3261 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static3.anInt82 = Static141.anInt3259 - arg0;
			Static34.anInt937 = Static141.anInt3261 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static3.anInt82 = Static141.anInt3259 - arg0;
			Static34.anInt937 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static3.anInt82 = arg1;
			Static34.anInt937 = Static141.anInt3261 - arg0;
		}
		Static3.anInt82 &= Static169.anInt3754;
		Static34.anInt937 &= Static67.anInt1764;
	}
}
