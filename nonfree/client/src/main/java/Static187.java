import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!kha;")
	public static Class181 aClass181_36;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "Lclient!qia;")
	public static final Class276 aClass276_28 = new Class276();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)I")
	public static int method3362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 >>> 24;
		@Pc(33) int local33 = (local15 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local15 & 0xFF0000) >>> 8;
		@Pc(38) int local38 = 255 - local15;
		return ((local38 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local38 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local33;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lclient!bt;")
	public static Class37 method3364(@OriginalArg(0) int arg0) {
		@Pc(12) Class37 local12 = (Class37) Static376.aClass112_43.method3640((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(24) byte[] local24 = Static395.aClass181_74.method5023(1, arg0);
		local12 = new Class37();
		local12.anInt1076 = arg0;
		if (local24 != null) {
			local12.method1153(new Class3_Sub15(local24));
		}
		local12.method1155();
		if (local12.anInt1080 == 2 && Static598.aClass307_52.method7424((long) arg0) == null) {
			Static598.aClass307_52.method7425((long) arg0, new Class3_Sub8(Static637.anInt10210));
			Static55.aClass37Array1[Static637.anInt10210++] = local12;
		}
		Static376.aClass112_43.method3636((long) arg0, local12);
		return local12;
	}
}
