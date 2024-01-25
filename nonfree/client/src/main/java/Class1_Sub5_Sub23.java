import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class1_Sub5_Sub23 extends Class1_Sub5 {

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static75.anInt1566; local37++) {
				this.method4013(arg0, local37);
				@Pc(50) int[][] local50 = this.method5807(Static284.anInt5722, 0);
				local27[local37] = local50[0][Static310.anInt6186];
				local31[local37] = local50[1][Static310.anInt6186];
				local35[local37] = local50[2][Static310.anInt6186];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean552 = arg0.method5720() == 1;
		}
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(III)V")
	private void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static49.anIntArray492[arg1];
		@Pc(13) int local13 = Static191.anIntArray379[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static284.anInt5722 = arg0;
			Static310.anInt6186 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static284.anInt5722 = arg1;
			Static310.anInt6186 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static310.anInt6186 = Static75.anInt1566 - arg0;
			Static284.anInt5722 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static284.anInt5722 = Static129.anInt2574 - arg0;
			Static310.anInt6186 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static310.anInt6186 = Static75.anInt1566 - arg1;
			Static284.anInt5722 = Static129.anInt2574 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static310.anInt6186 = Static75.anInt1566 - arg0;
			Static284.anInt5722 = Static129.anInt2574 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static310.anInt6186 = arg0;
			Static284.anInt5722 = Static129.anInt2574 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static284.anInt5722 = arg0;
			Static310.anInt6186 = Static75.anInt1566 - arg1;
		}
		Static310.anInt6186 &= Static239.anInt2816;
		Static284.anInt5722 &= Static42.anInt1137;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			for (@Pc(21) int local21 = 0; local21 < Static75.anInt1566; local21++) {
				this.method4013(arg0, local21);
				@Pc(34) int[] local34 = this.method5802(0, Static284.anInt5722);
				local11[local21] = local34[Static310.anInt6186];
			}
		}
		return local11;
	}
}
