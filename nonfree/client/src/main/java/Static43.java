import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!c;")
	public static Class29 aClass29_5;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public static int anInt5303;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	public static int anInt5299 = 0;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_96 = new Class198(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt5301 = 0;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt5302 = -1;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_97 = new Class198("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[J")
	public static final long[] aLongArray28 = new long[32];

	@OriginalMember(owner = "client!c", name = "k", descriptor = "I")
	public static int anInt5304 = 2;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)Z")
	public static boolean method4103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IC)Z")
	public static boolean method4106(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
