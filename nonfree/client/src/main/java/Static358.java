import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static358 {

	@OriginalMember(owner = "client!nca", name = "H", descriptor = "I")
	public static int anInt6868;

	@OriginalMember(owner = "client!nca", name = "F", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_91 = new Class71(21, 6);

	@OriginalMember(owner = "client!nca", name = "O", descriptor = "Z")
	public static boolean aBoolean480 = false;

	@OriginalMember(owner = "client!nca", name = "V", descriptor = "[I")
	public static final int[] anIntArray384 = new int[1];

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IBI)Z")
	public static boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static531.method7496(arg1, arg0) || Static287.method4823(arg0, arg1);
	}
}
