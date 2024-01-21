import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "Z")
	public static final boolean aBoolean158 = false;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1166 = Static38.method685("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1167 = Static38.method685("headicons_pk");

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1168 = Static38.method685("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1169 = Static38.method685("swe");

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1170 = Static38.method685("event_opbase");

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1171 = aClass6_1166;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	public static int anInt3924 = 0;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1172 = Static38.method685("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
	public static int anInt3925 = 0;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "[[S")
	public static short[][] aShortArrayArray8 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	public static void method2652() {
		aClass6_1167 = null;
		aClass6_1166 = null;
		aShortArrayArray8 = null;
		aClass6_1170 = null;
		aClass6_1171 = null;
		aClass6_1168 = null;
		aClass6_1169 = null;
		aClass6_1172 = null;
		aByteArrayArray10 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ai;I)Z")
	public static boolean method2653(@OriginalArg(0) Class6 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static68.anInt1729; local18++) {
			if (arg0.method137(Static10.aClass6Array2[local18])) {
				return true;
			}
		}
		return false;
	}
}
