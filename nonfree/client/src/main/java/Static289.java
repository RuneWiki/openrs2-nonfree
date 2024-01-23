import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!un", name = "x", descriptor = "I")
	public static int anInt5413;

	@OriginalMember(owner = "client!un", name = "t", descriptor = "Lclient!ic;")
	public static Class85 aClass85_25 = new Class85(16);

	@OriginalMember(owner = "client!un", name = "u", descriptor = "Lclient!wf;")
	public static Class189 aClass189_15 = null;

	@OriginalMember(owner = "client!un", name = "v", descriptor = "[I")
	public static int[] anIntArray616 = new int[100];

	@OriginalMember(owner = "client!un", name = "w", descriptor = "[I")
	public static int[] anIntArray617 = new int[5];

	@OriginalMember(owner = "client!un", name = "y", descriptor = "I")
	public static int anInt5414 = 0;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "[S")
	public static short[] aShortArray111 = new short[256];

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)Z")
	public static boolean method4418(@OriginalArg(1) int arg0) {
		Static290.anInt5427 = arg0 + 1 & 0xFFFF;
		Static46.aBoolean50 = true;
		return true;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V")
	public static void method4419() {
		if (Static250.anInt4760 == 0) {
			return;
		}
		try {
			if (++Static60.anInt1213 > 2000) {
				if (Static134.aClass52_7 != null) {
					Static134.aClass52_7.method1103();
					Static134.aClass52_7 = null;
				}
				if (Static166.anInt3409 >= 1) {
					Static268.anInt5174 = -5;
					Static250.anInt4760 = 0;
					return;
				}
				Static60.anInt1213 = 0;
				Static250.anInt4760 = 1;
				Static166.anInt3409++;
				if (Static256.anInt4867 == Static109.anInt2194) {
					Static256.anInt4867 = Static220.anInt4045;
				} else {
					Static256.anInt4867 = Static109.anInt2194;
				}
			}
			if (Static250.anInt4760 == 1) {
				Static304.aClass185_8 = Static276.aClass139_4.method3505(Static251.aString299, Static256.anInt4867);
				Static250.anInt4760 = 2;
			}
			@Pc(129) int local129;
			if (Static250.anInt4760 == 2) {
				if (Static304.aClass185_8.anInt5623 == 2) {
					throw new IOException();
				}
				if (Static304.aClass185_8.anInt5623 != 1) {
					return;
				}
				Static134.aClass52_7 = new Class52((Socket) Static304.aClass185_8.anObject7, Static276.aClass139_4);
				Static304.aClass185_8 = null;
				Static134.aClass52_7.method1107(Static110.aClass4_Sub10_Sub1_1.aByteArray71, Static110.aClass4_Sub10_Sub1_1.anInt5713);
				if (Static30.aClass103_1 != null) {
					Static30.aClass103_1.method3009();
				}
				if (Static249.aClass103_2 != null) {
					Static249.aClass103_2.method3009();
				}
				local129 = Static134.aClass52_7.method1105();
				if (Static30.aClass103_1 != null) {
					Static30.aClass103_1.method3009();
				}
				if (Static249.aClass103_2 != null) {
					Static249.aClass103_2.method3009();
				}
				if (local129 != 21) {
					Static268.anInt5174 = local129;
					Static250.anInt4760 = 0;
					Static134.aClass52_7.method1103();
					Static134.aClass52_7 = null;
					return;
				}
				Static250.anInt4760 = 3;
			}
			if (Static250.anInt4760 == 3) {
				if (Static134.aClass52_7.method1101() < 1) {
					return;
				}
				Static70.aStringArray8 = new String[Static134.aClass52_7.method1105()];
				Static250.anInt4760 = 4;
			}
			if (Static250.anInt4760 == 4) {
				if (Static134.aClass52_7.method1101() < Static70.aStringArray8.length * 8) {
					return;
				}
				Static189.aClass4_Sub10_Sub1_2.anInt5713 = 0;
				Static134.aClass52_7.method1099(0, Static189.aClass4_Sub10_Sub1_2.aByteArray71, Static70.aStringArray8.length * 8);
				for (local129 = 0; local129 < Static70.aStringArray8.length; local129++) {
					Static70.aStringArray8[local129] = Static282.method4356(Static189.aClass4_Sub10_Sub1_2.method4659());
				}
				Static250.anInt4760 = 0;
				Static268.anInt5174 = 21;
				Static134.aClass52_7.method1103();
				Static134.aClass52_7 = null;
				return;
			}
		} catch (@Pc(226) IOException local226) {
			if (Static134.aClass52_7 != null) {
				Static134.aClass52_7.method1103();
				Static134.aClass52_7 = null;
			}
			if (Static166.anInt3409 >= 1) {
				Static250.anInt4760 = 0;
				Static268.anInt5174 = -4;
			} else {
				Static60.anInt1213 = 0;
				Static250.anInt4760 = 1;
				if (Static256.anInt4867 == Static109.anInt2194) {
					Static256.anInt4867 = Static220.anInt4045;
				} else {
					Static256.anInt4867 = Static109.anInt2194;
				}
				Static166.anInt3409++;
			}
		}
	}
}
