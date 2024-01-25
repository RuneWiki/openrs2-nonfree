import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static415 {

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "Lclient!cu;")
	public static Class1_Sub1_Sub6 aClass1_Sub1_Sub6_3;

	@OriginalMember(owner = "client!ut", name = "H", descriptor = "Lclient!bf;")
	public static Class23 aClass23_1 = new Class23(8);

	@OriginalMember(owner = "client!ut", name = "M", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ut", name = "N", descriptor = "I")
	public static final int anInt7293 = 12;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)I")
	public static int method5634(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
