import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public static int anInt1050;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIBI)I")
	public static int method777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(6) int local6 = arg5;
			arg5 = arg0;
			arg0 = local6;
		}
		@Pc(14) int local14 = arg3 & 0x3;
		if (local14 == 0) {
			return arg2;
		} else if (local14 == 1) {
			return arg4;
		} else if (local14 == 2) {
			return 1 + 7 - arg5 - arg2;
		} else {
			return 8 - arg0 - arg4;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JIIILclient!qe;IB)V")
	public static void method778(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		Static65.method1058();
		@Pc(10) Class2_Sub23 local10 = new Class2_Sub23(128);
		local10.method2132(10);
		local10.method2117((int) (Math.random() * 99999.0D));
		local10.method2117(501);
		local10.method2103(arg0);
		local10.method2134((int) (Math.random() * 9.9999999E7D));
		local10.method2085(arg4);
		local10.method2134((int) (Math.random() * 9.9999999E7D));
		local10.method2117(Static102.anInt2232);
		local10.method2132(arg3);
		local10.method2132(arg2);
		local10.method2134((int) (Math.random() * 9.9999999E7D));
		local10.method2117(arg5);
		local10.method2117(arg1);
		local10.method2134((int) (Math.random() * 9.9999999E7D));
		local10.method2113(Static144.aBigInteger3, Static196.aBigInteger4);
		Static161.aClass2_Sub23_Sub1_5.anInt2703 = 0;
		Static161.aClass2_Sub23_Sub1_5.method2132(27);
		Static161.aClass2_Sub23_Sub1_5.method2132(local10.anInt2703);
		Static161.aClass2_Sub23_Sub1_5.method2089(local10.anInt2703, local10.aByteArray41);
		Static134.anInt3129 = 1;
		Static104.anInt2284 = 3;
	}
}
