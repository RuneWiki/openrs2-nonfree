import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!we", name = "D", descriptor = "[I")
	public static int[] anIntArray637;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "Lclient!ke;")
	public static Class43 aClass43_45;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1541 = Static146.method2172("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!we", name = "x", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1542 = Static146.method2172("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!we", name = "A", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1543 = Static146.method2172("<col=80ff00>");

	@OriginalMember(owner = "client!we", name = "B", descriptor = "I")
	public static int anInt4522 = 0;

	@OriginalMember(owner = "client!we", name = "C", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array27 = new Class77[1000];

	@OriginalMember(owner = "client!we", name = "E", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1544 = Static146.method2172(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!we", name = "F", descriptor = "[I")
	public static int[] anIntArray638 = new int[1000];

	@OriginalMember(owner = "client!we", name = "K", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1545 = aClass77_1542;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
	public static void method2972() {
		@Pc(14) int local14 = (Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 >> 7) + Static157.anInt3889;
		@Pc(21) int local21 = Static168.anInt4143 + (Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 >> 7);
		Static21.anInt678 = 0;
		if (local14 >= 3053 && local14 <= 3156 && local21 >= 3056 && local21 <= 3136) {
			Static21.anInt678 = 1;
		}
		if (local14 >= 3072 && local14 <= 3118 && local21 >= 9492 && local21 <= 9535) {
			Static21.anInt678 = 1;
		}
		if (Static21.anInt678 == 1 && local14 >= 3139 && local14 <= 3199 && local21 >= 3008 && local21 <= 3062) {
			Static21.anInt678 = 0;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method2973(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static20.method456(local13) : local13;
		} else if (arg1 instanceof Class20) {
			@Pc(27) Class20 local27 = (Class20) arg1;
			return local27.method711();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
	public static void method2974() {
		anIntArray637 = null;
		aClass77_1543 = null;
		aClass77_1545 = null;
		aClass77_1544 = null;
		anIntArray638 = null;
		aClass77_1541 = null;
		aClass43_45 = null;
		aClass77_1542 = null;
		aClass77Array27 = null;
	}
}
