import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_1 = new Class295(14, 1);

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_2 = new Class295(15, 4);

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_3 = new Class295(16, -2);

	@OriginalMember(owner = "client!af", name = "q", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_4 = new Class295(17, 0);

	@OriginalMember(owner = "client!af", name = "r", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_5 = new Class295(18, -2);

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_6 = new Class295(19, -2);

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_7 = new Class295(20, 6);

	@OriginalMember(owner = "client!af", name = "u", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_8 = new Class295(21, 9);

	@OriginalMember(owner = "client!af", name = "v", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_9 = new Class295(22, -2);

	@OriginalMember(owner = "client!af", name = "w", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_10 = new Class295(23, 4);

	@OriginalMember(owner = "client!af", name = "x", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_11 = new Class295(24, -1);

	@OriginalMember(owner = "client!af", name = "y", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_12 = new Class295(26, 0);

	@OriginalMember(owner = "client!af", name = "z", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_13 = new Class295(27, 0);

	@OriginalMember(owner = "client!af", name = "B", descriptor = "Lclient!ria;")
	public static final Class295 aClass295_14 = new Class295(28, -2);

	@OriginalMember(owner = "client!af", name = "D", descriptor = "[I")
	public static int[] anIntArray27 = new int[1];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!eq;)Lclient!hq;")
	public static Class2_Sub25 method192(@OriginalArg(0) int arg0, @OriginalArg(2) Class97 arg1) {
		@Pc(8) byte[] local8 = arg1.method2570(arg0);
		return local8 == null ? null : new Class2_Sub25(local8);
	}
}
