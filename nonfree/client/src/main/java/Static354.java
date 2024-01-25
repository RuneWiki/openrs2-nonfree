import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "[I")
	public static final int[] anIntArray416 = new int[8];

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_149 = new Class119(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "[S")
	public static final short[] aShortArray99 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	public static void method4773() {
		@Pc(5) int local5 = 0;
		if (Static453.aClass136_Sub1_1.method3519(Static14.anInt293)) {
			local5 = 55;
		}
		if (!Static453.aClass136_Sub1_1.aBoolean505) {
			local5 |= 0x40;
		}
		Static368.method4889(local5);
		Static341.aClass75_4.method1615(local5);
		Static342.aClass155_2.method3543(local5);
		Static161.aClass231_2.method5024(local5);
		Static88.aClass69_1.method1556(local5);
		Static401.method5217(local5);
		Static7.method90(local5);
		Static431.method5700(local5);
		Static4.method54(local5);
		Static353.method4772();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method4774() {
		@Pc(7) String local7 = "www";
		if (Static328.aClass30_10 == Static259.aClass30_8) {
			local7 = "www-wtrc";
		} else if (Static207.aClass30_11 == Static328.aClass30_10) {
			local7 = "www-wtqa";
		} else if (Static328.aClass30_10 == Static43.aClass30_2) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static87.aString74 != null) {
			local28 = "/p=" + Static87.aString74;
		}
		return "http://" + local7 + "." + Static183.aClass48_3.aString9 + ".com/l=" + Static394.anInt6582 + "/a=" + Static83.anInt1575 + local28 + "/";
	}
}
