import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static226 {

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
	public static int anInt5043;

	@OriginalMember(owner = "client!ht", name = "o", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "Lclient!ida;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_70 = new Class73(94, -1);

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
	public static int anInt5045 = -1;

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_47 = new Class185(48, 2);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BILclient!ac;III)Lclient!iaa;")
	public static Class2_Sub1_Sub1 method4127(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.aBoolean30 || Static152.method3040(arg2) && Static152.method3040(arg0)) {
			return new Class2_Sub1_Sub1(arg1, 3553, arg3, arg4, arg2, arg0, true);
		} else if (arg1.aBoolean20) {
			return new Class2_Sub1_Sub1(arg1, 34037, arg3, arg4, arg2, arg0, true);
		} else {
			return new Class2_Sub1_Sub1(arg1, arg3, arg4, arg2, arg0, Static101.method2622(arg2), Static101.method2622(arg0), true);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	public static void method4129() {
		if (Static468.anInt8336 < 0) {
			Static468.anInt8336 = 0;
			Static181.anInt3980 = -1;
			Static315.anInt6316 = -1;
		}
		if (Static468.anInt8336 > Static491.anInt7789) {
			Static315.anInt6316 = -1;
			Static181.anInt3980 = -1;
			Static468.anInt8336 = Static491.anInt7789;
		}
		if (Static457.anInt8209 < 0) {
			Static315.anInt6316 = -1;
			Static181.anInt3980 = -1;
			Static457.anInt8209 = 0;
		}
		if (Static457.anInt8209 > Static491.anInt7787) {
			Static181.anInt3980 = -1;
			Static457.anInt8209 = Static491.anInt7787;
			Static315.anInt6316 = -1;
		}
	}
}
