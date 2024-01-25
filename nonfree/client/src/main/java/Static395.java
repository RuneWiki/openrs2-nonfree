import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!qca", name = "l", descriptor = "[I")
	public static int[] anIntArray554;

	@OriginalMember(owner = "client!qca", name = "m", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_62 = new Class236(20, 12);

	@OriginalMember(owner = "client!qca", name = "n", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_110 = new Class40("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!qca", name = "o", descriptor = "Z")
	public static boolean aBoolean499 = false;

	@OriginalMember(owner = "client!qca", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[5];

	@OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
	public static int anInt7085 = -1;

	@OriginalMember(owner = "client!qca", name = "t", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!qca", name = "v", descriptor = "Lclient!io;")
	public static final Class148 aClass148_12 = new Class148(9, 0, 4, 1);

	@OriginalMember(owner = "client!qca", name = "w", descriptor = "Lclient!fd;")
	public static final Class98 aClass98_5 = new Class98();

	@OriginalMember(owner = "client!qca", name = "x", descriptor = "Lclient!d;")
	public static final Class59 aClass59_1 = new Class59();

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIB)I")
	public static int method5751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static429.aByteArrayArrayArray17[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static429.aByteArrayArrayArray17[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(Z)V")
	public static void method5753() {
		try {
			if (Static332.anInt6296 == 1) {
				@Pc(16) int local16 = Static290.aClass5_Sub15_Sub4_1.method6525();
				if (local16 > 0 && Static290.aClass5_Sub15_Sub4_1.method6527()) {
					local16 -= Static456.anInt7875;
					if (local16 < 0) {
						local16 = 0;
					}
					Static290.aClass5_Sub15_Sub4_1.method6528(local16);
				} else {
					Static290.aClass5_Sub15_Sub4_1.method6526();
					Static290.aClass5_Sub15_Sub4_1.method6516();
					Static360.aClass5_Sub46_1 = null;
					Static126.aClass165_3 = null;
					if (Static409.aClass117_173 == null) {
						Static332.anInt6296 = 0;
					} else {
						Static332.anInt6296 = 2;
					}
				}
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			Static290.aClass5_Sub15_Sub4_1.method6526();
			Static126.aClass165_3 = null;
			Static332.anInt6296 = 0;
			Static360.aClass5_Sub46_1 = null;
			Static409.aClass117_173 = null;
		}
	}
}
