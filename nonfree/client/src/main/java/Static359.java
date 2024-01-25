import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!uq", name = "V", descriptor = "Lclient!aq;")
	public static Class5 aClass5_15;

	@OriginalMember(owner = "client!uq", name = "H", descriptor = "Lclient!cd;")
	public static final Class30 aClass30_1 = Static88.method1529();

	@OriginalMember(owner = "client!uq", name = "S", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_228 = new Class221("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!uq", name = "W", descriptor = "I")
	public static int anInt6306 = 0;

	@OriginalMember(owner = "client!uq", name = "X", descriptor = "I")
	public static int anInt6307 = -1;

	@OriginalMember(owner = "client!uq", name = "Y", descriptor = "[I")
	public static final int[] anIntArray761 = new int[5];

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Lclient!lk;I)V")
	public static void method5429(@OriginalArg(0) Class2_Sub13 arg0) {
		if (arg0.aByteArray77.length - arg0.anInt4788 < 1) {
			return;
		}
		@Pc(26) int local26 = arg0.method4240();
		if (local26 < 0 || local26 > 1 || arg0.aByteArray77.length - arg0.anInt4788 < 2) {
			return;
		}
		@Pc(51) int local51 = arg0.method4245();
		if (local51 * 6 != arg0.aByteArray77.length - arg0.anInt4788) {
			return;
		}
		while (true) {
			@Pc(71) int local71;
			@Pc(75) int local75;
			do {
				do {
					do {
						if (arg0.anInt4788 >= arg0.aByteArray77.length) {
							return;
						}
						local71 = arg0.method4245();
						local75 = arg0.method4239();
					} while (local71 >= Static61.anIntArray162.length);
				} while (!Static267.aBooleanArray110[local71]);
			} while (Static165.aClass172_1.method4077(local71).aChar1 == '1' && (local75 < -1 || local75 > 1));
			Static61.anIntArray162[local71] = local75;
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)V")
	public static void method5433() {
		Static267.aClass82_6.method4519(Static327.anInt5764, Static116.aBoolean177 ? Static69.anInt1310 + 256 : -1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIBII)I")
	public static int method5437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(10) int local10 = arg0;
			arg0 = arg2;
			arg2 = local10;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1 + 7 - arg0 - arg4;
		} else if (local3 == 2) {
			return 1 + 7 - arg2 - arg1;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)V")
	public static void method5438() {
		Static226.aBoolean325 = false;
		Static251.anInt4517 = 1;
		Static332.anInt5818 = 0;
		Static217.anInt4042 = -3;
		Static281.anInt4956 = 0;
		Static5.anInt6727 = -1;
		Static68.anInt1298 = 0;
	}
}
