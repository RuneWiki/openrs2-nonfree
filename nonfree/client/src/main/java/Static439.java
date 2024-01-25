import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static439 {

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
	public static int anInt7742;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "Lclient!jd;")
	public static Class127 aClass127_2;

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_107 = new Class177(20, 8);

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_108 = new Class177(53, 2);

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)Z")
	public static boolean method5902(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BI)Lclient!hd;")
	public static Class103_Sub1 method5905(@OriginalArg(1) int arg0) {
		return Static418.aBoolean477 && Static452.anInt7921 <= arg0 && arg0 <= Static461.anInt7756 ? Static361.aClass103_Sub1Array4[arg0 - Static452.anInt7921] : null;
	}
}
