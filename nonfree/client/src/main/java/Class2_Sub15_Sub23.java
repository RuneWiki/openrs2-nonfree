import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class2_Sub15_Sub23 extends Class2_Sub15 {

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean803 = arg1.method5203() == 1;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIB)V")
	private void method7110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static537.anIntArray480[arg1];
		@Pc(13) int local13 = Static401.anIntArray357[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static585.anInt10186 = arg0;
			Static88.anInt1641 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static585.anInt10186 = arg1;
			Static88.anInt1641 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static88.anInt1641 = Static329.anInt6017 - arg0;
			Static585.anInt10186 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static585.anInt10186 = Static667.anInt10615 - arg0;
			Static88.anInt1641 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static88.anInt1641 = Static329.anInt6017 - arg1;
			Static585.anInt10186 = Static667.anInt10615 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static585.anInt10186 = Static667.anInt10615 - arg1;
			Static88.anInt1641 = Static329.anInt6017 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static585.anInt10186 = Static667.anInt10615 - arg1;
			Static88.anInt1641 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static585.anInt10186 = arg0;
			Static88.anInt1641 = Static329.anInt6017 - arg1;
		}
		Static585.anInt10186 &= Static426.anInt11132;
		Static88.anInt1641 &= Static386.anInt7302;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			for (@Pc(22) int local22 = 0; local22 < Static329.anInt6017; local22++) {
				this.method7110(arg0, local22);
				@Pc(37) int[] local37 = this.method9725(0, Static585.anInt10186);
				local16[local22] = local37[Static88.anInt1641];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static329.anInt6017; local29++) {
				this.method7110(arg0, local29);
				@Pc(42) int[][] local42 = this.method9727(0, Static585.anInt10186);
				local19[local29] = local42[0][Static88.anInt1641];
				local23[local29] = local42[1][Static88.anInt1641];
				local27[local29] = local42[2][Static88.anInt1641];
			}
		}
		return local11;
	}
}
