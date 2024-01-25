import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "Lclient!gca;")
	public static Class3_Sub20 aClass3_Sub20_3;

	@OriginalMember(owner = "client!oj", name = "F", descriptor = "[Lclient!ija;")
	public static final Class3_Sub6_Sub11[] aClass3_Sub6_Sub11Array4 = new Class3_Sub6_Sub11[14];

	@OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
	public static int anInt7591 = 0;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "(I)V")
	public static void method6354() {
		@Pc(17) Class3_Sub44 local17 = Static275.method5689(Static114.aClass376_32, Static540.aClass282_4);
		local17.aClass3_Sub17_Sub2_3.method4849(Static545.method7549());
		local17.aClass3_Sub17_Sub2_3.method4876(Static654.anInt10064);
		local17.aClass3_Sub17_Sub2_3.method4876(Static483.anInt8181);
		local17.aClass3_Sub17_Sub2_3.method4849(Static227.aClass3_Sub15_11.aClass17_Sub17_2.method5808());
		Static616.method8089(local17);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Z")
	public static boolean method6355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "(I)V")
	public static void method6356() {
		Static490.anInt8296 = 1;
		Static558.anInt8991 = -1;
		if (Static573.aString114 == null) {
			Static582.method7836(35);
		} else {
			@Pc(20) Class3_Sub17 local20 = new Class3_Sub17(Static188.method3036(Static454.method6516(Static573.aString114)));
			@Pc(24) long local24 = local20.method4865();
			Static222.aLong106 = local20.method4865();
			Static164.method2758("", true, Static455.method6553(local24));
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)Lclient!wg;")
	public static Class387 method6357(@OriginalArg(0) int arg0) {
		@Pc(8) Class387[] local8 = Static542.method7496();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].anInt10234 == arg0) {
				return local8[local10];
			}
		}
		return null;
	}
}
