import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vs", name = "J", descriptor = "Lclient!wn;")
	public static Class92 aClass92_4;

	@OriginalMember(owner = "client!vs", name = "B", descriptor = "I")
	public static int anInt7161 = 2;

	@OriginalMember(owner = "client!vs", name = "E", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_129 = new Class186(106, -1);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIZ)I")
	public static int method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = local7 << 1 | arg0 & 0x1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local7;
	}
}
