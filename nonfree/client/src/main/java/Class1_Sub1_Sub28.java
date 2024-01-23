import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(20) int[] local20 = local12[0];
			@Pc(24) int[] local24 = local12[1];
			@Pc(28) int[] local28 = local12[2];
			for (@Pc(30) int local30 = 0; local30 < Static131.anInt2513; local30++) {
				this.method3319(local30, arg0);
				@Pc(48) int[][] local48 = this.method4457(0, Static274.anInt5470);
				local20[local30] = local48[0][Static70.anInt1410];
				local24[local30] = local48[1][Static70.anInt1410];
				local28[local30] = local48[2][Static70.anInt1410];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
	private void method3319(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static219.anIntArray515[arg1];
		@Pc(13) int local13 = Static105.anIntArray261[arg0];
		@Pc(32) float local32 = (float) Math.atan2((double) (local13 - 2048), (double) (local9 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static70.anInt1410 = arg0;
			Static274.anInt5470 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static70.anInt1410 = arg1;
			Static274.anInt5470 = arg0;
		} else if (-0.7853981633974483D >= (double) local32 && (double) local32 >= -1.5707963267948966D) {
			Static70.anInt1410 = Static131.anInt2513 - arg1;
			Static274.anInt5470 = arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static274.anInt5470 = Static219.anInt4483 - arg1;
			Static70.anInt1410 = arg0;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static70.anInt1410 = Static131.anInt2513 - arg0;
			Static274.anInt5470 = Static219.anInt4483 - arg1;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static70.anInt1410 = Static131.anInt2513 - arg1;
			Static274.anInt5470 = Static219.anInt4483 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static70.anInt1410 = arg1;
			Static274.anInt5470 = Static219.anInt4483 - arg0;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static274.anInt5470 = arg1;
			Static70.anInt1410 = Static131.anInt2513 - arg0;
		}
		Static70.anInt1410 &= Static11.anInt321;
		Static274.anInt5470 &= Static9.anInt244;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean434 = arg0.method3122() == 1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			for (@Pc(26) int local26 = 0; local26 < Static131.anInt2513; local26++) {
				this.method3319(local26, arg0);
				@Pc(40) int[] local40 = this.method4450(0, Static274.anInt5470);
				local19[local26] = local40[Static70.anInt1410];
			}
		}
		return local19;
	}
}
