import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public static int anInt5690 = 0;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_97 = new Class70(50);

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString259 = "cyan:";

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!vj;B)V")
	public static void method5171(@OriginalArg(0) Class206 arg0) {
		Static29.anInt564 = 3;
		Static66.method1129(true);
		Static243.anInt4564 = 127;
		Static189.anInt3613 = 0;
		Static297.anInt5582 = 0;
		Static62.anInt1130 = 255;
		Static334.aBoolean407 = true;
		Static194.aBoolean277 = true;
		Static314.aBoolean195 = true;
		Static252.anInt4702 = 127;
		Static349.aBoolean421 = true;
		Static91.anInt2907 = 0;
		Static119.aBoolean190 = true;
		Static14.aBoolean22 = true;
		Static20.aBoolean26 = true;
		Static285.anInt5393 = 0;
		Static196.aBoolean281 = true;
		Static61.aBoolean81 = true;
		Static172.anInt3235 = 1;
		Static293.aBoolean382 = true;
		Static282.anInt5340 = 2;
		if (Static183.anInt3439 < 96) {
			Static239.method5787(0);
		} else {
			Static239.method5787(2);
		}
		Static213.anInt3920 = 2;
		Static354.aBoolean428 = true;
		Static98.anInt1846 = 0;
		Static163.anInt3087 = 0;
		Static346.aBoolean418 = true;
		Static276.aBoolean363 = false;
		Static182.anInt3432 = 2;
		Static317.aBoolean395 = false;
		Static131.aBoolean201 = false;
		@Pc(89) Class201 local89 = null;
		try {
			@Pc(93) Class196 local93 = arg0.method5517();
			while (local93.anInt5851 == 0) {
				Static278.method5283(1L);
			}
			if (local93.anInt5851 == 1) {
				local89 = (Class201) local93.anObject8;
				@Pc(118) byte[] local118 = new byte[(int) local89.method5363()];
				@Pc(132) int local132;
				for (@Pc(120) int local120 = 0; local120 < local118.length; local120 += local132) {
					local132 = local89.method5362(local118.length - local120, local118, local120);
					if (local132 == -1) {
						throw new IOException("EOF");
					}
				}
				Static246.method4306(new Class6_Sub10(local118));
			}
		} catch (@Pc(157) Exception local157) {
		}
		try {
			if (local89 != null) {
				local89.method5359();
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZB)I")
	public static int method5172(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static245.method4300();
		for (@Pc(28) Class6_Sub37 local28 = arg0 ? (Class6_Sub37) Static56.aClass108_19.method2903() : (Class6_Sub37) Static56.aClass108_19.method2905(); local28 != null; local28 = (Class6_Sub37) Static56.aClass108_19.method2905()) {
			if ((local28.aLong193 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local28.aLong193 & 0x4000000000000000L) != 0L) {
					@Pc(59) int local59 = (int) local28.aLong218;
					Static41.anIntArray721[local59] = Static41.anIntArray720[local59];
					local28.method5756();
					return local59;
				}
				local28.method5756();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method5173() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("maxMemory");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Long local26 = (Long) local16.invoke(local20, (Object[]) null);
					Static183.anInt3439 = (int) (local26 / 1048576L) + 1;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}
}
