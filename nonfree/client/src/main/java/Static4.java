import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "[[[Lclient!hh;")
	public static Class69[][][] aClass69ArrayArrayArray1;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
	public static int anInt162;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "Lclient!ak;")
	public static Class7 aClass7_13;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Lclient!nc;")
	public static Class118 aClass118_2;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public static int anInt146 = -1;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString4 = null;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString5 = "Loaded config";

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString6 = "Loading - please wait.";

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Component;ILclient!jh;II)Lclient!cg;")
	public static Class24 method108(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(4) int arg3) {
		if (Static234.anInt4892 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(34) Class24 local34 = (Class24) Class.forName("Class24_Sub2").getDeclaredConstructor().newInstance();
			local34.anInt2958 = arg1;
			local34.anIntArray365 = new int[(Static129.aBoolean297 ? 2 : 1) * 256];
			local34.method2467(arg0);
			local34.anInt2955 = (-1024 & arg1) + 1024;
			if (local34.anInt2955 > 16384) {
				local34.anInt2955 = 16384;
			}
			local34.method2457(local34.anInt2955);
			if (Static146.anInt2691 > 0 && Static211.aClass178_2 == null) {
				Static211.aClass178_2 = new Class178();
				Static211.aClass178_2.aClass84_5 = arg2;
				arg2.method1958(Static211.aClass178_2, Static146.anInt2691);
			}
			if (Static211.aClass178_2 != null) {
				if (Static211.aClass178_2.aClass24Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static211.aClass178_2.aClass24Array1[arg3] = local34;
			}
			return local34;
		} catch (@Pc(117) Throwable local117) {
			try {
				@Pc(123) Class24_Sub1 local123 = new Class24_Sub1(arg2, arg3);
				local123.anIntArray365 = new int[(Static129.aBoolean297 ? 2 : 1) * 256];
				local123.anInt2958 = arg1;
				local123.method2467(arg0);
				local123.anInt2955 = 16384;
				local123.method2457(local123.anInt2955);
				if (Static146.anInt2691 > 0 && Static211.aClass178_2 == null) {
					Static211.aClass178_2 = new Class178();
					Static211.aClass178_2.aClass84_5 = arg2;
					arg2.method1958(Static211.aClass178_2, Static146.anInt2691);
				}
				if (Static211.aClass178_2 != null) {
					if (Static211.aClass178_2.aClass24Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static211.aClass178_2.aClass24Array1[arg3] = local123;
				}
				return local123;
			} catch (@Pc(184) Throwable local184) {
				return new Class24();
			}
		}
	}
}
