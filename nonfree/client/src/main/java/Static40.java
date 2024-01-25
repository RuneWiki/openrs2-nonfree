import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Lclient!ei;")
	public static final Class89 aClass89_2 = new Class89("stellardawn", 1);

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[8];

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static int anInt1150 = -1;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	public static void method1076() {
		Static302.aClass251Array2 = null;
		Static353.method5077(Static79.anInt2118, Static34.anInt3201, -1, 0, 0, 0, 0, Static492.anInt8445);
		if (Static302.aClass251Array2 != null) {
			Static122.method2358(Static492.anInt8445, Static45.aClass251_3.anInt7286, Static114.anInt2704, 0, Static34.anInt3201, Static98.anInt2413, Static302.aClass251Array2, -1412584499, 0);
			Static302.aClass251Array2 = null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	public static void method1078(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub7_Sub19 local14 = Static73.method5992(6, arg0);
		local14.method7364();
	}
}
