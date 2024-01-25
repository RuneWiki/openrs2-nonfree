import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "[Lclient!hh;")
	public static Class6[] aClass6Array5;

	@OriginalMember(owner = "client!hha", name = "d", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_44 = new Class171(6, -2);

	@OriginalMember(owner = "client!hha", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString51 = null;

	@OriginalMember(owner = "client!hha", name = "j", descriptor = "Lclient!aka;")
	public static final Class16 aClass16_1 = new Class16("RC", 1);

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IC)B")
	public static byte method3318(@OriginalArg(1) char arg0) {
		@Pc(45) byte local45;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local45 = (byte) arg0;
		} else if (arg0 == '€') {
			local45 = -128;
		} else if (arg0 == '‚') {
			local45 = -126;
		} else if (arg0 == 'ƒ') {
			local45 = -125;
		} else if (arg0 == '„') {
			local45 = -124;
		} else if (arg0 == '…') {
			local45 = -123;
		} else if (arg0 == '†') {
			local45 = -122;
		} else if (arg0 == '‡') {
			local45 = -121;
		} else if (arg0 == 'ˆ') {
			local45 = -120;
		} else if (arg0 == '‰') {
			local45 = -119;
		} else if (arg0 == 'Š') {
			local45 = -118;
		} else if (arg0 == '‹') {
			local45 = -117;
		} else if (arg0 == 'Œ') {
			local45 = -116;
		} else if (arg0 == 'Ž') {
			local45 = -114;
		} else if (arg0 == '‘') {
			local45 = -111;
		} else if (arg0 == '’') {
			local45 = -110;
		} else if (arg0 == '“') {
			local45 = -109;
		} else if (arg0 == '”') {
			local45 = -108;
		} else if (arg0 == '•') {
			local45 = -107;
		} else if (arg0 == '–') {
			local45 = -106;
		} else if (arg0 == '—') {
			local45 = -105;
		} else if (arg0 == '˜') {
			local45 = -104;
		} else if (arg0 == '™') {
			local45 = -103;
		} else if (arg0 == 'š') {
			local45 = -102;
		} else if (arg0 == '›') {
			local45 = -101;
		} else if (arg0 == 'œ') {
			local45 = -100;
		} else if (arg0 == 'ž') {
			local45 = -98;
		} else if (arg0 == 'Ÿ') {
			local45 = -97;
		} else {
			local45 = 63;
		}
		return local45;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIIZIIB)V")
	public static void method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static178.anInt3269 = arg2;
		Static34.anInt818 = arg1;
		Static333.anInt5530 = arg0;
		Static217.anInt10310 = arg5;
		Static362.anInt6197 = arg4;
		if (arg3 && Static333.anInt5530 >= 100) {
			Static564.anInt9117 = Static362.anInt6197 * 512 + 256;
			Static370.anInt6266 = Static178.anInt3269 * 512 + 256;
			Static166.anInt3034 = Static662.method8831(Static564.anInt9117, Static370.anInt6266, Static570.anInt9192) - Static34.anInt818;
		}
		Static468.anInt7425 = -1;
		Static351.anInt6038 = -1;
		Static451.anInt7263 = 2;
	}
}
