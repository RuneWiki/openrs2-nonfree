import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "Lclient!ui;")
	public static Class230 aClass230_48;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "Lclient!o;")
	public static final Class169 aClass169_168 = new Class169("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
	public static int anInt3200 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!h;I)I")
	public static int method2590(@OriginalArg(0) Class25_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class59 local8 = arg0.aClass59_1;
		if (local8.anIntArray186 != null) {
			local8 = local8.method1150(Static230.aClass72_3);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt1401;
		@Pc(32) Class8 local32 = arg0.method1880();
		if (arg0.aBoolean191) {
			local28 = local8.anInt1396;
		} else if (local32.anInt128 == arg0.anInt2340 || local32.anInt138 == arg0.anInt2340 || arg0.anInt2340 == local32.anInt150 || local32.anInt133 == arg0.anInt2340) {
			local28 = local8.anInt1400;
		} else if (local32.anInt151 == arg0.anInt2340 || local32.anInt137 == arg0.anInt2340 || arg0.anInt2340 == local32.anInt122 || local32.anInt145 == arg0.anInt2340) {
			local28 = local8.anInt1394;
		}
		return local28;
	}
}
