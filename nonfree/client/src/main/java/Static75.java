import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static75 {

	@OriginalMember(owner = "client!dm", name = "bb", descriptor = "I")
	public static int anInt1424;

	@OriginalMember(owner = "client!dm", name = "Y", descriptor = "Lclient!ko;")
	public static final Class142 aClass142_11 = new Class142();

	@OriginalMember(owner = "client!dm", name = "Z", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_88 = new Class12(9, -2);

	@OriginalMember(owner = "client!dm", name = "ab", descriptor = "[B")
	public static final byte[] aByteArray9 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!dm", name = "cb", descriptor = "I")
	public static int anInt1425 = 10;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)I")
	public static int method1127(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
