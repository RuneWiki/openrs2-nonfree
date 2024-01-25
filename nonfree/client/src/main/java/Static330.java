import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static330 {

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Lclient!mn;")
	public static Class227 aClass227_1;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
	public static int anInt5532;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_176 = new Class235(35, 7);

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "S")
	public static short aShort75 = 256;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZI)Z")
	public static boolean method4520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static27.method316(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static410.method5651(arg1, arg0) | Static332.method5799(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static559.method7593(arg1, arg0) | Static64.method1167(arg1, arg0));
		} else {
			return false;
		}
	}
}
