import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!tba;")
	public static Class315 aClass315_16;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "J")
	public static long aLong254 = -1L;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method8061() {
		Static246.method4655();
		@Pc(16) int local16 = Static552.aClass3_Sub48_30.aClass23_Sub10_1.method3567();
		if (local16 == 2) {
			Static580.method8026(Static47.aClass33_3, Static114.anInt2970, Static256.anInt5669);
		} else if (local16 == 3) {
			Static132.method3074(Static47.aClass33_3, Static256.anInt5669, Static547.anInt8015, Static135.anInt3501, Static114.anInt2970);
		}
		if (Static552.aClass3_Sub48_30.aClass23_Sub10_1.method3572()) {
			Static555.method7818(Static177.aCanvas10);
		}
		if (Static47.aClass33_3 != null) {
			Static545.method7730();
		}
		Static216.aBoolean440 = Static552.aClass3_Sub48_30.aClass23_Sub10_1.method3567() != 0;
		Static349.aBoolean590 = Static552.aClass3_Sub48_30.aClass23_Sub10_1.method3572();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Component;IIILclient!nga;)Lclient!vm;")
	public static Class122 method8062(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class228 arg3) {
		if (Static590.anInt9843 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class122 local38 = (Class122) Class.forName("Class122_Sub1").getDeclaredConstructor().newInstance();
			local38.anInt8198 = arg2;
			local38.anIntArray513 = new int[(Static457.aBoolean715 ? 2 : 1) * 256];
			local38.method6812(arg0);
			local38.anInt8192 = (arg2 & -1024) + 1024;
			if (local38.anInt8192 > 16384) {
				local38.anInt8192 = 16384;
			}
			local38.method6802(local38.anInt8192);
			if (Static66.anInt1409 > 0 && Static596.aClass95_1 == null) {
				Static596.aClass95_1 = new Class95();
				Static596.aClass95_1.aClass228_2 = arg3;
				arg3.method5938(Static66.anInt1409, Static596.aClass95_1);
			}
			if (Static596.aClass95_1 != null) {
				if (Static596.aClass95_1.aClass122Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static596.aClass95_1.aClass122Array1[arg1] = local38;
			}
			return local38;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class122_Sub2 local117 = new Class122_Sub2(arg3, arg1);
				local117.anInt8198 = arg2;
				local117.anIntArray513 = new int[(Static457.aBoolean715 ? 2 : 1) * 256];
				local117.method6812(arg0);
				local117.anInt8192 = 16384;
				local117.method6802(local117.anInt8192);
				if (Static66.anInt1409 > 0 && Static596.aClass95_1 == null) {
					Static596.aClass95_1 = new Class95();
					Static596.aClass95_1.aClass228_2 = arg3;
					arg3.method5938(Static66.anInt1409, Static596.aClass95_1);
				}
				if (Static596.aClass95_1 != null) {
					if (Static596.aClass95_1.aClass122Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static596.aClass95_1.aClass122Array1[arg1] = local117;
				}
				return local117;
			} catch (@Pc(179) Throwable local179) {
				return new Class122();
			}
		}
	}
}
