import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!tha", name = "H", descriptor = "I")
	public static int anInt9349;

	@OriginalMember(owner = "client!tha", name = "J", descriptor = "I")
	public static int anInt9351;

	@OriginalMember(owner = "client!tha", name = "S", descriptor = "I")
	public static int anInt9360;

	@OriginalMember(owner = "client!tha", name = "E", descriptor = "J")
	public static long aLong243 = 0L;

	@OriginalMember(owner = "client!tha", name = "O", descriptor = "I")
	public static int anInt9356 = 0;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(III)V")
	public static void method7716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static361.aFloat88 < Static361.aFloat89) {
			Static361.aFloat88 = (float) ((double) Static361.aFloat88 + (double) Static361.aFloat88 / 30.0D);
			if (Static361.aFloat89 < Static361.aFloat88) {
				Static361.aFloat88 = Static361.aFloat89;
			}
			Static249.method4696();
			Static361.anInt2219 = (int) Static361.aFloat88 >> 1;
			Static361.aByteArrayArrayArray2 = Static601.method8191(Static361.anInt2219);
		} else if (Static361.aFloat88 > Static361.aFloat89) {
			Static361.aFloat88 = (float) ((double) Static361.aFloat88 - (double) Static361.aFloat88 / 30.0D);
			if (Static361.aFloat89 > Static361.aFloat88) {
				Static361.aFloat88 = Static361.aFloat89;
			}
			Static249.method4696();
			Static361.anInt2219 = (int) Static361.aFloat88 >> 1;
			Static361.aByteArrayArrayArray2 = Static601.method8191(Static361.anInt2219);
		}
		if (Static642.anInt10524 != -1 && Static118.anInt3044 != -1) {
			@Pc(83) int local83 = Static642.anInt10524 - Static353.anInt6903;
			if (local83 < 2 || local83 > 2) {
				local83 /= 8;
			}
			@Pc(100) int local100 = Static118.anInt3044 - Static386.anInt8408;
			Static353.anInt6903 += local83;
			if (local100 < 2 || local100 > 2) {
				local100 /= 8;
			}
			if (local83 == 0 && local100 == 0) {
				Static642.anInt10524 = -1;
				Static118.anInt3044 = -1;
			}
			Static386.anInt8408 -= -local100;
			Static249.method4696();
		}
		if (Static473.anInt8493 <= 0) {
			Static134.anInt3480 = -1;
			Static128.anInt3197 = -1;
		} else {
			Static479.anInt8544--;
			if (Static479.anInt8544 == 0) {
				Static479.anInt8544 = 100;
				Static473.anInt8493--;
			}
		}
		if (!Static126.aBoolean247 || Static529.aClass276_54 == null) {
			return;
		}
		for (@Pc(169) Class3_Sub42 local169 = (Class3_Sub42) Static529.aClass276_54.method6907(); local169 != null; local169 = (Class3_Sub42) Static529.aClass276_54.method6912()) {
			@Pc(178) Class269 local178 = Static361.aClass115_3.method3752(local169.aClass3_Sub22_1.anInt4123);
			if (local169.method7436(arg0, arg1)) {
				if (local178.aStringArray31 != null) {
					if (local178.aStringArray31[4] != null) {
						Static512.method7408(1004, local178.aString91, -1, true, (long) local169.aClass3_Sub22_1.anInt4123, local178.aStringArray31[4], (long) local169.aClass3_Sub22_1.anInt4123, false, local178.anInt8161, 0, false, -1);
					}
					if (local178.aStringArray31[3] != null) {
						Static512.method7408(1006, local178.aString91, -1, true, (long) local169.aClass3_Sub22_1.anInt4123, local178.aStringArray31[3], (long) local169.aClass3_Sub22_1.anInt4123, false, local178.anInt8161, 0, false, -1);
					}
					if (local178.aStringArray31[2] != null) {
						Static512.method7408(1009, local178.aString91, -1, true, (long) local169.aClass3_Sub22_1.anInt4123, local178.aStringArray31[2], (long) local169.aClass3_Sub22_1.anInt4123, false, local178.anInt8161, 0, false, -1);
					}
					if (local178.aStringArray31[1] != null) {
						Static512.method7408(1008, local178.aString91, -1, true, (long) local169.aClass3_Sub22_1.anInt4123, local178.aStringArray31[1], (long) local169.aClass3_Sub22_1.anInt4123, false, local178.anInt8161, 0, false, -1);
					}
					if (local178.aStringArray31[0] != null) {
						Static512.method7408(1007, local178.aString91, -1, true, (long) local169.aClass3_Sub22_1.anInt4123, local178.aStringArray31[0], (long) local169.aClass3_Sub22_1.anInt4123, false, local178.anInt8161, 0, false, -1);
					}
				}
				if (!local169.aClass3_Sub22_1.aBoolean356) {
					local169.aClass3_Sub22_1.aBoolean356 = true;
					Static84.method2218(Static177.aClass229_1, local169.aClass3_Sub22_1.anInt4123, local178.anInt8161);
				}
				if (local169.aClass3_Sub22_1.aBoolean356) {
					Static84.method2218(Static247.aClass229_5, local169.aClass3_Sub22_1.anInt4123, local178.anInt8161);
				}
			} else if (local169.aClass3_Sub22_1.aBoolean356) {
				local169.aClass3_Sub22_1.aBoolean356 = false;
				Static84.method2218(Static320.aClass229_7, local169.aClass3_Sub22_1.anInt4123, local178.anInt8161);
			}
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method7724(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static312.method8546(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static476.method7559(local7);
			local7 = Static347.method5691(":", "%3a", local7);
			local7 = Static347.method5691("@", "%40", local7);
			local7 = Static347.method5691("&", "%26", local7);
			local7 = Static347.method5691("#", "%23", local7);
			if (Static228.anApplet1 != null) {
				@Pc(107) Class376 local107 = Static49.aClass228_1.method5945(new URL(Static228.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static510.anInt8990 + "&u=" + (Static46.aString10 == null ? String.valueOf(Static230.aLong111) : Static46.aString10) + "&v1=" + Static372.aString76 + "&v2=" + Static372.aString83 + "&e=" + local7));
				while (local107.anInt10510 == 0) {
					Static500.method7308(1L);
				}
				if (local107.anInt10510 == 1) {
					@Pc(126) DataInputStream local126 = (DataInputStream) local107.anObject19;
					local126.read();
					local126.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}
}
