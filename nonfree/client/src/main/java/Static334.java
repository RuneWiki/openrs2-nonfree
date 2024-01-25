import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "Lclient!tj;")
	public static Class226 aClass226_1;

	@OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
	public static int anInt5795 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BB)V")
	public static void method4659(@OriginalArg(1) byte arg0) {
		if (Static231.aByteArrayArrayArray9 == null) {
			Static231.aByteArrayArrayArray9 = new byte[4][Static229.anInt4427][Static379.anInt6422];
		}
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (@Pc(27) int local27 = 0; local27 < Static229.anInt4427; local27++) {
				for (@Pc(31) int local31 = 0; local31 < Static379.anInt6422; local31++) {
					Static231.aByteArrayArrayArray9[local23][local27][local31] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4) {
		Static8.method202(-1, arg3, arg0, arg1, arg2, null, arg4);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!mg;IB)Lclient!dq;")
	public static Class58 method4661(@OriginalArg(1) Class160 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) byte[] local14 = arg0.method3696(0, arg1);
		return local14 == null ? null : new Class58(local14);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)Lclient!tt;")
	public static Class219_Sub1 method4662(@OriginalArg(1) int arg0) {
		return Static230.aBoolean325 && arg0 >= Static429.anInt6516 && Static160.anInt4302 >= arg0 ? Static204.aClass219_Sub1Array2[arg0 - Static429.anInt6516] : null;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
	public static void method4663() {
		Static195.aClass49_5.UA(Static152.anInt3143, Static12.aClass79_Sub1_1.aBoolean362 ? Static210.anInt4100 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)Lclient!cd;")
	public static Class39 method4664() {
		try {
			return (Class39) Class.forName("Class39_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}
}
