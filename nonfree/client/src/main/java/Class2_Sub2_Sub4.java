import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static153.anInt3070; local34++) {
				this.method1124(arg0, local34);
				@Pc(47) int[][] local47 = this.method7947(0, Static319.anInt5940);
				local24[local34] = local47[0][Static75.anInt1654];
				local28[local34] = local47[1][Static75.anInt1654];
				local32[local34] = local47[2][Static75.anInt1654];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			for (@Pc(25) int local25 = 0; local25 < Static153.anInt3070; local25++) {
				this.method1124(arg0, local25);
				@Pc(38) int[] local38 = this.method7951(Static319.anInt5940, 0);
				local19[local25] = local38[Static75.anInt1654];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(IBI)V")
	private void method1124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static260.anIntArray327[arg1];
		@Pc(13) int local13 = Static211.anIntArray576[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static319.anInt5940 = arg0;
			Static75.anInt1654 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static319.anInt5940 = arg1;
			Static75.anInt1654 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static319.anInt5940 = arg1;
			Static75.anInt1654 = Static153.anInt3070 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static75.anInt1654 = arg1;
			Static319.anInt5940 = Static377.anInt6692 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static75.anInt1654 = Static153.anInt3070 - arg1;
			Static319.anInt5940 = Static377.anInt6692 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static75.anInt1654 = Static153.anInt3070 - arg0;
			Static319.anInt5940 = Static377.anInt6692 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static319.anInt5940 = Static377.anInt6692 - arg1;
			Static75.anInt1654 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static319.anInt5940 = arg0;
			Static75.anInt1654 = Static153.anInt3070 - arg1;
		}
		Static319.anInt5940 &= Static28.anInt6368;
		Static75.anInt1654 &= Static431.anInt7305;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean729 = arg0.method4325() == 1;
		}
	}
}
