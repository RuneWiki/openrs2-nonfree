import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
	public static int anInt5812 = 0;

	@OriginalMember(owner = "client!ls", name = "L", descriptor = "J")
	public static long aLong175 = -1L;

	@OriginalMember(owner = "client!ls", name = "O", descriptor = "Z")
	public static boolean aBoolean665 = false;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Lclient!bu;")
	public static Class30 method4557(@OriginalArg(1) int arg0) {
		@Pc(16) Class30[] local16 = Static137.method2092();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class30 local24 = local16[local18];
			if (local24.anInt715 == arg0) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
	public static void method4558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static116.anInt2196 = arg3;
		Static179.anInt3129 = arg1;
		Static173.anInt2815 = arg2;
		Static64.anInt1210 = arg0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method4559(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static446.anInt7396 >= 100) {
			Static208.method2938(Static358.aClass119_41.method2673(Static394.anInt6582));
			return;
		}
		@Pc(22) String local22 = Static440.method5809(arg1);
		if (local22 == null) {
			return;
		}
		@Pc(65) String local65;
		for (@Pc(27) int local27 = 0; local27 < Static446.anInt7396; local27++) {
			@Pc(35) String local35 = Static440.method5809(Static264.aStringArray29[local27]);
			if (local35 != null && local35.equals(local22)) {
				Static208.method2938(arg1 + Static354.aClass119_149.method2673(Static394.anInt6582));
				return;
			}
			if (Static80.aStringArray10[local27] != null) {
				local65 = Static440.method5809(Static80.aStringArray10[local27]);
				if (local65 != null && local65.equals(local22)) {
					Static208.method2938(arg1 + Static354.aClass119_149.method2673(Static394.anInt6582));
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static107.anInt2042; local95++) {
			local65 = Static440.method5809(Static320.aStringArray44[local95]);
			if (local65 != null && local65.equals(local22)) {
				Static208.method2938(Static51.aClass119_23.method2673(Static394.anInt6582) + arg1 + Static455.aClass119_181.method2673(Static394.anInt6582));
				return;
			}
			if (Static355.aStringArray41[local95] != null) {
				@Pc(142) String local142 = Static440.method5809(Static355.aStringArray41[local95]);
				if (local142 != null && local142.equals(local22)) {
					Static208.method2938(Static51.aClass119_23.method2673(Static394.anInt6582) + arg1 + Static455.aClass119_181.method2673(Static394.anInt6582));
					return;
				}
			}
		}
		if (Static440.method5809(Static447.aClass25_Sub5_Sub1_Sub2_4.aString51).equals(local22)) {
			Static208.method2938(Static305.aClass119_126.method2673(Static394.anInt6582));
		} else {
			Static52.method867(Static108.aClass103_87);
			Static18.aClass1_Sub28_Sub1_1.method5398(Static349.method4734(arg1) + 1);
			Static18.aClass1_Sub28_Sub1_1.method5364(arg1);
			Static18.aClass1_Sub28_Sub1_1.method5398(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)Lclient!eo;")
	public static Class67 method4560() {
		try {
			return (Class67) Class.forName("Class67_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V")
	public static void method4561(@OriginalArg(0) int arg0) {
		Static287.anInt5028 = 100;
		Static125.anInt2319 = -1;
		Static427.anInt7220 = arg0;
		Static154.anInt2613 = 3;
	}
}
