import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public static int anInt7730;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "Lclient!nj;")
	public static final Class181 aClass181_51 = new Class181();

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
	public static int anInt7729 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)V")
	public static void method6241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static71.method1100(arg4);
		@Pc(13) int local13 = 0;
		@Pc(18) int local18 = arg4 - arg1;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(24) int local24 = arg4;
		@Pc(27) int local27 = -arg4;
		@Pc(29) int local29 = local18;
		@Pc(32) int local32 = -local18;
		@Pc(34) int local34 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(86) int local86;
		if (Static118.anInt2005 <= arg2 && Static123.anInt2069 >= arg2) {
			@Pc(52) int[] local52 = Static46.anIntArrayArray24[arg2];
			local61 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg0 - arg4);
			local69 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg4 + arg0);
			local78 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg0 - local18);
			local86 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, local18 + arg0);
			Static215.method3035(local61, local78, local52, arg5);
			Static215.method3035(local78, local86, local52, arg3);
			Static215.method3035(local86, local69, local52, arg5);
		}
		@Pc(106) int local106 = -1;
		while (local13 < local24) {
			local34 += 2;
			local106 += 2;
			local32 += local106;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				Static82.anIntArray354[local29] = local13;
				local32 -= local29 << 1;
			}
			local13++;
			@Pc(238) int local238;
			@Pc(247) int local247;
			@Pc(258) int[] local258;
			@Pc(150) int local150;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local150 = arg2 - local24;
				local61 = local24 + arg2;
				if (local61 >= Static118.anInt2005 && local150 <= Static123.anInt2069) {
					if (local18 <= local24) {
						local69 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg0 + local13);
						local78 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg0 - local13);
						if (Static123.anInt2069 >= local61) {
							Static215.method3035(local78, local69, Static46.anIntArrayArray24[local61], arg5);
						}
						if (local150 >= Static118.anInt2005) {
							Static215.method3035(local78, local69, Static46.anIntArrayArray24[local150], arg5);
						}
					} else {
						local69 = Static82.anIntArray354[local24];
						local78 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, local13 + arg0);
						local86 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg0 - local13);
						local238 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg0 + local69);
						local247 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg0 - local69);
						if (Static123.anInt2069 >= local61) {
							local258 = Static46.anIntArrayArray24[local61];
							Static215.method3035(local86, local247, local258, arg5);
							Static215.method3035(local247, local238, local258, arg3);
							Static215.method3035(local238, local78, local258, arg5);
						}
						if (Static118.anInt2005 <= local150) {
							local258 = Static46.anIntArrayArray24[local150];
							Static215.method3035(local86, local247, local258, arg5);
							Static215.method3035(local247, local238, local258, arg3);
							Static215.method3035(local238, local78, local258, arg5);
						}
					}
				}
			}
			local150 = arg2 - local13;
			local61 = local13 + arg2;
			if (Static118.anInt2005 <= local61 && Static123.anInt2069 >= local150) {
				local69 = arg0 + local24;
				local78 = arg0 - local24;
				if (Static347.anInt6160 <= local69 && local78 <= Static385.anInt6686) {
					local69 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, local69);
					local78 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, local78);
					if (local18 <= local13) {
						if (Static123.anInt2069 >= local61) {
							Static215.method3035(local78, local69, Static46.anIntArrayArray24[local61], arg5);
						}
						if (local150 >= Static118.anInt2005) {
							Static215.method3035(local78, local69, Static46.anIntArrayArray24[local150], arg5);
						}
					} else {
						local86 = local29 >= local13 ? local29 : Static82.anIntArray354[local13];
						local238 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, local86 + arg0);
						local247 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg0 - local86);
						if (Static123.anInt2069 >= local61) {
							local258 = Static46.anIntArrayArray24[local61];
							Static215.method3035(local78, local247, local258, arg5);
							Static215.method3035(local247, local238, local258, arg3);
							Static215.method3035(local238, local69, local258, arg5);
						}
						if (local150 >= Static118.anInt2005) {
							local258 = Static46.anIntArrayArray24[local150];
							Static215.method3035(local78, local247, local258, arg5);
							Static215.method3035(local247, local238, local258, arg3);
							Static215.method3035(local238, local69, local258, arg5);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)Z")
	public static boolean method6243(@OriginalArg(0) int arg0) {
		if (arg0 == 51 || arg0 == 50 || arg0 == 9 || arg0 == 12 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 2 || arg0 == 1007;
		}
	}
}
