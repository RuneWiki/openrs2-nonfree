import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!gh", name = "M", descriptor = "Lclient!dj;")
	public static Class66 aClass66_4;

	@OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
	public static final int anInt3070 = 1338;

	@OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
	public static int anInt3072 = 1;

	@OriginalMember(owner = "client!gh", name = "P", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_53 = new Class45("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V")
	public static void method2852() {
		Static314.aClass182Array1 = new Class182[50];
		Static482.anInt8558 = 0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)I")
	public static int method2854(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0xB3333333) + (local13 & 0x33333333);
		@Pc(37) int local37 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
