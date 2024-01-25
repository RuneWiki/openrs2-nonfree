import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class1_Sub4_Sub13 extends Class1_Sub4 {

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			for (@Pc(25) int local25 = 0; local25 < Static66.anInt1511; local25++) {
				this.method2595(arg0, local25);
				@Pc(40) int[] local40 = this.method5958(Static88.anInt1880, 0);
				local11[local25] = local40[Static262.anInt4673];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			super.aBoolean501 = arg1.method5366() == 1;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static66.anInt1511; local37++) {
				this.method2595(arg0, local37);
				@Pc(50) int[][] local50 = this.method5956(Static88.anInt1880, 0);
				local27[local37] = local50[0][Static262.anInt4673];
				local31[local37] = local50[1][Static262.anInt4673];
				local35[local37] = local50[2][Static262.anInt4673];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "(III)V")
	private void method2595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static121.anIntArray197[arg1];
		@Pc(13) int local13 = Static266.anIntArray628[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static262.anInt4673 = arg1;
			Static88.anInt1880 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static262.anInt4673 = arg0;
			Static88.anInt1880 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static88.anInt1880 = arg1;
			Static262.anInt4673 = Static66.anInt1511 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static262.anInt4673 = arg1;
			Static88.anInt1880 = Static61.anInt1456 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static262.anInt4673 = Static66.anInt1511 - arg1;
			Static88.anInt1880 = Static61.anInt1456 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static88.anInt1880 = Static61.anInt1456 - arg1;
			Static262.anInt4673 = Static66.anInt1511 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static88.anInt1880 = Static61.anInt1456 - arg1;
			Static262.anInt4673 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static262.anInt4673 = Static66.anInt1511 - arg1;
			Static88.anInt1880 = arg0;
		}
		Static262.anInt4673 &= Static393.anInt6315;
		Static88.anInt1880 &= Static67.anInt1514;
	}
}
