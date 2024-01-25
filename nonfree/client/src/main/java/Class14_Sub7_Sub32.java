import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class14_Sub7_Sub32 extends Class14_Sub7 {

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			for (@Pc(17) int local17 = 0; local17 < Static613.anInt10114; local17++) {
				this.method7483(arg0, local17);
				@Pc(30) int[] local30 = this.method9379(0, Static103.anInt1787);
				local11[local17] = local30[Static175.anInt2848];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(III)V")
	private void method7483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static588.anIntArray506[arg1];
		@Pc(18) int local18 = Static655.anIntArray573[arg0];
		@Pc(29) float local29 = (float) Math.atan2((double) (local14 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static175.anInt2848 = arg1;
			Static103.anInt1787 = arg0;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static103.anInt1787 = arg1;
			Static175.anInt2848 = arg0;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static103.anInt1787 = arg1;
			Static175.anInt2848 = Static613.anInt10114 - arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static103.anInt1787 = Static497.anInt8633 - arg0;
			Static175.anInt2848 = arg1;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static175.anInt2848 = Static613.anInt10114 - arg1;
			Static103.anInt1787 = Static497.anInt8633 - arg0;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static103.anInt1787 = Static497.anInt8633 - arg1;
			Static175.anInt2848 = Static613.anInt10114 - arg0;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static175.anInt2848 = arg0;
			Static103.anInt1787 = Static497.anInt8633 - arg1;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static103.anInt1787 = arg0;
			Static175.anInt2848 = Static613.anInt10114 - arg1;
		}
		Static103.anInt1787 &= Static660.anInt6757;
		Static175.anInt2848 &= Static677.anInt11036;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			super.aBoolean773 = arg1.method7695(108) == 1;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			for (@Pc(39) int local39 = 0; local39 < Static613.anInt10114; local39++) {
				this.method7483(arg0, local39);
				@Pc(52) int[][] local52 = this.method9384(Static103.anInt1787, 0);
				local29[local39] = local52[0][Static175.anInt2848];
				local33[local39] = local52[1][Static175.anInt2848];
				local37[local39] = local52[2][Static175.anInt2848];
			}
		}
		return local11;
	}
}
