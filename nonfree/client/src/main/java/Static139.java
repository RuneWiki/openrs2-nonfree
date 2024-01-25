import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_47 = new Class359(3, 2);

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
	public static int anInt2696 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)I")
	public static int method2419(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
	public static void method2420() {
		if (Static83.anInt1914 == 0) {
			return;
		}
		try {
			if (++Static358.anInt6495 > 2000) {
				if (Static12.aClass244_1 != null) {
					Static12.aClass244_1.method5753();
					Static12.aClass244_1 = null;
				}
				if (Static286.anInt5571 >= 2) {
					Static345.anInt6331 = -5;
					Static83.anInt1914 = 0;
					return;
				}
				Static585.aClass395_5.method9035();
				Static83.anInt1914 = 1;
				Static358.anInt6495 = 0;
				Static286.anInt5571++;
			}
			if (Static83.anInt1914 == 1) {
				Static351.aClass331_4 = Static585.aClass395_5.method9037(Static570.aClass268_5);
				Static83.anInt1914 = 2;
			}
			if (Static83.anInt1914 == 2) {
				if (Static351.aClass331_4.anInt9108 == 2) {
					throw new IOException();
				}
				if (Static351.aClass331_4.anInt9108 != 1) {
					return;
				}
				Static12.aClass244_1 = Static582.method9008((Socket) Static351.aClass331_4.anObject20);
				Static351.aClass331_4 = null;
				Static24.method6162();
				Static83.anInt1914 = 4;
			}
			if (Static83.anInt1914 == 4 && Static12.aClass244_1.method5750(1)) {
				Static12.aClass244_1.method5754(1, Static474.aClass5_Sub41_Sub2_2.aByteArray93, 0);
				@Pc(113) int local113 = Static474.aClass5_Sub41_Sub2_2.aByteArray93[0] & 0xFF;
				Static345.anInt6331 = local113;
				Static83.anInt1914 = 0;
				Static12.aClass244_1.method5753();
				Static12.aClass244_1 = null;
			}
		} catch (@Pc(130) IOException local130) {
			if (Static12.aClass244_1 != null) {
				Static12.aClass244_1.method5753();
				Static12.aClass244_1 = null;
			}
			if (Static286.anInt5571 < 2) {
				Static585.aClass395_5.method9035();
				Static358.anInt6495 = 0;
				Static83.anInt1914 = 1;
				Static286.anInt5571++;
			} else {
				Static83.anInt1914 = 0;
				Static345.anInt6331 = -4;
			}
		}
	}
}
