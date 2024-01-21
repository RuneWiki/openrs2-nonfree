import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
	public static int anInt3227;

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "Lclient!db;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!ob", name = "ib", descriptor = "I")
	public static int anInt3236;

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!ob", name = "W", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ob", name = "mb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_816 = Static8.method128("rect_debug=");

	@OriginalMember(owner = "client!ob", name = "rb", descriptor = "I")
	public static final int anInt3243 = 0;

	@OriginalMember(owner = "client!ob", name = "sb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_817 = Static8.method128("Clientscript error in: ");

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public static void method2261() {
		aClass18_816 = null;
		aClass18_817 = null;
		aCRC32_2 = null;
		aClass15_1 = null;
		aBooleanArray11 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIBLclient!dd;)[Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1[] method2263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class16 arg2) {
		return Static65.method1300(arg1, arg2, arg0) ? Static122.method2403() : null;
	}
}
