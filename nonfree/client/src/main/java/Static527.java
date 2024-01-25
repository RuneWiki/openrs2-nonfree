import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "Lclient!be;")
	public static final Class22 aClass22_6 = new Class22();

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "[Lclient!bs;")
	public static Class35[] aClass35Array1 = new Class35[50];

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "[Lclient!vba;")
	public static final Class131_Sub1[] aClass131_Sub1Array2 = new Class131_Sub1[32];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZII)I")
	public static int method7324(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}
}
