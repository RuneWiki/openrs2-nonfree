import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!na", name = "k", descriptor = "I")
	public static int anInt3492;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "I")
	public static int anInt3493;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!vh;")
	public static Class187 aClass187_93 = new Class187(64);

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	public static int anInt3489 = 0;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "[I")
	public static int[] anIntArray294 = new int[32];

	@OriginalMember(owner = "client!na", name = "i", descriptor = "I")
	public static int anInt3491 = 255;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "[I")
	public static int[] anIntArray295 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Lclient!vj;")
	public static Class29_Sub1 method2992() {
		return Static62.anInt1196 < Static96.aClass29_Sub1Array3.length ? Static96.aClass29_Sub1Array3[Static62.anInt1196++] : null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method2993() {
		@Pc(5) String local5 = "www";
		if (Static85.anInt1679 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(12) String local12 = "";
		if (Static37.aString43 != null) {
			local12 = "/p=" + Static37.aString43;
		}
		return "http://" + local5 + ".runescape.com/l=" + Static114.anInt2371 + "/a=" + Static71.anInt1519 + local12 + "/";
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2994(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub2_Sub11 local16 = Static5.method35(arg1, 3);
		local16.method2866();
		local16.aString190 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
	public static void method2995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			Static127.aClass1_Sub14_Sub1_3.method1408(152);
		}
		if (arg1 == 1) {
			Static127.aClass1_Sub14_Sub1_3.method1408(189);
		}
		Static127.aClass1_Sub14_Sub1_3.method1345(Static32.aBooleanArray9[82] ? 1 : 0);
		Static127.aClass1_Sub14_Sub1_3.method1341(arg0 + Static199.anInt3817);
		Static127.aClass1_Sub14_Sub1_3.method1349(++Static63.aByte18);
		Static127.aClass1_Sub14_Sub1_3.method1341(arg2 + Static192.anInt3637);
	}
}
