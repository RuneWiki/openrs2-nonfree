import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_91 = new Class205(4, 3);

	@OriginalMember(owner = "client!na", name = "i", descriptor = "I")
	public static int anInt3959 = 0;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Z")
	public static final boolean aBoolean300 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method3649(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(arg1, 2);
		local8.method864();
		local8.aString14 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBIIIFZII)[[I")
	public static int[][] method3651(@OriginalArg(5) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub4_Sub22 local13 = new Class2_Sub4_Sub22();
		local13.anInt4226 = 8;
		local13.anInt4216 = (int) (arg0 * 4096.0F);
		local13.anInt4221 = 4;
		local13.anInt4220 = 3;
		local13.aBoolean327 = false;
		local13.method5596();
		Static176.method3101(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method3836(local9[local40], local40);
		}
		return local9;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BC)B")
	public static byte method3652(@OriginalArg(1) char arg0) {
		@Pc(41) byte local41;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local41 = (byte) arg0;
		} else if (arg0 == '€') {
			local41 = -128;
		} else if (arg0 == '‚') {
			local41 = -126;
		} else if (arg0 == 'ƒ') {
			local41 = -125;
		} else if (arg0 == '„') {
			local41 = -124;
		} else if (arg0 == '…') {
			local41 = -123;
		} else if (arg0 == '†') {
			local41 = -122;
		} else if (arg0 == '‡') {
			local41 = -121;
		} else if (arg0 == 'ˆ') {
			local41 = -120;
		} else if (arg0 == '‰') {
			local41 = -119;
		} else if (arg0 == 'Š') {
			local41 = -118;
		} else if (arg0 == '‹') {
			local41 = -117;
		} else if (arg0 == 'Œ') {
			local41 = -116;
		} else if (arg0 == 'Ž') {
			local41 = -114;
		} else if (arg0 == '‘') {
			local41 = -111;
		} else if (arg0 == '’') {
			local41 = -110;
		} else if (arg0 == '“') {
			local41 = -109;
		} else if (arg0 == '”') {
			local41 = -108;
		} else if (arg0 == '•') {
			local41 = -107;
		} else if (arg0 == '–') {
			local41 = -106;
		} else if (arg0 == '—') {
			local41 = -105;
		} else if (arg0 == '˜') {
			local41 = -104;
		} else if (arg0 == '™') {
			local41 = -103;
		} else if (arg0 == 'š') {
			local41 = -102;
		} else if (arg0 == '›') {
			local41 = -101;
		} else if (arg0 == 'œ') {
			local41 = -100;
		} else if (arg0 == 'ž') {
			local41 = -98;
		} else if (arg0 == 'Ÿ') {
			local41 = -97;
		} else {
			local41 = 63;
		}
		return local41;
	}
}
