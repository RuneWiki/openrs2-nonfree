import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Lclient!kba;")
	public static Class176 method5257() {
		try {
			return (Class176) Class.forName("Class176_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIZILclient!ep;)V")
	public static void method5258(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class93 arg3) {
		@Pc(6) int local6 = arg3.anInt2777;
		@Pc(13) int local13 = arg3.anInt2738;
		if (arg3.aByte33 == 0) {
			arg3.anInt2777 = arg3.anInt2818;
		} else if (arg3.aByte33 == 1) {
			arg3.anInt2777 = arg0 - arg3.anInt2818;
		} else if (arg3.aByte33 == 2) {
			arg3.anInt2777 = arg3.anInt2818 * arg0 >> 14;
		}
		if (arg3.aByte34 == 0) {
			arg3.anInt2738 = arg3.anInt2827;
		} else if (arg3.aByte34 == 1) {
			arg3.anInt2738 = arg2 - arg3.anInt2827;
		} else if (arg3.aByte34 == 2) {
			arg3.anInt2738 = arg2 * arg3.anInt2827 >> 14;
		}
		if (arg3.aByte33 == 4) {
			arg3.anInt2777 = arg3.anInt2796 * arg3.anInt2738 / arg3.anInt2807;
		}
		if (arg3.aByte34 == 4) {
			arg3.anInt2738 = arg3.anInt2807 * arg3.anInt2777 / arg3.anInt2796;
		}
		if (Static13.aBoolean37 && (Static69.method1454(arg3).anInt8800 != 0 || arg3.anInt2823 == 0)) {
			if (arg3.anInt2738 < 5 && arg3.anInt2777 < 5) {
				arg3.anInt2777 = 5;
				arg3.anInt2738 = 5;
			} else {
				if (arg3.anInt2777 <= 0) {
					arg3.anInt2777 = 5;
				}
				if (arg3.anInt2738 <= 0) {
					arg3.anInt2738 = 5;
				}
			}
		}
		if (arg3.anInt2812 == Static262.anInt5265) {
			Static93.aClass93_6 = arg3;
		}
		if (arg1 && arg3.anObjectArray27 != null && (arg3.anInt2777 != local6 || local13 != arg3.anInt2738)) {
			@Pc(183) Class6_Sub38 local183 = new Class6_Sub38();
			local183.anObjectArray36 = arg3.anObjectArray27;
			local183.aClass93_14 = arg3;
			Static226.aClass211_30.method5173(local183);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5259(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(28) String local28 = Static495.method7439(arg0);
		if (local28 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static104.anInt7872; local33++) {
			@Pc(39) String local39 = Static60.aStringArray7[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static495.method7439(local39);
			if (local39 != null && local39.equals(local28)) {
				Static104.anInt7872--;
				for (@Pc(63) int local63 = local33; local63 < Static104.anInt7872; local63++) {
					Static60.aStringArray7[local63] = Static60.aStringArray7[local63 + 1];
					Static548.aStringArray49[local63] = Static548.aStringArray49[local63 + 1];
					Static437.aStringArray46[local63] = Static437.aStringArray46[local63 + 1];
					Static444.aStringArray47[local63] = Static444.aStringArray47[local63 + 1];
					Static354.aBooleanArray24[local63] = Static354.aBooleanArray24[local63 + 1];
				}
				Static435.anInt7935 = Static32.anInt1035;
				Static298.method4854(Static232.aClass181_56);
				Static547.aClass6_Sub26_Sub2_2.method4950(Static392.method6180(arg0), -81849);
				Static547.aClass6_Sub26_Sub2_2.method4998(arg0);
				return;
			}
		}
	}
}
