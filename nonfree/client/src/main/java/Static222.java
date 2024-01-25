import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!mn", name = "L", descriptor = "Lclient!us;")
	public static Class234 aClass234_79;

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
	public static int anInt3950;

	@OriginalMember(owner = "client!mn", name = "J", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_64 = new Class57("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)I")
	public static int method3705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(II)Lclient!fc;")
	public static Class3_Sub7_Sub5 method3706(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub7_Sub5 local10 = (Class3_Sub7_Sub5) Static389.aClass21_5.method261((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = Static299.aClass20_74.method253(arg0 & 0x7FFF, 1);
		} else {
			local29 = Static373.aClass20_97.method253(arg0, 1);
		}
		local10 = new Class3_Sub7_Sub5();
		if (local29 != null) {
			local10.method1637(new Class3_Sub5(local29));
		}
		if (arg0 >= 32768) {
			local10.method1636();
		}
		Static389.aClass21_5.method259((long) arg0, local10);
		return local10;
	}
}
