import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static404 {

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "Lclient!f;")
	public static Class10 aClass10_32;

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "Lclient!jm;")
	public static Class174 aClass174_4;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_164 = new Class81(31, -1);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BII)Z")
	public static boolean method5706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)Z")
	public static boolean method5707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
