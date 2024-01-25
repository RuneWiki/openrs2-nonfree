import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(IIB)V")
	private void method289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static365.anIntArray535[arg1];
		@Pc(18) int local18 = Static318.anIntArray565[arg0];
		@Pc(29) float local29 = (float) Math.atan2((double) (local14 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static69.anInt1559 = arg1;
			Static59.anInt1327 = arg0;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static69.anInt1559 = arg0;
			Static59.anInt1327 = arg1;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static69.anInt1559 = Static429.anInt6518 - arg0;
			Static59.anInt1327 = arg1;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static59.anInt1327 = Static51.anInt1129 - arg0;
			Static69.anInt1559 = arg1;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static69.anInt1559 = Static429.anInt6518 - arg1;
			Static59.anInt1327 = Static51.anInt1129 - arg0;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static69.anInt1559 = Static429.anInt6518 - arg0;
			Static59.anInt1327 = Static51.anInt1129 - arg1;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static69.anInt1559 = arg0;
			Static59.anInt1327 = Static51.anInt1129 - arg1;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static69.anInt1559 = Static429.anInt6518 - arg1;
			Static59.anInt1327 = arg0;
		}
		Static69.anInt1559 &= Static303.anInt5406;
		Static59.anInt1327 &= Static246.anInt4669;
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			for (@Pc(17) int local17 = 0; local17 < Static429.anInt6518; local17++) {
				this.method289(arg0, local17);
				@Pc(30) int[] local30 = this.method5839(Static59.anInt1327, 0);
				local11[local17] = local30[Static69.anInt1559];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean488 = arg0.method5495() == 1;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static429.anInt6518; local37++) {
				this.method289(arg0, local37);
				@Pc(50) int[][] local50 = this.method5840(Static59.anInt1327, 0);
				local27[local37] = local50[0][Static69.anInt1559];
				local31[local37] = local50[1][Static69.anInt1559];
				local35[local37] = local50[2][Static69.anInt1559];
			}
		}
		return local19;
	}
}
