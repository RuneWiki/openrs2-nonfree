import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class3_Sub8_Sub20 extends Class3_Sub8 {

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static91.anInt1849; local34++) {
				this.method6015(arg0, local34);
				@Pc(47) int[][] local47 = this.method8779(0, Static109.anInt2040);
				local24[local34] = local47[0][Static574.anInt9255];
				local28[local34] = local47[1][Static574.anInt9255];
				local32[local34] = local47[2][Static574.anInt9255];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			for (@Pc(25) int local25 = 0; local25 < Static91.anInt1849; local25++) {
				this.method6015(arg0, local25);
				@Pc(38) int[] local38 = this.method8776(Static109.anInt2040, 0);
				local19[local25] = local38[Static574.anInt9255];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			super.aBoolean737 = arg1.method7954() == 1;
		}
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(III)V")
	private void method6015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static13.anIntArray11[arg1];
		@Pc(18) int local18 = Static510.anIntArray172[arg0];
		@Pc(29) float local29 = (float) Math.atan2((double) (local9 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static574.anInt9255 = arg1;
			Static109.anInt2040 = arg0;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static109.anInt2040 = arg1;
			Static574.anInt9255 = arg0;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static109.anInt2040 = arg1;
			Static574.anInt9255 = Static91.anInt1849 - arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static109.anInt2040 = Static589.anInt9553 - arg0;
			Static574.anInt9255 = arg1;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static109.anInt2040 = Static589.anInt9553 - arg0;
			Static574.anInt9255 = Static91.anInt1849 - arg1;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static109.anInt2040 = Static589.anInt9553 - arg1;
			Static574.anInt9255 = Static91.anInt1849 - arg0;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static109.anInt2040 = Static589.anInt9553 - arg1;
			Static574.anInt9255 = arg0;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static574.anInt9255 = Static91.anInt1849 - arg1;
			Static109.anInt2040 = arg0;
		}
		Static109.anInt2040 &= Static635.anInt10496;
		Static574.anInt9255 &= Static348.anInt5973;
	}
}
