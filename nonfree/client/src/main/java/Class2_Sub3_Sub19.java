import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class2_Sub3_Sub19 extends Class2_Sub3 {

	static {
		new Class140(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(28) int[] local28 = local20[0];
			@Pc(32) int[] local32 = local20[1];
			@Pc(36) int[] local36 = local20[2];
			for (@Pc(38) int local38 = 0; local38 < Static263.anInt5504; local38++) {
				this.method3465(local38, arg0);
				@Pc(51) int[][] local51 = this.method5707(Static16.anInt273, 0);
				local28[local38] = local51[0][Static94.anInt1826];
				local32[local38] = local51[1][Static94.anInt1826];
				local36[local38] = local51[2][Static94.anInt1826];
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			for (@Pc(22) int local22 = 0; local22 < Static263.anInt5504; local22++) {
				this.method3465(local22, arg0);
				@Pc(35) int[] local35 = this.method5700(0, Static16.anInt273);
				local16[local22] = local35[Static94.anInt1826];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			super.aBoolean606 = arg1.method3124() == 1;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(IBI)V")
	private void method3465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static269.anIntArray507[arg0];
		@Pc(18) int local18 = Static76.anIntArray121[arg1];
		@Pc(29) float local29 = (float) Math.atan2((double) (local9 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static16.anInt273 = arg1;
			Static94.anInt1826 = arg0;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static94.anInt1826 = arg1;
			Static16.anInt273 = arg0;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static94.anInt1826 = Static263.anInt5504 - arg1;
			Static16.anInt273 = arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static16.anInt273 = Static363.anInt6995 - arg1;
			Static94.anInt1826 = arg0;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static94.anInt1826 = Static263.anInt5504 - arg0;
			Static16.anInt273 = Static363.anInt6995 - arg1;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static16.anInt273 = Static363.anInt6995 - arg0;
			Static94.anInt1826 = Static263.anInt5504 - arg1;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static16.anInt273 = Static363.anInt6995 - arg0;
			Static94.anInt1826 = arg1;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static16.anInt273 = arg1;
			Static94.anInt1826 = Static263.anInt5504 - arg0;
		}
		Static16.anInt273 &= Static241.anInt5135;
		Static94.anInt1826 &= Static171.anInt3863;
	}
}
