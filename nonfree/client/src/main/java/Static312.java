import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static312 {

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_206 = new Class214(71, 8);

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I")
	public static int method5440(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(Z)[Lclient!rj;")
	public static Class219[] method5441() {
		return new Class219[] { Static297.aClass219_2, Static432.aClass219_6, Static463.aClass219_7, Static357.aClass219_5, Static337.aClass219_4, Static326.aClass219_3 };
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BII)Z")
	public static boolean method5442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static433.method1197(arg0, arg1) || Static256.method4186(arg0, arg1);
	}
}
