import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "F")
	public static float aFloat87;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_145 = new Class209("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!c", name = "e", descriptor = "[I")
	public static final int[] anIntArray541 = new int[2];

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_144 = new Class265(45, 8);

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!si;")
	public static final Class2_Sub23 aClass2_Sub23_9 = new Class2_Sub23(new byte[5000]);

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	public static int anInt6363 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZIZLclient!em;)V")
	public static void method5044(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class68 arg3) {
		@Pc(8) int local8 = arg3.anInt2188;
		@Pc(11) int local11 = arg3.anInt2252;
		if (arg3.aByte35 == 0) {
			arg3.anInt2188 = arg3.anInt2171;
		} else if (arg3.aByte35 == 1) {
			arg3.anInt2188 = arg2 - arg3.anInt2171;
		} else if (arg3.aByte35 == 2) {
			arg3.anInt2188 = arg3.anInt2171 * arg2 >> 14;
		}
		if (arg3.aByte32 == 0) {
			arg3.anInt2252 = arg3.anInt2173;
		} else if (arg3.aByte32 == 1) {
			arg3.anInt2252 = arg0 - arg3.anInt2173;
		} else if (arg3.aByte32 == 2) {
			arg3.anInt2252 = arg0 * arg3.anInt2173 >> 14;
		}
		if (arg3.aByte35 == 4) {
			arg3.anInt2188 = arg3.anInt2217 * arg3.anInt2252 / arg3.anInt2195;
		}
		if (arg3.aByte32 == 4) {
			arg3.anInt2252 = arg3.anInt2188 * arg3.anInt2195 / arg3.anInt2217;
		}
		if (Static154.aBoolean245 && (Static47.method787(arg3).anInt6837 != 0 || arg3.anInt2249 == 0)) {
			if (arg3.anInt2252 < 5 && arg3.anInt2188 < 5) {
				arg3.anInt2188 = 5;
				arg3.anInt2252 = 5;
			} else {
				if (arg3.anInt2252 <= 0) {
					arg3.anInt2252 = 5;
				}
				if (arg3.anInt2188 <= 0) {
					arg3.anInt2188 = 5;
				}
			}
		}
		if (Static363.anInt6252 == arg3.anInt2236) {
			Static48.aClass68_1 = arg3;
		}
		if (arg1 && arg3.anObjectArray16 != null && (local8 != arg3.anInt2188 || local11 != arg3.anInt2252)) {
			@Pc(188) Class2_Sub30 local188 = new Class2_Sub30();
			local188.aClass68_12 = arg3;
			local188.anObjectArray35 = arg3.anObjectArray16;
			Static293.aClass14_39.method300(local188);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)I")
	public static int method5045() {
		return Static157.anInt3179;
	}
}
