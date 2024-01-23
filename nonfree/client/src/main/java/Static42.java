import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
	public static int anInt788 = 0;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public static int anInt789 = 0;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZI)V")
	public static void method694(@OriginalArg(1) int arg0) {
		Static22.anInt331 = arg0;
		Static229.anInt4394 = -1;
		Static16.anInt929 = -1;
		Static204.method3262();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
	public static void method697() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(23) Long local23 = (Long) local12.invoke(local16, (Object[]) null);
					Static164.anInt3256 = (int) (local23 / 1048576L) + 1;
				} catch (@Pc(33) Throwable local33) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(ZI)V")
	public static void method698(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = Static129.anInt2519;
		@Pc(7) int local7 = Static302.anInt5682;
		@Pc(9) int local9 = Static82.anInt1931;
		@Pc(12) int local12 = (int) Static198.aFloat147;
		@Pc(14) int local14 = Static193.anInt3656;
		if (Static38.anInt626 / 256 > local12) {
			local12 = Static38.anInt626 / 256;
		}
		@Pc(26) int local26 = Static207.anInt4066;
		if (Static137.aBooleanArray13[4] && local12 < Static295.anIntArray626[4] + 128) {
			local12 = Static295.anIntArray626[4] + 128;
		}
		@Pc(51) int local51 = (int) Static202.aFloat97 + Static15.anInt242 & 0x7FF;
		Static251.method3991(local51, Static33.method522(Static154.aClass53_Sub1_Sub1_2.anInt4002, Static154.aClass53_Sub1_Sub1_2.anInt3974, Static281.anInt5335) - 50, local12, local12 * 3 + 600, Static127.anInt2496, arg0, Static289.anInt5413);
		if (Static129.anInt2519 == local5 && local9 == Static82.anInt1931 && local7 == Static302.anInt5682 && Static207.anInt4066 == local26 && Static193.anInt3656 == local14) {
			Static41.anInt772 = 1;
			return;
		}
		Static253.anInt4839 = 10;
		Static276.anInt5237 = 10;
		Static183.anInt3490 = 10;
		@Pc(105) int local105 = Static193.anInt3656 - local14;
		if (local7 < Static302.anInt5682) {
			local7 += Static276.anInt5237 + (Static302.anInt5682 - local7) * Static183.anInt3490 / 1000;
			if (local7 < Static302.anInt5682) {
				Static302.anInt5682 = local7;
			}
		}
		if (Static302.anInt5682 < local7) {
			local7 -= Static276.anInt5237 + (local7 - Static302.anInt5682) * Static183.anInt3490 / 1000;
			if (Static302.anInt5682 < local7) {
				Static302.anInt5682 = local7;
			}
		}
		if (local105 > 1024) {
			local105 -= 2048;
		}
		if (local9 < Static82.anInt1931) {
			local9 += (Static82.anInt1931 - local9) * Static183.anInt3490 / 1000 + Static276.anInt5237;
			if (Static82.anInt1931 > local9) {
				Static82.anInt1931 = local9;
			}
		}
		if (Static82.anInt1931 < local9) {
			local9 -= Static183.anInt3490 * (local9 - Static82.anInt1931) / 1000 + Static276.anInt5237;
			if (local9 > Static82.anInt1931) {
				Static82.anInt1931 = local9;
			}
		}
		if (local5 < Static129.anInt2519) {
			local5 += Static276.anInt5237 + Static183.anInt3490 * (Static129.anInt2519 - local5) / 1000;
			if (Static129.anInt2519 > local5) {
				Static129.anInt2519 = local5;
			}
		}
		Static11.anInt212 = 10;
		if (Static129.anInt2519 < local5) {
			local5 -= Static183.anInt3490 * (local5 - Static129.anInt2519) / 1000 + Static276.anInt5237;
			if (Static129.anInt2519 < local5) {
				Static129.anInt2519 = local5;
			}
		}
		if (local105 < -1024) {
			local105 += 2048;
		}
		if (Static207.anInt4066 > local26) {
			local26 += Static253.anInt4839 + (Static207.anInt4066 - local26) * Static11.anInt212 / 1000;
			if (local26 < Static207.anInt4066) {
				Static207.anInt4066 = local26;
			}
		}
		if (local105 > 0) {
			local14 += Static11.anInt212 * local105 / 1000 + Static253.anInt4839;
			local14 &= 0x7FF;
		}
		if (Static207.anInt4066 < local26) {
			local26 -= Static253.anInt4839 + Static11.anInt212 * (local26 - Static207.anInt4066) / 1000;
			if (Static207.anInt4066 < local26) {
				Static207.anInt4066 = local26;
			}
		}
		if (local105 < 0) {
			local14 -= Static253.anInt4839 + -local105 * Static11.anInt212 / 1000;
			local14 &= 0x7FF;
		}
		@Pc(366) int local366 = Static193.anInt3656 - local14;
		if (local366 > 1024) {
			local366 -= 2048;
		}
		if (local366 < -1024) {
			local366 += 2048;
		}
		if (local366 >= 0 || local105 <= 0 || local366 > 0 && local105 < 0) {
			Static193.anInt3656 = local14;
		}
	}
}
