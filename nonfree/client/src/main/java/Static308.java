import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!kia", name = "h", descriptor = "I")
	public static int anInt5227;

	@OriginalMember(owner = "client!kia", name = "i", descriptor = "I")
	public static int anInt5228;

	@OriginalMember(owner = "client!kia", name = "j", descriptor = "D")
	public static double aDouble96;

	@OriginalMember(owner = "client!kia", name = "m", descriptor = "Lclient!ho;")
	public static Class9 aClass9_25;

	@OriginalMember(owner = "client!kia", name = "e", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_76 = new Class289(68, 4);

	@OriginalMember(owner = "client!kia", name = "g", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIILclient!ae;)Lclient!ao;")
	public static Class22 method4413(@OriginalArg(0) int arg0, @OriginalArg(3) Class8 arg1) {
		@Pc(9) byte[] local9 = arg1.method262(0, arg0);
		return local9 == null ? null : new Class22(local9);
	}
}
