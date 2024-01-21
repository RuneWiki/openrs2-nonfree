import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!cg;")
	public static Class2_Sub1_Sub4_Sub1_Sub1 aClass2_Sub1_Sub4_Sub1_Sub1_2;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!cd;")
	public static Class10 aClass10_171 = Static51.method932("Hier wechseln");

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!cd;")
	private static Class10 aClass10_172 = Static51.method932("No reply from loginserver)3");

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Lclient!cd;")
	public static Class10 aClass10_173 = Static51.method932("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "Lclient!cd;")
	public static Class10 aClass10_174 = aClass10_172;

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "Lclient!cd;")
	private static Class10 aClass10_177 = Static51.method932("flash3:");

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "Lclient!cd;")
	public static Class10 aClass10_175 = aClass10_177;

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "Lclient!cd;")
	public static Class10 aClass10_176 = aClass10_177;

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
	public static int anInt379 = 0;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
	public static void method216() {
		aClass2_Sub1_Sub4_Sub1_Sub1_2 = null;
		aClass10_176 = null;
		aClass10_173 = null;
		aClass10_172 = null;
		aClass10_175 = null;
		aLongArray1 = null;
		aClass10_171 = null;
		aClass10_174 = null;
		aClass10_177 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!kh;Lclient!kh;)V")
	public static void method218(@OriginalArg(1) Class29 arg0, @OriginalArg(2) Class29 arg1) {
		Static137.aClass29_59 = arg1;
		Static161.aClass29_66 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!pc;ILjava/awt/Component;I)Lclient!vf;")
	public static Class82 method219(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static45.anInt1131 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(40) Class82 local40 = (Class82) Class.forName("Class82_Sub1").getDeclaredConstructor().newInstance();
			local40.anIntArray403 = new int[(Static128.aBoolean130 ? 2 : 1) * 256];
			local40.anInt3715 = arg3;
			local40.method2631(arg2);
			local40.anInt3714 = (arg3 & 0xFFFFFC00) + 1024;
			if (local40.anInt3714 > 16384) {
				local40.anInt3714 = 16384;
			}
			local40.method2640(local40.anInt3714);
			if (Static130.anInt2892 > 0 && Static160.aClass9_1 == null) {
				Static160.aClass9_1 = new Class9();
				Static160.aClass9_1.aClass63_2 = arg0;
				arg0.method1956(Static160.aClass9_1, Static130.anInt2892);
			}
			if (Static160.aClass9_1 != null) {
				if (Static160.aClass9_1.aClass82Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static160.aClass9_1.aClass82Array1[arg1] = local40;
			}
			return local40;
		} catch (@Pc(115) Throwable local115) {
			try {
				@Pc(121) Class82_Sub2 local121 = new Class82_Sub2(arg0, arg1);
				local121.anIntArray403 = new int[(Static128.aBoolean130 ? 2 : 1) * 256];
				local121.anInt3715 = arg3;
				local121.method2631(arg2);
				local121.anInt3714 = 16384;
				local121.method2640(local121.anInt3714);
				if (Static130.anInt2892 > 0 && Static160.aClass9_1 == null) {
					Static160.aClass9_1 = new Class9();
					Static160.aClass9_1.aClass63_2 = arg0;
					arg0.method1956(Static160.aClass9_1, Static130.anInt2892);
				}
				if (Static160.aClass9_1 != null) {
					if (Static160.aClass9_1.aClass82Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static160.aClass9_1.aClass82Array1[arg1] = local121;
				}
				return local121;
			} catch (@Pc(180) Throwable local180) {
				return new Class82();
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!kh;Z)V")
	public static void method220(@OriginalArg(0) Class29 arg0) {
		Static61.aClass29_68 = arg0;
	}
}
