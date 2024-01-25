import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "Lclient!kr;")
	public static Class138 aClass138_1;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "Z")
	public static boolean aBoolean797 = false;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_178 = new Class12(15, 3);

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_249 = new Class103(40, 7);

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "Z")
	public static boolean aBoolean798 = false;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method5709(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static330.anInt5623 > 0) {
			local21 = Static401.aByteArrayArray28[--Static330.anInt5623];
			Static401.aByteArrayArray28[Static330.anInt5623] = null;
			return local21;
		} else if (arg0 == 5000 && Static100.anInt1835 > 0) {
			local21 = Static263.aByteArrayArray17[--Static100.anInt1835];
			Static263.aByteArrayArray17[Static100.anInt1835] = null;
			return local21;
		} else if (arg0 == 30000 && Static18.anInt378 > 0) {
			local21 = Static148.aByteArrayArray8[--Static18.anInt378];
			Static148.aByteArrayArray8[Static18.anInt378] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public static void method5710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class4_Sub5 local7 = new Class4_Sub5();
		local7.anInt5961 = arg0;
		local7.anInt5966 = arg1;
		local7.anInt5963 = arg3;
		local7.anInt5960 = arg4;
		local7.anInt5967 = arg5;
		local7.aString68 = arg2;
		local7.anInt5970 = Static236.anInt4213 + arg6;
		Static172.aClass262_5.method5815(local7);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public static void method5712() {
		if (Static185.aClass34_7.method5774()) {
			Static185.aClass34_7.method5785(Static392.aCanvas5);
			Static14.method228();
			Static185.aClass34_7.method5738(Static392.aCanvas5);
			Static185.aClass34_7.method5793(Static392.aCanvas5);
		} else {
			Static379.method4990(Static14.anInt293);
		}
		Static65.method1072();
	}
}
