import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
	public static int anInt3128;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	public static int anInt3129;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1073 = Static151.method2243("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	public static int anInt3126 = 0;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1074 = Static151.method2243("hint_mapedge");

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean137 = true;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1075 = Static151.method2243("Null");

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1076 = Static151.method2243("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1077 = null;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)V")
	public static void method2186(@OriginalArg(1) boolean arg0) {
		Static8.method148();
		Static209.anInt4379++;
		if (Static209.anInt4379 < 50 && !arg0) {
			return;
		}
		Static209.anInt4379 = 0;
		if (Static43.aBoolean41 || Static151.aClass36_3 == null) {
			return;
		}
		Static58.aClass2_Sub11_Sub1_2.method1595(34);
		try {
			Static151.aClass36_3.method858(Static58.aClass2_Sub11_Sub1_2.aByteArray26, Static58.aClass2_Sub11_Sub1_2.anInt2235);
			Static58.aClass2_Sub11_Sub1_2.anInt2235 = 0;
		} catch (@Pc(42) IOException local42) {
			Static43.aBoolean41 = true;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)I")
	public static int method2187() {
		return Static1.anInt35;
	}
}
