import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static405 {

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "Lclient!f;")
	public static Class8 aClass8_26;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "Lclient!bu;")
	public static Class32 aClass32_82;

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
	public static int anInt6684;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_141 = new Class119(78, 10);

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
	public static int anInt6683 = -1;

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_102 = new Class217(48, 15);

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "Z")
	public static boolean aBoolean580 = false;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!hi;")
	public static Class100 method5231(@OriginalArg(0) Component arg0) {
		return new Class100_Sub1(arg0, true);
	}
}
