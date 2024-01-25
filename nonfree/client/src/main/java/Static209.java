import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array15;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "[I")
	public static int[] anIntArray371 = new int[2];

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Z")
	public static boolean aBoolean434 = false;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public static int anInt4724 = 0;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Z")
	public static boolean aBoolean435 = true;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_147 = new Class119(128);

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
	public static boolean aBoolean436 = false;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	public static void method4326() {
		Static220.method3898(Static37.anInt696);
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	public static void method4332() {
		@Pc(5) Class119 local5 = Static335.aClass119_205;
		synchronized (Static335.aClass119_205) {
			Static335.aClass119_205.method3304();
		}
		local5 = Static102.aClass119_67;
		synchronized (Static102.aClass119_67) {
			Static102.aClass119_67.method3304();
		}
		local5 = Static214.aClass119_127;
		synchronized (Static214.aClass119_127) {
			Static214.aClass119_127.method3304();
		}
		local5 = Static101.aClass119_64;
		synchronized (Static101.aClass119_64) {
			Static101.aClass119_64.method3304();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)I")
	public static int method4334(@OriginalArg(1) int arg0) {
		@Pc(7) Class211 local7 = Static40.method942(arg0);
		@Pc(10) int local10 = local7.anInt6888;
		@Pc(18) int local18 = local7.anInt6893;
		@Pc(21) int local21 = local7.anInt6895;
		@Pc(27) int local27 = Class61.anIntArray237[local21 - local18];
		return local27 & Static133.anIntArray238[local10] >> local18;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 >= Static124.anInt4221 && Static96.anInt2180 >= arg6 && arg4 >= Static124.anInt4221 && arg4 <= Static96.anInt2180 && arg3 >= Static124.anInt4221 && arg3 <= Static96.anInt2180 && Static124.anInt4221 <= arg1 && Static96.anInt2180 >= arg1 && arg0 >= Static228.anInt920 && Static307.anInt6214 >= arg0 && Static228.anInt920 <= arg8 && arg8 <= Static307.anInt6214 && Static228.anInt920 <= arg5 && Static307.anInt6214 >= arg5 && Static228.anInt920 <= arg2 && Static307.anInt6214 >= arg2) {
			Static250.method4559(arg0, arg4, arg6, arg7, arg8, arg1, arg3, arg5, arg2);
		} else {
			Static357.method6005(arg0, arg8, arg4, arg2, arg3, arg5, arg7, arg6, arg1);
		}
	}
}
