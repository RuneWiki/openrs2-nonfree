import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class3_Sub6_Sub39 extends Class3_Sub6 {

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZII)V")
	private void method8014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static595.anIntArray600[arg0];
		@Pc(17) int local17 = Static231.anIntArray217[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static182.anInt3986 = arg1;
			Static357.anInt6346 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static357.anInt6346 = arg1;
			Static182.anInt3986 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static357.anInt6346 = Static481.anInt8358 - arg1;
			Static182.anInt3986 = arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static182.anInt3986 = Static465.anInt8091 - arg1;
			Static357.anInt6346 = arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static357.anInt6346 = Static481.anInt8358 - arg0;
			Static182.anInt3986 = Static465.anInt8091 - arg1;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static182.anInt3986 = Static465.anInt8091 - arg0;
			Static357.anInt6346 = Static481.anInt8358 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static357.anInt6346 = arg1;
			Static182.anInt3986 = Static465.anInt8091 - arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static182.anInt3986 = arg1;
			Static357.anInt6346 = Static481.anInt8358 - arg0;
		}
		Static357.anInt6346 &= Static325.anInt5932;
		Static182.anInt3986 &= Static527.anInt10285;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static481.anInt8358; local37++) {
				this.method8014(local37, arg0);
				@Pc(50) int[][] local50 = this.method8005(0, Static182.anInt3986);
				local27[local37] = local50[0][Static357.anInt6346];
				local31[local37] = local50[1][Static357.anInt6346];
				local35[local37] = local50[2][Static357.anInt6346];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			for (@Pc(17) int local17 = 0; local17 < Static481.anInt8358; local17++) {
				this.method8014(local17, arg0);
				@Pc(30) int[] local30 = this.method8001(0, Static182.anInt3986);
				local11[local17] = local30[Static357.anInt6346];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean720 = arg0.method6814() == 1;
		}
	}
}
