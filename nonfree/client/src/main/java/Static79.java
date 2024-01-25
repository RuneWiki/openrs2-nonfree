import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static79 {

	@OriginalMember(owner = "client!dba", name = "O", descriptor = "Lclient!pq;")
	public static Class251 aClass251_26;

	@OriginalMember(owner = "client!dba", name = "E", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_27 = new Class160(36, 3);

	@OriginalMember(owner = "client!dba", name = "I", descriptor = "I")
	public static int anInt1330 = 1;

	@OriginalMember(owner = "client!dba", name = "K", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_39 = new Class332(64);

	@OriginalMember(owner = "client!dba", name = "L", descriptor = "I")
	public static int anInt1332 = 0;

	@OriginalMember(owner = "client!dba", name = "N", descriptor = "[I")
	public static final int[] anIntArray96 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "(I)Z")
	public static boolean method1195() {
		if (Static146.anInt2581 < 1) {
			return false;
		} else {
			return Static376.aClass287_6 != Static192.aClass287_3 || Static231.anInt3930 >= 2;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIB)Z")
	public static boolean method1196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
