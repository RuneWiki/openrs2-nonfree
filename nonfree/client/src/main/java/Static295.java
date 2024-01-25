import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZI)Z")
	public static boolean method4573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)Lclient!vh;")
	public static Class28_Sub10 method4574() {
		@Pc(8) Class28_Sub10 local8 = (Class28_Sub10) Static516.aClass371_5.method8913();
		if (local8 == null) {
			return new Class28_Sub10();
		} else {
			Static39.anInt908--;
			return local8;
		}
	}
}
