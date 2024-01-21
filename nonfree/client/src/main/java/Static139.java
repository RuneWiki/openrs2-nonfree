import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static139 {

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ob", name = "kb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ob", name = "W", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_16 = new Class53(64);

	@OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
	public static int anInt2935 = 0;

	@OriginalMember(owner = "client!ob", name = "mb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1044 = Static151.method2243("Prepared sound engine");

	@OriginalMember(owner = "client!ob", name = "lb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1043 = aClass62_1044;

	@OriginalMember(owner = "client!ob", name = "nb", descriptor = "I")
	public static int anInt2941 = 0;

	@OriginalMember(owner = "client!ob", name = "ob", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!pb;ZI)[Lclient!rd;")
	public static Class42_Sub1[] method2077(@OriginalArg(0) Class71 arg0, @OriginalArg(2) int arg1) {
		return Static39.method3119(arg1, arg0) ? Static93.method1397() : null;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)I")
	public static int method2078(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
