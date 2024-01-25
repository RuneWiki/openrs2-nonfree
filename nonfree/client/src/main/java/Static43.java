import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "Lclient!hm;")
	public static final Class122 aClass122_1 = new Class122();

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "Lclient!h;")
	public static final Class114 aClass114_20 = new Class114("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public static void method1387() {
		for (@Pc(15) Class1_Sub37 local15 = (Class1_Sub37) Static500.aClass38_71.method1419(); local15 != null; local15 = (Class1_Sub37) Static500.aClass38_71.method1415()) {
			if (local15.anInt6620 > 0) {
				local15.anInt6620--;
			}
			if (local15.anInt6620 != 0) {
				if (local15.anInt6623 > 0) {
					local15.anInt6623--;
				}
				if (local15.anInt6623 == 0 && local15.anInt6624 >= 1 && local15.anInt6615 >= 1 && local15.anInt6624 <= Static542.anInt9387 - 2 && local15.anInt6615 <= Static36.anInt1324 - 2 && (local15.anInt6614 < 0 || Static542.method7917(local15.anInt6612, local15.anInt6614))) {
					Static81.method2026(local15.anInt6619, local15.anInt6614, local15.anInt6621, local15.anInt6625, local15.anInt6612, local15.anInt6624, local15.anInt6615, -1);
					local15.anInt6623 = -1;
					if (local15.anInt6614 == local15.anInt6613 && local15.anInt6613 == -1) {
						local15.method7983();
					} else if (local15.anInt6614 == local15.anInt6613 && local15.anInt6625 == local15.anInt6616 && local15.anInt6617 == local15.anInt6612) {
						local15.method7983();
					}
				}
			} else if (local15.anInt6613 < 0 || Static542.method7917(local15.anInt6617, local15.anInt6613)) {
				Static81.method2026(local15.anInt6619, local15.anInt6613, local15.anInt6621, local15.anInt6616, local15.anInt6617, local15.anInt6624, local15.anInt6615, -1);
				local15.method7983();
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)Z")
	public static boolean method1389(@OriginalArg(0) int arg0) {
		if (Static236.aBooleanArray18[arg0]) {
			return true;
		} else if (Static503.aClass160_97.method4208(arg0)) {
			@Pc(21) int local21 = Static503.aClass160_97.method4207(arg0);
			if (local21 == 0) {
				Static236.aBooleanArray18[arg0] = true;
				return true;
			}
			if (Static352.aClass309ArrayArray2[arg0] == null) {
				Static352.aClass309ArrayArray2[arg0] = new Class309[local21];
			}
			for (@Pc(43) int local43 = 0; local43 < local21; local43++) {
				if (Static352.aClass309ArrayArray2[arg0][local43] == null) {
					@Pc(56) byte[] local56 = Static503.aClass160_97.method4198(local43, arg0);
					if (local56 != null) {
						@Pc(68) Class309 local68 = Static352.aClass309ArrayArray2[arg0][local43] = new Class309();
						local68.anInt8750 = (arg0 << 16) + local43;
						if (local56[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local68.method7384(new Class1_Sub13(local56));
					}
				}
			}
			Static236.aBooleanArray18[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZII)Z")
	public static boolean method1390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
