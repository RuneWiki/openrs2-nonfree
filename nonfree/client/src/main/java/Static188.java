import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "J")
	public static long aLong159 = 0L;

	@OriginalMember(owner = "client!nj", name = "C", descriptor = "Lclient!l;")
	public static Class98 aClass98_30 = new Class98(200);

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(IB)V")
	public static void method3141() {
		Static249.aClass98_40.method2565(5);
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
	public static void method3142() {
		Static263.aClass30_28.method667();
		Static156.aClass115_6.method2877();
		Static208.aClass115_8.method2877();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLclient!ua;)V")
	public static void method3143(@OriginalArg(1) Class176 arg0) {
		@Pc(7) Class70 local7 = null;
		try {
			@Pc(12) Class178 local12 = arg0.method4511("runescape");
			while (local12.anInt5649 == 0) {
				Static150.method2552(1L);
			}
			if (local12.anInt5649 == 1) {
				local7 = (Class70) local12.anObject6;
				@Pc(33) Class3_Sub26 local33 = Static129.method2205();
				local7.method1688(local33.aByteArray64, local33.anInt4615, 0);
			}
		} catch (@Pc(43) Exception local43) {
		}
		try {
			if (local7 != null) {
				local7.method1687();
			}
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IC)Z")
	public static boolean method3144(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
