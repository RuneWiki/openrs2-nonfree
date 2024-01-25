import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static102 {

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_25 = new Class98(86, 6);

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "Lclient!kf;")
	public static final Class171 aClass171_6 = new Class171(2);

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	public static int anInt1603 = 0;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)I")
	public static int method1459(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
