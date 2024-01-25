import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static501 {

	@OriginalMember(owner = "client!sb", name = "U", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_94 = new Class46(19, -1);

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_143 = new Class337(46, 1);

	@OriginalMember(owner = "client!sb", name = "W", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)V")
	public static void method7528(@OriginalArg(1) int arg0) {
		Static201.anInt3945 = arg0;
		Static315.aClass87_172.method1801();
	}
}
