import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static304 {

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
	public static int anInt5904;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Lclient!ha;")
	public static Class104 aClass104_21;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_87 = new Class252(11, 16);

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public static int anInt5905 = 500;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
	public static int anInt5906 = -2;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Z")
	public static boolean method5353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I[BI)I")
	public static int method5354(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static430.method8157(0, arg0, arg1);
	}
}
