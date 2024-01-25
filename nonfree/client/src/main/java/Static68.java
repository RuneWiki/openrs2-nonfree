import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!dc", name = "pb", descriptor = "I")
	public static int anInt4930;

	@OriginalMember(owner = "client!dc", name = "qb", descriptor = "[I")
	public static final int[] anIntArray420 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!dc", name = "Jb", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_73 = new Class134("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!dc", name = "tc", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_112 = new Class211(27, 2);

	@OriginalMember(owner = "client!dc", name = "vc", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_149 = new Class102(22, 4);

	@OriginalMember(owner = "client!dc", name = "wc", descriptor = "Z")
	public static volatile boolean aBoolean354 = true;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBI)Z")
	public static boolean method4000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!aa;")
	public static RuntimeException_Sub1 method4002(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString1 = local12.aString1 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Z")
	public static boolean method4004(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)Lclient!lv;")
	public static Class152 method4011(@OriginalArg(0) int arg0) {
		@Pc(15) Class152 local15 = (Class152) Static295.aClass132_43.method2701((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static217.aClass54_63.method1126(0, arg0);
		local15 = new Class152();
		if (local25 != null) {
			local15.method3072(new Class2_Sub13(local25));
		}
		local15.method3075();
		Static295.aClass132_43.method2711(local15, (long) arg0);
		return local15;
	}
}
