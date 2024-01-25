import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "Lclient!lga;")
	public static Class223 aClass223_76;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "Lclient!lf;")
	public static final Class221 aClass221_13 = new Class221(4, 4);

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
	public static int anInt6011 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBI)I")
	public static int method5414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = 0;
		while (arg1 > 0) {
			local13 = arg0 & 0x1 | local13 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local13;
	}
}
