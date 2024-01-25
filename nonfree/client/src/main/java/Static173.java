import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!h", name = "u", descriptor = "I")
	public static int anInt3935;

	@OriginalMember(owner = "client!h", name = "x", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "Lclient!dk;")
	public static final Class72 aClass72_4 = new Class72(1);

	@OriginalMember(owner = "client!h", name = "q", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!h", name = "w", descriptor = "Z")
	public static boolean aBoolean323 = true;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILclient!an;)Lclient!pu;")
	public static Class244 method3438(@OriginalArg(1) int arg0, @OriginalArg(3) Class16 arg1) {
		@Pc(9) byte[] local9 = arg1.method408(arg0, 0);
		return local9 == null ? null : new Class244(local9);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Z")
	public static boolean method3445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static249.method4291(arg1, arg0) & (Static353.method5526(arg1, arg0) | (arg1 & 0x2000) != 0 | Static103.method2114(arg0, arg1));
	}
}
