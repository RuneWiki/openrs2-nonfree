import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class2_Sub6_Sub29 extends Class2_Sub6 {

	static {
		new Class221("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static151.anInt2711; local34++) {
				this.method4179(arg0, local34);
				@Pc(47) int[][] local47 = this.method5640(0, Static63.anInt1243);
				local24[local34] = local47[0][Static359.anInt6306];
				local28[local34] = local47[1][Static359.anInt6306];
				local32[local34] = local47[2][Static359.anInt6306];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			for (@Pc(22) int local22 = 0; local22 < Static151.anInt2711; local22++) {
				this.method4179(arg0, local22);
				@Pc(35) int[] local35 = this.method5635(Static63.anInt1243, 0);
				local16[local22] = local35[Static359.anInt6306];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)V")
	private void method4179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static160.anIntArray329[arg1];
		@Pc(13) int local13 = Static138.anIntArray291[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static359.anInt6306 = arg1;
			Static63.anInt1243 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static63.anInt1243 = arg1;
			Static359.anInt6306 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static359.anInt6306 = Static151.anInt2711 - arg0;
			Static63.anInt1243 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static63.anInt1243 = Static372.anInt6520 - arg0;
			Static359.anInt6306 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static63.anInt1243 = Static372.anInt6520 - arg0;
			Static359.anInt6306 = Static151.anInt2711 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static359.anInt6306 = Static151.anInt2711 - arg0;
			Static63.anInt1243 = Static372.anInt6520 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static359.anInt6306 = arg0;
			Static63.anInt1243 = Static372.anInt6520 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static63.anInt1243 = arg0;
			Static359.anInt6306 = Static151.anInt2711 - arg1;
		}
		Static63.anInt1243 &= Static71.anInt1349;
		Static359.anInt6306 &= Static274.anInt1078;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean491 = arg0.method4240() == 1;
		}
	}
}
