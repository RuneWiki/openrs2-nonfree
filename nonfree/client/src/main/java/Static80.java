import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!wf;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!rh;")
	public static Class77 aClass77_10;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Z")
	public static boolean aBoolean73 = true;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[B")
	public static byte[] aByteArray11 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
	public static void method1357() {
		if (Static121.anIntArray285 != null && Static61.anIntArray125 != null) {
			return;
		}
		Static121.anIntArray285 = new int[256];
		Static61.anIntArray125 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static121.anIntArray285[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static61.anIntArray125[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!ka;)Lclient!tg;")
	public static Class81 method1358(@OriginalArg(2) Class1_Sub8 arg0) {
		try {
			@Pc(7) Class81 local7 = new Class81();
			local7.anInt3691 = arg0.method330();
			if (local7.anInt3691 > 32767) {
				local7.anInt3691 = 32767;
			}
			local7.aByteArray41 = new byte[local7.anInt3691];
			arg0.anInt446 += Static105.aClass63_1.method2150(arg0.aByteArray3, 0, arg0.anInt446, local7.aByteArray41, local7.anInt3691);
			return local7;
		} catch (@Pc(49) Exception local49) {
			return Static143.aClass81_1122;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method1359() {
		aClass77_10 = null;
		aClass31_1 = null;
		aByteArray11 = null;
	}
}
