import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static163 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
	public static int anInt3252;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Lclient!nk;")
	public static Class121 aClass121_78;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
	public static int anInt3253 = 0;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Z")
	public static boolean aBoolean222 = true;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)I")
	public static int method2813(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
