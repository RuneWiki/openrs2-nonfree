import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Lclient!qb;")
	public static Class54 aClass54_8;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_21;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_22;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!v;")
	private static Class62 aClass62_1259 = Static45.method753("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Lclient!v;")
	public static Class62 aClass62_1258 = aClass62_1259;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public static int anInt2771 = 0;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "[Lclient!rd;")
	public static Class42_Sub1[] aClass42_Sub1Array1 = new Class42_Sub1[256];

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!v;")
	public static Class62 aClass62_1260 = Static45.method753("oberen Rand der Webseite ausw\u001c1hlen)3");

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!v;")
	public static Class62 aClass62_1261 = Static45.method753(")3");

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "Lclient!v;")
	public static Class62 aClass62_1262 = Static45.method753("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "[I")
	public static int[] anIntArray309 = new int[1000];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1825(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class3_Sub8 local4 = new Class3_Sub8(arg0);
		@Pc(10) int local10 = local4.method1803();
		@Pc(18) int local18 = local4.method1770();
		if (local18 < 0 || Static15.anInt581 != 0 && local18 > Static15.anInt581) {
			throw new RuntimeException();
		} else if (local10 == 0) {
			@Pc(35) byte[] local35 = new byte[local18];
			local4.method1767(local35, local18);
			return local35;
		} else {
			@Pc(47) int local47 = local4.method1770();
			if (local47 < 0 || Static15.anInt581 != 0 && local47 > Static15.anInt581) {
				throw new RuntimeException();
			}
			@Pc(65) byte[] local65 = new byte[local47];
			if (local10 == 1) {
				Static101.method1669(local65, local47, arg0, local18);
			} else {
				try {
					@Pc(90) DataInputStream local90 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local18)));
					local90.readFully(local65);
					local90.close();
				} catch (@Pc(97) IOException local97) {
				}
			}
			return local65;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method1826() {
		anIntArray309 = null;
		aClass54_8 = null;
		aClass3_Sub1_Sub1_Sub1_21 = null;
		aClass62_1260 = null;
		aClass62_1262 = null;
		aClass62_1258 = null;
		aClass62_1261 = null;
		aClass42_Sub1Array1 = null;
		aClass3_Sub1_Sub1_Sub1_22 = null;
		aClass62_1259 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)Lclient!tb;")
	public static Class3_Sub1_Sub15 method1827(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub1_Sub15 local6 = (Class3_Sub1_Sub15) Static83.aClass34_7.method764((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static52.aClass42_29.method1504(13, arg0);
		local6 = new Class3_Sub1_Sub15();
		local6.anInt2529 = arg0;
		if (local27 != null) {
			local6.method1618(new Class3_Sub8(local27));
		}
		Static83.aClass34_7.method765((long) arg0, local6);
		return local6;
	}
}
