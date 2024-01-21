import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!ea;")
	public static Class18 aClass18_440 = Static8.method128("<col=ffffff>");

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public static int anInt1791 = 0;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_441 = Static8.method128("(U0a )2 via: ");

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!ea;")
	private static Class18 aClass18_442 = Static8.method128("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_443 = aClass18_442;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Lclient!pg;")
	public static Class59 aClass59_27 = new Class59();

	@OriginalMember(owner = "client!h", name = "j", descriptor = "Lclient!ea;")
	public static Class18 aClass18_444 = Static8.method128("(Y");

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Lclient!ea;")
	public static Class18 aClass18_445 = Static8.method128("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!h", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[250][];

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Lclient!ea;")
	public static Class18 aClass18_446 = Static8.method128("<col=ffff00>*V");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!hc;I)V")
	public static void method1172(@OriginalArg(0) Class1_Sub6 arg0) {
		@Pc(16) byte[] local16 = new byte[24];
		if (Static146.aClass44_4 != null) {
			@Pc(28) int local28;
			try {
				Static146.aClass44_4.method2082(0L);
				Static146.aClass44_4.method2086(local16);
				for (local28 = 0; local28 < 24 && local16[local28] == 0; local28++) {
				}
				if (local28 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(53) Exception local53) {
				for (local28 = 0; local28 < 24; local28++) {
					local16[local28] = -1;
				}
			}
		}
		arg0.method520(24, local16);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method1173() {
		aClass18_441 = null;
		aClass18_442 = null;
		aClass18_440 = null;
		aClass18_445 = null;
		aClass18_444 = null;
		aByteArrayArray10 = null;
		aClass59_27 = null;
		aClass18_446 = null;
		aClass18_443 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)Lclient!g;")
	public static Class1_Sub1_Sub9 method1174(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub9 local10 = (Class1_Sub1_Sub9) Static135.aClass66_17.method2599((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static113.aClass16_32.method2254(arg0, 4);
		local10 = new Class1_Sub1_Sub9();
		if (local20 != null) {
			local10.method1078(new Class1_Sub6(local20), arg0);
		}
		local10.method1074();
		Static135.aClass66_17.method2597((long) arg0, local10);
		return local10;
	}
}
