import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static424 {

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
	public static int anInt7466;

	@OriginalMember(owner = "client!nha", name = "j", descriptor = "Lclient!ej;")
	public static Class3_Sub4_Sub5 aClass3_Sub4_Sub5_3;

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "Lclient!ed;")
	public static final Class88 aClass88_2 = new Class88(false);

	@OriginalMember(owner = "client!nha", name = "h", descriptor = "Lclient!ed;")
	public static Class88 aClass88_1 = aClass88_2;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "S")
	public static short aShort97 = 32767;

	@OriginalMember(owner = "client!nha", name = "l", descriptor = "Lclient!m;")
	public static final Class235 aClass235_37 = new Class235(30);

	@OriginalMember(owner = "client!nha", name = "k", descriptor = "I")
	public static int anInt7467 = 0;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(III)Z")
	public static boolean method6248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)Z")
	public static boolean method6249(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 9 || arg0 == 11;
	}
}
