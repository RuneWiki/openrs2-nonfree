import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!wc", name = "ib", descriptor = "Lclient!ie;")
	public static Class2_Sub2_Sub2 aClass2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "[I")
	public static int[] anIntArray412 = new int[128];

	@OriginalMember(owner = "client!wc", name = "X", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1253 = Static119.method1462("titlebutton");

	@OriginalMember(owner = "client!wc", name = "Z", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1254 = Static119.method1462("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!wc", name = "ab", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1255 = Static119.method1462("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!wc", name = "bb", descriptor = "[I")
	public static int[] anIntArray413 = new int[] { 21, 57, 11, 24, 13, 42, 29, 6 };

	@OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
	public static volatile int anInt2895 = -1;

	@OriginalMember(owner = "client!wc", name = "db", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1256 = Static119.method1462("(U0a )2 in: ");

	@OriginalMember(owner = "client!wc", name = "eb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1257 = Static119.method1462("Freie Welt");

	@OriginalMember(owner = "client!wc", name = "fb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1258 = aClass65_1254;

	@OriginalMember(owner = "client!wc", name = "hb", descriptor = "[I")
	public static int[] anIntArray414 = new int[100];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/awt/Component;ILclient!df;I)Lclient!ac;")
	public static Class4 method2031(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class20 arg2, @OriginalArg(4) int arg3) {
		if (Static107.anInt2405 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(28) Class4 local28 = (Class4) Class.forName("Class4_Sub1").getDeclaredConstructor().newInstance();
			local28.anIntArray158 = new int[(Static28.aBoolean29 ? 2 : 1) * 256];
			local28.anInt1247 = arg1;
			local28.method873(arg0);
			local28.anInt1244 = (arg1 & 0xFFFFFC00) + 1024;
			if (local28.anInt1244 > 16384) {
				local28.anInt1244 = 16384;
			}
			local28.method864(local28.anInt1244);
			if (Static4.anInt1218 > 0 && Static37.aClass29_1 == null) {
				Static37.aClass29_1 = new Class29();
				Static37.aClass29_1.aClass20_3 = arg2;
				arg2.method374(Static4.anInt1218, Static37.aClass29_1);
			}
			if (Static37.aClass29_1 != null) {
				if (Static37.aClass29_1.aClass4Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static37.aClass29_1.aClass4Array1[arg3] = local28;
			}
			return local28;
		} catch (@Pc(98) Throwable local98) {
			try {
				@Pc(104) Class4_Sub2 local104 = new Class4_Sub2(arg2, arg3);
				local104.anIntArray158 = new int[(Static28.aBoolean29 ? 2 : 1) * 256];
				local104.anInt1247 = arg1;
				local104.method873(arg0);
				local104.anInt1244 = 16384;
				local104.method864(local104.anInt1244);
				if (Static4.anInt1218 > 0 && Static37.aClass29_1 == null) {
					Static37.aClass29_1 = new Class29();
					Static37.aClass29_1.aClass20_3 = arg2;
					arg2.method374(Static4.anInt1218, Static37.aClass29_1);
				}
				if (Static37.aClass29_1 != null) {
					if (Static37.aClass29_1.aClass4Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static37.aClass29_1.aClass4Array1[arg3] = local104;
				}
				return local104;
			} catch (@Pc(166) Throwable local166) {
				return new Class4();
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
	public static void method2032() {
		aClass65_1253 = null;
		aClass65_1257 = null;
		aClass65_1254 = null;
		aClass2_Sub2_Sub2_2 = null;
		aClass65_1255 = null;
		anIntArray413 = null;
		aClass65_1256 = null;
		aClass65_1258 = null;
		anIntArray414 = null;
		Class2_Sub1_Sub17.anIntArray409 = null;
		anIntArray412 = null;
		aShortArrayArray6 = null;
	}
}
