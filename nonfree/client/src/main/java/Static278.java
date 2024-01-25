import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!o", name = "I", descriptor = "I")
	public static int anInt4895;

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
	public static int anInt4902;

	@OriginalMember(owner = "client!o", name = "V", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "Z")
	public static boolean aBoolean321 = false;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "Z")
	public static volatile boolean aBoolean322 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ul;II)Lclient!db;")
	public static Class1_Sub10 method4056(@OriginalArg(0) Class246 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method5499(arg1);
		return local13 == null ? null : new Class1_Sub10(local13);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)V")
	public static void method4057(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static68.anInt1555 = arg0;
	}
}
