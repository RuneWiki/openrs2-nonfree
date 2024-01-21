import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!sa", name = "eb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!sa", name = "ab", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1006 = Static8.method128("Hidden)2");

	@OriginalMember(owner = "client!sa", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1007 = Static8.method128("jlv");

	@OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
	public static int anInt3955 = 0;

	@OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
	public static int anInt3960 = 0;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBI)I")
	public static int method2709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			arg1--;
			local7 = arg0 & 0x1 | local7 << 1;
			arg0 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
	public static void method2710() {
		@Pc(13) Object local13 = Static71.anObject3;
		synchronized (Static71.anObject3) {
			if (Static121.anInt3415 != 0) {
				Static121.anInt3415 = 1;
				try {
					Static71.anObject3.wait();
				} catch (@Pc(23) InterruptedException local23) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	public static void method2711() {
		aClass18_1007 = null;
		aByteArrayArrayArray6 = null;
		aClass18_1006 = null;
	}
}
