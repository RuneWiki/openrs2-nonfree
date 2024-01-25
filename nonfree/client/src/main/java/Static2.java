import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public static int anInt3076;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!br;")
	public static Class28 aClass28_4;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_121 = new Class214(62, 4);

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
	public static final int[] anIntArray168 = new int[5];

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_122 = new Class214(37, 6);

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_131 = new Class137(38, 11);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2552(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static264.aStringArray31.length; local12++) {
			if (Static264.aStringArray31[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Lclient!rp;")
	public static Class216 method2553(@OriginalArg(1) int arg0) {
		@Pc(10) Class216 local10 = (Class216) Static422.aClass167_96.method3386((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static110.aClass113_38.method2274(1, arg0);
		local10 = new Class216();
		local10.anInt5857 = arg0;
		if (local20 != null) {
			local10.method4551(new Class1_Sub11(local20));
		}
		local10.method4547();
		if (local10.anInt5843 == 2 && Static136.aClass257_10.method5503((long) arg0) == null) {
			Static136.aClass257_10.method5504(new Class1_Sub6(Static117.anInt2020), (long) arg0);
			Static197.aClass216Array1[Static117.anInt2020++] = local10;
		}
		Static422.aClass167_96.method3392(local10, (long) arg0);
		return local10;
	}
}
