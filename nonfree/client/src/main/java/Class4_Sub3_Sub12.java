import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class4_Sub3_Sub12 extends Class4_Sub3 {

	static {
		new Class21("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static304.anInt5637; local37++) {
				this.method2466(arg0, local37);
				@Pc(50) int[][] local50 = this.method6331(Static196.anInt7589, 0);
				local27[local37] = local50[0][Static256.anInt4946];
				local31[local37] = local50[1][Static256.anInt4946];
				local35[local37] = local50[2][Static256.anInt4946];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			super.aBoolean587 = arg1.method4614() == 1;
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			for (@Pc(24) int local24 = 0; local24 < Static304.anInt5637; local24++) {
				this.method2466(arg0, local24);
				@Pc(39) int[] local39 = this.method6337(0, Static196.anInt7589);
				local18[local24] = local39[Static256.anInt4946];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIB)V")
	private void method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static231.anIntArray368[arg1];
		@Pc(13) int local13 = Static376.anIntArray531[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static256.anInt4946 = arg1;
			Static196.anInt7589 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static196.anInt7589 = arg1;
			Static256.anInt4946 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static196.anInt7589 = arg1;
			Static256.anInt4946 = Static304.anInt5637 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static196.anInt7589 = Static191.anInt3822 - arg0;
			Static256.anInt4946 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static256.anInt4946 = Static304.anInt5637 - arg1;
			Static196.anInt7589 = Static191.anInt3822 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static256.anInt4946 = Static304.anInt5637 - arg0;
			Static196.anInt7589 = Static191.anInt3822 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static256.anInt4946 = arg0;
			Static196.anInt7589 = Static191.anInt3822 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static196.anInt7589 = arg0;
			Static256.anInt4946 = Static304.anInt5637 - arg1;
		}
		Static196.anInt7589 &= Static429.anInt7355;
		Static256.anInt4946 &= Static279.anInt5254;
	}
}
