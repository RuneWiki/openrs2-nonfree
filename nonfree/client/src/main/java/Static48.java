import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
	public static int anInt942;

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_15 = new Class306("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([BILjava/lang/String;I)I")
	public static int method942(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = arg1;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(20) char local20 = arg2.charAt(local15);
			if (local20 <= '\u007f') {
				arg0[local13++] = (byte) local20;
			} else if (local20 > '\u07ff') {
				arg0[local13++] = (byte) (local20 >> 12 | 0xE0);
				arg0[local13++] = (byte) (local20 >> 6 & 0x3F | 0x80);
				arg0[local13++] = (byte) (local20 & 0x3F | 0x80);
			} else {
				arg0[local13++] = (byte) (local20 >> 6 | 0xC0);
				arg0[local13++] = (byte) (local20 & 0x3F | 0x80);
			}
		}
		return local13 - arg1;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method944(@OriginalArg(1) String arg0) {
		if (!Static431.aBoolean542) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(16) int local16 = Static190.anInt3385;
		@Pc(18) int[] local18 = Static502.anIntArray771;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class49_Sub2_Sub2_Sub1 local28 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local18[local20]];
			if (local28 != null && local28 != Static63.aClass49_Sub2_Sub2_Sub1_1 && local28.aString16 != null && local28.aString16.equalsIgnoreCase(arg0)) {
				Static144.method2331(Static141.aClass296_129);
				Static455.aClass1_Sub6_Sub2_2.method3921(Static379.anInt8819);
				Static455.aClass1_Sub6_Sub2_2.method3959(local18[local20]);
				Static455.aClass1_Sub6_Sub2_2.method3931(anInt942);
				Static455.aClass1_Sub6_Sub2_2.method3957(0);
				Static455.aClass1_Sub6_Sub2_2.method3921(Static196.anInt3862);
				Static430.method5446(local28.anIntArray428[0], 0, 0, local28.method3788(), local28.anIntArray427[0], local28.method3788(), -2, true);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static324.method5022(Static245.aClass306_58.method7165(Static179.anInt3168) + arg0);
		}
		if (Static431.aBoolean542) {
			Static387.method5882();
		}
	}
}
