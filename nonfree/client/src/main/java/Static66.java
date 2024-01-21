import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt1786;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1037 = Static107.method1838("Welt");

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1038 = Static107.method1838("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1039 = Static107.method1838("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1040 = Static107.method1838("sch-Utteln:");

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1041 = Static107.method1838("sl_arrows");

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
	public static int anInt1789 = 0;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1045 = Static107.method1838("glow2:");

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1042 = aClass28_1045;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1043 = aClass28_1045;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1044 = aClass28_1039;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ab;I)Lclient!v;")
	public static Class2_Sub3 method1215(@OriginalArg(0) Class2_Sub2 arg0) {
		@Pc(5) int local5 = arg0.method1698();
		@Pc(9) int local9 = arg0.method1698();
		@Pc(13) Class local13 = Static154.method2375(local9);
		try {
			@Pc(21) Class2_Sub3 local21 = (Class2_Sub3) local13.getDeclaredConstructor().newInstance();
			if (local21 != null) {
				local21.anInt4057 = local5;
				local21.anInt4060 = arg0.method1698();
				@Pc(35) int local35 = arg0.method1698();
				for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
					@Pc(43) int local43 = arg0.method1698();
					local21.method2904(local43, arg0);
				}
			}
			local21.method2892();
			return local21;
		} catch (@Pc(67) IllegalAccessException local67) {
			throw new RuntimeException();
		} catch (@Pc(72) InstantiationException local72) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method1216() {
		aClass28_1038 = null;
		aClass28_1040 = null;
		anImage3 = null;
		aClass28_1039 = null;
		aClass28_1043 = null;
		aClass28_1044 = null;
		aClass28_1041 = null;
		aClass28_1037 = null;
		aClass28_1045 = null;
		aClass28_1042 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
	public static int method1217(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local16;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!jc;I)V")
	public static void method1218(@OriginalArg(0) Class40 arg0) {
		Static146.aClass40_33 = arg0;
	}
}
