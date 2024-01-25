import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_175 = new Class151("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_40 = new Class254();

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "Lclient!ef;")
	public static final Class62 aClass62_1 = new Class62(14, 1);

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "Lclient!ef;")
	public static final Class62 aClass62_2 = new Class62(15, 4);

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "Lclient!ef;")
	public static final Class62 aClass62_3 = new Class62(16, -2);

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "Lclient!ef;")
	public static final Class62 aClass62_4 = new Class62(17, 0);

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "Lclient!ef;")
	public static final Class62 aClass62_5 = new Class62(18, -2);

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "Lclient!ef;")
	public static final Class62 aClass62_6 = new Class62(20, 6);

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "Lclient!ef;")
	public static final Class62 aClass62_7 = new Class62(21, 8);

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "Lclient!ef;")
	public static final Class62 aClass62_8 = new Class62(22, -2);

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "Lclient!ef;")
	public static final Class62 aClass62_9 = new Class62(23, 4);

	@OriginalMember(owner = "client!qr", name = "v", descriptor = "Lclient!ef;")
	public static final Class62 aClass62_10 = new Class62(24, -1);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)I")
	public static int method4285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static132.aByteArrayArray16 == null ? 0 : Static132.aByteArrayArray16[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)V")
	public static void method4287(@OriginalArg(1) int arg0) {
		if (Static28.anIntArray32 == null || Static28.anIntArray32.length < arg0) {
			Static28.anIntArray32 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)V")
	public static void method4288(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub13 local10 = Static397.method4998(16, arg0);
		local10.method3458();
	}
}
