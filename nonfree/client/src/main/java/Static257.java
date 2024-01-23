import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
	public static int anInt5058;

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
	public static int anInt5052 = 0;

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString171 = null;

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
	public static int anInt5060 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIBII)V")
	public static void method4004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = -arg4;
		@Pc(18) int local18 = arg4;
		@Pc(23) int local23 = arg4 - arg2;
		if (local23 < 0) {
			local23 = 0;
		}
		@Pc(30) int local30 = 0;
		Static238.method3147(arg4);
		@Pc(35) int local35 = local23;
		@Pc(38) int local38 = -local23;
		@Pc(40) int local40 = -1;
		@Pc(42) int local42 = -1;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(83) int local83;
		@Pc(91) int local91;
		if (Static293.anInt5688 <= arg0 && arg0 <= Static100.anInt1982) {
			@Pc(56) int[] local56 = Static253.anIntArrayArray34[arg0];
			local65 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg3 - arg4);
			local74 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg3 + arg4);
			local83 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg3 - local23);
			local91 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, local23 + arg3);
			Static190.method3151(local83, local56, arg5, local65);
			Static190.method3151(local91, local56, arg1, local83);
			Static190.method3151(local74, local56, arg5, local91);
		}
		while (local18 > local30) {
			local40 += 2;
			local42 += 2;
			local16 += local40;
			local38 += local42;
			if (local38 >= 0 && local35 >= 1) {
				local35--;
				local38 -= local35 << 1;
				Static74.anIntArray143[local35] = local30;
			}
			local30++;
			@Pc(253) int local253;
			@Pc(262) int local262;
			@Pc(270) int[] local270;
			@Pc(150) int local150;
			if (local16 >= 0) {
				local18--;
				local150 = arg0 - local18;
				local16 -= local18 << 1;
				local65 = arg0 + local18;
				if (local65 >= Static293.anInt5688 && Static100.anInt1982 >= local150) {
					if (local18 >= local23) {
						local74 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg3 + local30);
						local83 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg3 - local30);
						if (Static100.anInt1982 >= local65) {
							Static190.method3151(local74, Static253.anIntArrayArray34[local65], arg5, local83);
						}
						if (Static293.anInt5688 <= local150) {
							Static190.method3151(local74, Static253.anIntArrayArray34[local150], arg5, local83);
						}
					} else {
						local74 = Static74.anIntArray143[local18];
						local83 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg3 + local30);
						local91 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg3 - local30);
						local253 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg3 + local74);
						local262 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg3 - local74);
						if (Static100.anInt1982 >= local65) {
							local270 = Static253.anIntArrayArray34[local65];
							Static190.method3151(local262, local270, arg5, local91);
							Static190.method3151(local253, local270, arg1, local262);
							Static190.method3151(local83, local270, arg5, local253);
						}
						if (local150 >= Static293.anInt5688) {
							local270 = Static253.anIntArrayArray34[local150];
							Static190.method3151(local262, local270, arg5, local91);
							Static190.method3151(local253, local270, arg1, local262);
							Static190.method3151(local83, local270, arg5, local253);
						}
					}
				}
			}
			local150 = arg0 - local30;
			local65 = arg0 + local30;
			if (Static293.anInt5688 <= local65 && local150 <= Static100.anInt1982) {
				local83 = arg3 - local18;
				local74 = arg3 + local18;
				if (Static173.anInt3481 <= local74 && Static121.anInt2460 >= local83) {
					local74 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, local74);
					local83 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, local83);
					if (local30 < local23) {
						local91 = local35 >= local30 ? local35 : Static74.anIntArray143[local30];
						local253 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg3 + local91);
						local262 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg3 - local91);
						if (local65 <= Static100.anInt1982) {
							local270 = Static253.anIntArrayArray34[local65];
							Static190.method3151(local262, local270, arg5, local83);
							Static190.method3151(local253, local270, arg1, local262);
							Static190.method3151(local74, local270, arg5, local253);
						}
						if (Static293.anInt5688 <= local150) {
							local270 = Static253.anIntArrayArray34[local150];
							Static190.method3151(local262, local270, arg5, local83);
							Static190.method3151(local253, local270, arg1, local262);
							Static190.method3151(local74, local270, arg5, local253);
						}
					} else {
						if (local65 <= Static100.anInt1982) {
							Static190.method3151(local74, Static253.anIntArrayArray34[local65], arg5, local83);
						}
						if (Static293.anInt5688 <= local150) {
							Static190.method3151(local74, Static253.anIntArrayArray34[local150], arg5, local83);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZLclient!cg;III)V")
	public static void method4008(@OriginalArg(0) int arg0, @OriginalArg(3) Class22 arg1, @OriginalArg(6) int arg2) {
		Static156.anInt3218 = arg2;
		Static8.anInt148 = arg0;
		Static127.aClass22_43 = arg1;
		Static99.anInt1951 = 2;
		Static55.anInt1252 = 1;
		Static266.anInt5231 = 0;
		Static287.aBoolean385 = false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
	public static void method4009() {
		for (@Pc(1) int local1 = 0; local1 < Static69.anInt1421; local1++) {
			@Pc(8) Class99 local8 = Static181.aClass99Array36[local1];
			Static169.method2682(local8);
			Static181.aClass99Array36[local1] = null;
		}
		Static69.anInt1421 = 0;
	}
}
