import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!re", name = "db", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!re", name = "U", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "I")
	public static int anInt8018 = 0;

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "Z")
	public static boolean aBoolean592 = false;

	@OriginalMember(owner = "client!re", name = "eb", descriptor = "S")
	public static short aShort84 = 1;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "(I)V")
	public static void method6698() {
		if (Static325.anInt6149 == 7) {
			Static366.method5845(false);
		} else {
			Static561.aClass64_3 = Static52.aClass64_1;
			Static52.aClass64_1 = null;
			Static145.method2683(13);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!oa;Lclient!jo;)V")
	public static void method6699(@OriginalArg(1) Class9 arg0, @OriginalArg(2) Class168 arg1) {
		@Pc(10) Class1[] local10 = Static583.method50(arg1, Static473.anInt8688);
		Static287.aClass66Array8 = new Class66[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static287.aClass66Array8[local16] = arg0.method5412(local10[local16]);
		}
		local10 = Static583.method50(arg1, Static440.anInt8039);
		Static283.aClass66Array7 = new Class66[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static283.aClass66Array7[local47] = arg0.method5412(local10[local47]);
		}
		local10 = Static583.method50(arg1, Static393.anInt7340);
		Static114.aClass66Array3 = new Class66[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static114.aClass66Array3[local74] = arg0.method5412(local10[local74]);
		}
		local10 = Static583.method50(arg1, Static418.anInt1963);
		Static226.aClass66Array5 = new Class66[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static226.aClass66Array5[local105] = arg0.method5412(local10[local105]);
		}
		local10 = Static583.method50(arg1, Static298.anInt5670);
		Static212.aClass66Array4 = new Class66[local10.length];
		for (@Pc(136) int local136 = 0; local136 < local10.length; local136++) {
			Static212.aClass66Array4[local136] = arg0.method5412(local10[local136]);
		}
		local10 = Static583.method50(arg1, Static168.anInt3846);
		Static447.aClass66Array10 = new Class66[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static447.aClass66Array10[local163] = arg0.method5412(local10[local163]);
		}
		local10 = Static583.method50(arg1, Static210.anInt4419);
		Static99.aClass66Array2 = new Class66[local10.length];
		for (@Pc(194) int local194 = 0; local194 < local10.length; local194++) {
			Static99.aClass66Array2[local194] = arg0.method5412(local10[local194]);
		}
		local10 = Static583.method50(arg1, Static470.anInt8658);
		Static59.aClass66Array1 = new Class66[local10.length];
		for (@Pc(225) int local225 = 0; local225 < local10.length; local225++) {
			Static59.aClass66Array1[local225] = arg0.method5412(local10[local225]);
		}
		local10 = Static583.method50(arg1, Static170.anInt3899);
		Static460.aClass66Array12 = new Class66[local10.length];
		for (@Pc(256) int local256 = 0; local256 < local10.length; local256++) {
			Static460.aClass66Array12[local256] = arg0.method5412(local10[local256]);
		}
		local10 = Static583.method50(arg1, Static300.anInt5682);
		Static548.aClass66Array14 = new Class66[local10.length];
		for (@Pc(287) int local287 = 0; local287 < local10.length; local287++) {
			Static548.aClass66Array14[local287] = arg0.method5412(local10[local287]);
		}
		local10 = Static583.method50(arg1, Static214.anInt4557);
		Static536.aClass66Array13 = new Class66[local10.length];
		for (@Pc(314) int local314 = 0; local314 < local10.length; local314++) {
			Static536.aClass66Array13[local314] = arg0.method5412(local10[local314]);
		}
		local10 = Static583.method50(arg1, Static479.anInt8749);
		Static569.aClass66Array15 = new Class66[local10.length];
		for (@Pc(341) int local341 = 0; local341 < local10.length; local341++) {
			Static569.aClass66Array15[local341] = arg0.method5412(local10[local341]);
		}
		Static484.aClass66_31 = arg0.method5412(Static583.method55(arg1, Static398.anInt7528, 0));
		Static270.aClass66_24 = arg0.method5412(Static583.method55(arg1, Static523.anInt9086, 0));
		local10 = Static583.method50(arg1, Static380.anInt7114);
		Static233.aClass66Array6 = new Class66[local10.length];
		for (@Pc(392) int local392 = 0; local392 < local10.length; local392++) {
			Static233.aClass66Array6[local392] = arg0.method5412(local10[local392]);
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(B)Z")
	public static boolean method6700() {
		if (Static214.aBoolean361) {
			try {
				Static590.method5698("showVideoAd", Static87.anApplet1);
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
	public static byte[] method6701(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static350.method5057(local18) : local18;
		} else if (arg1 instanceof Class44) {
			@Pc(32) Class44 local32 = (Class44) arg1;
			return local32.method6730();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI)Z")
	public static boolean method6703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static272.method4573(arg0, arg1) | (arg0 & 0x800) != 0 || Static331.method8155(arg1, arg0);
	}
}
