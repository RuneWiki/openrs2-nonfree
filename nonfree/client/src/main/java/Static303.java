import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "Z")
	public static boolean aBoolean418 = false;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "Lclient!np;")
	public static Class254 aClass254_1 = new Class254();

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIZ)V")
	public static void method4654(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static486.anInt8161++;
			Static125.method1771();
		}
		if (arg1) {
			Static342.anInt6070++;
			Static604.method8667();
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
	public static void method4655(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg0, 3);
		local9.method2686();
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	public static void method4657() {
		Static60.aClass57_1.xa(((float) Static637.aClass5_Sub20_31.aClass24_Sub9_1.method2798() * 0.1F + 0.7F) * 1.1523438F);
		Static60.aClass57_1.ZA(Static257.anInt6392, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static60.aClass57_1.L(Static279.anInt4837, -1, 0);
		Static60.aClass57_1.method7702(Static491.aClass29_4);
	}
}
