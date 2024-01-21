import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
	public static int[] anIntArray194;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
	public static int anInt1684;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	public static int anInt1678 = 0;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!gd;")
	private static Class23 aClass23_899 = Static15.method178("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!gd;")
	private static Class23 aClass23_900 = Static15.method178("Prepared visibility map");

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_901 = aClass23_899;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "Lclient!gd;")
	public static Class23 aClass23_902 = Static15.method178("Icons redrawn");

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "Z")
	public static volatile boolean aBoolean86 = true;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Lclient!gd;")
	public static Class23 aClass23_903 = Static15.method178("Texturen geladen)3");

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "Lclient!gd;")
	public static Class23 aClass23_904 = aClass23_900;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method1047() {
		aClass23_901 = null;
		aClass23_900 = null;
		anIntArray194 = null;
		aClass23_904 = null;
		aClass23_899 = null;
		aClass23_903 = null;
		aClass23_902 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JB)Lclient!gd;")
	public static Class23 method1049(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			@Pc(27) long local27 = arg0;
			while (local27 != 0L) {
				local27 /= 37L;
				local25++;
			}
			@Pc(45) byte[] local45 = new byte[local25];
			while (arg0 != 0L) {
				@Pc(48) long local48 = arg0;
				arg0 /= 37L;
				local25--;
				local45[local25] = Static67.aByteArray12[(int) (local48 - arg0 * 37L)];
			}
			@Pc(73) Class23 local73 = new Class23();
			local73.aByteArray4 = local45;
			local73.anInt965 = local45.length;
			return local73;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ee;)Z")
	public static boolean method1050(@OriginalArg(1) Class1_Sub1_Sub7 arg0) {
		@Pc(2) int local2 = arg0.anInt839;
		if (local2 >= 1 && local2 <= 200 || !(local2 < 701 || local2 > 900)) {
			if (local2 >= 801) {
				local2 -= 701;
			} else if (local2 >= 701) {
				local2 -= 601;
			} else if (local2 < 101) {
				local2--;
			} else {
				local2 -= 101;
			}
			Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, Static8.aClass23Array4[local2] }), Static114.aClass23_1728, 14, 0);
			Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, Static8.aClass23Array4[local2] }), Static10.aClass23_167, 29, 0);
			return true;
		} else if (local2 >= 401 && local2 <= 500) {
			Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, arg0.aClass23_461 }), Static114.aClass23_1728, 10, 0);
			return true;
		} else {
			return false;
		}
	}
}
