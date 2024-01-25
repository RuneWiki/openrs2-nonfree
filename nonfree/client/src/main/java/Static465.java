import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "Z")
	public static boolean aBoolean723;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
	public static int anInt8425;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "Lclient!kha;")
	public static Class181 aClass181_93;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "Lclient!us;")
	public static final Class344 aClass344_97 = new Class344(23, 7);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!tn;)Lclient!pd;")
	public static Class41 method6957(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(15) Class117 local15 = Static505.method7370()[arg0.method8401()];
		@Pc(22) Class178 local22 = Static324.method5445()[arg0.method8401()];
		@Pc(26) int local26 = arg0.method8444();
		@Pc(30) int local30 = arg0.method8444();
		@Pc(34) int local34 = arg0.method8414();
		@Pc(38) int local38 = arg0.method8414();
		@Pc(42) int local42 = arg0.method8444();
		@Pc(46) int local46 = arg0.method8402();
		@Pc(50) int local50 = arg0.method8402();
		return new Class41(local15, local22, local26, local30, local34, local38, local42, local46, local50);
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)I")
	public static int method6960() {
		if ((double) Static361.aFloat89 == 3.0D) {
			return 37;
		} else if ((double) Static361.aFloat89 == 4.0D) {
			return 50;
		} else if ((double) Static361.aFloat89 == 6.0D) {
			return 75;
		} else if ((double) Static361.aFloat89 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
