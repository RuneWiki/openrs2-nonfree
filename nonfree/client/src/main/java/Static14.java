import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public static int anInt261;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[Lclient!ne;")
	public static Class78[] aClass78Array1;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "[Lclient!vf;")
	public static Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array1;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!hh;")
	public static Class50 aClass50_109 = Static186.method3527(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!hh;")
	public static Class50 aClass50_110 = Static186.method3527("cookiehost");

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Lclient!hh;")
	public static Class50 aClass50_111 = Static186.method3527("Spieler");

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!hh;")
	public static Class50 aClass50_112 = Static186.method3527("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
	public static void method195(@OriginalArg(1) boolean arg0) {
		Static230.method2572(Static10.anInt204, arg0, Static48.anInt1023, Static185.anInt3844);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIB)V")
	public static void method196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub1_Sub13 local12 = Static74.method1093(1, arg1);
		local12.method2260();
		local12.anInt2779 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IZ)V")
	public static void method197(@OriginalArg(1) boolean arg0) {
		Static1.aBoolean1 = arg0;
		Static184.aBoolean175 = !Static79.method2552();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method198() {
		Static18.aClass84_10.method2576();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)J")
	public static long method199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass29_1 == null ? 0L : local7.aClass29_1.aLong44;
	}
}
