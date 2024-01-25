import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!vt", name = "X", descriptor = "[I")
	public static int[] anIntArray560;

	@OriginalMember(owner = "client!vt", name = "N", descriptor = "Lclient!gt;")
	public static final Class89 aClass89_3 = new Class89("runescape", 0);

	@OriginalMember(owner = "client!vt", name = "T", descriptor = "I")
	public static int anInt7406 = 0;

	@OriginalMember(owner = "client!vt", name = "Y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray172 = new String[200];

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(B)Ljava/lang/String;")
	public static String method5783() {
		@Pc(5) String local5 = "www";
		if (Static356.aClass238_6 == Static337.aClass238_5) {
			local5 = "www-wtrc";
		} else if (Static356.aClass238_6 == Static243.aClass238_3) {
			local5 = "www-wtqa";
		} else if (Static356.aClass238_6 == Static336.aClass238_4) {
			local5 = "www-wtwip";
		}
		@Pc(24) String local24 = "";
		if (Static16.aString3 != null) {
			local24 = "/p=" + Static16.aString3;
		}
		return "http://" + local5 + "." + Static114.aClass89_2.aString30 + ".com/l=" + Static216.anInt4257 + "/a=" + Static448.anInt7558 + local24 + "/";
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "([IIIZILclient!gk;)Lclient!cw;")
	public static Class42_Sub1_Sub1 method5784(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class75_Sub2 arg3) {
		if (arg3.aBoolean239 || Static39.method920(arg1) && Static39.method920(arg2)) {
			return new Class42_Sub1_Sub1(arg3, 3553, arg1, arg2, false, arg0);
		} else if (arg3.aBoolean244) {
			return new Class42_Sub1_Sub1(arg3, 34037, arg1, arg2, false, arg0);
		} else {
			return new Class42_Sub1_Sub1(arg3, arg1, arg2, Static350.method4984(arg1), Static350.method4984(arg2), arg0);
		}
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(ZI)Z")
	public static boolean method5785(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(III)Z")
	public static boolean method5786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
