import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!df", name = "S", descriptor = "Lclient!qb;")
	public static Class190 aClass190_1;

	@OriginalMember(owner = "client!df", name = "T", descriptor = "Lclient!mj;")
	public static Class156 aClass156_1;

	@OriginalMember(owner = "client!df", name = "O", descriptor = "Lclient!us;")
	public static final Class234 aClass234_25 = new Class234(27, -1);

	@OriginalMember(owner = "client!df", name = "P", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_23 = new Class57("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!df", name = "R", descriptor = "Lclient!oi;")
	public static Interface7 anInterface7_1 = null;

	@OriginalMember(owner = "client!df", name = "U", descriptor = "Lclient!us;")
	public static final Class234 aClass234_26 = new Class234(26, 14);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1095(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static233.aStringArray27.length; local7++) {
			if (Static233.aStringArray27[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V")
	public static void method1096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class28_Sub4 local13 = local7.aClass28_Sub4_2;
		@Pc(16) Class28_Sub4 local16 = local7.aClass28_Sub4_1;
		if (local13 != null) {
			local13.anInt6096 = local13.anInt6096 * arg3 / 16;
			local13.anInt6092 = local13.anInt6092 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt6096 = local16.anInt6096 * arg3 / 16;
			local16.anInt6092 = local16.anInt6092 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
	public static void method1097() {
		if (Static329.anInt5569 == 0) {
			return;
		}
		try {
			if (++Static138.anInt2623 > 1500) {
				if (Static12.aClass145_2 != null) {
					Static12.aClass145_2.method3136();
					Static12.aClass145_2 = null;
				}
				if (Static245.anInt4418 >= 1) {
					Static329.anInt5569 = 0;
					Static158.anInt2849 = -5;
					return;
				}
				if (Static253.anInt4563 == Static222.anInt3950) {
					Static253.anInt4563 = Static1.anInt11;
				} else {
					Static253.anInt4563 = Static222.anInt3950;
				}
				Static329.anInt5569 = 1;
				Static245.anInt4418++;
				Static138.anInt2623 = 0;
			}
			if (Static329.anInt5569 == 1) {
				Static89.aClass133_9 = aClass156_1.method3642(Static165.aString29, Static253.anInt4563);
				Static329.anInt5569 = 2;
			}
			@Pc(126) int local126;
			if (Static329.anInt5569 == 2) {
				if (Static89.aClass133_9.anInt3257 == 2) {
					throw new IOException();
				}
				if (Static89.aClass133_9.anInt3257 != 1) {
					return;
				}
				Static12.aClass145_2 = new Class145((Socket) Static89.aClass133_9.anObject3, aClass156_1);
				Static89.aClass133_9 = null;
				Static12.aClass145_2.method3143(Static23.aClass3_Sub5_Sub1_1.anInt3121, Static23.aClass3_Sub5_Sub1_1.aByteArray42);
				if (Static25.aClass119_1 != null) {
					Static25.aClass119_1.method4983();
				}
				if (Static275.aClass119_2 != null) {
					Static275.aClass119_2.method4983();
				}
				local126 = Static12.aClass145_2.method3137();
				if (Static25.aClass119_1 != null) {
					Static25.aClass119_1.method4983();
				}
				if (Static275.aClass119_2 != null) {
					Static275.aClass119_2.method4983();
				}
				if (local126 != 101) {
					Static329.anInt5569 = 0;
					Static158.anInt2849 = local126;
					Static12.aClass145_2.method3136();
					Static12.aClass145_2 = null;
					return;
				}
				Static329.anInt5569 = 3;
			}
			if (Static329.anInt5569 == 3 && Static12.aClass145_2.method3139() >= 2) {
				local126 = Static12.aClass145_2.method3137() << 8 | Static12.aClass145_2.method3137();
				Static223.method3715(local126);
				if (Static41.anInt765 == -1) {
					Static329.anInt5569 = 0;
					Static158.anInt2849 = 6;
					Static12.aClass145_2.method3136();
					Static12.aClass145_2 = null;
				} else {
					Static329.anInt5569 = 0;
					Static12.aClass145_2.method3136();
					Static12.aClass145_2 = null;
					Static114.method1850();
				}
			}
		} catch (@Pc(204) IOException local204) {
			if (Static12.aClass145_2 != null) {
				Static12.aClass145_2.method3136();
				Static12.aClass145_2 = null;
			}
			if (Static245.anInt4418 >= 1) {
				Static329.anInt5569 = 0;
				Static158.anInt2849 = -4;
			} else {
				Static245.anInt4418++;
				if (Static253.anInt4563 == Static222.anInt3950) {
					Static253.anInt4563 = Static1.anInt11;
				} else {
					Static253.anInt4563 = Static222.anInt3950;
				}
				Static329.anInt5569 = 1;
				Static138.anInt2623 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(Z)[Lclient!ef;")
	public static Class68[] method1098() {
		return new Class68[] { Static156.aClass68_10, Static109.aClass68_7, Static81.aClass68_6, Static387.aClass68_16, Static365.aClass68_15, Static391.aClass68_9, Static256.aClass68_11, Static48.aClass68_3, Static350.aClass68_14, Static76.aClass68_5, Static41.aClass68_2, Static37.aClass68_1, Static291.aClass68_13, Static273.aClass68_12, Static50.aClass68_4 };
	}
}
