import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "[S")
	public static short[] aShortArray160;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "[Lclient!mb;")
	public static Class62[] aClass62Array135;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "D")
	public static double aDouble113;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1534 = Static151.method2243(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1535 = Static151.method2243("(U4");

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1536 = Static151.method2243("Bitte geben Sie Ihren Benutzernamen ein)3");

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	public static int anInt4499 = -1;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public static void method3185() {
		while (true) {
			if (Static108.aClass2_Sub11_Sub1_3.method1588(Static35.anInt838) >= 11) {
				@Pc(16) int local16 = Static108.aClass2_Sub11_Sub1_3.method1584(11);
				if (local16 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static62.aClass7_Sub2_Sub2Array1[local16] == null) {
						local21 = true;
						Static62.aClass7_Sub2_Sub2Array1[local16] = new Class7_Sub2_Sub2();
						if (Static169.aClass2_Sub11Array1[local16] != null) {
							Static62.aClass7_Sub2_Sub2Array1[local16].method2180(Static169.aClass2_Sub11Array1[local16]);
						}
					}
					Static28.anIntArray60[Static145.anInt3126++] = local16;
					@Pc(59) Class7_Sub2_Sub2 local59 = Static62.aClass7_Sub2_Sub2Array1[local16];
					local59.anInt3043 = Static25.anInt581;
					@Pc(69) int local69 = Static108.aClass2_Sub11_Sub1_3.method1584(5);
					if (local69 > 15) {
						local69 -= 32;
					}
					@Pc(80) int local80 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
					@Pc(85) int local85 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
					if (local85 == 1) {
						Static187.anIntArray355[Static196.anInt4032++] = local16;
					}
					@Pc(103) int local103 = Static108.aClass2_Sub11_Sub1_3.method1584(5);
					@Pc(110) int local110 = Static185.anIntArray350[Static108.aClass2_Sub11_Sub1_3.method1584(3)];
					if (local21) {
						local59.anInt3098 = local59.anInt3071 = local110;
					}
					if (local103 > 15) {
						local103 -= 32;
					}
					local59.method2176(local103 + Static186.aClass7_Sub2_Sub2_1.anIntArray274[0], local69 + Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], local80 == 1);
					continue;
				}
			}
			Static108.aClass2_Sub11_Sub1_3.method1585();
			return;
		}
	}
}
