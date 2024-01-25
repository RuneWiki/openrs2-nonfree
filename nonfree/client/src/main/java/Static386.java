import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
	public static int anInt6912;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
	public static int anInt6908 = 0;

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "Lclient!kr;")
	public static final Class196 aClass196_7 = new Class196();

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "[[B")
	public static final byte[][] aByteArrayArray20 = new byte[50][];

	@OriginalMember(owner = "client!ou", name = "i", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "Z")
	public static boolean aBoolean529 = false;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)V")
	public static void method5577(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static129.anInt2578 = arg0;
		Static135.aClass11_Sub9Array1 = new Class11_Sub9[Static188.anIntArray182[Static129.anInt2578] + 1];
		Static349.anInt6424 = 0;
		Static234.anInt4321 = 0;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public static void method5578() {
		if (Static468.anInt8074 == 0) {
			return;
		}
		try {
			if (++Static198.anInt3805 > 2000) {
				if (Static485.aClass43_1 != null) {
					Static485.aClass43_1.method1044();
					Static485.aClass43_1 = null;
				}
				if (Static429.anInt7684 >= 2) {
					Static432.anInt7738 = -5;
					Static468.anInt8074 = 0;
					return;
				}
				Static467.aClass261_6.method5585();
				Static429.anInt7684++;
				Static468.anInt8074 = 1;
				Static198.anInt3805 = 0;
			}
			if (Static468.anInt8074 == 1) {
				Static304.aClass191_12 = Static467.aClass261_6.method5582(Static361.aClass198_3);
				Static468.anInt8074 = 2;
			}
			if (Static468.anInt8074 == 2) {
				if (Static304.aClass191_12.anInt5014 == 2) {
					throw new IOException();
				}
				if (Static304.aClass191_12.anInt5014 != 1) {
					return;
				}
				Static485.aClass43_1 = Static133.method2325((Socket) Static304.aClass191_12.anObject11);
				Static304.aClass191_12 = null;
				Static54.method938();
				Static468.anInt8074 = 4;
			}
			@Pc(123) int local123;
			if (Static468.anInt8074 == 4) {
				if (!Static485.aClass43_1.method1049(1)) {
					return;
				}
				Static485.aClass43_1.method1048(1, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
				local123 = Static158.aClass1_Sub3_Sub1_2.aByteArray104[0] & 0xFF;
				if (local123 != 21) {
					Static432.anInt7738 = local123;
					Static468.anInt8074 = 0;
					Static485.aClass43_1.method1044();
					Static485.aClass43_1 = null;
					return;
				}
				Static468.anInt8074 = 5;
			}
			if (Static468.anInt8074 == 5) {
				if (!Static485.aClass43_1.method1049(1)) {
					return;
				}
				Static485.aClass43_1.method1048(1, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
				Static468.anInt8074 = 6;
				Static425.aStringArray27 = new String[Static158.aClass1_Sub3_Sub1_2.aByteArray104[0] & 0xFF];
			}
			if (Static468.anInt8074 == 6 && Static485.aClass43_1.method1049(Static425.aStringArray27.length * 8)) {
				Static158.aClass1_Sub3_Sub1_2.anInt9802 = 0;
				Static485.aClass43_1.method1048(Static425.aStringArray27.length * 8, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
				for (local123 = 0; local123 < Static425.aStringArray27.length; local123++) {
					Static425.aStringArray27[local123] = Static56.method961(Static158.aClass1_Sub3_Sub1_2.method7949());
				}
				Static468.anInt8074 = 0;
				Static432.anInt7738 = 21;
				Static485.aClass43_1.method1044();
				Static485.aClass43_1 = null;
			}
		} catch (@Pc(229) IOException local229) {
			if (Static485.aClass43_1 != null) {
				Static485.aClass43_1.method1044();
				Static485.aClass43_1 = null;
			}
			if (Static429.anInt7684 < 2) {
				Static467.aClass261_6.method5585();
				Static198.anInt3805 = 0;
				Static468.anInt8074 = 1;
				Static429.anInt7684++;
			} else {
				Static468.anInt8074 = 0;
				Static432.anInt7738 = -4;
			}
		}
	}
}
