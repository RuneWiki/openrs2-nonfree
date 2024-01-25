import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
	public static int anInt1432;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!eha;")
	public static final Class97 aClass97_1 = new Class97();

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	public static int anInt1427 = -1;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
	public static int anInt1428 = 0;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
	public static int anInt1431 = -1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Z")
	public static boolean method1303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lclient!pc;")
	public static Class2_Sub7_Sub13 method1304(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub7_Sub13 local12 = (Class2_Sub7_Sub13) Static146.aClass280_2.method6424((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static222.aClass238_106.method5567(0, arg0);
		if (local22 == null || local22.length <= 1) {
			return null;
		}
		try {
			local12 = Static621.method8624(local22);
		} catch (@Pc(43) Exception local43) {
			throw new RuntimeException(local43.getMessage() + " S: " + arg0);
		}
		Static146.aClass280_2.method6428((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)Z")
	public static boolean method1305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
