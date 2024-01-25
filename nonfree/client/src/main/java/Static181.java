import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
	public static int anInt3279;

	@OriginalMember(owner = "client!gga", name = "r", descriptor = "Lclient!hu;")
	public static Class44 aClass44_14;

	@OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
	public static int anInt3280 = 0;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IC)B")
	public static byte method2917(@OriginalArg(1) char arg0) {
		@Pc(30) byte local30;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local30 = (byte) arg0;
		} else if (arg0 == '€') {
			local30 = -128;
		} else if (arg0 == '‚') {
			local30 = -126;
		} else if (arg0 == 'ƒ') {
			local30 = -125;
		} else if (arg0 == '„') {
			local30 = -124;
		} else if (arg0 == '…') {
			local30 = -123;
		} else if (arg0 == '†') {
			local30 = -122;
		} else if (arg0 == '‡') {
			local30 = -121;
		} else if (arg0 == 'ˆ') {
			local30 = -120;
		} else if (arg0 == '‰') {
			local30 = -119;
		} else if (arg0 == 'Š') {
			local30 = -118;
		} else if (arg0 == '‹') {
			local30 = -117;
		} else if (arg0 == 'Œ') {
			local30 = -116;
		} else if (arg0 == 'Ž') {
			local30 = -114;
		} else if (arg0 == '‘') {
			local30 = -111;
		} else if (arg0 == '’') {
			local30 = -110;
		} else if (arg0 == '“') {
			local30 = -109;
		} else if (arg0 == '”') {
			local30 = -108;
		} else if (arg0 == '•') {
			local30 = -107;
		} else if (arg0 == '–') {
			local30 = -106;
		} else if (arg0 == '—') {
			local30 = -105;
		} else if (arg0 == '˜') {
			local30 = -104;
		} else if (arg0 == '™') {
			local30 = -103;
		} else if (arg0 == 'š') {
			local30 = -102;
		} else if (arg0 == '›') {
			local30 = -101;
		} else if (arg0 == 'œ') {
			local30 = -100;
		} else if (arg0 == 'ž') {
			local30 = -98;
		} else if (arg0 == 'Ÿ') {
			local30 = -97;
		} else {
			local30 = 63;
		}
		return local30;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BLclient!bt;)V")
	public static void method2919(@OriginalArg(1) Class41 arg0) {
		Static575.aClass41_1 = arg0;
	}
}
