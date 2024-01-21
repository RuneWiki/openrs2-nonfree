import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
	public static int anInt412;

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_194 = Static51.method932(":");

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
	public static volatile int anInt409 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLclient!kh;ZLclient!kh;)V")
	public static void method242(@OriginalArg(1) Class29 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class29 arg2) {
		Static81.aClass29_35 = arg0;
		Static168.aClass29_69 = arg2;
		Static80.aBoolean81 = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Lclient!qh;")
	public static Class2_Sub1_Sub14 method243(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub14 local10 = (Class2_Sub1_Sub14) Static128.aClass72_21.method2259((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static169.aClass29_70.method1030(arg0, 14);
		local10 = new Class2_Sub1_Sub14();
		if (local20 != null) {
			local10.method2119(new Class2_Sub11(local20));
		}
		Static128.aClass72_21.method2254(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
	public static void method244() {
		aClass10_194 = null;
		aByteArrayArray3 = null;
		anIntArray27 = null;
	}
}
