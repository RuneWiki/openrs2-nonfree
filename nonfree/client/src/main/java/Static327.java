import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString235 = "Connected to update server";

	@OriginalMember(owner = "client!v", name = "B", descriptor = "Lclient!bn;")
	public static final Class25 aClass25_35 = new Class25(8);

	@OriginalMember(owner = "client!v", name = "F", descriptor = "[B")
	public static final byte[] aByteArray196 = new byte[520];

	@OriginalMember(owner = "client!v", name = "K", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!v", name = "N", descriptor = "I")
	public static int anInt6303 = 0;

	@OriginalMember(owner = "client!v", name = "O", descriptor = "I")
	public static int anInt6304 = 0;

	@OriginalMember(owner = "client!v", name = "R", descriptor = "I")
	public static int anInt6307 = 0;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
	public static void method5623() {
		@Pc(1) Class11 local1 = Static238.aClass11_102;
		synchronized (Static238.aClass11_102) {
			Static238.aClass11_102.method213();
		}
		local1 = Static20.aClass11_13;
		synchronized (Static20.aClass11_13) {
			Static20.aClass11_13.method213();
		}
		local1 = Static38.aClass11_20;
		synchronized (Static38.aClass11_20) {
			Static38.aClass11_20.method213();
		}
		local1 = Static292.aClass11_128;
		synchronized (Static292.aClass11_128) {
			Static292.aClass11_128.method213();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)Lclient!fr;")
	public static Class69 method5626(@OriginalArg(0) int arg0) {
		@Pc(15) Class69 local15 = (Class69) Static245.aClass11_82.method209((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static221.aClass143_82.method3745(4, arg0);
		local15 = new Class69();
		if (local25 != null) {
			local15.method2165(arg0, new Class14_Sub4(local25));
		}
		local15.method2167(arg0);
		Static245.aClass11_82.method219((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	public static void method5627() {
		Static253.aClass77_2 = new Class77(8);
		Static187.anInt3853 = 0;
		for (@Pc(17) Class1_Sub7 local17 = (Class1_Sub7) Static292.aClass126_7.method3389(); local17 != null; local17 = (Class1_Sub7) Static292.aClass126_7.method3394()) {
			local17.method4326();
		}
	}
}
