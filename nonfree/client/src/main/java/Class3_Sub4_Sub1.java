import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean504 = arg0.method4096() == 1;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZII)V")
	private void method139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static401.anIntArray419[arg0];
		@Pc(17) int local17 = Static317.anIntArray337[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static191.anInt3478 = arg0;
			Static2.anInt21 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static191.anInt3478 = arg1;
			Static2.anInt21 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static191.anInt3478 = Static148.anInt2687 - arg1;
			Static2.anInt21 = arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static2.anInt21 = Static140.anInt2503 - arg1;
			Static191.anInt3478 = arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static2.anInt21 = Static140.anInt2503 - arg1;
			Static191.anInt3478 = Static148.anInt2687 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static191.anInt3478 = Static148.anInt2687 - arg1;
			Static2.anInt21 = Static140.anInt2503 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static2.anInt21 = Static140.anInt2503 - arg0;
			Static191.anInt3478 = arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static191.anInt3478 = Static148.anInt2687 - arg0;
			Static2.anInt21 = arg1;
		}
		Static2.anInt21 &= Static165.anInt2326;
		Static191.anInt3478 &= Static225.anInt3793;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			for (@Pc(22) int local22 = 0; local22 < Static148.anInt2687; local22++) {
				this.method139(local22, arg0);
				@Pc(35) int[] local35 = this.method6139(0, Static2.anInt21);
				local11[local22] = local35[Static191.anInt3478];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static148.anInt2687; local29++) {
				this.method139(local29, arg0);
				@Pc(42) int[][] local42 = this.method6138(Static2.anInt21, 0);
				local19[local29] = local42[0][Static191.anInt3478];
				local23[local29] = local42[1][Static191.anInt3478];
				local27[local29] = local42[2][Static191.anInt3478];
			}
		}
		return local11;
	}
}
