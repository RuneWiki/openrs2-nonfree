import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class5_Sub6_Sub28 extends Class5_Sub6 {

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean718 = arg0.method3642() == 1;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static421.anInt7443; local34++) {
				this.method6122(arg0, local34);
				@Pc(49) int[][] local49 = this.method8116(0, Static598.anInt9725);
				local24[local34] = local49[0][Static374.anInt7601];
				local28[local34] = local49[1][Static374.anInt7601];
				local32[local34] = local49[2][Static374.anInt7601];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BII)V")
	private void method6122(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static207.anIntArray185[arg1];
		@Pc(17) int local17 = Static508.anIntArray471[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static598.anInt9725 = arg0;
			Static374.anInt7601 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static374.anInt7601 = arg0;
			Static598.anInt9725 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static374.anInt7601 = Static421.anInt7443 - arg0;
			Static598.anInt9725 = arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static374.anInt7601 = arg1;
			Static598.anInt9725 = Static378.anInt6579 - arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static374.anInt7601 = Static421.anInt7443 - arg1;
			Static598.anInt9725 = Static378.anInt6579 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static374.anInt7601 = Static421.anInt7443 - arg0;
			Static598.anInt9725 = Static378.anInt6579 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static374.anInt7601 = arg0;
			Static598.anInt9725 = Static378.anInt6579 - arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static598.anInt9725 = arg0;
			Static374.anInt7601 = Static421.anInt7443 - arg1;
		}
		Static598.anInt9725 &= Static442.anInt7781;
		Static374.anInt7601 &= Static575.anInt9380;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			for (@Pc(22) int local22 = 0; local22 < Static421.anInt7443; local22++) {
				this.method6122(arg0, local22);
				@Pc(35) int[] local35 = this.method8117(Static598.anInt9725, 0);
				local16[local22] = local35[Static374.anInt7601];
			}
		}
		return local16;
	}
}
