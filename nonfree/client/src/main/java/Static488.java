import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!uf", name = "Fc", descriptor = "[I")
	public static int[] anIntArray759;

	@OriginalMember(owner = "client!uf", name = "Gc", descriptor = "I")
	public static int anInt8138;

	@OriginalMember(owner = "client!uf", name = "Zb", descriptor = "Lclient!im;")
	public static final Class140 aClass140_135 = new Class140(91, 11);

	@OriginalMember(owner = "client!uf", name = "wc", descriptor = "Lclient!dm;")
	public static final Class68 aClass68_6 = new Class68();

	@OriginalMember(owner = "client!uf", name = "Bc", descriptor = "Z")
	public static boolean aBoolean570 = false;

	@OriginalMember(owner = "client!uf", name = "Ec", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_124 = new Class306("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!dc;I)V")
	public static void method6691(@OriginalArg(0) Class49_Sub2_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt4278 == Static436.anInt6850 || arg0.anInt4297 == -1 || arg0.anInt4316 != 0) {
			local5 = true;
		} else {
			@Pc(27) Class199 local27 = Static182.aClass218_1.method5221(arg0.anInt4297);
			if (local27.aBoolean417 || local27.anIntArray575[arg0.anInt4303] < arg0.anInt4265 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(51) int local51 = arg0.anInt4278 - arg0.anInt4322;
			@Pc(56) int local56 = Static436.anInt6850 - arg0.anInt4322;
			@Pc(68) int local68 = arg0.anInt4267 * 512 + arg0.method3788() * 256;
			@Pc(79) int local79 = arg0.anInt4285 * 512 + arg0.method3788() * 256;
			@Pc(91) int local91 = arg0.anInt4309 * 512 + arg0.method3788() * 256;
			@Pc(103) int local103 = arg0.anInt4320 * 512 + arg0.method3788() * 256;
			arg0.anInt7137 = (local56 * local91 + (local51 - local56) * local68) / local51;
			arg0.anInt7141 = (local79 * (local51 - local56) + local103 * local56) / local51;
		}
		arg0.anInt4337 = 0;
		if (arg0.anInt4271 == 0) {
			arg0.method3784(8192, false);
		}
		if (arg0.anInt4271 == 1) {
			arg0.method3784(12288, false);
		}
		if (arg0.anInt4271 == 2) {
			arg0.method3784(0, false);
		}
		if (arg0.anInt4271 == 3) {
			arg0.method3784(4096, false);
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
	public static void method6696() {
		if (Static268.anInt5100 == 8) {
			Static85.method1463(4);
		} else if (Static268.anInt5100 == 4 || Static268.anInt5100 == 5) {
			Static85.method1463(2);
		} else if (Static268.anInt5100 == 11) {
			Static85.method1463(2);
		}
	}
}
