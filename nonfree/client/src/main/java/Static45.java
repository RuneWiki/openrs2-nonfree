import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_13 = new Class276(39, 0);

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
	public static int anInt1118 = 2;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[16];

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "[I")
	public static final int[] anIntArray69 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
	public static int anInt1119 = 2;

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
	public static final int anInt1120 = 1405;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
	public static void method1176() {
		if (Static526.anInt9591 == 0) {
			return;
		}
		try {
			if (++Static138.anInt3230 > 2000) {
				if (Static393.aClass8_2 != null) {
					Static393.aClass8_2.method362();
					Static393.aClass8_2 = null;
				}
				if (Static149.anInt2868 >= 2) {
					Static309.anInt6178 = -5;
					Static526.anInt9591 = 0;
					return;
				}
				Static369.aClass329_4.method7876();
				Static526.anInt9591 = 1;
				Static149.anInt2868++;
				Static138.anInt3230 = 0;
			}
			if (Static526.anInt9591 == 1) {
				Static475.aClass66_6 = Static369.aClass329_4.method7877(Static480.aClass326_3);
				Static526.anInt9591 = 2;
			}
			if (Static526.anInt9591 == 2) {
				if (Static475.aClass66_6.anInt2308 == 2) {
					throw new IOException();
				}
				if (Static475.aClass66_6.anInt2308 != 1) {
					return;
				}
				Static393.aClass8_2 = Static27.method952((Socket) Static475.aClass66_6.anObject4);
				Static475.aClass66_6 = null;
				Static326.method5661();
				Static526.anInt9591 = 4;
			}
			@Pc(122) int local122;
			if (Static526.anInt9591 == 4) {
				if (!Static393.aClass8_2.method359(1)) {
					return;
				}
				Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 1);
				local122 = Static89.aClass3_Sub7_Sub1_2.aByteArray86[0] & 0xFF;
				if (local122 != 21) {
					Static526.anInt9591 = 0;
					Static309.anInt6178 = local122;
					Static393.aClass8_2.method362();
					Static393.aClass8_2 = null;
					return;
				}
				Static526.anInt9591 = 5;
			}
			if (Static526.anInt9591 == 5) {
				if (!Static393.aClass8_2.method359(1)) {
					return;
				}
				Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, 1);
				Static526.anInt9591 = 6;
				Static258.aStringArray22 = new String[Static89.aClass3_Sub7_Sub1_2.aByteArray86[0] & 0xFF];
			}
			if (Static526.anInt9591 == 6 && Static393.aClass8_2.method359(Static258.aStringArray22.length * 8)) {
				Static89.aClass3_Sub7_Sub1_2.anInt7869 = 0;
				Static393.aClass8_2.method360(Static89.aClass3_Sub7_Sub1_2.aByteArray86, 0, Static258.aStringArray22.length * 8);
				for (local122 = 0; local122 < Static258.aStringArray22.length; local122++) {
					Static258.aStringArray22[local122] = Static482.method7394(Static89.aClass3_Sub7_Sub1_2.method6519());
				}
				Static526.anInt9591 = 0;
				Static309.anInt6178 = 21;
				Static393.aClass8_2.method362();
				Static393.aClass8_2 = null;
			}
		} catch (@Pc(228) IOException local228) {
			if (Static393.aClass8_2 != null) {
				Static393.aClass8_2.method362();
				Static393.aClass8_2 = null;
			}
			if (Static149.anInt2868 < 2) {
				Static369.aClass329_4.method7876();
				Static526.anInt9591 = 1;
				Static149.anInt2868++;
				Static138.anInt3230 = 0;
			} else {
				Static309.anInt6178 = -4;
				Static526.anInt9591 = 0;
			}
		}
	}
}
