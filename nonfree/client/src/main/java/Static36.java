import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!br", name = "d", descriptor = "Lclient!g;")
	public static Class83 aClass83_55;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "Lclient!g;")
	public static Class83 aClass83_56;

	@OriginalMember(owner = "client!br", name = "i", descriptor = "Lclient!g;")
	public static Class83 aClass83_57;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_98 = new Class62("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

	@OriginalMember(owner = "client!br", name = "e", descriptor = "I")
	public static int anInt2910 = 0;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_80 = new Class208(71, -2);

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZIII)Lclient!lp;")
	public static Class2_Sub26 method2331(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub26 local7 = new Class2_Sub26();
		local7.anInt4145 = arg0;
		local7.anInt4142 = arg3;
		Static273.aClass243_20.method5968((long) arg2, local7);
		Static314.method5082(arg0);
		@Pc(37) Class3 local37 = Static380.method5987(arg2);
		if (local37 != null) {
			Static128.method2229(local37);
		}
		if (Static392.aClass3_19 != null) {
			Static128.method2229(Static392.aClass3_19);
			Static392.aClass3_19 = null;
		}
		Static157.method2778();
		if (local37 != null) {
			Static378.method4266(local37, !arg1);
		}
		if (!arg1) {
			Static351.method5591(arg0);
		}
		if (!arg1 && Static388.anInt7080 != -1) {
			Static206.method3765(1, Static388.anInt7080);
		}
		return local7;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method2333(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static69.method1260("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!lc;I)Lclient!ih;")
	public static Class2_Sub7_Sub8 method2334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class136 arg2) {
		@Pc(10) int local10 = arg2.anInt4023 | arg0 << 8;
		@Pc(24) Class2_Sub7_Sub8 local24 = (Class2_Sub7_Sub8) Static40.aClass105_1.method2632((long) local10 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static51.aClass83_30.method1979(Static51.aClass83_30.method1947(local10));
		if (local36 == null) {
			local10 = arg1 + 65536 << 8 | arg2.anInt4023;
			local24 = (Class2_Sub7_Sub8) Static40.aClass105_1.method2632((long) local10 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static51.aClass83_30.method1979(Static51.aClass83_30.method1947(local10));
			if (local36 == null) {
				local10 = arg2.anInt4023 | 0xFFFF00;
				local24 = (Class2_Sub7_Sub8) Static40.aClass105_1.method2632((long) local10 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static51.aClass83_30.method1979(Static51.aClass83_30.method1947(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static99.method1733(local36);
					local24.aClass136_4 = arg2;
					Static40.aClass105_1.method2630(local24, (long) local10 << 16);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local24 = Static99.method1733(local36);
				local24.aClass136_4 = arg2;
				Static40.aClass105_1.method2630(local24, (long) local10 << 16);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static99.method1733(local36);
			local24.aClass136_4 = arg2;
			Static40.aClass105_1.method2630(local24, (long) local10 << 16);
			return local24;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIII)I")
	public static int method2335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static128.aClass149Array1 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg2 >> 7;
		@Pc(20) int local20 = arg0 >> 7;
		if (local16 < 0 || local20 < 0 || local16 > Static89.anInt1891 - 1 || Static85.anInt1839 - 1 < local20) {
			return 0;
		}
		@Pc(45) int local45 = arg1;
		if (arg1 < 3 && (Static329.aByteArrayArrayArray17[1][local16][local20] & 0x2) != 0) {
			local45 = arg1 + 1;
		}
		return Static128.aClass149Array1[local45].method5839(arg2, arg0);
	}
}
