import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "J")
	public static long aLong109;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_83 = new Class7("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public static void method2848(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21;
		if (arg0 != Static66.anInt1511) {
			Static121.anIntArray197 = new int[arg0];
			for (local21 = 0; local21 < arg0; local21++) {
				Static121.anIntArray197[local21] = (local21 << 12) / arg0;
			}
			Static66.anInt1511 = arg0;
			Static393.anInt6315 = arg0 - 1;
			Static278.anInt4895 = arg0 * 32;
		}
		if (arg1 == Static61.anInt1456) {
			return;
		}
		if (arg1 == Static66.anInt1511) {
			Static266.anIntArray628 = Static121.anIntArray197;
		} else {
			Static266.anIntArray628 = new int[arg1];
			for (local21 = 0; local21 < arg1; local21++) {
				Static266.anIntArray628[local21] = (local21 << 12) / arg1;
			}
		}
		Static61.anInt1456 = arg1;
		Static67.anInt1514 = arg1 - 1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method2849() {
		if (Static440.anInt7083 == 0) {
			return;
		}
		try {
			if (++Static146.anInt2806 > 2000) {
				if (Static82.aClass229_1 != null) {
					Static82.aClass229_1.method5204();
					Static82.aClass229_1 = null;
				}
				if (Static303.anInt5252 >= 1) {
					Static440.anInt7083 = 0;
					Static443.anInt7125 = -5;
					return;
				}
				Static440.anInt7083 = 1;
				Static146.anInt2806 = 0;
				Static303.anInt5252++;
				Static81.aClass209_1.aBoolean406 = !Static81.aClass209_1.aBoolean406;
			}
			if (Static440.anInt7083 == 1) {
				Static47.aClass9_3 = Static77.aClass180_1.method4086(Static81.aClass209_1.method4847(), Static81.aClass209_1.aString60);
				Static440.anInt7083 = 2;
			}
			@Pc(105) int local105;
			if (Static440.anInt7083 == 2) {
				if (Static47.aClass9_3.anInt368 == 2) {
					throw new IOException();
				}
				if (Static47.aClass9_3.anInt368 != 1) {
					return;
				}
				Static82.aClass229_1 = new Class229((Socket) Static47.aClass9_3.anObject2, Static77.aClass180_1);
				Static47.aClass9_3 = null;
				Static82.aClass229_1.method5207(Static92.aClass1_Sub5_Sub1_1.aByteArray89, Static92.aClass1_Sub5_Sub1_1.anInt6475);
				Static40.method753();
				local105 = Static82.aClass229_1.method5206();
				Static40.method753();
				if (local105 != 21) {
					Static440.anInt7083 = 0;
					Static443.anInt7125 = local105;
					Static82.aClass229_1.method5204();
					Static82.aClass229_1 = null;
					return;
				}
				Static440.anInt7083 = 3;
			}
			if (Static440.anInt7083 == 3) {
				if (Static82.aClass229_1.method5208() < 1) {
					return;
				}
				Static1.aStringArray1 = new String[Static82.aClass229_1.method5206()];
				Static440.anInt7083 = 4;
			}
			if (Static440.anInt7083 == 4 && Static82.aClass229_1.method5208() >= Static1.aStringArray1.length * 8) {
				Static206.aClass1_Sub5_Sub1_2.anInt6475 = 0;
				Static82.aClass229_1.method5203(0, Static1.aStringArray1.length * 8, Static206.aClass1_Sub5_Sub1_2.aByteArray89);
				for (local105 = 0; local105 < Static1.aStringArray1.length; local105++) {
					Static1.aStringArray1[local105] = Static65.method1318(Static206.aClass1_Sub5_Sub1_2.method5371());
				}
				Static440.anInt7083 = 0;
				Static443.anInt7125 = 21;
				Static82.aClass229_1.method5204();
				Static82.aClass229_1 = null;
			}
		} catch (@Pc(203) IOException local203) {
			if (Static82.aClass229_1 != null) {
				Static82.aClass229_1.method5204();
				Static82.aClass229_1 = null;
			}
			if (Static303.anInt5252 < 1) {
				Static146.anInt2806 = 0;
				Static440.anInt7083 = 1;
				Static303.anInt5252++;
				Static81.aClass209_1.aBoolean406 = !Static81.aClass209_1.aBoolean406;
			} else {
				Static443.anInt7125 = -4;
				Static440.anInt7083 = 0;
			}
		}
	}
}
