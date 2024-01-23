import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!k", name = "c", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method2236() {
		if (Static16.aBoolean25) {
			return;
		}
		Static192.aBoolean301 = true;
		if (Static19.aBoolean30) {
			Static125.aFloat20 = (int) Static125.aFloat20 - 17 & 0xFFFFFFF0;
		} else {
			Static3.aFloat1 += (-12.0F - Static3.aFloat1) / 2.0F;
		}
		Static16.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!dn;III)V")
	public static void method2237(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub26 local12;
		if (arg2 < Static158.anInt3404) {
			local12 = Static74.aClass1_Sub26ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass44_1 != null && local12.aClass44_1.aClass14_6.method4093()) {
				arg0.method4090(local12.aClass44_1.aClass14_6, 128, 0, 0, true);
			}
		}
		if (arg3 < Static158.anInt3404) {
			local12 = Static74.aClass1_Sub26ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass44_1 != null && local12.aClass44_1.aClass14_6.method4093()) {
				arg0.method4090(local12.aClass44_1.aClass14_6, 0, 0, 128, true);
			}
		}
		if (arg2 < Static158.anInt3404 && arg3 < Static209.anInt4179) {
			local12 = Static74.aClass1_Sub26ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass44_1 != null && local12.aClass44_1.aClass14_6.method4093()) {
				arg0.method4090(local12.aClass44_1.aClass14_6, 128, 0, 128, true);
			}
		}
		if (arg2 < Static158.anInt3404 && arg3 > 0) {
			local12 = Static74.aClass1_Sub26ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass44_1 != null && local12.aClass44_1.aClass14_6.method4093()) {
				arg0.method4090(local12.aClass44_1.aClass14_6, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)[B")
	public static synchronized byte[] method2238(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static9.anInt242 > 0) {
			local18 = Static232.aByteArrayArray12[--Static9.anInt242];
			Static232.aByteArrayArray12[Static9.anInt242] = null;
			return local18;
		} else if (arg0 == 5000 && Static276.anInt2922 > 0) {
			local18 = Static48.aByteArrayArray6[--Static276.anInt2922];
			Static48.aByteArrayArray6[Static276.anInt2922] = null;
			return local18;
		} else if (arg0 == 30000 && Static174.anInt3702 > 0) {
			local18 = Static3.aByteArrayArray1[--Static174.anInt3702];
			Static3.aByteArrayArray1[Static174.anInt3702] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2239(@OriginalArg(1) int arg0) {
		return Static266.aStringArray50[arg0].length() <= 0 ? Static92.aStringArray26[arg0] : Static92.aStringArray26[arg0] + Static9.aString17 + Static266.aStringArray50[arg0];
	}
}
