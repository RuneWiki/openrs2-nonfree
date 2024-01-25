import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "I")
	public static int anInt5806;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "[I")
	public static final int[] anIntArray475 = new int[32];

	@OriginalMember(owner = "client!so", name = "d", descriptor = "I")
	public static int anInt5803 = 0;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_52 = new Class198(20);

	@OriginalMember(owner = "client!so", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[5];

	@OriginalMember(owner = "client!so", name = "s", descriptor = "I")
	public static int anInt5810 = 16777215;

	@OriginalMember(owner = "client!so", name = "x", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_53 = new Class198(64);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)Lclient!go;")
	public static Class3_Sub7_Sub6 method4952(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub7_Sub6 local10 = (Class3_Sub7_Sub6) Static37.aClass198_60.method5242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static82.aClass100_32.method2319(26, arg0);
		local10 = new Class3_Sub7_Sub6();
		if (local25 != null) {
			local10.method1832(new Class3_Sub4(local25));
		}
		Static37.aClass198_60.method5231((long) arg0, local10);
		return local10;
	}
}
