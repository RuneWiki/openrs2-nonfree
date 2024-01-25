import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static215 {

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "Lclient!ph;")
	public static Class183 aClass183_2;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
	public static int anInt4228;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_146 = new Class184(9, -1);

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Lclient!pb;")
	public static final Class180 aClass180_3 = new Class180("", 17);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Z")
	public static boolean method3448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static79.method1403(arg0, arg1) | Static436.method5786(arg0, arg1)) & Static433.method5746(arg0, arg1);
	}
}
