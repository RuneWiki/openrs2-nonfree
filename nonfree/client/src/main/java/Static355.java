import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "Lclient!fj;")
	public static Class97 aClass97_1;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
	public static int anInt6156;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_189 = new Class272(48, 3);

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	public static int anInt6147 = 0;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
	public static int anInt6148 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLclient!om;)V")
	public static void method5320(@OriginalArg(1) Class246 arg0) {
		Static23.aClass246_18 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public static void method5322() {
		Static46.method782();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)V")
	public static void method5323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static154.aByteArrayArrayArray15 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
	public static void method5325(@OriginalArg(1) boolean arg0) {
		Static66.method1526();
		if (!Static59.method4458(Static246.anInt4542)) {
			return;
		}
		Static218.anInt4297++;
		if (Static218.anInt4297 < 50 && !arg0) {
			return;
		}
		Static218.anInt4297 = 0;
		if (!Static447.aBoolean581 && Static78.aClass152_2 != null) {
			@Pc(41) Class3_Sub34 local41 = Static374.method5522(Static192.aClass298_74, Static220.aClass287_2);
			Static131.method2572(local41);
			try {
				Static556.method7408();
			} catch (@Pc(50) IOException local50) {
				Static447.aBoolean581 = true;
			}
		}
		Static66.method1526();
	}
}
