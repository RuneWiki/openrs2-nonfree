import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!uca", name = "v", descriptor = "[Lclient!hu;")
	public static Class21[] aClass21Array11;

	@OriginalMember(owner = "client!uca", name = "B", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!uca", name = "t", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!uca", name = "u", descriptor = "Lclient!of;")
	public static final Class236 aClass236_33 = new Class236(30);

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLjava/lang/Object;Z)[B")
	public static byte[] method3489(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static213.method4052(local13) : local13;
		} else if (arg0 instanceof Class329) {
			@Pc(27) Class329 local27 = (Class329) arg0;
			return local27.method7730();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3490(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(36) int local36 = arg0.indexOf(" ", "directlogin ".length());
			if (local36 >= 0) {
				@Pc(44) int local44 = arg0.length();
				arg0 = arg0.substring(0, local36) + " ";
				for (@Pc(60) int local60 = local36 + 1; local60 < local44; local60++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)Lclient!uw;")
	public static Class348 method3492(@OriginalArg(0) int arg0) {
		@Pc(13) Class348[] local13 = Static199.method3711();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class348 local21 = local13[local15];
			if (local21.anInt10037 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
