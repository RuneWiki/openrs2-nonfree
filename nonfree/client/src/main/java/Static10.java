import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_10 = new Class107(3, 6);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public static void method332() {
		Static311.aClass258_1 = new Class258(8);
		Static434.anInt7029 = 0;
		for (@Pc(22) Class4_Sub7 local22 = (Class4_Sub7) Static356.aClass141_8.method3357(); local22 != null; local22 = (Class4_Sub7) Static356.aClass141_8.method3360()) {
			local22.method3785();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ul;Lclient!ul;I)V")
	public static void method333(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1) {
		Static333.aClass246_177 = arg1;
		Static280.aClass246_157 = arg0;
	}
}
