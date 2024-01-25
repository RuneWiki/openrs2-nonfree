import java.awt.Color;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
	public static int anInt5504;

	@OriginalMember(owner = "client!qe", name = "W", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_182 = new Class221(81, 6);

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "Lclient!oa;")
	public static final Class144 aClass144_8 = new Class144(128);

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "[I")
	public static final int[] anIntArray430 = new int[13];

	@OriginalMember(owner = "client!qe", name = "V", descriptor = "Lclient!jg;")
	public static Class107 aClass107_39 = new Class107(64);

	@OriginalMember(owner = "client!qe", name = "X", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_130 = new Class140(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!qe", name = "Y", descriptor = "Z")
	public static boolean aBoolean483 = false;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(CB)B")
	public static byte method4649(@OriginalArg(0) char arg0) {
		@Pc(32) byte local32;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local32 = (byte) arg0;
		} else if (arg0 == '€') {
			local32 = -128;
		} else if (arg0 == '‚') {
			local32 = -126;
		} else if (arg0 == 'ƒ') {
			local32 = -125;
		} else if (arg0 == '„') {
			local32 = -124;
		} else if (arg0 == '…') {
			local32 = -123;
		} else if (arg0 == '†') {
			local32 = -122;
		} else if (arg0 == '‡') {
			local32 = -121;
		} else if (arg0 == 'ˆ') {
			local32 = -120;
		} else if (arg0 == '‰') {
			local32 = -119;
		} else if (arg0 == 'Š') {
			local32 = -118;
		} else if (arg0 == '‹') {
			local32 = -117;
		} else if (arg0 == 'Œ') {
			local32 = -116;
		} else if (arg0 == 'Ž') {
			local32 = -114;
		} else if (arg0 == '‘') {
			local32 = -111;
		} else if (arg0 == '’') {
			local32 = -110;
		} else if (arg0 == '“') {
			local32 = -109;
		} else if (arg0 == '”') {
			local32 = -108;
		} else if (arg0 == '•') {
			local32 = -107;
		} else if (arg0 == '–') {
			local32 = -106;
		} else if (arg0 == '—') {
			local32 = -105;
		} else if (arg0 == '˜') {
			local32 = -104;
		} else if (arg0 == '™') {
			local32 = -103;
		} else if (arg0 == 'š') {
			local32 = -102;
		} else if (arg0 == '›') {
			local32 = -101;
		} else if (arg0 == 'œ') {
			local32 = -100;
		} else if (arg0 == 'ž') {
			local32 = -98;
		} else if (arg0 == 'Ÿ') {
			local32 = -97;
		} else {
			local32 = 63;
		}
		return local32;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
	public static void method4650() {
		Static166.aClass25_1.method399();
		Class1_Sub2_Sub5.lb.method2475();
		if (Static147.aClass22_1 != null) {
			Static147.aClass22_1.method3362(Static95.aCanvas3);
		}
		Static2.aClient1.method864();
		Static95.aCanvas3.setBackground(Color.black);
		Static197.anInt4303 = -1;
		Static166.aClass25_1 = Static362.method5792(Static95.aCanvas3);
		Class1_Sub2_Sub5.lb = Static216.method4117(Static95.aCanvas3);
		if (Static147.aClass22_1 != null) {
			Static147.aClass22_1.method3360(Static95.aCanvas3);
		}
	}
}
