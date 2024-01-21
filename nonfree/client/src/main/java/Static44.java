import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "Lclient!p;")
	public static Class45 aClass45_21;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!rd;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
	public static int anInt1079;

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] aClass2_Sub2_Sub2_Sub4Array6;

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
	public static int anInt1075 = 0;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "Lclient!o;")
	public static Class40 aClass40_330 = Static13.method257("@gre@World");

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	public static int anInt1077 = 0;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "Lclient!o;")
	public static Class40 aClass40_331 = Static13.method257("Welcome to RuneScape");

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Lclient!o;")
	public static Class40 aClass40_332 = Static13.method257("cross");

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "Lclient!o;")
	public static Class40 aClass40_333 = Static13.method257(" with)3)3)3");

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
	public static int anInt1080 = 0;

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "Lclient!o;")
	public static Class40 aClass40_334 = Static13.method257("shake:");

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "Lclient!o;")
	public static Class40 aClass40_335 = Static13.method257("(U(Y");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V")
	public static void method787(@OriginalArg(0) boolean arg0) {
		if (Static31.aClass25_48 == null) {
			return;
		}
		try {
			@Pc(11) Class2_Sub3 local11 = new Class2_Sub3(4);
			local11.method1703(arg0 ? 2 : 3);
			local11.method1688(0);
			Static31.aClass25_48.method731(local11.aByteArray24, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				Static31.aClass25_48.method730();
			} catch (@Pc(37) Exception local37) {
			}
			Static31.aClass25_48 = null;
			Static101.anInt2401++;
		}
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
	public static void method790() {
		aClass45_21 = null;
		aClass40_333 = null;
		aClass40_334 = null;
		aClass2_Sub2_Sub2_Sub4Array6 = null;
		aClass40_335 = null;
		aClass52_1 = null;
		aClass40_331 = null;
		aClass40_330 = null;
		aClass40_332 = null;
	}
}
