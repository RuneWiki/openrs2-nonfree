import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static297 {

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
	public static int anInt4862;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	public static int anInt4861 = -1;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_170 = new Class288(101, 16);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBI)Z")
	public static boolean method4098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100100) != 0;
	}
}
