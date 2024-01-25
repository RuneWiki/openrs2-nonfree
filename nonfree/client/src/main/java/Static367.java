import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!nea", name = "r", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_67 = new Class46(62, -1);

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)I")
	public static int method5443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = arg1 & 0x1 | local12 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}
}
