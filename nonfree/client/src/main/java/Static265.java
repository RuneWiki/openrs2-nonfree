import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!kca", name = "o", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_118 = new Class81(42, -1);

	@OriginalMember(owner = "client!kca", name = "p", descriptor = "Z")
	public static boolean aBoolean380 = true;

	@OriginalMember(owner = "client!kca", name = "t", descriptor = "I")
	public static int anInt4986 = 1;

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)Z")
	public static boolean method4179() {
		try {
			if (Static352.anInt6186 == 2) {
				if (Static185.aClass1_Sub49_1 == null) {
					Static185.aClass1_Sub49_1 = Static605.method7137(Static250.aClass111_52, Static456.anInt7778, Static21.anInt620);
					if (Static185.aClass1_Sub49_1 == null) {
						return false;
					}
				}
				if (Static34.aClass249_1 == null) {
					Static34.aClass249_1 = new Class249(Static213.aClass111_48, Static25.aClass111_4);
				}
				if (Static504.aClass1_Sub8_Sub3_33.method4654(Static34.aClass249_1, Static185.aClass1_Sub49_1, Static69.aClass111_15)) {
					Static504.aClass1_Sub8_Sub3_33.method4640();
					if (Static507.anInt8455 > 0) {
						Static352.anInt6186 = 3;
						Static504.aClass1_Sub8_Sub3_33.method4651(0);
					} else {
						Static352.anInt6186 = 0;
						Static504.aClass1_Sub8_Sub3_33.method4651(Static69.anInt1589);
					}
					if (Static85.aLong89 > 0L) {
						Static504.aClass1_Sub8_Sub3_33.method4667(Static85.aLong89, Static564.aBoolean671, Static185.aClass1_Sub49_1);
					} else {
						Static504.aClass1_Sub8_Sub3_33.method4659(Static185.aClass1_Sub49_1, Static564.aBoolean671);
					}
					Static34.aClass249_1 = null;
					Static85.aLong89 = 0L;
					Static250.aClass111_52 = null;
					Static185.aClass1_Sub49_1 = null;
					return true;
				}
			}
		} catch (@Pc(90) Exception local90) {
			local90.printStackTrace();
			Static504.aClass1_Sub8_Sub3_33.method4666();
			Static34.aClass249_1 = null;
			Static250.aClass111_52 = null;
			Static352.anInt6186 = 0;
			Static185.aClass1_Sub49_1 = null;
		}
		return false;
	}
}
