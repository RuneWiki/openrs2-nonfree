import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!rd;")
	private static Class63 aClass63_894 = Static80.method1463("red:");

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_889 = aClass63_894;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Lclient!rd;")
	public static Class63 aClass63_890 = Static80.method1463("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!rd;")
	private static Class63 aClass63_896 = Static80.method1463("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "Lclient!rd;")
	public static Class63 aClass63_891 = aClass63_896;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!rd;")
	public static Class63 aClass63_892 = aClass63_894;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Lclient!rd;")
	public static Class63 aClass63_893 = Static80.method1463("backvmid2");

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	public static int anInt1710 = 0;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_895 = Static80.method1463("Angreifen");

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "Lclient!rd;")
	private static Class63 aClass63_899 = Static80.method1463("Close");

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_897 = aClass63_899;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Lclient!rd;")
	public static Class63 aClass63_898 = Static80.method1463("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	public static int anInt1713 = 127;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	public static int anInt1714 = -1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILclient!gd;I)V")
	public static void method1126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub3_Sub7 arg2, @OriginalArg(4) int arg3) {
		if (Static25.anInt845 >= 50 || anInt1713 == 0 || (arg2.anIntArray151 == null || arg2.anIntArray151.length <= arg0)) {
			return;
		}
		@Pc(32) int local32 = arg2.anIntArray151[arg0];
		if (local32 == 0) {
			return;
		}
		@Pc(39) int local39 = local32 >> 8;
		Static11.anIntArray222[Static25.anInt845] = local39;
		@Pc(49) int local49 = local32 >> 844616196 & 0x7;
		Static96.anIntArray292[Static25.anInt845] = local49;
		@Pc(57) int local57 = local32 & 0xF;
		Static68.anIntArray223[Static25.anInt845] = 0;
		Static15.aClass62Array1[Static25.anInt845] = null;
		@Pc(71) int local71 = (arg1 - 64) / 128;
		@Pc(77) int local77 = (arg3 - 64) / 128;
		Static85.anIntArray306[Static25.anInt845] = local57 + (local71 << 16) + (local77 << 8);
		Static25.anInt845++;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method1127() {
		while (true) {
			@Pc(9) Class1 local9 = Static109.aClass1_10;
			@Pc(16) Class6_Sub5 local16;
			synchronized (Static109.aClass1_10) {
				local16 = (Class6_Sub5) Static109.aClass1_9.method9();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass7_Sub1_6.method126(false, local16.aClass53_3, local16.aByteArray9, (int) local16.aLong91);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method1128() {
		aClass63_898 = null;
		aClass63_891 = null;
		aClass63_896 = null;
		aCRC32_1 = null;
		aClass63_893 = null;
		aClass63_889 = null;
		aClass63_894 = null;
		aClass63_897 = null;
		aClass63_892 = null;
		aClass63_890 = null;
		aClass63_895 = null;
		aClass63_899 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void method1130() {
		if (!Static47.aBoolean72) {
			return;
		}
		Static123.aClass29_24 = null;
		Static74.aClass29_11 = null;
		Static119.aClass29_22 = null;
		Static86.aClass29_16 = null;
		Static106.aClass6_Sub3_Sub3_Sub2_5 = null;
		Static99.aClass29_21 = null;
		Static120.aClass29_23 = null;
		Static86.anIntArray278 = null;
		Static90.aClass29_19 = null;
		Static100.aClass6_Sub3_Sub3_Sub3Array6 = null;
		Static86.anIntArray277 = null;
		Static2.anIntArray2 = null;
		Static37.anIntArray140 = null;
		Static54.aClass6_Sub3_Sub3_Sub2_1 = null;
		Static46.anIntArray164 = null;
		Static103.anIntArray360 = null;
		Static85.anIntArray305 = null;
		Static61.aClass6_Sub3_Sub3_Sub3_12 = null;
		Static124.aClass29_26 = null;
		Static47.aClass29_8 = null;
		Static81.aClass6_Sub3_Sub3_Sub3_20 = null;
		Static79.anIntArray242 = null;
		Static36.method869();
		Static52.method1070(true);
		Static47.aBoolean72 = false;
	}
}
