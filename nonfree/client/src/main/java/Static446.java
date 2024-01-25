import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "Lclient!nf;")
	public static Class238 aClass238_7;

	@OriginalMember(owner = "client!pea", name = "m", descriptor = "Lclient!ul;")
	public static final Class357 aClass357_27 = new Class357("", 11);

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)I")
	public static int method8187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}
}
