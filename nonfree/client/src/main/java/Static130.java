import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
	public static int anInt2613;

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "[B")
	public static final byte[] aByteArray48 = new byte[2048];

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_85 = new Class107(16, 8);

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[100];

	@OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
	public static int anInt2614 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I")
	public static int method2270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static192.anIntArray303[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IC)Z")
	public static boolean method2273(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
