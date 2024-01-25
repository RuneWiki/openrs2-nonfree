import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static73 {

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
	public static int anInt1422;

	@OriginalMember(owner = "client!ct", name = "q", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "J")
	public static long aLong42 = 0L;

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
	public static int anInt1421 = 0;

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "Lclient!em;")
	public static final Class83 aClass83_40 = new Class83(50, 6);

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "[Lclient!nm;")
	public static Class239[] aClass239Array1 = new Class239[50];

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)I")
	public static int method1224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static411.aByteArrayArray22 == null ? 0 : Static411.aByteArrayArray22[arg0][arg1] & 0xFF;
	}
}
